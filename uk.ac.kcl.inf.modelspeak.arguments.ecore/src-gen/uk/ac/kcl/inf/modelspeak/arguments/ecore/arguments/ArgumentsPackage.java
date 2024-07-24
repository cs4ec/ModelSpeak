/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsFactory
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
	ArgumentsPackage eINSTANCE = uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentElementImpl <em>Argument Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentElementImpl
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getArgumentElement()
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
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentGraphImpl <em>Argument Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentGraphImpl
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getArgumentGraph()
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
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentElementRelationImpl <em>Argument Element Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentElementRelationImpl
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getArgumentElementRelation()
	 * @generated
	 */
	int ARGUMENT_ELEMENT_RELATION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_RELATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_RELATION__EVIDENCE = 1;

	/**
	 * The feature id for the '<em><b>Warrant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_RELATION__WARRANT = 2;

	/**
	 * The feature id for the '<em><b>Claim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_RELATION__CLAIM = 3;

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
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.SimulationMechanismWarrantImpl <em>Simulation Mechanism Warrant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.SimulationMechanismWarrantImpl
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getSimulationMechanismWarrant()
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
	 * The number of structural features of the '<em>Simulation Mechanism Warrant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MECHANISM_WARRANT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Simulation Mechanism Warrant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MECHANISM_WARRANT_OPERATION_COUNT = ARGUMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.StandardSimulationWarrantImpl <em>Standard Simulation Warrant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.StandardSimulationWarrantImpl
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getStandardSimulationWarrant()
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
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.LiteratureEvidenceImpl <em>Literature Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.LiteratureEvidenceImpl
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getLiteratureEvidence()
	 * @generated
	 */
	int LITERATURE_EVIDENCE = 5;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERATURE_EVIDENCE__REFERENCE = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Observed Data Over Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERATURE_EVIDENCE__OBSERVED_DATA_OVER_TIME = ARGUMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Described Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERATURE_EVIDENCE__DESCRIBED_EFFECT = ARGUMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Literature Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERATURE_EVIDENCE_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Literature Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERATURE_EVIDENCE_OPERATION_COUNT = ARGUMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ModelMatchesDataOverTimeImpl <em>Model Matches Data Over Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ModelMatchesDataOverTimeImpl
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getModelMatchesDataOverTime()
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
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.MechanismExplainsEffectImpl <em>Mechanism Explains Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.MechanismExplainsEffectImpl
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getMechanismExplainsEffect()
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
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.RelationshipType <em>Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.RelationshipType
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 8;

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElement <em>Argument Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Element</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElement
	 * @generated
	 */
	EClass getArgumentElement();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph <em>Argument Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Graph</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph
	 * @generated
	 */
	EClass getArgumentGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph#getArgumentElements <em>Argument Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Elements</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph#getArgumentElements()
	 * @see #getArgumentGraph()
	 * @generated
	 */
	EReference getArgumentGraph_ArgumentElements();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph#getRelations()
	 * @see #getArgumentGraph()
	 * @generated
	 */
	EReference getArgumentGraph_Relations();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation <em>Argument Element Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Element Relation</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation
	 * @generated
	 */
	EClass getArgumentElementRelation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getType()
	 * @see #getArgumentElementRelation()
	 * @generated
	 */
	EAttribute getArgumentElementRelation_Type();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evidence</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getEvidence()
	 * @see #getArgumentElementRelation()
	 * @generated
	 */
	EReference getArgumentElementRelation_Evidence();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getWarrant <em>Warrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Warrant</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getWarrant()
	 * @see #getArgumentElementRelation()
	 * @generated
	 */
	EReference getArgumentElementRelation_Warrant();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getClaim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Claim</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation#getClaim()
	 * @see #getArgumentElementRelation()
	 * @generated
	 */
	EReference getArgumentElementRelation_Claim();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.SimulationMechanismWarrant <em>Simulation Mechanism Warrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Mechanism Warrant</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.SimulationMechanismWarrant
	 * @generated
	 */
	EClass getSimulationMechanismWarrant();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.SimulationMechanismWarrant#getOutputDataOverTime <em>Output Data Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Data Over Time</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.SimulationMechanismWarrant#getOutputDataOverTime()
	 * @see #getSimulationMechanismWarrant()
	 * @generated
	 */
	EAttribute getSimulationMechanismWarrant_OutputDataOverTime();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.SimulationMechanismWarrant#getExplainedEffect <em>Explained Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explained Effect</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.SimulationMechanismWarrant#getExplainedEffect()
	 * @see #getSimulationMechanismWarrant()
	 * @generated
	 */
	EAttribute getSimulationMechanismWarrant_ExplainedEffect();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.StandardSimulationWarrant <em>Standard Simulation Warrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Simulation Warrant</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.StandardSimulationWarrant
	 * @generated
	 */
	EClass getStandardSimulationWarrant();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence <em>Literature Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literature Evidence</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence
	 * @generated
	 */
	EClass getLiteratureEvidence();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence#getReference()
	 * @see #getLiteratureEvidence()
	 * @generated
	 */
	EAttribute getLiteratureEvidence_Reference();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence#getObservedDataOverTime <em>Observed Data Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observed Data Over Time</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence#getObservedDataOverTime()
	 * @see #getLiteratureEvidence()
	 * @generated
	 */
	EAttribute getLiteratureEvidence_ObservedDataOverTime();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence#getDescribedEffect <em>Described Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Described Effect</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence#getDescribedEffect()
	 * @see #getLiteratureEvidence()
	 * @generated
	 */
	EAttribute getLiteratureEvidence_DescribedEffect();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime <em>Model Matches Data Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Matches Data Over Time</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime
	 * @generated
	 */
	EClass getModelMatchesDataOverTime();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime#getModel()
	 * @see #getModelMatchesDataOverTime()
	 * @generated
	 */
	EAttribute getModelMatchesDataOverTime_Model();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime#getDataOverTime <em>Data Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Over Time</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime#getDataOverTime()
	 * @see #getModelMatchesDataOverTime()
	 * @generated
	 */
	EAttribute getModelMatchesDataOverTime_DataOverTime();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime#getMechanism <em>Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime#getMechanism()
	 * @see #getModelMatchesDataOverTime()
	 * @generated
	 */
	EAttribute getModelMatchesDataOverTime_Mechanism();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect <em>Mechanism Explains Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanism Explains Effect</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect
	 * @generated
	 */
	EClass getMechanismExplainsEffect();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect#getMechanism <em>Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect#getMechanism()
	 * @see #getMechanismExplainsEffect()
	 * @generated
	 */
	EAttribute getMechanismExplainsEffect_Mechanism();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect#getExplainedEffect <em>Explained Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explained Effect</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect#getExplainedEffect()
	 * @see #getMechanismExplainsEffect()
	 * @generated
	 */
	EAttribute getMechanismExplainsEffect_ExplainedEffect();

	/**
	 * Returns the meta object for enum '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type</em>'.
	 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.RelationshipType
	 * @generated
	 */
	EEnum getRelationshipType();

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
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentElementImpl <em>Argument Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentElementImpl
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getArgumentElement()
		 * @generated
		 */
		EClass ARGUMENT_ELEMENT = eINSTANCE.getArgumentElement();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentGraphImpl <em>Argument Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentGraphImpl
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getArgumentGraph()
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
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentElementRelationImpl <em>Argument Element Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentElementRelationImpl
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getArgumentElementRelation()
		 * @generated
		 */
		EClass ARGUMENT_ELEMENT_RELATION = eINSTANCE.getArgumentElementRelation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT_ELEMENT_RELATION__TYPE = eINSTANCE.getArgumentElementRelation_Type();

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
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.SimulationMechanismWarrantImpl <em>Simulation Mechanism Warrant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.SimulationMechanismWarrantImpl
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getSimulationMechanismWarrant()
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
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.StandardSimulationWarrantImpl <em>Standard Simulation Warrant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.StandardSimulationWarrantImpl
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getStandardSimulationWarrant()
		 * @generated
		 */
		EClass STANDARD_SIMULATION_WARRANT = eINSTANCE.getStandardSimulationWarrant();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.LiteratureEvidenceImpl <em>Literature Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.LiteratureEvidenceImpl
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getLiteratureEvidence()
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
		 * The meta object literal for the '<em><b>Observed Data Over Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERATURE_EVIDENCE__OBSERVED_DATA_OVER_TIME = eINSTANCE
				.getLiteratureEvidence_ObservedDataOverTime();

		/**
		 * The meta object literal for the '<em><b>Described Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERATURE_EVIDENCE__DESCRIBED_EFFECT = eINSTANCE.getLiteratureEvidence_DescribedEffect();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ModelMatchesDataOverTimeImpl <em>Model Matches Data Over Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ModelMatchesDataOverTimeImpl
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getModelMatchesDataOverTime()
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
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.MechanismExplainsEffectImpl <em>Mechanism Explains Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.MechanismExplainsEffectImpl
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getMechanismExplainsEffect()
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
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.RelationshipType <em>Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.RelationshipType
		 * @see uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentsPackageImpl#getRelationshipType()
		 * @generated
		 */
		EEnum RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

	}

} //ArgumentsPackage