/**
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.agentLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revise Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.ReviseRequirement#getModel <em>Model</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.ReviseRequirement#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.ReviseRequirement#getNewRequirement <em>New Requirement</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.ReviseRequirement#getExperiment <em>Experiment</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage#getReviseRequirement()
 * @model
 * @generated
 */
public interface ReviseRequirement extends Move
{
  /**
   * Returns the value of the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' reference.
   * @see #setModel(Model)
   * @see uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage#getReviseRequirement_Model()
   * @model
   * @generated
   */
  Model getModel();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.agentLang.ReviseRequirement#getModel <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' reference.
   * @see #getModel()
   * @generated
   */
  void setModel(Model value);

  /**
   * Returns the value of the '<em><b>Requirement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirement</em>' reference.
   * @see #setRequirement(Requirement)
   * @see uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage#getReviseRequirement_Requirement()
   * @model
   * @generated
   */
  Requirement getRequirement();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.agentLang.ReviseRequirement#getRequirement <em>Requirement</em>}' reference.
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
   * @see uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage#getReviseRequirement_NewRequirement()
   * @model containment="true"
   * @generated
   */
  Requirement getNewRequirement();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.agentLang.ReviseRequirement#getNewRequirement <em>New Requirement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Requirement</em>' containment reference.
   * @see #getNewRequirement()
   * @generated
   */
  void setNewRequirement(Requirement value);

  /**
   * Returns the value of the '<em><b>Experiment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Experiment</em>' reference.
   * @see #setExperiment(Experiment)
   * @see uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage#getReviseRequirement_Experiment()
   * @model
   * @generated
   */
  Experiment getExperiment();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.agentLang.ReviseRequirement#getExperiment <em>Experiment</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Experiment</em>' reference.
   * @see #getExperiment()
   * @generated
   */
  void setExperiment(Experiment value);

} // ReviseRequirement
