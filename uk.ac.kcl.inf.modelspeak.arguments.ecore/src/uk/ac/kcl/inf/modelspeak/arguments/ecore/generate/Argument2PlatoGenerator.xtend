package uk.ac.kcl.inf.modelspeak.arguments.ecore.generate

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElement
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.Attack
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ExperimentResults
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.SimulationMechanismWarrant
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.StandardSimulationWarrant

class Argument2PlatoGenerator {
	def doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile(resource.platoFileName, (resource.contents.head as ArgumentGraph).generate)
	}
	
	private def getPlatoFileName(Resource resource) {
		val origName = resource.URI.lastSegment

		origName.substring(0, origName.lastIndexOf('.')) + '.tgf'
	}
	
	def generate(ArgumentGraph graph) {
		val argumentIDs = new HashMap<ArgumentElement, String>
		
		'''
		  «graph.argumentElements.map[generateLabel(argumentIDs)].join(System.lineSeparator)»
		  #
		  «graph.relations.filter(Attack).map[generateAttack(argumentIDs)].join(System.lineSeparator)»
		'''
	}
	
	var nextID = 0L;
	
	def generateLabel(ArgumentElement ae, Map<ArgumentElement, String> argumentIDs) {
		val label = '''«ae.label»«nextID++»'''
		argumentIDs += ae -> label
		label
	}
	
	def generateAttack(Attack aer, extension Map<ArgumentElement, String> argumentIDs) '''«aer.evidence.get» «aer.claim.get»'''
	
	private dispatch def getLabel (ArgumentElement ae) {
		throw new UnsupportedOperationException('''Argument Elements of type «ae.eClass» not currently supported.''')
	}	
	private dispatch def getLabel (SimulationMechanismWarrant smw) '''SMW«smw.explainedEffect.clean»'''
	private dispatch def getLabel (StandardSimulationWarrant ssw) '''SSW'''
	private dispatch def getLabel (LiteratureEvidence le) '''LE«le.reference.clean»'''
	private dispatch def getLabel (ModelMatchesDataOverTime mmdot) '''MMDOT«mmdot.dataOverTime.clean»'''
	private dispatch def getLabel (MechanismExplainsEffect mee) '''MEE«mee.mechanism.clean»'''
	private dispatch def getLabel (ExperimentResults er) '''ER«er.results.clean»'''
	
	private def clean(String s) {
		s.replaceAll("[\\s(){}\\[\\]\\.]","")
	} 
}