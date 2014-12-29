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
