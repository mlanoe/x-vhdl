/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement.impl;

import net.mlanoe.language.vhdl.expression.Expression;

import net.mlanoe.language.vhdl.statement.DelayMechanism;
import net.mlanoe.language.vhdl.statement.SignalAssignmentStatement;
import net.mlanoe.language.vhdl.statement.StatementPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.SignalAssignmentStatementImpl#isPostponed <em>Postponed</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.SignalAssignmentStatementImpl#isGuarded <em>Guarded</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.SignalAssignmentStatementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.SignalAssignmentStatementImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SignalAssignmentStatementImpl extends StatementImpl implements SignalAssignmentStatement {
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
	 * The default value of the '{@link #isGuarded() <em>Guarded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGuarded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GUARDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGuarded() <em>Guarded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGuarded()
	 * @generated
	 * @ordered
	 */
	protected boolean guarded = GUARDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Expression target;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected DelayMechanism delay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalAssignmentStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.SIGNAL_ASSIGNMENT_STATEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED, oldPostponed, postponed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGuarded() {
		return guarded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuarded(boolean newGuarded) {
		boolean oldGuarded = guarded;
		guarded = newGuarded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__GUARDED, oldGuarded, guarded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Expression newTarget, NotificationChain msgs) {
		Expression oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Expression newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayMechanism getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelay(DelayMechanism newDelay, NotificationChain msgs) {
		DelayMechanism oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__DELAY, oldDelay, newDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(DelayMechanism newDelay) {
		if (newDelay != delay) {
			NotificationChain msgs = null;
			if (delay != null)
				msgs = ((InternalEObject)delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__DELAY, null, msgs);
			if (newDelay != null)
				msgs = ((InternalEObject)newDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__DELAY, null, msgs);
			msgs = basicSetDelay(newDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__DELAY, newDelay, newDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__TARGET:
				return basicSetTarget(null, msgs);
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__DELAY:
				return basicSetDelay(null, msgs);
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
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED:
				return isPostponed();
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__GUARDED:
				return isGuarded();
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__TARGET:
				return getTarget();
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__DELAY:
				return getDelay();
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
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED:
				setPostponed((Boolean)newValue);
				return;
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__GUARDED:
				setGuarded((Boolean)newValue);
				return;
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__TARGET:
				setTarget((Expression)newValue);
				return;
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__DELAY:
				setDelay((DelayMechanism)newValue);
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
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED:
				setPostponed(POSTPONED_EDEFAULT);
				return;
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__GUARDED:
				setGuarded(GUARDED_EDEFAULT);
				return;
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__TARGET:
				setTarget((Expression)null);
				return;
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__DELAY:
				setDelay((DelayMechanism)null);
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
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__POSTPONED:
				return postponed != POSTPONED_EDEFAULT;
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__GUARDED:
				return guarded != GUARDED_EDEFAULT;
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__TARGET:
				return target != null;
			case StatementPackage.SIGNAL_ASSIGNMENT_STATEMENT__DELAY:
				return delay != null;
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
		result.append(", guarded: ");
		result.append(guarded);
		result.append(')');
		return result.toString();
	}

} //SignalAssignmentStatementImpl
