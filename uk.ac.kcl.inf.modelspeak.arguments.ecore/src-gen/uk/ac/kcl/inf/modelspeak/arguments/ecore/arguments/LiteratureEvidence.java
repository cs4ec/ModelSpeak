/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literature Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence#getReference <em>Reference</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence#getObservedDataOverTime <em>Observed Data Over Time</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence#getDescribedEffect <em>Described Effect</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getLiteratureEvidence()
 * @model
 * @generated
 */
public interface LiteratureEvidence extends ArgumentElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getLiteratureEvidence_Reference()
	 * @model
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Observed Data Over Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed Data Over Time</em>' attribute.
	 * @see #setObservedDataOverTime(String)
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getLiteratureEvidence_ObservedDataOverTime()
	 * @model
	 * @generated
	 */
	String getObservedDataOverTime();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence#getObservedDataOverTime <em>Observed Data Over Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Data Over Time</em>' attribute.
	 * @see #getObservedDataOverTime()
	 * @generated
	 */
	void setObservedDataOverTime(String value);

	/**
	 * Returns the value of the '<em><b>Described Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Described Effect</em>' attribute.
	 * @see #setDescribedEffect(String)
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getLiteratureEvidence_DescribedEffect()
	 * @model
	 * @generated
	 */
	String getDescribedEffect();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence#getDescribedEffect <em>Described Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Described Effect</em>' attribute.
	 * @see #getDescribedEffect()
	 * @generated
	 */
	void setDescribedEffect(String value);

} // LiteratureEvidence
