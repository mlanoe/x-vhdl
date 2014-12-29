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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Adding Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getAddingOperator()
 * @model
 * @generated
 */
public enum AddingOperator implements Enumerator {
	/**
	 * The '<em><b>PLUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS(0, "PLUS", "+"),

	/**
	 * The '<em><b>MINUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS(1, "MINUS", "-"),

	/**
	 * The '<em><b>AMPERSAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMPERSAND_VALUE
	 * @generated
	 * @ordered
	 */
	AMPERSAND(2, "AMPERSAND", "&");

	/**
	 * The '<em><b>PLUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUS
	 * @model literal="+"
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_VALUE = 0;

	/**
	 * The '<em><b>MINUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUS
	 * @model literal="-"
	 * @generated
	 * @ordered
	 */
	public static final int MINUS_VALUE = 1;

	/**
	 * The '<em><b>AMPERSAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AMPERSAND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMPERSAND
	 * @model literal="&"
	 * @generated
	 * @ordered
	 */
	public static final int AMPERSAND_VALUE = 2;

	/**
	 * An array of all the '<em><b>Adding Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AddingOperator[] VALUES_ARRAY =
		new AddingOperator[] {
			PLUS,
			MINUS,
			AMPERSAND,
		};

	/**
	 * A public read-only list of all the '<em><b>Adding Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AddingOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Adding Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AddingOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddingOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adding Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AddingOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddingOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adding Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AddingOperator get(int value) {
		switch (value) {
			case PLUS_VALUE: return PLUS;
			case MINUS_VALUE: return MINUS;
			case AMPERSAND_VALUE: return AMPERSAND;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AddingOperator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AddingOperator
