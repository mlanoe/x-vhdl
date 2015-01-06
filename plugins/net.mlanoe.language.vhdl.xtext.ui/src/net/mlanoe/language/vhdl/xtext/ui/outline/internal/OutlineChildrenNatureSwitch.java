/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

import java.util.Collections;

import net.mlanoe.language.vhdl.nature.ArrayNatureDefinition;
import net.mlanoe.language.vhdl.nature.ConstrainedArrayNatureDefinition;
import net.mlanoe.language.vhdl.nature.RecordNatureDefinition;
import net.mlanoe.language.vhdl.nature.RecordNatureElement;
import net.mlanoe.language.vhdl.nature.ScalarNatureDefinition;
import net.mlanoe.language.vhdl.nature.UnconstrainedArrayNatureDefinition;
import net.mlanoe.language.vhdl.nature.util.NatureSwitch;

import org.eclipse.emf.ecore.EObject;

/**
 * Outline children for classes declared into the 'nature' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineChildrenNatureSwitch extends
		NatureSwitch<Iterable<? extends EObject>> {

	@Override
	public Iterable<? extends EObject> caseArrayNatureDefinition(
			ArrayNatureDefinition object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseConstrainedArrayNatureDefinition(
			ConstrainedArrayNatureDefinition object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseRecordNatureDefinition(
			RecordNatureDefinition object) {
		return object.getRecord();
	}

	@Override
	public Iterable<? extends EObject> caseRecordNatureElement(
			RecordNatureElement object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseScalarNatureDefinition(
			ScalarNatureDefinition object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseUnconstrainedArrayNatureDefinition(
			UnconstrainedArrayNatureDefinition object) {
		return object.getIndex();
	}

}
