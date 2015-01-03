/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement.impl;

import java.util.Collection;

import net.mlanoe.language.vhdl.declaration.Declaration;

import net.mlanoe.language.vhdl.statement.GenerateStatement;
import net.mlanoe.language.vhdl.statement.GenerationScheme;
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
 * An implementation of the model object '<em><b>Generate Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.GenerateStatementImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.GenerateStatementImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.GenerateStatementImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenerateStatementImpl extends StatementImpl implements GenerateStatement {
	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected GenerationScheme scheme;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerateStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.GENERATE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationScheme getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheme(GenerationScheme newScheme, NotificationChain msgs) {
		GenerationScheme oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.GENERATE_STATEMENT__SCHEME, oldScheme, newScheme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheme(GenerationScheme newScheme) {
		if (newScheme != scheme) {
			NotificationChain msgs = null;
			if (scheme != null)
				msgs = ((InternalEObject)scheme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.GENERATE_STATEMENT__SCHEME, null, msgs);
			if (newScheme != null)
				msgs = ((InternalEObject)newScheme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.GENERATE_STATEMENT__SCHEME, null, msgs);
			msgs = basicSetScheme(newScheme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.GENERATE_STATEMENT__SCHEME, newScheme, newScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclaration() {
		if (declaration == null) {
			declaration = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatementPackage.GENERATE_STATEMENT__DECLARATION);
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
			statement = new EObjectContainmentEList<Statement>(Statement.class, this, StatementPackage.GENERATE_STATEMENT__STATEMENT);
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
			case StatementPackage.GENERATE_STATEMENT__SCHEME:
				return basicSetScheme(null, msgs);
			case StatementPackage.GENERATE_STATEMENT__DECLARATION:
				return ((InternalEList<?>)getDeclaration()).basicRemove(otherEnd, msgs);
			case StatementPackage.GENERATE_STATEMENT__STATEMENT:
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
			case StatementPackage.GENERATE_STATEMENT__SCHEME:
				return getScheme();
			case StatementPackage.GENERATE_STATEMENT__DECLARATION:
				return getDeclaration();
			case StatementPackage.GENERATE_STATEMENT__STATEMENT:
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
			case StatementPackage.GENERATE_STATEMENT__SCHEME:
				setScheme((GenerationScheme)newValue);
				return;
			case StatementPackage.GENERATE_STATEMENT__DECLARATION:
				getDeclaration().clear();
				getDeclaration().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatementPackage.GENERATE_STATEMENT__STATEMENT:
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
			case StatementPackage.GENERATE_STATEMENT__SCHEME:
				setScheme((GenerationScheme)null);
				return;
			case StatementPackage.GENERATE_STATEMENT__DECLARATION:
				getDeclaration().clear();
				return;
			case StatementPackage.GENERATE_STATEMENT__STATEMENT:
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
			case StatementPackage.GENERATE_STATEMENT__SCHEME:
				return scheme != null;
			case StatementPackage.GENERATE_STATEMENT__DECLARATION:
				return declaration != null && !declaration.isEmpty();
			case StatementPackage.GENERATE_STATEMENT__STATEMENT:
				return statement != null && !statement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenerateStatementImpl
