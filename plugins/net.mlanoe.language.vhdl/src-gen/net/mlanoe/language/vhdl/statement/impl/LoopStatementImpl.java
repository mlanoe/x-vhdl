/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement.impl;

import java.util.Collection;

import net.mlanoe.language.vhdl.statement.IterationScheme;
import net.mlanoe.language.vhdl.statement.LoopStatement;
import net.mlanoe.language.vhdl.statement.Statement;
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
 * An implementation of the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.LoopStatementImpl#getIteration <em>Iteration</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.LoopStatementImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopStatementImpl extends StatementImpl implements LoopStatement {
	/**
	 * The cached value of the '{@link #getIteration() <em>Iteration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteration()
	 * @generated
	 * @ordered
	 */
	protected IterationScheme iteration;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.LOOP_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterationScheme getIteration() {
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIteration(IterationScheme newIteration, NotificationChain msgs) {
		IterationScheme oldIteration = iteration;
		iteration = newIteration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.LOOP_STATEMENT__ITERATION, oldIteration, newIteration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteration(IterationScheme newIteration) {
		if (newIteration != iteration) {
			NotificationChain msgs = null;
			if (iteration != null)
				msgs = ((InternalEObject)iteration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.LOOP_STATEMENT__ITERATION, null, msgs);
			if (newIteration != null)
				msgs = ((InternalEObject)newIteration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.LOOP_STATEMENT__ITERATION, null, msgs);
			msgs = basicSetIteration(newIteration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.LOOP_STATEMENT__ITERATION, newIteration, newIteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatement() {
		if (statement == null) {
			statement = new EObjectContainmentEList<Statement>(Statement.class, this, StatementPackage.LOOP_STATEMENT__STATEMENT);
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.LOOP_STATEMENT__ITERATION:
				return basicSetIteration(null, msgs);
			case StatementPackage.LOOP_STATEMENT__STATEMENT:
				return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
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
			case StatementPackage.LOOP_STATEMENT__ITERATION:
				return getIteration();
			case StatementPackage.LOOP_STATEMENT__STATEMENT:
				return getStatement();
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
			case StatementPackage.LOOP_STATEMENT__ITERATION:
				setIteration((IterationScheme)newValue);
				return;
			case StatementPackage.LOOP_STATEMENT__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends Statement>)newValue);
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
			case StatementPackage.LOOP_STATEMENT__ITERATION:
				setIteration((IterationScheme)null);
				return;
			case StatementPackage.LOOP_STATEMENT__STATEMENT:
				getStatement().clear();
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
			case StatementPackage.LOOP_STATEMENT__ITERATION:
				return iteration != null;
			case StatementPackage.LOOP_STATEMENT__STATEMENT:
				return statement != null && !statement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoopStatementImpl
