/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElement;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentGraphImpl#getArgumentElements <em>Argument Elements</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentGraphImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentGraphImpl extends MinimalEObjectImpl.Container implements ArgumentGraph {
	/**
	 * The cached value of the '{@link #getArgumentElements() <em>Argument Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentElement> argumentElements;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentElementRelation> relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentsPackage.Literals.ARGUMENT_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArgumentElement> getArgumentElements() {
		if (argumentElements == null) {
			argumentElements = new EObjectContainmentEList<ArgumentElement>(ArgumentElement.class, this,
					ArgumentsPackage.ARGUMENT_GRAPH__ARGUMENT_ELEMENTS);
		}
		return argumentElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArgumentElementRelation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<ArgumentElementRelation>(ArgumentElementRelation.class, this,
					ArgumentsPackage.ARGUMENT_GRAPH__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArgumentsPackage.ARGUMENT_GRAPH__ARGUMENT_ELEMENTS:
			return ((InternalEList<?>) getArgumentElements()).basicRemove(otherEnd, msgs);
		case ArgumentsPackage.ARGUMENT_GRAPH__RELATIONS:
			return ((InternalEList<?>) getRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArgumentsPackage.ARGUMENT_GRAPH__ARGUMENT_ELEMENTS:
			return getArgumentElements();
		case ArgumentsPackage.ARGUMENT_GRAPH__RELATIONS:
			return getRelations();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArgumentsPackage.ARGUMENT_GRAPH__ARGUMENT_ELEMENTS:
			getArgumentElements().clear();
			getArgumentElements().addAll((Collection<? extends ArgumentElement>) newValue);
			return;
		case ArgumentsPackage.ARGUMENT_GRAPH__RELATIONS:
			getRelations().clear();
			getRelations().addAll((Collection<? extends ArgumentElementRelation>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArgumentsPackage.ARGUMENT_GRAPH__ARGUMENT_ELEMENTS:
			getArgumentElements().clear();
			return;
		case ArgumentsPackage.ARGUMENT_GRAPH__RELATIONS:
			getRelations().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArgumentsPackage.ARGUMENT_GRAPH__ARGUMENT_ELEMENTS:
			return argumentElements != null && !argumentElements.isEmpty();
		case ArgumentsPackage.ARGUMENT_GRAPH__RELATIONS:
			return relations != null && !relations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentGraphImpl
