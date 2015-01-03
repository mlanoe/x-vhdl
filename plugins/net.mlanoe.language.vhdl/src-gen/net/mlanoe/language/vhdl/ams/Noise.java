/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.ams;

import net.mlanoe.language.vhdl.expression.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Noise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.ams.Noise#getNoise <em>Noise</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.ams.AmsPackage#getNoise()
 * @model
 * @generated
 */
public interface Noise extends SourceAspect {
	/**
	 * Returns the value of the '<em><b>Noise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noise</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noise</em>' containment reference.
	 * @see #setNoise(Expression)
	 * @see net.mlanoe.language.vhdl.ams.AmsPackage#getNoise_Noise()
	 * @model containment="true"
	 * @generated
	 */
	Expression getNoise();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.ams.Noise#getNoise <em>Noise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noise</em>' containment reference.
	 * @see #getNoise()
	 * @generated
	 */
	void setNoise(Expression value);

} // Noise
