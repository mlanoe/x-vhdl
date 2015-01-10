/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.type.provider;


import java.util.Collection;
import java.util.List;

import net.mlanoe.language.vhdl.expression.ExpressionFactory;

import net.mlanoe.language.vhdl.type.PhysicalTypeDefinition;
import net.mlanoe.language.vhdl.type.TypeFactory;
import net.mlanoe.language.vhdl.type.TypePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalTypeDefinitionItemProvider extends TypeDefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalTypeDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addPrimaryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Primary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalTypeDefinition_primary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalTypeDefinition_primary_feature", "_UI_PhysicalTypeDefinition_type"),
				 TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__PRIMARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE);
			childrenFeatures.add(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__SECONDARY);
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
	 * This returns PhysicalTypeDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PhysicalTypeDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PhysicalTypeDefinition)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_PhysicalTypeDefinition_type") :
			getString("_UI_PhysicalTypeDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(PhysicalTypeDefinition.class)) {
			case TypePackage.PHYSICAL_TYPE_DEFINITION__PRIMARY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypePackage.PHYSICAL_TYPE_DEFINITION__RANGE:
			case TypePackage.PHYSICAL_TYPE_DEFINITION__SECONDARY:
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
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createAddingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createMultiExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createAllocatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createAssociationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createBitStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createSubtypeIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createSubnatureIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createMultiplyingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createPowerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createSignExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createOpenExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createUnitValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createUnaffectedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createWaveformExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__RANGE,
				 ExpressionFactory.eINSTANCE.createConditionalWaveformExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.PHYSICAL_TYPE_DEFINITION__SECONDARY,
				 TypeFactory.eINSTANCE.createPhysicalTypeDefinitionSecondary()));
	}

}
