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

import net.mlanoe.language.vhdl.type.RangeTypeDefinition;
import net.mlanoe.language.vhdl.type.TypePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.mlanoe.language.vhdl.type.RangeTypeDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RangeTypeDefinitionItemProvider extends TypeDefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeTypeDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addDirectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RangeTypeDefinition_direction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeTypeDefinition_direction_feature", "_UI_RangeTypeDefinition_type"),
				 TypePackage.Literals.RANGE_TYPE_DEFINITION__DIRECTION,
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
			childrenFeatures.add(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT);
			childrenFeatures.add(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT);
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
	 * This returns RangeTypeDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RangeTypeDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RangeTypeDefinition)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_RangeTypeDefinition_type") :
			getString("_UI_RangeTypeDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(RangeTypeDefinition.class)) {
			case TypePackage.RANGE_TYPE_DEFINITION__DIRECTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypePackage.RANGE_TYPE_DEFINITION__LEFT:
			case TypePackage.RANGE_TYPE_DEFINITION__RIGHT:
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
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createAddingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createMultiExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createAllocatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createAssociationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createBitStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createSubtypeIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createSubnatureIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createMultiplyingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createPowerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createSignExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createOpenExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createUnitValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createUnaffectedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createWaveformExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createConditionalWaveformExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT,
				 ExpressionFactory.eINSTANCE.createTypeQualificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createAddingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createMultiExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createAllocatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createAssociationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createBitStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createSubtypeIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createSubnatureIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createMultiplyingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createPowerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createSignExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createOpenExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createUnitValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createUnaffectedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createWaveformExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createConditionalWaveformExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT,
				 ExpressionFactory.eINSTANCE.createTypeQualificationExpression()));
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
			childFeature == TypePackage.Literals.RANGE_TYPE_DEFINITION__LEFT ||
			childFeature == TypePackage.Literals.RANGE_TYPE_DEFINITION__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
