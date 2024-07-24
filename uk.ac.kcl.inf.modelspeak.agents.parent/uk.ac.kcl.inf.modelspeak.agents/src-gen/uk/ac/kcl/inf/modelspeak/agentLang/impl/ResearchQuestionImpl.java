/**
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.agentLang.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.modelspeak.agentLang.AgentLangPackage;
import uk.ac.kcl.inf.modelspeak.agentLang.ResearchQuestion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.impl.ResearchQuestionImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.agentLang.impl.ResearchQuestionImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchQuestionImpl extends MinimalEObjectImpl.Container implements ResearchQuestion
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffect()
   * @generated
   * @ordered
   */
  protected static final String EFFECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffect()
   * @generated
   * @ordered
   */
  protected String effect = EFFECT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResearchQuestionImpl()
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
    return AgentLangPackage.Literals.RESEARCH_QUESTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgentLangPackage.RESEARCH_QUESTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEffect()
  {
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEffect(String newEffect)
  {
    String oldEffect = effect;
    effect = newEffect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgentLangPackage.RESEARCH_QUESTION__EFFECT, oldEffect, effect));
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
      case AgentLangPackage.RESEARCH_QUESTION__NAME:
        return getName();
      case AgentLangPackage.RESEARCH_QUESTION__EFFECT:
        return getEffect();
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
      case AgentLangPackage.RESEARCH_QUESTION__NAME:
        setName((String)newValue);
        return;
      case AgentLangPackage.RESEARCH_QUESTION__EFFECT:
        setEffect((String)newValue);
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
      case AgentLangPackage.RESEARCH_QUESTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AgentLangPackage.RESEARCH_QUESTION__EFFECT:
        setEffect(EFFECT_EDEFAULT);
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
      case AgentLangPackage.RESEARCH_QUESTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AgentLangPackage.RESEARCH_QUESTION__EFFECT:
        return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", effect: ");
    result.append(effect);
    result.append(')');
    return result.toString();
  }

} //ResearchQuestionImpl