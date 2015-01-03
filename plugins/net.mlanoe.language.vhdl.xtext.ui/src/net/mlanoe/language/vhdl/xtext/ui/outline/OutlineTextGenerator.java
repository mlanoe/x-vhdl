/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline;

import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineTextAmsSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineTextConfigurationSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineTextDeclarationSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineTextExpressionSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineTextNatureSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineTextStatementSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineTextSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineTextTypeSwitch;

import org.eclipse.emf.ecore.EObject;

/**
 * Outline text generator
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineTextGenerator {
	private static final OutlineTextSwitch SWITCH = new OutlineTextSwitch();
	private static final OutlineTextAmsSwitch AMS_SWITCH = new OutlineTextAmsSwitch();
	private static final OutlineTextConfigurationSwitch CONFIGURATION_SWITCH = new OutlineTextConfigurationSwitch();
	private static final OutlineTextDeclarationSwitch DECLARATION_SWITCH = new OutlineTextDeclarationSwitch();
	private static final OutlineTextExpressionSwitch EXPRESSION_SWITCH = new OutlineTextExpressionSwitch();
	private static final OutlineTextStatementSwitch STATEMENT_SWITCH = new OutlineTextStatementSwitch();
	private static final OutlineTextNatureSwitch NATURE_SWITCH = new OutlineTextNatureSwitch();
	private static final OutlineTextTypeSwitch TYPE_SWITCH = new OutlineTextTypeSwitch();

	/**
	 * Get outline text.
	 * 
	 * @param object
	 *            object to get the outline
	 * @return outline text
	 */
	public static String getOutline(Object object) {
		String res = null;

		if (object instanceof EObject) {
			EObject eObject = (EObject) object;

			res = SWITCH.doSwitch(eObject);
			if (res == null)
				res = DECLARATION_SWITCH.doSwitch(eObject);
			if (res == null)
				res = EXPRESSION_SWITCH.doSwitch(eObject);
			if (res == null)
				res = STATEMENT_SWITCH.doSwitch(eObject);
			if (res == null)
				res = CONFIGURATION_SWITCH.doSwitch(eObject);
			if (res == null)
				res = NATURE_SWITCH.doSwitch(eObject);
			if (res == null)
				res = TYPE_SWITCH.doSwitch(eObject);
			if (res == null)
				res = AMS_SWITCH.doSwitch(eObject);
		}
		return res;
	}
}
