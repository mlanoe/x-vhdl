/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline;

import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineIsLeafAmsSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineIsLeafConfigurationSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineIsLeafDeclarationSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineIsLeafExpressionSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineIsLeafNatureSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineIsLeafStatementSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineIsLeafSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineIsLeafTypeSwitch;

import org.eclipse.emf.ecore.EObject;

/**
 * Outline children generator
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineIsLeafGenerator {
	private static final OutlineIsLeafSwitch SWITCH = new OutlineIsLeafSwitch();
	private static final OutlineIsLeafAmsSwitch AMS_SWITCH = new OutlineIsLeafAmsSwitch();
	private static final OutlineIsLeafConfigurationSwitch CONFIGURATION_SWITCH = new OutlineIsLeafConfigurationSwitch();
	private static final OutlineIsLeafDeclarationSwitch DECLARATION_SWITCH = new OutlineIsLeafDeclarationSwitch();
	private static final OutlineIsLeafExpressionSwitch EXPRESSION_SWITCH = new OutlineIsLeafExpressionSwitch();
	private static final OutlineIsLeafStatementSwitch STATEMENT_SWITCH = new OutlineIsLeafStatementSwitch();
	private static final OutlineIsLeafNatureSwitch NATURE_SWITCH = new OutlineIsLeafNatureSwitch();
	private static final OutlineIsLeafTypeSwitch TYPE_SWITCH = new OutlineIsLeafTypeSwitch();

	/**
	 * is leaf ?
	 * 
	 * @param object
	 *            object to check that it a leaf or not
	 * @return true for leaf
	 */
	public static boolean isLeaf(Object object) {
		Boolean res = true;

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
