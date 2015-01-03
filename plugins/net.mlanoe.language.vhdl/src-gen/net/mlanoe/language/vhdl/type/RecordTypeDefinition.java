/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.type.RecordTypeDefinition#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.type.TypePackage#getRecordTypeDefinition()
 * @model
 * @generated
 */
public interface RecordTypeDefinition extends CompositeTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.type.RecordTypeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.type.TypePackage#getRecordTypeDefinition_Declaration()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecordTypeElement> getDeclaration();

} // RecordTypeDefinition
