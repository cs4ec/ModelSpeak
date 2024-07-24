/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage
 * @generated
 */
public class ArgumentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArgumentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentsSwitch() {
		if (modelPackage == null) {
			modelPackage = ArgumentsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ArgumentsPackage.ARGUMENT_ELEMENT: {
			ArgumentElement argumentElement = (ArgumentElement) theEObject;
			T result = caseArgumentElement(argumentElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArgumentsPackage.ARGUMENT_GRAPH: {
			ArgumentGraph argumentGraph = (ArgumentGraph) theEObject;
			T result = caseArgumentGraph(argumentGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION: {
			ArgumentElementRelation argumentElementRelation = (ArgumentElementRelation) theEObject;
			T result = caseArgumentElementRelation(argumentElementRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArgumentsPackage.SIMULATION_MECHANISM_WARRANT: {
			SimulationMechanismWarrant simulationMechanismWarrant = (SimulationMechanismWarrant) theEObject;
			T result = caseSimulationMechanismWarrant(simulationMechanismWarrant);
			if (result == null)
				result = caseArgumentElement(simulationMechanismWarrant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArgumentsPackage.STANDARD_SIMULATION_WARRANT: {
			StandardSimulationWarrant standardSimulationWarrant = (StandardSimulationWarrant) theEObject;
			T result = caseStandardSimulationWarrant(standardSimulationWarrant);
			if (result == null)
				result = caseArgumentElement(standardSimulationWarrant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArgumentsPackage.LITERATURE_EVIDENCE: {
			LiteratureEvidence literatureEvidence = (LiteratureEvidence) theEObject;
			T result = caseLiteratureEvidence(literatureEvidence);
			if (result == null)
				result = caseArgumentElement(literatureEvidence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME: {
			ModelMatchesDataOverTime modelMatchesDataOverTime = (ModelMatchesDataOverTime) theEObject;
			T result = caseModelMatchesDataOverTime(modelMatchesDataOverTime);
			if (result == null)
				result = caseArgumentElement(modelMatchesDataOverTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArgumentsPackage.MECHANISM_EXPLAINS_EFFECT: {
			MechanismExplainsEffect mechanismExplainsEffect = (MechanismExplainsEffect) theEObject;
			T result = caseMechanismExplainsEffect(mechanismExplainsEffect);
			if (result == null)
				result = caseArgumentElement(mechanismExplainsEffect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentElement(ArgumentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentGraph(ArgumentGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Element Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Element Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentElementRelation(ArgumentElementRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Mechanism Warrant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Mechanism Warrant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationMechanismWarrant(SimulationMechanismWarrant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Simulation Warrant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Simulation Warrant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardSimulationWarrant(StandardSimulationWarrant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literature Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literature Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteratureEvidence(LiteratureEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Matches Data Over Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Matches Data Over Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelMatchesDataOverTime(ModelMatchesDataOverTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mechanism Explains Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mechanism Explains Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMechanismExplainsEffect(MechanismExplainsEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArgumentsSwitch
