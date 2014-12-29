/**
 *
 * $Id$
 */
package net.mlanoe.language.vhdl.validation;

import net.mlanoe.language.vhdl.Module;
import net.mlanoe.language.vhdl.Name;

import net.mlanoe.language.vhdl.declaration.Declaration;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link net.mlanoe.language.vhdl.DesignUnit}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DesignUnitValidator {
	boolean validate();

	boolean validateLibrary(EList<String> value);
	boolean validateUse(EList<Name> value);
	boolean validateModule(Module value);

	boolean validateDeclaration(EList<Declaration> value);
}
