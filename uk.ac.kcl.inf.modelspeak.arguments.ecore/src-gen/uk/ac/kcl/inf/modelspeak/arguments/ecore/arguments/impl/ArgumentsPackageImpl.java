/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElement;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsFactory;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.Attack;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ExperimentResults;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidenceForDataAndEffect;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelInvalidClaim;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.SimulationMechanismWarrant;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.StandardSimulationWarrant;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.Support;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentsPackageImpl extends EPackageImpl implements ArgumentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentElementRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationMechanismWarrantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardSimulationWarrantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literatureEvidenceForDataAndEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelMatchesDataOverTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mechanismExplainsEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literatureEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelInvalidClaimEClass = null;

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
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArgumentsPackageImpl() {
		super(eNS_URI, ArgumentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArgumentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArgumentsPackage init() {
		if (isInited)
			return (ArgumentsPackage) EPackage.Registry.INSTANCE.getEPackage(ArgumentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArgumentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArgumentsPackageImpl theArgumentsPackage = registeredArgumentsPackage instanceof ArgumentsPackageImpl
				? (ArgumentsPackageImpl) registeredArgumentsPackage
				: new ArgumentsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theArgumentsPackage.createPackageContents();

		// Initialize created meta-data
		theArgumentsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArgumentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArgumentsPackage.eNS_URI, theArgumentsPackage);
		return theArgumentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArgumentElement() {
		return argumentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArgumentGraph() {
		return argumentGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArgumentGraph_ArgumentElements() {
		return (EReference) argumentGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArgumentGraph_Relations() {
		return (EReference) argumentGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArgumentElementRelation() {
		return argumentElementRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArgumentElementRelation_Evidence() {
		return (EReference) argumentElementRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArgumentElementRelation_Warrant() {
		return (EReference) argumentElementRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArgumentElementRelation_Claim() {
		return (EReference) argumentElementRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArgumentElementRelation_RebuttalConditions() {
		return (EReference) argumentElementRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimulationMechanismWarrant() {
		return simulationMechanismWarrantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimulationMechanismWarrant_OutputDataOverTime() {
		return (EAttribute) simulationMechanismWarrantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimulationMechanismWarrant_ExplainedEffect() {
		return (EAttribute) simulationMechanismWarrantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimulationMechanismWarrant_GeneratingRequirement() {
		return (EAttribute) simulationMechanismWarrantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardSimulationWarrant() {
		return standardSimulationWarrantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteratureEvidenceForDataAndEffect() {
		return literatureEvidenceForDataAndEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteratureEvidenceForDataAndEffect_ObservedDataOverTime() {
		return (EAttribute) literatureEvidenceForDataAndEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteratureEvidenceForDataAndEffect_DescribedEffect() {
		return (EAttribute) literatureEvidenceForDataAndEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelMatchesDataOverTime() {
		return modelMatchesDataOverTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelMatchesDataOverTime_Model() {
		return (EAttribute) modelMatchesDataOverTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelMatchesDataOverTime_DataOverTime() {
		return (EAttribute) modelMatchesDataOverTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelMatchesDataOverTime_Mechanism() {
		return (EAttribute) modelMatchesDataOverTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMechanismExplainsEffect() {
		return mechanismExplainsEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMechanismExplainsEffect_Mechanism() {
		return (EAttribute) mechanismExplainsEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMechanismExplainsEffect_ExplainedEffect() {
		return (EAttribute) mechanismExplainsEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupport() {
		return supportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttack() {
		return attackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExperimentResults() {
		return experimentResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimentResults_ExperimentName() {
		return (EAttribute) experimentResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimentResults_Results() {
		return (EAttribute) experimentResultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteratureEvidence() {
		return literatureEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteratureEvidence_Reference() {
		return (EAttribute) literatureEvidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelInvalidClaim() {
		return modelInvalidClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelInvalidClaim_Model() {
		return (EAttribute) modelInvalidClaimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgumentsFactory getArgumentsFactory() {
		return (ArgumentsFactory) getEFactoryInstance();
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
		argumentElementEClass = createEClass(ARGUMENT_ELEMENT);

		argumentGraphEClass = createEClass(ARGUMENT_GRAPH);
		createEReference(argumentGraphEClass, ARGUMENT_GRAPH__ARGUMENT_ELEMENTS);
		createEReference(argumentGraphEClass, ARGUMENT_GRAPH__RELATIONS);

		argumentElementRelationEClass = createEClass(ARGUMENT_ELEMENT_RELATION);
		createEReference(argumentElementRelationEClass, ARGUMENT_ELEMENT_RELATION__EVIDENCE);
		createEReference(argumentElementRelationEClass, ARGUMENT_ELEMENT_RELATION__WARRANT);
		createEReference(argumentElementRelationEClass, ARGUMENT_ELEMENT_RELATION__CLAIM);
		createEReference(argumentElementRelationEClass, ARGUMENT_ELEMENT_RELATION__REBUTTAL_CONDITIONS);

		simulationMechanismWarrantEClass = createEClass(SIMULATION_MECHANISM_WARRANT);
		createEAttribute(simulationMechanismWarrantEClass, SIMULATION_MECHANISM_WARRANT__OUTPUT_DATA_OVER_TIME);
		createEAttribute(simulationMechanismWarrantEClass, SIMULATION_MECHANISM_WARRANT__EXPLAINED_EFFECT);
		createEAttribute(simulationMechanismWarrantEClass, SIMULATION_MECHANISM_WARRANT__GENERATING_REQUIREMENT);

		standardSimulationWarrantEClass = createEClass(STANDARD_SIMULATION_WARRANT);

		literatureEvidenceForDataAndEffectEClass = createEClass(LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT);
		createEAttribute(literatureEvidenceForDataAndEffectEClass,
				LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT__OBSERVED_DATA_OVER_TIME);
		createEAttribute(literatureEvidenceForDataAndEffectEClass,
				LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT__DESCRIBED_EFFECT);

		modelMatchesDataOverTimeEClass = createEClass(MODEL_MATCHES_DATA_OVER_TIME);
		createEAttribute(modelMatchesDataOverTimeEClass, MODEL_MATCHES_DATA_OVER_TIME__MODEL);
		createEAttribute(modelMatchesDataOverTimeEClass, MODEL_MATCHES_DATA_OVER_TIME__DATA_OVER_TIME);
		createEAttribute(modelMatchesDataOverTimeEClass, MODEL_MATCHES_DATA_OVER_TIME__MECHANISM);

		mechanismExplainsEffectEClass = createEClass(MECHANISM_EXPLAINS_EFFECT);
		createEAttribute(mechanismExplainsEffectEClass, MECHANISM_EXPLAINS_EFFECT__MECHANISM);
		createEAttribute(mechanismExplainsEffectEClass, MECHANISM_EXPLAINS_EFFECT__EXPLAINED_EFFECT);

		supportEClass = createEClass(SUPPORT);

		attackEClass = createEClass(ATTACK);

		experimentResultsEClass = createEClass(EXPERIMENT_RESULTS);
		createEAttribute(experimentResultsEClass, EXPERIMENT_RESULTS__EXPERIMENT_NAME);
		createEAttribute(experimentResultsEClass, EXPERIMENT_RESULTS__RESULTS);

		literatureEvidenceEClass = createEClass(LITERATURE_EVIDENCE);
		createEAttribute(literatureEvidenceEClass, LITERATURE_EVIDENCE__REFERENCE);

		modelInvalidClaimEClass = createEClass(MODEL_INVALID_CLAIM);
		createEAttribute(modelInvalidClaimEClass, MODEL_INVALID_CLAIM__MODEL);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simulationMechanismWarrantEClass.getESuperTypes().add(this.getArgumentElement());
		standardSimulationWarrantEClass.getESuperTypes().add(this.getArgumentElement());
		literatureEvidenceForDataAndEffectEClass.getESuperTypes().add(this.getLiteratureEvidence());
		modelMatchesDataOverTimeEClass.getESuperTypes().add(this.getArgumentElement());
		mechanismExplainsEffectEClass.getESuperTypes().add(this.getArgumentElement());
		supportEClass.getESuperTypes().add(this.getArgumentElementRelation());
		attackEClass.getESuperTypes().add(this.getArgumentElementRelation());
		experimentResultsEClass.getESuperTypes().add(this.getArgumentElement());
		literatureEvidenceEClass.getESuperTypes().add(this.getArgumentElement());
		modelInvalidClaimEClass.getESuperTypes().add(this.getArgumentElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(argumentElementEClass, ArgumentElement.class, "ArgumentElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentGraphEClass, ArgumentGraph.class, "ArgumentGraph", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentGraph_ArgumentElements(), this.getArgumentElement(), null, "argumentElements", null,
				0, -1, ArgumentGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentGraph_Relations(), this.getArgumentElementRelation(), null, "relations", null, 0, -1,
				ArgumentGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentElementRelationEClass, ArgumentElementRelation.class, "ArgumentElementRelation", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentElementRelation_Evidence(), this.getArgumentElement(), null, "evidence", null, 1, 1,
				ArgumentElementRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentElementRelation_Warrant(), this.getArgumentElement(), null, "warrant", null, 1, 1,
				ArgumentElementRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentElementRelation_Claim(), this.getArgumentElement(), null, "claim", null, 1, 1,
				ArgumentElementRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentElementRelation_RebuttalConditions(), this.getArgumentElement(), null,
				"rebuttalConditions", null, 0, -1, ArgumentElementRelation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulationMechanismWarrantEClass, SimulationMechanismWarrant.class, "SimulationMechanismWarrant",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulationMechanismWarrant_OutputDataOverTime(), ecorePackage.getEString(),
				"outputDataOverTime", null, 0, 1, SimulationMechanismWarrant.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationMechanismWarrant_ExplainedEffect(), ecorePackage.getEString(), "explainedEffect",
				null, 0, 1, SimulationMechanismWarrant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationMechanismWarrant_GeneratingRequirement(), ecorePackage.getEString(),
				"generatingRequirement", null, 0, 1, SimulationMechanismWarrant.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardSimulationWarrantEClass, StandardSimulationWarrant.class, "StandardSimulationWarrant",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literatureEvidenceForDataAndEffectEClass, LiteratureEvidenceForDataAndEffect.class,
				"LiteratureEvidenceForDataAndEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteratureEvidenceForDataAndEffect_ObservedDataOverTime(), ecorePackage.getEString(),
				"observedDataOverTime", null, 0, 1, LiteratureEvidenceForDataAndEffect.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteratureEvidenceForDataAndEffect_DescribedEffect(), ecorePackage.getEString(),
				"describedEffect", null, 0, 1, LiteratureEvidenceForDataAndEffect.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelMatchesDataOverTimeEClass, ModelMatchesDataOverTime.class, "ModelMatchesDataOverTime",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelMatchesDataOverTime_Model(), ecorePackage.getEString(), "model", null, 0, 1,
				ModelMatchesDataOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelMatchesDataOverTime_DataOverTime(), ecorePackage.getEString(), "dataOverTime", null, 0,
				1, ModelMatchesDataOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelMatchesDataOverTime_Mechanism(), ecorePackage.getEString(), "mechanism", null, 0, 1,
				ModelMatchesDataOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mechanismExplainsEffectEClass, MechanismExplainsEffect.class, "MechanismExplainsEffect",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMechanismExplainsEffect_Mechanism(), ecorePackage.getEString(), "mechanism", null, 0, 1,
				MechanismExplainsEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMechanismExplainsEffect_ExplainedEffect(), ecorePackage.getEString(), "explainedEffect", null,
				0, 1, MechanismExplainsEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportEClass, Support.class, "Support", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attackEClass, Attack.class, "Attack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(experimentResultsEClass, ExperimentResults.class, "ExperimentResults", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperimentResults_ExperimentName(), ecorePackage.getEString(), "experimentName", null, 0, 1,
				ExperimentResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentResults_Results(), ecorePackage.getEString(), "results", null, 0, 1,
				ExperimentResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(literatureEvidenceEClass, LiteratureEvidence.class, "LiteratureEvidence", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteratureEvidence_Reference(), ecorePackage.getEString(), "reference", null, 0, 1,
				LiteratureEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(modelInvalidClaimEClass, ModelInvalidClaim.class, "ModelInvalidClaim", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelInvalidClaim_Model(), ecorePackage.getEString(), "model", null, 0, 1,
				ModelInvalidClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ArgumentsPackageImpl
