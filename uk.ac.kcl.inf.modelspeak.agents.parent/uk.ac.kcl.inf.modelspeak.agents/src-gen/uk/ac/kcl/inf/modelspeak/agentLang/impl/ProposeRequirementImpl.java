/**
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.agentLang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage;
import uk.ac.kcl.inf.modelspeak.agentLang.ProposeRequirement;
import uk.ac.kcl.inf.modelspeak.agentLang.Requirement;
import uk.ac.kcl.inf.modelspeak.agentLang.ResearchQuestion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propose Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.impl.ProposeRequirementImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.impl.ProposeRequirementImpl#getRq <em>Rq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProposeRequirementImpl extends MoveImpl implements ProposeRequirement
{
  /**
   * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirement()
   * @generated
   * @ordered
   */
  protected Requirement requirement;

  /**
   * The cached value of the '{@link #getRq() <em>Rq</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRq()
   * @generated
   * @ordered
   */
  protected ResearchQuestion rq;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProposeRequirementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AgentLangPackage.Literals.PROPOSE_REQUIREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Requirement getRequirement()
  {
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequirement(Requirement newRequirement, NotificationChain msgs)
  {
    Requirement oldRequirement = requirement;
    requirement = newRequirement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgentLangPackage.PROPOSE_REQUIREMENT__REQUIREMENT, oldRequirement, newRequirement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRequirement(Requirement newRequirement)
  {
    if (newRequirement != requirement)
    {
      NotificationChain msgs = null;
      if (requirement != null)
        msgs = ((InternalEObject)requirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgentLangPackage.PROPOSE_REQUIREMENT__REQUIREMENT, null, msgs);
      if (newRequirement != null)
        msgs = ((InternalEObject)newRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgentLangPackage.PROPOSE_REQUIREMENT__REQUIREMENT, null, msgs);
      msgs = basicSetRequirement(newRequirement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgentLangPackage.PROPOSE_REQUIREMENT__REQUIREMENT, newRequirement, newRequirement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResearchQuestion getRq()
  {
    if (rq != null && rq.eIsProxy())
    {
      InternalEObject oldRq = (InternalEObject)rq;
      rq = (ResearchQuestion)eResolveProxy(oldRq);
      if (rq != oldRq)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgentLangPackage.PROPOSE_REQUIREMENT__RQ, oldRq, rq));
      }
    }
    return rq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResearchQuestion basicGetRq()
  {
    return rq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRq(ResearchQuestion newRq)
  {
    ResearchQuestion oldRq = rq;
    rq = newRq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgentLangPackage.PROPOSE_REQUIREMENT__RQ, oldRq, rq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AgentLangPackage.PROPOSE_REQUIREMENT__REQUIREMENT:
        return basicSetRequirement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AgentLangPackage.PROPOSE_REQUIREMENT__REQUIREMENT:
        return getRequirement();
      case AgentLangPackage.PROPOSE_REQUIREMENT__RQ:
        if (resolve) return getRq();
        return basicGetRq();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AgentLangPackage.PROPOSE_REQUIREMENT__REQUIREMENT:
        setRequirement((Requirement)newValue);
        return;
      case AgentLangPackage.PROPOSE_REQUIREMENT__RQ:
        setRq((ResearchQuestion)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AgentLangPackage.PROPOSE_REQUIREMENT__REQUIREMENT:
        setRequirement((Requirement)null);
        return;
      case AgentLangPackage.PROPOSE_REQUIREMENT__RQ:
        setRq((ResearchQuestion)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AgentLangPackage.PROPOSE_REQUIREMENT__REQUIREMENT:
        return requirement != null;
      case AgentLangPackage.PROPOSE_REQUIREMENT__RQ:
        return rq != null;
    }
    return super.eIsSet(featureID);
  }

} //ProposeRequirementImpl
