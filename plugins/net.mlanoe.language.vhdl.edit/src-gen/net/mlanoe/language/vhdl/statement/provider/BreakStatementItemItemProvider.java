/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement.provider;


import java.util.Collection;
import java.util.List;

import net.mlanoe.language.vhdl.expression.ExpressionFactory;

import net.mlanoe.language.vhdl.provider.VhdlEditPlugin;
import net.mlanoe.language.vhdl.provider.VhdlObjectItemProvider;

import net.mlanoe.language.vhdl.statement.BreakStatementItem;
import net.mlanoe.language.vhdl.statement.StatementPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.mlanoe.language.vhdl.statement.BreakStatementItem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BreakStatementItemItemProvider extends VhdlObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakStatementItemItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StatementPackage.Literals.BREAK_STATEMENT_ITEM__NAME);
			childrenFeatures.add(StatementPackage.Literals.BREAK_STATEMENT_ITEM__USE);
			childrenFeatures.add(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW);
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
	 * This returns BreakStatementItem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BreakStatementItem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BreakStatementItem)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_BreakStatementItem_type") :
			getString("_UI_BreakStatementItem_type") + " " + label;
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

		switch (notification.getFeatureID(BreakStatementItem.class)) {
			case StatementPackage.BREAK_STATEMENT_ITEM__NAME:
			case StatementPackage.BREAK_STATEMENT_ITEM__USE:
			case StatementPackage.BREAK_STATEMENT_ITEM__ARROW:
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
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__NAME,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__NAME,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__NAME,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__NAME,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__NAME,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__NAME,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__NAME,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__NAME,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__NAME,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__NAME,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__USE,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__USE,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__USE,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__USE,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__USE,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__USE,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__USE,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__USE,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__USE,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__USE,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createAddingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createMultiExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createAllocatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createAssociationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createBitStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createSubtypeIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createSubnatureIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createMultiplyingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createPowerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createSignExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createOpenExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createUnitValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
				 ExpressionFactory.eINSTANCE.createUnaffectedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW,
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
			childFeature == StatementPackage.Literals.BREAK_STATEMENT_ITEM__NAME ||
			childFeature == StatementPackage.Literals.BREAK_STATEMENT_ITEM__USE ||
			childFeature == StatementPackage.Literals.BREAK_STATEMENT_ITEM__ARROW;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return VhdlEditPlugin.INSTANCE;
	}

}
