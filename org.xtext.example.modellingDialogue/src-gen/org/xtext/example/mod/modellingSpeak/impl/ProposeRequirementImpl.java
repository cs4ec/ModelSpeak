/**
 * generated by Xtext 2.35.0
 */
package org.xtext.example.mod.modellingSpeak.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mod.modellingSpeak.ModellingSpeakPackage;
import org.xtext.example.mod.modellingSpeak.ProposeRequirement;
import org.xtext.example.mod.modellingSpeak.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propose Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mod.modellingSpeak.impl.ProposeRequirementImpl#getRequirement <em>Requirement</em>}</li>
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
    return ModellingSpeakPackage.Literals.PROPOSE_REQUIREMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModellingSpeakPackage.PROPOSE_REQUIREMENT__REQUIREMENT, oldRequirement, newRequirement);
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
        msgs = ((InternalEObject)requirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModellingSpeakPackage.PROPOSE_REQUIREMENT__REQUIREMENT, null, msgs);
      if (newRequirement != null)
        msgs = ((InternalEObject)newRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModellingSpeakPackage.PROPOSE_REQUIREMENT__REQUIREMENT, null, msgs);
      msgs = basicSetRequirement(newRequirement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModellingSpeakPackage.PROPOSE_REQUIREMENT__REQUIREMENT, newRequirement, newRequirement));
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
      case ModellingSpeakPackage.PROPOSE_REQUIREMENT__REQUIREMENT:
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
      case ModellingSpeakPackage.PROPOSE_REQUIREMENT__REQUIREMENT:
        return getRequirement();
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
      case ModellingSpeakPackage.PROPOSE_REQUIREMENT__REQUIREMENT:
        setRequirement((Requirement)newValue);
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
      case ModellingSpeakPackage.PROPOSE_REQUIREMENT__REQUIREMENT:
        setRequirement((Requirement)null);
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
      case ModellingSpeakPackage.PROPOSE_REQUIREMENT__REQUIREMENT:
        return requirement != null;
    }
    return super.eIsSet(featureID);
  }

} //ProposeRequirementImpl
