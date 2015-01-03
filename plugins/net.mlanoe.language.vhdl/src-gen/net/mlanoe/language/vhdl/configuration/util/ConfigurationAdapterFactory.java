/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.configuration.util;

import net.mlanoe.language.vhdl.Module;
import net.mlanoe.language.vhdl.Named;
import net.mlanoe.language.vhdl.VhdlObject;

import net.mlanoe.language.vhdl.configuration.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage
 * @generated
 */
public class ConfigurationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConfigurationPackage.eINSTANCE;
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
	protected ConfigurationSwitch<Adapter> modelSwitch =
		new ConfigurationSwitch<Adapter>() {
			@Override
			public Adapter caseBlockConfiguration(BlockConfiguration object) {
				return createBlockConfigurationAdapter();
			}
			@Override
			public Adapter caseComponentConfiguration(ComponentConfiguration object) {
				return createComponentConfigurationAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseConfigurationItem(ConfigurationItem object) {
				return createConfigurationItemAdapter();
			}
			@Override
			public Adapter caseConfigurationReference(ConfigurationReference object) {
				return createConfigurationReferenceAdapter();
			}
			@Override
			public Adapter caseConfigurationResolvedReference(ConfigurationResolvedReference object) {
				return createConfigurationResolvedReferenceAdapter();
			}
			@Override
			public Adapter caseVhdlObject(VhdlObject object) {
				return createVhdlObjectAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.configuration.BlockConfiguration <em>Block Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.configuration.BlockConfiguration
	 * @generated
	 */
	public Adapter createBlockConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration <em>Component Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.configuration.ComponentConfiguration
	 * @generated
	 */
	public Adapter createComponentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.configuration.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.configuration.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.configuration.ConfigurationItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationItem
	 * @generated
	 */
	public Adapter createConfigurationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.configuration.ConfigurationReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationReference
	 * @generated
	 */
	public Adapter createConfigurationReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.configuration.ConfigurationResolvedReference <em>Resolved Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationResolvedReference
	 * @generated
	 */
	public Adapter createConfigurationResolvedReferenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
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

} //ConfigurationAdapterFactory
