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

import net.mlanoe.language.vhdl.declaration.DeclarationPackage;
import org.eclipse.emf.ecore.EAttribute;
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
 * @see net.mlanoe.language.vhdl.VhdlFactory
 * @model kind="package"
 * @generated
 */
public interface VhdlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vhdl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mlanoe.net/language/vhdl/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vhdl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VhdlPackage eINSTANCE = net.mlanoe.language.vhdl.impl.VhdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.VhdlObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.VhdlObjectImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getVhdlObject()
	 * @generated
	 */
	int VHDL_OBJECT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_OBJECT__ID = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.ModuleImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ID = VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DECLARATION = VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.ArchitectureImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.DesignUnitImpl <em>Design Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.DesignUnitImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getDesignUnit()
	 * @generated
	 */
	int DESIGN_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__DECLARATION = MODULE__DECLARATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__NAME = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__OF = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__STATEMENT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.ComponentImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = DeclarationPackage.DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = DeclarationPackage.DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERIC = DeclarationPackage.DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORT = DeclarationPackage.DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = DeclarationPackage.DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_UNIT__ID = VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_UNIT__LIBRARY = VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_UNIT__USE = VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_UNIT__MODULE = VHDL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Design Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_UNIT_FEATURE_COUNT = VHDL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.ModelImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 7;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.EntityImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DECLARATION = MODULE__DECLARATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__GENERIC = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PORT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__STATEMENT = MODULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = MODULE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.GenericsImpl <em>Generics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.GenericsImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getGenerics()
	 * @generated
	 */
	int GENERICS = 6;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.GenericMapsImpl <em>Generic Maps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.GenericMapsImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getGenericMaps()
	 * @generated
	 */
	int GENERIC_MAPS = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAPS__ID = VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Generic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAPS__GENERIC = VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Maps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAPS_FEATURE_COUNT = VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERICS__ID = VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERICS__DECLARATION = VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERICS_FEATURE_COUNT = VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ID = VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Design</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESIGN = VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.PackageBodyImpl <em>Package Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.PackageBodyImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getPackageBody()
	 * @generated
	 */
	int PACKAGE_BODY = 9;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.PackageImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DECLARATION = MODULE__DECLARATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_BODY__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_BODY__DECLARATION = MODULE__DECLARATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_BODY__NAME = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_BODY_FEATURE_COUNT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.PortsImpl <em>Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.PortsImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getPorts()
	 * @generated
	 */
	int PORTS = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS__ID = VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS__DECLARATION = VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_FEATURE_COUNT = VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.PortMapsImpl <em>Port Maps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.PortMapsImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getPortMaps()
	 * @generated
	 */
	int PORT_MAPS = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_MAPS__ID = VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_MAPS__PORT = VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Maps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_MAPS_FEATURE_COUNT = VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.SignatureImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ID = VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__PARAMETER = VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__RETURN = VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = VHDL_OBJECT_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.Named <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.Named
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.MultiNamedImpl <em>Multi Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.MultiNamedImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getMultiNamed()
	 * @generated
	 */
	int MULTI_NAMED = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Multi Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NAMED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.MultiName <em>Multi Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.MultiName
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getMultiName()
	 * @generated
	 */
	int MULTI_NAME = 16;

	/**
	 * The number of structural features of the '<em>Multi Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NAME_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.Name <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.Name
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 17;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = MULTI_NAME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.NameListImpl <em>Name List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.NameListImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getNameList()
	 * @generated
	 */
	int NAME_LIST = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LIST__ID = VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LIST__NAME = VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LIST_FEATURE_COUNT = VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.EntityReference <em>Entity Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.EntityReference
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getEntityReference()
	 * @generated
	 */
	int ENTITY_REFERENCE = 19;

	/**
	 * The number of structural features of the '<em>Entity Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.EntityResolvedReferenceImpl <em>Entity Resolved Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.EntityResolvedReferenceImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getEntityResolvedReference()
	 * @generated
	 */
	int ENTITY_RESOLVED_REFERENCE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESOLVED_REFERENCE__ID = VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESOLVED_REFERENCE__ENTITY = VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Resolved Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESOLVED_REFERENCE_FEATURE_COUNT = VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.PackageReference <em>Package Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.PackageReference
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getPackageReference()
	 * @generated
	 */
	int PACKAGE_REFERENCE = 21;

	/**
	 * The number of structural features of the '<em>Package Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.PackageResolvedReferenceImpl <em>Package Resolved Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.PackageResolvedReferenceImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getPackageResolvedReference()
	 * @generated
	 */
	int PACKAGE_RESOLVED_REFERENCE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_RESOLVED_REFERENCE__ID = VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_RESOLVED_REFERENCE__PACKAGE = VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Resolved Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_RESOLVED_REFERENCE_FEATURE_COUNT = VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.ComponentReference <em>Component Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.ComponentReference
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getComponentReference()
	 * @generated
	 */
	int COMPONENT_REFERENCE = 23;

	/**
	 * The number of structural features of the '<em>Component Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.ComponentResolvedReferenceImpl <em>Component Resolved Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.ComponentResolvedReferenceImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getComponentResolvedReference()
	 * @generated
	 */
	int COMPONENT_RESOLVED_REFERENCE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOLVED_REFERENCE__ID = VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOLVED_REFERENCE__COMPONENT = VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Resolved Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOLVED_REFERENCE_FEATURE_COUNT = VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.CallReference <em>Call Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.CallReference
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getCallReference()
	 * @generated
	 */
	int CALL_REFERENCE = 25;

	/**
	 * The number of structural features of the '<em>Call Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.CallResolvedReferenceImpl <em>Call Resolved Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.CallResolvedReferenceImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getCallResolvedReference()
	 * @generated
	 */
	int CALL_RESOLVED_REFERENCE = 26;

	/**
	 * The feature id for the '<em><b>Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RESOLVED_REFERENCE__CALL = CALL_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Resolved Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RESOLVED_REFERENCE_FEATURE_COUNT = CALL_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.impl.StringNamedImpl <em>String Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.impl.StringNamedImpl
	 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getStringNamed()
	 * @generated
	 */
	int STRING_NAMED = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>String Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAMED_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see net.mlanoe.language.vhdl.Architecture
	 * @generated
	 */
	EClass getArchitecture();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.Architecture#getOf <em>Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Of</em>'.
	 * @see net.mlanoe.language.vhdl.Architecture#getOf()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Of();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.Architecture#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see net.mlanoe.language.vhdl.Architecture#getStatement()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Statement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see net.mlanoe.language.vhdl.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.Component#getGeneric <em>Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic</em>'.
	 * @see net.mlanoe.language.vhdl.Component#getGeneric()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Generic();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.Component#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port</em>'.
	 * @see net.mlanoe.language.vhdl.Component#getPort()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Port();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.DesignUnit <em>Design Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Unit</em>'.
	 * @see net.mlanoe.language.vhdl.DesignUnit
	 * @generated
	 */
	EClass getDesignUnit();

	/**
	 * Returns the meta object for the attribute list '{@link net.mlanoe.language.vhdl.DesignUnit#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Library</em>'.
	 * @see net.mlanoe.language.vhdl.DesignUnit#getLibrary()
	 * @see #getDesignUnit()
	 * @generated
	 */
	EAttribute getDesignUnit_Library();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.DesignUnit#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use</em>'.
	 * @see net.mlanoe.language.vhdl.DesignUnit#getUse()
	 * @see #getDesignUnit()
	 * @generated
	 */
	EReference getDesignUnit_Use();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.DesignUnit#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module</em>'.
	 * @see net.mlanoe.language.vhdl.DesignUnit#getModule()
	 * @see #getDesignUnit()
	 * @generated
	 */
	EReference getDesignUnit_Module();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see net.mlanoe.language.vhdl.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.Module#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.Module#getDeclaration()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Declaration();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see net.mlanoe.language.vhdl.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.Model#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Design</em>'.
	 * @see net.mlanoe.language.vhdl.Model#getDesign()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Design();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see net.mlanoe.language.vhdl.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.Entity#getGeneric <em>Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic</em>'.
	 * @see net.mlanoe.language.vhdl.Entity#getGeneric()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Generic();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.Entity#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port</em>'.
	 * @see net.mlanoe.language.vhdl.Entity#getPort()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.Entity#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see net.mlanoe.language.vhdl.Entity#getStatement()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Statement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.Generics <em>Generics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generics</em>'.
	 * @see net.mlanoe.language.vhdl.Generics
	 * @generated
	 */
	EClass getGenerics();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.Generics#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.Generics#getDeclaration()
	 * @see #getGenerics()
	 * @generated
	 */
	EReference getGenerics_Declaration();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.GenericMaps <em>Generic Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Maps</em>'.
	 * @see net.mlanoe.language.vhdl.GenericMaps
	 * @generated
	 */
	EClass getGenericMaps();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.GenericMaps#getGeneric <em>Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic</em>'.
	 * @see net.mlanoe.language.vhdl.GenericMaps#getGeneric()
	 * @see #getGenericMaps()
	 * @generated
	 */
	EReference getGenericMaps_Generic();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.PackageBody <em>Package Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Body</em>'.
	 * @see net.mlanoe.language.vhdl.PackageBody
	 * @generated
	 */
	EClass getPackageBody();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.PackageBody#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see net.mlanoe.language.vhdl.PackageBody#getName()
	 * @see #getPackageBody()
	 * @generated
	 */
	EReference getPackageBody_Name();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see net.mlanoe.language.vhdl.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.Ports <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ports</em>'.
	 * @see net.mlanoe.language.vhdl.Ports
	 * @generated
	 */
	EClass getPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.Ports#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.Ports#getDeclaration()
	 * @see #getPorts()
	 * @generated
	 */
	EReference getPorts_Declaration();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.PortMaps <em>Port Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Maps</em>'.
	 * @see net.mlanoe.language.vhdl.PortMaps
	 * @generated
	 */
	EClass getPortMaps();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.PortMaps#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see net.mlanoe.language.vhdl.PortMaps#getPort()
	 * @see #getPortMaps()
	 * @generated
	 */
	EReference getPortMaps_Port();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see net.mlanoe.language.vhdl.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.Signature#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see net.mlanoe.language.vhdl.Signature#getParameter()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.Signature#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see net.mlanoe.language.vhdl.Signature#getReturn()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Return();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.VhdlObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see net.mlanoe.language.vhdl.VhdlObject
	 * @generated
	 */
	EClass getVhdlObject();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.VhdlObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.mlanoe.language.vhdl.VhdlObject#getId()
	 * @see #getVhdlObject()
	 * @generated
	 */
	EAttribute getVhdlObject_Id();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.MultiName <em>Multi Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Name</em>'.
	 * @see net.mlanoe.language.vhdl.MultiName
	 * @generated
	 */
	EClass getMultiName();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see net.mlanoe.language.vhdl.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.NameList <em>Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name List</em>'.
	 * @see net.mlanoe.language.vhdl.NameList
	 * @generated
	 */
	EClass getNameList();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.NameList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see net.mlanoe.language.vhdl.NameList#getName()
	 * @see #getNameList()
	 * @generated
	 */
	EReference getNameList_Name();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.EntityReference <em>Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Reference</em>'.
	 * @see net.mlanoe.language.vhdl.EntityReference
	 * @generated
	 */
	EClass getEntityReference();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.EntityResolvedReference <em>Entity Resolved Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Resolved Reference</em>'.
	 * @see net.mlanoe.language.vhdl.EntityResolvedReference
	 * @generated
	 */
	EClass getEntityResolvedReference();

	/**
	 * Returns the meta object for the reference '{@link net.mlanoe.language.vhdl.EntityResolvedReference#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see net.mlanoe.language.vhdl.EntityResolvedReference#getEntity()
	 * @see #getEntityResolvedReference()
	 * @generated
	 */
	EReference getEntityResolvedReference_Entity();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.PackageReference <em>Package Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Reference</em>'.
	 * @see net.mlanoe.language.vhdl.PackageReference
	 * @generated
	 */
	EClass getPackageReference();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.PackageResolvedReference <em>Package Resolved Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Resolved Reference</em>'.
	 * @see net.mlanoe.language.vhdl.PackageResolvedReference
	 * @generated
	 */
	EClass getPackageResolvedReference();

	/**
	 * Returns the meta object for the reference '{@link net.mlanoe.language.vhdl.PackageResolvedReference#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see net.mlanoe.language.vhdl.PackageResolvedReference#getPackage()
	 * @see #getPackageResolvedReference()
	 * @generated
	 */
	EReference getPackageResolvedReference_Package();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.ComponentReference <em>Component Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Reference</em>'.
	 * @see net.mlanoe.language.vhdl.ComponentReference
	 * @generated
	 */
	EClass getComponentReference();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.ComponentResolvedReference <em>Component Resolved Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Resolved Reference</em>'.
	 * @see net.mlanoe.language.vhdl.ComponentResolvedReference
	 * @generated
	 */
	EClass getComponentResolvedReference();

	/**
	 * Returns the meta object for the reference '{@link net.mlanoe.language.vhdl.ComponentResolvedReference#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see net.mlanoe.language.vhdl.ComponentResolvedReference#getComponent()
	 * @see #getComponentResolvedReference()
	 * @generated
	 */
	EReference getComponentResolvedReference_Component();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.CallReference <em>Call Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Reference</em>'.
	 * @see net.mlanoe.language.vhdl.CallReference
	 * @generated
	 */
	EClass getCallReference();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.CallResolvedReference <em>Call Resolved Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Resolved Reference</em>'.
	 * @see net.mlanoe.language.vhdl.CallResolvedReference
	 * @generated
	 */
	EClass getCallResolvedReference();

	/**
	 * Returns the meta object for the reference '{@link net.mlanoe.language.vhdl.CallResolvedReference#getCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Call</em>'.
	 * @see net.mlanoe.language.vhdl.CallResolvedReference#getCall()
	 * @see #getCallResolvedReference()
	 * @generated
	 */
	EReference getCallResolvedReference_Call();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.StringNamed <em>String Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Named</em>'.
	 * @see net.mlanoe.language.vhdl.StringNamed
	 * @generated
	 */
	EClass getStringNamed();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.StringNamed#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.mlanoe.language.vhdl.StringNamed#getName()
	 * @see #getStringNamed()
	 * @generated
	 */
	EAttribute getStringNamed_Name();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see net.mlanoe.language.vhdl.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see net.mlanoe.language.vhdl.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EReference getNamed_Name();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.MultiNamed <em>Multi Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Named</em>'.
	 * @see net.mlanoe.language.vhdl.MultiNamed
	 * @generated
	 */
	EClass getMultiNamed();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.MultiNamed#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see net.mlanoe.language.vhdl.MultiNamed#getName()
	 * @see #getMultiNamed()
	 * @generated
	 */
	EReference getMultiNamed_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VhdlFactory getVhdlFactory();

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
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.ArchitectureImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '<em><b>Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__OF = eINSTANCE.getArchitecture_Of();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__STATEMENT = eINSTANCE.getArchitecture_Statement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.ComponentImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Generic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__GENERIC = eINSTANCE.getComponent_Generic();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORT = eINSTANCE.getComponent_Port();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.DesignUnitImpl <em>Design Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.DesignUnitImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getDesignUnit()
		 * @generated
		 */
		EClass DESIGN_UNIT = eINSTANCE.getDesignUnit();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_UNIT__LIBRARY = eINSTANCE.getDesignUnit_Library();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_UNIT__USE = eINSTANCE.getDesignUnit_Use();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_UNIT__MODULE = eINSTANCE.getDesignUnit_Module();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.ModuleImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__DECLARATION = eINSTANCE.getModule_Declaration();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.ModelImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DESIGN = eINSTANCE.getModel_Design();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.EntityImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Generic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__GENERIC = eINSTANCE.getEntity_Generic();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PORT = eINSTANCE.getEntity_Port();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__STATEMENT = eINSTANCE.getEntity_Statement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.GenericsImpl <em>Generics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.GenericsImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getGenerics()
		 * @generated
		 */
		EClass GENERICS = eINSTANCE.getGenerics();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERICS__DECLARATION = eINSTANCE.getGenerics_Declaration();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.GenericMapsImpl <em>Generic Maps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.GenericMapsImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getGenericMaps()
		 * @generated
		 */
		EClass GENERIC_MAPS = eINSTANCE.getGenericMaps();

		/**
		 * The meta object literal for the '<em><b>Generic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_MAPS__GENERIC = eINSTANCE.getGenericMaps_Generic();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.PackageBodyImpl <em>Package Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.PackageBodyImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getPackageBody()
		 * @generated
		 */
		EClass PACKAGE_BODY = eINSTANCE.getPackageBody();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_BODY__NAME = eINSTANCE.getPackageBody_Name();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.PackageImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.PortsImpl <em>Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.PortsImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getPorts()
		 * @generated
		 */
		EClass PORTS = eINSTANCE.getPorts();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTS__DECLARATION = eINSTANCE.getPorts_Declaration();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.PortMapsImpl <em>Port Maps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.PortMapsImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getPortMaps()
		 * @generated
		 */
		EClass PORT_MAPS = eINSTANCE.getPortMaps();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_MAPS__PORT = eINSTANCE.getPortMaps_Port();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.SignatureImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__PARAMETER = eINSTANCE.getSignature_Parameter();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__RETURN = eINSTANCE.getSignature_Return();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.VhdlObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.VhdlObjectImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getVhdlObject()
		 * @generated
		 */
		EClass VHDL_OBJECT = eINSTANCE.getVhdlObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VHDL_OBJECT__ID = eINSTANCE.getVhdlObject_Id();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.MultiName <em>Multi Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.MultiName
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getMultiName()
		 * @generated
		 */
		EClass MULTI_NAME = eINSTANCE.getMultiName();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.Name <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.Name
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getName_()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.NameListImpl <em>Name List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.NameListImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getNameList()
		 * @generated
		 */
		EClass NAME_LIST = eINSTANCE.getNameList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_LIST__NAME = eINSTANCE.getNameList_Name();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.EntityReference <em>Entity Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.EntityReference
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getEntityReference()
		 * @generated
		 */
		EClass ENTITY_REFERENCE = eINSTANCE.getEntityReference();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.EntityResolvedReferenceImpl <em>Entity Resolved Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.EntityResolvedReferenceImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getEntityResolvedReference()
		 * @generated
		 */
		EClass ENTITY_RESOLVED_REFERENCE = eINSTANCE.getEntityResolvedReference();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RESOLVED_REFERENCE__ENTITY = eINSTANCE.getEntityResolvedReference_Entity();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.PackageReference <em>Package Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.PackageReference
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getPackageReference()
		 * @generated
		 */
		EClass PACKAGE_REFERENCE = eINSTANCE.getPackageReference();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.PackageResolvedReferenceImpl <em>Package Resolved Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.PackageResolvedReferenceImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getPackageResolvedReference()
		 * @generated
		 */
		EClass PACKAGE_RESOLVED_REFERENCE = eINSTANCE.getPackageResolvedReference();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_RESOLVED_REFERENCE__PACKAGE = eINSTANCE.getPackageResolvedReference_Package();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.ComponentReference <em>Component Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.ComponentReference
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getComponentReference()
		 * @generated
		 */
		EClass COMPONENT_REFERENCE = eINSTANCE.getComponentReference();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.ComponentResolvedReferenceImpl <em>Component Resolved Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.ComponentResolvedReferenceImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getComponentResolvedReference()
		 * @generated
		 */
		EClass COMPONENT_RESOLVED_REFERENCE = eINSTANCE.getComponentResolvedReference();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_RESOLVED_REFERENCE__COMPONENT = eINSTANCE.getComponentResolvedReference_Component();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.CallReference <em>Call Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.CallReference
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getCallReference()
		 * @generated
		 */
		EClass CALL_REFERENCE = eINSTANCE.getCallReference();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.CallResolvedReferenceImpl <em>Call Resolved Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.CallResolvedReferenceImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getCallResolvedReference()
		 * @generated
		 */
		EClass CALL_RESOLVED_REFERENCE = eINSTANCE.getCallResolvedReference();

		/**
		 * The meta object literal for the '<em><b>Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_RESOLVED_REFERENCE__CALL = eINSTANCE.getCallResolvedReference_Call();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.StringNamedImpl <em>String Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.StringNamedImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getStringNamed()
		 * @generated
		 */
		EClass STRING_NAMED = eINSTANCE.getStringNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_NAMED__NAME = eINSTANCE.getStringNamed_Name();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.Named <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.Named
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.impl.MultiNamedImpl <em>Multi Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.impl.MultiNamedImpl
		 * @see net.mlanoe.language.vhdl.impl.VhdlPackageImpl#getMultiNamed()
		 * @generated
		 */
		EClass MULTI_NAMED = eINSTANCE.getMultiNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_NAMED__NAME = eINSTANCE.getMultiNamed_Name();

	}

} //VhdlPackage
