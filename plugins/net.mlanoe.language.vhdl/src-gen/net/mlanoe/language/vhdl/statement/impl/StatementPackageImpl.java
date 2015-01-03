/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement.impl;

import net.mlanoe.language.vhdl.VhdlPackage;

import net.mlanoe.language.vhdl.ams.AmsPackage;

import net.mlanoe.language.vhdl.ams.impl.AmsPackageImpl;

import net.mlanoe.language.vhdl.configuration.ConfigurationPackage;

import net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl;

import net.mlanoe.language.vhdl.declaration.DeclarationPackage;

import net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl;

import net.mlanoe.language.vhdl.expression.ExpressionPackage;

import net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl;

import net.mlanoe.language.vhdl.impl.VhdlPackageImpl;

import net.mlanoe.language.vhdl.nature.NaturePackage;

import net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl;

import net.mlanoe.language.vhdl.statement.AssertionStatement;
import net.mlanoe.language.vhdl.statement.BlockStatement;
import net.mlanoe.language.vhdl.statement.BreakStatement;
import net.mlanoe.language.vhdl.statement.BreakStatementItem;
import net.mlanoe.language.vhdl.statement.CaseAlternative;
import net.mlanoe.language.vhdl.statement.CaseStatement;
import net.mlanoe.language.vhdl.statement.ComponentInstantiationStatement;
import net.mlanoe.language.vhdl.statement.ConditionalSignalAssignmentStatement;
import net.mlanoe.language.vhdl.statement.ConditionalWaveform;
import net.mlanoe.language.vhdl.statement.ConfigurationInstantiationStatement;
import net.mlanoe.language.vhdl.statement.DelayMechanism;
import net.mlanoe.language.vhdl.statement.EntityInstantiationStatement;
import net.mlanoe.language.vhdl.statement.ExitStatement;
import net.mlanoe.language.vhdl.statement.ExpressionStatement;
import net.mlanoe.language.vhdl.statement.ForGenerationScheme;
import net.mlanoe.language.vhdl.statement.ForIterationScheme;
import net.mlanoe.language.vhdl.statement.GenerateStatement;
import net.mlanoe.language.vhdl.statement.GenerationScheme;
import net.mlanoe.language.vhdl.statement.IfGenerationScheme;
import net.mlanoe.language.vhdl.statement.IfStatement;
import net.mlanoe.language.vhdl.statement.IfStatementTest;
import net.mlanoe.language.vhdl.statement.InstantiationStatement;
import net.mlanoe.language.vhdl.statement.IterationScheme;
import net.mlanoe.language.vhdl.statement.LoopStatement;
import net.mlanoe.language.vhdl.statement.NextStatement;
import net.mlanoe.language.vhdl.statement.ProcedureCallStatement;
import net.mlanoe.language.vhdl.statement.ProcessStatement;
import net.mlanoe.language.vhdl.statement.RejectMechanism;
import net.mlanoe.language.vhdl.statement.ReportStatement;
import net.mlanoe.language.vhdl.statement.ReturnStatement;
import net.mlanoe.language.vhdl.statement.SelectedSignalAssignmentStatement;
import net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement;
import net.mlanoe.language.vhdl.statement.SignalAssignmentStatement;
import net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement;
import net.mlanoe.language.vhdl.statement.SimultaneousCaseStatement;
import net.mlanoe.language.vhdl.statement.SimultaneousIfStatement;
import net.mlanoe.language.vhdl.statement.SimultaneousProceduralStatement;
import net.mlanoe.language.vhdl.statement.Statement;
import net.mlanoe.language.vhdl.statement.StatementFactory;
import net.mlanoe.language.vhdl.statement.StatementPackage;
import net.mlanoe.language.vhdl.statement.TransportMechanism;
import net.mlanoe.language.vhdl.statement.VariableAssignmentStatement;
import net.mlanoe.language.vhdl.statement.WaitStatement;
import net.mlanoe.language.vhdl.statement.WhileIterationScheme;

import net.mlanoe.language.vhdl.type.TypePackage;

