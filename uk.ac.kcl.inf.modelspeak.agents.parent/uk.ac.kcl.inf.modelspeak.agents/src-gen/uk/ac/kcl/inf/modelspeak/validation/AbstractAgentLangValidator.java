/*
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractAgentLangValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage.eINSTANCE);
		return result;
	}
}