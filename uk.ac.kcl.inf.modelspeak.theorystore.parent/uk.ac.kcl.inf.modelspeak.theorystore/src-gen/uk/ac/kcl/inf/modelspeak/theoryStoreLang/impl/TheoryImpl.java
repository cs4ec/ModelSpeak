/**
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.theoryStoreLang.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Element;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Theory;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStoreLangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.theoryStoreLang.impl.TheoryImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TheoryImpl extends ElementImpl implements Theory
{
  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Element> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TheoryImpl()
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
    return TheoryStoreLangPackage.Literals.THEORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Element> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectResolvingEList<Element>(Element.class, this, TheoryStoreLangPackage.THEORY__ELEMENTS);
    }
    return elements;
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
      case TheoryStoreLangPackage.THEORY__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TheoryStoreLangPackage.THEORY__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Element>)newValue);
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
      case TheoryStoreLangPackage.THEORY__ELEMENTS:
        getElements().clear();
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
      case TheoryStoreLangPackage.THEORY__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TheoryImpl
