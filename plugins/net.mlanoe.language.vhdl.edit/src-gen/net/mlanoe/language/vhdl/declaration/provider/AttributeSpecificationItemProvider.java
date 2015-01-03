/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration.provider;


import java.util.Collection;
import java.util.List;

import net.mlanoe.language.vhdl.VhdlFactory;
import net.mlanoe.language.vhdl.VhdlPackage;

import net.mlanoe.language.vhdl.declaration.AttributeSpecification;
import net.mlanoe.language.vhdl.declaration.DeclarationPackage;

import net.mlanoe.language.vhdl.expression.ExpressionFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.mlanoe.language.vhdl.declaration.AttributeSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeSpecificationItemProvider extends DeclarationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSpecificationItemProvider(AdapterFactory adapterFactory) {
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

			addClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeSpecification_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeSpecification_class_feature", "_UI_AttributeSpecification_type"),
				 DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__CLASS,
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
			childrenFeatures.add(VhdlPackage.Literals.NAMED__NAME);
			childrenFeatures.add(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__ENTITY);
			childrenFeatures.add(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS);
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
	 * This returns AttributeSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AttributeSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AttributeSpecification)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_AttributeSpecification_type") :
			getString("_UI_AttributeSpecification_type") + " " + label;
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

		switch (notification.getFeatureID(AttributeSpecification.class)) {
			case DeclarationPackage.ATTRIBUTE_SPECIFICATION__CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DeclarationPackage.ATTRIBUTE_SPECIFICATION__NAME:
			case DeclarationPackage.ATTRIBUTE_SPECIFICATION__ENTITY:
			case DeclarationPackage.ATTRIBUTE_SPECIFICATION__IS:
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
				(VhdlPackage.Literals.NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__ENTITY,
				 VhdlFactory.eINSTANCE.createNameList()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__ENTITY,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createAddingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createMultiExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createAllocatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createAssociationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createBitStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createSubtypeIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createSubnatureIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createMultiplyingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createPowerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createSignExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createOpenExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createUnitValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS,
				 ExpressionFactory.eINSTANCE.createWaveformExpression()));
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
			childFeature == VhdlPackage.Literals.NAMED__NAME ||
			childFeature == DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__ENTITY ||
			childFeature == DeclarationPackage.Literals.ATTRIBUTE_SPECIFICATION__IS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
