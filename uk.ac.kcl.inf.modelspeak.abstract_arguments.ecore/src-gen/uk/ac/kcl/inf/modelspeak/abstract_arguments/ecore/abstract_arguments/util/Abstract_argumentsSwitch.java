/**
 */
package uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.*;

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
 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsPackage
 * @generated
 */
public class Abstract_argumentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Abstract_argumentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstract_argumentsSwitch() {
		if (modelPackage == null) {
			modelPackage = Abstract_argumentsPackage.eINSTANCE;
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
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK: {
			AbstractArgumentFramework abstractArgumentFramework = (AbstractArgumentFramework) theEObject;
			T result = caseAbstractArgumentFramework(abstractArgumentFramework);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT: {
			AbstractArgument abstractArgument = (AbstractArgument) theEObject;
			T result = caseAbstractArgument(abstractArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_ATTACK: {
			AbstractArgumentAttack abstractArgumentAttack = (AbstractArgumentAttack) theEObject;
			T result = caseAbstractArgumentAttack(abstractArgumentAttack);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Abstract_argumentsPackage.VIRTUAL_ABSTRACT_ARGUMENT: {
			VirtualAbstractArgument virtualAbstractArgument = (VirtualAbstractArgument) theEObject;
			T result = caseVirtualAbstractArgument(virtualAbstractArgument);
			if (result == null)
				result = caseAbstractArgument(virtualAbstractArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Abstract_argumentsPackage.DERIVED_ABSTRACT_ARGUMENT: {
			DerivedAbstractArgument derivedAbstractArgument = (DerivedAbstractArgument) theEObject;
			T result = caseDerivedAbstractArgument(derivedAbstractArgument);
			if (result == null)
				result = caseAbstractArgument(derivedAbstractArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Argument Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Argument Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractArgumentFramework(AbstractArgumentFramework object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractArgument(AbstractArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Argument Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Argument Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractArgumentAttack(AbstractArgumentAttack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Abstract Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Abstract Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualAbstractArgument(VirtualAbstractArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Abstract Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Abstract Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedAbstractArgument(DerivedAbstractArgument object) {
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

} //Abstract_argumentsSwitch
