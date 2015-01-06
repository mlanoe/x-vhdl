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

import net.mlanoe.language.vhdl.declaration.AliasDeclaration;
import net.mlanoe.language.vhdl.declaration.AttributeDeclaration;
import net.mlanoe.language.vhdl.declaration.AttributeSpecification;
import net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.ConfigurationSpecification;
import net.mlanoe.language.vhdl.declaration.DisconnectionSpecification;
import net.mlanoe.language.vhdl.declaration.FileDeclaration;
import net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.FunctionDeclaration;
import net.mlanoe.language.vhdl.declaration.GroupDeclaration;
import net.mlanoe.language.vhdl.declaration.GroupTemplateDeclaration;
import net.mlanoe.language.vhdl.declaration.LimitDeclaration;
import net.mlanoe.language.vhdl.declaration.NatureDeclaration;
import net.mlanoe.language.vhdl.declaration.ProcedureDeclaration;
import net.mlanoe.language.vhdl.declaration.SourceQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.SubnatureDeclaration;
import net.mlanoe.language.vhdl.declaration.SubprogramBody;
import net.mlanoe.language.vhdl.declaration.SubtypeDeclaration;
import net.mlanoe.language.vhdl.declaration.TerminalDeclaration;
import net.mlanoe.language.vhdl.declaration.TypeDeclaration;
import net.mlanoe.language.vhdl.declaration.UseClauseDeclaration;
import net.mlanoe.language.vhdl.declaration.ValueDeclaration;
import net.mlanoe.language.vhdl.declaration.util.DeclarationSwitch;

import org.eclipse.emf.ecore.EObject;

/**
 * Outline children for classes declared into the 'declaration' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineChildrenDeclarationSwitch extends
		DeclarationSwitch<Iterable<? extends EObject>> {

	@Override
	public Iterable<? extends EObject> caseTypeDeclaration(
			TypeDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseSubtypeDeclaration(
			SubtypeDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseFunctionDeclaration(
			FunctionDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseProcedureDeclaration(
			ProcedureDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseValueDeclaration(
			ValueDeclaration object) {
		if (object.getInitial() != null) {
			return Collections.singletonList(object.getInitial());
		}
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseSubprogramBody(SubprogramBody object) {
		return object.eContents();
	}

	@Override
	public Iterable<? extends EObject> caseFreeQuantityDeclaration(
			FreeQuantityDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseBranchQuantityDeclaration(
			BranchQuantityDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseSourceQuantityDeclaration(
			SourceQuantityDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseLimitDeclaration(
			LimitDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseSubnatureDeclaration(
			SubnatureDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseAliasDeclaration(
			AliasDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseAttributeDeclaration(
			AttributeDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseAttributeSpecification(
			AttributeSpecification object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseConfigurationSpecification(
			ConfigurationSpecification object) {
		if (object.getGenericMap() != null && object.getPortMap() != null) {
			List<EObject> res = new ArrayList<EObject>();
			res.addAll(object.getGenericMap().getGeneric());
			res.addAll(object.getPortMap().getPort());
			return res;
		}

		if (object.getGenericMap() != null) {
			return object.getGenericMap().getGeneric();
		}

		if (object.getPortMap() != null) {
			return object.getPortMap().getPort();
		}

		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseDisconnectionSpecification(
			DisconnectionSpecification object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseFileDeclaration(
			FileDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseTerminalDeclaration(
			TerminalDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseGroupDeclaration(
			GroupDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseGroupTemplateDeclaration(
			GroupTemplateDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseNatureDeclaration(
			NatureDeclaration object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseUseClauseDeclaration(
			UseClauseDeclaration object) {
		return Collections.emptyList();
	}

}
