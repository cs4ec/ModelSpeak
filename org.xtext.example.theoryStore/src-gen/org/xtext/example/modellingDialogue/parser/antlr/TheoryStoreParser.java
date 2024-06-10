/*
 * generated by Xtext 2.35.0
 */
package org.xtext.example.modellingDialogue.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.modellingDialogue.parser.antlr.internal.InternalTheoryStoreParser;
import org.xtext.example.modellingDialogue.services.TheoryStoreGrammarAccess;

public class TheoryStoreParser extends AbstractAntlrParser {

	@Inject
	private TheoryStoreGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTheoryStoreParser createParser(XtextTokenStream stream) {
		return new InternalTheoryStoreParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "TheoryStore";
	}

	public TheoryStoreGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TheoryStoreGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}