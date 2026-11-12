/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Element Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getWarrant <em>Warrant</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getClaim <em>Claim</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getArgumentElementRelation()
 * @model abstract="true"
 * @generated
 */
public interface ArgumentElementRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' reference.
	 * @see #setEvidence(ArgumentElement)
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getArgumentElementRelation_Evidence()
	 * @model required="true"
	 * @generated
	 */
	ArgumentElement getEvidence();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getEvidence <em>Evidence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence</em>' reference.
	 * @see #getEvidence()
	 * @generated
	 */
	void setEvidence(ArgumentElement value);

	/**
	 * Returns the value of the '<em><b>Warrant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warrant</em>' reference.
	 * @see #setWarrant(ArgumentElement)
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getArgumentElementRelation_Warrant()
	 * @model required="true"
	 * @generated
	 */
	ArgumentElement getWarrant();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getWarrant <em>Warrant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warrant</em>' reference.
	 * @see #getWarrant()
	 * @generated
	 */
	void setWarrant(ArgumentElement value);

	/**
	 * Returns the value of the '<em><b>Claim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim</em>' reference.
	 * @see #setClaim(ArgumentElement)
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getArgumentElementRelation_Claim()
	 * @model required="true"
	 * @generated
	 */
	ArgumentElement getClaim();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getClaim <em>Claim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim</em>' reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(ArgumentElement value);

} // ArgumentElementRelation
