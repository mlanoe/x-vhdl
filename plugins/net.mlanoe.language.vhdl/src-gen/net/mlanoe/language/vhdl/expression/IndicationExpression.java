/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indication Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.expression.IndicationExpression#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.expression.IndicationExpression#getTolerance <em>Tolerance</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.expression.IndicationExpression#getAcross <em>Across</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getIndicationExpression()
 * @model abstract="true"
 * @generated
 */
public interface IndicationExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(Expression)
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getIndicationExpression_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	Expression getConstraint();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.expression.IndicationExpression#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Expression value);

	/**
	 * Returns the value of the '<em><b>Tolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tolerance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerance</em>' containment reference.
	 * @see #setTolerance(Expression)
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getIndicationExpression_Tolerance()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTolerance();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.expression.IndicationExpression#getTolerance <em>Tolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance</em>' containment reference.
	 * @see #getTolerance()
	 * @generated
	 */
	void setTolerance(Expression value);

	/**
	 * Returns the value of the '<em><b>Across</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Across</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Across</em>' containment reference.
	 * @see #setAcross(Expression)
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getIndicationExpression_Across()
	 * @model containment="true"
	 * @generated
	 */
	Expression getAcross();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.expression.IndicationExpression#getAcross <em>Across</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Across</em>' containment reference.
	 * @see #getAcross()
	 * @generated
	 */
	void setAcross(Expression value);

} // IndicationExpression
