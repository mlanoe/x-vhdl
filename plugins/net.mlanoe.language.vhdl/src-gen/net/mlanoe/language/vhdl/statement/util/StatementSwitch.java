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
package net.mlanoe.language.vhdl.statement.util;

import net.mlanoe.language.vhdl.VhdlObject;

import net.mlanoe.language.vhdl.statement.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.statement.StatementPackage
 * @generated
 */
public class StatementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementSwitch() {
		if (modelPackage == null) {
			modelPackage = StatementPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StatementPackage.REPORT_STATEMENT: {
				ReportStatement reportStatement = (ReportStatement)theEObject;
				T result = caseReportStatement(reportStatement);
				if (result == null) result = caseStatement(reportStatement);
				if (result == null) result = caseVhdlObject(reportStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.RETURN_STATEMENT: {
				ReturnStatement returnStatement = (ReturnStatement)theEObject;
				T result = caseReturnStatement(returnStatement);
				if (result == null) result = caseExpressionStatement(returnStatement);
				if (result == null) result = caseStatement(returnStatement);
				if (result == null) result = caseVhdlObject(returnStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT: {
				ConditionalSignalAssignmentStatement conditionalSignalAssignmentStatement = (ConditionalSignalAssignmentStatement)theEObject;
				T result = caseConditionalSignalAssignmentStatement(conditionalSignalAssignmentStatement);
				if (result == null) result = caseSignalAssignmentStatement(conditionalSignalAssignmentStatement);
				if (result == null) result = caseStatement(conditionalSignalAssignmentStatement);
				if (result == null) result = caseVhdlObject(conditionalSignalAssignmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.SELECTED_SIGNAL_ASSIGNMENT_STATEMENT: {
				SelectedSignalAssignmentStatement selectedSignalAssignmentStatement = (SelectedSignalAssignmentStatement)theEObject;
				T result = caseSelectedSignalAssignmentStatement(selectedSignalAssignmentStatement);
				if (result == null) result = caseConditionalSignalAssignmentStatement(selectedSignalAssignmentStatement);
				if (result == null) result = caseSignalAssignmentStatement(selectedSignalAssignmentStatement);
				if (result == null) result = caseStatement(selectedSignalAssignmentStatement);
				if (result == null) result = caseVhdlObject(selectedSignalAssignmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT: {
				SequentialSignalAssignmentStatement sequentialSignalAssignmentStatement = (SequentialSignalAssignmentStatement)theEObject;
				T result = caseSequentialSignalAssignmentStatement(sequentialSignalAssignmentStatement);
				if (result == null) result = caseSignalAssignmentStatement(sequentialSignalAssignmentStatement);
				if (result == null) result = caseStatement(sequentialSignalAssignmentStatement);
				if (result == null) result = caseVhdlObject(sequentialSignalAssignmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT: {
				SignalAssignmentStatement signalAssignmentStatement = (SignalAssignmentStatement)theEObject;
				T result = caseSignalAssignmentStatement(signalAssignmentStatement);
				if (result == null) result = caseStatement(signalAssignmentStatement);
				if (result == null) result = caseVhdlObject(signalAssignmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.WAIT_STATEMENT: {
				WaitStatement waitStatement = (WaitStatement)theEObject;
				T result = caseWaitStatement(waitStatement);
				if (result == null) result = caseStatement(waitStatement);
				if (result == null) result = caseVhdlObject(waitStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.VARIABLE_ASSIGNMENT_STATEMENT: {
				VariableAssignmentStatement variableAssignmentStatement = (VariableAssignmentStatement)theEObject;
				T result = caseVariableAssignmentStatement(variableAssignmentStatement);
				if (result == null) result = caseStatement(variableAssignmentStatement);
				if (result == null) result = caseVhdlObject(variableAssignmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.SIMULTANEOUS_CASE_STATEMENT: {
				SimultaneousCaseStatement simultaneousCaseStatement = (SimultaneousCaseStatement)theEObject;
				T result = caseSimultaneousCaseStatement(simultaneousCaseStatement);
				if (result == null) result = caseCaseStatement(simultaneousCaseStatement);
				if (result == null) result = caseStatement(simultaneousCaseStatement);
				if (result == null) result = caseVhdlObject(simultaneousCaseStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.CASE_STATEMENT: {
				CaseStatement caseStatement = (CaseStatement)theEObject;
				T result = caseCaseStatement(caseStatement);
				if (result == null) result = caseStatement(caseStatement);
				if (result == null) result = caseVhdlObject(caseStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.CASE_ALTERNATIVE: {
				CaseAlternative caseAlternative = (CaseAlternative)theEObject;
				T result = caseCaseAlternative(caseAlternative);
				if (result == null) result = caseVhdlObject(caseAlternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.SIMULTANEOUS_IF_STATEMENT: {
				SimultaneousIfStatement simultaneousIfStatement = (SimultaneousIfStatement)theEObject;
				T result = caseSimultaneousIfStatement(simultaneousIfStatement);
				if (result == null) result = caseIfStatement(simultaneousIfStatement);
				if (result == null) result = caseStatement(simultaneousIfStatement);
				if (result == null) result = caseVhdlObject(simultaneousIfStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				T result = caseIfStatement(ifStatement);
				if (result == null) result = caseStatement(ifStatement);
				if (result == null) result = caseVhdlObject(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.IF_STATEMENT_TEST: {
				IfStatementTest ifStatementTest = (IfStatementTest)theEObject;
				T result = caseIfStatementTest(ifStatementTest);
				if (result == null) result = caseVhdlObject(ifStatementTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.PROCEDURE_CALL_STATEMENT: {
				ProcedureCallStatement procedureCallStatement = (ProcedureCallStatement)theEObject;
				T result = caseProcedureCallStatement(procedureCallStatement);
				if (result == null) result = caseStatement(procedureCallStatement);
				if (result == null) result = caseVhdlObject(procedureCallStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.SIMULTANEOUS_PROCEDURAL_STATEMENT: {
				SimultaneousProceduralStatement simultaneousProceduralStatement = (SimultaneousProceduralStatement)theEObject;
				T result = caseSimultaneousProceduralStatement(simultaneousProceduralStatement);
				if (result == null) result = caseStatement(simultaneousProceduralStatement);
				if (result == null) result = caseVhdlObject(simultaneousProceduralStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.PROCESS_STATEMENT: {
				ProcessStatement processStatement = (ProcessStatement)theEObject;
				T result = caseProcessStatement(processStatement);
				if (result == null) result = caseStatement(processStatement);
				if (result == null) result = caseVhdlObject(processStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.ASSERTION_STATEMENT: {
				AssertionStatement assertionStatement = (AssertionStatement)theEObject;
				T result = caseAssertionStatement(assertionStatement);
				if (result == null) result = caseStatement(assertionStatement);
				if (result == null) result = caseVhdlObject(assertionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.BLOCK_STATEMENT: {
				BlockStatement blockStatement = (BlockStatement)theEObject;
				T result = caseBlockStatement(blockStatement);
				if (result == null) result = caseStatement(blockStatement);
				if (result == null) result = caseVhdlObject(blockStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.BREAK_STATEMENT: {
				BreakStatement breakStatement = (BreakStatement)theEObject;
				T result = caseBreakStatement(breakStatement);
				if (result == null) result = caseStatement(breakStatement);
				if (result == null) result = caseVhdlObject(breakStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.BREAK_STATEMENT_ITEM: {
				BreakStatementItem breakStatementItem = (BreakStatementItem)theEObject;
				T result = caseBreakStatementItem(breakStatementItem);
				if (result == null) result = caseVhdlObject(breakStatementItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.COMPONENT_INSTANTIATION_STATEMENT: {
				ComponentInstantiationStatement componentInstantiationStatement = (ComponentInstantiationStatement)theEObject;
				T result = caseComponentInstantiationStatement(componentInstantiationStatement);
				if (result == null) result = caseInstantiationStatement(componentInstantiationStatement);
				if (result == null) result = caseStatement(componentInstantiationStatement);
				if (result == null) result = caseVhdlObject(componentInstantiationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.INSTANTIATION_STATEMENT: {
				InstantiationStatement instantiationStatement = (InstantiationStatement)theEObject;
				T result = caseInstantiationStatement(instantiationStatement);
				if (result == null) result = caseStatement(instantiationStatement);
				if (result == null) result = caseVhdlObject(instantiationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.ENTITY_INSTANTIATION_STATEMENT: {
				EntityInstantiationStatement entityInstantiationStatement = (EntityInstantiationStatement)theEObject;
				T result = caseEntityInstantiationStatement(entityInstantiationStatement);
				if (result == null) result = caseInstantiationStatement(entityInstantiationStatement);
				if (result == null) result = caseStatement(entityInstantiationStatement);
				if (result == null) result = caseVhdlObject(entityInstantiationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.CONFIGURATION_INSTANTIATION_STATEMENT: {
				ConfigurationInstantiationStatement configurationInstantiationStatement = (ConfigurationInstantiationStatement)theEObject;
				T result = caseConfigurationInstantiationStatement(configurationInstantiationStatement);
				if (result == null) result = caseInstantiationStatement(configurationInstantiationStatement);
				if (result == null) result = caseStatement(configurationInstantiationStatement);
				if (result == null) result = caseVhdlObject(configurationInstantiationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.SIMPLE_SIMULTANEOUS_STATEMENT: {
				SimpleSimultaneousStatement simpleSimultaneousStatement = (SimpleSimultaneousStatement)theEObject;
				T result = caseSimpleSimultaneousStatement(simpleSimultaneousStatement);
				if (result == null) result = caseStatement(simpleSimultaneousStatement);
				if (result == null) result = caseVhdlObject(simpleSimultaneousStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.EXIT_STATEMENT: {
				ExitStatement exitStatement = (ExitStatement)theEObject;
				T result = caseExitStatement(exitStatement);
				if (result == null) result = caseStatement(exitStatement);
				if (result == null) result = caseVhdlObject(exitStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.GENERATE_STATEMENT: {
				GenerateStatement generateStatement = (GenerateStatement)theEObject;
				T result = caseGenerateStatement(generateStatement);
				if (result == null) result = caseStatement(generateStatement);
				if (result == null) result = caseVhdlObject(generateStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.LOOP_STATEMENT: {
				LoopStatement loopStatement = (LoopStatement)theEObject;
				T result = caseLoopStatement(loopStatement);
				if (result == null) result = caseStatement(loopStatement);
				if (result == null) result = caseVhdlObject(loopStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.NEXT_STATEMENT: {
				NextStatement nextStatement = (NextStatement)theEObject;
				T result = caseNextStatement(nextStatement);
				if (result == null) result = caseStatement(nextStatement);
				if (result == null) result = caseVhdlObject(nextStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseVhdlObject(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.CONDITIONAL_WAVEFORM: {
				ConditionalWaveform conditionalWaveform = (ConditionalWaveform)theEObject;
				T result = caseConditionalWaveform(conditionalWaveform);
				if (result == null) result = caseVhdlObject(conditionalWaveform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.ITERATION_SCHEME: {
				IterationScheme iterationScheme = (IterationScheme)theEObject;
				T result = caseIterationScheme(iterationScheme);
				if (result == null) result = caseVhdlObject(iterationScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.WHILE_ITERATION_SCHEME: {
				WhileIterationScheme whileIterationScheme = (WhileIterationScheme)theEObject;
				T result = caseWhileIterationScheme(whileIterationScheme);
				if (result == null) result = caseIterationScheme(whileIterationScheme);
				if (result == null) result = caseVhdlObject(whileIterationScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.DELAY_MECHANISM: {
				DelayMechanism delayMechanism = (DelayMechanism)theEObject;
				T result = caseDelayMechanism(delayMechanism);
				if (result == null) result = caseVhdlObject(delayMechanism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.EXPRESSION_STATEMENT: {
				ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
				T result = caseExpressionStatement(expressionStatement);
				if (result == null) result = caseStatement(expressionStatement);
				if (result == null) result = caseVhdlObject(expressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.FOR_GENERATION_SCHEME: {
				ForGenerationScheme forGenerationScheme = (ForGenerationScheme)theEObject;
				T result = caseForGenerationScheme(forGenerationScheme);
				if (result == null) result = caseGenerationScheme(forGenerationScheme);
				if (result == null) result = caseVhdlObject(forGenerationScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.FOR_ITERATION_SCHEME: {
				ForIterationScheme forIterationScheme = (ForIterationScheme)theEObject;
				T result = caseForIterationScheme(forIterationScheme);
				if (result == null) result = caseIterationScheme(forIterationScheme);
				if (result == null) result = caseVhdlObject(forIterationScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.GENERATION_SCHEME: {
				GenerationScheme generationScheme = (GenerationScheme)theEObject;
				T result = caseGenerationScheme(generationScheme);
				if (result == null) result = caseVhdlObject(generationScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.IF_GENERATION_SCHEME: {
				IfGenerationScheme ifGenerationScheme = (IfGenerationScheme)theEObject;
				T result = caseIfGenerationScheme(ifGenerationScheme);
				if (result == null) result = caseGenerationScheme(ifGenerationScheme);
				if (result == null) result = caseVhdlObject(ifGenerationScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.REJECT_MECHANISM: {
				RejectMechanism rejectMechanism = (RejectMechanism)theEObject;
				T result = caseRejectMechanism(rejectMechanism);
				if (result == null) result = caseDelayMechanism(rejectMechanism);
				if (result == null) result = caseVhdlObject(rejectMechanism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.TRANSPORT_MECHANISM: {
				TransportMechanism transportMechanism = (TransportMechanism)theEObject;
				T result = caseTransportMechanism(transportMechanism);
				if (result == null) result = caseDelayMechanism(transportMechanism);
				if (result == null) result = caseVhdlObject(transportMechanism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaitStatement(WaitStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportStatement(ReportStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnStatement(ReturnStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Assignment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalAssignmentStatement(SignalAssignmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Signal Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Signal Assignment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialSignalAssignmentStatement(SequentialSignalAssignmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Signal Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Signal Assignment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalSignalAssignmentStatement(ConditionalSignalAssignmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selected Signal Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selected Signal Assignment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectedSignalAssignmentStatement(SelectedSignalAssignmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assignment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAssignmentStatement(VariableAssignmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simultaneous Case Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simultaneous Case Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimultaneousCaseStatement(SimultaneousCaseStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseStatement(CaseStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseAlternative(CaseAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simultaneous If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simultaneous If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimultaneousIfStatement(SimultaneousIfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatementTest(IfStatementTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Call Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Call Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureCallStatement(ProcedureCallStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simultaneous Procedural Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simultaneous Procedural Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimultaneousProceduralStatement(SimultaneousProceduralStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessStatement(ProcessStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertionStatement(AssertionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockStatement(BlockStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakStatement(BreakStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Statement Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Statement Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakStatementItem(BreakStatementItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instantiation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instantiation Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstantiationStatement(ComponentInstantiationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Instantiation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Instantiation Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityInstantiationStatement(EntityInstantiationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Instantiation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Instantiation Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationInstantiationStatement(ConfigurationInstantiationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Simultaneous Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Simultaneous Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSimultaneousStatement(SimpleSimultaneousStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitStatement(ExitStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generate Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generate Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerateStatement(GenerateStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopStatement(LoopStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextStatement(NextStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Waveform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Waveform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalWaveform(ConditionalWaveform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterationScheme(IterationScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Iteration Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Iteration Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileIterationScheme(WhileIterationScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Iteration Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Iteration Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForIterationScheme(ForIterationScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Generation Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Generation Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForGenerationScheme(ForGenerationScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generation Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generation Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerationScheme(GenerationScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Generation Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Generation Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfGenerationScheme(IfGenerationScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay Mechanism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayMechanism(DelayMechanism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reject Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reject Mechanism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRejectMechanism(RejectMechanism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Mechanism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportMechanism(TransportMechanism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStatement(ExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantiation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantiation Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantiationStatement(InstantiationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVhdlObject(VhdlObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StatementSwitch
