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
package net.mlanoe.language.vhdl.nature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Nature Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.nature.RecordNatureDefinition#getRecord <em>Record</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.nature.NaturePackage#getRecordNatureDefinition()
 * @model
 * @generated
 */
public interface RecordNatureDefinition extends CompositeNatureDefinition {
	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.nature.RecordNatureElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.nature.NaturePackage#getRecordNatureDefinition_Record()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecordNatureElement> getRecord();

} // RecordNatureDefinition
