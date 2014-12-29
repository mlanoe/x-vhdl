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
package net.mlanoe.language.vhdl.ams;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.ams.AmsPackage
 * @generated
 */
public interface AmsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmsFactory eINSTANCE = net.mlanoe.language.vhdl.ams.impl.AmsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Quantity Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity Aspect</em>'.
	 * @generated
	 */
	QuantityAspect createQuantityAspect();

	/**
	 * Returns a new object of class '<em>Source Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Aspect</em>'.
	 * @generated
	 */
	SourceAspect createSourceAspect();

	/**
	 * Returns a new object of class '<em>Spectrum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spectrum</em>'.
	 * @generated
	 */
	Spectrum createSpectrum();

	/**
	 * Returns a new object of class '<em>Noise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Noise</em>'.
	 * @generated
	 */
	Noise createNoise();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AmsPackage getAmsPackage();

} //AmsFactory
