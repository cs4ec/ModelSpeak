/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Matches Data Over Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ModelMatchesDataOverTimeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ModelMatchesDataOverTimeImpl#getDataOverTime <em>Data Over Time</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ModelMatchesDataOverTimeImpl#getMechanism <em>Mechanism</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelMatchesDataOverTimeImpl extends ArgumentElementImpl implements ModelMatchesDataOverTime {
	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataOverTime() <em>Data Over Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOverTime()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_OVER_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataOverTime() <em>Data Over Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOverTime()
	 * @generated
	 * @ordered
	 */
	protected String dataOverTime = DATA_OVER_TIME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelMatchesDataOverTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentsPackage.Literals.MODEL_MATCHES_DATA_OVER_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__MODEL,
					oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataOverTime() {
		return dataOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataOverTime(String newDataOverTime) {
		String oldDataOverTime = dataOverTime;
		dataOverTime = newDataOverTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__DATA_OVER_TIME, oldDataOverTime, dataOverTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__MECHANISM, oldMechanism, mechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__MODEL:
			return getModel();
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__DATA_OVER_TIME:
			return getDataOverTime();
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__MECHANISM:
			return getMechanism();
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
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__MODEL:
			setModel((String) newValue);
			return;
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__DATA_OVER_TIME:
			setDataOverTime((String) newValue);
			return;
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__MECHANISM:
			setMechanism((String) newValue);
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
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__MODEL:
			setModel(MODEL_EDEFAULT);
			return;
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__DATA_OVER_TIME:
			setDataOverTime(DATA_OVER_TIME_EDEFAULT);
			return;
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__MECHANISM:
			setMechanism(MECHANISM_EDEFAULT);
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
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__MODEL:
			return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__DATA_OVER_TIME:
			return DATA_OVER_TIME_EDEFAULT == null ? dataOverTime != null
					: !DATA_OVER_TIME_EDEFAULT.equals(dataOverTime);
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME__MECHANISM:
			return MECHANISM_EDEFAULT == null ? mechanism != null : !MECHANISM_EDEFAULT.equals(mechanism);
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
		result.append(" (model: ");
		result.append(model);
		result.append(", dataOverTime: ");
		result.append(dataOverTime);
		result.append(", mechanism: ");
		result.append(mechanism);
		result.append(')');
		return result.toString();
	}

} //ModelMatchesDataOverTimeImpl
