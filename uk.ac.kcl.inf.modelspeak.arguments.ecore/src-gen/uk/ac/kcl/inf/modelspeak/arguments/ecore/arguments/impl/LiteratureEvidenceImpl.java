/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literature Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.LiteratureEvidenceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.LiteratureEvidenceImpl#getObservedDataOverTime <em>Observed Data Over Time</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.LiteratureEvidenceImpl#getDescribedEffect <em>Described Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteratureEvidenceImpl extends ArgumentElementImpl implements LiteratureEvidence {
	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected String reference = REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getObservedDataOverTime() <em>Observed Data Over Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedDataOverTime()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVED_DATA_OVER_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservedDataOverTime() <em>Observed Data Over Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedDataOverTime()
	 * @generated
	 * @ordered
	 */
	protected String observedDataOverTime = OBSERVED_DATA_OVER_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescribedEffect() <em>Described Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIBED_EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescribedEffect() <em>Described Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedEffect()
	 * @generated
	 * @ordered
	 */
	protected String describedEffect = DESCRIBED_EFFECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteratureEvidenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentsPackage.Literals.LITERATURE_EVIDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReference(String newReference) {
		String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.LITERATURE_EVIDENCE__REFERENCE,
					oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObservedDataOverTime() {
		return observedDataOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservedDataOverTime(String newObservedDataOverTime) {
		String oldObservedDataOverTime = observedDataOverTime;
		observedDataOverTime = newObservedDataOverTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArgumentsPackage.LITERATURE_EVIDENCE__OBSERVED_DATA_OVER_TIME, oldObservedDataOverTime,
					observedDataOverTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescribedEffect() {
		return describedEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescribedEffect(String newDescribedEffect) {
		String oldDescribedEffect = describedEffect;
		describedEffect = newDescribedEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArgumentsPackage.LITERATURE_EVIDENCE__DESCRIBED_EFFECT, oldDescribedEffect, describedEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArgumentsPackage.LITERATURE_EVIDENCE__REFERENCE:
			return getReference();
		case ArgumentsPackage.LITERATURE_EVIDENCE__OBSERVED_DATA_OVER_TIME:
			return getObservedDataOverTime();
		case ArgumentsPackage.LITERATURE_EVIDENCE__DESCRIBED_EFFECT:
			return getDescribedEffect();
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
		case ArgumentsPackage.LITERATURE_EVIDENCE__REFERENCE:
			setReference((String) newValue);
			return;
		case ArgumentsPackage.LITERATURE_EVIDENCE__OBSERVED_DATA_OVER_TIME:
			setObservedDataOverTime((String) newValue);
			return;
		case ArgumentsPackage.LITERATURE_EVIDENCE__DESCRIBED_EFFECT:
			setDescribedEffect((String) newValue);
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
		case ArgumentsPackage.LITERATURE_EVIDENCE__REFERENCE:
			setReference(REFERENCE_EDEFAULT);
			return;
		case ArgumentsPackage.LITERATURE_EVIDENCE__OBSERVED_DATA_OVER_TIME:
			setObservedDataOverTime(OBSERVED_DATA_OVER_TIME_EDEFAULT);
			return;
		case ArgumentsPackage.LITERATURE_EVIDENCE__DESCRIBED_EFFECT:
			setDescribedEffect(DESCRIBED_EFFECT_EDEFAULT);
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
		case ArgumentsPackage.LITERATURE_EVIDENCE__REFERENCE:
			return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
		case ArgumentsPackage.LITERATURE_EVIDENCE__OBSERVED_DATA_OVER_TIME:
			return OBSERVED_DATA_OVER_TIME_EDEFAULT == null ? observedDataOverTime != null
					: !OBSERVED_DATA_OVER_TIME_EDEFAULT.equals(observedDataOverTime);
		case ArgumentsPackage.LITERATURE_EVIDENCE__DESCRIBED_EFFECT:
			return DESCRIBED_EFFECT_EDEFAULT == null ? describedEffect != null
					: !DESCRIBED_EFFECT_EDEFAULT.equals(describedEffect);
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
		result.append(" (reference: ");
		result.append(reference);
		result.append(", observedDataOverTime: ");
		result.append(observedDataOverTime);
		result.append(", describedEffect: ");
		result.append(describedEffect);
		result.append(')');
		return result.toString();
	}

} //LiteratureEvidenceImpl
