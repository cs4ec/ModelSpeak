/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Assumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelAssumption#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelAssumption#getAssumptionText <em>Assumption Text</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getModelAssumption()
 * @model
 * @generated
 */
public interface ModelAssumption extends ArgumentElement {
	/**
	 * Returns the value of the '<em><b>Assumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumption</em>' attribute.
	 * @see #setAssumption(String)
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getModelAssumption_Assumption()
	 * @model
	 * @generated
	 */
	String getAssumption();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelAssumption#getAssumption <em>Assumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assumption</em>' attribute.
	 * @see #getAssumption()
	 * @generated
	 */
	void setAssumption(String value);

	/**
	 * Returns the value of the '<em><b>Assumption Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumption Text</em>' attribute.
	 * @see #setAssumptionText(String)
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getModelAssumption_AssumptionText()
	 * @model
	 * @generated
	 */
	String getAssumptionText();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelAssumption#getAssumptionText <em>Assumption Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assumption Text</em>' attribute.
	 * @see #getAssumptionText()
	 * @generated
	 */
	void setAssumptionText(String value);

} // ModelAssumption
