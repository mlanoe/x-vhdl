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

import net.mlanoe.language.vhdl.Name;

import net.mlanoe.language.vhdl.expression.Expression;

import net.mlanoe.language.vhdl.impl.VhdlObjectImpl;

import net.mlanoe.language.vhdl.statement.BreakStatementItem;
import net.mlanoe.language.vhdl.statement.StatementPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Break Statement Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.BreakStatementItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.BreakStatementItemImpl#getUse <em>Use</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.BreakStatementItemImpl#getArrow <em>Arrow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreakStatementItemImpl extends VhdlObjectImpl implements BreakStatementItem {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Name name;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Name use;

	/**
	 * The cached value of the '{@link #getArrow() <em>Arrow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrow()
	 * @generated
	 * @ordered
	 */
	protected Expression arrow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakStatementItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.BREAK_STATEMENT_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Name newName, NotificationChain msgs) {
		Name oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.BREAK_STATEMENT_ITEM__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BREAK_STATEMENT_ITEM__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BREAK_STATEMENT_ITEM__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.BREAK_STATEMENT_ITEM__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(Name newUse, NotificationChain msgs) {
		Name oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.BREAK_STATEMENT_ITEM__USE, oldUse, newUse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Name newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BREAK_STATEMENT_ITEM__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BREAK_STATEMENT_ITEM__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.BREAK_STATEMENT_ITEM__USE, newUse, newUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getArrow() {
		return arrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrow(Expression newArrow, NotificationChain msgs) {
		Expression oldArrow = arrow;
		arrow = newArrow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.BREAK_STATEMENT_ITEM__ARROW, oldArrow, newArrow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrow(Expression newArrow) {
		if (newArrow != arrow) {
			NotificationChain msgs = null;
			if (arrow != null)
				msgs = ((InternalEObject)arrow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BREAK_STATEMENT_ITEM__ARROW, null, msgs);
			if (newArrow != null)
				msgs = ((InternalEObject)newArrow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BREAK_STATEMENT_ITEM__ARROW, null, msgs);
			msgs = basicSetArrow(newArrow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.BREAK_STATEMENT_ITEM__ARROW, newArrow, newArrow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.BREAK_STATEMENT_ITEM__NAME:
				return basicSetName(null, msgs);
			case StatementPackage.BREAK_STATEMENT_ITEM__USE:
				return basicSetUse(null, msgs);
			case StatementPackage.BREAK_STATEMENT_ITEM__ARROW:
				return basicSetArrow(null, msgs);
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
			case StatementPackage.BREAK_STATEMENT_ITEM__NAME:
				return getName();
			case StatementPackage.BREAK_STATEMENT_ITEM__USE:
				return getUse();
			case StatementPackage.BREAK_STATEMENT_ITEM__ARROW:
				return getArrow();
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
			case StatementPackage.BREAK_STATEMENT_ITEM__NAME:
				setName((Name)newValue);
				return;
			case StatementPackage.BREAK_STATEMENT_ITEM__USE:
				setUse((Name)newValue);
				return;
			case StatementPackage.BREAK_STATEMENT_ITEM__ARROW:
				setArrow((Expression)newValue);
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
			case StatementPackage.BREAK_STATEMENT_ITEM__NAME:
				setName((Name)null);
				return;
			case StatementPackage.BREAK_STATEMENT_ITEM__USE:
				setUse((Name)null);
				return;
			case StatementPackage.BREAK_STATEMENT_ITEM__ARROW:
				setArrow((Expression)null);
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
			case StatementPackage.BREAK_STATEMENT_ITEM__NAME:
				return name != null;
			case StatementPackage.BREAK_STATEMENT_ITEM__USE:
				return use != null;
			case StatementPackage.BREAK_STATEMENT_ITEM__ARROW:
				return arrow != null;
		}
		return super.eIsSet(featureID);
	}

} //BreakStatementItemImpl
