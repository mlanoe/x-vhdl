/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement.util;

import net.mlanoe.language.vhdl.VhdlObject;

import net.mlanoe.language.vhdl.statement.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.statement.StatementPackage
 * @generated
 */
public class StatementAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatementPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StatementPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementSwitch<Adapter> modelSwitch =
		new StatementSwitch<Adapter>() {
			@Override
			public Adapter caseReportStatement(ReportStatement object) {
				return createReportStatementAdapter();
			}
			@Override
			public Adapter caseReturnStatement(ReturnStatement object) {
				return createReturnStatementAdapter();
			}
			@Override
			public Adapter caseConditionalSignalAssignmentStatement(ConditionalSignalAssignmentStatement object) {
				return createConditionalSignalAssignmentStatementAdapter();
			}
			@Override
			public Adapter caseSelectedSignalAssignmentStatement(SelectedSignalAssignmentStatement object) {
				return createSelectedSignalAssignmentStatementAdapter();
			}
			@Override
			public Adapter caseSequentialSignalAssignmentStatement(SequentialSignalAssignmentStatement object) {
				return createSequentialSignalAssignmentStatementAdapter();
			}
			@Override
			public Adapter caseSignalAssignmentStatement(SignalAssignmentStatement object) {
				return createSignalAssignmentStatementAdapter();
			}
			@Override
			public Adapter caseWaitStatement(WaitStatement object) {
				return createWaitStatementAdapter();
			}
			@Override
			public Adapter caseVariableAssignmentStatement(VariableAssignmentStatement object) {
				return createVariableAssignmentStatementAdapter();
			}
			@Override
			public Adapter caseSimultaneousCaseStatement(SimultaneousCaseStatement object) {
				return createSimultaneousCaseStatementAdapter();
			}
			@Override
			public Adapter caseCaseStatement(CaseStatement object) {
				return createCaseStatementAdapter();
			}
			@Override
			public Adapter caseCaseAlternative(CaseAlternative object) {
				return createCaseAlternativeAdapter();
			}
			@Override
			public Adapter caseSimultaneousIfStatement(SimultaneousIfStatement object) {
				return createSimultaneousIfStatementAdapter();
			}
			@Override
			public Adapter caseIfStatement(IfStatement object) {
				return createIfStatementAdapter();
			}
			@Override
			public Adapter caseIfStatementTest(IfStatementTest object) {
				return createIfStatementTestAdapter();
			}
			@Override
			public Adapter caseProcedureCallStatement(ProcedureCallStatement object) {
				return createProcedureCallStatementAdapter();
			}
			@Override
			public Adapter caseSimultaneousProceduralStatement(SimultaneousProceduralStatement object) {
				return createSimultaneousProceduralStatementAdapter();
			}
			@Override
			public Adapter caseProcessStatement(ProcessStatement object) {
				return createProcessStatementAdapter();
			}
			@Override
			public Adapter caseAssertionStatement(AssertionStatement object) {
				return createAssertionStatementAdapter();
			}
			@Override
			public Adapter caseBlockStatement(BlockStatement object) {
				return createBlockStatementAdapter();
			}
			@Override
			public Adapter caseBreakStatement(BreakStatement object) {
				return createBreakStatementAdapter();
			}
			@Override
			public Adapter caseBreakStatementItem(BreakStatementItem object) {
				return createBreakStatementItemAdapter();
			}
			@Override
			public Adapter caseComponentInstantiationStatement(ComponentInstantiationStatement object) {
				return createComponentInstantiationStatementAdapter();
			}
			@Override
			public Adapter caseInstantiationStatement(InstantiationStatement object) {
				return createInstantiationStatementAdapter();
			}
			@Override
			public Adapter caseEntityInstantiationStatement(EntityInstantiationStatement object) {
				return createEntityInstantiationStatementAdapter();
			}
			@Override
			public Adapter caseConfigurationInstantiationStatement(ConfigurationInstantiationStatement object) {
				return createConfigurationInstantiationStatementAdapter();
			}
			@Override
			public Adapter caseSimpleSimultaneousStatement(SimpleSimultaneousStatement object) {
				return createSimpleSimultaneousStatementAdapter();
			}
			@Override
			public Adapter caseExitStatement(ExitStatement object) {
				return createExitStatementAdapter();
			}
			@Override
			public Adapter caseGenerateStatement(GenerateStatement object) {
				return createGenerateStatementAdapter();
			}
			@Override
			public Adapter caseLoopStatement(LoopStatement object) {
				return createLoopStatementAdapter();
			}
			@Override
			public Adapter caseNextStatement(NextStatement object) {
				return createNextStatementAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseIterationScheme(IterationScheme object) {
				return createIterationSchemeAdapter();
			}
			@Override
			public Adapter caseWhileIterationScheme(WhileIterationScheme object) {
				return createWhileIterationSchemeAdapter();
			}
			@Override
			public Adapter caseDelayMechanism(DelayMechanism object) {
				return createDelayMechanismAdapter();
			}
			@Override
			public Adapter caseExpressionStatement(ExpressionStatement object) {
				return createExpressionStatementAdapter();
			}
			@Override
			public Adapter caseForGenerationScheme(ForGenerationScheme object) {
				return createForGenerationSchemeAdapter();
			}
			@Override
			public Adapter caseForIterationScheme(ForIterationScheme object) {
				return createForIterationSchemeAdapter();
			}
			@Override
			public Adapter caseGenerationScheme(GenerationScheme object) {
				return createGenerationSchemeAdapter();
			}
			@Override
			public Adapter caseIfGenerationScheme(IfGenerationScheme object) {
				return createIfGenerationSchemeAdapter();
			}
			@Override
			public Adapter caseRejectMechanism(RejectMechanism object) {
				return createRejectMechanismAdapter();
			}
			@Override
			public Adapter caseTransportMechanism(TransportMechanism object) {
				return createTransportMechanismAdapter();
			}
			@Override
			public Adapter caseVhdlObject(VhdlObject object) {
				return createVhdlObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.ReportStatement <em>Report Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.ReportStatement
	 * @generated
	 */
	public Adapter createReportStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.ReturnStatement
	 * @generated
	 */
	public Adapter createReturnStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.ConditionalSignalAssignmentStatement <em>Conditional Signal Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.ConditionalSignalAssignmentStatement
	 * @generated
	 */
	public Adapter createConditionalSignalAssignmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.SelectedSignalAssignmentStatement <em>Selected Signal Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.SelectedSignalAssignmentStatement
	 * @generated
	 */
	public Adapter createSelectedSignalAssignmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement <em>Sequential Signal Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement
	 * @generated
	 */
	public Adapter createSequentialSignalAssignmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement <em>Signal Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.SignalAssignmentStatement
	 * @generated
	 */
	public Adapter createSignalAssignmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.WaitStatement <em>Wait Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.WaitStatement
	 * @generated
	 */
	public Adapter createWaitStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.VariableAssignmentStatement <em>Variable Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.VariableAssignmentStatement
	 * @generated
	 */
	public Adapter createVariableAssignmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.SimultaneousCaseStatement <em>Simultaneous Case Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.SimultaneousCaseStatement
	 * @generated
	 */
	public Adapter createSimultaneousCaseStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.CaseStatement <em>Case Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.CaseStatement
	 * @generated
	 */
	public Adapter createCaseStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.CaseAlternative <em>Case Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.CaseAlternative
	 * @generated
	 */
	public Adapter createCaseAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.SimultaneousIfStatement <em>Simultaneous If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.SimultaneousIfStatement
	 * @generated
	 */
	public Adapter createSimultaneousIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.IfStatementTest <em>If Statement Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.IfStatementTest
	 * @generated
	 */
	public Adapter createIfStatementTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.ProcedureCallStatement <em>Procedure Call Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.ProcedureCallStatement
	 * @generated
	 */
	public Adapter createProcedureCallStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.SimultaneousProceduralStatement <em>Simultaneous Procedural Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.SimultaneousProceduralStatement
	 * @generated
	 */
	public Adapter createSimultaneousProceduralStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.ProcessStatement <em>Process Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.ProcessStatement
	 * @generated
	 */
	public Adapter createProcessStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.AssertionStatement <em>Assertion Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.AssertionStatement
	 * @generated
	 */
	public Adapter createAssertionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.BlockStatement <em>Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.BlockStatement
	 * @generated
	 */
	public Adapter createBlockStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.BreakStatement
	 * @generated
	 */
	public Adapter createBreakStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.BreakStatementItem <em>Break Statement Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.BreakStatementItem
	 * @generated
	 */
	public Adapter createBreakStatementItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.ComponentInstantiationStatement <em>Component Instantiation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.ComponentInstantiationStatement
	 * @generated
	 */
	public Adapter createComponentInstantiationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.InstantiationStatement <em>Instantiation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.InstantiationStatement
	 * @generated
	 */
	public Adapter createInstantiationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.EntityInstantiationStatement <em>Entity Instantiation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.EntityInstantiationStatement
	 * @generated
	 */
	public Adapter createEntityInstantiationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.ConfigurationInstantiationStatement <em>Configuration Instantiation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.ConfigurationInstantiationStatement
	 * @generated
	 */
	public Adapter createConfigurationInstantiationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement <em>Simple Simultaneous Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement
	 * @generated
	 */
	public Adapter createSimpleSimultaneousStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.ExitStatement <em>Exit Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.ExitStatement
	 * @generated
	 */
	public Adapter createExitStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.GenerateStatement <em>Generate Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.GenerateStatement
	 * @generated
	 */
	public Adapter createGenerateStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.LoopStatement <em>Loop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.LoopStatement
	 * @generated
	 */
	public Adapter createLoopStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.NextStatement <em>Next Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.NextStatement
	 * @generated
	 */
	public Adapter createNextStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.IterationScheme <em>Iteration Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.IterationScheme
	 * @generated
	 */
	public Adapter createIterationSchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.WhileIterationScheme <em>While Iteration Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.WhileIterationScheme
	 * @generated
	 */
	public Adapter createWhileIterationSchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.DelayMechanism <em>Delay Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.DelayMechanism
	 * @generated
	 */
	public Adapter createDelayMechanismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.ExpressionStatement
	 * @generated
	 */
	public Adapter createExpressionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.ForGenerationScheme <em>For Generation Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.ForGenerationScheme
	 * @generated
	 */
	public Adapter createForGenerationSchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.ForIterationScheme <em>For Iteration Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.ForIterationScheme
	 * @generated
	 */
	public Adapter createForIterationSchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.GenerationScheme <em>Generation Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.GenerationScheme
	 * @generated
	 */
	public Adapter createGenerationSchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.IfGenerationScheme <em>If Generation Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.IfGenerationScheme
	 * @generated
	 */
	public Adapter createIfGenerationSchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.RejectMechanism <em>Reject Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.RejectMechanism
	 * @generated
	 */
	public Adapter createRejectMechanismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.statement.TransportMechanism <em>Transport Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.statement.TransportMechanism
	 * @generated
	 */
	public Adapter createTransportMechanismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.VhdlObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.VhdlObject
	 * @generated
	 */
	public Adapter createVhdlObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StatementAdapterFactory
