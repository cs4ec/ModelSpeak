/**
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.agentLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Experiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.SupportExperiment#getExperiment <em>Experiment</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.SupportExperiment#getTheory <em>Theory</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage#getSupportExperiment()
 * @model
 * @generated
 */
public interface SupportExperiment extends Move
{
  /**
   * Returns the value of the '<em><b>Experiment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Experiment</em>' reference.
   * @see #setExperiment(Experiment)
   * @see uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage#getSupportExperiment_Experiment()
   * @model
   * @generated
   */
  Experiment getExperiment();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.agentLang.SupportExperiment#getExperiment <em>Experiment</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Experiment</em>' reference.
   * @see #getExperiment()
   * @generated
   */
  void setExperiment(Experiment value);

  /**
   * Returns the value of the '<em><b>Theory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Theory</em>' containment reference.
   * @see #setTheory(Theory)
   * @see uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage#getSupportExperiment_Theory()
   * @model containment="true"
   * @generated
   */
  Theory getTheory();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.modelspeak.agentLang.SupportExperiment#getTheory <em>Theory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Theory</em>' containment reference.
   * @see #getTheory()
   * @generated
   */
  void setTheory(Theory value);

} // SupportExperiment
