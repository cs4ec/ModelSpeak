/**
 * generated by Xtext 2.35.0
 */
package org.xtext.example.modellingDialogue.theoryStore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.modellingDialogue.theoryStore.Experiment#getModel <em>Model</em>}</li>
 *   <li>{@link org.xtext.example.modellingDialogue.theoryStore.Experiment#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.modellingDialogue.theoryStore.TheoryStorePackage#getExperiment()
 * @model
 * @generated
 */
public interface Experiment extends Element
{
  /**
   * Returns the value of the '<em><b>Model</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.modellingDialogue.theoryStore.Model}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' reference list.
   * @see org.xtext.example.modellingDialogue.theoryStore.TheoryStorePackage#getExperiment_Model()
   * @model
   * @generated
   */
  EList<Model> getModel();

  /**
   * Returns the value of the '<em><b>Requirements</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.modellingDialogue.theoryStore.Requirement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements</em>' reference list.
   * @see org.xtext.example.modellingDialogue.theoryStore.TheoryStorePackage#getExperiment_Requirements()
   * @model
   * @generated
   */
  EList<Requirement> getRequirements();

} // Experiment