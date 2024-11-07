/**
 */
package uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments;

import arguments.ArgumentElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Abstract Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.DerivedAbstractArgument#getArgumentelement <em>Argumentelement</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsPackage#getDerivedAbstractArgument()
 * @model
 * @generated
 */
public interface DerivedAbstractArgument extends AbstractArgument {
	/**
	 * Returns the value of the '<em><b>Argumentelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argumentelement</em>' reference.
	 * @see #setArgumentelement(ArgumentElement)
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsPackage#getDerivedAbstractArgument_Argumentelement()
	 * @model required="true"
	 * @generated
	 */
	ArgumentElement getArgumentelement();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.DerivedAbstractArgument#getArgumentelement <em>Argumentelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argumentelement</em>' reference.
	 * @see #getArgumentelement()
	 * @generated
	 */
	void setArgumentelement(ArgumentElement value);

} // DerivedAbstractArgument
