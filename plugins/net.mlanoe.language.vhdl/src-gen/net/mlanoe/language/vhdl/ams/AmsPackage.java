/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.ams;

import net.mlanoe.language.vhdl.VhdlPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.ams.AmsFactory
 * @model kind="package"
 * @generated
 */
public interface AmsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ams";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mlanoe.net/language/vhdl/ams/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ams";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmsPackage eINSTANCE = net.mlanoe.language.vhdl.ams.impl.AmsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.ams.impl.QuantityAspectImpl <em>Quantity Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.ams.impl.QuantityAspectImpl
	 * @see net.mlanoe.language.vhdl.ams.impl.AmsPackageImpl#getQuantityAspect()
	 * @generated
	 */
	int QUANTITY_ASPECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_ASPECT__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_ASPECT__NAME = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_ASPECT__TOLERANCE = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_ASPECT__EXPRESSION = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantity Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_ASPECT_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.ams.impl.SourceAspectImpl <em>Source Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.ams.impl.SourceAspectImpl
	 * @see net.mlanoe.language.vhdl.ams.impl.AmsPackageImpl#getSourceAspect()
	 * @generated
	 */
	int SOURCE_ASPECT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ASPECT__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Source Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ASPECT_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.ams.impl.SpectrumImpl <em>Spectrum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.ams.impl.SpectrumImpl
	 * @see net.mlanoe.language.vhdl.ams.impl.AmsPackageImpl#getSpectrum()
	 * @generated
	 */
	int SPECTRUM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTRUM__ID = SOURCE_ASPECT__ID;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTRUM__LEFT = SOURCE_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTRUM__RIGHT = SOURCE_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spectrum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTRUM_FEATURE_COUNT = SOURCE_ASPECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.ams.impl.NoiseImpl <em>Noise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.ams.impl.NoiseImpl
	 * @see net.mlanoe.language.vhdl.ams.impl.AmsPackageImpl#getNoise()
	 * @generated
	 */
	int NOISE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE__ID = SOURCE_ASPECT__ID;

	/**
	 * The feature id for the '<em><b>Noise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE__NOISE = SOURCE_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Noise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_FEATURE_COUNT = SOURCE_ASPECT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.ams.QuantityAspect <em>Quantity Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Aspect</em>'.
	 * @see net.mlanoe.language.vhdl.ams.QuantityAspect
	 * @generated
	 */
	EClass getQuantityAspect();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.ams.QuantityAspect#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tolerance</em>'.
	 * @see net.mlanoe.language.vhdl.ams.QuantityAspect#getTolerance()
	 * @see #getQuantityAspect()
	 * @generated
	 */
	EReference getQuantityAspect_Tolerance();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.ams.QuantityAspect#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see net.mlanoe.language.vhdl.ams.QuantityAspect#getExpression()
	 * @see #getQuantityAspect()
	 * @generated
	 */
	EReference getQuantityAspect_Expression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.ams.SourceAspect <em>Source Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Aspect</em>'.
	 * @see net.mlanoe.language.vhdl.ams.SourceAspect
	 * @generated
	 */
	EClass getSourceAspect();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.ams.Spectrum <em>Spectrum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spectrum</em>'.
	 * @see net.mlanoe.language.vhdl.ams.Spectrum
	 * @generated
	 */
	EClass getSpectrum();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.ams.Spectrum#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see net.mlanoe.language.vhdl.ams.Spectrum#getLeft()
	 * @see #getSpectrum()
	 * @generated
	 */
	EReference getSpectrum_Left();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.ams.Spectrum#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see net.mlanoe.language.vhdl.ams.Spectrum#getRight()
	 * @see #getSpectrum()
	 * @generated
	 */
	EReference getSpectrum_Right();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.ams.Noise <em>Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noise</em>'.
	 * @see net.mlanoe.language.vhdl.ams.Noise
	 * @generated
	 */
	EClass getNoise();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.ams.Noise#getNoise <em>Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Noise</em>'.
	 * @see net.mlanoe.language.vhdl.ams.Noise#getNoise()
	 * @see #getNoise()
	 * @generated
	 */
	EReference getNoise_Noise();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AmsFactory getAmsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.ams.impl.QuantityAspectImpl <em>Quantity Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.ams.impl.QuantityAspectImpl
		 * @see net.mlanoe.language.vhdl.ams.impl.AmsPackageImpl#getQuantityAspect()
		 * @generated
		 */
		EClass QUANTITY_ASPECT = eINSTANCE.getQuantityAspect();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_ASPECT__TOLERANCE = eINSTANCE.getQuantityAspect_Tolerance();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_ASPECT__EXPRESSION = eINSTANCE.getQuantityAspect_Expression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.ams.impl.SourceAspectImpl <em>Source Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.ams.impl.SourceAspectImpl
		 * @see net.mlanoe.language.vhdl.ams.impl.AmsPackageImpl#getSourceAspect()
		 * @generated
		 */
		EClass SOURCE_ASPECT = eINSTANCE.getSourceAspect();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.ams.impl.SpectrumImpl <em>Spectrum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.ams.impl.SpectrumImpl
		 * @see net.mlanoe.language.vhdl.ams.impl.AmsPackageImpl#getSpectrum()
		 * @generated
		 */
		EClass SPECTRUM = eINSTANCE.getSpectrum();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECTRUM__LEFT = eINSTANCE.getSpectrum_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECTRUM__RIGHT = eINSTANCE.getSpectrum_Right();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.ams.impl.NoiseImpl <em>Noise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.ams.impl.NoiseImpl
		 * @see net.mlanoe.language.vhdl.ams.impl.AmsPackageImpl#getNoise()
		 * @generated
		 */
		EClass NOISE = eINSTANCE.getNoise();

		/**
		 * The meta object literal for the '<em><b>Noise</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOISE__NOISE = eINSTANCE.getNoise_Noise();

	}

} //AmsPackage
