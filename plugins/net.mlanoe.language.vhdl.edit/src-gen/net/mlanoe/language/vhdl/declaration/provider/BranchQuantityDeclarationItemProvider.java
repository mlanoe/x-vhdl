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

import net.mlanoe.language.vhdl.ams.AmsFactory;

import net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.DeclarationPackage;

import net.mlanoe.language.vhdl.expression.ExpressionFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BranchQuantityDeclarationItemProvider extends QuantityDeclarationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchQuantityDeclarationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__ACROSS);
			childrenFeatures.add(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__THROUGH);
			childrenFeatures.add(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__LEFT);
			childrenFeatures.add(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__RIGHT);
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
	 * This returns BranchQuantityDeclaration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BranchQuantityDeclaration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BranchQuantityDeclaration)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_BranchQuantityDeclaration_type") :
			getString("_UI_BranchQuantityDeclaration_type") + " " + label;
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

		switch (notification.getFeatureID(BranchQuantityDeclaration.class)) {
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__ACROSS:
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__THROUGH:
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__LEFT:
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__RIGHT:
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
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__ACROSS,
				 AmsFactory.eINSTANCE.createQuantityAspect()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__THROUGH,
				 AmsFactory.eINSTANCE.createQuantityAspect()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__LEFT,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__LEFT,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__LEFT,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__LEFT,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__LEFT,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__LEFT,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__LEFT,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__LEFT,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__LEFT,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__LEFT,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__RIGHT,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__RIGHT,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__RIGHT,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__RIGHT,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__RIGHT,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__RIGHT,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__RIGHT,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__RIGHT,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__RIGHT,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__RIGHT,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));
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
			childFeature == DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__ACROSS ||
			childFeature == DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__THROUGH ||
			childFeature == DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__LEFT ||
			childFeature == DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
