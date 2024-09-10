/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ExperimentResults;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment Results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ExperimentResultsImpl#getExperimentName <em>Experiment Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ExperimentResultsImpl#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentResultsImpl extends ArgumentElementImpl implements ExperimentResults {
	/**
	 * The default value of the '{@link #getExperimentName() <em>Experiment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimentName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPERIMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExperimentName() <em>Experiment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimentName()
	 * @generated
	 * @ordered
	 */
	protected String experimentName = EXPERIMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResults() <em>Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected String results = RESULTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentResultsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentsPackage.Literals.EXPERIMENT_RESULTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExperimentName() {
		return experimentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperimentName(String newExperimentName) {
		String oldExperimentName = experimentName;
		experimentName = newExperimentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.EXPERIMENT_RESULTS__EXPERIMENT_NAME,
					oldExperimentName, experimentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResults() {
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResults(String newResults) {
		String oldResults = results;
		results = newResults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.EXPERIMENT_RESULTS__RESULTS,
					oldResults, results));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArgumentsPackage.EXPERIMENT_RESULTS__EXPERIMENT_NAME:
			return getExperimentName();
		case ArgumentsPackage.EXPERIMENT_RESULTS__RESULTS:
			return getResults();
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
		case ArgumentsPackage.EXPERIMENT_RESULTS__EXPERIMENT_NAME:
			setExperimentName((String) newValue);
			return;
		case ArgumentsPackage.EXPERIMENT_RESULTS__RESULTS:
			setResults((String) newValue);
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
		case ArgumentsPackage.EXPERIMENT_RESULTS__EXPERIMENT_NAME:
			setExperimentName(EXPERIMENT_NAME_EDEFAULT);
			return;
		case ArgumentsPackage.EXPERIMENT_RESULTS__RESULTS:
			setResults(RESULTS_EDEFAULT);
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
		case ArgumentsPackage.EXPERIMENT_RESULTS__EXPERIMENT_NAME:
			return EXPERIMENT_NAME_EDEFAULT == null ? experimentName != null
					: !EXPERIMENT_NAME_EDEFAULT.equals(experimentName);
		case ArgumentsPackage.EXPERIMENT_RESULTS__RESULTS:
			return RESULTS_EDEFAULT == null ? results != null : !RESULTS_EDEFAULT.equals(results);
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
		result.append(" (experimentName: ");
		result.append(experimentName);
		result.append(", results: ");
		result.append(results);
		result.append(')');
		return result.toString();
	}

} //ExperimentResultsImpl
