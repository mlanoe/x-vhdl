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

/**
 * Outline "IsLeaf" for classes declared into the 'nature' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineIsLeafNatureSwitch extends NatureSwitch<Boolean> {

	@Override
	public Boolean caseArrayNatureDefinition(ArrayNatureDefinition object) {
		return true;
	}

	@Override
	public Boolean caseConstrainedArrayNatureDefinition(
			ConstrainedArrayNatureDefinition object) {
		return true;
	}

	@Override
	public Boolean caseRecordNatureDefinition(RecordNatureDefinition object) {
		return object.getRecord().isEmpty();
	}

	@Override
	public Boolean caseRecordNatureElement(RecordNatureElement object) {
		return true;
	}

	@Override
	public Boolean caseScalarNatureDefinition(ScalarNatureDefinition object) {
		return true;
	}

	@Override
	public Boolean caseUnconstrainedArrayNatureDefinition(
			UnconstrainedArrayNatureDefinition object) {
		return object.getIndex().isEmpty();
	}

}
