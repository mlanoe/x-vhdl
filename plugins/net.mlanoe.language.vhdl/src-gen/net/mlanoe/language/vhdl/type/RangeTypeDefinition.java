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
package net.mlanoe.language.vhdl.type;

import net.mlanoe.language.vhdl.expression.Expression;
import net.mlanoe.language.vhdl.expression.RangeDirection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.type.RangeTypeDefinition#getLeft <em>Left</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.type.RangeTypeDefinition#getDirection <em>Direction</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.type.RangeTypeDefinition#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.type.TypePackage#getRangeTypeDefinition()
 * @model
 * @generated
 */
public interface RangeTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see net.mlanoe.language.vhdl.type.TypePackage#getRangeTypeDefinition_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.type.RangeTypeDefinition#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link net.mlanoe.language.vhdl.expression.RangeDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see net.mlanoe.language.vhdl.expression.RangeDirection
	 * @see #setDirection(RangeDirection)
	 * @see net.mlanoe.language.vhdl.type.TypePackage#getRangeTypeDefinition_Direction()
	 * @model
	 * @generated
	 */
	RangeDirection getDirection();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.type.RangeTypeDefinition#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see net.mlanoe.language.vhdl.expression.RangeDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(RangeDirection value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see net.mlanoe.language.vhdl.type.TypePackage#getRangeTypeDefinition_Right()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.type.RangeTypeDefinition#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // RangeTypeDefinition
