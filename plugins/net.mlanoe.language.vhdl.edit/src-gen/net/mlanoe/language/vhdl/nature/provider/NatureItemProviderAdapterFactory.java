/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.nature.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.mlanoe.language.vhdl.nature.util.NatureAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NatureItemProviderAdapterFactory extends NatureAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public NatureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.nature.ArrayNatureDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayNatureDefinitionItemProvider arrayNatureDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.nature.ArrayNatureDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArrayNatureDefinitionAdapter() {
		if (arrayNatureDefinitionItemProvider == null) {
			arrayNatureDefinitionItemProvider = new ArrayNatureDefinitionItemProvider(this);
		}

		return arrayNatureDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.nature.CompositeNatureDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeNatureDefinitionItemProvider compositeNatureDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.nature.CompositeNatureDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeNatureDefinitionAdapter() {
		if (compositeNatureDefinitionItemProvider == null) {
			compositeNatureDefinitionItemProvider = new CompositeNatureDefinitionItemProvider(this);
		}

		return compositeNatureDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.nature.ConstrainedArrayNatureDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstrainedArrayNatureDefinitionItemProvider constrainedArrayNatureDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.nature.ConstrainedArrayNatureDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstrainedArrayNatureDefinitionAdapter() {
		if (constrainedArrayNatureDefinitionItemProvider == null) {
			constrainedArrayNatureDefinitionItemProvider = new ConstrainedArrayNatureDefinitionItemProvider(this);
		}

		return constrainedArrayNatureDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.nature.NatureDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NatureDefinitionItemProvider natureDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.nature.NatureDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNatureDefinitionAdapter() {
		if (natureDefinitionItemProvider == null) {
			natureDefinitionItemProvider = new NatureDefinitionItemProvider(this);
		}

		return natureDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.nature.RecordNatureDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordNatureDefinitionItemProvider recordNatureDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.nature.RecordNatureDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecordNatureDefinitionAdapter() {
		if (recordNatureDefinitionItemProvider == null) {
			recordNatureDefinitionItemProvider = new RecordNatureDefinitionItemProvider(this);
		}

		return recordNatureDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.nature.RecordNatureElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordNatureElementItemProvider recordNatureElementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.nature.RecordNatureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecordNatureElementAdapter() {
		if (recordNatureElementItemProvider == null) {
			recordNatureElementItemProvider = new RecordNatureElementItemProvider(this);
		}

		return recordNatureElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.nature.ScalarNatureDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalarNatureDefinitionItemProvider scalarNatureDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.nature.ScalarNatureDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScalarNatureDefinitionAdapter() {
		if (scalarNatureDefinitionItemProvider == null) {
			scalarNatureDefinitionItemProvider = new ScalarNatureDefinitionItemProvider(this);
		}

		return scalarNatureDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.nature.UnconstrainedArrayNatureDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnconstrainedArrayNatureDefinitionItemProvider unconstrainedArrayNatureDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.nature.UnconstrainedArrayNatureDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnconstrainedArrayNatureDefinitionAdapter() {
		if (unconstrainedArrayNatureDefinitionItemProvider == null) {
			unconstrainedArrayNatureDefinitionItemProvider = new UnconstrainedArrayNatureDefinitionItemProvider(this);
		}

		return unconstrainedArrayNatureDefinitionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
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
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void dispose() {
		if (arrayNatureDefinitionItemProvider != null) arrayNatureDefinitionItemProvider.dispose();
		if (compositeNatureDefinitionItemProvider != null) compositeNatureDefinitionItemProvider.dispose();
		if (constrainedArrayNatureDefinitionItemProvider != null) constrainedArrayNatureDefinitionItemProvider.dispose();
		if (natureDefinitionItemProvider != null) natureDefinitionItemProvider.dispose();
		if (recordNatureDefinitionItemProvider != null) recordNatureDefinitionItemProvider.dispose();
		if (recordNatureElementItemProvider != null) recordNatureElementItemProvider.dispose();
		if (scalarNatureDefinitionItemProvider != null) scalarNatureDefinitionItemProvider.dispose();
		if (unconstrainedArrayNatureDefinitionItemProvider != null) unconstrainedArrayNatureDefinitionItemProvider.dispose();
	}

}
