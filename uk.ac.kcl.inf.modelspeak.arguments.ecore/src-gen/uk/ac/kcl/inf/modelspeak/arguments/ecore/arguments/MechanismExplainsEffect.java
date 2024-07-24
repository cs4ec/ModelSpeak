/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mechanism Explains Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect#getExplainedEffect <em>Explained Effect</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getMechanismExplainsEffect()
 * @model
 * @generated
 */
public interface MechanismExplainsEffect extends ArgumentElement {
	/**
	 * Returns the value of the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanism</em>' attribute.
	 * @see #setMechanism(String)
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getMechanismExplainsEffect_Mechanism()
	 * @model
	 * @generated
	 */
	String getMechanism();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect#getMechanism <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanism</em>' attribute.
	 * @see #getMechanism()
	 * @generated
	 */
	void setMechanism(String value);

	/**
	 * Returns the value of the '<em><b>Explained Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explained Effect</em>' attribute.
	 * @see #setExplainedEffect(String)
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getMechanismExplainsEffect_ExplainedEffect()
	 * @model
	 * @generated
	 */
	String getExplainedEffect();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect#getExplainedEffect <em>Explained Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explained Effect</em>' attribute.
	 * @see #getExplainedEffect()
	 * @generated
	 */
	void setExplainedEffect(String value);

} // MechanismExplainsEffect
