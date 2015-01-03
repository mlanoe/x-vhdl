/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.util;

import net.mlanoe.language.vhdl.Architecture;
import net.mlanoe.language.vhdl.CallReference;
import net.mlanoe.language.vhdl.CallResolvedReference;
import net.mlanoe.language.vhdl.Component;
import net.mlanoe.language.vhdl.ComponentReference;
import net.mlanoe.language.vhdl.ComponentResolvedReference;
import net.mlanoe.language.vhdl.DesignUnit;
import net.mlanoe.language.vhdl.Entity;
import net.mlanoe.language.vhdl.EntityReference;
import net.mlanoe.language.vhdl.EntityResolvedReference;
import net.mlanoe.language.vhdl.GenericMaps;
import net.mlanoe.language.vhdl.Generics;
import net.mlanoe.language.vhdl.Model;
import net.mlanoe.language.vhdl.Module;
import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.MultiNamed;
import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.NameList;
import net.mlanoe.language.vhdl.Named;
import net.mlanoe.language.vhdl.PackageBody;
import net.mlanoe.language.vhdl.PackageReference;
import net.mlanoe.language.vhdl.PackageResolvedReference;
import net.mlanoe.language.vhdl.PortMaps;
import net.mlanoe.language.vhdl.Ports;
import net.mlanoe.language.vhdl.Signature;
import net.mlanoe.language.vhdl.StringNamed;
import net.mlanoe.language.vhdl.VhdlObject;
import net.mlanoe.language.vhdl.VhdlPackage;

import net.mlanoe.language.vhdl.configuration.ConfigurationReference;

import net.mlanoe.language.vhdl.declaration.Declaration;

import net.mlanoe.language.vhdl.nature.NatureReference;

import net.mlanoe.language.vhdl.type.TypeReference;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.VhdlPackage
 * @generated
 */
