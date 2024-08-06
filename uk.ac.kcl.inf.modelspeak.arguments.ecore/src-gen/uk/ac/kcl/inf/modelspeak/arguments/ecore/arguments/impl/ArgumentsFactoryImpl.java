/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentsFactoryImpl extends EFactoryImpl implements ArgumentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArgumentsFactory init() {
		try {
			ArgumentsFactory theArgumentsFactory = (ArgumentsFactory) EPackage.Registry.INSTANCE
					.getEFactory(ArgumentsPackage.eNS_URI);
			if (theArgumentsFactory != null) {
				return theArgumentsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArgumentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentsFactoryImpl() {
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
		case ArgumentsPackage.ARGUMENT_GRAPH:
			return createArgumentGraph();
		case ArgumentsPackage.SIMULATION_MECHANISM_WARRANT:
			return createSimulationMechanismWarrant();
		case ArgumentsPackage.STANDARD_SIMULATION_WARRANT:
			return createStandardSimulationWarrant();
		case ArgumentsPackage.LITERATURE_EVIDENCE:
			return createLiteratureEvidence();
		case ArgumentsPackage.MODEL_MATCHES_DATA_OVER_TIME:
			return createModelMatchesDataOverTime();
		case ArgumentsPackage.MECHANISM_EXPLAINS_EFFECT:
			return createMechanismExplainsEffect();
		case ArgumentsPackage.SUPPORT:
			return createSupport();
		case ArgumentsPackage.ATTACK:
			return createAttack();
		case ArgumentsPackage.EXPERIMENT_RESULTS:
			return createExperimentResults();
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
	public ArgumentGraph createArgumentGraph() {
		ArgumentGraphImpl argumentGraph = new ArgumentGraphImpl();
		return argumentGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimulationMechanismWarrant createSimulationMechanismWarrant() {
		SimulationMechanismWarrantImpl simulationMechanismWarrant = new SimulationMechanismWarrantImpl();
		return simulationMechanismWarrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardSimulationWarrant createStandardSimulationWarrant() {
		StandardSimulationWarrantImpl standardSimulationWarrant = new StandardSimulationWarrantImpl();
		return standardSimulationWarrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteratureEvidence createLiteratureEvidence() {
		LiteratureEvidenceImpl literatureEvidence = new LiteratureEvidenceImpl();
		return literatureEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelMatchesDataOverTime createModelMatchesDataOverTime() {
		ModelMatchesDataOverTimeImpl modelMatchesDataOverTime = new ModelMatchesDataOverTimeImpl();
		return modelMatchesDataOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MechanismExplainsEffect createMechanismExplainsEffect() {
		MechanismExplainsEffectImpl mechanismExplainsEffect = new MechanismExplainsEffectImpl();
		return mechanismExplainsEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Support createSupport() {
		SupportImpl support = new SupportImpl();
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attack createAttack() {
		AttackImpl attack = new AttackImpl();
		return attack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentResults createExperimentResults() {
		ExperimentResultsImpl experimentResults = new ExperimentResultsImpl();
		return experimentResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgumentsPackage getArgumentsPackage() {
		return (ArgumentsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArgumentsPackage getPackage() {
		return ArgumentsPackage.eINSTANCE;
	}

} //ArgumentsFactoryImpl
