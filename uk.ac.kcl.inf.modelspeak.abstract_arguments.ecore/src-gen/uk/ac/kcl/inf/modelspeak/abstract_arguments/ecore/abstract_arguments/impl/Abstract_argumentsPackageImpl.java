/**
 */
package uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgument;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsFactory;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsPackage;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.DerivedAbstractArgument;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.VirtualAbstractArgument;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Abstract_argumentsPackageImpl extends EPackageImpl implements Abstract_argumentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractArgumentFrameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractArgumentAttackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualAbstractArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedAbstractArgumentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Abstract_argumentsPackageImpl() {
		super(eNS_URI, Abstract_argumentsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Abstract_argumentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Abstract_argumentsPackage init() {
		if (isInited)
			return (Abstract_argumentsPackage) EPackage.Registry.INSTANCE
					.getEPackage(Abstract_argumentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAbstract_argumentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Abstract_argumentsPackageImpl theAbstract_argumentsPackage = registeredAbstract_argumentsPackage instanceof Abstract_argumentsPackageImpl
				? (Abstract_argumentsPackageImpl) registeredAbstract_argumentsPackage
				: new Abstract_argumentsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ArgumentsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAbstract_argumentsPackage.createPackageContents();

		// Initialize created meta-data
		theAbstract_argumentsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAbstract_argumentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Abstract_argumentsPackage.eNS_URI, theAbstract_argumentsPackage);
		return theAbstract_argumentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractArgumentFramework() {
		return abstractArgumentFrameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractArgumentFramework_Arguments() {
		return (EReference) abstractArgumentFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractArgumentFramework_Attacks() {
		return (EReference) abstractArgumentFrameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractArgumentFramework_Argumentgraph() {
		return (EReference) abstractArgumentFrameworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractArgument() {
		return abstractArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractArgument_Id() {
		return (EAttribute) abstractArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractArgumentAttack() {
		return abstractArgumentAttackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractArgumentAttack_Source() {
		return (EReference) abstractArgumentAttackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractArgumentAttack_Target() {
		return (EReference) abstractArgumentAttackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractArgumentAttack_Id() {
		return (EAttribute) abstractArgumentAttackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualAbstractArgument() {
		return virtualAbstractArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDerivedAbstractArgument() {
		return derivedAbstractArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDerivedAbstractArgument_Argumentelement() {
		return (EReference) derivedAbstractArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDerivedAbstractArgument_Label() {
		return (EAttribute) derivedAbstractArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstract_argumentsFactory getAbstract_argumentsFactory() {
		return (Abstract_argumentsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		abstractArgumentFrameworkEClass = createEClass(ABSTRACT_ARGUMENT_FRAMEWORK);
		createEReference(abstractArgumentFrameworkEClass, ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTS);
		createEReference(abstractArgumentFrameworkEClass, ABSTRACT_ARGUMENT_FRAMEWORK__ATTACKS);
		createEReference(abstractArgumentFrameworkEClass, ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTGRAPH);

		abstractArgumentEClass = createEClass(ABSTRACT_ARGUMENT);
		createEAttribute(abstractArgumentEClass, ABSTRACT_ARGUMENT__ID);

		abstractArgumentAttackEClass = createEClass(ABSTRACT_ARGUMENT_ATTACK);
		createEReference(abstractArgumentAttackEClass, ABSTRACT_ARGUMENT_ATTACK__SOURCE);
		createEReference(abstractArgumentAttackEClass, ABSTRACT_ARGUMENT_ATTACK__TARGET);
		createEAttribute(abstractArgumentAttackEClass, ABSTRACT_ARGUMENT_ATTACK__ID);

		virtualAbstractArgumentEClass = createEClass(VIRTUAL_ABSTRACT_ARGUMENT);

		derivedAbstractArgumentEClass = createEClass(DERIVED_ABSTRACT_ARGUMENT);
		createEReference(derivedAbstractArgumentEClass, DERIVED_ABSTRACT_ARGUMENT__ARGUMENTELEMENT);
		createEAttribute(derivedAbstractArgumentEClass, DERIVED_ABSTRACT_ARGUMENT__LABEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ArgumentsPackage theArgumentsPackage = (ArgumentsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ArgumentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		virtualAbstractArgumentEClass.getESuperTypes().add(this.getAbstractArgument());
		derivedAbstractArgumentEClass.getESuperTypes().add(this.getAbstractArgument());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractArgumentFrameworkEClass, AbstractArgumentFramework.class, "AbstractArgumentFramework",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractArgumentFramework_Arguments(), this.getAbstractArgument(), null, "arguments", null, 0,
				-1, AbstractArgumentFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractArgumentFramework_Attacks(), this.getAbstractArgumentAttack(), null, "attacks", null,
				0, -1, AbstractArgumentFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractArgumentFramework_Argumentgraph(), theArgumentsPackage.getArgumentGraph(), null,
				"argumentgraph", null, 1, 1, AbstractArgumentFramework.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractArgumentEClass, AbstractArgument.class, "AbstractArgument", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractArgument_Id(), ecorePackage.getELong(), "id", null, 0, 1, AbstractArgument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractArgumentAttackEClass, AbstractArgumentAttack.class, "AbstractArgumentAttack", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractArgumentAttack_Source(), this.getAbstractArgument(), null, "source", null, 1, 1,
				AbstractArgumentAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractArgumentAttack_Target(), this.getAbstractArgument(), null, "target", null, 1, 1,
				AbstractArgumentAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractArgumentAttack_Id(), ecorePackage.getELong(), "id", null, 0, 1,
				AbstractArgumentAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualAbstractArgumentEClass, VirtualAbstractArgument.class, "VirtualAbstractArgument",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(derivedAbstractArgumentEClass, DerivedAbstractArgument.class, "DerivedAbstractArgument",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedAbstractArgument_Argumentelement(), theArgumentsPackage.getArgumentElement(), null,
				"argumentelement", null, 1, 1, DerivedAbstractArgument.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDerivedAbstractArgument_Label(), ecorePackage.getEString(), "label", null, 0, 1,
				DerivedAbstractArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Abstract_argumentsPackageImpl
