package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

import net.mlanoe.language.vhdl.type.AccessTypeDefinition;
import net.mlanoe.language.vhdl.type.ArrayTypeDefinition;
import net.mlanoe.language.vhdl.type.ConstrainedArrayTypeDefinition;
import net.mlanoe.language.vhdl.type.EnumerationTypeDefinition;
import net.mlanoe.language.vhdl.type.FileTypeDefinition;
import net.mlanoe.language.vhdl.type.PhysicalTypeDefinition;
import net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary;
import net.mlanoe.language.vhdl.type.RangeTypeDefinition;
import net.mlanoe.language.vhdl.type.RecordTypeDefinition;
import net.mlanoe.language.vhdl.type.RecordTypeElement;
import net.mlanoe.language.vhdl.type.UnconstrainedArrayTypeDefinition;
import net.mlanoe.language.vhdl.type.util.TypeSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.OutlineTextGenerator;

/**
 * Outline text for classes declared into the 'type' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineTextTypeSwitch extends TypeSwitch<String> {

	@Override
	public String caseEnumerationTypeDefinition(EnumerationTypeDefinition object) {
		return "enum";
	}

	@Override
	public String caseConstrainedArrayTypeDefinition(
			ConstrainedArrayTypeDefinition object) {
		return "array of " + OutlineTextGenerator.getOutline(object.getType());
	}

	@Override
	public String caseUnconstrainedArrayTypeDefinition(
			UnconstrainedArrayTypeDefinition object) {
		return "array of " + OutlineTextGenerator.getOutline(object.getType());
	}

	@Override
	public String caseAccessTypeDefinition(AccessTypeDefinition object) {
		return "access of " + OutlineTextGenerator.getOutline(object.getType());
	}

	@Override
	public String caseRecordTypeDefinition(RecordTypeDefinition object) {
		return "record";
	}

	@Override
	public String caseArrayTypeDefinition(ArrayTypeDefinition object) {
		return "array of " + OutlineTextGenerator.getOutline(object.getType());
	}

	@Override
	public String caseFileTypeDefinition(FileTypeDefinition object) {
		return "file of " + OutlineTextGenerator.getOutline(object.getType());
	}

	@Override
	public String casePhysicalTypeDefinition(PhysicalTypeDefinition object) {
		return object.getPrimary();
	}

	@Override
	public String casePhysicalTypeDefinitionSecondary(
			PhysicalTypeDefinitionSecondary object) {
		return object.getName() + " of " + object.getOf();
	}

	@Override
	public String caseRangeTypeDefinition(RangeTypeDefinition object) {
		switch (object.getDirection()) {
		case DOWNTO:
			return "downto";
		case TO:
			return "to";
		}
		return null;
	}

	@Override
	public String caseRecordTypeElement(RecordTypeElement object) {
		return OutlineTextGenerator.getOutline(object.getName()) + " : "
				+ OutlineTextGenerator.getOutline(object.getType());

	}

}
