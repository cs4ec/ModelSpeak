/**
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.theoryStoreLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.theoryStoreLang.Element#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.theoryStoreLang.Element#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStoreLangPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStoreLangPackage#getElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.theoryStoreLang.Element#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(String)
   * @see uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStoreLangPackage#getElement_Content()
   * @model
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.theoryStoreLang.Element#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

} // Element
