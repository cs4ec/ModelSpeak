/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage
 * @generated
 */
public interface ArgumentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArgumentsFactory eINSTANCE = uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Argument Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Graph</em>'.
	 * @generated
	 */
	ArgumentGraph createArgumentGraph();

	/**
	 * Returns a new object of class '<em>Simulation Mechanism Warrant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulation Mechanism Warrant</em>'.
	 * @generated
	 */
	SimulationMechanismWarrant createSimulationMechanismWarrant();

	/**
	 * Returns a new object of class '<em>Standard Simulation Warrant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Simulation Warrant</em>'.
	 * @generated
	 */
	StandardSimulationWarrant createStandardSimulationWarrant();

	/**
	 * Returns a new object of class '<em>Literature Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literature Evidence</em>'.
	 * @generated
	 */
	LiteratureEvidence createLiteratureEvidence();

	/**
	 * Returns a new object of class '<em>Model Matches Data Over Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Matches Data Over Time</em>'.
	 * @generated
	 */
	ModelMatchesDataOverTime createModelMatchesDataOverTime();

	/**
	 * Returns a new object of class '<em>Mechanism Explains Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mechanism Explains Effect</em>'.
	 * @generated
	 */
	MechanismExplainsEffect createMechanismExplainsEffect();

	/**
	 * Returns a new object of class '<em>Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support</em>'.
	 * @generated
	 */
	Support createSupport();

	/**
	 * Returns a new object of class '<em>Attack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attack</em>'.
	 * @generated
	 */
	Attack createAttack();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArgumentsPackage getArgumentsPackage();

} //ArgumentsFactory
