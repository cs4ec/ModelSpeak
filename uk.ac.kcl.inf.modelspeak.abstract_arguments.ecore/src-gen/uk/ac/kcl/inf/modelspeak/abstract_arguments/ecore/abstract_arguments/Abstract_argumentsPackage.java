/**
 */
package uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsFactory
 * @model kind="package"
 * @generated
 */
public interface Abstract_argumentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstract_arguments";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/abstract_arguments";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstract_arguments";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Abstract_argumentsPackage eINSTANCE = uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.Abstract_argumentsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentFrameworkImpl <em>Abstract Argument Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentFrameworkImpl
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.Abstract_argumentsPackageImpl#getAbstractArgumentFramework()
	 * @generated
	 */
	int ABSTRACT_ARGUMENT_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTS = 0;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARGUMENT_FRAMEWORK__ATTACKS = 1;

	/**
	 * The feature id for the '<em><b>Argumentgraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTGRAPH = 2;

	/**
	 * The number of structural features of the '<em>Abstract Argument Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARGUMENT_FRAMEWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Argument Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARGUMENT_FRAMEWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentImpl <em>Abstract Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentImpl
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.Abstract_argumentsPackageImpl#getAbstractArgument()
	 * @generated
	 */
	int ABSTRACT_ARGUMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARGUMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Abstract Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARGUMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentAttackImpl <em>Abstract Argument Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentAttackImpl
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.Abstract_argumentsPackageImpl#getAbstractArgumentAttack()
	 * @generated
	 */
	int ABSTRACT_ARGUMENT_ATTACK = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARGUMENT_ATTACK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARGUMENT_ATTACK__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARGUMENT_ATTACK__ID = 2;

	/**
	 * The number of structural features of the '<em>Abstract Argument Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARGUMENT_ATTACK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Argument Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARGUMENT_ATTACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.VirtualAbstractArgumentImpl <em>Virtual Abstract Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.VirtualAbstractArgumentImpl
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.Abstract_argumentsPackageImpl#getVirtualAbstractArgument()
	 * @generated
	 */
	int VIRTUAL_ABSTRACT_ARGUMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ABSTRACT_ARGUMENT__ID = ABSTRACT_ARGUMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ABSTRACT_ARGUMENT__LABEL = ABSTRACT_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Abstract Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ABSTRACT_ARGUMENT_FEATURE_COUNT = ABSTRACT_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Virtual Abstract Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ABSTRACT_ARGUMENT_OPERATION_COUNT = ABSTRACT_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.DerivedAbstractArgumentImpl <em>Derived Abstract Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.DerivedAbstractArgumentImpl
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.Abstract_argumentsPackageImpl#getDerivedAbstractArgument()
	 * @generated
	 */
	int DERIVED_ABSTRACT_ARGUMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ABSTRACT_ARGUMENT__ID = ABSTRACT_ARGUMENT__ID;

	/**
	 * The feature id for the '<em><b>Argumentelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ABSTRACT_ARGUMENT__ARGUMENTELEMENT = ABSTRACT_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Abstract Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ABSTRACT_ARGUMENT_FEATURE_COUNT = ABSTRACT_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Derived Abstract Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ABSTRACT_ARGUMENT_OPERATION_COUNT = ABSTRACT_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework <em>Abstract Argument Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Argument Framework</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework
	 * @generated
	 */
	EClass getAbstractArgumentFramework();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework#getArguments()
	 * @see #getAbstractArgumentFramework()
	 * @generated
	 */
	EReference getAbstractArgumentFramework_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework#getAttacks <em>Attacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attacks</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework#getAttacks()
	 * @see #getAbstractArgumentFramework()
	 * @generated
	 */
	EReference getAbstractArgumentFramework_Attacks();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework#getArgumentgraph <em>Argumentgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argumentgraph</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework#getArgumentgraph()
	 * @see #getAbstractArgumentFramework()
	 * @generated
	 */
	EReference getAbstractArgumentFramework_Argumentgraph();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgument <em>Abstract Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Argument</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgument
	 * @generated
	 */
	EClass getAbstractArgument();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgument#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgument#getId()
	 * @see #getAbstractArgument()
	 * @generated
	 */
	EAttribute getAbstractArgument_Id();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack <em>Abstract Argument Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Argument Attack</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack
	 * @generated
	 */
	EClass getAbstractArgumentAttack();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack#getSource()
	 * @see #getAbstractArgumentAttack()
	 * @generated
	 */
	EReference getAbstractArgumentAttack_Source();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack#getTarget()
	 * @see #getAbstractArgumentAttack()
	 * @generated
	 */
	EReference getAbstractArgumentAttack_Target();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack#getId()
	 * @see #getAbstractArgumentAttack()
	 * @generated
	 */
	EAttribute getAbstractArgumentAttack_Id();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.VirtualAbstractArgument <em>Virtual Abstract Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Abstract Argument</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.VirtualAbstractArgument
	 * @generated
	 */
	EClass getVirtualAbstractArgument();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.VirtualAbstractArgument#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.VirtualAbstractArgument#getLabel()
	 * @see #getVirtualAbstractArgument()
	 * @generated
	 */
	EAttribute getVirtualAbstractArgument_Label();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.DerivedAbstractArgument <em>Derived Abstract Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Abstract Argument</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.DerivedAbstractArgument
	 * @generated
	 */
	EClass getDerivedAbstractArgument();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.DerivedAbstractArgument#getArgumentelement <em>Argumentelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argumentelement</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.DerivedAbstractArgument#getArgumentelement()
	 * @see #getDerivedAbstractArgument()
	 * @generated
	 */
	EReference getDerivedAbstractArgument_Argumentelement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Abstract_argumentsFactory getAbstract_argumentsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentFrameworkImpl <em>Abstract Argument Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentFrameworkImpl
		 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.Abstract_argumentsPackageImpl#getAbstractArgumentFramework()
		 * @generated
		 */
		EClass ABSTRACT_ARGUMENT_FRAMEWORK = eINSTANCE.getAbstractArgumentFramework();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTS = eINSTANCE.getAbstractArgumentFramework_Arguments();

		/**
		 * The meta object literal for the '<em><b>Attacks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ARGUMENT_FRAMEWORK__ATTACKS = eINSTANCE.getAbstractArgumentFramework_Attacks();

		/**
		 * The meta object literal for the '<em><b>Argumentgraph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTGRAPH = eINSTANCE.getAbstractArgumentFramework_Argumentgraph();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentImpl <em>Abstract Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentImpl
		 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.Abstract_argumentsPackageImpl#getAbstractArgument()
		 * @generated
		 */
		EClass ABSTRACT_ARGUMENT = eINSTANCE.getAbstractArgument();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ARGUMENT__ID = eINSTANCE.getAbstractArgument_Id();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentAttackImpl <em>Abstract Argument Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentAttackImpl
		 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.Abstract_argumentsPackageImpl#getAbstractArgumentAttack()
		 * @generated
		 */
		EClass ABSTRACT_ARGUMENT_ATTACK = eINSTANCE.getAbstractArgumentAttack();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ARGUMENT_ATTACK__SOURCE = eINSTANCE.getAbstractArgumentAttack_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ARGUMENT_ATTACK__TARGET = eINSTANCE.getAbstractArgumentAttack_Target();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ARGUMENT_ATTACK__ID = eINSTANCE.getAbstractArgumentAttack_Id();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.VirtualAbstractArgumentImpl <em>Virtual Abstract Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.VirtualAbstractArgumentImpl
		 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.Abstract_argumentsPackageImpl#getVirtualAbstractArgument()
		 * @generated
		 */
		EClass VIRTUAL_ABSTRACT_ARGUMENT = eINSTANCE.getVirtualAbstractArgument();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_ABSTRACT_ARGUMENT__LABEL = eINSTANCE.getVirtualAbstractArgument_Label();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.DerivedAbstractArgumentImpl <em>Derived Abstract Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.DerivedAbstractArgumentImpl
		 * @see uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.Abstract_argumentsPackageImpl#getDerivedAbstractArgument()
		 * @generated
		 */
		EClass DERIVED_ABSTRACT_ARGUMENT = eINSTANCE.getDerivedAbstractArgument();

		/**
		 * The meta object literal for the '<em><b>Argumentelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_ABSTRACT_ARGUMENT__ARGUMENTELEMENT = eINSTANCE.getDerivedAbstractArgument_Argumentelement();

	}

} //Abstract_argumentsPackage
