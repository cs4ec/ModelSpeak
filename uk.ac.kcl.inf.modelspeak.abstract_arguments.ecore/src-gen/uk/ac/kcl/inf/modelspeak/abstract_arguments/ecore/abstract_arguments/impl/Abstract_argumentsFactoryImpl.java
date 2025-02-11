/**
 */
package uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Abstract_argumentsFactoryImpl extends EFactoryImpl implements Abstract_argumentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Abstract_argumentsFactory init() {
		try {
			Abstract_argumentsFactory theAbstract_argumentsFactory = (Abstract_argumentsFactory) EPackage.Registry.INSTANCE
					.getEFactory(Abstract_argumentsPackage.eNS_URI);
			if (theAbstract_argumentsFactory != null) {
				return theAbstract_argumentsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Abstract_argumentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstract_argumentsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK:
			return createAbstractArgumentFramework();
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_ATTACK:
			return createAbstractArgumentAttack();
		case Abstract_argumentsPackage.VIRTUAL_ABSTRACT_ARGUMENT:
			return createVirtualAbstractArgument();
		case Abstract_argumentsPackage.DERIVED_ABSTRACT_ARGUMENT:
			return createDerivedAbstractArgument();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractArgumentFramework createAbstractArgumentFramework() {
		AbstractArgumentFrameworkImpl abstractArgumentFramework = new AbstractArgumentFrameworkImpl();
		return abstractArgumentFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractArgumentAttack createAbstractArgumentAttack() {
		AbstractArgumentAttackImpl abstractArgumentAttack = new AbstractArgumentAttackImpl();
		return abstractArgumentAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualAbstractArgument createVirtualAbstractArgument() {
		VirtualAbstractArgumentImpl virtualAbstractArgument = new VirtualAbstractArgumentImpl();
		return virtualAbstractArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedAbstractArgument createDerivedAbstractArgument() {
		DerivedAbstractArgumentImpl derivedAbstractArgument = new DerivedAbstractArgumentImpl();
		return derivedAbstractArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstract_argumentsPackage getAbstract_argumentsPackage() {
		return (Abstract_argumentsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Abstract_argumentsPackage getPackage() {
		return Abstract_argumentsPackage.eINSTANCE;
	}

} //Abstract_argumentsFactoryImpl
