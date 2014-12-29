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
package net.mlanoe.language.vhdl.expression;

import net.mlanoe.language.vhdl.nature.NatureReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnature Indication Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.expression.SubnatureIndicationExpression#getMark <em>Mark</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getSubnatureIndicationExpression()
 * @model
 * @generated
 */
public interface SubnatureIndicationExpression extends IndicationExpression, NatureReference {

	/**
	 * Returns the value of the '<em><b>Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' containment reference.
	 * @see #setMark(NatureReference)
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getSubnatureIndicationExpression_Mark()
	 * @model containment="true"
	 * @generated
	 */
	NatureReference getMark();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.expression.SubnatureIndicationExpression#getMark <em>Mark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark</em>' containment reference.
	 * @see #getMark()
	 * @generated
	 */
	void setMark(NatureReference value);
} // SubnatureIndicationExpression
