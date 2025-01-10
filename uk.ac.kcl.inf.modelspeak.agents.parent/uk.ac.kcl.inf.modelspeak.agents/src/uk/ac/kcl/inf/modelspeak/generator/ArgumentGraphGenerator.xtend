/*
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.generator

import java.util.List
import java.util.function.Consumer
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.henshin.interpreter.EGraph
import org.eclipse.emf.henshin.interpreter.Engine
import org.eclipse.emf.henshin.interpreter.InterpreterFactory
import org.eclipse.emf.henshin.interpreter.RuleApplication
import org.eclipse.emf.henshin.interpreter.UnitApplication
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl
import org.eclipse.emf.henshin.model.Module
import org.eclipse.emf.henshin.model.Rule
import org.eclipse.emf.henshin.model.Unit
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.SaveOptions
import uk.ac.kcl.inf.modelspeak.agentLang.CounterModel
import uk.ac.kcl.inf.modelspeak.agentLang.Game
import uk.ac.kcl.inf.modelspeak.agentLang.LiteratureReference
import uk.ac.kcl.inf.modelspeak.agentLang.LiteratureReferenceForData
import uk.ac.kcl.inf.modelspeak.agentLang.LiteratureReferenceTheory
import uk.ac.kcl.inf.modelspeak.agentLang.Model
import uk.ac.kcl.inf.modelspeak.agentLang.Move
import uk.ac.kcl.inf.modelspeak.agentLang.MultiTheory
import uk.ac.kcl.inf.modelspeak.agentLang.ProposeModel
import uk.ac.kcl.inf.modelspeak.agentLang.ProposeRQ
import uk.ac.kcl.inf.modelspeak.agentLang.ProposeRequirement
import uk.ac.kcl.inf.modelspeak.agentLang.ReplaceModel
import uk.ac.kcl.inf.modelspeak.agentLang.Requirement
import uk.ac.kcl.inf.modelspeak.agentLang.SupportModel
import uk.ac.kcl.inf.modelspeak.agentLang.SupportRequirement
import uk.ac.kcl.inf.modelspeak.agentLang.Theory
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsFactory

/**
 * Generate the argument graph corresponding to the current agent dialogue state.
 */
class ArgumentGraphGenerator {
	val Engine engine = InterpreterFactory.INSTANCE.createEngine
	val RuleApplication ruleRunner = InterpreterFactory.INSTANCE.createRuleApplication(engine)
	val UnitApplication unitRunner = InterpreterFactory.INSTANCE.createUnitApplication(engine)
	var EGraph modelGraph

	var List<Rule> rules
	var List<Unit> nonRules

	val extension ArgumentsFactory factory = ArgumentsFactory.eINSTANCE

	var ArgumentGraph argumentGraph
	var Resource argGraphResource

	val frameworkGenerator = new ArgumentFrameworkGenerator

	def void beforeGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		argumentGraph = createArgumentGraph
		val outputUri = fsa.getURI(resource.argumentGraphFileName)
		val resourceSet = resource.resourceSet
		argGraphResource = resourceSet.createResource(outputUri)
		argGraphResource.contents += argumentGraph

		frameworkGenerator.beforeGenerate(resource, fsa, context)
	}

	def void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val rulesResource = resource.resourceSet.getResource(
			URI.createPlatformPluginURI(
				'/uk.ac.kcl.inf.modelspeak.agents/uk/ac/kcl/inf/modelspeak/generator/argument_graph.henshin', false),
			true
		)
		rules = (rulesResource.contents.head as Module).allRules
		nonRules = (rulesResource.contents.head as Module).units.reject(Rule).toList

		resource.contents.filter(Game).forEach[generateArgumentGraph(resource, fsa, context)]
	}

	def generateArgumentGraph(Game game, Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		modelGraph = new EGraphImpl(argumentGraph)
		ruleRunner.EGraph = modelGraph
		unitRunner.EGraph = modelGraph

		game.moves.forEach[updateArgumentGraph]

		frameworkGenerator.doGenerate(argGraphResource, fsa, context)

		argGraphResource.save(SaveOptions.newBuilder().format().getOptions().toOptionsMap())
	}

	private def getArgumentGraphFileName(Resource resource) {
		val origName = resource.URI.lastSegment

		origName.substring(0, origName.lastIndexOf('.')) + '.arguments'
	}

	/**
	 * Update the argument graph with the consequences of the given move. The below is just plumbing. The real effects are implemented in the accompanying Henshin file.
	 */
	private dispatch def updateArgumentGraph(Move move) {
		throw new UnsupportedOperationException('''Moves of type «move.eClass.name» not yet supported in argument generation.''')
	}

	// --------------- Research Questions -----------------
	private dispatch def updateArgumentGraph(ProposeRQ move) {
		// Consciously doing nothing: a research question on its own doesn't yet add anything to the argument
		// TODO: We may wish to extend this at some point with bits of argument about the relevance of the RQ. For now, we consider this out of scope. 
	}

	// --------------- Requirements -----------------
	private dispatch def updateArgumentGraph(ProposeRequirement move) {
		'proposeRequirement'.execute(#[
			'reqName' -> move.requirement.name,
			'effect' -> move.rq.effect,
			'data' -> move.requirement.dataDescription
		])
	}

