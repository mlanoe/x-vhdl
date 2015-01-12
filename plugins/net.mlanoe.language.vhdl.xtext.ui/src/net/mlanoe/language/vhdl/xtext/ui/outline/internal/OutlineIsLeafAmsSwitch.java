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

/**
 * Outline "isLeaf" for classes declared into the 'ams' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineIsLeafAmsSwitch extends AmsSwitch<Boolean> {

	@Override
	public Boolean caseQuantityAspect(QuantityAspect object) {
		return object.getTolerance() == null;
	}

	@Override
	public Boolean caseSpectrum(Spectrum object) {
		return true;
	}

	@Override
	public Boolean caseNoise(Noise object) {
		return true;
	}
}
