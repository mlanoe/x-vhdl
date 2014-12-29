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
package net.mlanoe.language.vhdl.statement.impl;

import net.mlanoe.language.vhdl.statement.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementFactoryImpl extends EFactoryImpl implements StatementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatementFactory init() {
		try {
			StatementFactory theStatementFactory = (StatementFactory)EPackage.Registry.INSTANCE.getEFactory(StatementPackage.eNS_URI);
			if (theStatementFactory != null) {
				return theStatementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatementPackage.REPORT_STATEMENT: return createReportStatement();
			case StatementPackage.RETURN_STATEMENT: return createReturnStatement();
			case StatementPackage.CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT: return createConditionalSignalAssignmentStatement();
			case StatementPackage.SELECTED_SIGNAL_ASSIGNMENT_STATEMENT: return createSelectedSignalAssignmentStatement();
			case StatementPackage.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT: return createSequentialSignalAssignmentStatement();
			case StatementPackage.WAIT_STATEMENT: return createWaitStatement();
			case StatementPackage.VARIABLE_ASSIGNMENT_STATEMENT: return createVariableAssignmentStatement();
			case StatementPackage.SIMULTANEOUS_CASE_STATEMENT: return createSimultaneousCaseStatement();
			case StatementPackage.CASE_STATEMENT: return createCaseStatement();
			case StatementPackage.CASE_ALTERNATIVE: return createCaseAlternative();
			case StatementPackage.SIMULTANEOUS_IF_STATEMENT: return createSimultaneousIfStatement();
			case StatementPackage.IF_STATEMENT: return createIfStatement();
			case StatementPackage.IF_STATEMENT_TEST: return createIfStatementTest();
			case StatementPackage.PROCEDURE_CALL_STATEMENT: return createProcedureCallStatement();
			case StatementPackage.SIMULTANEOUS_PROCEDURAL_STATEMENT: return createSimultaneousProceduralStatement();
			case StatementPackage.PROCESS_STATEMENT: return createProcessStatement();
			case StatementPackage.ASSERTION_STATEMENT: return createAssertionStatement();
			case StatementPackage.BLOCK_STATEMENT: return createBlockStatement();
			case StatementPackage.BREAK_STATEMENT: return createBreakStatement();
			case StatementPackage.BREAK_STATEMENT_ITEM: return createBreakStatementItem();
			case StatementPackage.COMPONENT_INSTANTIATION_STATEMENT: return createComponentInstantiationStatement();
			case StatementPackage.INSTANTIATION_STATEMENT: return createInstantiationStatement();
			case StatementPackage.ENTITY_INSTANTIATION_STATEMENT: return createEntityInstantiationStatement();
			case StatementPackage.CONFIGURATION_INSTANTIATION_STATEMENT: return createConfigurationInstantiationStatement();
			case StatementPackage.SIMPLE_SIMULTANEOUS_STATEMENT: return createSimpleSimultaneousStatement();
			case StatementPackage.EXIT_STATEMENT: return createExitStatement();
			case StatementPackage.GENERATE_STATEMENT: return createGenerateStatement();
			case StatementPackage.LOOP_STATEMENT: return createLoopStatement();
			case StatementPackage.NEXT_STATEMENT: return createNextStatement();
			case StatementPackage.CONDITIONAL_WAVEFORM: return createConditionalWaveform();
			case StatementPackage.ITERATION_SCHEME: return createIterationScheme();
			case StatementPackage.WHILE_ITERATION_SCHEME: return createWhileIterationScheme();
			case StatementPackage.EXPRESSION_STATEMENT: return createExpressionStatement();
			case StatementPackage.FOR_GENERATION_SCHEME: return createForGenerationScheme();
			case StatementPackage.FOR_ITERATION_SCHEME: return createForIterationScheme();
			case StatementPackage.IF_GENERATION_SCHEME: return createIfGenerationScheme();
			case StatementPackage.REJECT_MECHANISM: return createRejectMechanism();
			case StatementPackage.TRANSPORT_MECHANISM: return createTransportMechanism();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportStatement createReportStatement() {
		ReportStatementImpl reportStatement = new ReportStatementImpl();
		return reportStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalSignalAssignmentStatement createConditionalSignalAssignmentStatement() {
		ConditionalSignalAssignmentStatementImpl conditionalSignalAssignmentStatement = new ConditionalSignalAssignmentStatementImpl();
		return conditionalSignalAssignmentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedSignalAssignmentStatement createSelectedSignalAssignmentStatement() {
		SelectedSignalAssignmentStatementImpl selectedSignalAssignmentStatement = new SelectedSignalAssignmentStatementImpl();
		return selectedSignalAssignmentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialSignalAssignmentStatement createSequentialSignalAssignmentStatement() {
		SequentialSignalAssignmentStatementImpl sequentialSignalAssignmentStatement = new SequentialSignalAssignmentStatementImpl();
		return sequentialSignalAssignmentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitStatement createWaitStatement() {
		WaitStatementImpl waitStatement = new WaitStatementImpl();
		return waitStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignmentStatement createVariableAssignmentStatement() {
		VariableAssignmentStatementImpl variableAssignmentStatement = new VariableAssignmentStatementImpl();
		return variableAssignmentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimultaneousCaseStatement createSimultaneousCaseStatement() {
		SimultaneousCaseStatementImpl simultaneousCaseStatement = new SimultaneousCaseStatementImpl();
		return simultaneousCaseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseStatement createCaseStatement() {
		CaseStatementImpl caseStatement = new CaseStatementImpl();
		return caseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseAlternative createCaseAlternative() {
		CaseAlternativeImpl caseAlternative = new CaseAlternativeImpl();
		return caseAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimultaneousIfStatement createSimultaneousIfStatement() {
		SimultaneousIfStatementImpl simultaneousIfStatement = new SimultaneousIfStatementImpl();
		return simultaneousIfStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatementTest createIfStatementTest() {
		IfStatementTestImpl ifStatementTest = new IfStatementTestImpl();
		return ifStatementTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureCallStatement createProcedureCallStatement() {
		ProcedureCallStatementImpl procedureCallStatement = new ProcedureCallStatementImpl();
		return procedureCallStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimultaneousProceduralStatement createSimultaneousProceduralStatement() {
		SimultaneousProceduralStatementImpl simultaneousProceduralStatement = new SimultaneousProceduralStatementImpl();
		return simultaneousProceduralStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStatement createProcessStatement() {
		ProcessStatementImpl processStatement = new ProcessStatementImpl();
		return processStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionStatement createAssertionStatement() {
		AssertionStatementImpl assertionStatement = new AssertionStatementImpl();
		return assertionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockStatement createBlockStatement() {
		BlockStatementImpl blockStatement = new BlockStatementImpl();
		return blockStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakStatement createBreakStatement() {
		BreakStatementImpl breakStatement = new BreakStatementImpl();
		return breakStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakStatementItem createBreakStatementItem() {
		BreakStatementItemImpl breakStatementItem = new BreakStatementItemImpl();
		return breakStatementItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstantiationStatement createComponentInstantiationStatement() {
		ComponentInstantiationStatementImpl componentInstantiationStatement = new ComponentInstantiationStatementImpl();
		return componentInstantiationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiationStatement createInstantiationStatement() {
		InstantiationStatementImpl instantiationStatement = new InstantiationStatementImpl();
		return instantiationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityInstantiationStatement createEntityInstantiationStatement() {
		EntityInstantiationStatementImpl entityInstantiationStatement = new EntityInstantiationStatementImpl();
		return entityInstantiationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationInstantiationStatement createConfigurationInstantiationStatement() {
		ConfigurationInstantiationStatementImpl configurationInstantiationStatement = new ConfigurationInstantiationStatementImpl();
		return configurationInstantiationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSimultaneousStatement createSimpleSimultaneousStatement() {
		SimpleSimultaneousStatementImpl simpleSimultaneousStatement = new SimpleSimultaneousStatementImpl();
		return simpleSimultaneousStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitStatement createExitStatement() {
		ExitStatementImpl exitStatement = new ExitStatementImpl();
		return exitStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerateStatement createGenerateStatement() {
		GenerateStatementImpl generateStatement = new GenerateStatementImpl();
		return generateStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopStatement createLoopStatement() {
		LoopStatementImpl loopStatement = new LoopStatementImpl();
		return loopStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextStatement createNextStatement() {
		NextStatementImpl nextStatement = new NextStatementImpl();
		return nextStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalWaveform createConditionalWaveform() {
		ConditionalWaveformImpl conditionalWaveform = new ConditionalWaveformImpl();
		return conditionalWaveform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterationScheme createIterationScheme() {
		IterationSchemeImpl iterationScheme = new IterationSchemeImpl();
		return iterationScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileIterationScheme createWhileIterationScheme() {
		WhileIterationSchemeImpl whileIterationScheme = new WhileIterationSchemeImpl();
		return whileIterationScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionStatement createExpressionStatement() {
		ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
		return expressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForGenerationScheme createForGenerationScheme() {
		ForGenerationSchemeImpl forGenerationScheme = new ForGenerationSchemeImpl();
		return forGenerationScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForIterationScheme createForIterationScheme() {
		ForIterationSchemeImpl forIterationScheme = new ForIterationSchemeImpl();
		return forIterationScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfGenerationScheme createIfGenerationScheme() {
		IfGenerationSchemeImpl ifGenerationScheme = new IfGenerationSchemeImpl();
		return ifGenerationScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RejectMechanism createRejectMechanism() {
		RejectMechanismImpl rejectMechanism = new RejectMechanismImpl();
		return rejectMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMechanism createTransportMechanism() {
		TransportMechanismImpl transportMechanism = new TransportMechanismImpl();
		return transportMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementPackage getStatementPackage() {
		return (StatementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatementPackage getPackage() {
		return StatementPackage.eINSTANCE;
	}

} //StatementFactoryImpl
