/*
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class TheoryStoreLangAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/ac/kcl/inf/modelspeak/parser/antlr/internal/InternalTheoryStoreLang.tokens");
	}
}
