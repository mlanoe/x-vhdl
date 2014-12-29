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

import java.util.Collection;

import net.mlanoe.language.vhdl.MultiName;

import net.mlanoe.language.vhdl.expression.Expression;

import net.mlanoe.language.vhdl.statement.BreakStatement;
import net.mlanoe.language.vhdl.statement.BreakStatementItem;
import net.mlanoe.language.vhdl.statement.StatementPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Break Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.BreakStatementImpl#getBreak <em>Break</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.BreakStatementImpl#getWhen <em>When</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.BreakStatementImpl#getSensitivity <em>Sensitivity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreakStatementImpl extends StatementImpl implements BreakStatement {
	/**
	 * The cached value of the '{@link #getBreak() <em>Break</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreak()
	 * @generated
	 * @ordered
	 */
	protected EList<BreakStatementItem> break_;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected Expression when;

	/**
	 * The cached value of the '{@link #getSensitivity() <em>Sensitivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitivity()
	 * @generated
	 * @ordered
	 */
	protected MultiName sensitivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.BREAK_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BreakStatementItem> getBreak() {
		if (break_ == null) {
			break_ = new EObjectContainmentEList<BreakStatementItem>(BreakStatementItem.class, this, StatementPackage.BREAK_STATEMENT__BREAK);
		}
		return break_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(Expression newWhen, NotificationChain msgs) {
		Expression oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.BREAK_STATEMENT__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(Expression newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BREAK_STATEMENT__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BREAK_STATEMENT__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.BREAK_STATEMENT__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiName getSensitivity() {
		return sensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensitivity(MultiName newSensitivity, NotificationChain msgs) {
		MultiName oldSensitivity = sensitivity;
		sensitivity = newSensitivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.BREAK_STATEMENT__SENSITIVITY, oldSensitivity, newSensitivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensitivity(MultiName newSensitivity) {
		if (newSensitivity != sensitivity) {
			NotificationChain msgs = null;
			if (sensitivity != null)
				msgs = ((InternalEObject)sensitivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BREAK_STATEMENT__SENSITIVITY, null, msgs);
			if (newSensitivity != null)
				msgs = ((InternalEObject)newSensitivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BREAK_STATEMENT__SENSITIVITY, null, msgs);
			msgs = basicSetSensitivity(newSensitivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.BREAK_STATEMENT__SENSITIVITY, newSensitivity, newSensitivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.BREAK_STATEMENT__BREAK:
				return ((InternalEList<?>)getBreak()).basicRemove(otherEnd, msgs);
			case StatementPackage.BREAK_STATEMENT__WHEN:
				return basicSetWhen(null, msgs);
			case StatementPackage.BREAK_STATEMENT__SENSITIVITY:
				return basicSetSensitivity(null, msgs);
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
			case StatementPackage.BREAK_STATEMENT__BREAK:
				return getBreak();
			case StatementPackage.BREAK_STATEMENT__WHEN:
				return getWhen();
			case StatementPackage.BREAK_STATEMENT__SENSITIVITY:
				return getSensitivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatementPackage.BREAK_STATEMENT__BREAK:
				getBreak().clear();
				getBreak().addAll((Collection<? extends BreakStatementItem>)newValue);
				return;
			case StatementPackage.BREAK_STATEMENT__WHEN:
				setWhen((Expression)newValue);
				return;
			case StatementPackage.BREAK_STATEMENT__SENSITIVITY:
				setSensitivity((MultiName)newValue);
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
			case StatementPackage.BREAK_STATEMENT__BREAK:
				getBreak().clear();
				return;
			case StatementPackage.BREAK_STATEMENT__WHEN:
				setWhen((Expression)null);
				return;
			case StatementPackage.BREAK_STATEMENT__SENSITIVITY:
				setSensitivity((MultiName)null);
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
			case StatementPackage.BREAK_STATEMENT__BREAK:
				return break_ != null && !break_.isEmpty();
			case StatementPackage.BREAK_STATEMENT__WHEN:
				return when != null;
			case StatementPackage.BREAK_STATEMENT__SENSITIVITY:
				return sensitivity != null;
		}
		return super.eIsSet(featureID);
	}

} //BreakStatementImpl
