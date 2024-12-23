/*
 * generated by Xtext 2.35.0
 */
grammar InternalTheoryStoreLang;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package uk.ac.kcl.inf.modelspeak.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package uk.ac.kcl.inf.modelspeak.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.modelspeak.services.TheoryStoreLangGrammarAccess;

}
@parser::members {
	private TheoryStoreLangGrammarAccess grammarAccess;

	public void setGrammarAccess(TheoryStoreLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleTheoryStore
entryRuleTheoryStore
:
{ before(grammarAccess.getTheoryStoreRule()); }
	 ruleTheoryStore
{ after(grammarAccess.getTheoryStoreRule()); } 
	 EOF 
;

// Rule TheoryStore
ruleTheoryStore 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTheoryStoreAccess().getElementsAssignment()); }
		(rule__TheoryStore__ElementsAssignment)*
		{ after(grammarAccess.getTheoryStoreAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleElement
entryRuleElement
:
{ before(grammarAccess.getElementRule()); }
	 ruleElement
{ after(grammarAccess.getElementRule()); } 
	 EOF 
;

// Rule Element
ruleElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElementAccess().getAlternatives()); }
		(rule__Element__Alternatives)
		{ after(grammarAccess.getElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTheory
entryRuleTheory
:
{ before(grammarAccess.getTheoryRule()); }
	 ruleTheory
{ after(grammarAccess.getTheoryRule()); } 
	 EOF 
;

// Rule Theory
ruleTheory 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTheoryAccess().getGroup()); }
		(rule__Theory__Group__0)
		{ after(grammarAccess.getTheoryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequirement
entryRuleRequirement
:
{ before(grammarAccess.getRequirementRule()); }
	 ruleRequirement
{ after(grammarAccess.getRequirementRule()); } 
	 EOF 
;

// Rule Requirement
ruleRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequirementAccess().getGroup()); }
		(rule__Requirement__Group__0)
		{ after(grammarAccess.getRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExperiment
entryRuleExperiment
:
{ before(grammarAccess.getExperimentRule()); }
	 ruleExperiment
{ after(grammarAccess.getExperimentRule()); } 
	 EOF 
;

// Rule Experiment
ruleExperiment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExperimentAccess().getGroup()); }
		(rule__Experiment__Group__0)
		{ after(grammarAccess.getExperimentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementAccess().getModelParserRuleCall_0()); }
		ruleModel
		{ after(grammarAccess.getElementAccess().getModelParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getTheoryParserRuleCall_1()); }
		ruleTheory
		{ after(grammarAccess.getElementAccess().getTheoryParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getRequirementParserRuleCall_2()); }
		ruleRequirement
		{ after(grammarAccess.getElementAccess().getRequirementParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getExperimentParserRuleCall_3()); }
		ruleExperiment
		{ after(grammarAccess.getElementAccess().getExperimentParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getModelKeyword_0()); }
	'Model'
	{ after(grammarAccess.getModelAccess().getModelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNameAssignment_1()); }
	(rule__Model__NameAssignment_1)
	{ after(grammarAccess.getModelAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__2__Impl
	rule__Model__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__3__Impl
	rule__Model__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getContentAssignment_3()); }
	(rule__Model__ContentAssignment_3)
	{ after(grammarAccess.getModelAccess().getContentAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__4__Impl
	rule__Model__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getGroup_5()); }
	(rule__Model__Group_5__0)?
	{ after(grammarAccess.getModelAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_5__0__Impl
	rule__Model__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); }
	'->'
	{ after(grammarAccess.getModelAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_5__1__Impl
	rule__Model__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getRequirementsAssignment_5_1()); }
	(rule__Model__RequirementsAssignment_5_1)
	{ after(grammarAccess.getModelAccess().getRequirementsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getGroup_5_2()); }
	(rule__Model__Group_5_2__0)*
	{ after(grammarAccess.getModelAccess().getGroup_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_5_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_5_2__0__Impl
	rule__Model__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_5_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getCommaKeyword_5_2_0()); }
	','
	{ after(grammarAccess.getModelAccess().getCommaKeyword_5_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_5_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_5_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_5_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getRequirementsAssignment_5_2_1()); }
	(rule__Model__RequirementsAssignment_5_2_1)
	{ after(grammarAccess.getModelAccess().getRequirementsAssignment_5_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Theory__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Theory__Group__0__Impl
	rule__Theory__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTheoryAccess().getTheoryKeyword_0()); }
	'Theory'
	{ after(grammarAccess.getTheoryAccess().getTheoryKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Theory__Group__1__Impl
	rule__Theory__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTheoryAccess().getNameAssignment_1()); }
	(rule__Theory__NameAssignment_1)
	{ after(grammarAccess.getTheoryAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Theory__Group__2__Impl
	rule__Theory__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTheoryAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTheoryAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Theory__Group__3__Impl
	rule__Theory__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTheoryAccess().getContentAssignment_3()); }
	(rule__Theory__ContentAssignment_3)
	{ after(grammarAccess.getTheoryAccess().getContentAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Theory__Group__4__Impl
	rule__Theory__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTheoryAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTheoryAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Theory__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTheoryAccess().getGroup_5()); }
	(rule__Theory__Group_5__0)?
	{ after(grammarAccess.getTheoryAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Theory__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Theory__Group_5__0__Impl
	rule__Theory__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTheoryAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); }
	'->'
	{ after(grammarAccess.getTheoryAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Theory__Group_5__1__Impl
	rule__Theory__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTheoryAccess().getElementsAssignment_5_1()); }
	(rule__Theory__ElementsAssignment_5_1)
	{ after(grammarAccess.getTheoryAccess().getElementsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Theory__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTheoryAccess().getGroup_5_2()); }
	(rule__Theory__Group_5_2__0)*
	{ after(grammarAccess.getTheoryAccess().getGroup_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Theory__Group_5_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Theory__Group_5_2__0__Impl
	rule__Theory__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group_5_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTheoryAccess().getCommaKeyword_5_2_0()); }
	','
	{ after(grammarAccess.getTheoryAccess().getCommaKeyword_5_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group_5_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Theory__Group_5_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__Group_5_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTheoryAccess().getElementsAssignment_5_2_1()); }
	(rule__Theory__ElementsAssignment_5_2_1)
	{ after(grammarAccess.getTheoryAccess().getElementsAssignment_5_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Requirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Requirement__Group__0__Impl
	rule__Requirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Requirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequirementAccess().getRequirementKeyword_0()); }
	'Requirement'
	{ after(grammarAccess.getRequirementAccess().getRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Requirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Requirement__Group__1__Impl
	rule__Requirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Requirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequirementAccess().getNameAssignment_1()); }
	(rule__Requirement__NameAssignment_1)
	{ after(grammarAccess.getRequirementAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Requirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Requirement__Group__2__Impl
	rule__Requirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Requirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Requirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Requirement__Group__3__Impl
	rule__Requirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Requirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequirementAccess().getContentAssignment_3()); }
	(rule__Requirement__ContentAssignment_3)
	{ after(grammarAccess.getRequirementAccess().getContentAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Requirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Requirement__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Requirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Experiment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Experiment__Group__0__Impl
	rule__Experiment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperimentAccess().getExperimentKeyword_0()); }
	'Experiment'
	{ after(grammarAccess.getExperimentAccess().getExperimentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Experiment__Group__1__Impl
	rule__Experiment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperimentAccess().getNameAssignment_1()); }
	(rule__Experiment__NameAssignment_1)
	{ after(grammarAccess.getExperimentAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Experiment__Group__2__Impl
	rule__Experiment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Experiment__Group__3__Impl
	rule__Experiment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperimentAccess().getContentAssignment_3()); }
	(rule__Experiment__ContentAssignment_3)
	{ after(grammarAccess.getExperimentAccess().getContentAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Experiment__Group__4__Impl
	rule__Experiment__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Experiment__Group__5__Impl
	rule__Experiment__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperimentAccess().getHyphenMinusGreaterThanSignKeyword_5()); }
	'->'
	{ after(grammarAccess.getExperimentAccess().getHyphenMinusGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Experiment__Group__6__Impl
	rule__Experiment__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperimentAccess().getModelAssignment_6()); }
	(rule__Experiment__ModelAssignment_6)
	{ after(grammarAccess.getExperimentAccess().getModelAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Experiment__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperimentAccess().getGroup_7()); }
	(rule__Experiment__Group_7__0)?
	{ after(grammarAccess.getExperimentAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Experiment__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Experiment__Group_7__0__Impl
	rule__Experiment__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperimentAccess().getHyphenMinusGreaterThanSignKeyword_7_0()); }
	'->'
	{ after(grammarAccess.getExperimentAccess().getHyphenMinusGreaterThanSignKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Experiment__Group_7__1__Impl
	rule__Experiment__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperimentAccess().getRequirementsAssignment_7_1()); }
	(rule__Experiment__RequirementsAssignment_7_1)
	{ after(grammarAccess.getExperimentAccess().getRequirementsAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Experiment__Group_7__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperimentAccess().getGroup_7_2()); }
	(rule__Experiment__Group_7_2__0)*
	{ after(grammarAccess.getExperimentAccess().getGroup_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Experiment__Group_7_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Experiment__Group_7_2__0__Impl
	rule__Experiment__Group_7_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group_7_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperimentAccess().getCommaKeyword_7_2_0()); }
	','
	{ after(grammarAccess.getExperimentAccess().getCommaKeyword_7_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group_7_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Experiment__Group_7_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__Group_7_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperimentAccess().getRequirementsAssignment_7_2_1()); }
	(rule__Experiment__RequirementsAssignment_7_2_1)
	{ after(grammarAccess.getExperimentAccess().getRequirementsAssignment_7_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TheoryStore__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTheoryStoreAccess().getElementsElementParserRuleCall_0()); }
		ruleElement
		{ after(grammarAccess.getTheoryStoreAccess().getElementsElementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__ContentAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getContentSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getModelAccess().getContentSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__RequirementsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getRequirementsRequirementCrossReference_5_1_0()); }
		(
			{ before(grammarAccess.getModelAccess().getRequirementsRequirementIDTerminalRuleCall_5_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getModelAccess().getRequirementsRequirementIDTerminalRuleCall_5_1_0_1()); }
		)
		{ after(grammarAccess.getModelAccess().getRequirementsRequirementCrossReference_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__RequirementsAssignment_5_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getRequirementsRequirementCrossReference_5_2_1_0()); }
		(
			{ before(grammarAccess.getModelAccess().getRequirementsRequirementIDTerminalRuleCall_5_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getModelAccess().getRequirementsRequirementIDTerminalRuleCall_5_2_1_0_1()); }
		)
		{ after(grammarAccess.getModelAccess().getRequirementsRequirementCrossReference_5_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTheoryAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTheoryAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__ContentAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTheoryAccess().getContentSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getTheoryAccess().getContentSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__ElementsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTheoryAccess().getElementsElementCrossReference_5_1_0()); }
		(
			{ before(grammarAccess.getTheoryAccess().getElementsElementIDTerminalRuleCall_5_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTheoryAccess().getElementsElementIDTerminalRuleCall_5_1_0_1()); }
		)
		{ after(grammarAccess.getTheoryAccess().getElementsElementCrossReference_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Theory__ElementsAssignment_5_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTheoryAccess().getElementsElementCrossReference_5_2_1_0()); }
		(
			{ before(grammarAccess.getTheoryAccess().getElementsElementIDTerminalRuleCall_5_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTheoryAccess().getElementsElementIDTerminalRuleCall_5_2_1_0_1()); }
		)
		{ after(grammarAccess.getTheoryAccess().getElementsElementCrossReference_5_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Requirement__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Requirement__ContentAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequirementAccess().getContentSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getRequirementAccess().getContentSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExperimentAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getExperimentAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__ContentAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExperimentAccess().getContentSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getExperimentAccess().getContentSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__ModelAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExperimentAccess().getModelModelCrossReference_6_0()); }
		(
			{ before(grammarAccess.getExperimentAccess().getModelModelIDTerminalRuleCall_6_0_1()); }
			RULE_ID
			{ after(grammarAccess.getExperimentAccess().getModelModelIDTerminalRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getExperimentAccess().getModelModelCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__RequirementsAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExperimentAccess().getRequirementsRequirementCrossReference_7_1_0()); }
		(
			{ before(grammarAccess.getExperimentAccess().getRequirementsRequirementIDTerminalRuleCall_7_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getExperimentAccess().getRequirementsRequirementIDTerminalRuleCall_7_1_0_1()); }
		)
		{ after(grammarAccess.getExperimentAccess().getRequirementsRequirementCrossReference_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Experiment__RequirementsAssignment_7_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExperimentAccess().getRequirementsRequirementCrossReference_7_2_1_0()); }
		(
			{ before(grammarAccess.getExperimentAccess().getRequirementsRequirementIDTerminalRuleCall_7_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getExperimentAccess().getRequirementsRequirementIDTerminalRuleCall_7_2_1_0_1()); }
		)
		{ after(grammarAccess.getExperimentAccess().getRequirementsRequirementCrossReference_7_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
