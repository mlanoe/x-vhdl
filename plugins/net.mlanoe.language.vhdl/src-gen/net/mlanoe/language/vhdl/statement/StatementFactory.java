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
package net.mlanoe.language.vhdl.statement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.statement.StatementPackage
 * @generated
 */
public interface StatementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatementFactory eINSTANCE = net.mlanoe.language.vhdl.statement.impl.StatementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wait Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait Statement</em>'.
	 * @generated
	 */
	WaitStatement createWaitStatement();

	/**
	 * Returns a new object of class '<em>Report Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report Statement</em>'.
	 * @generated
	 */
	ReportStatement createReportStatement();

	/**
	 * Returns a new object of class '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Statement</em>'.
	 * @generated
	 */
	ReturnStatement createReturnStatement();

	/**
	 * Returns a new object of class '<em>Sequential Signal Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequential Signal Assignment Statement</em>'.
	 * @generated
	 */
	SequentialSignalAssignmentStatement createSequentialSignalAssignmentStatement();

	/**
	 * Returns a new object of class '<em>Conditional Signal Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Signal Assignment Statement</em>'.
	 * @generated
	 */
	ConditionalSignalAssignmentStatement createConditionalSignalAssignmentStatement();

	/**
	 * Returns a new object of class '<em>Selected Signal Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selected Signal Assignment Statement</em>'.
	 * @generated
	 */
	SelectedSignalAssignmentStatement createSelectedSignalAssignmentStatement();

	/**
	 * Returns a new object of class '<em>Variable Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Assignment Statement</em>'.
	 * @generated
	 */
	VariableAssignmentStatement createVariableAssignmentStatement();

	/**
	 * Returns a new object of class '<em>Simultaneous Case Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simultaneous Case Statement</em>'.
	 * @generated
	 */
	SimultaneousCaseStatement createSimultaneousCaseStatement();

	/**
	 * Returns a new object of class '<em>Case Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Statement</em>'.
	 * @generated
	 */
	CaseStatement createCaseStatement();

	/**
	 * Returns a new object of class '<em>Case Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Alternative</em>'.
	 * @generated
	 */
	CaseAlternative createCaseAlternative();

	/**
	 * Returns a new object of class '<em>Simultaneous If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simultaneous If Statement</em>'.
	 * @generated
	 */
	SimultaneousIfStatement createSimultaneousIfStatement();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>If Statement Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement Test</em>'.
	 * @generated
	 */
	IfStatementTest createIfStatementTest();

	/**
	 * Returns a new object of class '<em>Procedure Call Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Call Statement</em>'.
	 * @generated
	 */
	ProcedureCallStatement createProcedureCallStatement();

	/**
	 * Returns a new object of class '<em>Simultaneous Procedural Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simultaneous Procedural Statement</em>'.
	 * @generated
	 */
	SimultaneousProceduralStatement createSimultaneousProceduralStatement();

	/**
	 * Returns a new object of class '<em>Process Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Statement</em>'.
	 * @generated
	 */
	ProcessStatement createProcessStatement();

	/**
	 * Returns a new object of class '<em>Assertion Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion Statement</em>'.
	 * @generated
	 */
	AssertionStatement createAssertionStatement();

	/**
	 * Returns a new object of class '<em>Block Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Statement</em>'.
	 * @generated
	 */
	BlockStatement createBlockStatement();

	/**
	 * Returns a new object of class '<em>Break Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break Statement</em>'.
	 * @generated
	 */
	BreakStatement createBreakStatement();

	/**
	 * Returns a new object of class '<em>Break Statement Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break Statement Item</em>'.
	 * @generated
	 */
	BreakStatementItem createBreakStatementItem();

	/**
	 * Returns a new object of class '<em>Component Instantiation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instantiation Statement</em>'.
	 * @generated
	 */
	ComponentInstantiationStatement createComponentInstantiationStatement();

	/**
	 * Returns a new object of class '<em>Entity Instantiation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Instantiation Statement</em>'.
	 * @generated
	 */
	EntityInstantiationStatement createEntityInstantiationStatement();

	/**
	 * Returns a new object of class '<em>Configuration Instantiation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Instantiation Statement</em>'.
	 * @generated
	 */
	ConfigurationInstantiationStatement createConfigurationInstantiationStatement();

	/**
	 * Returns a new object of class '<em>Simple Simultaneous Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Simultaneous Statement</em>'.
	 * @generated
	 */
	SimpleSimultaneousStatement createSimpleSimultaneousStatement();

	/**
	 * Returns a new object of class '<em>Exit Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Statement</em>'.
	 * @generated
	 */
	ExitStatement createExitStatement();

	/**
	 * Returns a new object of class '<em>Generate Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generate Statement</em>'.
	 * @generated
	 */
	GenerateStatement createGenerateStatement();

	/**
	 * Returns a new object of class '<em>Loop Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Statement</em>'.
	 * @generated
	 */
	LoopStatement createLoopStatement();

	/**
	 * Returns a new object of class '<em>Next Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Next Statement</em>'.
	 * @generated
	 */
	NextStatement createNextStatement();

	/**
	 * Returns a new object of class '<em>Conditional Waveform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Waveform</em>'.
	 * @generated
	 */
	ConditionalWaveform createConditionalWaveform();

	/**
	 * Returns a new object of class '<em>Iteration Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iteration Scheme</em>'.
	 * @generated
	 */
	IterationScheme createIterationScheme();

	/**
	 * Returns a new object of class '<em>While Iteration Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Iteration Scheme</em>'.
	 * @generated
	 */
	WhileIterationScheme createWhileIterationScheme();

	/**
	 * Returns a new object of class '<em>For Iteration Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Iteration Scheme</em>'.
	 * @generated
	 */
	ForIterationScheme createForIterationScheme();

	/**
	 * Returns a new object of class '<em>For Generation Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Generation Scheme</em>'.
	 * @generated
	 */
	ForGenerationScheme createForGenerationScheme();

	/**
	 * Returns a new object of class '<em>If Generation Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Generation Scheme</em>'.
	 * @generated
	 */
	IfGenerationScheme createIfGenerationScheme();

	/**
	 * Returns a new object of class '<em>Reject Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reject Mechanism</em>'.
	 * @generated
	 */
	RejectMechanism createRejectMechanism();

	/**
	 * Returns a new object of class '<em>Transport Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Mechanism</em>'.
	 * @generated
	 */
	TransportMechanism createTransportMechanism();

	/**
	 * Returns a new object of class '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Statement</em>'.
	 * @generated
	 */
	ExpressionStatement createExpressionStatement();

	/**
	 * Returns a new object of class '<em>Instantiation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instantiation Statement</em>'.
	 * @generated
	 */
	InstantiationStatement createInstantiationStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatementPackage getStatementPackage();

} //StatementFactory
