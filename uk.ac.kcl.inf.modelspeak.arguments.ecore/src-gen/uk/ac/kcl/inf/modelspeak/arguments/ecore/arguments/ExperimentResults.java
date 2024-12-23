/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ExperimentResults#getExperimentName <em>Experiment Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ExperimentResults#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getExperimentResults()
 * @model
 * @generated
 */
public interface ExperimentResults extends ArgumentElement {
	/**
	 * Returns the value of the '<em><b>Experiment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment Name</em>' attribute.
	 * @see #setExperimentName(String)
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getExperimentResults_ExperimentName()
	 * @model
	 * @generated
	 */
	String getExperimentName();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ExperimentResults#getExperimentName <em>Experiment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experiment Name</em>' attribute.
	 * @see #getExperimentName()
	 * @generated
	 */
	void setExperimentName(String value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' attribute.
	 * @see #setResults(String)
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getExperimentResults_Results()
	 * @model
	 * @generated
	 */
	String getResults();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ExperimentResults#getResults <em>Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results</em>' attribute.
	 * @see #getResults()
	 * @generated
	 */
	void setResults(String value);

} // ExperimentResults
