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

import net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement;
import net.mlanoe.language.vhdl.statement.StatementPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SequentialSignalAssignmentStatementItemProvider extends SignalAssignmentStatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialSignalAssignmentStatementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM);
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
	 * This returns SequentialSignalAssignmentStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SequentialSignalAssignmentStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SequentialSignalAssignmentStatement)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_SequentialSignalAssignmentStatement_type") :
			getString("_UI_SequentialSignalAssignmentStatement_type") + " " + label;
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

		switch (notification.getFeatureID(SequentialSignalAssignmentStatement.class)) {
			case StatementPackage.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM:
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
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createAddingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createMultiExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createAllocatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createAssociationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createBitStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createSubtypeIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createSubnatureIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createMultiplyingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createPowerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createSignExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createOpenExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createUnitValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
				 ExpressionFactory.eINSTANCE.createUnaffectedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM,
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
			childFeature == StatementPackage.Literals.SIGNAL_ASSIGNMENT_STATEMENT__TARGET ||
			childFeature == StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