//	private dispatch def updateArgumentGraph(AttackRequirement move) {
//		'attackRequirement'.execute(#['attackedRequirement' -> move.requirement.name, 'theoryName' -> move.theory.name,
//			'theoryContents' -> move.theory.content])
//	}
//
//	private dispatch def updateArgumentGraph(RedefineRequirement move) {
//		'redefineRequirement'.execute(
//			#['requirementName' -> move.newRequirement.name, 'requirementContents' -> move.newRequirement.content,
//				'oldReqName' -> move.requirement.name])
//	}
//
//	private dispatch def updateArgumentGraph(RetractRequirement move) {
//		'retractRequirement'.execute(#['reqName' -> move.requirement.name])
//	}
	private dispatch def updateArgumentGraph(SupportRequirement move) {
		switch (move.theory) {
			LiteratureReference:
				supportRequirementWithLitRef(move.requirement.name, (move.theory as LiteratureReference).ref)
			MultiTheory:
				(move.theory as MultiTheory).theories.forEach [
					supportRequirementWithLitRef(move.requirement.name, (it as LiteratureReference).ref)
				]
			default:
				throw new IllegalArgumentException('''Cannot currently process support requirement moves with anything else than a literature reference.''')
		}
	}

	private def supportRequirementWithLitRef(String reqName, String ref) {
		// FIXME: Probably not actually correct. Should probably require that the data and effect are explicitly quoted again and then make the rule compare that these match the proposed warrant.
		'supportRequirement'.execute(#['reqName' -> reqName, 'litRef' -> ref])
	}

	// --------------- Model -----------------
	private dispatch def updateArgumentGraph(ProposeModel move) {
		'proposeModel'.execute(
			#['reqName' -> move.requirement.name, 'modelName' -> move.model.name, 'mechanism' -> move.model.mechanism])
	}

	private dispatch def updateArgumentGraph(SupportModel move) {
		move.theory.dispatchTheory([ t |
			if (t instanceof LiteratureReferenceTheory) {
				if (t instanceof LiteratureReferenceForData) {
					'supportModel'.execute(
						#['modelName' -> move.model.name, 'literatureRef' -> t.ref.ref, 'dataDescription' -> t.data])
				}
			// TODO: Other uses of literature references for supporting models...
			} else {
				throw new IllegalArgumentException('''Cannot currently process support model moves with anything else than a literature reference.''')
			}
		])
	}

	private dispatch def updateArgumentGraph(ReplaceModel move) {
		val req = move.model.findRequirement

		'replaceModel'.execute(
			#['reqName' -> req.name, 'oldModelName' -> move.model.name, 'mechanism' -> move.newModel.mechanism,
				'newModelName' -> move.newModel.name])
	}

	private dispatch def updateArgumentGraph(CounterModel move) {
		'counterModel'.execute(
			#['modelName' -> move.model.name, 'reqName' -> move.requirement.name,
				'experimentName' -> move.experiment.name, 'experimentData' -> move.experiment.content])
	}

//	private dispatch def updateArgumentGraph(AttackModel move) {
//		'attackModel'.execute(
//			#['modelName' -> move.model.name, 'theoryContents' -> move.theory.content,
//				'theoryName' -> move.theory.name])
//	}
//
//	// --------------- Experiment -----------------
//	private dispatch def updateArgumentGraph(ProposeExperiment move) {
//		'proposeExperiment'.execute(
//			#['modelName' -> move.model.name, 'requirementName' -> move.requirement.name,
//				'experimentName' -> move.experiment.name, 'experimentContents' -> move.experiment.content])
//	}
//
//	private dispatch def updateArgumentGraph(SupportExperiment move) {
//		'supportExperiment'.execute(
//			#['experimentName' -> move.experiment.name, 'theoryName' -> move.theory.name,
//				'theoryContents' -> move.theory.content])
//	}
//
//	private dispatch def updateArgumentGraph(AttackExperiment move) {
//		'attackExperiment'.execute(
//			#['experimentName' -> move.experiment.name, 'theoryName' -> move.theory.name,
//				'theoryContents' -> move.theory.content])
//	}
//
//	private dispatch def updateArgumentGraph(RetractExperiment move) {
//		'retractExperiment'.execute(#['experimentName' -> move.experiment.name])
//	}
//
//	private dispatch def updateArgumentGraph(NotConvinced move) {
//		'notConvinced'.execute(#['modelName' -> move.model.name])
//	}
	// -- rule execution --
	private def execute(String ruleName, List<Pair<String, String>> parameters) {
		ruleRunner.rule = rules.findFirst[name == ruleName]
		if (ruleRunner.rule !== null) {
			parameters.forEach [
				ruleRunner.setParameterValue(key, value)
			]

			ruleRunner.execute(null)
		} else {
			unitRunner.unit = nonRules.findFirst[name == ruleName]
			if (unitRunner.unit !== null) {
				parameters.forEach [
					unitRunner.setParameterValue(key, value)
				]

				unitRunner.execute(null)
			} else {
				throw new UnsupportedOperationException("Rule or unit " + ruleName + " not found.")
			}
		}
	}

	/**
	 * Find the requirement for the given model
	 */
	private def Requirement findRequirement(Model m) {
		val modelProposal = m.eResource.allContents.filter(ProposeModel).findFirst[model === m]

		if (modelProposal !== null) {
			modelProposal.requirement
		} else {
			val modelIntro = m.eResource.allContents.filter(ReplaceModel).findFirst[newModel === m]

			if (modelIntro !== null) {
				modelIntro.model.findRequirement
			} else {
				null
			}
		}
	}

	/**
	 * Dispatch function across all theories
	 */
	private dispatch def void dispatchTheory(Theory t, extension Consumer<Theory> tf) {
		accept(t)
	}

	private dispatch def void dispatchTheory(MultiTheory mt, Consumer<Theory> tf) {
		mt.theories.forEach [
			it.dispatchTheory(tf)
		]
	}
}
