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
import org.xtext.example.mod.modellingSpeak.RedefineRequirement;
import org.xtext.example.mod.modellingSpeak.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redefine Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mod.modellingSpeak.impl.RedefineRequirementImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.xtext.example.mod.modellingSpeak.impl.RedefineRequirementImpl#getNewRequirement <em>New Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedefineRequirementImpl extends MoveImpl implements RedefineRequirement
{
  /**
   * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirement()
   * @generated
   * @ordered
   */
  protected Requirement requirement;

  /**
   * The cached value of the '{@link #getNewRequirement() <em>New Requirement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewRequirement()
   * @generated
   * @ordered
   */
  protected Requirement newRequirement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RedefineRequirementImpl()
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
    return ModellingSpeakPackage.Literals.REDEFINE_REQUIREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Requirement getRequirement()
  {
    if (requirement != null && requirement.eIsProxy())
    {
      InternalEObject oldRequirement = (InternalEObject)requirement;
      requirement = (Requirement)eResolveProxy(oldRequirement);
      if (requirement != oldRequirement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModellingSpeakPackage.REDEFINE_REQUIREMENT__REQUIREMENT, oldRequirement, requirement));
      }
    }
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement basicGetRequirement()
  {
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRequirement(Requirement newRequirement)
  {
    Requirement oldRequirement = requirement;
    requirement = newRequirement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModellingSpeakPackage.REDEFINE_REQUIREMENT__REQUIREMENT, oldRequirement, requirement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Requirement getNewRequirement()
  {
    return newRequirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNewRequirement(Requirement newNewRequirement, NotificationChain msgs)
  {
    Requirement oldNewRequirement = newRequirement;
    newRequirement = newNewRequirement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModellingSpeakPackage.REDEFINE_REQUIREMENT__NEW_REQUIREMENT, oldNewRequirement, newNewRequirement);
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
  public void setNewRequirement(Requirement newNewRequirement)
  {
    if (newNewRequirement != newRequirement)
    {
      NotificationChain msgs = null;
      if (newRequirement != null)
        msgs = ((InternalEObject)newRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModellingSpeakPackage.REDEFINE_REQUIREMENT__NEW_REQUIREMENT, null, msgs);
      if (newNewRequirement != null)
        msgs = ((InternalEObject)newNewRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModellingSpeakPackage.REDEFINE_REQUIREMENT__NEW_REQUIREMENT, null, msgs);
      msgs = basicSetNewRequirement(newNewRequirement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModellingSpeakPackage.REDEFINE_REQUIREMENT__NEW_REQUIREMENT, newNewRequirement, newNewRequirement));
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
      case ModellingSpeakPackage.REDEFINE_REQUIREMENT__NEW_REQUIREMENT:
        return basicSetNewRequirement(null, msgs);
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
      case ModellingSpeakPackage.REDEFINE_REQUIREMENT__REQUIREMENT:
        if (resolve) return getRequirement();
        return basicGetRequirement();
      case ModellingSpeakPackage.REDEFINE_REQUIREMENT__NEW_REQUIREMENT:
        return getNewRequirement();
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
      case ModellingSpeakPackage.REDEFINE_REQUIREMENT__REQUIREMENT:
        setRequirement((Requirement)newValue);
        return;
      case ModellingSpeakPackage.REDEFINE_REQUIREMENT__NEW_REQUIREMENT:
        setNewRequirement((Requirement)newValue);
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
      case ModellingSpeakPackage.REDEFINE_REQUIREMENT__REQUIREMENT:
        setRequirement((Requirement)null);
        return;
      case ModellingSpeakPackage.REDEFINE_REQUIREMENT__NEW_REQUIREMENT:
        setNewRequirement((Requirement)null);
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
      case ModellingSpeakPackage.REDEFINE_REQUIREMENT__REQUIREMENT:
        return requirement != null;
      case ModellingSpeakPackage.REDEFINE_REQUIREMENT__NEW_REQUIREMENT:
        return newRequirement != null;
    }
    return super.eIsSet(featureID);
  }

} //RedefineRequirementImpl
