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
package net.mlanoe.language.vhdl.declaration;

import net.mlanoe.language.vhdl.Named;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Template Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.GroupTemplateDeclaration#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getGroupTemplateDeclaration()
 * @model
 * @generated
 */
public interface GroupTemplateDeclaration extends Declaration, Named {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' attribute list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.declaration.EntityClass}.
	 * The literals are from the enumeration {@link net.mlanoe.language.vhdl.declaration.EntityClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' attribute list.
	 * @see net.mlanoe.language.vhdl.declaration.EntityClass
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getGroupTemplateDeclaration_Entry()
	 * @model unique="false"
	 * @generated
	 */
	EList<EntityClass> getEntry();

} // GroupTemplateDeclaration
