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
import net.mlanoe.language.vhdl.VhdlObject;
import net.mlanoe.language.vhdl.VhdlPackage;
import net.mlanoe.language.vhdl.configuration.ConfigurationReference;
import net.mlanoe.language.vhdl.declaration.Declaration;
import net.mlanoe.language.vhdl.nature.NatureReference;
import net.mlanoe.language.vhdl.type.TypeReference;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.VhdlPackage
 * @generated
 */
public class VhdlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VhdlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VhdlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VhdlPackage.eINSTANCE;
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
	protected VhdlSwitch<Adapter> modelSwitch =
		new VhdlSwitch<Adapter>() {
			@Override
			public Adapter caseArchitecture(Architecture object) {
				return createArchitectureAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseDesignUnit(DesignUnit object) {
				return createDesignUnitAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseGenericMaps(GenericMaps object) {
				return createGenericMapsAdapter();
			}
			@Override
			public Adapter caseGenerics(Generics object) {
				return createGenericsAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter casePackage(net.mlanoe.language.vhdl.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter casePackageBody(PackageBody object) {
				return createPackageBodyAdapter();
			}
			@Override
			public Adapter casePorts(Ports object) {
				return createPortsAdapter();
			}
			@Override
			public Adapter casePortMaps(PortMaps object) {
				return createPortMapsAdapter();
			}
			@Override
			public Adapter caseSignature(Signature object) {
				return createSignatureAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseMultiNamed(MultiNamed object) {
				return createMultiNamedAdapter();
			}
			@Override
			public Adapter caseVhdlObject(VhdlObject object) {
				return createVhdlObjectAdapter();
			}
			@Override
			public Adapter caseMultiName(MultiName object) {
				return createMultiNameAdapter();
			}
			@Override
			public Adapter caseName(Name object) {
				return createNameAdapter();
			}
			@Override
			public Adapter caseNameList(NameList object) {
				return createNameListAdapter();
			}
			@Override
			public Adapter caseEntityReference(EntityReference object) {
				return createEntityReferenceAdapter();
			}
			@Override
			public Adapter caseEntityResolvedReference(EntityResolvedReference object) {
				return createEntityResolvedReferenceAdapter();
			}
			@Override
			public Adapter casePackageReference(PackageReference object) {
				return createPackageReferenceAdapter();
			}
			@Override
			public Adapter casePackageResolvedReference(PackageResolvedReference object) {
				return createPackageResolvedReferenceAdapter();
			}
			@Override
			public Adapter caseComponentReference(ComponentReference object) {
				return createComponentReferenceAdapter();
			}
			@Override
			public Adapter caseComponentResolvedReference(ComponentResolvedReference object) {
				return createComponentResolvedReferenceAdapter();
			}
			@Override
			public Adapter caseCallReference(CallReference object) {
				return createCallReferenceAdapter();
			}
			@Override
			public Adapter caseCallResolvedReference(CallResolvedReference object) {
				return createCallResolvedReferenceAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseTypeReference(TypeReference object) {
				return createTypeReferenceAdapter();
			}
			@Override
			public Adapter caseNatureReference(NatureReference object) {
				return createNatureReferenceAdapter();
			}
			@Override
			public Adapter caseConfigurationReference(ConfigurationReference object) {
				return createConfigurationReferenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.Architecture
	 * @generated
	 */
	public Adapter createArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.DesignUnit <em>Design Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.DesignUnit
	 * @generated
	 */
	public Adapter createDesignUnitAdapter() {
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
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.GenericMaps <em>Generic Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.GenericMaps
	 * @generated
	 */
	public Adapter createGenericMapsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.Generics <em>Generics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.Generics
	 * @generated
	 */
	public Adapter createGenericsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.PackageBody <em>Package Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.PackageBody
	 * @generated
	 */
	public Adapter createPackageBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.Ports <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.Ports
	 * @generated
	 */
	public Adapter createPortsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.PortMaps <em>Port Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.PortMaps
	 * @generated
	 */
	public Adapter createPortMapsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.Signature
	 * @generated
	 */
	public Adapter createSignatureAdapter() {
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
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.MultiName <em>Multi Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.MultiName
	 * @generated
	 */
	public Adapter createMultiNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.Name
	 * @generated
	 */
	public Adapter createNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.NameList <em>Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.NameList
	 * @generated
	 */
	public Adapter createNameListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.EntityReference <em>Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.EntityReference
	 * @generated
	 */
	public Adapter createEntityReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.EntityResolvedReference <em>Entity Resolved Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.EntityResolvedReference
	 * @generated
	 */
	public Adapter createEntityResolvedReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.PackageReference <em>Package Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.PackageReference
	 * @generated
	 */
	public Adapter createPackageReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.PackageResolvedReference <em>Package Resolved Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.PackageResolvedReference
	 * @generated
	 */
	public Adapter createPackageResolvedReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.ComponentReference <em>Component Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.ComponentReference
	 * @generated
	 */
	public Adapter createComponentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.ComponentResolvedReference <em>Component Resolved Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.ComponentResolvedReference
	 * @generated
	 */
	public Adapter createComponentResolvedReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.CallReference <em>Call Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.CallReference
	 * @generated
	 */
	public Adapter createCallReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.CallResolvedReference <em>Call Resolved Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.CallResolvedReference
	 * @generated
	 */
	public Adapter createCallResolvedReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.type.TypeReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.type.TypeReference
	 * @generated
	 */
	public Adapter createTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.nature.NatureReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.nature.NatureReference
	 * @generated
	 */
	public Adapter createNatureReferenceAdapter() {
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

} //VhdlAdapterFactory
