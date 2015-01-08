/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.mlanoe.language.vhdl.declaration.util.DeclarationAdapterFactory;

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
public class DeclarationItemProviderAdapterFactory extends DeclarationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public DeclarationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.AliasDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AliasDeclarationItemProvider aliasDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.AliasDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAliasDeclarationAdapter() {
		if (aliasDeclarationItemProvider == null) {
			aliasDeclarationItemProvider = new AliasDeclarationItemProvider(this);
		}

		return aliasDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.AttributeDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDeclarationItemProvider attributeDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.AttributeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeDeclarationAdapter() {
		if (attributeDeclarationItemProvider == null) {
			attributeDeclarationItemProvider = new AttributeDeclarationItemProvider(this);
		}

		return attributeDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.AttributeSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeSpecificationItemProvider attributeSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.AttributeSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeSpecificationAdapter() {
		if (attributeSpecificationItemProvider == null) {
			attributeSpecificationItemProvider = new AttributeSpecificationItemProvider(this);
		}

		return attributeSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchQuantityDeclarationItemProvider branchQuantityDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBranchQuantityDeclarationAdapter() {
		if (branchQuantityDeclarationItemProvider == null) {
			branchQuantityDeclarationItemProvider = new BranchQuantityDeclarationItemProvider(this);
		}

		return branchQuantityDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeQuantityDeclarationItemProvider freeQuantityDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFreeQuantityDeclarationAdapter() {
		if (freeQuantityDeclarationItemProvider == null) {
			freeQuantityDeclarationItemProvider = new FreeQuantityDeclarationItemProvider(this);
		}

		return freeQuantityDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.LimitDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LimitDeclarationItemProvider limitDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.LimitDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLimitDeclarationAdapter() {
		if (limitDeclarationItemProvider == null) {
			limitDeclarationItemProvider = new LimitDeclarationItemProvider(this);
		}

		return limitDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.SourceQuantityDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceQuantityDeclarationItemProvider sourceQuantityDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.SourceQuantityDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceQuantityDeclarationAdapter() {
		if (sourceQuantityDeclarationItemProvider == null) {
			sourceQuantityDeclarationItemProvider = new SourceQuantityDeclarationItemProvider(this);
		}

		return sourceQuantityDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.SubnatureDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubnatureDeclarationItemProvider subnatureDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.SubnatureDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubnatureDeclarationAdapter() {
		if (subnatureDeclarationItemProvider == null) {
			subnatureDeclarationItemProvider = new SubnatureDeclarationItemProvider(this);
		}

		return subnatureDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.ProcedureDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureDeclarationItemProvider procedureDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.ProcedureDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcedureDeclarationAdapter() {
		if (procedureDeclarationItemProvider == null) {
			procedureDeclarationItemProvider = new ProcedureDeclarationItemProvider(this);
		}

		return procedureDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.FunctionDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDeclarationItemProvider functionDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.FunctionDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionDeclarationAdapter() {
		if (functionDeclarationItemProvider == null) {
			functionDeclarationItemProvider = new FunctionDeclarationItemProvider(this);
		}

		return functionDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.SubprogramBody} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramBodyItemProvider subprogramBodyItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.SubprogramBody}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubprogramBodyAdapter() {
		if (subprogramBodyItemProvider == null) {
			subprogramBodyItemProvider = new SubprogramBodyItemProvider(this);
		}

		return subprogramBodyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.SubtypeDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtypeDeclarationItemProvider subtypeDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.SubtypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubtypeDeclarationAdapter() {
		if (subtypeDeclarationItemProvider == null) {
			subtypeDeclarationItemProvider = new SubtypeDeclarationItemProvider(this);
		}

		return subtypeDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationSpecificationItemProvider configurationSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigurationSpecificationAdapter() {
		if (configurationSpecificationItemProvider == null) {
			configurationSpecificationItemProvider = new ConfigurationSpecificationItemProvider(this);
		}

		return configurationSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.DisconnectionSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisconnectionSpecificationItemProvider disconnectionSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.DisconnectionSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDisconnectionSpecificationAdapter() {
		if (disconnectionSpecificationItemProvider == null) {
			disconnectionSpecificationItemProvider = new DisconnectionSpecificationItemProvider(this);
		}

		return disconnectionSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.FileDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileDeclarationItemProvider fileDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.FileDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileDeclarationAdapter() {
		if (fileDeclarationItemProvider == null) {
			fileDeclarationItemProvider = new FileDeclarationItemProvider(this);
		}

		return fileDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.TerminalDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalDeclarationItemProvider terminalDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.TerminalDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTerminalDeclarationAdapter() {
		if (terminalDeclarationItemProvider == null) {
			terminalDeclarationItemProvider = new TerminalDeclarationItemProvider(this);
		}

		return terminalDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.TypeDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeclarationItemProvider typeDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeDeclarationAdapter() {
		if (typeDeclarationItemProvider == null) {
			typeDeclarationItemProvider = new TypeDeclarationItemProvider(this);
		}

		return typeDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.ConstantDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantDeclarationItemProvider constantDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.ConstantDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantDeclarationAdapter() {
		if (constantDeclarationItemProvider == null) {
			constantDeclarationItemProvider = new ConstantDeclarationItemProvider(this);
		}

		return constantDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.GroupDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupDeclarationItemProvider groupDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.GroupDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupDeclarationAdapter() {
		if (groupDeclarationItemProvider == null) {
			groupDeclarationItemProvider = new GroupDeclarationItemProvider(this);
		}

		return groupDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.GroupTemplateDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupTemplateDeclarationItemProvider groupTemplateDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.GroupTemplateDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupTemplateDeclarationAdapter() {
		if (groupTemplateDeclarationItemProvider == null) {
			groupTemplateDeclarationItemProvider = new GroupTemplateDeclarationItemProvider(this);
		}

		return groupTemplateDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.NatureDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NatureDeclarationItemProvider natureDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.NatureDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNatureDeclarationAdapter() {
		if (natureDeclarationItemProvider == null) {
			natureDeclarationItemProvider = new NatureDeclarationItemProvider(this);
		}

		return natureDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.SignalDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalDeclarationItemProvider signalDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.SignalDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalDeclarationAdapter() {
		if (signalDeclarationItemProvider == null) {
			signalDeclarationItemProvider = new SignalDeclarationItemProvider(this);
		}

		return signalDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.UseClauseDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseClauseDeclarationItemProvider useClauseDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.UseClauseDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUseClauseDeclarationAdapter() {
		if (useClauseDeclarationItemProvider == null) {
			useClauseDeclarationItemProvider = new UseClauseDeclarationItemProvider(this);
		}

		return useClauseDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.declaration.VariableDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationItemProvider variableDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.declaration.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableDeclarationAdapter() {
		if (variableDeclarationItemProvider == null) {
			variableDeclarationItemProvider = new VariableDeclarationItemProvider(this);
		}

		return variableDeclarationItemProvider;
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
		if (aliasDeclarationItemProvider != null) aliasDeclarationItemProvider.dispose();
		if (attributeDeclarationItemProvider != null) attributeDeclarationItemProvider.dispose();
		if (attributeSpecificationItemProvider != null) attributeSpecificationItemProvider.dispose();
		if (branchQuantityDeclarationItemProvider != null) branchQuantityDeclarationItemProvider.dispose();
		if (freeQuantityDeclarationItemProvider != null) freeQuantityDeclarationItemProvider.dispose();
		if (limitDeclarationItemProvider != null) limitDeclarationItemProvider.dispose();
		if (sourceQuantityDeclarationItemProvider != null) sourceQuantityDeclarationItemProvider.dispose();
		if (subnatureDeclarationItemProvider != null) subnatureDeclarationItemProvider.dispose();
		if (procedureDeclarationItemProvider != null) procedureDeclarationItemProvider.dispose();
		if (functionDeclarationItemProvider != null) functionDeclarationItemProvider.dispose();
		if (subprogramBodyItemProvider != null) subprogramBodyItemProvider.dispose();
		if (subtypeDeclarationItemProvider != null) subtypeDeclarationItemProvider.dispose();
		if (configurationSpecificationItemProvider != null) configurationSpecificationItemProvider.dispose();
		if (disconnectionSpecificationItemProvider != null) disconnectionSpecificationItemProvider.dispose();
		if (fileDeclarationItemProvider != null) fileDeclarationItemProvider.dispose();
		if (terminalDeclarationItemProvider != null) terminalDeclarationItemProvider.dispose();
		if (typeDeclarationItemProvider != null) typeDeclarationItemProvider.dispose();
		if (constantDeclarationItemProvider != null) constantDeclarationItemProvider.dispose();
		if (groupDeclarationItemProvider != null) groupDeclarationItemProvider.dispose();
		if (groupTemplateDeclarationItemProvider != null) groupTemplateDeclarationItemProvider.dispose();
		if (natureDeclarationItemProvider != null) natureDeclarationItemProvider.dispose();
		if (signalDeclarationItemProvider != null) signalDeclarationItemProvider.dispose();
		if (useClauseDeclarationItemProvider != null) useClauseDeclarationItemProvider.dispose();
		if (variableDeclarationItemProvider != null) variableDeclarationItemProvider.dispose();
	}

}