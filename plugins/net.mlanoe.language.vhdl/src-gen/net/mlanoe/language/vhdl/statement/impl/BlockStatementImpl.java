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

import net.mlanoe.language.vhdl.GenericMaps;
import net.mlanoe.language.vhdl.Generics;
import net.mlanoe.language.vhdl.PortMaps;
import net.mlanoe.language.vhdl.Ports;

import net.mlanoe.language.vhdl.declaration.Declaration;

import net.mlanoe.language.vhdl.expression.Expression;

import net.mlanoe.language.vhdl.statement.BlockStatement;
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
 * An implementation of the model object '<em><b>Block Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.BlockStatementImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.BlockStatementImpl#getGeneric <em>Generic</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.BlockStatementImpl#getGenericMap <em>Generic Map</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.BlockStatementImpl#getPort <em>Port</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.BlockStatementImpl#getPortMap <em>Port Map</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.BlockStatementImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.BlockStatementImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockStatementImpl extends StatementImpl implements BlockStatement {
	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Expression guard;

	/**
	 * The cached value of the '{@link #getGeneric() <em>Generic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneric()
	 * @generated
	 * @ordered
	 */
	protected Generics generic;

	/**
	 * The cached value of the '{@link #getGenericMap() <em>Generic Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericMap()
	 * @generated
	 * @ordered
	 */
	protected GenericMaps genericMap;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Ports port;

	/**
	 * The cached value of the '{@link #getPortMap() <em>Port Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortMap()
	 * @generated
	 * @ordered
	 */
	protected PortMaps portMap;

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
	protected BlockStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.BLOCK_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(Expression newGuard, NotificationChain msgs) {
		Expression oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.BLOCK_STATEMENT__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Expression newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BLOCK_STATEMENT__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BLOCK_STATEMENT__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.BLOCK_STATEMENT__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generics getGeneric() {
		return generic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneric(Generics newGeneric, NotificationChain msgs) {
		Generics oldGeneric = generic;
		generic = newGeneric;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.BLOCK_STATEMENT__GENERIC, oldGeneric, newGeneric);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneric(Generics newGeneric) {
		if (newGeneric != generic) {
			NotificationChain msgs = null;
			if (generic != null)
				msgs = ((InternalEObject)generic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BLOCK_STATEMENT__GENERIC, null, msgs);
			if (newGeneric != null)
				msgs = ((InternalEObject)newGeneric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BLOCK_STATEMENT__GENERIC, null, msgs);
			msgs = basicSetGeneric(newGeneric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.BLOCK_STATEMENT__GENERIC, newGeneric, newGeneric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericMaps getGenericMap() {
		return genericMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericMap(GenericMaps newGenericMap, NotificationChain msgs) {
		GenericMaps oldGenericMap = genericMap;
		genericMap = newGenericMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.BLOCK_STATEMENT__GENERIC_MAP, oldGenericMap, newGenericMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericMap(GenericMaps newGenericMap) {
		if (newGenericMap != genericMap) {
			NotificationChain msgs = null;
			if (genericMap != null)
				msgs = ((InternalEObject)genericMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BLOCK_STATEMENT__GENERIC_MAP, null, msgs);
			if (newGenericMap != null)
				msgs = ((InternalEObject)newGenericMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BLOCK_STATEMENT__GENERIC_MAP, null, msgs);
			msgs = basicSetGenericMap(newGenericMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.BLOCK_STATEMENT__GENERIC_MAP, newGenericMap, newGenericMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ports getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(Ports newPort, NotificationChain msgs) {
		Ports oldPort = port;
		port = newPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.BLOCK_STATEMENT__PORT, oldPort, newPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Ports newPort) {
		if (newPort != port) {
			NotificationChain msgs = null;
			if (port != null)
				msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BLOCK_STATEMENT__PORT, null, msgs);
			if (newPort != null)
				msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BLOCK_STATEMENT__PORT, null, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.BLOCK_STATEMENT__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMaps getPortMap() {
		return portMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortMap(PortMaps newPortMap, NotificationChain msgs) {
		PortMaps oldPortMap = portMap;
		portMap = newPortMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.BLOCK_STATEMENT__PORT_MAP, oldPortMap, newPortMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortMap(PortMaps newPortMap) {
		if (newPortMap != portMap) {
			NotificationChain msgs = null;
			if (portMap != null)
				msgs = ((InternalEObject)portMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BLOCK_STATEMENT__PORT_MAP, null, msgs);
			if (newPortMap != null)
				msgs = ((InternalEObject)newPortMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.BLOCK_STATEMENT__PORT_MAP, null, msgs);
			msgs = basicSetPortMap(newPortMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.BLOCK_STATEMENT__PORT_MAP, newPortMap, newPortMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclaration() {
		if (declaration == null) {
			declaration = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatementPackage.BLOCK_STATEMENT__DECLARATION);
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
			statement = new EObjectContainmentEList<Statement>(Statement.class, this, StatementPackage.BLOCK_STATEMENT__STATEMENT);
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
			case StatementPackage.BLOCK_STATEMENT__GUARD:
				return basicSetGuard(null, msgs);
			case StatementPackage.BLOCK_STATEMENT__GENERIC:
				return basicSetGeneric(null, msgs);
			case StatementPackage.BLOCK_STATEMENT__GENERIC_MAP:
				return basicSetGenericMap(null, msgs);
			case StatementPackage.BLOCK_STATEMENT__PORT:
				return basicSetPort(null, msgs);
			case StatementPackage.BLOCK_STATEMENT__PORT_MAP:
				return basicSetPortMap(null, msgs);
			case StatementPackage.BLOCK_STATEMENT__DECLARATION:
				return ((InternalEList<?>)getDeclaration()).basicRemove(otherEnd, msgs);
			case StatementPackage.BLOCK_STATEMENT__STATEMENT:
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
			case StatementPackage.BLOCK_STATEMENT__GUARD:
				return getGuard();
			case StatementPackage.BLOCK_STATEMENT__GENERIC:
				return getGeneric();
			case StatementPackage.BLOCK_STATEMENT__GENERIC_MAP:
				return getGenericMap();
			case StatementPackage.BLOCK_STATEMENT__PORT:
				return getPort();
			case StatementPackage.BLOCK_STATEMENT__PORT_MAP:
				return getPortMap();
			case StatementPackage.BLOCK_STATEMENT__DECLARATION:
				return getDeclaration();
			case StatementPackage.BLOCK_STATEMENT__STATEMENT:
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
			case StatementPackage.BLOCK_STATEMENT__GUARD:
				setGuard((Expression)newValue);
				return;
			case StatementPackage.BLOCK_STATEMENT__GENERIC:
				setGeneric((Generics)newValue);
				return;
			case StatementPackage.BLOCK_STATEMENT__GENERIC_MAP:
				setGenericMap((GenericMaps)newValue);
				return;
			case StatementPackage.BLOCK_STATEMENT__PORT:
				setPort((Ports)newValue);
				return;
			case StatementPackage.BLOCK_STATEMENT__PORT_MAP:
				setPortMap((PortMaps)newValue);
				return;
			case StatementPackage.BLOCK_STATEMENT__DECLARATION:
				getDeclaration().clear();
				getDeclaration().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatementPackage.BLOCK_STATEMENT__STATEMENT:
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
			case StatementPackage.BLOCK_STATEMENT__GUARD:
				setGuard((Expression)null);
				return;
			case StatementPackage.BLOCK_STATEMENT__GENERIC:
				setGeneric((Generics)null);
				return;
			case StatementPackage.BLOCK_STATEMENT__GENERIC_MAP:
				setGenericMap((GenericMaps)null);
				return;
			case StatementPackage.BLOCK_STATEMENT__PORT:
				setPort((Ports)null);
				return;
			case StatementPackage.BLOCK_STATEMENT__PORT_MAP:
				setPortMap((PortMaps)null);
				return;
			case StatementPackage.BLOCK_STATEMENT__DECLARATION:
				getDeclaration().clear();
				return;
			case StatementPackage.BLOCK_STATEMENT__STATEMENT:
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
			case StatementPackage.BLOCK_STATEMENT__GUARD:
				return guard != null;
			case StatementPackage.BLOCK_STATEMENT__GENERIC:
				return generic != null;
			case StatementPackage.BLOCK_STATEMENT__GENERIC_MAP:
				return genericMap != null;
			case StatementPackage.BLOCK_STATEMENT__PORT:
				return port != null;
			case StatementPackage.BLOCK_STATEMENT__PORT_MAP:
				return portMap != null;
			case StatementPackage.BLOCK_STATEMENT__DECLARATION:
				return declaration != null && !declaration.isEmpty();
			case StatementPackage.BLOCK_STATEMENT__STATEMENT:
				return statement != null && !statement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockStatementImpl
