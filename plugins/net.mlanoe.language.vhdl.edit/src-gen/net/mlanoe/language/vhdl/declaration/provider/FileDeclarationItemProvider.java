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

import net.mlanoe.language.vhdl.declaration.DeclarationPackage;
import net.mlanoe.language.vhdl.declaration.FileDeclaration;

import net.mlanoe.language.vhdl.expression.ExpressionFactory;

import net.mlanoe.language.vhdl.type.TypePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.mlanoe.language.vhdl.declaration.FileDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FileDeclarationItemProvider extends DeclarationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileDeclarationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(VhdlPackage.Literals.MULTI_NAMED__NAME);
			childrenFeatures.add(TypePackage.Literals.TYPED__TYPE);
			childrenFeatures.add(DeclarationPackage.Literals.FILE_DECLARATION__OPEN);
			childrenFeatures.add(DeclarationPackage.Literals.FILE_DECLARATION__IS);
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
	 * This returns FileDeclaration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FileDeclaration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FileDeclaration)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_FileDeclaration_type") :
			getString("_UI_FileDeclaration_type") + " " + label;
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

		switch (notification.getFeatureID(FileDeclaration.class)) {
			case DeclarationPackage.FILE_DECLARATION__NAME:
			case DeclarationPackage.FILE_DECLARATION__TYPE:
			case DeclarationPackage.FILE_DECLARATION__OPEN:
			case DeclarationPackage.FILE_DECLARATION__IS:
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
				(VhdlPackage.Literals.MULTI_NAMED__NAME,
				 VhdlFactory.eINSTANCE.createNameList()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.MULTI_NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.MULTI_NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.MULTI_NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.MULTI_NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.MULTI_NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.MULTI_NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.MULTI_NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.MULTI_NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.MULTI_NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.MULTI_NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

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
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

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
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createAddingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createMultiExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createAllocatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createAssociationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createBitStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createSubtypeIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createSubnatureIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createMultiplyingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createPowerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createSignExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createOpenExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createUnitValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createUnaffectedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__OPEN,
				 ExpressionFactory.eINSTANCE.createWaveformExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createAddingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createMultiExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createAllocatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createAssociationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createBitStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createSubtypeIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createSubnatureIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createMultiplyingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createPowerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createSignExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createOpenExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createUnitValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
				 ExpressionFactory.eINSTANCE.createUnaffectedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.FILE_DECLARATION__IS,
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
			childFeature == VhdlPackage.Literals.MULTI_NAMED__NAME ||
			childFeature == TypePackage.Literals.TYPED__TYPE ||
			childFeature == DeclarationPackage.Literals.FILE_DECLARATION__OPEN ||
			childFeature == DeclarationPackage.Literals.FILE_DECLARATION__IS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
