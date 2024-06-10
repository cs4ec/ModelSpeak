/**
 * generated by Xtext 2.35.0
 */
package org.xtext.example.mod.modellingSpeak;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mod.modellingSpeak.SupportModel#getModel <em>Model</em>}</li>
 *   <li>{@link org.xtext.example.mod.modellingSpeak.SupportModel#getTheory <em>Theory</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mod.modellingSpeak.ModellingSpeakPackage#getSupportModel()
 * @model
 * @generated
 */
public interface SupportModel extends Move
{
  /**
   * Returns the value of the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' reference.
   * @see #setModel(Model)
   * @see org.xtext.example.mod.modellingSpeak.ModellingSpeakPackage#getSupportModel_Model()
   * @model
   * @generated
   */
  Model getModel();

  /**
   * Sets the value of the '{@link org.xtext.example.mod.modellingSpeak.SupportModel#getModel <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' reference.
   * @see #getModel()
   * @generated
   */
  void setModel(Model value);

  /**
   * Returns the value of the '<em><b>Theory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Theory</em>' containment reference.
   * @see #setTheory(Theory)
   * @see org.xtext.example.mod.modellingSpeak.ModellingSpeakPackage#getSupportModel_Theory()
   * @model containment="true"
   * @generated
   */
  Theory getTheory();

  /**
   * Sets the value of the '{@link org.xtext.example.mod.modellingSpeak.SupportModel#getTheory <em>Theory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Theory</em>' containment reference.
   * @see #getTheory()
   * @generated
   */
  void setTheory(Theory value);

} // SupportModel