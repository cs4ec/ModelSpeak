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
import uk.ac.kcl.inf.modelspeak.agentLang.Model;
import uk.ac.kcl.inf.modelspeak.agentLang.ReplaceModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replace Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.impl.ReplaceModelImpl#getModel <em>Model</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.impl.ReplaceModelImpl#getNewModel <em>New Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplaceModelImpl extends MoveImpl implements ReplaceModel
{
  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected Model model;

  /**
   * The cached value of the '{@link #getNewModel() <em>New Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewModel()
   * @generated
   * @ordered
   */
  protected Model newModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReplaceModelImpl()
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
    return AgentLangPackage.Literals.REPLACE_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model getModel()
  {
    if (model != null && model.eIsProxy())
    {
      InternalEObject oldModel = (InternalEObject)model;
      model = (Model)eResolveProxy(oldModel);
      if (model != oldModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgentLangPackage.REPLACE_MODEL__MODEL, oldModel, model));
      }
    }
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model basicGetModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModel(Model newModel)
  {
    Model oldModel = model;
    model = newModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgentLangPackage.REPLACE_MODEL__MODEL, oldModel, model));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model getNewModel()
  {
    return newModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNewModel(Model newNewModel, NotificationChain msgs)
  {
    Model oldNewModel = newModel;
    newModel = newNewModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgentLangPackage.REPLACE_MODEL__NEW_MODEL, oldNewModel, newNewModel);
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
  public void setNewModel(Model newNewModel)
  {
    if (newNewModel != newModel)
    {
      NotificationChain msgs = null;
      if (newModel != null)
        msgs = ((InternalEObject)newModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgentLangPackage.REPLACE_MODEL__NEW_MODEL, null, msgs);
      if (newNewModel != null)
        msgs = ((InternalEObject)newNewModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgentLangPackage.REPLACE_MODEL__NEW_MODEL, null, msgs);
      msgs = basicSetNewModel(newNewModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgentLangPackage.REPLACE_MODEL__NEW_MODEL, newNewModel, newNewModel));
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
      case AgentLangPackage.REPLACE_MODEL__NEW_MODEL:
        return basicSetNewModel(null, msgs);
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
      case AgentLangPackage.REPLACE_MODEL__MODEL:
        if (resolve) return getModel();
        return basicGetModel();
      case AgentLangPackage.REPLACE_MODEL__NEW_MODEL:
        return getNewModel();
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
      case AgentLangPackage.REPLACE_MODEL__MODEL:
        setModel((Model)newValue);
        return;
      case AgentLangPackage.REPLACE_MODEL__NEW_MODEL:
        setNewModel((Model)newValue);
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
      case AgentLangPackage.REPLACE_MODEL__MODEL:
        setModel((Model)null);
        return;
      case AgentLangPackage.REPLACE_MODEL__NEW_MODEL:
        setNewModel((Model)null);
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
      case AgentLangPackage.REPLACE_MODEL__MODEL:
        return model != null;
      case AgentLangPackage.REPLACE_MODEL__NEW_MODEL:
        return newModel != null;
    }
    return super.eIsSet(featureID);
  }

} //ReplaceModelImpl
