/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement.impl;

import net.mlanoe.language.vhdl.expression.Expression;

import net.mlanoe.language.vhdl.statement.ReportStatement;
import net.mlanoe.language.vhdl.statement.StatementPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.ReportStatementImpl#getReport <em>Report</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.ReportStatementImpl#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportStatementImpl extends StatementImpl implements ReportStatement {
	/**
	 * The cached value of the '{@link #getReport() <em>Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReport()
	 * @generated
	 * @ordered
	 */
	protected Expression report;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Expression severity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.REPORT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getReport() {
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReport(Expression newReport, NotificationChain msgs) {
		Expression oldReport = report;
		report = newReport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.REPORT_STATEMENT__REPORT, oldReport, newReport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReport(Expression newReport) {
		if (newReport != report) {
			NotificationChain msgs = null;
			if (report != null)
				msgs = ((InternalEObject)report).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.REPORT_STATEMENT__REPORT, null, msgs);
			if (newReport != null)
				msgs = ((InternalEObject)newReport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.REPORT_STATEMENT__REPORT, null, msgs);
			msgs = basicSetReport(newReport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.REPORT_STATEMENT__REPORT, newReport, newReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(Expression newSeverity, NotificationChain msgs) {
		Expression oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.REPORT_STATEMENT__SEVERITY, oldSeverity, newSeverity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(Expression newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.REPORT_STATEMENT__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.REPORT_STATEMENT__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.REPORT_STATEMENT__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.REPORT_STATEMENT__REPORT:
				return basicSetReport(null, msgs);
			case StatementPackage.REPORT_STATEMENT__SEVERITY:
				return basicSetSeverity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatementPackage.REPORT_STATEMENT__REPORT:
				return getReport();
			case StatementPackage.REPORT_STATEMENT__SEVERITY:
				return getSeverity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatementPackage.REPORT_STATEMENT__REPORT:
				setReport((Expression)newValue);
				return;
			case StatementPackage.REPORT_STATEMENT__SEVERITY:
				setSeverity((Expression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatementPackage.REPORT_STATEMENT__REPORT:
				setReport((Expression)null);
				return;
			case StatementPackage.REPORT_STATEMENT__SEVERITY:
				setSeverity((Expression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatementPackage.REPORT_STATEMENT__REPORT:
				return report != null;
			case StatementPackage.REPORT_STATEMENT__SEVERITY:
				return severity != null;
		}
		return super.eIsSet(featureID);
	}

} //ReportStatementImpl