public class VhdlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VhdlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VhdlSwitch() {
		if (modelPackage == null) {
			modelPackage = VhdlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VhdlPackage.ARCHITECTURE: {
				Architecture architecture = (Architecture)theEObject;
				T result = caseArchitecture(architecture);
				if (result == null) result = caseModule(architecture);
				if (result == null) result = caseNamed(architecture);
				if (result == null) result = caseVhdlObject(architecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseDeclaration(component);
				if (result == null) result = caseNamed(component);
				if (result == null) result = caseVhdlObject(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.DESIGN_UNIT: {
				DesignUnit designUnit = (DesignUnit)theEObject;
				T result = caseDesignUnit(designUnit);
				if (result == null) result = caseVhdlObject(designUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseVhdlObject(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseModule(entity);
				if (result == null) result = caseNamed(entity);
				if (result == null) result = caseVhdlObject(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.GENERIC_MAPS: {
				GenericMaps genericMaps = (GenericMaps)theEObject;
				T result = caseGenericMaps(genericMaps);
				if (result == null) result = caseVhdlObject(genericMaps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.GENERICS: {
				Generics generics = (Generics)theEObject;
				T result = caseGenerics(generics);
				if (result == null) result = caseVhdlObject(generics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseVhdlObject(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.PACKAGE: {
				net.mlanoe.language.vhdl.Package package_ = (net.mlanoe.language.vhdl.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseModule(package_);
				if (result == null) result = caseNamed(package_);
				if (result == null) result = caseVhdlObject(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.PACKAGE_BODY: {
				PackageBody packageBody = (PackageBody)theEObject;
				T result = casePackageBody(packageBody);
				if (result == null) result = caseModule(packageBody);
				if (result == null) result = caseVhdlObject(packageBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.PORTS: {
				Ports ports = (Ports)theEObject;
				T result = casePorts(ports);
				if (result == null) result = caseVhdlObject(ports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.PORT_MAPS: {
				PortMaps portMaps = (PortMaps)theEObject;
				T result = casePortMaps(portMaps);
				if (result == null) result = caseVhdlObject(portMaps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.SIGNATURE: {
				Signature signature = (Signature)theEObject;
				T result = caseSignature(signature);
				if (result == null) result = caseVhdlObject(signature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.NAMED: {
				Named named = (Named)theEObject;
				T result = caseNamed(named);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.MULTI_NAMED: {
				MultiNamed multiNamed = (MultiNamed)theEObject;
				T result = caseMultiNamed(multiNamed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.VHDL_OBJECT: {
				VhdlObject vhdlObject = (VhdlObject)theEObject;
				T result = caseVhdlObject(vhdlObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.MULTI_NAME: {
				MultiName multiName = (MultiName)theEObject;
				T result = caseMultiName(multiName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.NAME: {
				Name name = (Name)theEObject;
				T result = caseName(name);
				if (result == null) result = caseMultiName(name);
				if (result == null) result = caseTypeReference(name);
				if (result == null) result = caseNatureReference(name);
				if (result == null) result = caseEntityReference(name);
				if (result == null) result = casePackageReference(name);
				if (result == null) result = caseComponentReference(name);
				if (result == null) result = caseConfigurationReference(name);
				if (result == null) result = caseCallReference(name);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.NAME_LIST: {
				NameList nameList = (NameList)theEObject;
				T result = caseNameList(nameList);
				if (result == null) result = caseVhdlObject(nameList);
				if (result == null) result = caseMultiName(nameList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.ENTITY_REFERENCE: {
				EntityReference entityReference = (EntityReference)theEObject;
				T result = caseEntityReference(entityReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.ENTITY_RESOLVED_REFERENCE: {
				EntityResolvedReference entityResolvedReference = (EntityResolvedReference)theEObject;
				T result = caseEntityResolvedReference(entityResolvedReference);
				if (result == null) result = caseVhdlObject(entityResolvedReference);
				if (result == null) result = caseEntityReference(entityResolvedReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.PACKAGE_REFERENCE: {
				PackageReference packageReference = (PackageReference)theEObject;
				T result = casePackageReference(packageReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.PACKAGE_RESOLVED_REFERENCE: {
				PackageResolvedReference packageResolvedReference = (PackageResolvedReference)theEObject;
				T result = casePackageResolvedReference(packageResolvedReference);
				if (result == null) result = caseVhdlObject(packageResolvedReference);
				if (result == null) result = casePackageReference(packageResolvedReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.COMPONENT_REFERENCE: {
				ComponentReference componentReference = (ComponentReference)theEObject;
				T result = caseComponentReference(componentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.COMPONENT_RESOLVED_REFERENCE: {
				ComponentResolvedReference componentResolvedReference = (ComponentResolvedReference)theEObject;
				T result = caseComponentResolvedReference(componentResolvedReference);
				if (result == null) result = caseVhdlObject(componentResolvedReference);
				if (result == null) result = caseComponentReference(componentResolvedReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.CALL_REFERENCE: {
				CallReference callReference = (CallReference)theEObject;
				T result = caseCallReference(callReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.CALL_RESOLVED_REFERENCE: {
				CallResolvedReference callResolvedReference = (CallResolvedReference)theEObject;
				T result = caseCallResolvedReference(callResolvedReference);
				if (result == null) result = caseCallReference(callResolvedReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VhdlPackage.STRING_NAMED: {
				StringNamed stringNamed = (StringNamed)theEObject;
				T result = caseStringNamed(stringNamed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitecture(Architecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignUnit(DesignUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Maps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Maps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericMaps(GenericMaps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerics(Generics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(net.mlanoe.language.vhdl.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageBody(PackageBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorts(Ports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Maps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Maps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortMaps(PortMaps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignature(Signature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiNamed(MultiNamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVhdlObject(VhdlObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiName(MultiName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseName(Name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameList(NameList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityReference(EntityReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Resolved Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Resolved Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityResolvedReference(EntityResolvedReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageReference(PackageReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Resolved Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Resolved Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageResolvedReference(PackageResolvedReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentReference(ComponentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Resolved Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Resolved Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentResolvedReference(ComponentResolvedReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallReference(CallReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Resolved Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Resolved Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallResolvedReference(CallResolvedReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringNamed(StringNamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNatureReference(NatureReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationReference(ConfigurationReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VhdlSwitch
