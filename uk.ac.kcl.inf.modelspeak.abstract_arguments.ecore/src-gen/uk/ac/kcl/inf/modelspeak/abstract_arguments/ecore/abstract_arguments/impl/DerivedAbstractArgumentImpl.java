/**
 */
package uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsPackage;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.DerivedAbstractArgument;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Abstract Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.DerivedAbstractArgumentImpl#getArgumentelement <em>Argumentelement</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.DerivedAbstractArgumentImpl#getLabel <em>Label</em>}</li>
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

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
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Abstract_argumentsPackage.DERIVED_ABSTRACT_ARGUMENT__LABEL, oldLabel, label));
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
		case Abstract_argumentsPackage.DERIVED_ABSTRACT_ARGUMENT__LABEL:
			return getLabel();
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
		case Abstract_argumentsPackage.DERIVED_ABSTRACT_ARGUMENT__LABEL:
			setLabel((String) newValue);
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
		case Abstract_argumentsPackage.DERIVED_ABSTRACT_ARGUMENT__LABEL:
			setLabel(LABEL_EDEFAULT);
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
		case Abstract_argumentsPackage.DERIVED_ABSTRACT_ARGUMENT__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //DerivedAbstractArgumentImpl
