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
import org.eclipse.jface.viewers.StyledString;

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
	public static Object getText(Object object) {
		Object res = null;

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
		} else {
			res = object;
		}
		return res;
	}

	/**
	 * Get outline text.
	 * 
	 * @param left
	 *            left part of the outline
	 * @param right
	 *            right part of the outline
	 * @return outline text
	 */
	public static Object getText(Object left, Object right) {
		Object l = getText(left);
		Object r = getText(right);

		StyledString res = new StyledString();
		if (l instanceof StyledString) {
			res.append((StyledString) l);
		} else {
			res.append(l.toString());
		}

		res.append(" : ", StyledString.DECORATIONS_STYLER);
		if (r instanceof StyledString) {
			res.append((StyledString) r);
		} else {
			res.append(r.toString(), StyledString.DECORATIONS_STYLER);
		}

		return res;
	}
}
