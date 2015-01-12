/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

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

/**
 * Outline "isLeaf" for classes declared into the base package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineIsLeafSwitch extends VhdlSwitch<Boolean> {

	@Override
	public Boolean caseArchitecture(Architecture object) {
		return object.getDeclaration().isEmpty()
				&& object.getStatement().isEmpty();
	}

	@Override
	public Boolean caseComponent(Component object) {
		if (object.getGeneric() != null
				&& !object.getGeneric().getDeclaration().isEmpty()) {
			return false;
		}

		if (object.getPort() == null
				&& !object.getPort().getDeclaration().isEmpty()) {
			return false;
		}
		return true;
	}

	@Override
	public Boolean caseDesignUnit(DesignUnit object) {
		return object.getModule() == null;
	}

	@Override
	public Boolean caseModel(Model object) {
		for (DesignUnit design : object.getDesign()) {
			if (design.getModule() != null) {
				return false;
			}
		}

		return true;
	}

	@Override
	public Boolean caseEntity(Entity object) {
		if (object.getGeneric() != null
				&& !object.getGeneric().getDeclaration().isEmpty()) {
			return false;
		}

		if (object.getPort() != null
				&& !object.getPort().getDeclaration().isEmpty()) {
			return false;
		}

		return object.getDeclaration().isEmpty()
				&& object.getStatement().isEmpty();
	}

	@Override
	public Boolean casePackage(Package object) {
		return object.getDeclaration().isEmpty();
	}

	@Override
	public Boolean caseEntityResolvedReference(EntityResolvedReference object) {
		return true;
	}

	@Override
	public Boolean casePackageResolvedReference(PackageResolvedReference object) {
		return true;
	}

	@Override
	public Boolean caseComponentResolvedReference(
			ComponentResolvedReference object) {
		return true;
	}

	@Override
	public Boolean caseCallResolvedReference(CallResolvedReference object) {
		return true;
	}

	@Override
	public Boolean caseGenerics(Generics object) {
		return object.getDeclaration().isEmpty();
	}

	@Override
	public Boolean caseGenericMaps(GenericMaps object) {
		return object.getGeneric().isEmpty();
	}

	@Override
	public Boolean casePackageBody(PackageBody object) {
		return object.getDeclaration().isEmpty();
	}

	@Override
	public Boolean casePorts(Ports object) {
		return object.getDeclaration().isEmpty();
	}

	@Override
	public Boolean casePortMaps(PortMaps object) {
		return object.getPort().isEmpty();
	}

	@Override
	public Boolean caseSignature(Signature object) {
		return true;
	}

	@Override
	public Boolean caseNameList(NameList object) {
		return true;
	}

}
