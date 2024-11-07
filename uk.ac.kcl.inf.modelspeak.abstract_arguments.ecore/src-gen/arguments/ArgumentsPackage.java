/**
 */
package arguments;

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
 * @see arguments.ArgumentsFactory
 * @model kind="package"
 * @generated
 */
public interface ArgumentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arguments";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/arguments";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arguments";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArgumentsPackage eINSTANCE = arguments.impl.ArgumentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link arguments.impl.ArgumentElementImpl <em>Argument Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.ArgumentElementImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getArgumentElement()
	 * @generated
	 */
	int ARGUMENT_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Argument Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Argument Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arguments.impl.ArgumentGraphImpl <em>Argument Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.ArgumentGraphImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getArgumentGraph()
	 * @generated
	 */
	int ARGUMENT_GRAPH = 1;

	/**
	 * The feature id for the '<em><b>Argument Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GRAPH__ARGUMENT_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GRAPH__RELATIONS = 1;

	/**
	 * The number of structural features of the '<em>Argument Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Argument Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arguments.impl.ArgumentElementRelationImpl <em>Argument Element Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.ArgumentElementRelationImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getArgumentElementRelation()
	 * @generated
	 */
	int ARGUMENT_ELEMENT_RELATION = 2;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_RELATION__EVIDENCE = 0;

	/**
	 * The feature id for the '<em><b>Warrant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_RELATION__WARRANT = 1;

	/**
	 * The feature id for the '<em><b>Claim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_RELATION__CLAIM = 2;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_RELATION__ASSUMPTIONS = 3;

	/**
	 * The number of structural features of the '<em>Argument Element Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_RELATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Argument Element Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arguments.impl.SimulationMechanismWarrantImpl <em>Simulation Mechanism Warrant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.SimulationMechanismWarrantImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getSimulationMechanismWarrant()
	 * @generated
	 */
	int SIMULATION_MECHANISM_WARRANT = 3;

	/**
	 * The feature id for the '<em><b>Output Data Over Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MECHANISM_WARRANT__OUTPUT_DATA_OVER_TIME = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Explained Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MECHANISM_WARRANT__EXPLAINED_EFFECT = ARGUMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generating Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MECHANISM_WARRANT__GENERATING_REQUIREMENT = ARGUMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simulation Mechanism Warrant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MECHANISM_WARRANT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Simulation Mechanism Warrant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MECHANISM_WARRANT_OPERATION_COUNT = ARGUMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arguments.impl.StandardSimulationWarrantImpl <em>Standard Simulation Warrant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.StandardSimulationWarrantImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getStandardSimulationWarrant()
	 * @generated
	 */
	int STANDARD_SIMULATION_WARRANT = 4;

	/**
	 * The number of structural features of the '<em>Standard Simulation Warrant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SIMULATION_WARRANT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Standard Simulation Warrant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SIMULATION_WARRANT_OPERATION_COUNT = ARGUMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arguments.impl.LiteratureEvidenceImpl <em>Literature Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.LiteratureEvidenceImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getLiteratureEvidence()
	 * @generated
	 */
	int LITERATURE_EVIDENCE = 11;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERATURE_EVIDENCE__REFERENCE = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literature Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERATURE_EVIDENCE_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literature Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERATURE_EVIDENCE_OPERATION_COUNT = ARGUMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arguments.impl.LiteratureEvidenceForDataAndEffectImpl <em>Literature Evidence For Data And Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.LiteratureEvidenceForDataAndEffectImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getLiteratureEvidenceForDataAndEffect()
	 * @generated
	 */
	int LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT = 5;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT__REFERENCE = LITERATURE_EVIDENCE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Observed Data Over Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT__OBSERVED_DATA_OVER_TIME = LITERATURE_EVIDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Described Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT__DESCRIBED_EFFECT = LITERATURE_EVIDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literature Evidence For Data And Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT_FEATURE_COUNT = LITERATURE_EVIDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Literature Evidence For Data And Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT_OPERATION_COUNT = LITERATURE_EVIDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arguments.impl.ModelMatchesDataOverTimeImpl <em>Model Matches Data Over Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.ModelMatchesDataOverTimeImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getModelMatchesDataOverTime()
	 * @generated
	 */
	int MODEL_MATCHES_DATA_OVER_TIME = 6;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MATCHES_DATA_OVER_TIME__MODEL = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Over Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MATCHES_DATA_OVER_TIME__DATA_OVER_TIME = ARGUMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MATCHES_DATA_OVER_TIME__MECHANISM = ARGUMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Matches Data Over Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MATCHES_DATA_OVER_TIME_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Model Matches Data Over Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MATCHES_DATA_OVER_TIME_OPERATION_COUNT = ARGUMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arguments.impl.MechanismExplainsEffectImpl <em>Mechanism Explains Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.MechanismExplainsEffectImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getMechanismExplainsEffect()
	 * @generated
	 */
	int MECHANISM_EXPLAINS_EFFECT = 7;

	/**
	 * The feature id for the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANISM_EXPLAINS_EFFECT__MECHANISM = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Explained Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANISM_EXPLAINS_EFFECT__EXPLAINED_EFFECT = ARGUMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mechanism Explains Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANISM_EXPLAINS_EFFECT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mechanism Explains Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANISM_EXPLAINS_EFFECT_OPERATION_COUNT = ARGUMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arguments.impl.SupportImpl <em>Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.SupportImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getSupport()
	 * @generated
	 */
	int SUPPORT = 8;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__EVIDENCE = ARGUMENT_ELEMENT_RELATION__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Warrant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__WARRANT = ARGUMENT_ELEMENT_RELATION__WARRANT;

	/**
	 * The feature id for the '<em><b>Claim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__CLAIM = ARGUMENT_ELEMENT_RELATION__CLAIM;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__ASSUMPTIONS = ARGUMENT_ELEMENT_RELATION__ASSUMPTIONS;

	/**
	 * The number of structural features of the '<em>Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_FEATURE_COUNT = ARGUMENT_ELEMENT_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_OPERATION_COUNT = ARGUMENT_ELEMENT_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arguments.impl.AttackImpl <em>Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.AttackImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getAttack()
	 * @generated
	 */
	int ATTACK = 9;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__EVIDENCE = ARGUMENT_ELEMENT_RELATION__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Warrant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__WARRANT = ARGUMENT_ELEMENT_RELATION__WARRANT;

	/**
	 * The feature id for the '<em><b>Claim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__CLAIM = ARGUMENT_ELEMENT_RELATION__CLAIM;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__ASSUMPTIONS = ARGUMENT_ELEMENT_RELATION__ASSUMPTIONS;

	/**
	 * The number of structural features of the '<em>Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_FEATURE_COUNT = ARGUMENT_ELEMENT_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_OPERATION_COUNT = ARGUMENT_ELEMENT_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arguments.impl.ExperimentResultsImpl <em>Experiment Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.ExperimentResultsImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getExperimentResults()
	 * @generated
	 */
	int EXPERIMENT_RESULTS = 10;

	/**
	 * The feature id for the '<em><b>Experiment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RESULTS__EXPERIMENT_NAME = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RESULTS__RESULTS = ARGUMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Experiment Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RESULTS_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Experiment Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RESULTS_OPERATION_COUNT = ARGUMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arguments.impl.ModelIsValidClaimImpl <em>Model Is Valid Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.ModelIsValidClaimImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getModelIsValidClaim()
	 * @generated
	 */
	int MODEL_IS_VALID_CLAIM = 12;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IS_VALID_CLAIM__MODEL = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Is Valid Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IS_VALID_CLAIM_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Is Valid Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IS_VALID_CLAIM_OPERATION_COUNT = ARGUMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arguments.impl.ModelInputDataValidImpl <em>Model Input Data Valid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arguments.impl.ModelInputDataValidImpl
	 * @see arguments.impl.ArgumentsPackageImpl#getModelInputDataValid()
	 * @generated
	 */
	int MODEL_INPUT_DATA_VALID = 13;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INPUT_DATA_VALID__MODEL = MODEL_IS_VALID_CLAIM__MODEL;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INPUT_DATA_VALID__DATA_DESCRIPTION = MODEL_IS_VALID_CLAIM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Input Data Valid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INPUT_DATA_VALID_FEATURE_COUNT = MODEL_IS_VALID_CLAIM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Input Data Valid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INPUT_DATA_VALID_OPERATION_COUNT = MODEL_IS_VALID_CLAIM_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link arguments.ArgumentElement <em>Argument Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Element</em>'.
	 * @see arguments.ArgumentElement
	 * @generated
	 */
	EClass getArgumentElement();

	/**
	 * Returns the meta object for class '{@link arguments.ArgumentGraph <em>Argument Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Graph</em>'.
	 * @see arguments.ArgumentGraph
	 * @generated
	 */
	EClass getArgumentGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link arguments.ArgumentGraph#getArgumentElements <em>Argument Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Elements</em>'.
	 * @see arguments.ArgumentGraph#getArgumentElements()
	 * @see #getArgumentGraph()
	 * @generated
	 */
	EReference getArgumentGraph_ArgumentElements();

	/**
	 * Returns the meta object for the containment reference list '{@link arguments.ArgumentGraph#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see arguments.ArgumentGraph#getRelations()
	 * @see #getArgumentGraph()
	 * @generated
	 */
	EReference getArgumentGraph_Relations();

	/**
	 * Returns the meta object for class '{@link arguments.ArgumentElementRelation <em>Argument Element Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Element Relation</em>'.
	 * @see arguments.ArgumentElementRelation
	 * @generated
	 */
	EClass getArgumentElementRelation();

	/**
	 * Returns the meta object for the reference '{@link arguments.ArgumentElementRelation#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evidence</em>'.
	 * @see arguments.ArgumentElementRelation#getEvidence()
	 * @see #getArgumentElementRelation()
	 * @generated
	 */
	EReference getArgumentElementRelation_Evidence();

	/**
	 * Returns the meta object for the reference '{@link arguments.ArgumentElementRelation#getWarrant <em>Warrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Warrant</em>'.
	 * @see arguments.ArgumentElementRelation#getWarrant()
	 * @see #getArgumentElementRelation()
	 * @generated
	 */
	EReference getArgumentElementRelation_Warrant();

	/**
	 * Returns the meta object for the reference '{@link arguments.ArgumentElementRelation#getClaim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Claim</em>'.
	 * @see arguments.ArgumentElementRelation#getClaim()
	 * @see #getArgumentElementRelation()
	 * @generated
	 */
	EReference getArgumentElementRelation_Claim();

	/**
	 * Returns the meta object for the reference list '{@link arguments.ArgumentElementRelation#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assumptions</em>'.
	 * @see arguments.ArgumentElementRelation#getAssumptions()
	 * @see #getArgumentElementRelation()
	 * @generated
	 */
	EReference getArgumentElementRelation_Assumptions();

	/**
	 * Returns the meta object for class '{@link arguments.SimulationMechanismWarrant <em>Simulation Mechanism Warrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Mechanism Warrant</em>'.
	 * @see arguments.SimulationMechanismWarrant
	 * @generated
	 */
	EClass getSimulationMechanismWarrant();

	/**
	 * Returns the meta object for the attribute '{@link arguments.SimulationMechanismWarrant#getOutputDataOverTime <em>Output Data Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Data Over Time</em>'.
	 * @see arguments.SimulationMechanismWarrant#getOutputDataOverTime()
	 * @see #getSimulationMechanismWarrant()
	 * @generated
	 */
	EAttribute getSimulationMechanismWarrant_OutputDataOverTime();

	/**
	 * Returns the meta object for the attribute '{@link arguments.SimulationMechanismWarrant#getExplainedEffect <em>Explained Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explained Effect</em>'.
	 * @see arguments.SimulationMechanismWarrant#getExplainedEffect()
	 * @see #getSimulationMechanismWarrant()
	 * @generated
	 */
	EAttribute getSimulationMechanismWarrant_ExplainedEffect();

	/**
	 * Returns the meta object for the attribute '{@link arguments.SimulationMechanismWarrant#getGeneratingRequirement <em>Generating Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generating Requirement</em>'.
	 * @see arguments.SimulationMechanismWarrant#getGeneratingRequirement()
	 * @see #getSimulationMechanismWarrant()
	 * @generated
	 */
	EAttribute getSimulationMechanismWarrant_GeneratingRequirement();

	/**
	 * Returns the meta object for class '{@link arguments.StandardSimulationWarrant <em>Standard Simulation Warrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Simulation Warrant</em>'.
	 * @see arguments.StandardSimulationWarrant
	 * @generated
	 */
	EClass getStandardSimulationWarrant();

	/**
	 * Returns the meta object for class '{@link arguments.LiteratureEvidenceForDataAndEffect <em>Literature Evidence For Data And Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literature Evidence For Data And Effect</em>'.
	 * @see arguments.LiteratureEvidenceForDataAndEffect
	 * @generated
	 */
	EClass getLiteratureEvidenceForDataAndEffect();

	/**
	 * Returns the meta object for the attribute '{@link arguments.LiteratureEvidenceForDataAndEffect#getObservedDataOverTime <em>Observed Data Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observed Data Over Time</em>'.
	 * @see arguments.LiteratureEvidenceForDataAndEffect#getObservedDataOverTime()
	 * @see #getLiteratureEvidenceForDataAndEffect()
	 * @generated
	 */
	EAttribute getLiteratureEvidenceForDataAndEffect_ObservedDataOverTime();

	/**
	 * Returns the meta object for the attribute '{@link arguments.LiteratureEvidenceForDataAndEffect#getDescribedEffect <em>Described Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Described Effect</em>'.
	 * @see arguments.LiteratureEvidenceForDataAndEffect#getDescribedEffect()
	 * @see #getLiteratureEvidenceForDataAndEffect()
	 * @generated
	 */
	EAttribute getLiteratureEvidenceForDataAndEffect_DescribedEffect();

	/**
	 * Returns the meta object for class '{@link arguments.ModelMatchesDataOverTime <em>Model Matches Data Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Matches Data Over Time</em>'.
	 * @see arguments.ModelMatchesDataOverTime
	 * @generated
	 */
	EClass getModelMatchesDataOverTime();

	/**
	 * Returns the meta object for the attribute '{@link arguments.ModelMatchesDataOverTime#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see arguments.ModelMatchesDataOverTime#getModel()
	 * @see #getModelMatchesDataOverTime()
	 * @generated
	 */
	EAttribute getModelMatchesDataOverTime_Model();

	/**
	 * Returns the meta object for the attribute '{@link arguments.ModelMatchesDataOverTime#getDataOverTime <em>Data Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Over Time</em>'.
	 * @see arguments.ModelMatchesDataOverTime#getDataOverTime()
	 * @see #getModelMatchesDataOverTime()
	 * @generated
	 */
	EAttribute getModelMatchesDataOverTime_DataOverTime();

	/**
	 * Returns the meta object for the attribute '{@link arguments.ModelMatchesDataOverTime#getMechanism <em>Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism</em>'.
	 * @see arguments.ModelMatchesDataOverTime#getMechanism()
	 * @see #getModelMatchesDataOverTime()
	 * @generated
	 */
	EAttribute getModelMatchesDataOverTime_Mechanism();

	/**
	 * Returns the meta object for class '{@link arguments.MechanismExplainsEffect <em>Mechanism Explains Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanism Explains Effect</em>'.
	 * @see arguments.MechanismExplainsEffect
	 * @generated
	 */
	EClass getMechanismExplainsEffect();

	/**
	 * Returns the meta object for the attribute '{@link arguments.MechanismExplainsEffect#getMechanism <em>Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism</em>'.
	 * @see arguments.MechanismExplainsEffect#getMechanism()
	 * @see #getMechanismExplainsEffect()
	 * @generated
	 */
	EAttribute getMechanismExplainsEffect_Mechanism();

	/**
	 * Returns the meta object for the attribute '{@link arguments.MechanismExplainsEffect#getExplainedEffect <em>Explained Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explained Effect</em>'.
	 * @see arguments.MechanismExplainsEffect#getExplainedEffect()
	 * @see #getMechanismExplainsEffect()
	 * @generated
	 */
	EAttribute getMechanismExplainsEffect_ExplainedEffect();

	/**
	 * Returns the meta object for class '{@link arguments.Support <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support</em>'.
	 * @see arguments.Support
	 * @generated
	 */
	EClass getSupport();

	/**
	 * Returns the meta object for class '{@link arguments.Attack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack</em>'.
	 * @see arguments.Attack
	 * @generated
	 */
	EClass getAttack();

	/**
	 * Returns the meta object for class '{@link arguments.ExperimentResults <em>Experiment Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Results</em>'.
	 * @see arguments.ExperimentResults
	 * @generated
	 */
	EClass getExperimentResults();

	/**
	 * Returns the meta object for the attribute '{@link arguments.ExperimentResults#getExperimentName <em>Experiment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experiment Name</em>'.
	 * @see arguments.ExperimentResults#getExperimentName()
	 * @see #getExperimentResults()
	 * @generated
	 */
	EAttribute getExperimentResults_ExperimentName();

	/**
	 * Returns the meta object for the attribute '{@link arguments.ExperimentResults#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Results</em>'.
	 * @see arguments.ExperimentResults#getResults()
	 * @see #getExperimentResults()
	 * @generated
	 */
	EAttribute getExperimentResults_Results();

	/**
	 * Returns the meta object for class '{@link arguments.LiteratureEvidence <em>Literature Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literature Evidence</em>'.
	 * @see arguments.LiteratureEvidence
	 * @generated
	 */
	EClass getLiteratureEvidence();

	/**
	 * Returns the meta object for the attribute '{@link arguments.LiteratureEvidence#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see arguments.LiteratureEvidence#getReference()
	 * @see #getLiteratureEvidence()
	 * @generated
	 */
	EAttribute getLiteratureEvidence_Reference();

	/**
	 * Returns the meta object for class '{@link arguments.ModelIsValidClaim <em>Model Is Valid Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Is Valid Claim</em>'.
	 * @see arguments.ModelIsValidClaim
	 * @generated
	 */
	EClass getModelIsValidClaim();

	/**
	 * Returns the meta object for the attribute '{@link arguments.ModelIsValidClaim#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see arguments.ModelIsValidClaim#getModel()
	 * @see #getModelIsValidClaim()
	 * @generated
	 */
	EAttribute getModelIsValidClaim_Model();

	/**
	 * Returns the meta object for class '{@link arguments.ModelInputDataValid <em>Model Input Data Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Input Data Valid</em>'.
	 * @see arguments.ModelInputDataValid
	 * @generated
	 */
	EClass getModelInputDataValid();

	/**
	 * Returns the meta object for the attribute '{@link arguments.ModelInputDataValid#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see arguments.ModelInputDataValid#getDataDescription()
	 * @see #getModelInputDataValid()
	 * @generated
	 */
	EAttribute getModelInputDataValid_DataDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArgumentsFactory getArgumentsFactory();

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
		 * The meta object literal for the '{@link arguments.impl.ArgumentElementImpl <em>Argument Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.ArgumentElementImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getArgumentElement()
		 * @generated
		 */
		EClass ARGUMENT_ELEMENT = eINSTANCE.getArgumentElement();

		/**
		 * The meta object literal for the '{@link arguments.impl.ArgumentGraphImpl <em>Argument Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.ArgumentGraphImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getArgumentGraph()
		 * @generated
		 */
		EClass ARGUMENT_GRAPH = eINSTANCE.getArgumentGraph();

		/**
		 * The meta object literal for the '<em><b>Argument Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_GRAPH__ARGUMENT_ELEMENTS = eINSTANCE.getArgumentGraph_ArgumentElements();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_GRAPH__RELATIONS = eINSTANCE.getArgumentGraph_Relations();

		/**
		 * The meta object literal for the '{@link arguments.impl.ArgumentElementRelationImpl <em>Argument Element Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.ArgumentElementRelationImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getArgumentElementRelation()
		 * @generated
		 */
		EClass ARGUMENT_ELEMENT_RELATION = eINSTANCE.getArgumentElementRelation();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_ELEMENT_RELATION__EVIDENCE = eINSTANCE.getArgumentElementRelation_Evidence();

		/**
		 * The meta object literal for the '<em><b>Warrant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_ELEMENT_RELATION__WARRANT = eINSTANCE.getArgumentElementRelation_Warrant();

		/**
		 * The meta object literal for the '<em><b>Claim</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_ELEMENT_RELATION__CLAIM = eINSTANCE.getArgumentElementRelation_Claim();

		/**
		 * The meta object literal for the '<em><b>Assumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_ELEMENT_RELATION__ASSUMPTIONS = eINSTANCE.getArgumentElementRelation_Assumptions();

		/**
		 * The meta object literal for the '{@link arguments.impl.SimulationMechanismWarrantImpl <em>Simulation Mechanism Warrant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.SimulationMechanismWarrantImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getSimulationMechanismWarrant()
		 * @generated
		 */
		EClass SIMULATION_MECHANISM_WARRANT = eINSTANCE.getSimulationMechanismWarrant();

		/**
		 * The meta object literal for the '<em><b>Output Data Over Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_MECHANISM_WARRANT__OUTPUT_DATA_OVER_TIME = eINSTANCE
				.getSimulationMechanismWarrant_OutputDataOverTime();

		/**
		 * The meta object literal for the '<em><b>Explained Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_MECHANISM_WARRANT__EXPLAINED_EFFECT = eINSTANCE
				.getSimulationMechanismWarrant_ExplainedEffect();

		/**
		 * The meta object literal for the '<em><b>Generating Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_MECHANISM_WARRANT__GENERATING_REQUIREMENT = eINSTANCE
				.getSimulationMechanismWarrant_GeneratingRequirement();

		/**
		 * The meta object literal for the '{@link arguments.impl.StandardSimulationWarrantImpl <em>Standard Simulation Warrant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.StandardSimulationWarrantImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getStandardSimulationWarrant()
		 * @generated
		 */
		EClass STANDARD_SIMULATION_WARRANT = eINSTANCE.getStandardSimulationWarrant();

		/**
		 * The meta object literal for the '{@link arguments.impl.LiteratureEvidenceForDataAndEffectImpl <em>Literature Evidence For Data And Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.LiteratureEvidenceForDataAndEffectImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getLiteratureEvidenceForDataAndEffect()
		 * @generated
		 */
		EClass LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT = eINSTANCE.getLiteratureEvidenceForDataAndEffect();

		/**
		 * The meta object literal for the '<em><b>Observed Data Over Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT__OBSERVED_DATA_OVER_TIME = eINSTANCE
				.getLiteratureEvidenceForDataAndEffect_ObservedDataOverTime();

		/**
		 * The meta object literal for the '<em><b>Described Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT__DESCRIBED_EFFECT = eINSTANCE
				.getLiteratureEvidenceForDataAndEffect_DescribedEffect();

		/**
		 * The meta object literal for the '{@link arguments.impl.ModelMatchesDataOverTimeImpl <em>Model Matches Data Over Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.ModelMatchesDataOverTimeImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getModelMatchesDataOverTime()
		 * @generated
		 */
		EClass MODEL_MATCHES_DATA_OVER_TIME = eINSTANCE.getModelMatchesDataOverTime();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_MATCHES_DATA_OVER_TIME__MODEL = eINSTANCE.getModelMatchesDataOverTime_Model();

		/**
		 * The meta object literal for the '<em><b>Data Over Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_MATCHES_DATA_OVER_TIME__DATA_OVER_TIME = eINSTANCE.getModelMatchesDataOverTime_DataOverTime();

		/**
		 * The meta object literal for the '<em><b>Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_MATCHES_DATA_OVER_TIME__MECHANISM = eINSTANCE.getModelMatchesDataOverTime_Mechanism();

		/**
		 * The meta object literal for the '{@link arguments.impl.MechanismExplainsEffectImpl <em>Mechanism Explains Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.MechanismExplainsEffectImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getMechanismExplainsEffect()
		 * @generated
		 */
		EClass MECHANISM_EXPLAINS_EFFECT = eINSTANCE.getMechanismExplainsEffect();

		/**
		 * The meta object literal for the '<em><b>Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MECHANISM_EXPLAINS_EFFECT__MECHANISM = eINSTANCE.getMechanismExplainsEffect_Mechanism();

		/**
		 * The meta object literal for the '<em><b>Explained Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MECHANISM_EXPLAINS_EFFECT__EXPLAINED_EFFECT = eINSTANCE.getMechanismExplainsEffect_ExplainedEffect();

		/**
		 * The meta object literal for the '{@link arguments.impl.SupportImpl <em>Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.SupportImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getSupport()
		 * @generated
		 */
		EClass SUPPORT = eINSTANCE.getSupport();

		/**
		 * The meta object literal for the '{@link arguments.impl.AttackImpl <em>Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.AttackImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getAttack()
		 * @generated
		 */
		EClass ATTACK = eINSTANCE.getAttack();

		/**
		 * The meta object literal for the '{@link arguments.impl.ExperimentResultsImpl <em>Experiment Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.ExperimentResultsImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getExperimentResults()
		 * @generated
		 */
		EClass EXPERIMENT_RESULTS = eINSTANCE.getExperimentResults();

		/**
		 * The meta object literal for the '<em><b>Experiment Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_RESULTS__EXPERIMENT_NAME = eINSTANCE.getExperimentResults_ExperimentName();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_RESULTS__RESULTS = eINSTANCE.getExperimentResults_Results();

		/**
		 * The meta object literal for the '{@link arguments.impl.LiteratureEvidenceImpl <em>Literature Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.LiteratureEvidenceImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getLiteratureEvidence()
		 * @generated
		 */
		EClass LITERATURE_EVIDENCE = eINSTANCE.getLiteratureEvidence();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERATURE_EVIDENCE__REFERENCE = eINSTANCE.getLiteratureEvidence_Reference();

		/**
		 * The meta object literal for the '{@link arguments.impl.ModelIsValidClaimImpl <em>Model Is Valid Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.ModelIsValidClaimImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getModelIsValidClaim()
		 * @generated
		 */
		EClass MODEL_IS_VALID_CLAIM = eINSTANCE.getModelIsValidClaim();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IS_VALID_CLAIM__MODEL = eINSTANCE.getModelIsValidClaim_Model();

		/**
		 * The meta object literal for the '{@link arguments.impl.ModelInputDataValidImpl <em>Model Input Data Valid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arguments.impl.ModelInputDataValidImpl
		 * @see arguments.impl.ArgumentsPackageImpl#getModelInputDataValid()
		 * @generated
		 */
		EClass MODEL_INPUT_DATA_VALID = eINSTANCE.getModelInputDataValid();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_INPUT_DATA_VALID__DATA_DESCRIPTION = eINSTANCE.getModelInputDataValid_DataDescription();

	}

} //ArgumentsPackage
