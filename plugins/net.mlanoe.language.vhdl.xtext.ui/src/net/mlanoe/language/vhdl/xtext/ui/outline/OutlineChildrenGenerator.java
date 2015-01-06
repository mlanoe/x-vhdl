/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline;

import java.util.Collections;

import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineChildrenAmsSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineChildrenConfigurationSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineChildrenDeclarationSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineChildrenExpressionSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineChildrenNatureSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineChildrenStatementSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineChildrenSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.internal.OutlineChildrenTypeSwitch;

import org.eclipse.emf.ecore.EObject;

/**
 * Outline children generator
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineChildrenGenerator {
	private static final OutlineChildrenSwitch SWITCH = new OutlineChildrenSwitch();
	private static final OutlineChildrenAmsSwitch AMS_SWITCH = new OutlineChildrenAmsSwitch();
	private static final OutlineChildrenConfigurationSwitch CONFIGURATION_SWITCH = new OutlineChildrenConfigurationSwitch();
	private static final OutlineChildrenDeclarationSwitch DECLARATION_SWITCH = new OutlineChildrenDeclarationSwitch();
	private static final OutlineChildrenExpressionSwitch EXPRESSION_SWITCH = new OutlineChildrenExpressionSwitch();
	private static final OutlineChildrenStatementSwitch STATEMENT_SWITCH = new OutlineChildrenStatementSwitch();
	private static final OutlineChildrenNatureSwitch NATURE_SWITCH = new OutlineChildrenNatureSwitch();
	private static final OutlineChildrenTypeSwitch TYPE_SWITCH = new OutlineChildrenTypeSwitch();

	/**
	 * Get children.
	 * 
	 * @param object
	 *            object to get children for the outline
	 * @return outline children
	 */
	public static Iterable<? extends EObject> getChildren(Object object) {
		Iterable<? extends EObject> res = null;

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
			res = Collections.emptyList();
		}
		return res;
	}
}