import net.mlanoe.language.vhdl.type.impl.TypePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementPackageImpl extends EPackageImpl implements StatementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalSignalAssignmentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectedSignalAssignmentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequentialSignalAssignmentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalAssignmentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simultaneousCaseStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseAlternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simultaneousIfStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureCallStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simultaneousProceduralStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakStatementItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstantiationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantiationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityInstantiationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationInstantiationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSimultaneousStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generateStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalWaveformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationSchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileIterationSchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayMechanismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forGenerationSchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forIterationSchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationSchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifGenerationSchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rejectMechanismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportMechanismEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatementPackageImpl() {
		super(eNS_URI, StatementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StatementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatementPackage init() {
		if (isInited) return (StatementPackage)EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI);

		// Obtain or create and register package
		StatementPackageImpl theStatementPackage = (StatementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatementPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VhdlPackageImpl theVhdlPackage = (VhdlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VhdlPackage.eNS_URI) instanceof VhdlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VhdlPackage.eNS_URI) : VhdlPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
		DeclarationPackageImpl theDeclarationPackage = (DeclarationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) instanceof DeclarationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) : DeclarationPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		NaturePackageImpl theNaturePackage = (NaturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NaturePackage.eNS_URI) instanceof NaturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NaturePackage.eNS_URI) : NaturePackage.eINSTANCE);
		AmsPackageImpl theAmsPackage = (AmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AmsPackage.eNS_URI) instanceof AmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AmsPackage.eNS_URI) : AmsPackage.eINSTANCE);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theStatementPackage.createPackageContents();
		theVhdlPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theDeclarationPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theNaturePackage.createPackageContents();
		theAmsPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theStatementPackage.initializePackageContents();
		theVhdlPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theDeclarationPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theNaturePackage.initializePackageContents();
		theAmsPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatementPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatementPackage.eNS_URI, theStatementPackage);
		return theStatementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportStatement() {
		return reportStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportStatement_Report() {
		return (EReference)reportStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportStatement_Severity() {
		return (EReference)reportStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnStatement() {
		return returnStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalSignalAssignmentStatement() {
		return conditionalSignalAssignmentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalSignalAssignmentStatement_Waveform() {
		return (EReference)conditionalSignalAssignmentStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectedSignalAssignmentStatement() {
		return selectedSignalAssignmentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectedSignalAssignmentStatement_Selected() {
		return (EReference)selectedSignalAssignmentStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequentialSignalAssignmentStatement() {
		return sequentialSignalAssignmentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequentialSignalAssignmentStatement_Waveform() {
		return (EReference)sequentialSignalAssignmentStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalAssignmentStatement() {
		return signalAssignmentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalAssignmentStatement_Postponed() {
		return (EAttribute)signalAssignmentStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalAssignmentStatement_Guarded() {
		return (EAttribute)signalAssignmentStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalAssignmentStatement_Target() {
		return (EReference)signalAssignmentStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalAssignmentStatement_Delay() {
		return (EReference)signalAssignmentStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaitStatement() {
		return waitStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaitStatement_Sensitivity() {
		return (EReference)waitStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaitStatement_Until() {
		return (EReference)waitStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaitStatement_Time() {
		return (EReference)waitStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignmentStatement() {
		return variableAssignmentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAssignmentStatement_Target() {
		return (EReference)variableAssignmentStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAssignmentStatement_Initial() {
		return (EReference)variableAssignmentStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimultaneousCaseStatement() {
		return simultaneousCaseStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseStatement() {
		return caseStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseStatement_Case() {
		return (EReference)caseStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseStatement_When() {
		return (EReference)caseStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseAlternative() {
		return caseAlternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseAlternative_Choice() {
		return (EReference)caseAlternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseAlternative_Statement() {
		return (EReference)caseAlternativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimultaneousIfStatement() {
		return simultaneousIfStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Test() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Statement() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatementTest() {
		return ifStatementTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatementTest_Condition() {
		return (EReference)ifStatementTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatementTest_Statement() {
		return (EReference)ifStatementTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureCallStatement() {
		return procedureCallStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureCallStatement_Procedure() {
		return (EReference)procedureCallStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedureCallStatement_Postponed() {
		return (EAttribute)procedureCallStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimultaneousProceduralStatement() {
		return simultaneousProceduralStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimultaneousProceduralStatement_Declaration() {
		return (EReference)simultaneousProceduralStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimultaneousProceduralStatement_Statement() {
		return (EReference)simultaneousProceduralStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessStatement() {
		return processStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessStatement_Postponed() {
		return (EAttribute)processStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessStatement_Declaration() {
		return (EReference)processStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessStatement_Statement() {
		return (EReference)processStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessStatement_Sensitivity() {
		return (EReference)processStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertionStatement() {
		return assertionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertionStatement_Condition() {
		return (EReference)assertionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertionStatement_Report() {
		return (EReference)assertionStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertionStatement_Severity() {
		return (EReference)assertionStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertionStatement_Postponed() {
		return (EAttribute)assertionStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockStatement() {
		return blockStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockStatement_Guard() {
		return (EReference)blockStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockStatement_Generic() {
		return (EReference)blockStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockStatement_GenericMap() {
		return (EReference)blockStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockStatement_Port() {
		return (EReference)blockStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockStatement_PortMap() {
		return (EReference)blockStatementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockStatement_Declaration() {
		return (EReference)blockStatementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockStatement_Statement() {
		return (EReference)blockStatementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakStatement() {
		return breakStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakStatement_Break() {
		return (EReference)breakStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakStatement_When() {
		return (EReference)breakStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakStatement_Sensitivity() {
		return (EReference)breakStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakStatementItem() {
		return breakStatementItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakStatementItem_Name() {
		return (EReference)breakStatementItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakStatementItem_Use() {
		return (EReference)breakStatementItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakStatementItem_Arrow() {
		return (EReference)breakStatementItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstantiationStatement() {
		return componentInstantiationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstantiationStatement_Name() {
		return (EReference)componentInstantiationStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantiationStatement() {
		return instantiationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantiationStatement_GenericMap() {
		return (EReference)instantiationStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantiationStatement_PortMap() {
		return (EReference)instantiationStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityInstantiationStatement() {
		return entityInstantiationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityInstantiationStatement_Name() {
		return (EReference)entityInstantiationStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationInstantiationStatement() {
		return configurationInstantiationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationInstantiationStatement_Name() {
		return (EReference)configurationInstantiationStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSimultaneousStatement() {
		return simpleSimultaneousStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleSimultaneousStatement_Left() {
		return (EReference)simpleSimultaneousStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleSimultaneousStatement_Right() {
		return (EReference)simpleSimultaneousStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleSimultaneousStatement_Tolerance() {
		return (EReference)simpleSimultaneousStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitStatement() {
		return exitStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExitStatement_Exit() {
		return (EAttribute)exitStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExitStatement_When() {
		return (EReference)exitStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerateStatement() {
		return generateStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerateStatement_Scheme() {
		return (EReference)generateStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerateStatement_Declaration() {
		return (EReference)generateStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerateStatement_Statement() {
		return (EReference)generateStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopStatement() {
		return loopStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopStatement_Iteration() {
		return (EReference)loopStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopStatement_Statement() {
		return (EReference)loopStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextStatement() {
		return nextStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextStatement_Next() {
		return (EAttribute)nextStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNextStatement_When() {
		return (EReference)nextStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_Label() {
		return (EAttribute)statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalWaveform() {
		return conditionalWaveformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalWaveform_Waveform() {
		return (EReference)conditionalWaveformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalWaveform_Choice() {
		return (EReference)conditionalWaveformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterationScheme() {
		return iterationSchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileIterationScheme() {
		return whileIterationSchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileIterationScheme_Condition() {
		return (EReference)whileIterationSchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelayMechanism() {
		return delayMechanismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionStatement() {
		return expressionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionStatement_Expression() {
		return (EReference)expressionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForGenerationScheme() {
		return forGenerationSchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForGenerationScheme_Variable() {
		return (EAttribute)forGenerationSchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForGenerationScheme_In() {
		return (EReference)forGenerationSchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForIterationScheme() {
		return forIterationSchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForIterationScheme_Variable() {
		return (EAttribute)forIterationSchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForIterationScheme_In() {
		return (EReference)forIterationSchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerationScheme() {
		return generationSchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfGenerationScheme() {
		return ifGenerationSchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfGenerationScheme_Condition() {
		return (EReference)ifGenerationSchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRejectMechanism() {
		return rejectMechanismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRejectMechanism_Reject() {
		return (EReference)rejectMechanismEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportMechanism() {
		return transportMechanismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementFactory getStatementFactory() {
		return (StatementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		reportStatementEClass = createEClass(REPORT_STATEMENT);
		createEReference(reportStatementEClass, REPORT_STATEMENT__REPORT);
		createEReference(reportStatementEClass, REPORT_STATEMENT__SEVERITY);

		returnStatementEClass = createEClass(RETURN_STATEMENT);

		conditionalSignalAssignmentStatementEClass = createEClass(CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT);
		createEReference(conditionalSignalAssignmentStatementEClass, CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM);

		selectedSignalAssignmentStatementEClass = createEClass(SELECTED_SIGNAL_ASSIGNMENT_STATEMENT);
		createEReference(selectedSignalAssignmentStatementEClass, SELECTED_SIGNAL_ASSIGNMENT_STATEMENT__SELECTED);

		sequentialSignalAssignmentStatementEClass = createEClass(SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT);
		createEReference(sequentialSignalAssignmentStatementEClass, SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM);

		signalAssignmentStatementEClass = createEClass(SIGNAL_ASSIGNMENT_STATEMENT);
		createEAttribute(signalAssignmentStatementEClass, SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED);
		createEAttribute(signalAssignmentStatementEClass, SIGNAL_ASSIGNMENT_STATEMENT__GUARDED);
		createEReference(signalAssignmentStatementEClass, SIGNAL_ASSIGNMENT_STATEMENT__TARGET);
		createEReference(signalAssignmentStatementEClass, SIGNAL_ASSIGNMENT_STATEMENT__DELAY);

		waitStatementEClass = createEClass(WAIT_STATEMENT);
		createEReference(waitStatementEClass, WAIT_STATEMENT__SENSITIVITY);
		createEReference(waitStatementEClass, WAIT_STATEMENT__UNTIL);
		createEReference(waitStatementEClass, WAIT_STATEMENT__TIME);

		variableAssignmentStatementEClass = createEClass(VARIABLE_ASSIGNMENT_STATEMENT);
		createEReference(variableAssignmentStatementEClass, VARIABLE_ASSIGNMENT_STATEMENT__TARGET);
		createEReference(variableAssignmentStatementEClass, VARIABLE_ASSIGNMENT_STATEMENT__INITIAL);

		simultaneousCaseStatementEClass = createEClass(SIMULTANEOUS_CASE_STATEMENT);

		caseStatementEClass = createEClass(CASE_STATEMENT);
		createEReference(caseStatementEClass, CASE_STATEMENT__CASE);
		createEReference(caseStatementEClass, CASE_STATEMENT__WHEN);

		caseAlternativeEClass = createEClass(CASE_ALTERNATIVE);
		createEReference(caseAlternativeEClass, CASE_ALTERNATIVE__CHOICE);
		createEReference(caseAlternativeEClass, CASE_ALTERNATIVE__STATEMENT);

		simultaneousIfStatementEClass = createEClass(SIMULTANEOUS_IF_STATEMENT);

		ifStatementEClass = createEClass(IF_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__TEST);
		createEReference(ifStatementEClass, IF_STATEMENT__STATEMENT);

		ifStatementTestEClass = createEClass(IF_STATEMENT_TEST);
		createEReference(ifStatementTestEClass, IF_STATEMENT_TEST__CONDITION);
		createEReference(ifStatementTestEClass, IF_STATEMENT_TEST__STATEMENT);

		procedureCallStatementEClass = createEClass(PROCEDURE_CALL_STATEMENT);
		createEReference(procedureCallStatementEClass, PROCEDURE_CALL_STATEMENT__PROCEDURE);
		createEAttribute(procedureCallStatementEClass, PROCEDURE_CALL_STATEMENT__POSTPONED);

		simultaneousProceduralStatementEClass = createEClass(SIMULTANEOUS_PROCEDURAL_STATEMENT);
		createEReference(simultaneousProceduralStatementEClass, SIMULTANEOUS_PROCEDURAL_STATEMENT__DECLARATION);
		createEReference(simultaneousProceduralStatementEClass, SIMULTANEOUS_PROCEDURAL_STATEMENT__STATEMENT);

		processStatementEClass = createEClass(PROCESS_STATEMENT);
		createEAttribute(processStatementEClass, PROCESS_STATEMENT__POSTPONED);
		createEReference(processStatementEClass, PROCESS_STATEMENT__DECLARATION);
		createEReference(processStatementEClass, PROCESS_STATEMENT__STATEMENT);
		createEReference(processStatementEClass, PROCESS_STATEMENT__SENSITIVITY);

		assertionStatementEClass = createEClass(ASSERTION_STATEMENT);
		createEReference(assertionStatementEClass, ASSERTION_STATEMENT__CONDITION);
		createEReference(assertionStatementEClass, ASSERTION_STATEMENT__REPORT);
		createEReference(assertionStatementEClass, ASSERTION_STATEMENT__SEVERITY);
		createEAttribute(assertionStatementEClass, ASSERTION_STATEMENT__POSTPONED);

		blockStatementEClass = createEClass(BLOCK_STATEMENT);
		createEReference(blockStatementEClass, BLOCK_STATEMENT__GUARD);
		createEReference(blockStatementEClass, BLOCK_STATEMENT__GENERIC);
		createEReference(blockStatementEClass, BLOCK_STATEMENT__GENERIC_MAP);
		createEReference(blockStatementEClass, BLOCK_STATEMENT__PORT);
		createEReference(blockStatementEClass, BLOCK_STATEMENT__PORT_MAP);
		createEReference(blockStatementEClass, BLOCK_STATEMENT__DECLARATION);
		createEReference(blockStatementEClass, BLOCK_STATEMENT__STATEMENT);

		breakStatementEClass = createEClass(BREAK_STATEMENT);
		createEReference(breakStatementEClass, BREAK_STATEMENT__BREAK);
		createEReference(breakStatementEClass, BREAK_STATEMENT__WHEN);
		createEReference(breakStatementEClass, BREAK_STATEMENT__SENSITIVITY);

		breakStatementItemEClass = createEClass(BREAK_STATEMENT_ITEM);
		createEReference(breakStatementItemEClass, BREAK_STATEMENT_ITEM__NAME);
		createEReference(breakStatementItemEClass, BREAK_STATEMENT_ITEM__USE);
		createEReference(breakStatementItemEClass, BREAK_STATEMENT_ITEM__ARROW);

		componentInstantiationStatementEClass = createEClass(COMPONENT_INSTANTIATION_STATEMENT);
		createEReference(componentInstantiationStatementEClass, COMPONENT_INSTANTIATION_STATEMENT__NAME);

		instantiationStatementEClass = createEClass(INSTANTIATION_STATEMENT);
		createEReference(instantiationStatementEClass, INSTANTIATION_STATEMENT__GENERIC_MAP);
		createEReference(instantiationStatementEClass, INSTANTIATION_STATEMENT__PORT_MAP);

		entityInstantiationStatementEClass = createEClass(ENTITY_INSTANTIATION_STATEMENT);
		createEReference(entityInstantiationStatementEClass, ENTITY_INSTANTIATION_STATEMENT__NAME);

		configurationInstantiationStatementEClass = createEClass(CONFIGURATION_INSTANTIATION_STATEMENT);
		createEReference(configurationInstantiationStatementEClass, CONFIGURATION_INSTANTIATION_STATEMENT__NAME);

		simpleSimultaneousStatementEClass = createEClass(SIMPLE_SIMULTANEOUS_STATEMENT);
		createEReference(simpleSimultaneousStatementEClass, SIMPLE_SIMULTANEOUS_STATEMENT__LEFT);
		createEReference(simpleSimultaneousStatementEClass, SIMPLE_SIMULTANEOUS_STATEMENT__RIGHT);
		createEReference(simpleSimultaneousStatementEClass, SIMPLE_SIMULTANEOUS_STATEMENT__TOLERANCE);

		exitStatementEClass = createEClass(EXIT_STATEMENT);
		createEAttribute(exitStatementEClass, EXIT_STATEMENT__EXIT);
		createEReference(exitStatementEClass, EXIT_STATEMENT__WHEN);

		generateStatementEClass = createEClass(GENERATE_STATEMENT);
		createEReference(generateStatementEClass, GENERATE_STATEMENT__SCHEME);
		createEReference(generateStatementEClass, GENERATE_STATEMENT__DECLARATION);
		createEReference(generateStatementEClass, GENERATE_STATEMENT__STATEMENT);

		loopStatementEClass = createEClass(LOOP_STATEMENT);
		createEReference(loopStatementEClass, LOOP_STATEMENT__ITERATION);
		createEReference(loopStatementEClass, LOOP_STATEMENT__STATEMENT);

		nextStatementEClass = createEClass(NEXT_STATEMENT);
		createEAttribute(nextStatementEClass, NEXT_STATEMENT__NEXT);
		createEReference(nextStatementEClass, NEXT_STATEMENT__WHEN);

		statementEClass = createEClass(STATEMENT);
		createEAttribute(statementEClass, STATEMENT__LABEL);

		conditionalWaveformEClass = createEClass(CONDITIONAL_WAVEFORM);
		createEReference(conditionalWaveformEClass, CONDITIONAL_WAVEFORM__WAVEFORM);
		createEReference(conditionalWaveformEClass, CONDITIONAL_WAVEFORM__CHOICE);

		iterationSchemeEClass = createEClass(ITERATION_SCHEME);

		whileIterationSchemeEClass = createEClass(WHILE_ITERATION_SCHEME);
		createEReference(whileIterationSchemeEClass, WHILE_ITERATION_SCHEME__CONDITION);

		delayMechanismEClass = createEClass(DELAY_MECHANISM);

		expressionStatementEClass = createEClass(EXPRESSION_STATEMENT);
		createEReference(expressionStatementEClass, EXPRESSION_STATEMENT__EXPRESSION);

		forGenerationSchemeEClass = createEClass(FOR_GENERATION_SCHEME);
		createEAttribute(forGenerationSchemeEClass, FOR_GENERATION_SCHEME__VARIABLE);
		createEReference(forGenerationSchemeEClass, FOR_GENERATION_SCHEME__IN);

		forIterationSchemeEClass = createEClass(FOR_ITERATION_SCHEME);
		createEAttribute(forIterationSchemeEClass, FOR_ITERATION_SCHEME__VARIABLE);
		createEReference(forIterationSchemeEClass, FOR_ITERATION_SCHEME__IN);

		generationSchemeEClass = createEClass(GENERATION_SCHEME);

		ifGenerationSchemeEClass = createEClass(IF_GENERATION_SCHEME);
		createEReference(ifGenerationSchemeEClass, IF_GENERATION_SCHEME__CONDITION);

		rejectMechanismEClass = createEClass(REJECT_MECHANISM);
		createEReference(rejectMechanismEClass, REJECT_MECHANISM__REJECT);

		transportMechanismEClass = createEClass(TRANSPORT_MECHANISM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		VhdlPackage theVhdlPackage = (VhdlPackage)EPackage.Registry.INSTANCE.getEPackage(VhdlPackage.eNS_URI);
		DeclarationPackage theDeclarationPackage = (DeclarationPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI);
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reportStatementEClass.getESuperTypes().add(this.getStatement());
		returnStatementEClass.getESuperTypes().add(this.getExpressionStatement());
		conditionalSignalAssignmentStatementEClass.getESuperTypes().add(this.getSignalAssignmentStatement());
		selectedSignalAssignmentStatementEClass.getESuperTypes().add(this.getConditionalSignalAssignmentStatement());
		sequentialSignalAssignmentStatementEClass.getESuperTypes().add(this.getSignalAssignmentStatement());
		signalAssignmentStatementEClass.getESuperTypes().add(this.getStatement());
		waitStatementEClass.getESuperTypes().add(this.getStatement());
		variableAssignmentStatementEClass.getESuperTypes().add(this.getStatement());
		simultaneousCaseStatementEClass.getESuperTypes().add(this.getCaseStatement());
		caseStatementEClass.getESuperTypes().add(this.getStatement());
		caseAlternativeEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		simultaneousIfStatementEClass.getESuperTypes().add(this.getIfStatement());
		ifStatementEClass.getESuperTypes().add(this.getStatement());
		ifStatementTestEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		procedureCallStatementEClass.getESuperTypes().add(this.getStatement());
		simultaneousProceduralStatementEClass.getESuperTypes().add(this.getStatement());
		processStatementEClass.getESuperTypes().add(this.getStatement());
		assertionStatementEClass.getESuperTypes().add(this.getStatement());
		blockStatementEClass.getESuperTypes().add(this.getStatement());
		breakStatementEClass.getESuperTypes().add(this.getStatement());
		breakStatementItemEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		componentInstantiationStatementEClass.getESuperTypes().add(this.getInstantiationStatement());
		instantiationStatementEClass.getESuperTypes().add(this.getStatement());
		entityInstantiationStatementEClass.getESuperTypes().add(this.getInstantiationStatement());
		configurationInstantiationStatementEClass.getESuperTypes().add(this.getInstantiationStatement());
		simpleSimultaneousStatementEClass.getESuperTypes().add(this.getStatement());
		exitStatementEClass.getESuperTypes().add(this.getStatement());
		generateStatementEClass.getESuperTypes().add(this.getStatement());
		loopStatementEClass.getESuperTypes().add(this.getStatement());
		nextStatementEClass.getESuperTypes().add(this.getStatement());
		statementEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		conditionalWaveformEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		iterationSchemeEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		whileIterationSchemeEClass.getESuperTypes().add(this.getIterationScheme());
		delayMechanismEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		expressionStatementEClass.getESuperTypes().add(this.getStatement());
		forGenerationSchemeEClass.getESuperTypes().add(this.getGenerationScheme());
		forIterationSchemeEClass.getESuperTypes().add(this.getIterationScheme());
		generationSchemeEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		ifGenerationSchemeEClass.getESuperTypes().add(this.getGenerationScheme());
		rejectMechanismEClass.getESuperTypes().add(this.getDelayMechanism());
		transportMechanismEClass.getESuperTypes().add(this.getDelayMechanism());

		// Initialize classes and features; add operations and parameters
		initEClass(reportStatementEClass, ReportStatement.class, "ReportStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReportStatement_Report(), theExpressionPackage.getExpression(), null, "report", null, 0, 1, ReportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReportStatement_Severity(), theExpressionPackage.getExpression(), null, "severity", null, 0, 1, ReportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnStatementEClass, ReturnStatement.class, "ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalSignalAssignmentStatementEClass, ConditionalSignalAssignmentStatement.class, "ConditionalSignalAssignmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalSignalAssignmentStatement_Waveform(), this.getConditionalWaveform(), null, "waveform", null, 0, -1, ConditionalSignalAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectedSignalAssignmentStatementEClass, SelectedSignalAssignmentStatement.class, "SelectedSignalAssignmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectedSignalAssignmentStatement_Selected(), theExpressionPackage.getExpression(), null, "selected", null, 0, 1, SelectedSignalAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequentialSignalAssignmentStatementEClass, SequentialSignalAssignmentStatement.class, "SequentialSignalAssignmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequentialSignalAssignmentStatement_Waveform(), theExpressionPackage.getExpression(), null, "waveform", null, 0, -1, SequentialSignalAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalAssignmentStatementEClass, SignalAssignmentStatement.class, "SignalAssignmentStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalAssignmentStatement_Postponed(), ecorePackage.getEBoolean(), "postponed", null, 0, 1, SignalAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalAssignmentStatement_Guarded(), ecorePackage.getEBoolean(), "guarded", null, 0, 1, SignalAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalAssignmentStatement_Target(), theExpressionPackage.getExpression(), null, "target", null, 0, 1, SignalAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalAssignmentStatement_Delay(), this.getDelayMechanism(), null, "delay", null, 0, 1, SignalAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitStatementEClass, WaitStatement.class, "WaitStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWaitStatement_Sensitivity(), theVhdlPackage.getMultiName(), null, "sensitivity", null, 0, 1, WaitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWaitStatement_Until(), theExpressionPackage.getExpression(), null, "until", null, 0, 1, WaitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWaitStatement_Time(), theExpressionPackage.getExpression(), null, "time", null, 0, 1, WaitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAssignmentStatementEClass, VariableAssignmentStatement.class, "VariableAssignmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAssignmentStatement_Target(), theExpressionPackage.getExpression(), null, "target", null, 0, 1, VariableAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableAssignmentStatement_Initial(), theExpressionPackage.getExpression(), null, "initial", null, 0, 1, VariableAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simultaneousCaseStatementEClass, SimultaneousCaseStatement.class, "SimultaneousCaseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caseStatementEClass, CaseStatement.class, "CaseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaseStatement_Case(), theExpressionPackage.getExpression(), null, "case", null, 0, 1, CaseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseStatement_When(), this.getCaseAlternative(), null, "when", null, 0, -1, CaseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseAlternativeEClass, CaseAlternative.class, "CaseAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaseAlternative_Choice(), theExpressionPackage.getExpression(), null, "choice", null, 0, 1, CaseAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseAlternative_Statement(), this.getStatement(), null, "statement", null, 0, -1, CaseAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simultaneousIfStatementEClass, SimultaneousIfStatement.class, "SimultaneousIfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatement_Test(), this.getIfStatementTest(), null, "test", null, 0, -1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_Statement(), this.getStatement(), null, "statement", null, 0, -1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifStatementTestEClass, IfStatementTest.class, "IfStatementTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatementTest_Condition(), theExpressionPackage.getExpression(), null, "condition", null, 0, 1, IfStatementTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatementTest_Statement(), this.getStatement(), null, "statement", null, 0, -1, IfStatementTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedureCallStatementEClass, ProcedureCallStatement.class, "ProcedureCallStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcedureCallStatement_Procedure(), theVhdlPackage.getCallReference(), null, "procedure", null, 0, 1, ProcedureCallStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedureCallStatement_Postponed(), ecorePackage.getEBoolean(), "postponed", null, 0, 1, ProcedureCallStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simultaneousProceduralStatementEClass, SimultaneousProceduralStatement.class, "SimultaneousProceduralStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimultaneousProceduralStatement_Declaration(), theDeclarationPackage.getDeclaration(), null, "declaration", null, 0, -1, SimultaneousProceduralStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimultaneousProceduralStatement_Statement(), this.getStatement(), null, "statement", null, 0, -1, SimultaneousProceduralStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processStatementEClass, ProcessStatement.class, "ProcessStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessStatement_Postponed(), ecorePackage.getEBoolean(), "postponed", null, 0, 1, ProcessStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStatement_Declaration(), theDeclarationPackage.getDeclaration(), null, "declaration", null, 0, -1, ProcessStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStatement_Statement(), this.getStatement(), null, "statement", null, 0, -1, ProcessStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStatement_Sensitivity(), theVhdlPackage.getMultiName(), null, "sensitivity", null, 0, 1, ProcessStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertionStatementEClass, AssertionStatement.class, "AssertionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertionStatement_Condition(), theExpressionPackage.getExpression(), null, "condition", null, 0, 1, AssertionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertionStatement_Report(), theExpressionPackage.getExpression(), null, "report", null, 0, 1, AssertionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertionStatement_Severity(), theExpressionPackage.getExpression(), null, "severity", null, 0, 1, AssertionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertionStatement_Postponed(), ecorePackage.getEBoolean(), "postponed", null, 0, 1, AssertionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockStatementEClass, BlockStatement.class, "BlockStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockStatement_Guard(), theExpressionPackage.getExpression(), null, "guard", null, 0, 1, BlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockStatement_Generic(), theVhdlPackage.getGenerics(), null, "generic", null, 0, 1, BlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockStatement_GenericMap(), theVhdlPackage.getGenericMaps(), null, "genericMap", null, 0, 1, BlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockStatement_Port(), theVhdlPackage.getPorts(), null, "port", null, 0, 1, BlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockStatement_PortMap(), theVhdlPackage.getPortMaps(), null, "portMap", null, 0, 1, BlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockStatement_Declaration(), theDeclarationPackage.getDeclaration(), null, "declaration", null, 0, -1, BlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockStatement_Statement(), this.getStatement(), null, "statement", null, 0, -1, BlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breakStatementEClass, BreakStatement.class, "BreakStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBreakStatement_Break(), this.getBreakStatementItem(), null, "break", null, 0, -1, BreakStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBreakStatement_When(), theExpressionPackage.getExpression(), null, "when", null, 0, 1, BreakStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBreakStatement_Sensitivity(), theVhdlPackage.getMultiName(), null, "sensitivity", null, 0, 1, BreakStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breakStatementItemEClass, BreakStatementItem.class, "BreakStatementItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBreakStatementItem_Name(), theVhdlPackage.getName_(), null, "name", null, 0, 1, BreakStatementItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBreakStatementItem_Use(), theVhdlPackage.getName_(), null, "use", null, 0, 1, BreakStatementItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBreakStatementItem_Arrow(), theExpressionPackage.getExpression(), null, "arrow", null, 0, 1, BreakStatementItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentInstantiationStatementEClass, ComponentInstantiationStatement.class, "ComponentInstantiationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstantiationStatement_Name(), theVhdlPackage.getComponentReference(), null, "name", null, 0, 1, ComponentInstantiationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantiationStatementEClass, InstantiationStatement.class, "InstantiationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstantiationStatement_GenericMap(), theVhdlPackage.getGenericMaps(), null, "genericMap", null, 0, 1, InstantiationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstantiationStatement_PortMap(), theVhdlPackage.getPortMaps(), null, "portMap", null, 0, 1, InstantiationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityInstantiationStatementEClass, EntityInstantiationStatement.class, "EntityInstantiationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityInstantiationStatement_Name(), theVhdlPackage.getEntityReference(), null, "name", null, 0, 1, EntityInstantiationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationInstantiationStatementEClass, ConfigurationInstantiationStatement.class, "ConfigurationInstantiationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationInstantiationStatement_Name(), theConfigurationPackage.getConfigurationReference(), null, "name", null, 0, 1, ConfigurationInstantiationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSimultaneousStatementEClass, SimpleSimultaneousStatement.class, "SimpleSimultaneousStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleSimultaneousStatement_Left(), theExpressionPackage.getExpression(), null, "left", null, 0, 1, SimpleSimultaneousStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleSimultaneousStatement_Right(), theExpressionPackage.getExpression(), null, "right", null, 0, 1, SimpleSimultaneousStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleSimultaneousStatement_Tolerance(), theExpressionPackage.getExpression(), null, "tolerance", null, 0, 1, SimpleSimultaneousStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exitStatementEClass, ExitStatement.class, "ExitStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExitStatement_Exit(), ecorePackage.getEString(), "exit", null, 0, 1, ExitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExitStatement_When(), theExpressionPackage.getExpression(), null, "when", null, 0, 1, ExitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generateStatementEClass, GenerateStatement.class, "GenerateStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenerateStatement_Scheme(), this.getGenerationScheme(), null, "scheme", null, 0, 1, GenerateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenerateStatement_Declaration(), theDeclarationPackage.getDeclaration(), null, "declaration", null, 0, -1, GenerateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenerateStatement_Statement(), this.getStatement(), null, "statement", null, 0, -1, GenerateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopStatementEClass, LoopStatement.class, "LoopStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoopStatement_Iteration(), this.getIterationScheme(), null, "iteration", null, 0, 1, LoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopStatement_Statement(), this.getStatement(), null, "statement", null, 0, -1, LoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nextStatementEClass, NextStatement.class, "NextStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNextStatement_Next(), ecorePackage.getEString(), "next", null, 0, 1, NextStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNextStatement_When(), theExpressionPackage.getExpression(), null, "when", null, 0, 1, NextStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_Label(), ecorePackage.getEString(), "label", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalWaveformEClass, ConditionalWaveform.class, "ConditionalWaveform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalWaveform_Waveform(), theExpressionPackage.getExpression(), null, "waveform", null, 0, -1, ConditionalWaveform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalWaveform_Choice(), theExpressionPackage.getExpression(), null, "choice", null, 0, 1, ConditionalWaveform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iterationSchemeEClass, IterationScheme.class, "IterationScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whileIterationSchemeEClass, WhileIterationScheme.class, "WhileIterationScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileIterationScheme_Condition(), theExpressionPackage.getExpression(), null, "condition", null, 0, 1, WhileIterationScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayMechanismEClass, DelayMechanism.class, "DelayMechanism", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionStatementEClass, ExpressionStatement.class, "ExpressionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionStatement_Expression(), theExpressionPackage.getExpression(), null, "expression", null, 0, 1, ExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forGenerationSchemeEClass, ForGenerationScheme.class, "ForGenerationScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForGenerationScheme_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, ForGenerationScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForGenerationScheme_In(), theExpressionPackage.getExpression(), null, "in", null, 0, 1, ForGenerationScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forIterationSchemeEClass, ForIterationScheme.class, "ForIterationScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForIterationScheme_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, ForIterationScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForIterationScheme_In(), theExpressionPackage.getExpression(), null, "in", null, 0, 1, ForIterationScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generationSchemeEClass, GenerationScheme.class, "GenerationScheme", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifGenerationSchemeEClass, IfGenerationScheme.class, "IfGenerationScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfGenerationScheme_Condition(), theExpressionPackage.getExpression(), null, "condition", null, 0, 1, IfGenerationScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rejectMechanismEClass, RejectMechanism.class, "RejectMechanism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRejectMechanism_Reject(), theExpressionPackage.getExpression(), null, "reject", null, 0, 1, RejectMechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportMechanismEClass, TransportMechanism.class, "TransportMechanism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //StatementPackageImpl
