/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage
 * @generated
 */
public interface DeclarationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclarationFactory eINSTANCE = net.mlanoe.language.vhdl.declaration.impl.DeclarationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Alias Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alias Declaration</em>'.
	 * @generated
	 */
	AliasDeclaration createAliasDeclaration();

	/**
	 * Returns a new object of class '<em>Attribute Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Declaration</em>'.
	 * @generated
	 */
	AttributeDeclaration createAttributeDeclaration();

	/**
	 * Returns a new object of class '<em>Attribute Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Specification</em>'.
	 * @generated
	 */
	AttributeSpecification createAttributeSpecification();

	/**
	 * Returns a new object of class '<em>Branch Quantity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch Quantity Declaration</em>'.
	 * @generated
	 */
	BranchQuantityDeclaration createBranchQuantityDeclaration();

	/**
	 * Returns a new object of class '<em>Free Quantity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Quantity Declaration</em>'.
	 * @generated
	 */
	FreeQuantityDeclaration createFreeQuantityDeclaration();

	/**
	 * Returns a new object of class '<em>Limit Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limit Declaration</em>'.
	 * @generated
	 */
	LimitDeclaration createLimitDeclaration();

	/**
	 * Returns a new object of class '<em>Source Quantity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Quantity Declaration</em>'.
	 * @generated
	 */
	SourceQuantityDeclaration createSourceQuantityDeclaration();

	/**
	 * Returns a new object of class '<em>Subnature Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subnature Declaration</em>'.
	 * @generated
	 */
	SubnatureDeclaration createSubnatureDeclaration();

	/**
	 * Returns a new object of class '<em>Procedure Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Declaration</em>'.
	 * @generated
	 */
	ProcedureDeclaration createProcedureDeclaration();

	/**
	 * Returns a new object of class '<em>Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Declaration</em>'.
	 * @generated
	 */
	FunctionDeclaration createFunctionDeclaration();

	/**
	 * Returns a new object of class '<em>Subprogram Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Body</em>'.
	 * @generated
	 */
	SubprogramBody createSubprogramBody();

	/**
	 * Returns a new object of class '<em>Subtype Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtype Declaration</em>'.
	 * @generated
	 */
	SubtypeDeclaration createSubtypeDeclaration();

	/**
	 * Returns a new object of class '<em>Configuration Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Specification</em>'.
	 * @generated
	 */
	ConfigurationSpecification createConfigurationSpecification();

	/**
	 * Returns a new object of class '<em>Disconnection Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disconnection Specification</em>'.
	 * @generated
	 */
	DisconnectionSpecification createDisconnectionSpecification();

	/**
	 * Returns a new object of class '<em>File Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Declaration</em>'.
	 * @generated
	 */
	FileDeclaration createFileDeclaration();

	/**
	 * Returns a new object of class '<em>Terminal Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminal Declaration</em>'.
	 * @generated
	 */
	TerminalDeclaration createTerminalDeclaration();

	/**
	 * Returns a new object of class '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Declaration</em>'.
	 * @generated
	 */
	TypeDeclaration createTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Constant Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Declaration</em>'.
	 * @generated
	 */
	ConstantDeclaration createConstantDeclaration();

	/**
	 * Returns a new object of class '<em>Group Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Declaration</em>'.
	 * @generated
	 */
	GroupDeclaration createGroupDeclaration();

	/**
	 * Returns a new object of class '<em>Group Template Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Template Declaration</em>'.
	 * @generated
	 */
	GroupTemplateDeclaration createGroupTemplateDeclaration();

	/**
	 * Returns a new object of class '<em>Nature Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nature Declaration</em>'.
	 * @generated
	 */
	NatureDeclaration createNatureDeclaration();

	/**
	 * Returns a new object of class '<em>Signal Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Declaration</em>'.
	 * @generated
	 */
	SignalDeclaration createSignalDeclaration();

	/**
	 * Returns a new object of class '<em>Use Clause Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Clause Declaration</em>'.
	 * @generated
	 */
	UseClauseDeclaration createUseClauseDeclaration();

	/**
	 * Returns a new object of class '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration</em>'.
	 * @generated
	 */
	VariableDeclaration createVariableDeclaration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeclarationPackage getDeclarationPackage();

} //DeclarationFactory
