/**
 */
package uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgument;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsPackage;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Argument Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentFrameworkImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentFrameworkImpl#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.impl.AbstractArgumentFrameworkImpl#getArgumentgraph <em>Argumentgraph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractArgumentFrameworkImpl extends MinimalEObjectImpl.Container implements AbstractArgumentFramework {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractArgument> arguments;

	/**
	 * The cached value of the '{@link #getAttacks() <em>Attacks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttacks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractArgumentAttack> attacks;

	/**
	 * The cached value of the '{@link #getArgumentgraph() <em>Argumentgraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentgraph()
	 * @generated
	 * @ordered
	 */
	protected ArgumentGraph argumentgraph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractArgumentFrameworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Abstract_argumentsPackage.Literals.ABSTRACT_ARGUMENT_FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractArgument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<AbstractArgument>(AbstractArgument.class, this,
					Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractArgumentAttack> getAttacks() {
		if (attacks == null) {
			attacks = new EObjectContainmentEList<AbstractArgumentAttack>(AbstractArgumentAttack.class, this,
					Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ATTACKS);
		}
		return attacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgumentGraph getArgumentgraph() {
		if (argumentgraph != null && argumentgraph.eIsProxy()) {
			InternalEObject oldArgumentgraph = (InternalEObject) argumentgraph;
			argumentgraph = (ArgumentGraph) eResolveProxy(oldArgumentgraph);
			if (argumentgraph != oldArgumentgraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTGRAPH, oldArgumentgraph,
							argumentgraph));
			}
		}
		return argumentgraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentGraph basicGetArgumentgraph() {
		return argumentgraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgumentgraph(ArgumentGraph newArgumentgraph) {
		ArgumentGraph oldArgumentgraph = argumentgraph;
		argumentgraph = newArgumentgraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTGRAPH, oldArgumentgraph,
					argumentgraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTS:
			return ((InternalEList<?>) getArguments()).basicRemove(otherEnd, msgs);
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ATTACKS:
			return ((InternalEList<?>) getAttacks()).basicRemove(otherEnd, msgs);
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
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTS:
			return getArguments();
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ATTACKS:
			return getAttacks();
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTGRAPH:
			if (resolve)
				return getArgumentgraph();
			return basicGetArgumentgraph();
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
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTS:
			getArguments().clear();
			getArguments().addAll((Collection<? extends AbstractArgument>) newValue);
			return;
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ATTACKS:
			getAttacks().clear();
			getAttacks().addAll((Collection<? extends AbstractArgumentAttack>) newValue);
			return;
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTGRAPH:
			setArgumentgraph((ArgumentGraph) newValue);
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
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTS:
			getArguments().clear();
			return;
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ATTACKS:
			getAttacks().clear();
			return;
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTGRAPH:
			setArgumentgraph((ArgumentGraph) null);
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
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTS:
			return arguments != null && !arguments.isEmpty();
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ATTACKS:
			return attacks != null && !attacks.isEmpty();
		case Abstract_argumentsPackage.ABSTRACT_ARGUMENT_FRAMEWORK__ARGUMENTGRAPH:
			return argumentgraph != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractArgumentFrameworkImpl
