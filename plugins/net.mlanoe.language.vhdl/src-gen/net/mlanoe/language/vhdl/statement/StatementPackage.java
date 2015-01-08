/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement;

import net.mlanoe.language.vhdl.VhdlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.statement.StatementFactory
 * @model kind="package"
 * @generated
 */
public interface StatementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mlanoe.net/language/vhdl/statement/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatementPackage eINSTANCE = net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__LABEL = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.ReportStatementImpl <em>Report Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.ReportStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getReportStatement()
	 * @generated
	 */
	int REPORT_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_STATEMENT__REPORT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_STATEMENT__SEVERITY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Report Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.ExpressionStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getExpressionStatement()
	 * @generated
	 */
	int EXPRESSION_STATEMENT = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.ReturnStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__ID = EXPRESSION_STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__LABEL = EXPRESSION_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__EXPRESSION = EXPRESSION_STATEMENT__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = EXPRESSION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.SignalAssignmentStatementImpl <em>Signal Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.SignalAssignmentStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSignalAssignmentStatement()
	 * @generated
	 */
	int SIGNAL_ASSIGNMENT_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Postponed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guarded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_STATEMENT__GUARDED = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_STATEMENT__TARGET = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_STATEMENT__DELAY = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Signal Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ASSIGNMENT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.ConditionalSignalAssignmentStatementImpl <em>Conditional Signal Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.ConditionalSignalAssignmentStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getConditionalSignalAssignmentStatement()
	 * @generated
	 */
	int CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__ID = SIGNAL_ASSIGNMENT_STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__LABEL = SIGNAL_ASSIGNMENT_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Postponed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED = SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED;

	/**
	 * The feature id for the '<em><b>Guarded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__GUARDED = SIGNAL_ASSIGNMENT_STATEMENT__GUARDED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__TARGET = SIGNAL_ASSIGNMENT_STATEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__DELAY = SIGNAL_ASSIGNMENT_STATEMENT__DELAY;

	/**
	 * The feature id for the '<em><b>Waveform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM = SIGNAL_ASSIGNMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Signal Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT_FEATURE_COUNT = SIGNAL_ASSIGNMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.SelectedSignalAssignmentStatementImpl <em>Selected Signal Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.SelectedSignalAssignmentStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSelectedSignalAssignmentStatement()
	 * @generated
	 */
	int SELECTED_SIGNAL_ASSIGNMENT_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SIGNAL_ASSIGNMENT_STATEMENT__ID = CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SIGNAL_ASSIGNMENT_STATEMENT__LABEL = CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Postponed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED = CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED;

	/**
	 * The feature id for the '<em><b>Guarded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SIGNAL_ASSIGNMENT_STATEMENT__GUARDED = CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__GUARDED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SIGNAL_ASSIGNMENT_STATEMENT__TARGET = CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SIGNAL_ASSIGNMENT_STATEMENT__DELAY = CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__DELAY;

	/**
	 * The feature id for the '<em><b>Waveform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM = CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SIGNAL_ASSIGNMENT_STATEMENT__SELECTED = CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selected Signal Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SIGNAL_ASSIGNMENT_STATEMENT_FEATURE_COUNT = CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.SequentialSignalAssignmentStatementImpl <em>Sequential Signal Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.SequentialSignalAssignmentStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSequentialSignalAssignmentStatement()
	 * @generated
	 */
	int SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__ID = SIGNAL_ASSIGNMENT_STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__LABEL = SIGNAL_ASSIGNMENT_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Postponed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED = SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED;

	/**
	 * The feature id for the '<em><b>Guarded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__GUARDED = SIGNAL_ASSIGNMENT_STATEMENT__GUARDED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__TARGET = SIGNAL_ASSIGNMENT_STATEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__DELAY = SIGNAL_ASSIGNMENT_STATEMENT__DELAY;

	/**
	 * The feature id for the '<em><b>Waveform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM = SIGNAL_ASSIGNMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequential Signal Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT_FEATURE_COUNT = SIGNAL_ASSIGNMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.WaitStatementImpl <em>Wait Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.WaitStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getWaitStatement()
	 * @generated
	 */
	int WAIT_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Sensitivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STATEMENT__SENSITIVITY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STATEMENT__UNTIL = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STATEMENT__TIME = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wait Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.VariableAssignmentStatementImpl <em>Variable Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.VariableAssignmentStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getVariableAssignmentStatement()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_STATEMENT__TARGET = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_STATEMENT__INITIAL = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.CaseStatementImpl <em>Case Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.CaseStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getCaseStatement()
	 * @generated
	 */
	int CASE_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Case</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__CASE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__WHEN = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.SimultaneousCaseStatementImpl <em>Simultaneous Case Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.SimultaneousCaseStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSimultaneousCaseStatement()
	 * @generated
	 */
	int SIMULTANEOUS_CASE_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CASE_STATEMENT__ID = CASE_STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CASE_STATEMENT__LABEL = CASE_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Case</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CASE_STATEMENT__CASE = CASE_STATEMENT__CASE;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CASE_STATEMENT__WHEN = CASE_STATEMENT__WHEN;

	/**
	 * The number of structural features of the '<em>Simultaneous Case Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CASE_STATEMENT_FEATURE_COUNT = CASE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.CaseAlternativeImpl <em>Case Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.CaseAlternativeImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getCaseAlternative()
	 * @generated
	 */
	int CASE_ALTERNATIVE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ALTERNATIVE__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ALTERNATIVE__CHOICE = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ALTERNATIVE__STATEMENT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ALTERNATIVE_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.IfStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__TEST = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.SimultaneousIfStatementImpl <em>Simultaneous If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.SimultaneousIfStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSimultaneousIfStatement()
	 * @generated
	 */
	int SIMULTANEOUS_IF_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_IF_STATEMENT__ID = IF_STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_IF_STATEMENT__LABEL = IF_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_IF_STATEMENT__TEST = IF_STATEMENT__TEST;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_IF_STATEMENT__STATEMENT = IF_STATEMENT__STATEMENT;

	/**
	 * The number of structural features of the '<em>Simultaneous If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_IF_STATEMENT_FEATURE_COUNT = IF_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.IfStatementTestImpl <em>If Statement Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.IfStatementTestImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getIfStatementTest()
	 * @generated
	 */
	int IF_STATEMENT_TEST = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_TEST__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_TEST__CONDITION = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_TEST__STATEMENT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Statement Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_TEST_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.ProcedureCallStatementImpl <em>Procedure Call Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.ProcedureCallStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getProcedureCallStatement()
	 * @generated
	 */
	int PROCEDURE_CALL_STATEMENT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL_STATEMENT__PROCEDURE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postponed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL_STATEMENT__POSTPONED = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Procedure Call Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.SimultaneousProceduralStatementImpl <em>Simultaneous Procedural Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.SimultaneousProceduralStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSimultaneousProceduralStatement()
	 * @generated
	 */
	int SIMULTANEOUS_PROCEDURAL_STATEMENT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_PROCEDURAL_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_PROCEDURAL_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_PROCEDURAL_STATEMENT__DECLARATION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_PROCEDURAL_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simultaneous Procedural Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_PROCEDURAL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.ProcessStatementImpl <em>Process Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.ProcessStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getProcessStatement()
	 * @generated
	 */
	int PROCESS_STATEMENT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Postponed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATEMENT__POSTPONED = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATEMENT__DECLARATION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sensitivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATEMENT__SENSITIVITY = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Process Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.AssertionStatementImpl <em>Assertion Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.AssertionStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getAssertionStatement()
	 * @generated
	 */
	int ASSERTION_STATEMENT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_STATEMENT__REPORT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_STATEMENT__SEVERITY = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Postponed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_STATEMENT__POSTPONED = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assertion Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.BlockStatementImpl <em>Block Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.BlockStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getBlockStatement()
	 * @generated
	 */
	int BLOCK_STATEMENT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__GUARD = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__GENERIC = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__GENERIC_MAP = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__PORT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__PORT_MAP = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__DECLARATION = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Block Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.BreakStatementImpl <em>Break Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.BreakStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getBreakStatement()
	 * @generated
	 */
	int BREAK_STATEMENT = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__BREAK = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__WHEN = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensitivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__SENSITIVITY = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Break Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.BreakStatementItemImpl <em>Break Statement Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.BreakStatementItemImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getBreakStatementItem()
	 * @generated
	 */
	int BREAK_STATEMENT_ITEM = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_ITEM__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_ITEM__NAME = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_ITEM__USE = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_ITEM__ARROW = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Break Statement Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_ITEM_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.InstantiationStatementImpl <em>Instantiation Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.InstantiationStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getInstantiationStatement()
	 * @generated
	 */
	int INSTANTIATION_STATEMENT = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_STATEMENT__GENERIC_MAP = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_STATEMENT__PORT_MAP = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instantiation Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.ComponentInstantiationStatementImpl <em>Component Instantiation Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.ComponentInstantiationStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getComponentInstantiationStatement()
	 * @generated
	 */
	int COMPONENT_INSTANTIATION_STATEMENT = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_STATEMENT__ID = INSTANTIATION_STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_STATEMENT__LABEL = INSTANTIATION_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_STATEMENT__GENERIC_MAP = INSTANTIATION_STATEMENT__GENERIC_MAP;

	/**
	 * The feature id for the '<em><b>Port Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_STATEMENT__PORT_MAP = INSTANTIATION_STATEMENT__PORT_MAP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_STATEMENT__NAME = INSTANTIATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Instantiation Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_STATEMENT_FEATURE_COUNT = INSTANTIATION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.EntityInstantiationStatementImpl <em>Entity Instantiation Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.EntityInstantiationStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getEntityInstantiationStatement()
	 * @generated
	 */
	int ENTITY_INSTANTIATION_STATEMENT = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANTIATION_STATEMENT__ID = INSTANTIATION_STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANTIATION_STATEMENT__LABEL = INSTANTIATION_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANTIATION_STATEMENT__GENERIC_MAP = INSTANTIATION_STATEMENT__GENERIC_MAP;

	/**
	 * The feature id for the '<em><b>Port Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANTIATION_STATEMENT__PORT_MAP = INSTANTIATION_STATEMENT__PORT_MAP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANTIATION_STATEMENT__NAME = INSTANTIATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Instantiation Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANTIATION_STATEMENT_FEATURE_COUNT = INSTANTIATION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.ConfigurationInstantiationStatementImpl <em>Configuration Instantiation Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.ConfigurationInstantiationStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getConfigurationInstantiationStatement()
	 * @generated
	 */
	int CONFIGURATION_INSTANTIATION_STATEMENT = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_INSTANTIATION_STATEMENT__ID = INSTANTIATION_STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_INSTANTIATION_STATEMENT__LABEL = INSTANTIATION_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_INSTANTIATION_STATEMENT__GENERIC_MAP = INSTANTIATION_STATEMENT__GENERIC_MAP;

	/**
	 * The feature id for the '<em><b>Port Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_INSTANTIATION_STATEMENT__PORT_MAP = INSTANTIATION_STATEMENT__PORT_MAP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_INSTANTIATION_STATEMENT__NAME = INSTANTIATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration Instantiation Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_INSTANTIATION_STATEMENT_FEATURE_COUNT = INSTANTIATION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.SimpleSimultaneousStatementImpl <em>Simple Simultaneous Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.SimpleSimultaneousStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSimpleSimultaneousStatement()
	 * @generated
	 */
	int SIMPLE_SIMULTANEOUS_STATEMENT = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIMULTANEOUS_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIMULTANEOUS_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIMULTANEOUS_STATEMENT__LEFT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIMULTANEOUS_STATEMENT__RIGHT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIMULTANEOUS_STATEMENT__TOLERANCE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simple Simultaneous Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIMULTANEOUS_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.ExitStatementImpl <em>Exit Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.ExitStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getExitStatement()
	 * @generated
	 */
	int EXIT_STATEMENT = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT__EXIT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT__WHEN = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exit Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.GenerateStatementImpl <em>Generate Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.GenerateStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getGenerateStatement()
	 * @generated
	 */
	int GENERATE_STATEMENT = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_STATEMENT__SCHEME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_STATEMENT__DECLARATION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generate Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.LoopStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getLoopStatement()
	 * @generated
	 */
	int LOOP_STATEMENT = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__ITERATION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.NextStatementImpl <em>Next Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.NextStatementImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getNextStatement()
	 * @generated
	 */
	int NEXT_STATEMENT = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_STATEMENT__LABEL = STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_STATEMENT__NEXT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_STATEMENT__WHEN = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Next Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.IterationSchemeImpl <em>Iteration Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.IterationSchemeImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getIterationScheme()
	 * @generated
	 */
	int ITERATION_SCHEME = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SCHEME__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Iteration Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SCHEME_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.WhileIterationSchemeImpl <em>While Iteration Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.WhileIterationSchemeImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getWhileIterationScheme()
	 * @generated
	 */
	int WHILE_ITERATION_SCHEME = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_ITERATION_SCHEME__ID = ITERATION_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_ITERATION_SCHEME__CONDITION = ITERATION_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While Iteration Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_ITERATION_SCHEME_FEATURE_COUNT = ITERATION_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.DelayMechanismImpl <em>Delay Mechanism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.DelayMechanismImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getDelayMechanism()
	 * @generated
	 */
	int DELAY_MECHANISM = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_MECHANISM__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Delay Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_MECHANISM_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.GenerationSchemeImpl <em>Generation Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.GenerationSchemeImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getGenerationScheme()
	 * @generated
	 */
	int GENERATION_SCHEME = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_SCHEME__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Generation Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_SCHEME_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.ForGenerationSchemeImpl <em>For Generation Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.ForGenerationSchemeImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getForGenerationScheme()
	 * @generated
	 */
	int FOR_GENERATION_SCHEME = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_GENERATION_SCHEME__ID = GENERATION_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_GENERATION_SCHEME__VARIABLE = GENERATION_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_GENERATION_SCHEME__IN = GENERATION_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For Generation Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_GENERATION_SCHEME_FEATURE_COUNT = GENERATION_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.ForIterationSchemeImpl <em>For Iteration Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.ForIterationSchemeImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getForIterationScheme()
	 * @generated
	 */
	int FOR_ITERATION_SCHEME = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ITERATION_SCHEME__ID = ITERATION_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ITERATION_SCHEME__VARIABLE = ITERATION_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ITERATION_SCHEME__IN = ITERATION_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For Iteration Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ITERATION_SCHEME_FEATURE_COUNT = ITERATION_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.IfGenerationSchemeImpl <em>If Generation Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.IfGenerationSchemeImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getIfGenerationScheme()
	 * @generated
	 */
	int IF_GENERATION_SCHEME = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_GENERATION_SCHEME__ID = GENERATION_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_GENERATION_SCHEME__CONDITION = GENERATION_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>If Generation Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_GENERATION_SCHEME_FEATURE_COUNT = GENERATION_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.RejectMechanismImpl <em>Reject Mechanism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.RejectMechanismImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getRejectMechanism()
	 * @generated
	 */
	int REJECT_MECHANISM = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECT_MECHANISM__ID = DELAY_MECHANISM__ID;

	/**
	 * The feature id for the '<em><b>Reject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECT_MECHANISM__REJECT = DELAY_MECHANISM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reject Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECT_MECHANISM_FEATURE_COUNT = DELAY_MECHANISM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.statement.impl.TransportMechanismImpl <em>Transport Mechanism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.statement.impl.TransportMechanismImpl
	 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getTransportMechanism()
	 * @generated
	 */
	int TRANSPORT_MECHANISM = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_MECHANISM__ID = DELAY_MECHANISM__ID;

	/**
	 * The number of structural features of the '<em>Transport Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_MECHANISM_FEATURE_COUNT = DELAY_MECHANISM_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.ReportStatement <em>Report Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ReportStatement
	 * @generated
	 */
	EClass getReportStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.ReportStatement#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ReportStatement#getReport()
	 * @see #getReportStatement()
	 * @generated
	 */
	EReference getReportStatement_Report();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.ReportStatement#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Severity</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ReportStatement#getSeverity()
	 * @see #getReportStatement()
	 * @generated
	 */
	EReference getReportStatement_Severity();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.ConditionalSignalAssignmentStatement <em>Conditional Signal Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Signal Assignment Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ConditionalSignalAssignmentStatement
	 * @generated
	 */
	EClass getConditionalSignalAssignmentStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.ConditionalSignalAssignmentStatement#getWaveform <em>Waveform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Waveform</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ConditionalSignalAssignmentStatement#getWaveform()
	 * @see #getConditionalSignalAssignmentStatement()
	 * @generated
	 */
	EReference getConditionalSignalAssignmentStatement_Waveform();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.SelectedSignalAssignmentStatement <em>Selected Signal Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selected Signal Assignment Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SelectedSignalAssignmentStatement
	 * @generated
	 */
	EClass getSelectedSignalAssignmentStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.SelectedSignalAssignmentStatement#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selected</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SelectedSignalAssignmentStatement#getSelected()
	 * @see #getSelectedSignalAssignmentStatement()
	 * @generated
	 */
	EReference getSelectedSignalAssignmentStatement_Selected();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement <em>Sequential Signal Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Signal Assignment Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement
	 * @generated
	 */
	EClass getSequentialSignalAssignmentStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement#getWaveform <em>Waveform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Waveform</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement#getWaveform()
	 * @see #getSequentialSignalAssignmentStatement()
	 * @generated
	 */
	EReference getSequentialSignalAssignmentStatement_Waveform();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement <em>Signal Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Assignment Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SignalAssignmentStatement
	 * @generated
	 */
	EClass getSignalAssignmentStatement();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#isPostponed <em>Postponed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postponed</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#isPostponed()
	 * @see #getSignalAssignmentStatement()
	 * @generated
	 */
	EAttribute getSignalAssignmentStatement_Postponed();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#isGuarded <em>Guarded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guarded</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#isGuarded()
	 * @see #getSignalAssignmentStatement()
	 * @generated
	 */
	EAttribute getSignalAssignmentStatement_Guarded();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#getTarget()
	 * @see #getSignalAssignmentStatement()
	 * @generated
	 */
	EReference getSignalAssignmentStatement_Target();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#getDelay()
	 * @see #getSignalAssignmentStatement()
	 * @generated
	 */
	EReference getSignalAssignmentStatement_Delay();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.WaitStatement <em>Wait Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.WaitStatement
	 * @generated
	 */
	EClass getWaitStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.WaitStatement#getSensitivity <em>Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sensitivity</em>'.
	 * @see net.mlanoe.language.vhdl.statement.WaitStatement#getSensitivity()
	 * @see #getWaitStatement()
	 * @generated
	 */
	EReference getWaitStatement_Sensitivity();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.WaitStatement#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until</em>'.
	 * @see net.mlanoe.language.vhdl.statement.WaitStatement#getUntil()
	 * @see #getWaitStatement()
	 * @generated
	 */
	EReference getWaitStatement_Until();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.WaitStatement#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see net.mlanoe.language.vhdl.statement.WaitStatement#getTime()
	 * @see #getWaitStatement()
	 * @generated
	 */
	EReference getWaitStatement_Time();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.VariableAssignmentStatement <em>Variable Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.VariableAssignmentStatement
	 * @generated
	 */
	EClass getVariableAssignmentStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.VariableAssignmentStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see net.mlanoe.language.vhdl.statement.VariableAssignmentStatement#getTarget()
	 * @see #getVariableAssignmentStatement()
	 * @generated
	 */
	EReference getVariableAssignmentStatement_Target();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.VariableAssignmentStatement#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial</em>'.
	 * @see net.mlanoe.language.vhdl.statement.VariableAssignmentStatement#getInitial()
	 * @see #getVariableAssignmentStatement()
	 * @generated
	 */
	EReference getVariableAssignmentStatement_Initial();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.SimultaneousCaseStatement <em>Simultaneous Case Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simultaneous Case Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SimultaneousCaseStatement
	 * @generated
	 */
	EClass getSimultaneousCaseStatement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.CaseStatement <em>Case Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.CaseStatement
	 * @generated
	 */
	EClass getCaseStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.CaseStatement#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case</em>'.
	 * @see net.mlanoe.language.vhdl.statement.CaseStatement#getCase()
	 * @see #getCaseStatement()
	 * @generated
	 */
	EReference getCaseStatement_Case();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.CaseStatement#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When</em>'.
	 * @see net.mlanoe.language.vhdl.statement.CaseStatement#getWhen()
	 * @see #getCaseStatement()
	 * @generated
	 */
	EReference getCaseStatement_When();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.CaseAlternative <em>Case Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Alternative</em>'.
	 * @see net.mlanoe.language.vhdl.statement.CaseAlternative
	 * @generated
	 */
	EClass getCaseAlternative();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.CaseAlternative#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see net.mlanoe.language.vhdl.statement.CaseAlternative#getChoice()
	 * @see #getCaseAlternative()
	 * @generated
	 */
	EReference getCaseAlternative_Choice();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.CaseAlternative#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.CaseAlternative#getStatement()
	 * @see #getCaseAlternative()
	 * @generated
	 */
	EReference getCaseAlternative_Statement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.SimultaneousIfStatement <em>Simultaneous If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simultaneous If Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SimultaneousIfStatement
	 * @generated
	 */
	EClass getSimultaneousIfStatement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.IfStatement#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test</em>'.
	 * @see net.mlanoe.language.vhdl.statement.IfStatement#getTest()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Test();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.IfStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.IfStatement#getStatement()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Statement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.IfStatementTest <em>If Statement Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement Test</em>'.
	 * @see net.mlanoe.language.vhdl.statement.IfStatementTest
	 * @generated
	 */
	EClass getIfStatementTest();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.IfStatementTest#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see net.mlanoe.language.vhdl.statement.IfStatementTest#getCondition()
	 * @see #getIfStatementTest()
	 * @generated
	 */
	EReference getIfStatementTest_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.IfStatementTest#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.IfStatementTest#getStatement()
	 * @see #getIfStatementTest()
	 * @generated
	 */
	EReference getIfStatementTest_Statement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.ProcedureCallStatement <em>Procedure Call Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Call Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ProcedureCallStatement
	 * @generated
	 */
	EClass getProcedureCallStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.ProcedureCallStatement#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procedure</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ProcedureCallStatement#getProcedure()
	 * @see #getProcedureCallStatement()
	 * @generated
	 */
	EReference getProcedureCallStatement_Procedure();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.statement.ProcedureCallStatement#isPostponed <em>Postponed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postponed</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ProcedureCallStatement#isPostponed()
	 * @see #getProcedureCallStatement()
	 * @generated
	 */
	EAttribute getProcedureCallStatement_Postponed();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.SimultaneousProceduralStatement <em>Simultaneous Procedural Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simultaneous Procedural Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SimultaneousProceduralStatement
	 * @generated
	 */
	EClass getSimultaneousProceduralStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.SimultaneousProceduralStatement#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SimultaneousProceduralStatement#getDeclaration()
	 * @see #getSimultaneousProceduralStatement()
	 * @generated
	 */
	EReference getSimultaneousProceduralStatement_Declaration();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.SimultaneousProceduralStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SimultaneousProceduralStatement#getStatement()
	 * @see #getSimultaneousProceduralStatement()
	 * @generated
	 */
	EReference getSimultaneousProceduralStatement_Statement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.ProcessStatement <em>Process Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ProcessStatement
	 * @generated
	 */
	EClass getProcessStatement();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.statement.ProcessStatement#isPostponed <em>Postponed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postponed</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ProcessStatement#isPostponed()
	 * @see #getProcessStatement()
	 * @generated
	 */
	EAttribute getProcessStatement_Postponed();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.ProcessStatement#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ProcessStatement#getDeclaration()
	 * @see #getProcessStatement()
	 * @generated
	 */
	EReference getProcessStatement_Declaration();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.ProcessStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ProcessStatement#getStatement()
	 * @see #getProcessStatement()
	 * @generated
	 */
	EReference getProcessStatement_Statement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.ProcessStatement#getSensitivity <em>Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sensitivity</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ProcessStatement#getSensitivity()
	 * @see #getProcessStatement()
	 * @generated
	 */
	EReference getProcessStatement_Sensitivity();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.AssertionStatement <em>Assertion Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.AssertionStatement
	 * @generated
	 */
	EClass getAssertionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.AssertionStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see net.mlanoe.language.vhdl.statement.AssertionStatement#getCondition()
	 * @see #getAssertionStatement()
	 * @generated
	 */
	EReference getAssertionStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.AssertionStatement#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report</em>'.
	 * @see net.mlanoe.language.vhdl.statement.AssertionStatement#getReport()
	 * @see #getAssertionStatement()
	 * @generated
	 */
	EReference getAssertionStatement_Report();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.AssertionStatement#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Severity</em>'.
	 * @see net.mlanoe.language.vhdl.statement.AssertionStatement#getSeverity()
	 * @see #getAssertionStatement()
	 * @generated
	 */
	EReference getAssertionStatement_Severity();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.statement.AssertionStatement#isPostponed <em>Postponed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postponed</em>'.
	 * @see net.mlanoe.language.vhdl.statement.AssertionStatement#isPostponed()
	 * @see #getAssertionStatement()
	 * @generated
	 */
	EAttribute getAssertionStatement_Postponed();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.BlockStatement <em>Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BlockStatement
	 * @generated
	 */
	EClass getBlockStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.BlockStatement#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BlockStatement#getGuard()
	 * @see #getBlockStatement()
	 * @generated
	 */
	EReference getBlockStatement_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.BlockStatement#getGeneric <em>Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BlockStatement#getGeneric()
	 * @see #getBlockStatement()
	 * @generated
	 */
	EReference getBlockStatement_Generic();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.BlockStatement#getGenericMap <em>Generic Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Map</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BlockStatement#getGenericMap()
	 * @see #getBlockStatement()
	 * @generated
	 */
	EReference getBlockStatement_GenericMap();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.BlockStatement#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BlockStatement#getPort()
	 * @see #getBlockStatement()
	 * @generated
	 */
	EReference getBlockStatement_Port();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.BlockStatement#getPortMap <em>Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Map</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BlockStatement#getPortMap()
	 * @see #getBlockStatement()
	 * @generated
	 */
	EReference getBlockStatement_PortMap();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.BlockStatement#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BlockStatement#getDeclaration()
	 * @see #getBlockStatement()
	 * @generated
	 */
	EReference getBlockStatement_Declaration();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.BlockStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BlockStatement#getStatement()
	 * @see #getBlockStatement()
	 * @generated
	 */
	EReference getBlockStatement_Statement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BreakStatement
	 * @generated
	 */
	EClass getBreakStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.BreakStatement#getBreak <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Break</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BreakStatement#getBreak()
	 * @see #getBreakStatement()
	 * @generated
	 */
	EReference getBreakStatement_Break();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.BreakStatement#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BreakStatement#getWhen()
	 * @see #getBreakStatement()
	 * @generated
	 */
	EReference getBreakStatement_When();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.BreakStatement#getSensitivity <em>Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sensitivity</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BreakStatement#getSensitivity()
	 * @see #getBreakStatement()
	 * @generated
	 */
	EReference getBreakStatement_Sensitivity();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.BreakStatementItem <em>Break Statement Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Statement Item</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BreakStatementItem
	 * @generated
	 */
	EClass getBreakStatementItem();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.BreakStatementItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BreakStatementItem#getName()
	 * @see #getBreakStatementItem()
	 * @generated
	 */
	EReference getBreakStatementItem_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.BreakStatementItem#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BreakStatementItem#getUse()
	 * @see #getBreakStatementItem()
	 * @generated
	 */
	EReference getBreakStatementItem_Use();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.BreakStatementItem#getArrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrow</em>'.
	 * @see net.mlanoe.language.vhdl.statement.BreakStatementItem#getArrow()
	 * @see #getBreakStatementItem()
	 * @generated
	 */
	EReference getBreakStatementItem_Arrow();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.ComponentInstantiationStatement <em>Component Instantiation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instantiation Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ComponentInstantiationStatement
	 * @generated
	 */
	EClass getComponentInstantiationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.ComponentInstantiationStatement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ComponentInstantiationStatement#getName()
	 * @see #getComponentInstantiationStatement()
	 * @generated
	 */
	EReference getComponentInstantiationStatement_Name();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.InstantiationStatement <em>Instantiation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.InstantiationStatement
	 * @generated
	 */
	EClass getInstantiationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.InstantiationStatement#getGenericMap <em>Generic Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Map</em>'.
	 * @see net.mlanoe.language.vhdl.statement.InstantiationStatement#getGenericMap()
	 * @see #getInstantiationStatement()
	 * @generated
	 */
	EReference getInstantiationStatement_GenericMap();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.InstantiationStatement#getPortMap <em>Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Map</em>'.
	 * @see net.mlanoe.language.vhdl.statement.InstantiationStatement#getPortMap()
	 * @see #getInstantiationStatement()
	 * @generated
	 */
	EReference getInstantiationStatement_PortMap();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.EntityInstantiationStatement <em>Entity Instantiation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Instantiation Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.EntityInstantiationStatement
	 * @generated
	 */
	EClass getEntityInstantiationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.EntityInstantiationStatement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see net.mlanoe.language.vhdl.statement.EntityInstantiationStatement#getName()
	 * @see #getEntityInstantiationStatement()
	 * @generated
	 */
	EReference getEntityInstantiationStatement_Name();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.ConfigurationInstantiationStatement <em>Configuration Instantiation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Instantiation Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ConfigurationInstantiationStatement
	 * @generated
	 */
	EClass getConfigurationInstantiationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.ConfigurationInstantiationStatement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ConfigurationInstantiationStatement#getName()
	 * @see #getConfigurationInstantiationStatement()
	 * @generated
	 */
	EReference getConfigurationInstantiationStatement_Name();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement <em>Simple Simultaneous Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Simultaneous Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement
	 * @generated
	 */
	EClass getSimpleSimultaneousStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement#getLeft()
	 * @see #getSimpleSimultaneousStatement()
	 * @generated
	 */
	EReference getSimpleSimultaneousStatement_Left();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement#getRight()
	 * @see #getSimpleSimultaneousStatement()
	 * @generated
	 */
	EReference getSimpleSimultaneousStatement_Right();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tolerance</em>'.
	 * @see net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement#getTolerance()
	 * @see #getSimpleSimultaneousStatement()
	 * @generated
	 */
	EReference getSimpleSimultaneousStatement_Tolerance();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.ExitStatement <em>Exit Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ExitStatement
	 * @generated
	 */
	EClass getExitStatement();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.statement.ExitStatement#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ExitStatement#getExit()
	 * @see #getExitStatement()
	 * @generated
	 */
	EAttribute getExitStatement_Exit();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.ExitStatement#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ExitStatement#getWhen()
	 * @see #getExitStatement()
	 * @generated
	 */
	EReference getExitStatement_When();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.GenerateStatement <em>Generate Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generate Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.GenerateStatement
	 * @generated
	 */
	EClass getGenerateStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.GenerateStatement#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scheme</em>'.
	 * @see net.mlanoe.language.vhdl.statement.GenerateStatement#getScheme()
	 * @see #getGenerateStatement()
	 * @generated
	 */
	EReference getGenerateStatement_Scheme();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.GenerateStatement#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.statement.GenerateStatement#getDeclaration()
	 * @see #getGenerateStatement()
	 * @generated
	 */
	EReference getGenerateStatement_Declaration();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.GenerateStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.GenerateStatement#getStatement()
	 * @see #getGenerateStatement()
	 * @generated
	 */
	EReference getGenerateStatement_Statement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.LoopStatement <em>Loop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.LoopStatement
	 * @generated
	 */
	EClass getLoopStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.LoopStatement#getIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iteration</em>'.
	 * @see net.mlanoe.language.vhdl.statement.LoopStatement#getIteration()
	 * @see #getLoopStatement()
	 * @generated
	 */
	EReference getLoopStatement_Iteration();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.statement.LoopStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.LoopStatement#getStatement()
	 * @see #getLoopStatement()
	 * @generated
	 */
	EReference getLoopStatement_Statement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.NextStatement <em>Next Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.NextStatement
	 * @generated
	 */
	EClass getNextStatement();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.statement.NextStatement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next</em>'.
	 * @see net.mlanoe.language.vhdl.statement.NextStatement#getNext()
	 * @see #getNextStatement()
	 * @generated
	 */
	EAttribute getNextStatement_Next();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.NextStatement#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see net.mlanoe.language.vhdl.statement.NextStatement#getWhen()
	 * @see #getNextStatement()
	 * @generated
	 */
	EReference getNextStatement_When();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.statement.Statement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.mlanoe.language.vhdl.statement.Statement#getLabel()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Label();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.IterationScheme <em>Iteration Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration Scheme</em>'.
	 * @see net.mlanoe.language.vhdl.statement.IterationScheme
	 * @generated
	 */
	EClass getIterationScheme();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.WhileIterationScheme <em>While Iteration Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Iteration Scheme</em>'.
	 * @see net.mlanoe.language.vhdl.statement.WhileIterationScheme
	 * @generated
	 */
	EClass getWhileIterationScheme();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.WhileIterationScheme#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see net.mlanoe.language.vhdl.statement.WhileIterationScheme#getCondition()
	 * @see #getWhileIterationScheme()
	 * @generated
	 */
	EReference getWhileIterationScheme_Condition();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.DelayMechanism <em>Delay Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay Mechanism</em>'.
	 * @see net.mlanoe.language.vhdl.statement.DelayMechanism
	 * @generated
	 */
	EClass getDelayMechanism();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Statement</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ExpressionStatement
	 * @generated
	 */
	EClass getExpressionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.ExpressionStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ExpressionStatement#getExpression()
	 * @see #getExpressionStatement()
	 * @generated
	 */
	EReference getExpressionStatement_Expression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.ForGenerationScheme <em>For Generation Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Generation Scheme</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ForGenerationScheme
	 * @generated
	 */
	EClass getForGenerationScheme();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.statement.ForGenerationScheme#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ForGenerationScheme#getVariable()
	 * @see #getForGenerationScheme()
	 * @generated
	 */
	EAttribute getForGenerationScheme_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.ForGenerationScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ForGenerationScheme#getIn()
	 * @see #getForGenerationScheme()
	 * @generated
	 */
	EReference getForGenerationScheme_In();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.ForIterationScheme <em>For Iteration Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Iteration Scheme</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ForIterationScheme
	 * @generated
	 */
	EClass getForIterationScheme();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.statement.ForIterationScheme#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ForIterationScheme#getVariable()
	 * @see #getForIterationScheme()
	 * @generated
	 */
	EAttribute getForIterationScheme_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.ForIterationScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In</em>'.
	 * @see net.mlanoe.language.vhdl.statement.ForIterationScheme#getIn()
	 * @see #getForIterationScheme()
	 * @generated
	 */
	EReference getForIterationScheme_In();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.GenerationScheme <em>Generation Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Scheme</em>'.
	 * @see net.mlanoe.language.vhdl.statement.GenerationScheme
	 * @generated
	 */
	EClass getGenerationScheme();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.IfGenerationScheme <em>If Generation Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Generation Scheme</em>'.
	 * @see net.mlanoe.language.vhdl.statement.IfGenerationScheme
	 * @generated
	 */
	EClass getIfGenerationScheme();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.IfGenerationScheme#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see net.mlanoe.language.vhdl.statement.IfGenerationScheme#getCondition()
	 * @see #getIfGenerationScheme()
	 * @generated
	 */
	EReference getIfGenerationScheme_Condition();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.RejectMechanism <em>Reject Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reject Mechanism</em>'.
	 * @see net.mlanoe.language.vhdl.statement.RejectMechanism
	 * @generated
	 */
	EClass getRejectMechanism();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.statement.RejectMechanism#getReject <em>Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reject</em>'.
	 * @see net.mlanoe.language.vhdl.statement.RejectMechanism#getReject()
	 * @see #getRejectMechanism()
	 * @generated
	 */
	EReference getRejectMechanism_Reject();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.statement.TransportMechanism <em>Transport Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Mechanism</em>'.
	 * @see net.mlanoe.language.vhdl.statement.TransportMechanism
	 * @generated
	 */
	EClass getTransportMechanism();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatementFactory getStatementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.ReportStatementImpl <em>Report Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.ReportStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getReportStatement()
		 * @generated
		 */
		EClass REPORT_STATEMENT = eINSTANCE.getReportStatement();

		/**
		 * The meta object literal for the '<em><b>Report</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_STATEMENT__REPORT = eINSTANCE.getReportStatement_Report();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_STATEMENT__SEVERITY = eINSTANCE.getReportStatement_Severity();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.ReturnStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.ConditionalSignalAssignmentStatementImpl <em>Conditional Signal Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.ConditionalSignalAssignmentStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getConditionalSignalAssignmentStatement()
		 * @generated
		 */
		EClass CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT = eINSTANCE.getConditionalSignalAssignmentStatement();

		/**
		 * The meta object literal for the '<em><b>Waveform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM = eINSTANCE.getConditionalSignalAssignmentStatement_Waveform();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.SelectedSignalAssignmentStatementImpl <em>Selected Signal Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.SelectedSignalAssignmentStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSelectedSignalAssignmentStatement()
		 * @generated
		 */
		EClass SELECTED_SIGNAL_ASSIGNMENT_STATEMENT = eINSTANCE.getSelectedSignalAssignmentStatement();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTED_SIGNAL_ASSIGNMENT_STATEMENT__SELECTED = eINSTANCE.getSelectedSignalAssignmentStatement_Selected();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.SequentialSignalAssignmentStatementImpl <em>Sequential Signal Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.SequentialSignalAssignmentStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSequentialSignalAssignmentStatement()
		 * @generated
		 */
		EClass SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT = eINSTANCE.getSequentialSignalAssignmentStatement();

		/**
		 * The meta object literal for the '<em><b>Waveform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM = eINSTANCE.getSequentialSignalAssignmentStatement_Waveform();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.SignalAssignmentStatementImpl <em>Signal Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.SignalAssignmentStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSignalAssignmentStatement()
		 * @generated
		 */
		EClass SIGNAL_ASSIGNMENT_STATEMENT = eINSTANCE.getSignalAssignmentStatement();

		/**
		 * The meta object literal for the '<em><b>Postponed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED = eINSTANCE.getSignalAssignmentStatement_Postponed();

		/**
		 * The meta object literal for the '<em><b>Guarded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_ASSIGNMENT_STATEMENT__GUARDED = eINSTANCE.getSignalAssignmentStatement_Guarded();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ASSIGNMENT_STATEMENT__TARGET = eINSTANCE.getSignalAssignmentStatement_Target();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ASSIGNMENT_STATEMENT__DELAY = eINSTANCE.getSignalAssignmentStatement_Delay();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.WaitStatementImpl <em>Wait Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.WaitStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getWaitStatement()
		 * @generated
		 */
		EClass WAIT_STATEMENT = eINSTANCE.getWaitStatement();

		/**
		 * The meta object literal for the '<em><b>Sensitivity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT_STATEMENT__SENSITIVITY = eINSTANCE.getWaitStatement_Sensitivity();

		/**
		 * The meta object literal for the '<em><b>Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT_STATEMENT__UNTIL = eINSTANCE.getWaitStatement_Until();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT_STATEMENT__TIME = eINSTANCE.getWaitStatement_Time();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.VariableAssignmentStatementImpl <em>Variable Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.VariableAssignmentStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getVariableAssignmentStatement()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT_STATEMENT = eINSTANCE.getVariableAssignmentStatement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT_STATEMENT__TARGET = eINSTANCE.getVariableAssignmentStatement_Target();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT_STATEMENT__INITIAL = eINSTANCE.getVariableAssignmentStatement_Initial();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.SimultaneousCaseStatementImpl <em>Simultaneous Case Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.SimultaneousCaseStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSimultaneousCaseStatement()
		 * @generated
		 */
		EClass SIMULTANEOUS_CASE_STATEMENT = eINSTANCE.getSimultaneousCaseStatement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.CaseStatementImpl <em>Case Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.CaseStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getCaseStatement()
		 * @generated
		 */
		EClass CASE_STATEMENT = eINSTANCE.getCaseStatement();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_STATEMENT__CASE = eINSTANCE.getCaseStatement_Case();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_STATEMENT__WHEN = eINSTANCE.getCaseStatement_When();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.CaseAlternativeImpl <em>Case Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.CaseAlternativeImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getCaseAlternative()
		 * @generated
		 */
		EClass CASE_ALTERNATIVE = eINSTANCE.getCaseAlternative();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_ALTERNATIVE__CHOICE = eINSTANCE.getCaseAlternative_Choice();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_ALTERNATIVE__STATEMENT = eINSTANCE.getCaseAlternative_Statement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.SimultaneousIfStatementImpl <em>Simultaneous If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.SimultaneousIfStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSimultaneousIfStatement()
		 * @generated
		 */
		EClass SIMULTANEOUS_IF_STATEMENT = eINSTANCE.getSimultaneousIfStatement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.IfStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__TEST = eINSTANCE.getIfStatement_Test();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__STATEMENT = eINSTANCE.getIfStatement_Statement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.IfStatementTestImpl <em>If Statement Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.IfStatementTestImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getIfStatementTest()
		 * @generated
		 */
		EClass IF_STATEMENT_TEST = eINSTANCE.getIfStatementTest();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT_TEST__CONDITION = eINSTANCE.getIfStatementTest_Condition();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT_TEST__STATEMENT = eINSTANCE.getIfStatementTest_Statement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.ProcedureCallStatementImpl <em>Procedure Call Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.ProcedureCallStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getProcedureCallStatement()
		 * @generated
		 */
		EClass PROCEDURE_CALL_STATEMENT = eINSTANCE.getProcedureCallStatement();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_CALL_STATEMENT__PROCEDURE = eINSTANCE.getProcedureCallStatement_Procedure();

		/**
		 * The meta object literal for the '<em><b>Postponed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE_CALL_STATEMENT__POSTPONED = eINSTANCE.getProcedureCallStatement_Postponed();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.SimultaneousProceduralStatementImpl <em>Simultaneous Procedural Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.SimultaneousProceduralStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSimultaneousProceduralStatement()
		 * @generated
		 */
		EClass SIMULTANEOUS_PROCEDURAL_STATEMENT = eINSTANCE.getSimultaneousProceduralStatement();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULTANEOUS_PROCEDURAL_STATEMENT__DECLARATION = eINSTANCE.getSimultaneousProceduralStatement_Declaration();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULTANEOUS_PROCEDURAL_STATEMENT__STATEMENT = eINSTANCE.getSimultaneousProceduralStatement_Statement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.ProcessStatementImpl <em>Process Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.ProcessStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getProcessStatement()
		 * @generated
		 */
		EClass PROCESS_STATEMENT = eINSTANCE.getProcessStatement();

		/**
		 * The meta object literal for the '<em><b>Postponed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STATEMENT__POSTPONED = eINSTANCE.getProcessStatement_Postponed();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STATEMENT__DECLARATION = eINSTANCE.getProcessStatement_Declaration();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STATEMENT__STATEMENT = eINSTANCE.getProcessStatement_Statement();

		/**
		 * The meta object literal for the '<em><b>Sensitivity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STATEMENT__SENSITIVITY = eINSTANCE.getProcessStatement_Sensitivity();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.AssertionStatementImpl <em>Assertion Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.AssertionStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getAssertionStatement()
		 * @generated
		 */
		EClass ASSERTION_STATEMENT = eINSTANCE.getAssertionStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION_STATEMENT__CONDITION = eINSTANCE.getAssertionStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Report</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION_STATEMENT__REPORT = eINSTANCE.getAssertionStatement_Report();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION_STATEMENT__SEVERITY = eINSTANCE.getAssertionStatement_Severity();

		/**
		 * The meta object literal for the '<em><b>Postponed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION_STATEMENT__POSTPONED = eINSTANCE.getAssertionStatement_Postponed();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.BlockStatementImpl <em>Block Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.BlockStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getBlockStatement()
		 * @generated
		 */
		EClass BLOCK_STATEMENT = eINSTANCE.getBlockStatement();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STATEMENT__GUARD = eINSTANCE.getBlockStatement_Guard();

		/**
		 * The meta object literal for the '<em><b>Generic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STATEMENT__GENERIC = eINSTANCE.getBlockStatement_Generic();

		/**
		 * The meta object literal for the '<em><b>Generic Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STATEMENT__GENERIC_MAP = eINSTANCE.getBlockStatement_GenericMap();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STATEMENT__PORT = eINSTANCE.getBlockStatement_Port();

		/**
		 * The meta object literal for the '<em><b>Port Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STATEMENT__PORT_MAP = eINSTANCE.getBlockStatement_PortMap();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STATEMENT__DECLARATION = eINSTANCE.getBlockStatement_Declaration();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STATEMENT__STATEMENT = eINSTANCE.getBlockStatement_Statement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.BreakStatementImpl <em>Break Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.BreakStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getBreakStatement()
		 * @generated
		 */
		EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

		/**
		 * The meta object literal for the '<em><b>Break</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK_STATEMENT__BREAK = eINSTANCE.getBreakStatement_Break();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK_STATEMENT__WHEN = eINSTANCE.getBreakStatement_When();

		/**
		 * The meta object literal for the '<em><b>Sensitivity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK_STATEMENT__SENSITIVITY = eINSTANCE.getBreakStatement_Sensitivity();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.BreakStatementItemImpl <em>Break Statement Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.BreakStatementItemImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getBreakStatementItem()
		 * @generated
		 */
		EClass BREAK_STATEMENT_ITEM = eINSTANCE.getBreakStatementItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK_STATEMENT_ITEM__NAME = eINSTANCE.getBreakStatementItem_Name();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK_STATEMENT_ITEM__USE = eINSTANCE.getBreakStatementItem_Use();

		/**
		 * The meta object literal for the '<em><b>Arrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK_STATEMENT_ITEM__ARROW = eINSTANCE.getBreakStatementItem_Arrow();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.ComponentInstantiationStatementImpl <em>Component Instantiation Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.ComponentInstantiationStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getComponentInstantiationStatement()
		 * @generated
		 */
		EClass COMPONENT_INSTANTIATION_STATEMENT = eINSTANCE.getComponentInstantiationStatement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANTIATION_STATEMENT__NAME = eINSTANCE.getComponentInstantiationStatement_Name();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.InstantiationStatementImpl <em>Instantiation Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.InstantiationStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getInstantiationStatement()
		 * @generated
		 */
		EClass INSTANTIATION_STATEMENT = eINSTANCE.getInstantiationStatement();

		/**
		 * The meta object literal for the '<em><b>Generic Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_STATEMENT__GENERIC_MAP = eINSTANCE.getInstantiationStatement_GenericMap();

		/**
		 * The meta object literal for the '<em><b>Port Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_STATEMENT__PORT_MAP = eINSTANCE.getInstantiationStatement_PortMap();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.EntityInstantiationStatementImpl <em>Entity Instantiation Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.EntityInstantiationStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getEntityInstantiationStatement()
		 * @generated
		 */
		EClass ENTITY_INSTANTIATION_STATEMENT = eINSTANCE.getEntityInstantiationStatement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_INSTANTIATION_STATEMENT__NAME = eINSTANCE.getEntityInstantiationStatement_Name();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.ConfigurationInstantiationStatementImpl <em>Configuration Instantiation Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.ConfigurationInstantiationStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getConfigurationInstantiationStatement()
		 * @generated
		 */
		EClass CONFIGURATION_INSTANTIATION_STATEMENT = eINSTANCE.getConfigurationInstantiationStatement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_INSTANTIATION_STATEMENT__NAME = eINSTANCE.getConfigurationInstantiationStatement_Name();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.SimpleSimultaneousStatementImpl <em>Simple Simultaneous Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.SimpleSimultaneousStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getSimpleSimultaneousStatement()
		 * @generated
		 */
		EClass SIMPLE_SIMULTANEOUS_STATEMENT = eINSTANCE.getSimpleSimultaneousStatement();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SIMULTANEOUS_STATEMENT__LEFT = eINSTANCE.getSimpleSimultaneousStatement_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SIMULTANEOUS_STATEMENT__RIGHT = eINSTANCE.getSimpleSimultaneousStatement_Right();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SIMULTANEOUS_STATEMENT__TOLERANCE = eINSTANCE.getSimpleSimultaneousStatement_Tolerance();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.ExitStatementImpl <em>Exit Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.ExitStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getExitStatement()
		 * @generated
		 */
		EClass EXIT_STATEMENT = eINSTANCE.getExitStatement();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXIT_STATEMENT__EXIT = eINSTANCE.getExitStatement_Exit();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXIT_STATEMENT__WHEN = eINSTANCE.getExitStatement_When();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.GenerateStatementImpl <em>Generate Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.GenerateStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getGenerateStatement()
		 * @generated
		 */
		EClass GENERATE_STATEMENT = eINSTANCE.getGenerateStatement();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATE_STATEMENT__SCHEME = eINSTANCE.getGenerateStatement_Scheme();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATE_STATEMENT__DECLARATION = eINSTANCE.getGenerateStatement_Declaration();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATE_STATEMENT__STATEMENT = eINSTANCE.getGenerateStatement_Statement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.LoopStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getLoopStatement()
		 * @generated
		 */
		EClass LOOP_STATEMENT = eINSTANCE.getLoopStatement();

		/**
		 * The meta object literal for the '<em><b>Iteration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_STATEMENT__ITERATION = eINSTANCE.getLoopStatement_Iteration();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_STATEMENT__STATEMENT = eINSTANCE.getLoopStatement_Statement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.NextStatementImpl <em>Next Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.NextStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getNextStatement()
		 * @generated
		 */
		EClass NEXT_STATEMENT = eINSTANCE.getNextStatement();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEXT_STATEMENT__NEXT = eINSTANCE.getNextStatement_Next();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEXT_STATEMENT__WHEN = eINSTANCE.getNextStatement_When();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__LABEL = eINSTANCE.getStatement_Label();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.IterationSchemeImpl <em>Iteration Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.IterationSchemeImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getIterationScheme()
		 * @generated
		 */
		EClass ITERATION_SCHEME = eINSTANCE.getIterationScheme();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.WhileIterationSchemeImpl <em>While Iteration Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.WhileIterationSchemeImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getWhileIterationScheme()
		 * @generated
		 */
		EClass WHILE_ITERATION_SCHEME = eINSTANCE.getWhileIterationScheme();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_ITERATION_SCHEME__CONDITION = eINSTANCE.getWhileIterationScheme_Condition();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.DelayMechanismImpl <em>Delay Mechanism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.DelayMechanismImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getDelayMechanism()
		 * @generated
		 */
		EClass DELAY_MECHANISM = eINSTANCE.getDelayMechanism();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.ExpressionStatementImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getExpressionStatement()
		 * @generated
		 */
		EClass EXPRESSION_STATEMENT = eINSTANCE.getExpressionStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_STATEMENT__EXPRESSION = eINSTANCE.getExpressionStatement_Expression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.ForGenerationSchemeImpl <em>For Generation Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.ForGenerationSchemeImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getForGenerationScheme()
		 * @generated
		 */
		EClass FOR_GENERATION_SCHEME = eINSTANCE.getForGenerationScheme();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_GENERATION_SCHEME__VARIABLE = eINSTANCE.getForGenerationScheme_Variable();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_GENERATION_SCHEME__IN = eINSTANCE.getForGenerationScheme_In();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.ForIterationSchemeImpl <em>For Iteration Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.ForIterationSchemeImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getForIterationScheme()
		 * @generated
		 */
		EClass FOR_ITERATION_SCHEME = eINSTANCE.getForIterationScheme();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_ITERATION_SCHEME__VARIABLE = eINSTANCE.getForIterationScheme_Variable();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_ITERATION_SCHEME__IN = eINSTANCE.getForIterationScheme_In();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.GenerationSchemeImpl <em>Generation Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.GenerationSchemeImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getGenerationScheme()
		 * @generated
		 */
		EClass GENERATION_SCHEME = eINSTANCE.getGenerationScheme();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.IfGenerationSchemeImpl <em>If Generation Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.IfGenerationSchemeImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getIfGenerationScheme()
		 * @generated
		 */
		EClass IF_GENERATION_SCHEME = eINSTANCE.getIfGenerationScheme();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_GENERATION_SCHEME__CONDITION = eINSTANCE.getIfGenerationScheme_Condition();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.RejectMechanismImpl <em>Reject Mechanism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.RejectMechanismImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getRejectMechanism()
		 * @generated
		 */
		EClass REJECT_MECHANISM = eINSTANCE.getRejectMechanism();

		/**
		 * The meta object literal for the '<em><b>Reject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REJECT_MECHANISM__REJECT = eINSTANCE.getRejectMechanism_Reject();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.statement.impl.TransportMechanismImpl <em>Transport Mechanism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.statement.impl.TransportMechanismImpl
		 * @see net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl#getTransportMechanism()
		 * @generated
		 */
		EClass TRANSPORT_MECHANISM = eINSTANCE.getTransportMechanism();

	}

} //StatementPackage
