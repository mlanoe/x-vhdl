/**
 *
 * $Id$
 */
package net.mlanoe.language.vhdl.statement.validation;

import net.mlanoe.language.vhdl.declaration.Declaration;

import net.mlanoe.language.vhdl.statement.GenerationScheme;
import net.mlanoe.language.vhdl.statement.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link net.mlanoe.language.vhdl.statement.GenerateStatement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GenerateStatementValidator {
	boolean validate();

	boolean validateScheme(GenerationScheme value);
	boolean validateDeclaration(EList<Declaration> value);
	boolean validateStatement(EList<Statement> value);
}