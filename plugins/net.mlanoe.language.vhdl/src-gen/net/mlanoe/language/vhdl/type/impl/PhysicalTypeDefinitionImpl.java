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
package net.mlanoe.language.vhdl.type.impl;

import java.util.Collection;
import net.mlanoe.language.vhdl.expression.Expression;
import net.mlanoe.language.vhdl.type.PhysicalTypeDefinition;
import net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary;
import net.mlanoe.language.vhdl.type.TypePackage;
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
 * An implementation of the model object '<em><b>Physical Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionImpl#getRange <em>Range</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionImpl#getSecondary <em>Secondary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalTypeDefinitionImpl extends TypeDefinitionImpl implements PhysicalTypeDefinition {
	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Expression range;

	/**
	 * The default value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary()
	 * @generated
	 * @ordered
	 */
	protected String primary = PRIMARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecondary() <em>Secondary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondary()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalTypeDefinitionSecondary> secondary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.PHYSICAL_TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Expression newRange, NotificationChain msgs) {
		Expression oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.PHYSICAL_TYPE_DEFINITION__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Expression newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.PHYSICAL_TYPE_DEFINITION__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.PHYSICAL_TYPE_DEFINITION__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.PHYSICAL_TYPE_DEFINITION__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimary() {
		return primary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary(String newPrimary) {
		String oldPrimary = primary;
		primary = newPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.PHYSICAL_TYPE_DEFINITION__PRIMARY, oldPrimary, primary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalTypeDefinitionSecondary> getSecondary() {
		if (secondary == null) {
			secondary = new EObjectContainmentEList<PhysicalTypeDefinitionSecondary>(PhysicalTypeDefinitionSecondary.class, this, TypePackage.PHYSICAL_TYPE_DEFINITION__SECONDARY);
		}
		return secondary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypePackage.PHYSICAL_TYPE_DEFINITION__RANGE:
				return basicSetRange(null, msgs);
			case TypePackage.PHYSICAL_TYPE_DEFINITION__SECONDARY:
				return ((InternalEList<?>)getSecondary()).basicRemove(otherEnd, msgs);
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
			case TypePackage.PHYSICAL_TYPE_DEFINITION__RANGE:
				return getRange();
			case TypePackage.PHYSICAL_TYPE_DEFINITION__PRIMARY:
				return getPrimary();
			case TypePackage.PHYSICAL_TYPE_DEFINITION__SECONDARY:
				return getSecondary();
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
			case TypePackage.PHYSICAL_TYPE_DEFINITION__RANGE:
				setRange((Expression)newValue);
				return;
			case TypePackage.PHYSICAL_TYPE_DEFINITION__PRIMARY:
				setPrimary((String)newValue);
				return;
			case TypePackage.PHYSICAL_TYPE_DEFINITION__SECONDARY:
				getSecondary().clear();
				getSecondary().addAll((Collection<? extends PhysicalTypeDefinitionSecondary>)newValue);
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
			case TypePackage.PHYSICAL_TYPE_DEFINITION__RANGE:
				setRange((Expression)null);
				return;
			case TypePackage.PHYSICAL_TYPE_DEFINITION__PRIMARY:
				setPrimary(PRIMARY_EDEFAULT);
				return;
			case TypePackage.PHYSICAL_TYPE_DEFINITION__SECONDARY:
				getSecondary().clear();
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
			case TypePackage.PHYSICAL_TYPE_DEFINITION__RANGE:
				return range != null;
			case TypePackage.PHYSICAL_TYPE_DEFINITION__PRIMARY:
				return PRIMARY_EDEFAULT == null ? primary != null : !PRIMARY_EDEFAULT.equals(primary);
			case TypePackage.PHYSICAL_TYPE_DEFINITION__SECONDARY:
				return secondary != null && !secondary.isEmpty();
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
		result.append(" (primary: ");
		result.append(primary);
		result.append(')');
		return result.toString();
	}

} //PhysicalTypeDefinitionImpl
