/**
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.agentLang.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.kcl.inf.modelspeak.agentLang.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage
 * @generated
 */
public class AgentLangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AgentLangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgentLangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AgentLangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AgentLangSwitch<Adapter> modelSwitch =
    new AgentLangSwitch<Adapter>()
    {
      @Override
      public Adapter caseGame(Game object)
      {
        return createGameAdapter();
      }
      @Override
      public Adapter caseMove(Move object)
      {
        return createMoveAdapter();
      }
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseRequirement(Requirement object)
      {
        return createRequirementAdapter();
      }
      @Override
      public Adapter caseExperiment(Experiment object)
      {
        return createExperimentAdapter();
      }
      @Override
      public Adapter caseTheory(Theory object)
      {
        return createTheoryAdapter();
      }
      @Override
      public Adapter caseProposeRequirement(ProposeRequirement object)
      {
        return createProposeRequirementAdapter();
      }
      @Override
      public Adapter caseAttackRequirement(AttackRequirement object)
      {
        return createAttackRequirementAdapter();
      }
      @Override
      public Adapter caseRedefineRequirement(RedefineRequirement object)
      {
        return createRedefineRequirementAdapter();
      }
      @Override
      public Adapter caseRetractRequirement(RetractRequirement object)
      {
        return createRetractRequirementAdapter();
      }
      @Override
      public Adapter caseSupportRequirement(SupportRequirement object)
      {
        return createSupportRequirementAdapter();
      }
      @Override
      public Adapter caseProposeModel(ProposeModel object)
      {
        return createProposeModelAdapter();
      }
      @Override
      public Adapter caseSupportModel(SupportModel object)
      {
        return createSupportModelAdapter();
      }
      @Override
      public Adapter caseReplaceModel(ReplaceModel object)
      {
        return createReplaceModelAdapter();
      }
      @Override
      public Adapter caseCounterModel(CounterModel object)
      {
        return createCounterModelAdapter();
      }
      @Override
      public Adapter caseAttackModel(AttackModel object)
      {
        return createAttackModelAdapter();
      }
      @Override
      public Adapter caseReviseRequirement(ReviseRequirement object)
      {
        return createReviseRequirementAdapter();
      }
      @Override
      public Adapter caseProposeExperiment(ProposeExperiment object)
      {
        return createProposeExperimentAdapter();
      }
      @Override
      public Adapter caseSupportExperiment(SupportExperiment object)
      {
        return createSupportExperimentAdapter();
      }
      @Override
      public Adapter caseAttackExperiment(AttackExperiment object)
      {
        return createAttackExperimentAdapter();
      }
      @Override
      public Adapter caseRetractExperiment(RetractExperiment object)
      {
        return createRetractExperimentAdapter();
      }
      @Override
      public Adapter caseStudyDone(StudyDone object)
      {
        return createStudyDoneAdapter();
      }
      @Override
      public Adapter caseNotConvinced(NotConvinced object)
      {
        return createNotConvincedAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.Game <em>Game</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.Game
   * @generated
   */
  public Adapter createGameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.Move <em>Move</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.Move
   * @generated
   */
  public Adapter createMoveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.Requirement
   * @generated
   */
  public Adapter createRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.Experiment <em>Experiment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.Experiment
   * @generated
   */
  public Adapter createExperimentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.Theory <em>Theory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.Theory
   * @generated
   */
  public Adapter createTheoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.ProposeRequirement <em>Propose Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.ProposeRequirement
   * @generated
   */
  public Adapter createProposeRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.AttackRequirement <em>Attack Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.AttackRequirement
   * @generated
   */
  public Adapter createAttackRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.RedefineRequirement <em>Redefine Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.RedefineRequirement
   * @generated
   */
  public Adapter createRedefineRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.RetractRequirement <em>Retract Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.RetractRequirement
   * @generated
   */
  public Adapter createRetractRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.SupportRequirement <em>Support Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.SupportRequirement
   * @generated
   */
  public Adapter createSupportRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.ProposeModel <em>Propose Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.ProposeModel
   * @generated
   */
  public Adapter createProposeModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.SupportModel <em>Support Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.SupportModel
   * @generated
   */
  public Adapter createSupportModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.ReplaceModel <em>Replace Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.ReplaceModel
   * @generated
   */
  public Adapter createReplaceModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.CounterModel <em>Counter Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.CounterModel
   * @generated
   */
  public Adapter createCounterModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.AttackModel <em>Attack Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.AttackModel
   * @generated
   */
  public Adapter createAttackModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.ReviseRequirement <em>Revise Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.ReviseRequirement
   * @generated
   */
  public Adapter createReviseRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.ProposeExperiment <em>Propose Experiment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.ProposeExperiment
   * @generated
   */
  public Adapter createProposeExperimentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.SupportExperiment <em>Support Experiment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.SupportExperiment
   * @generated
   */
  public Adapter createSupportExperimentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.AttackExperiment <em>Attack Experiment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.AttackExperiment
   * @generated
   */
  public Adapter createAttackExperimentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.RetractExperiment <em>Retract Experiment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.RetractExperiment
   * @generated
   */
  public Adapter createRetractExperimentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.StudyDone <em>Study Done</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.StudyDone
   * @generated
   */
  public Adapter createStudyDoneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.modelspeak.agentLang.NotConvinced <em>Not Convinced</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.modelspeak.agentLang.NotConvinced
   * @generated
   */
  public Adapter createNotConvincedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AgentLangAdapterFactory