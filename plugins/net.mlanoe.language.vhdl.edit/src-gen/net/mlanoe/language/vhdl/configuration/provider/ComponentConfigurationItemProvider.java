/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.configuration.provider;


import java.util.Collection;
import java.util.List;

import net.mlanoe.language.vhdl.VhdlFactory;

import net.mlanoe.language.vhdl.configuration.ComponentConfiguration;
import net.mlanoe.language.vhdl.configuration.ConfigurationFactory;
import net.mlanoe.language.vhdl.configuration.ConfigurationPackage;

import net.mlanoe.language.vhdl.expression.ExpressionFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentConfigurationItemProvider extends ConfigurationItemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentConfigurationItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__LIST);
			childrenFeatures.add(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT);
			childrenFeatures.add(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__ENTITY);
			childrenFeatures.add(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__CONFIGURATION);
			childrenFeatures.add(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__GENERIC_MAP);
			childrenFeatures.add(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__PORT_MAP);
			childrenFeatures.add(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__BLOCK);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComponentConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentConfiguration)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentConfiguration_type") :
			getString("_UI_ComponentConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentConfiguration.class)) {
			case ConfigurationPackage.COMPONENT_CONFIGURATION__LIST:
			case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT:
			case ConfigurationPackage.COMPONENT_CONFIGURATION__ENTITY:
			case ConfigurationPackage.COMPONENT_CONFIGURATION__CONFIGURATION:
			case ConfigurationPackage.COMPONENT_CONFIGURATION__GENERIC_MAP:
			case ConfigurationPackage.COMPONENT_CONFIGURATION__PORT_MAP:
			case ConfigurationPackage.COMPONENT_CONFIGURATION__BLOCK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__LIST,
				 VhdlFactory.eINSTANCE.createNameList()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__LIST,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__LIST,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__LIST,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__LIST,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__LIST,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__LIST,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__LIST,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__LIST,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__LIST,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__LIST,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__CONFIGURATION,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__CONFIGURATION,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__CONFIGURATION,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__CONFIGURATION,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__CONFIGURATION,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__CONFIGURATION,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__CONFIGURATION,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__CONFIGURATION,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__CONFIGURATION,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__CONFIGURATION,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__GENERIC_MAP,
				 VhdlFactory.eINSTANCE.createGenericMaps()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__PORT_MAP,
				 VhdlFactory.eINSTANCE.createPortMaps()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__BLOCK,
				 ConfigurationFactory.eINSTANCE.createBlockConfiguration()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__LIST ||
			childFeature == ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT ||
			childFeature == ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__ENTITY ||
			childFeature == ConfigurationPackage.Literals.COMPONENT_CONFIGURATION__CONFIGURATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
