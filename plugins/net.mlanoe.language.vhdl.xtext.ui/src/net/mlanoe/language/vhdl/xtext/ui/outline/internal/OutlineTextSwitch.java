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
public class OutlineTextSwitch extends VhdlSwitch<String> {

	@Override
	public String caseArchitecture(Architecture object) {
		return OutlineTextGenerator.getOutline(object.getName());
	}

	@Override
	public String caseComponent(Component object) {
		return OutlineTextGenerator.getOutline(object.getName());
	}

	@Override
	public String caseDesignUnit(DesignUnit object) {
		return OutlineTextGenerator.getOutline(object.getModule());
	}

	@Override
	public String caseModel(Model object) {
		return "vhdl";
	}

	@Override
	public String caseEntity(Entity object) {
		return OutlineTextGenerator.getOutline(object.getName());
	}

	@Override
	public String casePackage(Package object) {
		return OutlineTextGenerator.getOutline(object.getName());
	}

	@Override
	public String caseEntityResolvedReference(EntityResolvedReference object) {
		return OutlineTextGenerator.getOutline(object.getEntity().getName());
	}

	@Override
	public String casePackageResolvedReference(PackageResolvedReference object) {
		return OutlineTextGenerator.getOutline(object.getPackage().getName());
	}

	@Override
	public String caseComponentResolvedReference(
			ComponentResolvedReference object) {
		return OutlineTextGenerator.getOutline(object.getComponent().getName());
	}

	@Override
	public String caseCallResolvedReference(CallResolvedReference object) {
		return OutlineTextGenerator.getOutline(object.getCall().getName());
	}

	@Override
	public String caseGenerics(Generics object) {
		return "generic";
	}

	@Override
	public String caseGenericMaps(GenericMaps object) {
		return "generic map";
	}

	@Override
	public String casePackageBody(PackageBody object) {
		return OutlineTextGenerator.getOutline(object.getName());
	}

	@Override
	public String casePorts(Ports object) {
		return "port";
	}

	@Override
	public String casePortMaps(PortMaps object) {
		return "port map";
	}

	@Override
	public String caseSignature(Signature object) {
		StringBuilder builder = new StringBuilder('[');
		for (TypeReference type : object.getParameter()) {
			if (builder.length() == 0) {
				builder.append(", ");
			}
			builder.append(OutlineTextGenerator.getOutline(type));
		}
		if (object.getReturn() != null) {
			builder.append(" return ");
			builder.append(OutlineTextGenerator.getOutline(object.getReturn()));
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
			builder.append(OutlineTextGenerator.getOutline(name));
		}
		return builder.toString();
	}

}
