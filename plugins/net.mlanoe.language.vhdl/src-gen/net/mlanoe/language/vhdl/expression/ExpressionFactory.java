/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage
 * @generated
 */
public interface ExpressionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionFactory eINSTANCE = net.mlanoe.language.vhdl.expression.impl.ExpressionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adding Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adding Expression</em>'.
	 * @generated
	 */
	AddingExpression createAddingExpression();

	/**
	 * Returns a new object of class '<em>Aggregate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate Expression</em>'.
	 * @generated
	 */
	AggregateExpression createAggregateExpression();

	/**
	 * Returns a new object of class '<em>All Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Expression</em>'.
	 * @generated
	 */
	AllExpression createAllExpression();

	/**
	 * Returns a new object of class '<em>Allocator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocator Expression</em>'.
	 * @generated
	 */
	AllocatorExpression createAllocatorExpression();

	/**
	 * Returns a new object of class '<em>Association Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Expression</em>'.
	 * @generated
	 */
	AssociationExpression createAssociationExpression();

	/**
	 * Returns a new object of class '<em>Attribute Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Expression</em>'.
	 * @generated
	 */
	AttributeExpression createAttributeExpression();

	/**
	 * Returns a new object of class '<em>Bit String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit String Expression</em>'.
	 * @generated
	 */
	BitStringExpression createBitStringExpression();

	/**
	 * Returns a new object of class '<em>Subtype Indication Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtype Indication Expression</em>'.
	 * @generated
	 */
	SubtypeIndicationExpression createSubtypeIndicationExpression();

	/**
	 * Returns a new object of class '<em>Subnature Indication Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subnature Indication Expression</em>'.
	 * @generated
	 */
	SubnatureIndicationExpression createSubnatureIndicationExpression();

	/**
	 * Returns a new object of class '<em>Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Expression</em>'.
	 * @generated
	 */
	LogicalExpression createLogicalExpression();

	/**
	 * Returns a new object of class '<em>Name Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Expression</em>'.
	 * @generated
	 */
	NameExpression createNameExpression();

	/**
	 * Returns a new object of class '<em>Null Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Expression</em>'.
	 * @generated
	 */
	NullExpression createNullExpression();

	/**
	 * Returns a new object of class '<em>Multiplying Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplying Expression</em>'.
	 * @generated
	 */
	MultiplyingExpression createMultiplyingExpression();

	/**
	 * Returns a new object of class '<em>Power Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Expression</em>'.
	 * @generated
	 */
	PowerExpression createPowerExpression();

	/**
	 * Returns a new object of class '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Expression</em>'.
	 * @generated
	 */
	RelationalExpression createRelationalExpression();

	/**
	 * Returns a new object of class '<em>Shift Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shift Expression</em>'.
	 * @generated
	 */
	ShiftExpression createShiftExpression();

	/**
	 * Returns a new object of class '<em>Signature Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature Expression</em>'.
	 * @generated
	 */
	SignatureExpression createSignatureExpression();

	/**
	 * Returns a new object of class '<em>Sign Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sign Expression</em>'.
	 * @generated
	 */
	SignExpression createSignExpression();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Open Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Expression</em>'.
	 * @generated
	 */
	OpenExpression createOpenExpression();

	/**
	 * Returns a new object of class '<em>Others Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Others Expression</em>'.
	 * @generated
	 */
	OthersExpression createOthersExpression();

	/**
	 * Returns a new object of class '<em>Range Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Expression</em>'.
	 * @generated
	 */
	RangeExpression createRangeExpression();

	/**
	 * Returns a new object of class '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Expression</em>'.
	 * @generated
	 */
	StringExpression createStringExpression();

	/**
	 * Returns a new object of class '<em>Character Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Expression</em>'.
	 * @generated
	 */
	CharacterExpression createCharacterExpression();

	/**
	 * Returns a new object of class '<em>Identifier Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier Expression</em>'.
	 * @generated
	 */
	IdentifierExpression createIdentifierExpression();

	/**
	 * Returns a new object of class '<em>Unit Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Value Expression</em>'.
	 * @generated
	 */
	UnitValueExpression createUnitValueExpression();

	/**
	 * Returns a new object of class '<em>Unaffected Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unaffected Expression</em>'.
	 * @generated
	 */
	UnaffectedExpression createUnaffectedExpression();

	/**
	 * Returns a new object of class '<em>Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Expression</em>'.
	 * @generated
	 */
	ValueExpression createValueExpression();

	/**
	 * Returns a new object of class '<em>Waveform Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Waveform Expression</em>'.
	 * @generated
	 */
	WaveformExpression createWaveformExpression();

	/**
	 * Returns a new object of class '<em>Multi Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Expression</em>'.
	 * @generated
	 */
	MultiExpression createMultiExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExpressionPackage getExpressionPackage();

} //ExpressionFactory
