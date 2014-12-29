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
package net.mlanoe.language.vhdl.impl;

import net.mlanoe.language.vhdl.Architecture;
import net.mlanoe.language.vhdl.CallResolvedReference;
import net.mlanoe.language.vhdl.Component;
import net.mlanoe.language.vhdl.ComponentResolvedReference;
import net.mlanoe.language.vhdl.DesignUnit;
import net.mlanoe.language.vhdl.Entity;
import net.mlanoe.language.vhdl.EntityResolvedReference;
import net.mlanoe.language.vhdl.GenericMaps;
import net.mlanoe.language.vhdl.Generics;
import net.mlanoe.language.vhdl.Model;
import net.mlanoe.language.vhdl.MultiNamed;
import net.mlanoe.language.vhdl.NameList;
import net.mlanoe.language.vhdl.PackageBody;
import net.mlanoe.language.vhdl.PackageResolvedReference;
import net.mlanoe.language.vhdl.PortMaps;
import net.mlanoe.language.vhdl.Ports;
import net.mlanoe.language.vhdl.Signature;
import net.mlanoe.language.vhdl.VhdlFactory;
import net.mlanoe.language.vhdl.VhdlPackage;
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
public class VhdlFactoryImpl extends EFactoryImpl implements VhdlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VhdlFactory init() {
		try {
			VhdlFactory theVhdlFactory = (VhdlFactory)EPackage.Registry.INSTANCE.getEFactory(VhdlPackage.eNS_URI);
			if (theVhdlFactory != null) {
				return theVhdlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VhdlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VhdlFactoryImpl() {
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
			case VhdlPackage.ARCHITECTURE: return createArchitecture();
			case VhdlPackage.COMPONENT: return createComponent();
			case VhdlPackage.DESIGN_UNIT: return createDesignUnit();
			case VhdlPackage.ENTITY: return createEntity();
			case VhdlPackage.GENERIC_MAPS: return createGenericMaps();
			case VhdlPackage.GENERICS: return createGenerics();
			case VhdlPackage.MODEL: return createModel();
			case VhdlPackage.PACKAGE: return createPackage();
			case VhdlPackage.PACKAGE_BODY: return createPackageBody();
			case VhdlPackage.PORTS: return createPorts();
			case VhdlPackage.PORT_MAPS: return createPortMaps();
			case VhdlPackage.SIGNATURE: return createSignature();
			case VhdlPackage.MULTI_NAMED: return createMultiNamed();
			case VhdlPackage.NAME_LIST: return createNameList();
			case VhdlPackage.ENTITY_RESOLVED_REFERENCE: return createEntityResolvedReference();
			case VhdlPackage.PACKAGE_RESOLVED_REFERENCE: return createPackageResolvedReference();
			case VhdlPackage.COMPONENT_RESOLVED_REFERENCE: return createComponentResolvedReference();
			case VhdlPackage.CALL_RESOLVED_REFERENCE: return createCallResolvedReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture createArchitecture() {
		ArchitectureImpl architecture = new ArchitectureImpl();
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignUnit createDesignUnit() {
		DesignUnitImpl designUnit = new DesignUnitImpl();
		return designUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generics createGenerics() {
		GenericsImpl generics = new GenericsImpl();
		return generics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericMaps createGenericMaps() {
		GenericMapsImpl genericMaps = new GenericMapsImpl();
		return genericMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageBody createPackageBody() {
		PackageBodyImpl packageBody = new PackageBodyImpl();
		return packageBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.mlanoe.language.vhdl.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ports createPorts() {
		PortsImpl ports = new PortsImpl();
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMaps createPortMaps() {
		PortMapsImpl portMaps = new PortMapsImpl();
		return portMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiNamed createMultiNamed() {
		MultiNamedImpl multiNamed = new MultiNamedImpl();
		return multiNamed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameList createNameList() {
		NameListImpl nameList = new NameListImpl();
		return nameList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityResolvedReference createEntityResolvedReference() {
		EntityResolvedReferenceImpl entityResolvedReference = new EntityResolvedReferenceImpl();
		return entityResolvedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageResolvedReference createPackageResolvedReference() {
		PackageResolvedReferenceImpl packageResolvedReference = new PackageResolvedReferenceImpl();
		return packageResolvedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentResolvedReference createComponentResolvedReference() {
		ComponentResolvedReferenceImpl componentResolvedReference = new ComponentResolvedReferenceImpl();
		return componentResolvedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallResolvedReference createCallResolvedReference() {
		CallResolvedReferenceImpl callResolvedReference = new CallResolvedReferenceImpl();
		return callResolvedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VhdlPackage getVhdlPackage() {
		return (VhdlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VhdlPackage getPackage() {
		return VhdlPackage.eINSTANCE;
	}

} //VhdlFactoryImpl
