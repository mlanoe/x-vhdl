/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression.impl;

import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.Named;
import net.mlanoe.language.vhdl.VhdlPackage;

import net.mlanoe.language.vhdl.expression.ExpressionPackage;
import net.mlanoe.language.vhdl.expression.SubtypeIndicationExpression;

import net.mlanoe.language.vhdl.type.TypeReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtype Indication Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.expression.impl.SubtypeIndicationExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.expression.impl.SubtypeIndicationExpressionImpl#getMark <em>Mark</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubtypeIndicationExpressionImpl extends IndicationExpressionImpl implements SubtypeIndicationExpression {
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
	 * The cached value of the '{@link #getMark() <em>Mark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMark()
	 * @generated
	 * @ordered
	 */
	protected TypeReference mark;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtypeIndicationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.SUBTYPE_INDICATION_EXPRESSION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getMark() {
		return mark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMark(TypeReference newMark, NotificationChain msgs) {
		TypeReference oldMark = mark;
		mark = newMark;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__MARK, oldMark, newMark);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMark(TypeReference newMark) {
		if (newMark != mark) {
			NotificationChain msgs = null;
			if (mark != null)
				msgs = ((InternalEObject)mark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__MARK, null, msgs);
			if (newMark != null)
				msgs = ((InternalEObject)newMark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__MARK, null, msgs);
			msgs = basicSetMark(newMark, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__MARK, newMark, newMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__NAME:
				return basicSetName(null, msgs);
			case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__MARK:
				return basicSetMark(null, msgs);
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
			case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__NAME:
				return getName();
			case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__MARK:
				return getMark();
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
			case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__NAME:
				setName((Name)newValue);
				return;
			case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__MARK:
				setMark((TypeReference)newValue);
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
			case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__NAME:
				setName((Name)null);
				return;
			case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__MARK:
				setMark((TypeReference)null);
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
			case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__NAME:
				return name != null;
			case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__MARK:
				return mark != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypeReference.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Named.class) {
			switch (derivedFeatureID) {
				case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__NAME: return VhdlPackage.NAMED__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypeReference.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Named.class) {
			switch (baseFeatureID) {
				case VhdlPackage.NAMED__NAME: return ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SubtypeIndicationExpressionImpl
