/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
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

/**
 * Outline "isLeaf" for classes declared into the 'type' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineIsLeafTypeSwitch extends TypeSwitch<Boolean> {

	@Override
	public Boolean caseEnumerationTypeDefinition(
			EnumerationTypeDefinition object) {
		return object.getLiteral().isEmpty();
	}

	@Override
	public Boolean caseConstrainedArrayTypeDefinition(
			ConstrainedArrayTypeDefinition object) {
		return true;
	}

	@Override
	public Boolean caseUnconstrainedArrayTypeDefinition(
			UnconstrainedArrayTypeDefinition object) {
		return object.getIndex().isEmpty();
	}

	@Override
	public Boolean caseAccessTypeDefinition(AccessTypeDefinition object) {
		return true;
	}

	@Override
	public Boolean caseRecordTypeDefinition(RecordTypeDefinition object) {
		return object.getDeclaration().isEmpty();
	}

	@Override
	public Boolean caseArrayTypeDefinition(ArrayTypeDefinition object) {
		return true;
	}

	@Override
	public Boolean caseFileTypeDefinition(FileTypeDefinition object) {
		return true;
	}

	@Override
	public Boolean casePhysicalTypeDefinition(PhysicalTypeDefinition object) {
		return object.getSecondary().isEmpty();
	}

	@Override
	public Boolean casePhysicalTypeDefinitionSecondary(
			PhysicalTypeDefinitionSecondary object) {
		return true;
	}

	@Override
	public Boolean caseRangeTypeDefinition(RangeTypeDefinition object) {
		return true;
	}

	@Override
	public Boolean caseRecordTypeElement(RecordTypeElement object) {
		return true;
	}

}
