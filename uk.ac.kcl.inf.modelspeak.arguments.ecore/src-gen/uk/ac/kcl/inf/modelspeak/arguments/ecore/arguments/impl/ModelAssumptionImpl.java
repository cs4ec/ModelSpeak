/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelAssumption;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Assumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ModelAssumptionImpl#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ModelAssumptionImpl#getAssumptionText <em>Assumption Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelAssumptionImpl extends ArgumentElementImpl implements ModelAssumption {
	/**
	 * The default value of the '{@link #getAssumption() <em>Assumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumption()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSUMPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssumption() <em>Assumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumption()
	 * @generated
	 * @ordered
	 */
	protected String assumption = ASSUMPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssumptionText() <em>Assumption Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSUMPTION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssumptionText() <em>Assumption Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptionText()
	 * @generated
	 * @ordered
	 */
	protected String assumptionText = ASSUMPTION_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelAssumptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentsPackage.Literals.MODEL_ASSUMPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssumption() {
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssumption(String newAssumption) {
		String oldAssumption = assumption;
		assumption = newAssumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.MODEL_ASSUMPTION__ASSUMPTION,
					oldAssumption, assumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssumptionText() {
		return assumptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssumptionText(String newAssumptionText) {
		String oldAssumptionText = assumptionText;
		assumptionText = newAssumptionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.MODEL_ASSUMPTION__ASSUMPTION_TEXT,
					oldAssumptionText, assumptionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArgumentsPackage.MODEL_ASSUMPTION__ASSUMPTION:
			return getAssumption();
		case ArgumentsPackage.MODEL_ASSUMPTION__ASSUMPTION_TEXT:
			return getAssumptionText();
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
		case ArgumentsPackage.MODEL_ASSUMPTION__ASSUMPTION:
			setAssumption((String) newValue);
			return;
		case ArgumentsPackage.MODEL_ASSUMPTION__ASSUMPTION_TEXT:
			setAssumptionText((String) newValue);
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
		case ArgumentsPackage.MODEL_ASSUMPTION__ASSUMPTION:
			setAssumption(ASSUMPTION_EDEFAULT);
			return;
		case ArgumentsPackage.MODEL_ASSUMPTION__ASSUMPTION_TEXT:
			setAssumptionText(ASSUMPTION_TEXT_EDEFAULT);
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
		case ArgumentsPackage.MODEL_ASSUMPTION__ASSUMPTION:
			return ASSUMPTION_EDEFAULT == null ? assumption != null : !ASSUMPTION_EDEFAULT.equals(assumption);
		case ArgumentsPackage.MODEL_ASSUMPTION__ASSUMPTION_TEXT:
			return ASSUMPTION_TEXT_EDEFAULT == null ? assumptionText != null
					: !ASSUMPTION_TEXT_EDEFAULT.equals(assumptionText);
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
		result.append(" (assumption: ");
		result.append(assumption);
		result.append(", assumptionText: ");
		result.append(assumptionText);
		result.append(')');
		return result.toString();
	}

} //ModelAssumptionImpl
