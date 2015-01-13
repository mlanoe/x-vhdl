/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

import net.mlanoe.language.vhdl.nature.ArrayNatureDefinition;
import net.mlanoe.language.vhdl.nature.ConstrainedArrayNatureDefinition;
import net.mlanoe.language.vhdl.nature.RecordNatureDefinition;
import net.mlanoe.language.vhdl.nature.RecordNatureElement;
import net.mlanoe.language.vhdl.nature.ScalarNatureDefinition;
import net.mlanoe.language.vhdl.nature.UnconstrainedArrayNatureDefinition;
import net.mlanoe.language.vhdl.nature.util.NatureSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.OutlineTextGenerator;

/**
 * Outline text for classes declared into the 'nature' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineTextNatureSwitch extends NatureSwitch<Object> {

	@Override
	public Object caseArrayNatureDefinition(ArrayNatureDefinition object) {
		return OutlineTextGenerator.getText(object.getNature());
	}

	@Override
	public Object caseConstrainedArrayNatureDefinition(
			ConstrainedArrayNatureDefinition object) {
		return OutlineTextGenerator.getText(object.getNature());
	}

	@Override
	public String caseRecordNatureDefinition(RecordNatureDefinition object) {
		return "record";
	}

	@Override
	public Object caseRecordNatureElement(RecordNatureElement object) {
		return OutlineTextGenerator.getText(object.getName(),
				object.getNature());
	}

	@Override
	public Object caseScalarNatureDefinition(ScalarNatureDefinition object) {
		return OutlineTextGenerator.getText(object.getName());
	}

	@Override
	public Object caseUnconstrainedArrayNatureDefinition(
			UnconstrainedArrayNatureDefinition object) {
		return OutlineTextGenerator.getText(object.getNature());
	}

}
