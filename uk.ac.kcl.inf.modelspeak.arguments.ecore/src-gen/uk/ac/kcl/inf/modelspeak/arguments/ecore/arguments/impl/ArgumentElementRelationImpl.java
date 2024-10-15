/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElement;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Element Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentElementRelationImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentElementRelationImpl#getWarrant <em>Warrant</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentElementRelationImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.impl.ArgumentElementRelationImpl#getRebuttalConditions <em>Rebuttal Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArgumentElementRelationImpl extends MinimalEObjectImpl.Container
		implements ArgumentElementRelation {
	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected ArgumentElement evidence;

	/**
	 * The cached value of the '{@link #getWarrant() <em>Warrant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrant()
	 * @generated
	 * @ordered
	 */
	protected ArgumentElement warrant;

	/**
	 * The cached value of the '{@link #getClaim() <em>Claim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaim()
	 * @generated
	 * @ordered
	 */
	protected ArgumentElement claim;

	/**
	 * The cached value of the '{@link #getRebuttalConditions() <em>Rebuttal Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRebuttalConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentElement> rebuttalConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentElementRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentsPackage.Literals.ARGUMENT_ELEMENT_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgumentElement getEvidence() {
		if (evidence != null && evidence.eIsProxy()) {
			InternalEObject oldEvidence = (InternalEObject) evidence;
			evidence = (ArgumentElement) eResolveProxy(oldEvidence);
			if (evidence != oldEvidence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__EVIDENCE, oldEvidence, evidence));
			}
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentElement basicGetEvidence() {
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvidence(ArgumentElement newEvidence) {
		ArgumentElement oldEvidence = evidence;
		evidence = newEvidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__EVIDENCE,
					oldEvidence, evidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgumentElement getWarrant() {
		if (warrant != null && warrant.eIsProxy()) {
			InternalEObject oldWarrant = (InternalEObject) warrant;
			warrant = (ArgumentElement) eResolveProxy(oldWarrant);
			if (warrant != oldWarrant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__WARRANT, oldWarrant, warrant));
			}
		}
		return warrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentElement basicGetWarrant() {
		return warrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWarrant(ArgumentElement newWarrant) {
		ArgumentElement oldWarrant = warrant;
		warrant = newWarrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__WARRANT,
					oldWarrant, warrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgumentElement getClaim() {
		if (claim != null && claim.eIsProxy()) {
			InternalEObject oldClaim = (InternalEObject) claim;
			claim = (ArgumentElement) eResolveProxy(oldClaim);
			if (claim != oldClaim) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__CLAIM, oldClaim, claim));
			}
		}
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentElement basicGetClaim() {
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClaim(ArgumentElement newClaim) {
		ArgumentElement oldClaim = claim;
		claim = newClaim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__CLAIM,
					oldClaim, claim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArgumentElement> getRebuttalConditions() {
		if (rebuttalConditions == null) {
			rebuttalConditions = new EObjectResolvingEList<ArgumentElement>(ArgumentElement.class, this,
					ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__REBUTTAL_CONDITIONS);
		}
		return rebuttalConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__EVIDENCE:
			if (resolve)
				return getEvidence();
			return basicGetEvidence();
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__WARRANT:
			if (resolve)
				return getWarrant();
			return basicGetWarrant();
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__CLAIM:
			if (resolve)
				return getClaim();
			return basicGetClaim();
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__REBUTTAL_CONDITIONS:
			return getRebuttalConditions();
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
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__EVIDENCE:
			setEvidence((ArgumentElement) newValue);
			return;
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__WARRANT:
			setWarrant((ArgumentElement) newValue);
			return;
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__CLAIM:
			setClaim((ArgumentElement) newValue);
			return;
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__REBUTTAL_CONDITIONS:
			getRebuttalConditions().clear();
			getRebuttalConditions().addAll((Collection<? extends ArgumentElement>) newValue);
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
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__EVIDENCE:
			setEvidence((ArgumentElement) null);
			return;
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__WARRANT:
			setWarrant((ArgumentElement) null);
			return;
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__CLAIM:
			setClaim((ArgumentElement) null);
			return;
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__REBUTTAL_CONDITIONS:
			getRebuttalConditions().clear();
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
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__EVIDENCE:
			return evidence != null;
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__WARRANT:
			return warrant != null;
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__CLAIM:
			return claim != null;
		case ArgumentsPackage.ARGUMENT_ELEMENT_RELATION__REBUTTAL_CONDITIONS:
			return rebuttalConditions != null && !rebuttalConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentElementRelationImpl
