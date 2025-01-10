package uk.ac.kcl.inf.modelspeak.generator

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.SaveOptions
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgument
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsFactory
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.generate.Argument2PlatoGenerator
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElement
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.Attack
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ExperimentResults
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelInputDataValid
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.SimulationMechanismWarrant
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.StandardSimulationWarrant
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.Support

/**
 * Take an argument graph and translate it into an abstract argument graph.
 */
class ArgumentFrameworkGenerator {

	val extension Abstract_argumentsFactory factory = Abstract_argumentsFactory.eINSTANCE

	val argumentFramework = createAbstractArgumentFramework
	var Resource frameworkResource

	def void beforeGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val outputUri = fsa.getURI(resource.abstractArgumentFrameworkFileName)
		val resourceSet = resource.resourceSet
		frameworkResource = resourceSet.createResource(outputUri)
		frameworkResource.contents += argumentFramework
	}

	def void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// Run transformation
		val argGraph = resource.contents.head as ArgumentGraph
		argumentFramework.argumentgraph = argGraph
		val elementTrace = new HashMap<ArgumentElement, AbstractArgument> // Track forward traces here
		argGraph.argumentElements.forEach[transformElement(argumentFramework, elementTrace)]
		argGraph.relations.forEach[transformRelation(argumentFramework, elementTrace)]

		frameworkResource.save(SaveOptions.newBuilder().format().getOptions().toOptionsMap())

		new Argument2PlatoGenerator().doGenerate(frameworkResource, fsa, context)
	}

	private def getAbstractArgumentFrameworkFileName(Resource resource) {
		val origName = resource.URI.lastSegment

		origName.substring(0, origName.lastIndexOf('.')) + '.abstract_arguments'
	}

	private def void transformElement(ArgumentElement ae, AbstractArgumentFramework framework,
		Map<ArgumentElement, AbstractArgument> trace) {
		trace += (ae -> framework.createDerivedArgumentFor(ae))
	}

	private dispatch def void transformRelation(ArgumentElementRelation aer, AbstractArgumentFramework framework,
		Map<ArgumentElement, AbstractArgument> trace) {
		throw new UnsupportedOperationException('''Argument relations of type «aer.eClass.name» not currently supported.''')
	}

	private dispatch def void transformRelation(Attack a, AbstractArgumentFramework framework,
		Map<ArgumentElement, AbstractArgument> trace) {
		if ((a.warrant === null) && (a.assumptions.empty)) {
			// We can get away with a simple and straightforward translation
			val attack = framework.createAttack

			attack.source = trace.get(a.evidence)
			attack.target = trace.get(a.claim)
		} else {
			// If there is more than just evidence, then we need to create an intermediary virtual argument that attacks the claim and is itself supported (via a sequence of attacks) by the different components
			val virtual = framework.createVirtualArgument
			val virtAttack = framework.createAttack
			virtAttack.source = virtual
			virtAttack.target = trace.get(a.claim)
			
			framework.createAttackSequenceBetween(trace, a.evidence, virtual)
			
			if (a.warrant !== null) {
				framework.createAttackSequenceBetween(trace, a.warrant, virtual)			
			}
			
			a.assumptions.forEach[ass |
				framework.createAttackSequenceBetween(trace, ass, virtual)
			]
		}
	}

	private dispatch def void transformRelation(Support s, AbstractArgumentFramework framework,
		Map<ArgumentElement, AbstractArgument> trace) {
		/*
		 * The evidence must be acceptable for the claim to be acceptable
		 * 
		 * This can be expressed as an attack by the evidence on an intermediary argument that attacks the claim.
		 */
		framework.createAttackSequenceBetween(trace, s.evidence, s.claim)

		if (s.warrant !== null) {
			/*
			 * If there is a warrant, then it must also be acceptable for the claim to be acceptable
			 * 
			 * This can be expressed as an attack by the support on an intermediary argument that attacks the claim. 
			 * Making this a separate chain of attacks ensures that both warrant and evidence must be acceptable for the claim to be acceptable. 
			 */
			framework.createAttackSequenceBetween(trace, s.warrant, s.claim)
		}

		if (!s.assumptions.empty) {
			/*
			 * If there are assumptions, then they must also be acceptable for the claim to be acceptable
			 * 
			 * This can be expressed as an attack by each assumption on an intermediary argument that attacks the claim. 
			 * Making this a separate chain of attacks ensures that all assumptions and both warrant and evidence must be acceptable for the claim to be acceptable. 
			 */
			s.assumptions.forEach [ a |
				framework.createAttackSequenceBetween(trace, a, s.claim)
			]
		}
	}

	/**
	 * Create a sequence of attacks and a virtual argument to represent a support relationship using only attack relations.
	 */
	private def createAttackSequenceBetween(AbstractArgumentFramework framework,
		Map<ArgumentElement, AbstractArgument> trace, ArgumentElement ae1, ArgumentElement ae2) {
		framework.createAttackSequenceBetween(trace, ae1, trace.get(ae2))
	}

	private def createAttackSequenceBetween(AbstractArgumentFramework framework,
		Map<ArgumentElement, AbstractArgument> trace, ArgumentElement ae1, AbstractArgument aa) {
		val intermediary = framework.createVirtualArgument
		val attack1 = framework.createAttack
		val attack2 = framework.createAttack

		attack1.source = trace.get(ae1)
		attack1.target = intermediary

		attack2.source = intermediary
		attack2.target = aa
	}

	private def createDerivedArgumentFor(AbstractArgumentFramework framework, ArgumentElement ae) {
		val abstractArg = createDerivedAbstractArgument
		abstractArg.argumentelement = ae
		abstractArg.id = createArgID
		abstractArg.label = ae.label
		framework.arguments += abstractArg

		return abstractArg
	}

	private def createVirtualArgument(AbstractArgumentFramework framework) {
		val abstractArg = createVirtualAbstractArgument
		abstractArg.id = createArgID
		framework.arguments += abstractArg

		return abstractArg
	}

	private def createAttack(AbstractArgumentFramework framework) {
		val attack = createAbstractArgumentAttack
		framework.attacks += attack
		attack.id = createAttackID

		return attack
	}

	// Label derivation
	private dispatch def String getLabel(ArgumentElement ae) '''«ae.eClass.name»:«ae.hashCode»'''

	private dispatch def String getLabel(StandardSimulationWarrant ssw) '''Standard Simulation Warrant'''

	private dispatch def String getLabel(
		SimulationMechanismWarrant smw) '''Sim Mechanism Warrant: "«smw.explainedEffect»"'''

	private dispatch def String getLabel(LiteratureEvidence le) '''[«le.reference»]'''

	private dispatch def String getLabel(ModelMatchesDataOverTime mmdot) '''Model <«mmdot.model»>(«mmdot.mechanism»)'''

	private dispatch def String getLabel(MechanismExplainsEffect mee) '''Effect explained («mee.mechanism»)'''

	private dispatch def String getLabel(ExperimentResults er) '''Experiment «er.experimentName»'''

	private dispatch def String getLabel(ModelInputDataValid midv) '''Valid model input data («midv.model»)'''

	// ID management
	var long argID = 0
	var long attackID = 0

	private def createArgID() { argID++ }

	private def createAttackID() { attackID++ }
}
