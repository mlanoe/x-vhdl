/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
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
 * A representation of the literals of the enumeration '<em><b>Shift Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getShiftOperator()
 * @model
 * @generated
 */
public enum ShiftOperator implements Enumerator {
	/**
	 * The '<em><b>SLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLL_VALUE
	 * @generated
	 * @ordered
	 */
	SLL(0, "SLL", "sll"),

	/**
	 * The '<em><b>SRL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRL_VALUE
	 * @generated
	 * @ordered
	 */
	SRL(1, "SRL", "srl"),

	/**
	 * The '<em><b>SLA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLA_VALUE
	 * @generated
	 * @ordered
	 */
	SLA(2, "SLA", "sla"),

	/**
	 * The '<em><b>SRA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRA_VALUE
	 * @generated
	 * @ordered
	 */
	SRA(3, "SRA", "sra"),

	/**
	 * The '<em><b>ROL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROL_VALUE
	 * @generated
	 * @ordered
	 */
	ROL(4, "ROL", "rol"),

	/**
	 * The '<em><b>ROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROR_VALUE
	 * @generated
	 * @ordered
	 */
	ROR(5, "ROR", "ror");

	/**
	 * The '<em><b>SLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLL
	 * @model literal="sll"
	 * @generated
	 * @ordered
	 */
	public static final int SLL_VALUE = 0;

	/**
	 * The '<em><b>SRL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SRL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SRL
	 * @model literal="srl"
	 * @generated
	 * @ordered
	 */
	public static final int SRL_VALUE = 1;

	/**
	 * The '<em><b>SLA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SLA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLA
	 * @model literal="sla"
	 * @generated
	 * @ordered
	 */
	public static final int SLA_VALUE = 2;

	/**
	 * The '<em><b>SRA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SRA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SRA
	 * @model literal="sra"
	 * @generated
	 * @ordered
	 */
	public static final int SRA_VALUE = 3;

	/**
	 * The '<em><b>ROL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROL
	 * @model literal="rol"
	 * @generated
	 * @ordered
	 */
	public static final int ROL_VALUE = 4;

	/**
	 * The '<em><b>ROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROR
	 * @model literal="ror"
	 * @generated
	 * @ordered
	 */
	public static final int ROR_VALUE = 5;

	/**
	 * An array of all the '<em><b>Shift Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ShiftOperator[] VALUES_ARRAY =
		new ShiftOperator[] {
			SLL,
			SRL,
			SLA,
			SRA,
			ROL,
			ROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Shift Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ShiftOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Shift Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShiftOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShiftOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shift Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShiftOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShiftOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shift Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShiftOperator get(int value) {
		switch (value) {
			case SLL_VALUE: return SLL;
			case SRL_VALUE: return SRL;
			case SLA_VALUE: return SLA;
			case SRA_VALUE: return SRA;
			case ROL_VALUE: return ROL;
			case ROR_VALUE: return ROR;
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
	private ShiftOperator(int value, String name, String literal) {
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
	
} //ShiftOperator
