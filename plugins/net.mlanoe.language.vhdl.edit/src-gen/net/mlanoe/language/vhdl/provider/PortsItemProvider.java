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

import net.mlanoe.language.vhdl.Ports;
import net.mlanoe.language.vhdl.VhdlFactory;
import net.mlanoe.language.vhdl.VhdlPackage;

import net.mlanoe.language.vhdl.declaration.DeclarationFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.mlanoe.language.vhdl.Ports} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PortsItemProvider extends VhdlObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(VhdlPackage.Literals.PORTS__DECLARATION);
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
	 * This returns Ports.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Ports"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Ports)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Ports_type") :
			getString("_UI_Ports_type") + " " + label;
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

		switch (notification.getFeatureID(Ports.class)) {
			case VhdlPackage.PORTS__DECLARATION:
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
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 VhdlFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createAliasDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createAttributeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createAttributeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createBranchQuantityDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createFreeQuantityDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createLimitDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createSourceQuantityDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createSubnatureDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createProcedureDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createFunctionDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createSubtypeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createConfigurationSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createDisconnectionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createFileDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createTerminalDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createTypeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createConstantDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createGroupDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createGroupTemplateDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createNatureDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createSignalDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createUseClauseDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(VhdlPackage.Literals.PORTS__DECLARATION,
				 DeclarationFactory.eINSTANCE.createVariableDeclaration()));
	}

}
