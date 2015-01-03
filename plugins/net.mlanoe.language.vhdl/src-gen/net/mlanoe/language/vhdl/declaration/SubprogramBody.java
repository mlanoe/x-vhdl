/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration;

import net.mlanoe.language.vhdl.VhdlObject;

import net.mlanoe.language.vhdl.statement.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.SubprogramBody#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.SubprogramBody#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getSubprogramBody()
 * @model
 * @generated
 */
public interface SubprogramBody extends VhdlObject {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.declaration.Declaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getSubprogramBody_Declaration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaration> getDeclaration();

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.statement.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getSubprogramBody_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

} // SubprogramBody
