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

import net.mlanoe.language.vhdl.VhdlFactory;

import net.mlanoe.language.vhdl.declaration.DeclarationFactory;

import net.mlanoe.language.vhdl.expression.ExpressionFactory;

import net.mlanoe.language.vhdl.statement.BlockStatement;
import net.mlanoe.language.vhdl.statement.StatementFactory;
import net.mlanoe.language.vhdl.statement.StatementPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.mlanoe.language.vhdl.statement.BlockStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockStatementItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockStatementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StatementPackage.Literals.BLOCK_STATEMENT__GUARD);
			childrenFeatures.add(StatementPackage.Literals.BLOCK_STATEMENT__GENERIC);
			childrenFeatures.add(StatementPackage.Literals.BLOCK_STATEMENT__GENERIC_MAP);
			childrenFeatures.add(StatementPackage.Literals.BLOCK_STATEMENT__PORT);
			childrenFeatures.add(StatementPackage.Literals.BLOCK_STATEMENT__PORT_MAP);
			childrenFeatures.add(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION);
			childrenFeatures.add(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT);
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
	 * This returns BlockStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BlockStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BlockStatement)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_BlockStatement_type") :
			getString("_UI_BlockStatement_type") + " " + label;
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

		switch (notification.getFeatureID(BlockStatement.class)) {
			case StatementPackage.BLOCK_STATEMENT__GUARD:
			case StatementPackage.BLOCK_STATEMENT__GENERIC:
			case StatementPackage.BLOCK_STATEMENT__GENERIC_MAP:
			case StatementPackage.BLOCK_STATEMENT__PORT:
			case StatementPackage.BLOCK_STATEMENT__PORT_MAP:
			case StatementPackage.BLOCK_STATEMENT__DECLARATION:
			case StatementPackage.BLOCK_STATEMENT__STATEMENT:
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
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createAddingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createMultiExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createAggregateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createAllocatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createAssociationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createAttributeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createBitStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createSubtypeIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createSubnatureIndicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createNameExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createMultiplyingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createPowerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createSignatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createSignExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createOpenExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createOthersExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createRangeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createCharacterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createUnitValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createUnaffectedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createWaveformExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GUARD,
				 ExpressionFactory.eINSTANCE.createConditionalWaveformExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GENERIC,
				 VhdlFactory.eINSTANCE.createGenerics()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__GENERIC_MAP,
				 VhdlFactory.eINSTANCE.createGenericMaps()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__PORT,
				 VhdlFactory.eINSTANCE.createPorts()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__PORT_MAP,
				 VhdlFactory.eINSTANCE.createPortMaps()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 VhdlFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createAliasDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createAttributeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createAttributeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createBranchQuantityDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createFreeQuantityDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createLimitDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createSourceQuantityDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createSubnatureDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createProcedureDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createFunctionDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createSubtypeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createConfigurationSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createDisconnectionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createFileDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createTerminalDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createTypeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createConstantDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createGroupDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createGroupTemplateDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createNatureDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createSignalDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createUseClauseDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__DECLARATION,
				 DeclarationFactory.eINSTANCE.createVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createReportStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createConditionalSignalAssignmentStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createSelectedSignalAssignmentStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createSequentialSignalAssignmentStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createWaitStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createVariableAssignmentStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createCaseStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createSimultaneousCaseStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createSimultaneousIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createProcedureCallStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createSimultaneousProceduralStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createProcessStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createAssertionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createBlockStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createBreakStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createInstantiationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createComponentInstantiationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createEntityInstantiationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createConfigurationInstantiationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createSimpleSimultaneousStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createExitStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createGenerateStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createLoopStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementPackage.Literals.BLOCK_STATEMENT__STATEMENT,
				 StatementFactory.eINSTANCE.createNextStatement()));
	}

}
