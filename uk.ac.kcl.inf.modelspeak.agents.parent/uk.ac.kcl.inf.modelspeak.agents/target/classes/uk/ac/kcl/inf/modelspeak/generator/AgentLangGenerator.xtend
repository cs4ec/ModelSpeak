/*
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.generator

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.SaveOptions
import uk.ac.kcl.inf.modelspeak.agentLang.AttackExperiment
import uk.ac.kcl.inf.modelspeak.agentLang.AttackModel
import uk.ac.kcl.inf.modelspeak.agentLang.AttackRequirement
import uk.ac.kcl.inf.modelspeak.agentLang.CounterModel
import uk.ac.kcl.inf.modelspeak.agentLang.Game
import uk.ac.kcl.inf.modelspeak.agentLang.Move
import uk.ac.kcl.inf.modelspeak.agentLang.NotConvinced
import uk.ac.kcl.inf.modelspeak.agentLang.ProposeExperiment
import uk.ac.kcl.inf.modelspeak.agentLang.ProposeModel
import uk.ac.kcl.inf.modelspeak.agentLang.ProposeRequirement
import uk.ac.kcl.inf.modelspeak.agentLang.RedefineRequirement
import uk.ac.kcl.inf.modelspeak.agentLang.ReplaceModel
import uk.ac.kcl.inf.modelspeak.agentLang.RetractExperiment
import uk.ac.kcl.inf.modelspeak.agentLang.RetractRequirement
import uk.ac.kcl.inf.modelspeak.agentLang.SupportExperiment
import uk.ac.kcl.inf.modelspeak.agentLang.SupportModel
import uk.ac.kcl.inf.modelspeak.agentLang.SupportRequirement
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Experiment
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Model
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Requirement
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Theory
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStore
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStoreLangFactory

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AgentLangGenerator extends AbstractGenerator {
	val extension TheoryStoreLangFactory factory = TheoryStoreLangFactory.eINSTANCE

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resource.contents.filter(Game).forEach [generateTheoryStore(resource, fsa)]
	}

	def generateTheoryStore(Game game, Resource resource, IFileSystemAccess2 fsa) {
		val theoryStore = createTheoryStore

		val requirementMap = new HashMap<String, Requirement>()
		val modelMap = new HashMap<String, Model>()
		val experimentMap = new HashMap<String, Experiment>()
		val theoryMap = new HashMap<String, Theory>()

		game.moves.forEach[updateTheoryStore(theoryStore, requirementMap, modelMap, experimentMap, theoryMap)]

		val outputUri = fsa.getURI("theoryStoreOutput.theoryStore")
		val resourceSet = resource.resourceSet
		val newResource = resourceSet.createResource(outputUri)
		newResource.contents += theoryStore
		newResource.save(SaveOptions.newBuilder().format().getOptions().toOptionsMap())
	}

	/**
	 * Update the theory store with the consequences of the given move, using the various maps to track referenced 
	 * elements and their representation in the theory store.
	 */
	private dispatch def updateTheoryStore(Move move, TheoryStore theoryStore, Map<String, Requirement> requirementMap,
		Map<String, Model> modelMap, Map<String, Experiment> experimentMap, Map<String, Theory> theoryMap) {}

	// --------------- Requirements -----------------
	private dispatch def updateTheoryStore(ProposeRequirement move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		val req = createRequirement
		req.name = move.requirement.name
		req.content = move.requirement.content
		requirementMap.put(req.name, req)
		theoryStore.elements += req
	}

	private dispatch def updateTheoryStore(AttackRequirement move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		val theory = createTheory
		theory.name = move.theory.name
		theory.content = move.theory.content
		if (move.requirement.name !== null) { // TODO: This seems wrong, should this refer to something other than a requirement?
			theory.elements += experimentMap.get(move.requirement.name)
		}
		theoryMap.put(theory.name, theory)
		theoryStore.elements += theory
	}

	private dispatch def updateTheoryStore(RedefineRequirement move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		val newReq = createRequirement
		newReq.name = move.newRequirement.name
		newReq.content = move.newRequirement.content
		if (move.requirement.name !== null) {
			val oldReq = requirementMap.remove(move.requirement.name)

			// Traverse all models that reference the old requirement, and update them to reference the new requirement
			modelMap.values.forEach [ model |
				if (model.requirements.contains(oldReq)) {
					model.requirements.remove(oldReq)
					model.requirements.add(newReq)
				}
			]

			// Remove all Theory that referenced the deleted Requirement
			val theoriesToRemove = theoryStore.elements.filter(Theory).filter [ theory |
				theory.elements.contains(oldReq)
			]
			theoriesToRemove.forEach [ theory |
				theoryStore.elements.remove(theory)
			]

			theoryStore.elements.remove(move.requirement.name)
		}

		requirementMap.put(newReq.name, newReq)
		theoryStore.elements += newReq
	}

	private dispatch def updateTheoryStore(RetractRequirement move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		if (move.requirement.name !== null) {
			requirementMap.remove(move.requirement.name)

			// Remove all Theory that referenced the deleted Requirement
			val theoriesToRemove = theoryStore.elements.filter(Theory).filter [ theory |
				theory.elements.contains(move.requirement)
			]
			theoriesToRemove.forEach [ theory |
				theoryStore.elements.remove(theory)
			]

			theoryStore.elements.remove(move.requirement.name)
		}

	}

	private dispatch def updateTheoryStore(SupportRequirement move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		val theory = createTheory
		theory.name = move.theory.name
		theory.content = move.theory.content
		if (move.requirement.name !== null) {
			theory.elements += requirementMap.get(move.requirement.name)
		}
		theoryMap.put(theory.name, theory)
		theoryStore.elements += theory
	}

	// --------------- Model -----------------
	private dispatch def updateTheoryStore(ProposeModel move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		val mdl = createModel
		mdl.name = move.model.name
		mdl.content = move.model.content
		if (move.requirement.name !== null) {
			mdl.requirements += requirementMap.get(move.requirement.name)
		}
		modelMap.put(mdl.name, mdl)
		theoryStore.elements += mdl

	}

	private dispatch def updateTheoryStore(SupportModel move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		val theory = createTheory
		theory.name = move.theory.name
		theory.content = move.theory.content
		if (move.model.name !== null) {
			theory.elements += modelMap.get(move.model.name)
		}
		theoryMap.put(theory.name, theory)
		theoryStore.elements += theory
	}

	private dispatch def updateTheoryStore(ReplaceModel move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		val newModel = createModel
		newModel.name = move.newModel.name
		newModel.content = move.newModel.content

		if (move.model.name !== null) {
			val oldModel = modelMap.get(move.model.name)
			if (oldModel !== null) {
				// Transfer the requirements from the old model to the new model
				newModel.requirements.addAll(oldModel.requirements)

				// Collect theories to remove
				val theoriesToRemove = theoryStore.elements.filter(Theory).filter [ theory |
					theory.elements.contains(oldModel)
				].toList

				// Collect experiments to remove
				val experimentsToRemove = theoryStore.elements.filter(Experiment).filter [ experiment |
					experiment.model.contains(oldModel)
				].toList

				// Remove the collected theories and experiments
				theoriesToRemove.forEach [ theory |
					theoryStore.elements.remove(theory)
				]

				experimentsToRemove.forEach [ experiment |
					theoryStore.elements.remove(experiment)
				]

				// Remove the old model from the map and the theory store
				modelMap.remove(move.model.name)
				theoryStore.elements.remove(oldModel)
			} else {
				println("Old model not found for name: " + move.model.name)
			}
		} else {
			println("Move model name is null")
		}

		// Add the new model to the map and the theory store
		modelMap.put(newModel.name, newModel)
		theoryStore.elements += newModel
	}

	private dispatch def updateTheoryStore(CounterModel move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		val experiment = createExperiment
		experiment.name = move.experiment.name
		experiment.content = move.experiment.content
		if (move.model.name !== null) {
			experiment.model += modelMap.get(move.model.name)
		}
		if (move.requirement.name !== null) {
			experiment.requirements += requirementMap.get(move.requirement.name)
		}
		experimentMap.put(experiment.name, experiment)
		theoryStore.elements += experiment

	}

	private dispatch def updateTheoryStore(AttackModel move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		val theory = createTheory
		theory.name = move.theory.name
		theory.content = move.theory.content
		if (move.model.name !== null) {
			theory.elements += modelMap.get(move.model.name)
		}
		theoryMap.put(theory.name, theory)
		theoryStore.elements += theory
	}

	// --------------- Experiment -----------------
	private dispatch def updateTheoryStore(ProposeExperiment move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		val exp = createExperiment
		exp.name = move.experiment.name
		exp.content = move.experiment.content
		if (move.model.name !== null) {
			exp.model += modelMap.get(move.model.name)
		}
		if (move.requirement.name !== null) {
			exp.requirements += requirementMap.get(move.requirement.name)
		}
		experimentMap.put(exp.name, exp)
		theoryStore.elements += exp
	}

	private dispatch def updateTheoryStore(SupportExperiment move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		val theory = createTheory
		theory.name = move.theory.name
		theory.content = move.theory.content
		if (move.experiment.name !== null) {
			theory.elements += experimentMap.get(move.experiment.name)
		}
		theoryMap.put(theory.name, theory)
		theoryStore.elements += theory
	}

	private dispatch def updateTheoryStore(AttackExperiment move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		val theory = createTheory
		theory.name = move.theory.name
		theory.content = move.theory.content
		if (move.experiment.name !== null) {
			theory.elements += experimentMap.get(move.experiment.name)
		}
		theoryMap.put(theory.name, theory)
		theoryStore.elements += theory
	}

	private dispatch def updateTheoryStore(RetractExperiment move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		if (move.experiment.name !== null) {
			experimentMap.remove(move.experiment.name)
			theoryStore.elements.remove(move.experiment.name)
		}
	}

	private dispatch def updateTheoryStore(NotConvinced move, TheoryStore theoryStore,
		Map<String, Requirement> requirementMap, Map<String, Model> modelMap, Map<String, Experiment> experimentMap,
		Map<String, Theory> theoryMap) {
		val theory = createTheory
		theory.name = "NoConfidence"
		theory.content = "No confidence in model " + move.model.name
		if (move.model.name !== null) {
			theory.elements += modelMap.get(move.model.name)
		}
		theoryStore.elements += theory
	}
}
