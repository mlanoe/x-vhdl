/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

import java.util.Collections;

import net.mlanoe.language.vhdl.ams.Noise;
import net.mlanoe.language.vhdl.ams.QuantityAspect;
import net.mlanoe.language.vhdl.ams.Spectrum;
import net.mlanoe.language.vhdl.ams.util.AmsSwitch;

import org.eclipse.emf.ecore.EObject;

/**
 * Outline children for classes declared into the 'ams' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineChildrenAmsSwitch extends
		AmsSwitch<Iterable<? extends EObject>> {

	@Override
	public Iterable<? extends EObject> caseQuantityAspect(QuantityAspect object) {
		if (object.getTolerance() != null) {
			return Collections.singletonList(object.getTolerance());
		}
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseSpectrum(Spectrum object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseNoise(Noise object) {
		return Collections.emptyList();
	}
}
