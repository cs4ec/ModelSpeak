/**
 */
package uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.util.ArgumentsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentsItemProviderAdapterFactory extends ArgumentsAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentGraphItemProvider argumentGraphItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentGraphAdapter() {
		if (argumentGraphItemProvider == null) {
			argumentGraphItemProvider = new ArgumentGraphItemProvider(this);
		}

		return argumentGraphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.SimulationMechanismWarrant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationMechanismWarrantItemProvider simulationMechanismWarrantItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.SimulationMechanismWarrant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimulationMechanismWarrantAdapter() {
		if (simulationMechanismWarrantItemProvider == null) {
			simulationMechanismWarrantItemProvider = new SimulationMechanismWarrantItemProvider(this);
		}

		return simulationMechanismWarrantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.StandardSimulationWarrant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardSimulationWarrantItemProvider standardSimulationWarrantItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.StandardSimulationWarrant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStandardSimulationWarrantAdapter() {
		if (standardSimulationWarrantItemProvider == null) {
			standardSimulationWarrantItemProvider = new StandardSimulationWarrantItemProvider(this);
		}

		return standardSimulationWarrantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteratureEvidenceItemProvider literatureEvidenceItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiteratureEvidenceAdapter() {
		if (literatureEvidenceItemProvider == null) {
			literatureEvidenceItemProvider = new LiteratureEvidenceItemProvider(this);
		}

		return literatureEvidenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelMatchesDataOverTimeItemProvider modelMatchesDataOverTimeItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelMatchesDataOverTimeAdapter() {
		if (modelMatchesDataOverTimeItemProvider == null) {
			modelMatchesDataOverTimeItemProvider = new ModelMatchesDataOverTimeItemProvider(this);
		}

		return modelMatchesDataOverTimeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MechanismExplainsEffectItemProvider mechanismExplainsEffectItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMechanismExplainsEffectAdapter() {
		if (mechanismExplainsEffectItemProvider == null) {
			mechanismExplainsEffectItemProvider = new MechanismExplainsEffectItemProvider(this);
		}

		return mechanismExplainsEffectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.Support} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportItemProvider supportItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.Support}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSupportAdapter() {
		if (supportItemProvider == null) {
			supportItemProvider = new SupportItemProvider(this);
		}

		return supportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.Attack} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackItemProvider attackItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.Attack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttackAdapter() {
		if (attackItemProvider == null) {
			attackItemProvider = new AttackItemProvider(this);
		}

		return attackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ExperimentResults} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentResultsItemProvider experimentResultsItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ExperimentResults}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExperimentResultsAdapter() {
		if (experimentResultsItemProvider == null) {
			experimentResultsItemProvider = new ExperimentResultsItemProvider(this);
		}

		return experimentResultsItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (argumentGraphItemProvider != null)
			argumentGraphItemProvider.dispose();
		if (simulationMechanismWarrantItemProvider != null)
			simulationMechanismWarrantItemProvider.dispose();
		if (standardSimulationWarrantItemProvider != null)
			standardSimulationWarrantItemProvider.dispose();
		if (literatureEvidenceItemProvider != null)
			literatureEvidenceItemProvider.dispose();
		if (modelMatchesDataOverTimeItemProvider != null)
			modelMatchesDataOverTimeItemProvider.dispose();
		if (mechanismExplainsEffectItemProvider != null)
			mechanismExplainsEffectItemProvider.dispose();
		if (supportItemProvider != null)
			supportItemProvider.dispose();
		if (attackItemProvider != null)
			attackItemProvider.dispose();
		if (experimentResultsItemProvider != null)
			experimentResultsItemProvider.dispose();
	}

}
