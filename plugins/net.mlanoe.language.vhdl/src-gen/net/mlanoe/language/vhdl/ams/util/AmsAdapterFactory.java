/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.ams.util;

import net.mlanoe.language.vhdl.MultiNamed;
import net.mlanoe.language.vhdl.VhdlObject;

import net.mlanoe.language.vhdl.ams.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.ams.AmsPackage
 * @generated
 */
public class AmsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AmsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AmsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmsSwitch<Adapter> modelSwitch =
		new AmsSwitch<Adapter>() {
			@Override
			public Adapter caseQuantityAspect(QuantityAspect object) {
				return createQuantityAspectAdapter();
			}
			@Override
			public Adapter caseSourceAspect(SourceAspect object) {
				return createSourceAspectAdapter();
			}
			@Override
			public Adapter caseSpectrum(Spectrum object) {
				return createSpectrumAdapter();
			}
			@Override
			public Adapter caseNoise(Noise object) {
				return createNoiseAdapter();
			}
			@Override
			public Adapter caseVhdlObject(VhdlObject object) {
				return createVhdlObjectAdapter();
			}
			@Override
			public Adapter caseMultiNamed(MultiNamed object) {
				return createMultiNamedAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.ams.QuantityAspect <em>Quantity Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.ams.QuantityAspect
	 * @generated
	 */
	public Adapter createQuantityAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.ams.SourceAspect <em>Source Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.ams.SourceAspect
	 * @generated
	 */
	public Adapter createSourceAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.ams.Spectrum <em>Spectrum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.ams.Spectrum
	 * @generated
	 */
	public Adapter createSpectrumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.ams.Noise <em>Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.ams.Noise
	 * @generated
	 */
	public Adapter createNoiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.VhdlObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.VhdlObject
	 * @generated
	 */
	public Adapter createVhdlObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.MultiNamed <em>Multi Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.MultiNamed
	 * @generated
	 */
	public Adapter createMultiNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AmsAdapterFactory
