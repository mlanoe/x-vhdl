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

import net.mlanoe.language.vhdl.expression.Expression;

import net.mlanoe.language.vhdl.statement.AssertionStatement;
import net.mlanoe.language.vhdl.statement.StatementPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.AssertionStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.AssertionStatementImpl#getReport <em>Report</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.AssertionStatementImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.AssertionStatementImpl#isPostponed <em>Postponed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertionStatementImpl extends StatementImpl implements AssertionStatement {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

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
	 * The default value of the '{@link #isPostponed() <em>Postponed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostponed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSTPONED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPostponed() <em>Postponed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostponed()
	 * @generated
	 * @ordered
	 */
	protected boolean postponed = POSTPONED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertionStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.ASSERTION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.ASSERTION_STATEMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.ASSERTION_STATEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.ASSERTION_STATEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.ASSERTION_STATEMENT__CONDITION, newCondition, newCondition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.ASSERTION_STATEMENT__REPORT, oldReport, newReport);
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
				msgs = ((InternalEObject)report).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.ASSERTION_STATEMENT__REPORT, null, msgs);
			if (newReport != null)
				msgs = ((InternalEObject)newReport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.ASSERTION_STATEMENT__REPORT, null, msgs);
			msgs = basicSetReport(newReport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.ASSERTION_STATEMENT__REPORT, newReport, newReport));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.ASSERTION_STATEMENT__SEVERITY, oldSeverity, newSeverity);
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
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.ASSERTION_STATEMENT__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.ASSERTION_STATEMENT__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.ASSERTION_STATEMENT__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPostponed() {
		return postponed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostponed(boolean newPostponed) {
		boolean oldPostponed = postponed;
		postponed = newPostponed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.ASSERTION_STATEMENT__POSTPONED, oldPostponed, postponed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.ASSERTION_STATEMENT__CONDITION:
				return basicSetCondition(null, msgs);
			case StatementPackage.ASSERTION_STATEMENT__REPORT:
				return basicSetReport(null, msgs);
			case StatementPackage.ASSERTION_STATEMENT__SEVERITY:
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
			case StatementPackage.ASSERTION_STATEMENT__CONDITION:
				return getCondition();
			case StatementPackage.ASSERTION_STATEMENT__REPORT:
				return getReport();
			case StatementPackage.ASSERTION_STATEMENT__SEVERITY:
				return getSeverity();
			case StatementPackage.ASSERTION_STATEMENT__POSTPONED:
				return isPostponed();
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
			case StatementPackage.ASSERTION_STATEMENT__CONDITION:
				setCondition((Expression)newValue);
				return;
			case StatementPackage.ASSERTION_STATEMENT__REPORT:
				setReport((Expression)newValue);
				return;
			case StatementPackage.ASSERTION_STATEMENT__SEVERITY:
				setSeverity((Expression)newValue);
				return;
			case StatementPackage.ASSERTION_STATEMENT__POSTPONED:
				setPostponed((Boolean)newValue);
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
			case StatementPackage.ASSERTION_STATEMENT__CONDITION:
				setCondition((Expression)null);
				return;
			case StatementPackage.ASSERTION_STATEMENT__REPORT:
				setReport((Expression)null);
				return;
			case StatementPackage.ASSERTION_STATEMENT__SEVERITY:
				setSeverity((Expression)null);
				return;
			case StatementPackage.ASSERTION_STATEMENT__POSTPONED:
				setPostponed(POSTPONED_EDEFAULT);
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
			case StatementPackage.ASSERTION_STATEMENT__CONDITION:
				return condition != null;
			case StatementPackage.ASSERTION_STATEMENT__REPORT:
				return report != null;
			case StatementPackage.ASSERTION_STATEMENT__SEVERITY:
				return severity != null;
			case StatementPackage.ASSERTION_STATEMENT__POSTPONED:
				return postponed != POSTPONED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (postponed: ");
		result.append(postponed);
		result.append(')');
		return result.toString();
	}

} //AssertionStatementImpl
