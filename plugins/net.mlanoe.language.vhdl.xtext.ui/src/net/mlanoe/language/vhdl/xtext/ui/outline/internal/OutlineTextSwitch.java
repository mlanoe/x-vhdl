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
import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.NameList;
import net.mlanoe.language.vhdl.Package;
import net.mlanoe.language.vhdl.PackageBody;
import net.mlanoe.language.vhdl.PackageResolvedReference;
import net.mlanoe.language.vhdl.PortMaps;
import net.mlanoe.language.vhdl.Ports;
import net.mlanoe.language.vhdl.Signature;
import net.mlanoe.language.vhdl.type.TypeReference;
import net.mlanoe.language.vhdl.util.VhdlSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.OutlineTextGenerator;

/**
 * Outline text for classes declared into the base package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineTextSwitch extends VhdlSwitch<Object> {

	@Override
	public Object caseArchitecture(Architecture object) {
		return OutlineTextGenerator.getText(object.getName(), object.getOf());
	}

	@Override
	public Object caseComponent(Component object) {
		return OutlineTextGenerator.getText(object.getName(), "component");
	}

	@Override
	public Object caseDesignUnit(DesignUnit object) {
		return OutlineTextGenerator.getText(object.getModule());
	}

	@Override
	public String caseModel(Model object) {
		return object.eResource().getURI().lastSegment();
	}

	@Override
	public Object caseEntity(Entity object) {
		return OutlineTextGenerator.getText(object.getName(), "entity");
	}

	@Override
	public Object casePackage(Package object) {
		return OutlineTextGenerator.getText(object.getName());
	}

	@Override
	public Object caseEntityResolvedReference(EntityResolvedReference object) {
		return OutlineTextGenerator.getText(object.getEntity().getName());
	}

	@Override
	public Object casePackageResolvedReference(PackageResolvedReference object) {
		return OutlineTextGenerator.getText(object.getPackage().getName());
	}

	@Override
	public Object caseComponentResolvedReference(
			ComponentResolvedReference object) {
		return OutlineTextGenerator.getText(object.getComponent().getName());
	}

	@Override
	public Object caseCallResolvedReference(CallResolvedReference object) {
		return OutlineTextGenerator.getText(object.getCall().getName());
	}

	@Override
	public String caseGenerics(Generics object) {
		return "Generics";
	}

	@Override
	public String caseGenericMaps(GenericMaps object) {
		return "Generic Map";
	}

	@Override
	public Object casePackageBody(PackageBody object) {
		return OutlineTextGenerator.getText(object.getName());
	}

	@Override
	public String casePorts(Ports object) {
		return "Ports";
	}

	@Override
	public String casePortMaps(PortMaps object) {
		return "Port Map";
	}

	@Override
	public String caseSignature(Signature object) {
		StringBuilder builder = new StringBuilder('[');
		for (TypeReference type : object.getParameter()) {
			if (builder.length() == 0) {
				builder.append(", ");
			}
			builder.append(OutlineTextGenerator.getText(type));
		}
		if (object.getReturn() != null) {
			builder.append(" return ");
			builder.append(OutlineTextGenerator.getText(object.getReturn()));
		}
		builder.append(']');
		return builder.toString();
	}

	@Override
	public String caseNameList(NameList object) {
		StringBuilder builder = new StringBuilder();
		for (Name name : object.getName()) {
			if (builder.length() != 0) {
				builder.append(", ");
			}
			builder.append(OutlineTextGenerator.getText(name));
		}
		return builder.toString();
	}

}
