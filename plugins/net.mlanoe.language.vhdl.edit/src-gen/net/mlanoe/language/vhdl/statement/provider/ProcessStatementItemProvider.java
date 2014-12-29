/**
 * Copyright (c) 2014 mlanoe
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement.provider;


import java.util.Collection;
import java.util.List;

import net.mlanoe.language.vhdl.VhdlFactory;

import net.mlanoe.language.vhdl.declaration.DeclarationFactory;

import net.mlanoe.language.vhdl.statement.ProcessStatement;
import net.mlanoe.language.vhdl.statement.StatementFactory;
import net.mlanoe.language.vhdl.statement.StatementPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.mlanoe.language.vhdl.statement.ProcessStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessStatementItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStatementItemProvider(AdapterFactory adapterFactory) {
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

			addPostponedPropertyDescriptor(object);
			addSensitivityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Postponed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostponedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessStatement_postponed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessStatement_postponed_feature", "_UI_ProcessStatement_type"),
				 StatementPackage.Literals.PROCESS_STATEMENT__POSTPONED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sensitivity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSensitivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessStatement_sensitivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessStatement_sensitivity_feature", "_UI_ProcessStatement_type"),
				 StatementPackage.Literals.PROCESS_STATEMENT__SENSITIVITY,
				 true,
				 false,
				 false,
				 null,
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
			childrenFeatures.add(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION);
			childrenFeatures.add(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT);
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
	 * This returns ProcessStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcessStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProcessStatement)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ProcessStatement_type") :
			getString("_UI_ProcessStatement_type") + " " + label;
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

		switch (notification.getFeatureID(ProcessStatement.class)) {
			case StatementPackage.PROCESS_STATEMENT__POSTPONED:
			case StatementPackage.PROCESS_STATEMENT__SENSITIVITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StatementPackage.PROCESS_STATEMENT__DECLARATION:
			case StatementPackage.PROCESS_STATEMENT__STATEMENT:
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
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 VhdlFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createAliasDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createAttributeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createAttributeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createBranchQuantityDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createFreeQuantityDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createLimitDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createSourceQuantityDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createSubnatureDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createProcedureDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createFunctionDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createSubtypeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createConfigurationSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createDisconnectionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createFileDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createTerminalDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createTypeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createConstantDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createGroupDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createGroupTemplateDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createNatureDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createSignalDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createUseClauseDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createReportStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createConditionalSignalAssignmentStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createSelectedSignalAssignmentStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createSequentialSignalAssignmentStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createWaitStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createVariableAssignmentStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createCaseStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createSimultaneousCaseStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createSimultaneousIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createProcedureCallStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createSimultaneousProceduralStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createProcessStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createAssertionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createBlockStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createBreakStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createInstantiationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createComponentInstantiationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createEntityInstantiationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createConfigurationInstantiationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createSimpleSimultaneousStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createExitStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createGenerateStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createLoopStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.PROCESS_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createNextStatement()));
	}

}
