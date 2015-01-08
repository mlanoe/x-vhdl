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
 * A representation of the model object '<em><b>Sequential Signal Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement#getWaveform <em>Waveform</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getSequentialSignalAssignmentStatement()
 * @model
 * @generated
 */
public interface SequentialSignalAssignmentStatement extends SignalAssignmentStatement {
	/**
	 * Returns the value of the '<em><b>Waveform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waveform</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waveform</em>' containment reference.
	 * @see #setWaveform(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getSequentialSignalAssignmentStatement_Waveform()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWaveform();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement#getWaveform <em>Waveform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waveform</em>' containment reference.
	 * @see #getWaveform()
	 * @generated
	 */
	void setWaveform(Expression value);

} // SequentialSignalAssignmentStatement
