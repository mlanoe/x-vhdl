/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Signal Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ConditionalSignalAssignmentStatement#getWaveform <em>Waveform</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getConditionalSignalAssignmentStatement()
 * @model
 * @generated
 */
public interface ConditionalSignalAssignmentStatement extends SignalAssignmentStatement {
	/**
	 * Returns the value of the '<em><b>Waveform</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.statement.ConditionalWaveform}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waveform</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waveform</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getConditionalSignalAssignmentStatement_Waveform()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalWaveform> getWaveform();

} // ConditionalSignalAssignmentStatement
