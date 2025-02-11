/**
 */
package uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Argument Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework#getArguments <em>Arguments</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework#getArgumentgraph <em>Argumentgraph</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsPackage#getAbstractArgumentFramework()
 * @model
 * @generated
 */
public interface AbstractArgumentFramework extends EObject {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsPackage#getAbstractArgumentFramework_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractArgument> getArguments();

	/**
	 * Returns the value of the '<em><b>Attacks</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacks</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsPackage#getAbstractArgumentFramework_Attacks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractArgumentAttack> getAttacks();

	/**
	 * Returns the value of the '<em><b>Argumentgraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argumentgraph</em>' reference.
	 * @see #setArgumentgraph(ArgumentGraph)
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsPackage#getAbstractArgumentFramework_Argumentgraph()
	 * @model required="true"
	 * @generated
	 */
	ArgumentGraph getArgumentgraph();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework#getArgumentgraph <em>Argumentgraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argumentgraph</em>' reference.
	 * @see #getArgumentgraph()
	 * @generated
	 */
	void setArgumentgraph(ArgumentGraph value);

} // AbstractArgumentFramework
