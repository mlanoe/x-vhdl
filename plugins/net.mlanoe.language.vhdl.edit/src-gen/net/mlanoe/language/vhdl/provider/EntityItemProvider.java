/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.provider;


import java.util.Collection;
import java.util.List;

import net.mlanoe.language.vhdl.Entity;
import net.mlanoe.language.vhdl.VhdlFactory;
import net.mlanoe.language.vhdl.VhdlPackage;

import net.mlanoe.language.vhdl.expression.ExpressionFactory;

import net.mlanoe.language.vhdl.statement.StatementFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.mlanoe.language.vhdl.Entity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityItemProvider extends ModuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(VhdlPackage.Literals.NAMED__NAME);
			childrenFeatures.add(VhdlPackage.Literals.ENTITY__GENERIC);
			childrenFeatures.add(VhdlPackage.Literals.ENTITY__PORT);
			childrenFeatures.add(VhdlPackage.Literals.ENTITY__STATEMENT);
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
	 * This returns Entity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Entity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Entity)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Entity_type") :
			getString("_UI_Entity_type") + " " + label;
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

		switch (notification.getFeatureID(Entity.class)) {
			case VhdlPackage.ENTITY__NAME:
			case VhdlPackage.ENTITY__GENERIC:
			case VhdlPackage.ENTITY__PORT:
			case VhdlPackage.ENTITY__STATEMENT:
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
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

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
				(VhdlPackage.Literals.NAMED__NAME,
				 ExpressionFactory.eINSTANCE.createTypeQualificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__GENERIC,
				 VhdlFactory.eINSTANCE.createGenerics()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__PORT,
				 VhdlFactory.eINSTANCE.createPorts()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createReportStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createConditionalSignalAssignmentStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createSelectedSignalAssignmentStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createSequentialSignalAssignmentStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createWaitStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createVariableAssignmentStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createCaseStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createSimultaneousCaseStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createSimultaneousIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createProcedureCallStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createSimultaneousProceduralStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createProcessStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createAssertionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createBlockStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createBreakStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createInstantiationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createComponentInstantiationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createEntityInstantiationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createConfigurationInstantiationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createSimpleSimultaneousStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createExitStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createGenerateStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createLoopStatement()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.ENTITY__STATEMENT,
				 StatementFactory.eINSTANCE.createNextStatement()));
	}

}
