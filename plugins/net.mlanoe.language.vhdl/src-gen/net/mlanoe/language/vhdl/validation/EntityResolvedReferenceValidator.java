/**
 *
 * $Id$
 */
package net.mlanoe.language.vhdl.validation;

import net.mlanoe.language.vhdl.Entity;

/**
 * A sample validator interface for {@link net.mlanoe.language.vhdl.EntityResolvedReference}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EntityResolvedReferenceValidator {
	boolean validate();

	boolean validateEntity(Entity value);
}