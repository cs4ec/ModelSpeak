/*
 * generated by Xtext 2.36.0
 */
package uk.ac.kcl.inf.modelspeak.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AgentLangAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/ac/kcl/inf/modelspeak/parser/antlr/internal/InternalAgentLang.tokens");
	}
}
