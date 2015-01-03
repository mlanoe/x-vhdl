/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement;

import net.mlanoe.language.vhdl.VhdlObject;

import net.mlanoe.language.vhdl.expression.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Waveform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ConditionalWaveform#getWaveform <em>Waveform</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ConditionalWaveform#getChoice <em>Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getConditionalWaveform()
 * @model
 * @generated
 */
public interface ConditionalWaveform extends VhdlObject {
	/**
	 * Returns the value of the '<em><b>Waveform</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.expression.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waveform</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waveform</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getConditionalWaveform_Waveform()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getWaveform();

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference.
	 * @see #setChoice(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getConditionalWaveform_Choice()
	 * @model containment="true"
	 * @generated
	 */
	Expression getChoice();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.ConditionalWaveform#getChoice <em>Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choice</em>' containment reference.
	 * @see #getChoice()
	 * @generated
	 */
	void setChoice(Expression value);

} // ConditionalWaveform
