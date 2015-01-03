/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement.impl;

import java.util.Collection;

import net.mlanoe.language.vhdl.MultiName;

import net.mlanoe.language.vhdl.declaration.Declaration;

import net.mlanoe.language.vhdl.statement.ProcessStatement;
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
 * An implementation of the model object '<em><b>Process Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.ProcessStatementImpl#isPostponed <em>Postponed</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.ProcessStatementImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.ProcessStatementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.ProcessStatementImpl#getSensitivity <em>Sensitivity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessStatementImpl extends StatementImpl implements ProcessStatement {
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
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declaration;

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
	protected ProcessStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.PROCESS_STATEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.PROCESS_STATEMENT__POSTPONED, oldPostponed, postponed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclaration() {
		if (declaration == null) {
			declaration = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatementPackage.PROCESS_STATEMENT__DECLARATION);
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatement() {
		if (statement == null) {
			statement = new EObjectContainmentEList<Statement>(Statement.class, this, StatementPackage.PROCESS_STATEMENT__STATEMENT);
		}
		return statement;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.PROCESS_STATEMENT__SENSITIVITY, oldSensitivity, newSensitivity);
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
				msgs = ((InternalEObject)sensitivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.PROCESS_STATEMENT__SENSITIVITY, null, msgs);
			if (newSensitivity != null)
				msgs = ((InternalEObject)newSensitivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.PROCESS_STATEMENT__SENSITIVITY, null, msgs);
			msgs = basicSetSensitivity(newSensitivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.PROCESS_STATEMENT__SENSITIVITY, newSensitivity, newSensitivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.PROCESS_STATEMENT__DECLARATION:
				return ((InternalEList<?>)getDeclaration()).basicRemove(otherEnd, msgs);
			case StatementPackage.PROCESS_STATEMENT__STATEMENT:
				return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
			case StatementPackage.PROCESS_STATEMENT__SENSITIVITY:
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
			case StatementPackage.PROCESS_STATEMENT__POSTPONED:
				return isPostponed();
			case StatementPackage.PROCESS_STATEMENT__DECLARATION:
				return getDeclaration();
			case StatementPackage.PROCESS_STATEMENT__STATEMENT:
				return getStatement();
			case StatementPackage.PROCESS_STATEMENT__SENSITIVITY:
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
			case StatementPackage.PROCESS_STATEMENT__POSTPONED:
				setPostponed((Boolean)newValue);
				return;
			case StatementPackage.PROCESS_STATEMENT__DECLARATION:
				getDeclaration().clear();
				getDeclaration().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatementPackage.PROCESS_STATEMENT__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends Statement>)newValue);
				return;
			case StatementPackage.PROCESS_STATEMENT__SENSITIVITY:
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
			case StatementPackage.PROCESS_STATEMENT__POSTPONED:
				setPostponed(POSTPONED_EDEFAULT);
				return;
			case StatementPackage.PROCESS_STATEMENT__DECLARATION:
				getDeclaration().clear();
				return;
			case StatementPackage.PROCESS_STATEMENT__STATEMENT:
				getStatement().clear();
				return;
			case StatementPackage.PROCESS_STATEMENT__SENSITIVITY:
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
			case StatementPackage.PROCESS_STATEMENT__POSTPONED:
				return postponed != POSTPONED_EDEFAULT;
			case StatementPackage.PROCESS_STATEMENT__DECLARATION:
				return declaration != null && !declaration.isEmpty();
			case StatementPackage.PROCESS_STATEMENT__STATEMENT:
				return statement != null && !statement.isEmpty();
			case StatementPackage.PROCESS_STATEMENT__SENSITIVITY:
				return sensitivity != null;
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

} //ProcessStatementImpl
