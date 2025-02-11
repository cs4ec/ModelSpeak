/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literature Evidence For Data And Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidenceForDataAndEffect#getObservedDataOverTime <em>Observed Data Over Time</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidenceForDataAndEffect#getDescribedEffect <em>Described Effect</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getLiteratureEvidenceForDataAndEffect()
 * @model
 * @generated
 */
public interface LiteratureEvidenceForDataAndEffect extends LiteratureEvidence {
	/**
	 * Returns the value of the '<em><b>Observed Data Over Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed Data Over Time</em>' attribute.
	 * @see #setObservedDataOverTime(String)
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getLiteratureEvidenceForDataAndEffect_ObservedDataOverTime()
	 * @model
	 * @generated
	 */
	String getObservedDataOverTime();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidenceForDataAndEffect#getObservedDataOverTime <em>Observed Data Over Time</em>}' attribute.
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
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getLiteratureEvidenceForDataAndEffect_DescribedEffect()
	 * @model
	 * @generated
	 */
	String getDescribedEffect();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidenceForDataAndEffect#getDescribedEffect <em>Described Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Described Effect</em>' attribute.
	 * @see #getDescribedEffect()
	 * @generated
	 */
	void setDescribedEffect(String value);

} // LiteratureEvidenceForDataAndEffect
