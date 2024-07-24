/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.SimulationMechanismWarrant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Mechanism Warrant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.SimulationMechanismWarrantImpl#getOutputDataOverTime <em>Output Data Over Time</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.SimulationMechanismWarrantImpl#getExplainedEffect <em>Explained Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationMechanismWarrantImpl extends ArgumentElementImpl implements SimulationMechanismWarrant {
	/**
	 * The default value of the '{@link #getOutputDataOverTime() <em>Output Data Over Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDataOverTime()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_DATA_OVER_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputDataOverTime() <em>Output Data Over Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDataOverTime()
	 * @generated
	 * @ordered
	 */
	protected String outputDataOverTime = OUTPUT_DATA_OVER_TIME_EDEFAULT;

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
	protected SimulationMechanismWarrantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentsPackage.Literals.SIMULATION_MECHANISM_WARRANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputDataOverTime() {
		return outputDataOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputDataOverTime(String newOutputDataOverTime) {
		String oldOutputDataOverTime = outputDataOverTime;
		outputDataOverTime = newOutputDataOverTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArgumentsPackage.SIMULATION_MECHANISM_WARRANT__OUTPUT_DATA_OVER_TIME, oldOutputDataOverTime,
					outputDataOverTime));
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
					ArgumentsPackage.SIMULATION_MECHANISM_WARRANT__EXPLAINED_EFFECT, oldExplainedEffect,
					explainedEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArgumentsPackage.SIMULATION_MECHANISM_WARRANT__OUTPUT_DATA_OVER_TIME:
			return getOutputDataOverTime();
		case ArgumentsPackage.SIMULATION_MECHANISM_WARRANT__EXPLAINED_EFFECT:
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
		case ArgumentsPackage.SIMULATION_MECHANISM_WARRANT__OUTPUT_DATA_OVER_TIME:
			setOutputDataOverTime((String) newValue);
			return;
		case ArgumentsPackage.SIMULATION_MECHANISM_WARRANT__EXPLAINED_EFFECT:
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
		case ArgumentsPackage.SIMULATION_MECHANISM_WARRANT__OUTPUT_DATA_OVER_TIME:
			setOutputDataOverTime(OUTPUT_DATA_OVER_TIME_EDEFAULT);
			return;
		case ArgumentsPackage.SIMULATION_MECHANISM_WARRANT__EXPLAINED_EFFECT:
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
		case ArgumentsPackage.SIMULATION_MECHANISM_WARRANT__OUTPUT_DATA_OVER_TIME:
			return OUTPUT_DATA_OVER_TIME_EDEFAULT == null ? outputDataOverTime != null
					: !OUTPUT_DATA_OVER_TIME_EDEFAULT.equals(outputDataOverTime);
		case ArgumentsPackage.SIMULATION_MECHANISM_WARRANT__EXPLAINED_EFFECT:
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
		result.append(" (outputDataOverTime: ");
		result.append(outputDataOverTime);
		result.append(", explainedEffect: ");
		result.append(explainedEffect);
		result.append(')');
		return result.toString();
	}

} //SimulationMechanismWarrantImpl
