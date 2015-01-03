/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl;

import net.mlanoe.language.vhdl.configuration.ConfigurationReference;

import net.mlanoe.language.vhdl.nature.NatureReference;

import net.mlanoe.language.vhdl.type.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see net.mlanoe.language.vhdl.VhdlPackage#getName_()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Name extends MultiName, TypeReference, NatureReference, EntityReference, PackageReference, ComponentReference, ConfigurationReference, CallReference {
} // Name
