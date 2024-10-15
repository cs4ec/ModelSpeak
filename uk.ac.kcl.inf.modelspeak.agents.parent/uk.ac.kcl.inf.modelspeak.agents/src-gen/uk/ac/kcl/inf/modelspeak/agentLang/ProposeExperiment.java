/**
 * generated by Xtext 2.36.0
 */
package uk.ac.kcl.inf.modelspeak.agentLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propose Experiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.ProposeExperiment#getModel <em>Model</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.ProposeExperiment#getExperiment <em>Experiment</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.ProposeExperiment#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage#getProposeExperiment()
 * @model
 * @generated
 */
public interface ProposeExperiment extends Move
{
  /**
   * Returns the value of the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' reference.
   * @see #setModel(Model)
   * @see uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage#getProposeExperiment_Model()
   * @model
   * @generated
   */
  Model getModel();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.agentLang.ProposeExperiment#getModel <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' reference.
   * @see #getModel()
   * @generated
   */
  void setModel(Model value);

  /**
   * Returns the value of the '<em><b>Experiment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Experiment</em>' containment reference.
   * @see #setExperiment(Experiment)
   * @see uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage#getProposeExperiment_Experiment()
   * @model containment="true"
   * @generated
   */
  Experiment getExperiment();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.agentLang.ProposeExperiment#getExperiment <em>Experiment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Experiment</em>' containment reference.
   * @see #getExperiment()
   * @generated
   */
  void setExperiment(Experiment value);

  /**
   * Returns the value of the '<em><b>Requirement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirement</em>' reference.
   * @see #setRequirement(Requirement)
   * @see uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage#getProposeExperiment_Requirement()
   * @model
   * @generated
   */
  Requirement getRequirement();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.agentLang.ProposeExperiment#getRequirement <em>Requirement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requirement</em>' reference.
   * @see #getRequirement()
   * @generated
   */
  void setRequirement(Requirement value);

} // ProposeExperiment
