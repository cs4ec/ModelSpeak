/**
 */
package arguments.util;

import arguments.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see arguments.ArgumentsPackage
 * @generated
 */
public class ArgumentsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArgumentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArgumentsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentsSwitch<Adapter> modelSwitch = new ArgumentsSwitch<Adapter>() {
		@Override
		public Adapter caseArgumentElement(ArgumentElement object) {
			return createArgumentElementAdapter();
		}

		@Override
		public Adapter caseArgumentGraph(ArgumentGraph object) {
			return createArgumentGraphAdapter();
		}

		@Override
		public Adapter caseArgumentElementRelation(ArgumentElementRelation object) {
			return createArgumentElementRelationAdapter();
		}

		@Override
		public Adapter caseSimulationMechanismWarrant(SimulationMechanismWarrant object) {
			return createSimulationMechanismWarrantAdapter();
		}

		@Override
		public Adapter caseStandardSimulationWarrant(StandardSimulationWarrant object) {
			return createStandardSimulationWarrantAdapter();
		}

		@Override
		public Adapter caseLiteratureEvidenceForDataAndEffect(LiteratureEvidenceForDataAndEffect object) {
			return createLiteratureEvidenceForDataAndEffectAdapter();
		}

		@Override
		public Adapter caseModelMatchesDataOverTime(ModelMatchesDataOverTime object) {
			return createModelMatchesDataOverTimeAdapter();
		}

		@Override
		public Adapter caseMechanismExplainsEffect(MechanismExplainsEffect object) {
			return createMechanismExplainsEffectAdapter();
		}

		@Override
		public Adapter caseSupport(Support object) {
			return createSupportAdapter();
		}

		@Override
		public Adapter caseAttack(Attack object) {
			return createAttackAdapter();
		}

		@Override
		public Adapter caseExperimentResults(ExperimentResults object) {
			return createExperimentResultsAdapter();
		}

		@Override
		public Adapter caseLiteratureEvidence(LiteratureEvidence object) {
			return createLiteratureEvidenceAdapter();
		}

		@Override
		public Adapter caseModelIsValidClaim(ModelIsValidClaim object) {
			return createModelIsValidClaimAdapter();
		}

		@Override
		public Adapter caseModelInputDataValid(ModelInputDataValid object) {
			return createModelInputDataValidAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.ArgumentElement <em>Argument Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.ArgumentElement
	 * @generated
	 */
	public Adapter createArgumentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.ArgumentGraph <em>Argument Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.ArgumentGraph
	 * @generated
	 */
	public Adapter createArgumentGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.ArgumentElementRelation <em>Argument Element Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.ArgumentElementRelation
	 * @generated
	 */
	public Adapter createArgumentElementRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.SimulationMechanismWarrant <em>Simulation Mechanism Warrant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.SimulationMechanismWarrant
	 * @generated
	 */
	public Adapter createSimulationMechanismWarrantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.StandardSimulationWarrant <em>Standard Simulation Warrant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.StandardSimulationWarrant
	 * @generated
	 */
	public Adapter createStandardSimulationWarrantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.LiteratureEvidenceForDataAndEffect <em>Literature Evidence For Data And Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.LiteratureEvidenceForDataAndEffect
	 * @generated
	 */
	public Adapter createLiteratureEvidenceForDataAndEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.ModelMatchesDataOverTime <em>Model Matches Data Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.ModelMatchesDataOverTime
	 * @generated
	 */
	public Adapter createModelMatchesDataOverTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.MechanismExplainsEffect <em>Mechanism Explains Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.MechanismExplainsEffect
	 * @generated
	 */
	public Adapter createMechanismExplainsEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.Support <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.Support
	 * @generated
	 */
	public Adapter createSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.Attack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.Attack
	 * @generated
	 */
	public Adapter createAttackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.ExperimentResults <em>Experiment Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.ExperimentResults
	 * @generated
	 */
	public Adapter createExperimentResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.LiteratureEvidence <em>Literature Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.LiteratureEvidence
	 * @generated
	 */
	public Adapter createLiteratureEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.ModelIsValidClaim <em>Model Is Valid Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.ModelIsValidClaim
	 * @generated
	 */
	public Adapter createModelIsValidClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arguments.ModelInputDataValid <em>Model Input Data Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arguments.ModelInputDataValid
	 * @generated
	 */
	public Adapter createModelInputDataValidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArgumentsAdapterFactory
