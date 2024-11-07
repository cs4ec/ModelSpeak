/**
 */
package uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl;

import arguments.ArgumentElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsPackage;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.DerivedAbstractArgument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Abstract Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.DerivedAbstractArgumentImpl#getArgumentelement <em>Argumentelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedAbstractArgumentImpl extends AbstractArgumentImpl implements DerivedAbstractArgument {
	/**
	 * The cached value of the '{@link #getArgumentelement() <em>Argumentelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentelement()
	 * @generated
	 * @ordered
	 */
	protected ArgumentElement argumentelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedAbstractArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Abstract_argumentsPackage.Literals.DERIVED_ABSTRACT_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgumentElement getArgumentelement() {
		if (argumentelement != null && argumentelement.eIsProxy()) {
			InternalEObject oldArgumentelement = (InternalEObject) argumentelement;
			argumentelement = (ArgumentElement) eResolveProxy(oldArgumentelement);
			if (argumentelement != oldArgumentelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Abstract_argumentsPackage.DERIVED_ABSTRACT_ARGUMENT__ARGUMENTELEMENT, oldArgumentelement,
							argumentelement));
			}
		}
		return argumentelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentElement basicGetArgumentelement() {
		return argumentelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgumentelement(ArgumentElement newArgumentelement) {
		ArgumentElement oldArgumentelement = argumentelement;
		argumentelement = newArgumentelement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Abstract_argumentsPackage.DERIVED_ABSTRACT_ARGUMENT__ARGUMENTELEMENT, oldArgumentelement,
					argumentelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Abstract_argumentsPackage.DERIVED_ABSTRACT_ARGUMENT__ARGUMENTELEMENT:
			if (resolve)
				return getArgumentelement();
			return basicGetArgumentelement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Abstract_argumentsPackage.DERIVED_ABSTRACT_ARGUMENT__ARGUMENTELEMENT:
			setArgumentelement((ArgumentElement) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Abstract_argumentsPackage.DERIVED_ABSTRACT_ARGUMENT__ARGUMENTELEMENT:
			setArgumentelement((ArgumentElement) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Abstract_argumentsPackage.DERIVED_ABSTRACT_ARGUMENT__ARGUMENTELEMENT:
			return argumentelement != null;
		}
		return super.eIsSet(featureID);
	}

} //DerivedAbstractArgumentImpl
