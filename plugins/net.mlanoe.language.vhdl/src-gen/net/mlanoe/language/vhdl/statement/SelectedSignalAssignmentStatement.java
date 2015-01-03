/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement;

import net.mlanoe.language.vhdl.expression.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selected Signal Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.SelectedSignalAssignmentStatement#getSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getSelectedSignalAssignmentStatement()
 * @model
 * @generated
 */
public interface SelectedSignalAssignmentStatement extends ConditionalSignalAssignmentStatement {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' containment reference.
	 * @see #setSelected(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getSelectedSignalAssignmentStatement_Selected()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSelected();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.SelectedSignalAssignmentStatement#getSelected <em>Selected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' containment reference.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(Expression value);

} // SelectedSignalAssignmentStatement
