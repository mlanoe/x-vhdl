/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

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

/**
 * Outline "isLeaf" for classes declared into the 'declaration' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineIsLeafDeclarationSwitch extends DeclarationSwitch<Boolean> {

	@Override
	public Boolean caseTypeDeclaration(TypeDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseSubtypeDeclaration(SubtypeDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseFunctionDeclaration(FunctionDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseProcedureDeclaration(ProcedureDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseValueDeclaration(ValueDeclaration object) {
		return object.getInitial() == null;
	}

	@Override
	public Boolean caseSubprogramBody(SubprogramBody object) {
		return object.eContents().isEmpty();
	}

	@Override
	public Boolean caseFreeQuantityDeclaration(FreeQuantityDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseBranchQuantityDeclaration(
			BranchQuantityDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseSourceQuantityDeclaration(
			SourceQuantityDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseLimitDeclaration(LimitDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseSubnatureDeclaration(SubnatureDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseAliasDeclaration(AliasDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseAttributeDeclaration(AttributeDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseAttributeSpecification(AttributeSpecification object) {
		return true;
	}

	@Override
	public Boolean caseConfigurationSpecification(
			ConfigurationSpecification object) {
		if (object.getGenericMap() != null
				&& !object.getGenericMap().getGeneric().isEmpty()) {
			return false;
		}

		if (object.getPortMap() != null
				&& !object.getPortMap().getPort().isEmpty()) {
			return false;
		}

		return true;
	}

	@Override
	public Boolean caseDisconnectionSpecification(
			DisconnectionSpecification object) {
		return true;
	}

	@Override
	public Boolean caseFileDeclaration(FileDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseTerminalDeclaration(TerminalDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseGroupDeclaration(GroupDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseGroupTemplateDeclaration(GroupTemplateDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseNatureDeclaration(NatureDeclaration object) {
		return true;
	}

	@Override
	public Boolean caseUseClauseDeclaration(UseClauseDeclaration object) {
		return true;
	}

}
