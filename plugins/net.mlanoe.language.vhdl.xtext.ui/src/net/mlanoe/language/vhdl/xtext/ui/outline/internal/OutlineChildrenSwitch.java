/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
import net.mlanoe.language.vhdl.NameList;
import net.mlanoe.language.vhdl.Package;
import net.mlanoe.language.vhdl.PackageBody;
import net.mlanoe.language.vhdl.PackageResolvedReference;
import net.mlanoe.language.vhdl.PortMaps;
import net.mlanoe.language.vhdl.Ports;
import net.mlanoe.language.vhdl.Signature;
import net.mlanoe.language.vhdl.util.VhdlSwitch;

import org.eclipse.emf.ecore.EObject;

/**
 * Outline children for classes declared into the base package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineChildrenSwitch extends
		VhdlSwitch<Iterable<? extends EObject>> {

	@Override
	public Iterable<? extends EObject> caseArchitecture(Architecture object) {
		if (!object.getStatement().isEmpty()) {
			List<EObject> res = new ArrayList<EObject>();

			res.addAll(object.getDeclaration());
			res.addAll(object.getStatement());

			return res;
		}

		return object.getDeclaration();
	}

	@Override
	public Iterable<? extends EObject> caseComponent(Component object) {
		if (object.getGeneric() == null && object.getPort() == null) {
			return Collections.emptyList();
		}

		if (object.getGeneric() == null) {
			return Collections.singletonList(object.getPort());
		}

		if (object.getPort() == null) {
			return Collections.singletonList(object.getGeneric());
		}

		List<EObject> res = new ArrayList<EObject>();
		res.add(object.getGeneric());
		res.add(object.getPort());
		return res;
	}

	@Override
	public Iterable<? extends EObject> caseDesignUnit(DesignUnit object) {
		if (object.getModule() == null) {
			return Collections.emptyList();
		}

		return Collections.singletonList(object.getModule());
	}

	@Override
	public Iterable<? extends EObject> caseModel(Model object) {
		List<EObject> res = new ArrayList<EObject>();
		for (DesignUnit design : object.getDesign()) {
			if (design.getModule() != null) {
				res.add(design.getModule());
			}
		}

		return res;
	}

	@Override
	public Iterable<? extends EObject> caseEntity(Entity object) {
		List<EObject> res = new ArrayList<EObject>();
		if (object.getGeneric() != null) {
			res.add(object.getGeneric());
		}

		if (object.getPort() != null) {
			res.add(object.getPort());
		}

		res.addAll(object.getDeclaration());
		res.addAll(object.getStatement());
		return res;
	}

	@Override
	public Iterable<? extends EObject> casePackage(Package object) {
		return object.getDeclaration();
	}

	@Override
	public Iterable<? extends EObject> caseEntityResolvedReference(
			EntityResolvedReference object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> casePackageResolvedReference(
			PackageResolvedReference object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseComponentResolvedReference(
			ComponentResolvedReference object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseCallResolvedReference(
			CallResolvedReference object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseGenerics(Generics object) {
		return object.getDeclaration();
	}

	@Override
	public Iterable<? extends EObject> caseGenericMaps(GenericMaps object) {
		return object.getGeneric();
	}

	@Override
	public Iterable<? extends EObject> casePackageBody(PackageBody object) {
		return object.getDeclaration();
	}

	@Override
	public Iterable<? extends EObject> casePorts(Ports object) {
		return object.getDeclaration();
	}

	@Override
	public Iterable<? extends EObject> casePortMaps(PortMaps object) {
		return object.getPort();
	}

	@Override
	public Iterable<? extends EObject> caseSignature(Signature object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseNameList(NameList object) {
		return Collections.emptyList();
	}

}
