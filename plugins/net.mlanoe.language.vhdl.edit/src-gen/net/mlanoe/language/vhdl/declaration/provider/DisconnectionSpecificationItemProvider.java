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

import net.mlanoe.language.vhdl.declaration.DeclarationPackage;
import net.mlanoe.language.vhdl.declaration.DisconnectionSpecification;

import net.mlanoe.language.vhdl.expression.ExpressionFactory;

import net.mlanoe.language.vhdl.type.TypePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.mlanoe.language.vhdl.declaration.DisconnectionSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DisconnectionSpecificationItemProvider extends DeclarationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectionSpecificationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TypePackage.Literals.TYPED__TYPE);
			childrenFeatures.add(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__DISCONNECT);
			childrenFeatures.add(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER);
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
	 * This returns DisconnectionSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DisconnectionSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DisconnectionSpecification)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_DisconnectionSpecification_type") :
			getString("_UI_DisconnectionSpecification_type") + " " + label;
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

		switch (notification.getFeatureID(DisconnectionSpecification.class)) {
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__TYPE:
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__DISCONNECT:
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__AFTER:
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
				(TypePackage.Literals.TYPED__TYPE,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.TYPED__TYPE,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.TYPED__TYPE,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.TYPED__TYPE,
				 ExpressionFactory.eINSTANCE.createSubtypeIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.TYPED__TYPE,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.TYPED__TYPE,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.TYPED__TYPE,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.TYPED__TYPE,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.TYPED__TYPE,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.TYPED__TYPE,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__DISCONNECT,
				 VhdlFactory.eINSTANCE.createNameList()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__DISCONNECT,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__DISCONNECT,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__DISCONNECT,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__DISCONNECT,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__DISCONNECT,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__DISCONNECT,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__DISCONNECT,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__DISCONNECT,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__DISCONNECT,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createAddingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createMultiExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createAllocatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createAssociationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createBitStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createSubtypeIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createSubnatureIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createMultiplyingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createPowerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createSignExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createOpenExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
				 ExpressionFactory.eINSTANCE.createUnitValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER,
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
			childFeature == TypePackage.Literals.TYPED__TYPE ||
			childFeature == DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__DISCONNECT ||
			childFeature == DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION__AFTER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
