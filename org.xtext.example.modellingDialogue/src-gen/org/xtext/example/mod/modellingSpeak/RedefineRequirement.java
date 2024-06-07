/**
 * generated by Xtext 2.35.0
 */
package org.xtext.example.mod.modellingSpeak;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redefine Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mod.modellingSpeak.RedefineRequirement#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.xtext.example.mod.modellingSpeak.RedefineRequirement#getNewRequirement <em>New Requirement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mod.modellingSpeak.ModellingSpeakPackage#getRedefineRequirement()
 * @model
 * @generated
 */
public interface RedefineRequirement extends Move
{
  /**
   * Returns the value of the '<em><b>Requirement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirement</em>' reference.
   * @see #setRequirement(Requirement)
   * @see org.xtext.example.mod.modellingSpeak.ModellingSpeakPackage#getRedefineRequirement_Requirement()
   * @model
   * @generated
   */
  Requirement getRequirement();

  /**
   * Sets the value of the '{@link org.xtext.example.mod.modellingSpeak.RedefineRequirement#getRequirement <em>Requirement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requirement</em>' reference.
   * @see #getRequirement()
   * @generated
   */
  void setRequirement(Requirement value);

  /**
   * Returns the value of the '<em><b>New Requirement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Requirement</em>' containment reference.
   * @see #setNewRequirement(Requirement)
   * @see org.xtext.example.mod.modellingSpeak.ModellingSpeakPackage#getRedefineRequirement_NewRequirement()
   * @model containment="true"
   * @generated
   */
  Requirement getNewRequirement();

  /**
   * Sets the value of the '{@link org.xtext.example.mod.modellingSpeak.RedefineRequirement#getNewRequirement <em>New Requirement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Requirement</em>' containment reference.
   * @see #getNewRequirement()
   * @generated
   */
  void setNewRequirement(Requirement value);

} // RedefineRequirement
