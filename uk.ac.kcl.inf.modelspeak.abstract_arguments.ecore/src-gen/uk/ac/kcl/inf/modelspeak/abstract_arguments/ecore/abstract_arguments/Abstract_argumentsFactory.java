/**
 */
package uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsPackage
 * @generated
 */
public interface Abstract_argumentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Abstract_argumentsFactory eINSTANCE = uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.Abstract_argumentsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Abstract Argument Framework</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Argument Framework</em>'.
	 * @generated
	 */
	AbstractArgumentFramework createAbstractArgumentFramework();

	/**
	 * Returns a new object of class '<em>Abstract Argument Attack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Argument Attack</em>'.
	 * @generated
	 */
	AbstractArgumentAttack createAbstractArgumentAttack();

	/**
	 * Returns a new object of class '<em>Virtual Abstract Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Abstract Argument</em>'.
	 * @generated
	 */
	VirtualAbstractArgument createVirtualAbstractArgument();

	/**
	 * Returns a new object of class '<em>Derived Abstract Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Abstract Argument</em>'.
	 * @generated
	 */
	DerivedAbstractArgument createDerivedAbstractArgument();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Abstract_argumentsPackage getAbstract_argumentsPackage();

} //Abstract_argumentsFactory
