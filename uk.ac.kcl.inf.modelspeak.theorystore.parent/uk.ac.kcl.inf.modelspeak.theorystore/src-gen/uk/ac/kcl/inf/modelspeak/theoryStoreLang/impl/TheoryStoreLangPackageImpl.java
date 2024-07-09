/**
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.theoryStoreLang.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Element;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Experiment;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Model;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Requirement;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Theory;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStore;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStoreLangFactory;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStoreLangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TheoryStoreLangPackageImpl extends EPackageImpl implements TheoryStoreLangPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass theoryStoreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass theoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass experimentEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStoreLangPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TheoryStoreLangPackageImpl()
  {
    super(eNS_URI, TheoryStoreLangFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link TheoryStoreLangPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TheoryStoreLangPackage init()
  {
    if (isInited) return (TheoryStoreLangPackage)EPackage.Registry.INSTANCE.getEPackage(TheoryStoreLangPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredTheoryStoreLangPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    TheoryStoreLangPackageImpl theTheoryStoreLangPackage = registeredTheoryStoreLangPackage instanceof TheoryStoreLangPackageImpl ? (TheoryStoreLangPackageImpl)registeredTheoryStoreLangPackage : new TheoryStoreLangPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theTheoryStoreLangPackage.createPackageContents();

    // Initialize created meta-data
    theTheoryStoreLangPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTheoryStoreLangPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TheoryStoreLangPackage.eNS_URI, theTheoryStoreLangPackage);
    return theTheoryStoreLangPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTheoryStore()
  {
    return theoryStoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTheoryStore_Elements()
  {
    return (EReference)theoryStoreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getElement_Name()
  {
    return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getElement_Content()
  {
    return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Requirements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTheory()
  {
    return theoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTheory_Elements()
  {
    return (EReference)theoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRequirement()
  {
    return requirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExperiment()
  {
    return experimentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExperiment_Model()
  {
    return (EReference)experimentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExperiment_Requirements()
  {
    return (EReference)experimentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TheoryStoreLangFactory getTheoryStoreLangFactory()
  {
    return (TheoryStoreLangFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    theoryStoreEClass = createEClass(THEORY_STORE);
    createEReference(theoryStoreEClass, THEORY_STORE__ELEMENTS);

    elementEClass = createEClass(ELEMENT);
    createEAttribute(elementEClass, ELEMENT__NAME);
    createEAttribute(elementEClass, ELEMENT__CONTENT);

    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__REQUIREMENTS);

    theoryEClass = createEClass(THEORY);
    createEReference(theoryEClass, THEORY__ELEMENTS);

    requirementEClass = createEClass(REQUIREMENT);

    experimentEClass = createEClass(EXPERIMENT);
    createEReference(experimentEClass, EXPERIMENT__MODEL);
    createEReference(experimentEClass, EXPERIMENT__REQUIREMENTS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    modelEClass.getESuperTypes().add(this.getElement());
    theoryEClass.getESuperTypes().add(this.getElement());
    requirementEClass.getESuperTypes().add(this.getElement());
    experimentEClass.getESuperTypes().add(this.getElement());

    // Initialize classes and features; add operations and parameters
    initEClass(theoryStoreEClass, TheoryStore.class, "TheoryStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTheoryStore_Elements(), this.getElement(), null, "elements", null, 0, -1, TheoryStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElement_Content(), ecorePackage.getEString(), "content", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(theoryEClass, Theory.class, "Theory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTheory_Elements(), this.getElement(), null, "elements", null, 0, -1, Theory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(experimentEClass, Experiment.class, "Experiment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExperiment_Model(), this.getModel(), null, "model", null, 0, -1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperiment_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TheoryStoreLangPackageImpl
