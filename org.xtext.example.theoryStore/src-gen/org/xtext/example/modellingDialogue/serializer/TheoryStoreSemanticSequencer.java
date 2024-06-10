/*
 * generated by Xtext 2.35.0
 */
package org.xtext.example.modellingDialogue.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.modellingDialogue.services.TheoryStoreGrammarAccess;
import org.xtext.example.modellingDialogue.theoryStore.Experiment;
import org.xtext.example.modellingDialogue.theoryStore.Model;
import org.xtext.example.modellingDialogue.theoryStore.Requirement;
import org.xtext.example.modellingDialogue.theoryStore.Theory;
import org.xtext.example.modellingDialogue.theoryStore.TheoryStore;
import org.xtext.example.modellingDialogue.theoryStore.TheoryStorePackage;

@SuppressWarnings("all")
public class TheoryStoreSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TheoryStoreGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TheoryStorePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TheoryStorePackage.EXPERIMENT:
				sequence_Experiment(context, (Experiment) semanticObject); 
				return; 
			case TheoryStorePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TheoryStorePackage.REQUIREMENT:
				sequence_Requirement(context, (Requirement) semanticObject); 
				return; 
			case TheoryStorePackage.THEORY:
				sequence_Theory(context, (Theory) semanticObject); 
				return; 
			case TheoryStorePackage.THEORY_STORE:
				sequence_TheoryStore(context, (TheoryStore) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns Experiment
	 *     Experiment returns Experiment
	 *
	 * Constraint:
	 *     (name=ID content=STRING model+=[Model|ID] (requirements+=[Requirement|ID] requirements+=[Requirement|ID]*)?)
	 * </pre>
	 */
	protected void sequence_Experiment(ISerializationContext context, Experiment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns Model
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=ID content=STRING (requirements+=[Requirement|ID] requirements+=[Requirement|ID]*)?)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns Requirement
	 *     Requirement returns Requirement
	 *
	 * Constraint:
	 *     (name=ID content=STRING)
	 * </pre>
	 */
	protected void sequence_Requirement(ISerializationContext context, Requirement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TheoryStorePackage.Literals.ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TheoryStorePackage.Literals.ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, TheoryStorePackage.Literals.ELEMENT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TheoryStorePackage.Literals.ELEMENT__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRequirementAccess().getContentSTRINGTerminalRuleCall_3_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TheoryStore returns TheoryStore
	 *
	 * Constraint:
	 *     elements+=Element+
	 * </pre>
	 */
	protected void sequence_TheoryStore(ISerializationContext context, TheoryStore semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns Theory
	 *     Theory returns Theory
	 *
	 * Constraint:
	 *     (name=ID content=STRING (elements+=[Element|ID] elements+=[Element|ID]*)?)
	 * </pre>
	 */
	protected void sequence_Theory(ISerializationContext context, Theory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}