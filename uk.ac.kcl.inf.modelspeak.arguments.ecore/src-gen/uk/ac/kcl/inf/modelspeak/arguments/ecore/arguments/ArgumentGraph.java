/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph#getArgumentElements <em>Argument Elements</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getArgumentGraph()
 * @model
 * @generated
 */
public interface ArgumentGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Argument Elements</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Elements</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getArgumentGraph_ArgumentElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentElement> getArgumentElements();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#getArgumentGraph_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentElementRelation> getRelations();

} // ArgumentGraph
