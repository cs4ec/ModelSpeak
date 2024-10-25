/*
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.generator

import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.henshin.interpreter.EGraph
import org.eclipse.emf.henshin.interpreter.Engine
import org.eclipse.emf.henshin.interpreter.InterpreterFactory
import org.eclipse.emf.henshin.interpreter.RuleApplication
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl
import org.eclipse.emf.henshin.model.Module
import org.eclipse.emf.henshin.model.Rule
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.SaveOptions
import uk.ac.kcl.inf.modelspeak.agentLang.AttackExperiment
import uk.ac.kcl.inf.modelspeak.agentLang.AttackModel
import uk.ac.kcl.inf.modelspeak.agentLang.AttackRequirement
import uk.ac.kcl.inf.modelspeak.agentLang.CounterModel
import uk.ac.kcl.inf.modelspeak.agentLang.Game
import uk.ac.kcl.inf.modelspeak.agentLang.GeneralTheory
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
import uk.ac.kcl.inf.modelspeak.agentLang.Theory
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStoreLangFactory
import uk.ac.kcl.inf.modelspeak.agentLang.LiteratureReference
import uk.ac.kcl.inf.modelspeak.agentLang.MultiTheory
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidenceForDataAndEffect
import uk.ac.kcl.inf.modelspeak.agentLang.LiteratureReferenceForData

/**
 * Generate the theory store corresponding to the current agent dialogue state.
 * 
 * TODO: Need to update rules to be able to support the additional complexity of the agent dialogue language
 */
class TheoryStoreGenerator {
	val Engine engine = InterpreterFactory.INSTANCE.createEngine
	val RuleApplication ruleRunner = InterpreterFactory.INSTANCE.createRuleApplication(engine)
	var EGraph modelGraph

	var List<Rule> rules

	val extension TheoryStoreLangFactory factory = TheoryStoreLangFactory.eINSTANCE

	def void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val rulesResource = resource.resourceSet.getResource(
			URI.createPlatformPluginURI(
				'/uk.ac.kcl.inf.modelspeak.agents/uk/ac/kcl/inf/modelspeak/generator/theory_store.henshin', false),
			true
		)		
		rules = (rulesResource.contents.head as Module).allRules

		resource.contents.filter(Game).forEach[generateTheoryStore(resource, fsa)]
	}

	def generateTheoryStore(Game game, Resource resource, IFileSystemAccess2 fsa) {
		val theoryStore = createTheoryStore
		val outputUri = fsa.getURI(resource.theoryStoreFileName)
		val resourceSet = resource.resourceSet
		val newResource = resourceSet.createResource(outputUri)
		newResource.contents += theoryStore

		modelGraph = new EGraphImpl(theoryStore)
		ruleRunner.EGraph = modelGraph

		game.moves.forEach[updateTheoryStore]

		newResource.save(SaveOptions.newBuilder().format().getOptions().toOptionsMap())
	}
	
	private def theoryStoreFileName(Resource resource) {
		val origName = resource.URI.lastSegment

		origName.substring(0, origName.lastIndexOf('.')) + '.theoryStore'
	}

	/**
	 * Update the theory store with the consequences of the given move. The below is just plumbing. The real effects are implemented in the accompanying Henshin file.
	 */
	private dispatch def updateTheoryStore(Move move) {}

	// --------------- Requirements -----------------
	private dispatch def updateTheoryStore(ProposeRequirement move) {
		'proposeRequirement'.execute(#['reqName' -> move.requirement.name, 'reqContents' -> move.requirement.content])
	}

	private dispatch def updateTheoryStore(AttackRequirement move) {
		'attackRequirement'.execute(#['attackedRequirement' -> move.requirement.name, 'theoryName' -> move.theory.name,
			'theoryContents' -> move.theory.renderTheory])
	}

	private dispatch def updateTheoryStore(RedefineRequirement move) {
		'redefineRequirement'.execute(
			#['requirementName' -> move.newRequirement.name, 'requirementContents' -> move.newRequirement.content,
				'oldReqName' -> move.requirement.name])
	}

	private dispatch def updateTheoryStore(RetractRequirement move) {
		'retractRequirement'.execute(#['reqName' -> move.requirement.name])
	}

	private dispatch def updateTheoryStore(SupportRequirement move) {
		'supportRequirement'.execute(
			#['requirementName' -> move.requirement.name, 'theoryName' -> move.theory.name,
				'theoryContents' -> move.theory.renderTheory])
	}

	// --------------- Model -----------------
	private dispatch def updateTheoryStore(ProposeModel move) {
		'proposeModel'.execute(
			#['requirementName' -> move.requirement.name, 'modelName' -> move.model.name,
				'modelContents' -> move.model.content])
	}

	private dispatch def updateTheoryStore(SupportModel move) {
		'supportModel'.execute(
			#['modelName' -> move.model.name, 'theoryContents' -> move.theory.renderTheory,
				'theoryName' -> move.theory.name])
	}

	private dispatch def updateTheoryStore(ReplaceModel move) {
		'replaceModel'.execute(
			#['newModelName' -> move.newModel.name, 'newModelContents' -> move.newModel.content,
				'oldModelName' -> move.model.name])
	}

	private dispatch def updateTheoryStore(CounterModel move) {
		'counterModel'.execute(
			#['modelName' -> move.model.name, 'requirementName' -> move.requirement.name,
				'experimentName' -> move.experiment.name, 'experimentContents' -> move.experiment.content])
	}

	private dispatch def updateTheoryStore(AttackModel move) {
		'attackModel'.execute(
			#['modelName' -> move.model.name, 'theoryContents' -> move.theory.renderTheory,
				'theoryName' -> move.theory.name])
	}

	// --------------- Experiment -----------------
	private dispatch def updateTheoryStore(ProposeExperiment move) {
		'proposeExperiment'.execute(
			#['modelName' -> move.model.name, 'requirementName' -> move.requirement.name,
				'experimentName' -> move.experiment.name, 'experimentContents' -> move.experiment.content])
	}

	private dispatch def updateTheoryStore(SupportExperiment move) {
		'supportExperiment'.execute(
			#['experimentName' -> move.experiment.name, 'theoryName' -> move.theory.name,
				'theoryContents' -> move.theory.renderTheory])
	}

	private dispatch def updateTheoryStore(AttackExperiment move) {
		'attackExperiment'.execute(
			#['experimentName' -> move.experiment.name, 'theoryName' -> move.theory.name,
				'theoryContents' -> move.theory.renderTheory])
	}

	private dispatch def updateTheoryStore(RetractExperiment move) {
		'retractExperiment'.execute(#['experimentName' -> move.experiment.name])
	}

	private dispatch def updateTheoryStore(NotConvinced move) {
		'notConvinced'.execute(#['modelName' -> move.model.name])
	}

	// theory handling
	private dispatch def renderTheory(Theory t) {
		throw new UnsupportedOperationException('''Theories of type «t.eClass.name» not currently supported by theory-store generator.''')
	}
	private dispatch def renderTheory(GeneralTheory gt) { gt.content }
	private dispatch def renderTheory(LiteratureReference lr) { lr.ref }
	private dispatch def renderTheory(MultiTheory mt) { mt.theories.map[renderTheory].join("&&") } 
	
	// -- rule execution --
	private def execute(String ruleName, List<Pair<String, String>> parameters) {
		ruleRunner.rule = rules.findFirst[name == ruleName]
		parameters.forEach [
			ruleRunner.setParameterValue(key, value)
		]

		ruleRunner.execute(null)
	}	
}
