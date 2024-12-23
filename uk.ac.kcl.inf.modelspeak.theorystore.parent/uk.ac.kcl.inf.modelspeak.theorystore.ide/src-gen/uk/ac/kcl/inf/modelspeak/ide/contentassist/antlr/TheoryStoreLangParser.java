/*
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uk.ac.kcl.inf.modelspeak.ide.contentassist.antlr.internal.InternalTheoryStoreLangParser;
import uk.ac.kcl.inf.modelspeak.services.TheoryStoreLangGrammarAccess;

public class TheoryStoreLangParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TheoryStoreLangGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TheoryStoreLangGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getModelAccess().getGroup_5(), "rule__Model__Group_5__0");
			builder.put(grammarAccess.getModelAccess().getGroup_5_2(), "rule__Model__Group_5_2__0");
			builder.put(grammarAccess.getTheoryAccess().getGroup(), "rule__Theory__Group__0");
			builder.put(grammarAccess.getTheoryAccess().getGroup_5(), "rule__Theory__Group_5__0");
			builder.put(grammarAccess.getTheoryAccess().getGroup_5_2(), "rule__Theory__Group_5_2__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup(), "rule__Requirement__Group__0");
			builder.put(grammarAccess.getExperimentAccess().getGroup(), "rule__Experiment__Group__0");
			builder.put(grammarAccess.getExperimentAccess().getGroup_7(), "rule__Experiment__Group_7__0");
			builder.put(grammarAccess.getExperimentAccess().getGroup_7_2(), "rule__Experiment__Group_7_2__0");
			builder.put(grammarAccess.getTheoryStoreAccess().getElementsAssignment(), "rule__TheoryStore__ElementsAssignment");
			builder.put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
			builder.put(grammarAccess.getModelAccess().getContentAssignment_3(), "rule__Model__ContentAssignment_3");
			builder.put(grammarAccess.getModelAccess().getRequirementsAssignment_5_1(), "rule__Model__RequirementsAssignment_5_1");
			builder.put(grammarAccess.getModelAccess().getRequirementsAssignment_5_2_1(), "rule__Model__RequirementsAssignment_5_2_1");
			builder.put(grammarAccess.getTheoryAccess().getNameAssignment_1(), "rule__Theory__NameAssignment_1");
			builder.put(grammarAccess.getTheoryAccess().getContentAssignment_3(), "rule__Theory__ContentAssignment_3");
			builder.put(grammarAccess.getTheoryAccess().getElementsAssignment_5_1(), "rule__Theory__ElementsAssignment_5_1");
			builder.put(grammarAccess.getTheoryAccess().getElementsAssignment_5_2_1(), "rule__Theory__ElementsAssignment_5_2_1");
			builder.put(grammarAccess.getRequirementAccess().getNameAssignment_1(), "rule__Requirement__NameAssignment_1");
			builder.put(grammarAccess.getRequirementAccess().getContentAssignment_3(), "rule__Requirement__ContentAssignment_3");
			builder.put(grammarAccess.getExperimentAccess().getNameAssignment_1(), "rule__Experiment__NameAssignment_1");
			builder.put(grammarAccess.getExperimentAccess().getContentAssignment_3(), "rule__Experiment__ContentAssignment_3");
			builder.put(grammarAccess.getExperimentAccess().getModelAssignment_6(), "rule__Experiment__ModelAssignment_6");
			builder.put(grammarAccess.getExperimentAccess().getRequirementsAssignment_7_1(), "rule__Experiment__RequirementsAssignment_7_1");
			builder.put(grammarAccess.getExperimentAccess().getRequirementsAssignment_7_2_1(), "rule__Experiment__RequirementsAssignment_7_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TheoryStoreLangGrammarAccess grammarAccess;

	@Override
	protected InternalTheoryStoreLangParser createParser() {
		InternalTheoryStoreLangParser result = new InternalTheoryStoreLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TheoryStoreLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TheoryStoreLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
