/**
 */
package arguments.impl;

import arguments.ArgumentsPackage;
import arguments.MechanismExplainsEffect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mechanism Explains Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arguments.impl.MechanismExplainsEffectImpl#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link arguments.impl.MechanismExplainsEffectImpl#getExplainedEffect <em>Explained Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MechanismExplainsEffectImpl extends ArgumentElementImpl implements MechanismExplainsEffect {
	/**
	 * The default value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final String MECHANISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected String mechanism = MECHANISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getExplainedEffect() <em>Explained Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplainedEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPLAINED_EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExplainedEffect() <em>Explained Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplainedEffect()
	 * @generated
	 * @ordered
	 */
	protected String explainedEffect = EXPLAINED_EFFECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MechanismExplainsEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentsPackage.Literals.MECHANISM_EXPLAINS_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMechanism() {
		return mechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMechanism(String newMechanism) {
		String oldMechanism = mechanism;
		mechanism = newMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.MECHANISM_EXPLAINS_EFFECT__MECHANISM,
					oldMechanism, mechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExplainedEffect() {
		return explainedEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExplainedEffect(String newExplainedEffect) {
		String oldExplainedEffect = explainedEffect;
		explainedEffect = newExplainedEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArgumentsPackage.MECHANISM_EXPLAINS_EFFECT__EXPLAINED_EFFECT, oldExplainedEffect, explainedEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArgumentsPackage.MECHANISM_EXPLAINS_EFFECT__MECHANISM:
			return getMechanism();
		case ArgumentsPackage.MECHANISM_EXPLAINS_EFFECT__EXPLAINED_EFFECT:
			return getExplainedEffect();
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
		case ArgumentsPackage.MECHANISM_EXPLAINS_EFFECT__MECHANISM:
			setMechanism((String) newValue);
			return;
		case ArgumentsPackage.MECHANISM_EXPLAINS_EFFECT__EXPLAINED_EFFECT:
			setExplainedEffect((String) newValue);
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
		case ArgumentsPackage.MECHANISM_EXPLAINS_EFFECT__MECHANISM:
			setMechanism(MECHANISM_EDEFAULT);
			return;
		case ArgumentsPackage.MECHANISM_EXPLAINS_EFFECT__EXPLAINED_EFFECT:
			setExplainedEffect(EXPLAINED_EFFECT_EDEFAULT);
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
		case ArgumentsPackage.MECHANISM_EXPLAINS_EFFECT__MECHANISM:
			return MECHANISM_EDEFAULT == null ? mechanism != null : !MECHANISM_EDEFAULT.equals(mechanism);
		case ArgumentsPackage.MECHANISM_EXPLAINS_EFFECT__EXPLAINED_EFFECT:
			return EXPLAINED_EFFECT_EDEFAULT == null ? explainedEffect != null
					: !EXPLAINED_EFFECT_EDEFAULT.equals(explainedEffect);
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
		result.append(" (mechanism: ");
		result.append(mechanism);
		result.append(", explainedEffect: ");
		result.append(explainedEffect);
		result.append(')');
		return result.toString();
	}

} //MechanismExplainsEffectImpl
