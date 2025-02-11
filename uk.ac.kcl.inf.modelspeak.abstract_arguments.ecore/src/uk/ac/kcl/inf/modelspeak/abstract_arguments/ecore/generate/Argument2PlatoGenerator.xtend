package uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.generate

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework

class Argument2PlatoGenerator {
	def doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile(resource.platoFileName, (resource.contents.head as AbstractArgumentFramework).generate)
	}

	private def getPlatoFileName(Resource resource) {
		val origName = resource.URI.lastSegment

		origName.substring(0, origName.lastIndexOf('.')) + '.tgf'
	}

	def generate(AbstractArgumentFramework framework) '''
		«framework.arguments.map[id].join(System.lineSeparator)»
		#
		«framework.attacks.map[generateAttack].join(System.lineSeparator)»
	'''

	def generateAttack(AbstractArgumentAttack aaa) '''«aaa.source.id» «aaa.target.id»'''
}
