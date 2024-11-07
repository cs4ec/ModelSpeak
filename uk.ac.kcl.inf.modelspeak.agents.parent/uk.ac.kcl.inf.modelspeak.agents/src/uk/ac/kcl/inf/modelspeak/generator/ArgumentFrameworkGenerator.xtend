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
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElement
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.Attack
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
		val attack = framework.createAttack

		attack.source = trace.get(a.evidence)
		attack.target = trace.get(a.claim)

		// TODO: How to manage warrants and assumptions?
	}

	private dispatch def void transformRelation(Support s, AbstractArgumentFramework framework,
		Map<ArgumentElement, AbstractArgument> trace) {
		// A support is an attack of an intermediary argument that attacks the claim
		val intermediary = framework.createVirtualArgument
		val attack1 = framework.createAttack
		val attack2 = framework.createAttack

		attack1.source = trace.get(s.evidence)
		attack1.target = intermediary

		attack2.source = intermediary
		attack2.target = trace.get(s.claim)

		// TODO: How to manage warrants and assumptions?		
	}

	private def createDerivedArgumentFor(AbstractArgumentFramework framework, ArgumentElement ae) {
		val abstractArg = createDerivedAbstractArgument
		abstractArg.argumentelement = ae
		abstractArg.id = createArgID
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

	// ID management
	var long argID = 0
	var long attackID = 0

	private def createArgID() { argID++ }

	private def createAttackID() { attackID++ }
}
