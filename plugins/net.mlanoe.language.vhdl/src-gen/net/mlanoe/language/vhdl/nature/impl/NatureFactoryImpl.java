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
package net.mlanoe.language.vhdl.nature.impl;

import net.mlanoe.language.vhdl.nature.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NatureFactoryImpl extends EFactoryImpl implements NatureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NatureFactory init() {
		try {
			NatureFactory theNatureFactory = (NatureFactory)EPackage.Registry.INSTANCE.getEFactory(NaturePackage.eNS_URI);
			if (theNatureFactory != null) {
				return theNatureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NatureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NatureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NaturePackage.ARRAY_NATURE_DEFINITION: return createArrayNatureDefinition();
			case NaturePackage.COMPOSITE_NATURE_DEFINITION: return createCompositeNatureDefinition();
			case NaturePackage.CONSTRAINED_ARRAY_NATURE_DEFINITION: return createConstrainedArrayNatureDefinition();
			case NaturePackage.NATURE_DEFINITION: return createNatureDefinition();
			case NaturePackage.RECORD_NATURE_DEFINITION: return createRecordNatureDefinition();
			case NaturePackage.RECORD_NATURE_ELEMENT: return createRecordNatureElement();
			case NaturePackage.SCALAR_NATURE_DEFINITION: return createScalarNatureDefinition();
			case NaturePackage.UNCONSTRAINED_ARRAY_NATURE_DEFINITION: return createUnconstrainedArrayNatureDefinition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayNatureDefinition createArrayNatureDefinition() {
		ArrayNatureDefinitionImpl arrayNatureDefinition = new ArrayNatureDefinitionImpl();
		return arrayNatureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNatureDefinition createCompositeNatureDefinition() {
		CompositeNatureDefinitionImpl compositeNatureDefinition = new CompositeNatureDefinitionImpl();
		return compositeNatureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainedArrayNatureDefinition createConstrainedArrayNatureDefinition() {
		ConstrainedArrayNatureDefinitionImpl constrainedArrayNatureDefinition = new ConstrainedArrayNatureDefinitionImpl();
		return constrainedArrayNatureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NatureDefinition createNatureDefinition() {
		NatureDefinitionImpl natureDefinition = new NatureDefinitionImpl();
		return natureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordNatureDefinition createRecordNatureDefinition() {
		RecordNatureDefinitionImpl recordNatureDefinition = new RecordNatureDefinitionImpl();
		return recordNatureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordNatureElement createRecordNatureElement() {
		RecordNatureElementImpl recordNatureElement = new RecordNatureElementImpl();
		return recordNatureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalarNatureDefinition createScalarNatureDefinition() {
		ScalarNatureDefinitionImpl scalarNatureDefinition = new ScalarNatureDefinitionImpl();
		return scalarNatureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnconstrainedArrayNatureDefinition createUnconstrainedArrayNatureDefinition() {
		UnconstrainedArrayNatureDefinitionImpl unconstrainedArrayNatureDefinition = new UnconstrainedArrayNatureDefinitionImpl();
		return unconstrainedArrayNatureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturePackage getNaturePackage() {
		return (NaturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NaturePackage getPackage() {
		return NaturePackage.eINSTANCE;
	}

} //NatureFactoryImpl
