/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

import java.util.Collections;

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

import org.eclipse.emf.ecore.EObject;

/**
 * Outline children for classes declared into the 'type' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineChildrenTypeSwitch extends
		TypeSwitch<Iterable<? extends EObject>> {

	@Override
	public Iterable<? extends EObject> caseEnumerationTypeDefinition(
			EnumerationTypeDefinition object) {
		return object.getLiteral();
	}

	@Override
	public Iterable<? extends EObject> caseConstrainedArrayTypeDefinition(
			ConstrainedArrayTypeDefinition object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseUnconstrainedArrayTypeDefinition(
			UnconstrainedArrayTypeDefinition object) {
		return object.getIndex();
	}

	@Override
	public Iterable<? extends EObject> caseAccessTypeDefinition(
			AccessTypeDefinition object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseRecordTypeDefinition(
			RecordTypeDefinition object) {
		return object.getDeclaration();
	}

	@Override
	public Iterable<? extends EObject> caseArrayTypeDefinition(
			ArrayTypeDefinition object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseFileTypeDefinition(
			FileTypeDefinition object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> casePhysicalTypeDefinition(
			PhysicalTypeDefinition object) {
		return object.getSecondary();
	}

	@Override
	public Iterable<? extends EObject> casePhysicalTypeDefinitionSecondary(
			PhysicalTypeDefinitionSecondary object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseRangeTypeDefinition(
			RangeTypeDefinition object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseRecordTypeElement(
			RecordTypeElement object) {
		return Collections.emptyList();
	}

}
