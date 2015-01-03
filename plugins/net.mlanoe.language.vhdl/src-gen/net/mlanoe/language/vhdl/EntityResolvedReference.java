/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Resolved Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.EntityResolvedReference#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.VhdlPackage#getEntityResolvedReference()
 * @model
 * @generated
 */
public interface EntityResolvedReference extends VhdlObject, EntityReference {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getEntityResolvedReference_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.EntityResolvedReference#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // EntityResolvedReference
