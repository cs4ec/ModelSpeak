/**
 */
package arguments;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Mechanism Warrant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arguments.SimulationMechanismWarrant#getOutputDataOverTime <em>Output Data Over Time</em>}</li>
 *   <li>{@link arguments.SimulationMechanismWarrant#getExplainedEffect <em>Explained Effect</em>}</li>
 *   <li>{@link arguments.SimulationMechanismWarrant#getGeneratingRequirement <em>Generating Requirement</em>}</li>
 * </ul>
 *
 * @see arguments.ArgumentsPackage#getSimulationMechanismWarrant()
 * @model
 * @generated
 */
public interface SimulationMechanismWarrant extends ArgumentElement {
	/**
	 * Returns the value of the '<em><b>Output Data Over Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data Over Time</em>' attribute.
	 * @see #setOutputDataOverTime(String)
	 * @see arguments.ArgumentsPackage#getSimulationMechanismWarrant_OutputDataOverTime()
	 * @model
	 * @generated
	 */
	String getOutputDataOverTime();

	/**
	 * Sets the value of the '{@link arguments.SimulationMechanismWarrant#getOutputDataOverTime <em>Output Data Over Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Data Over Time</em>' attribute.
	 * @see #getOutputDataOverTime()
	 * @generated
	 */
	void setOutputDataOverTime(String value);

	/**
	 * Returns the value of the '<em><b>Explained Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explained Effect</em>' attribute.
	 * @see #setExplainedEffect(String)
	 * @see arguments.ArgumentsPackage#getSimulationMechanismWarrant_ExplainedEffect()
	 * @model
	 * @generated
	 */
	String getExplainedEffect();

	/**
	 * Sets the value of the '{@link arguments.SimulationMechanismWarrant#getExplainedEffect <em>Explained Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explained Effect</em>' attribute.
	 * @see #getExplainedEffect()
	 * @generated
	 */
	void setExplainedEffect(String value);

	/**
	 * Returns the value of the '<em><b>Generating Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Requirement</em>' attribute.
	 * @see #setGeneratingRequirement(String)
	 * @see arguments.ArgumentsPackage#getSimulationMechanismWarrant_GeneratingRequirement()
	 * @model
	 * @generated
	 */
	String getGeneratingRequirement();

	/**
	 * Sets the value of the '{@link arguments.SimulationMechanismWarrant#getGeneratingRequirement <em>Generating Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generating Requirement</em>' attribute.
	 * @see #getGeneratingRequirement()
	 * @generated
	 */
	void setGeneratingRequirement(String value);

} // SimulationMechanismWarrant
