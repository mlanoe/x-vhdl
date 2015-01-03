/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

import net.mlanoe.language.vhdl.ams.Noise;
import net.mlanoe.language.vhdl.ams.QuantityAspect;
import net.mlanoe.language.vhdl.ams.Spectrum;
import net.mlanoe.language.vhdl.ams.util.AmsSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.OutlineTextGenerator;

/**
 * Outline text for classes declared into the 'ams' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineTextAmsSwitch extends AmsSwitch<String> {

	@Override
	public String caseQuantityAspect(QuantityAspect object) {
		return OutlineTextGenerator.getOutline(object.getName());
	}

	@Override
	public String caseSpectrum(Spectrum object) {
		return "spectrum";
	}

	@Override
	public String caseNoise(Noise object) {
		return "noise";
	}

}
