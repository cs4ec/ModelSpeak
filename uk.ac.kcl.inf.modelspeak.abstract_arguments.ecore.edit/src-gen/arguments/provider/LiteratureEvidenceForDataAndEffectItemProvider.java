/**
 */
package arguments.provider;

import arguments.ArgumentsPackage;
import arguments.LiteratureEvidenceForDataAndEffect;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arguments.LiteratureEvidenceForDataAndEffect} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteratureEvidenceForDataAndEffectItemProvider extends LiteratureEvidenceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteratureEvidenceForDataAndEffectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addObservedDataOverTimePropertyDescriptor(object);
			addDescribedEffectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Observed Data Over Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObservedDataOverTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LiteratureEvidenceForDataAndEffect_observedDataOverTime_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LiteratureEvidenceForDataAndEffect_observedDataOverTime_feature",
						"_UI_LiteratureEvidenceForDataAndEffect_type"),
				ArgumentsPackage.Literals.LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT__OBSERVED_DATA_OVER_TIME, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Described Effect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescribedEffectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LiteratureEvidenceForDataAndEffect_describedEffect_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LiteratureEvidenceForDataAndEffect_describedEffect_feature",
						"_UI_LiteratureEvidenceForDataAndEffect_type"),
				ArgumentsPackage.Literals.LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT__DESCRIBED_EFFECT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns LiteratureEvidenceForDataAndEffect.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LiteratureEvidenceForDataAndEffect"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LiteratureEvidenceForDataAndEffect) object).getReference();
		return label == null || label.length() == 0 ? getString("_UI_LiteratureEvidenceForDataAndEffect_type")
				: getString("_UI_LiteratureEvidenceForDataAndEffect_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LiteratureEvidenceForDataAndEffect.class)) {
		case ArgumentsPackage.LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT__OBSERVED_DATA_OVER_TIME:
		case ArgumentsPackage.LITERATURE_EVIDENCE_FOR_DATA_AND_EFFECT__DESCRIBED_EFFECT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
