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
import net.mlanoe.language.vhdl.declaration.Declaration;
import net.mlanoe.language.vhdl.declaration.DisconnectionSpecification;
import net.mlanoe.language.vhdl.declaration.EntityClass;
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
import net.mlanoe.language.vhdl.xtext.ui.outline.OutlineTextGenerator;

/**
 * Outline text for classes declared into the 'declaration' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineTextDeclarationSwitch extends DeclarationSwitch<String> {

	@Override
	public String caseTypeDeclaration(TypeDeclaration object) {
		return OutlineTextGenerator.getOutline(object.getName()) + " : "
				+ OutlineTextGenerator.getOutline(object.getIs());
	}

	@Override
	public String caseSubtypeDeclaration(SubtypeDeclaration object) {
		return OutlineTextGenerator.getOutline(object.getName()) + " : "
				+ OutlineTextGenerator.getOutline(object.getType());
	}

	@Override
	public String caseFunctionDeclaration(FunctionDeclaration object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getName()));
		builder.append('(');

		StringBuilder parameterBuilder = new StringBuilder();
		for (Declaration parameter : object.getParameter()) {
			if (parameterBuilder.length() != 0)
				parameterBuilder.append(", ");
			parameterBuilder.append(OutlineTextGenerator.getOutline(parameter));
		}

		builder.append(parameterBuilder);
		builder.append(')');
		if (object.getType() != null) {
			builder.append(" : ");
			builder.append(OutlineTextGenerator.getOutline(object.getType()));
		}
		return builder.toString();
	}

	@Override
	public String caseProcedureDeclaration(ProcedureDeclaration object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getName()));
		builder.append('(');

		StringBuilder parameterBuilder = new StringBuilder();
		for (Declaration parameter : object.getParameter()) {
			if (parameterBuilder.length() != 0)
				parameterBuilder.append(", ");
			parameterBuilder.append(OutlineTextGenerator.getOutline(parameter));
		}

		builder.append(parameterBuilder);
		builder.append(')');
		return builder.toString();
	}

	@Override
	public String caseValueDeclaration(ValueDeclaration object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getName()));
		builder.append(" : ");
		builder.append(OutlineTextGenerator.getOutline(object.getType()));
		return builder.toString();
	}

	@Override
	public String caseSubprogramBody(SubprogramBody object) {
		return "body";
	}

	@Override
	public String caseFreeQuantityDeclaration(FreeQuantityDeclaration object) {
		return OutlineTextGenerator.getOutline(object.getName()) + " : "
				+ OutlineTextGenerator.getOutline(object.getType());
	}

	@Override
	public String caseBranchQuantityDeclaration(BranchQuantityDeclaration object) {
		return OutlineTextGenerator.getOutline(object.getLeft()) + " to "
				+ OutlineTextGenerator.getOutline(object.getRight());
	}

	@Override
	public String caseSourceQuantityDeclaration(SourceQuantityDeclaration object) {
		return OutlineTextGenerator.getOutline(object.getName()) + " : "
				+ OutlineTextGenerator.getOutline(object.getType());
	}

	@Override
	public String caseLimitDeclaration(LimitDeclaration object) {
		return OutlineTextGenerator.getOutline(object.getName()) + " : "
				+ OutlineTextGenerator.getOutline(object.getType());
	}

	@Override
	public String caseSubnatureDeclaration(SubnatureDeclaration object) {
		return OutlineTextGenerator.getOutline(object.getName()) + " : "
				+ OutlineTextGenerator.getOutline(object.getNature());
	}

	@Override
	public String caseAliasDeclaration(AliasDeclaration object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getName()));
		if (object.getAlias() != null) {
			builder.append(" : ");
			builder.append(OutlineTextGenerator.getOutline(object.getAlias()));
		}
		return builder.toString();
	}

	@Override
	public String caseAttributeDeclaration(AttributeDeclaration object) {
		return OutlineTextGenerator.getOutline(object.getName()) + " : "
				+ OutlineTextGenerator.getOutline(object.getType());
	}

	@Override
	public String caseAttributeSpecification(AttributeSpecification object) {
		return OutlineTextGenerator.getOutline(object.getName()) + " of "
				+ OutlineTextGenerator.getOutline(object.getEntity()) + " : "
				+ OutlineTextGenerator.getOutline(object.getClass_());
	}

	@Override
	public String caseConfigurationSpecification(
			ConfigurationSpecification object) {
		return OutlineTextGenerator.getOutline(object.getList()) + " : "
				+ OutlineTextGenerator.getOutline(object.getComponent());
	}

	@Override
	public String caseDisconnectionSpecification(
			DisconnectionSpecification object) {
		return OutlineTextGenerator.getOutline(object.getDisconnect()) + " : "
				+ OutlineTextGenerator.getOutline(object.getType());
	}

	@Override
	public String caseFileDeclaration(FileDeclaration object) {
		return OutlineTextGenerator.getOutline(object.getName()) + " : "
				+ OutlineTextGenerator.getOutline(object.getType());
	}

	@Override
	public String caseTerminalDeclaration(TerminalDeclaration object) {
		return OutlineTextGenerator.getOutline(object.getName()) + " : "
				+ OutlineTextGenerator.getOutline(object.getNature());
	}

	@Override
	public String caseGroupDeclaration(GroupDeclaration object) {
		return OutlineTextGenerator.getOutline(object.getName()) + " : "
				+ OutlineTextGenerator.getOutline(object.getIs()) + " ("
				+ OutlineTextGenerator.getOutline(object.getMember()) + ")";
	}

	@Override
	public String caseGroupTemplateDeclaration(GroupTemplateDeclaration object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getName()));

		boolean first = true;
		for (EntityClass entityClass : object.getEntry()) {
			if (!first) {
				builder.append(", ");
			}
			first = false;
			builder.append(OutlineTextGenerator.getOutline(entityClass));
		}

		return builder.toString();
	}

	@Override
	public String caseNatureDeclaration(NatureDeclaration object) {
		return OutlineTextGenerator.getOutline(object.getName()) + " : "
				+ OutlineTextGenerator.getOutline(object.getIs());
	}

	@Override
	public String caseUseClauseDeclaration(UseClauseDeclaration object) {
		return OutlineTextGenerator.getOutline(object.getUse());
	}

}
