/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.mlanoe.language.vhdl.statement.util.StatementAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementItemProviderAdapterFactory extends StatementAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.ReportStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportStatementItemProvider reportStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.ReportStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReportStatementAdapter() {
		if (reportStatementItemProvider == null) {
			reportStatementItemProvider = new ReportStatementItemProvider(this);
		}

		return reportStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.ReturnStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnStatementItemProvider returnStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.ReturnStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReturnStatementAdapter() {
		if (returnStatementItemProvider == null) {
			returnStatementItemProvider = new ReturnStatementItemProvider(this);
		}

		return returnStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.ConditionalSignalAssignmentStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalSignalAssignmentStatementItemProvider conditionalSignalAssignmentStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.ConditionalSignalAssignmentStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionalSignalAssignmentStatementAdapter() {
		if (conditionalSignalAssignmentStatementItemProvider == null) {
			conditionalSignalAssignmentStatementItemProvider = new ConditionalSignalAssignmentStatementItemProvider(this);
		}

		return conditionalSignalAssignmentStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.SelectedSignalAssignmentStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectedSignalAssignmentStatementItemProvider selectedSignalAssignmentStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.SelectedSignalAssignmentStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectedSignalAssignmentStatementAdapter() {
		if (selectedSignalAssignmentStatementItemProvider == null) {
			selectedSignalAssignmentStatementItemProvider = new SelectedSignalAssignmentStatementItemProvider(this);
		}

		return selectedSignalAssignmentStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialSignalAssignmentStatementItemProvider sequentialSignalAssignmentStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequentialSignalAssignmentStatementAdapter() {
		if (sequentialSignalAssignmentStatementItemProvider == null) {
			sequentialSignalAssignmentStatementItemProvider = new SequentialSignalAssignmentStatementItemProvider(this);
		}

		return sequentialSignalAssignmentStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.WaitStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitStatementItemProvider waitStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.WaitStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWaitStatementAdapter() {
		if (waitStatementItemProvider == null) {
			waitStatementItemProvider = new WaitStatementItemProvider(this);
		}

		return waitStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.VariableAssignmentStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableAssignmentStatementItemProvider variableAssignmentStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.VariableAssignmentStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAssignmentStatementAdapter() {
		if (variableAssignmentStatementItemProvider == null) {
			variableAssignmentStatementItemProvider = new VariableAssignmentStatementItemProvider(this);
		}

		return variableAssignmentStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.SimultaneousCaseStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimultaneousCaseStatementItemProvider simultaneousCaseStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.SimultaneousCaseStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimultaneousCaseStatementAdapter() {
		if (simultaneousCaseStatementItemProvider == null) {
			simultaneousCaseStatementItemProvider = new SimultaneousCaseStatementItemProvider(this);
		}

		return simultaneousCaseStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.CaseStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseStatementItemProvider caseStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.CaseStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCaseStatementAdapter() {
		if (caseStatementItemProvider == null) {
			caseStatementItemProvider = new CaseStatementItemProvider(this);
		}

		return caseStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.CaseAlternative} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseAlternativeItemProvider caseAlternativeItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.CaseAlternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCaseAlternativeAdapter() {
		if (caseAlternativeItemProvider == null) {
			caseAlternativeItemProvider = new CaseAlternativeItemProvider(this);
		}

		return caseAlternativeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.SimultaneousIfStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimultaneousIfStatementItemProvider simultaneousIfStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.SimultaneousIfStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimultaneousIfStatementAdapter() {
		if (simultaneousIfStatementItemProvider == null) {
			simultaneousIfStatementItemProvider = new SimultaneousIfStatementItemProvider(this);
		}

		return simultaneousIfStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.IfStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementItemProvider ifStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.IfStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfStatementAdapter() {
		if (ifStatementItemProvider == null) {
			ifStatementItemProvider = new IfStatementItemProvider(this);
		}

		return ifStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.IfStatementTest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementTestItemProvider ifStatementTestItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.IfStatementTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfStatementTestAdapter() {
		if (ifStatementTestItemProvider == null) {
			ifStatementTestItemProvider = new IfStatementTestItemProvider(this);
		}

		return ifStatementTestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.ProcedureCallStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureCallStatementItemProvider procedureCallStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.ProcedureCallStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcedureCallStatementAdapter() {
		if (procedureCallStatementItemProvider == null) {
			procedureCallStatementItemProvider = new ProcedureCallStatementItemProvider(this);
		}

		return procedureCallStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.SimultaneousProceduralStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimultaneousProceduralStatementItemProvider simultaneousProceduralStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.SimultaneousProceduralStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimultaneousProceduralStatementAdapter() {
		if (simultaneousProceduralStatementItemProvider == null) {
			simultaneousProceduralStatementItemProvider = new SimultaneousProceduralStatementItemProvider(this);
		}

		return simultaneousProceduralStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.ProcessStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessStatementItemProvider processStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.ProcessStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessStatementAdapter() {
		if (processStatementItemProvider == null) {
			processStatementItemProvider = new ProcessStatementItemProvider(this);
		}

		return processStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.AssertionStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertionStatementItemProvider assertionStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.AssertionStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertionStatementAdapter() {
		if (assertionStatementItemProvider == null) {
			assertionStatementItemProvider = new AssertionStatementItemProvider(this);
		}

		return assertionStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.BlockStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockStatementItemProvider blockStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.BlockStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlockStatementAdapter() {
		if (blockStatementItemProvider == null) {
			blockStatementItemProvider = new BlockStatementItemProvider(this);
		}

		return blockStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.BreakStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakStatementItemProvider breakStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.BreakStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBreakStatementAdapter() {
		if (breakStatementItemProvider == null) {
			breakStatementItemProvider = new BreakStatementItemProvider(this);
		}

		return breakStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.BreakStatementItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakStatementItemItemProvider breakStatementItemItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.BreakStatementItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBreakStatementItemAdapter() {
		if (breakStatementItemItemProvider == null) {
			breakStatementItemItemProvider = new BreakStatementItemItemProvider(this);
		}

		return breakStatementItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.ComponentInstantiationStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstantiationStatementItemProvider componentInstantiationStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.ComponentInstantiationStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInstantiationStatementAdapter() {
		if (componentInstantiationStatementItemProvider == null) {
			componentInstantiationStatementItemProvider = new ComponentInstantiationStatementItemProvider(this);
		}

		return componentInstantiationStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.InstantiationStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantiationStatementItemProvider instantiationStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.InstantiationStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstantiationStatementAdapter() {
		if (instantiationStatementItemProvider == null) {
			instantiationStatementItemProvider = new InstantiationStatementItemProvider(this);
		}

		return instantiationStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.EntityInstantiationStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityInstantiationStatementItemProvider entityInstantiationStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.EntityInstantiationStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityInstantiationStatementAdapter() {
		if (entityInstantiationStatementItemProvider == null) {
			entityInstantiationStatementItemProvider = new EntityInstantiationStatementItemProvider(this);
		}

		return entityInstantiationStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.ConfigurationInstantiationStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationInstantiationStatementItemProvider configurationInstantiationStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.ConfigurationInstantiationStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigurationInstantiationStatementAdapter() {
		if (configurationInstantiationStatementItemProvider == null) {
			configurationInstantiationStatementItemProvider = new ConfigurationInstantiationStatementItemProvider(this);
		}

		return configurationInstantiationStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSimultaneousStatementItemProvider simpleSimultaneousStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleSimultaneousStatementAdapter() {
		if (simpleSimultaneousStatementItemProvider == null) {
			simpleSimultaneousStatementItemProvider = new SimpleSimultaneousStatementItemProvider(this);
		}

		return simpleSimultaneousStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.ExitStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitStatementItemProvider exitStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.ExitStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExitStatementAdapter() {
		if (exitStatementItemProvider == null) {
			exitStatementItemProvider = new ExitStatementItemProvider(this);
		}

		return exitStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.GenerateStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerateStatementItemProvider generateStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.GenerateStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenerateStatementAdapter() {
		if (generateStatementItemProvider == null) {
			generateStatementItemProvider = new GenerateStatementItemProvider(this);
		}

		return generateStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.LoopStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopStatementItemProvider loopStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.LoopStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoopStatementAdapter() {
		if (loopStatementItemProvider == null) {
			loopStatementItemProvider = new LoopStatementItemProvider(this);
		}

		return loopStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.NextStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NextStatementItemProvider nextStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.NextStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNextStatementAdapter() {
		if (nextStatementItemProvider == null) {
			nextStatementItemProvider = new NextStatementItemProvider(this);
		}

		return nextStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.ConditionalWaveform} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalWaveformItemProvider conditionalWaveformItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.ConditionalWaveform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionalWaveformAdapter() {
		if (conditionalWaveformItemProvider == null) {
			conditionalWaveformItemProvider = new ConditionalWaveformItemProvider(this);
		}

		return conditionalWaveformItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.IterationScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterationSchemeItemProvider iterationSchemeItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.IterationScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIterationSchemeAdapter() {
		if (iterationSchemeItemProvider == null) {
			iterationSchemeItemProvider = new IterationSchemeItemProvider(this);
		}

		return iterationSchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.WhileIterationScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileIterationSchemeItemProvider whileIterationSchemeItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.WhileIterationScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhileIterationSchemeAdapter() {
		if (whileIterationSchemeItemProvider == null) {
			whileIterationSchemeItemProvider = new WhileIterationSchemeItemProvider(this);
		}

		return whileIterationSchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.ExpressionStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionStatementItemProvider expressionStatementItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.ExpressionStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpressionStatementAdapter() {
		if (expressionStatementItemProvider == null) {
			expressionStatementItemProvider = new ExpressionStatementItemProvider(this);
		}

		return expressionStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.ForGenerationScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForGenerationSchemeItemProvider forGenerationSchemeItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.ForGenerationScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForGenerationSchemeAdapter() {
		if (forGenerationSchemeItemProvider == null) {
			forGenerationSchemeItemProvider = new ForGenerationSchemeItemProvider(this);
		}

		return forGenerationSchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.ForIterationScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForIterationSchemeItemProvider forIterationSchemeItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.ForIterationScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForIterationSchemeAdapter() {
		if (forIterationSchemeItemProvider == null) {
			forIterationSchemeItemProvider = new ForIterationSchemeItemProvider(this);
		}

		return forIterationSchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.IfGenerationScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfGenerationSchemeItemProvider ifGenerationSchemeItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.IfGenerationScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfGenerationSchemeAdapter() {
		if (ifGenerationSchemeItemProvider == null) {
			ifGenerationSchemeItemProvider = new IfGenerationSchemeItemProvider(this);
		}

		return ifGenerationSchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.RejectMechanism} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RejectMechanismItemProvider rejectMechanismItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.RejectMechanism}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRejectMechanismAdapter() {
		if (rejectMechanismItemProvider == null) {
			rejectMechanismItemProvider = new RejectMechanismItemProvider(this);
		}

		return rejectMechanismItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.statement.TransportMechanism} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportMechanismItemProvider transportMechanismItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.statement.TransportMechanism}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransportMechanismAdapter() {
		if (transportMechanismItemProvider == null) {
			transportMechanismItemProvider = new TransportMechanismItemProvider(this);
		}

		return transportMechanismItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (reportStatementItemProvider != null) reportStatementItemProvider.dispose();
		if (returnStatementItemProvider != null) returnStatementItemProvider.dispose();
		if (conditionalSignalAssignmentStatementItemProvider != null) conditionalSignalAssignmentStatementItemProvider.dispose();
		if (selectedSignalAssignmentStatementItemProvider != null) selectedSignalAssignmentStatementItemProvider.dispose();
		if (sequentialSignalAssignmentStatementItemProvider != null) sequentialSignalAssignmentStatementItemProvider.dispose();
		if (waitStatementItemProvider != null) waitStatementItemProvider.dispose();
		if (variableAssignmentStatementItemProvider != null) variableAssignmentStatementItemProvider.dispose();
		if (simultaneousCaseStatementItemProvider != null) simultaneousCaseStatementItemProvider.dispose();
		if (caseStatementItemProvider != null) caseStatementItemProvider.dispose();
		if (caseAlternativeItemProvider != null) caseAlternativeItemProvider.dispose();
		if (simultaneousIfStatementItemProvider != null) simultaneousIfStatementItemProvider.dispose();
		if (ifStatementItemProvider != null) ifStatementItemProvider.dispose();
		if (ifStatementTestItemProvider != null) ifStatementTestItemProvider.dispose();
		if (procedureCallStatementItemProvider != null) procedureCallStatementItemProvider.dispose();
		if (simultaneousProceduralStatementItemProvider != null) simultaneousProceduralStatementItemProvider.dispose();
		if (processStatementItemProvider != null) processStatementItemProvider.dispose();
		if (assertionStatementItemProvider != null) assertionStatementItemProvider.dispose();
		if (blockStatementItemProvider != null) blockStatementItemProvider.dispose();
		if (breakStatementItemProvider != null) breakStatementItemProvider.dispose();
		if (breakStatementItemItemProvider != null) breakStatementItemItemProvider.dispose();
		if (componentInstantiationStatementItemProvider != null) componentInstantiationStatementItemProvider.dispose();
		if (instantiationStatementItemProvider != null) instantiationStatementItemProvider.dispose();
		if (entityInstantiationStatementItemProvider != null) entityInstantiationStatementItemProvider.dispose();
		if (configurationInstantiationStatementItemProvider != null) configurationInstantiationStatementItemProvider.dispose();
		if (simpleSimultaneousStatementItemProvider != null) simpleSimultaneousStatementItemProvider.dispose();
		if (exitStatementItemProvider != null) exitStatementItemProvider.dispose();
		if (generateStatementItemProvider != null) generateStatementItemProvider.dispose();
		if (loopStatementItemProvider != null) loopStatementItemProvider.dispose();
		if (nextStatementItemProvider != null) nextStatementItemProvider.dispose();
		if (conditionalWaveformItemProvider != null) conditionalWaveformItemProvider.dispose();
		if (iterationSchemeItemProvider != null) iterationSchemeItemProvider.dispose();
		if (whileIterationSchemeItemProvider != null) whileIterationSchemeItemProvider.dispose();
		if (expressionStatementItemProvider != null) expressionStatementItemProvider.dispose();
		if (forGenerationSchemeItemProvider != null) forGenerationSchemeItemProvider.dispose();
		if (forIterationSchemeItemProvider != null) forIterationSchemeItemProvider.dispose();
		if (ifGenerationSchemeItemProvider != null) ifGenerationSchemeItemProvider.dispose();
		if (rejectMechanismItemProvider != null) rejectMechanismItemProvider.dispose();
		if (transportMechanismItemProvider != null) transportMechanismItemProvider.dispose();
	}

}
