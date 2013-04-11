package org.gpr4j.internal.model;

import org.gpr4j.api.Symbol;
import org.gpr4j.api.Type;

/**
 * Provides unit services. An unit can be a project or a package. The scope of
 * an unit is the unit and the unit referenced by this unit.
 * 
 */
public interface IUnit {

	/**
	 * Return whether a variable is defined in the scope unit or not.
	 * 
	 * @param name
	 *            Variable qualified name.
	 * 
	 * @return True if the variable is defined.
	 */
	public abstract boolean variableIsDefined(String name);

	/**
	 * Return whether an attribute is defined in the scope of the unit.
	 * 
	 * @param name
	 *            Attribute name.
	 * @return True if the attribute is defined.
	 */
	public abstract boolean attributeIsDefined(String name);

	/**
	 * Return whether an attribute is defined in the scope of the unit.
	 * 
	 * @param name
	 *            Attribute name.
	 * @return True if the attribute is defined.
	 */
	public abstract boolean typeIsDefined(String name);

	/**
	 * @pre The variable is defined in the scope of the unit.
	 * @param name
	 *            Name of the variable.
	 * @return The variable name is returned.
	 */
	public abstract Symbol getVariable(String name);

	/**
	 * @pre The attribute is defined in the scope of the unit.
	 * @param name
	 *            Name of the attribute.
	 * @return The attribute name is returned.
	 */
	public abstract Symbol getAttribute(String name);

	/**
	 * @pre The type is defined in the scope of the unit.
	 * @param name
	 *            Name of the type.
	 * @return The type name is returned.
	 */
	public abstract Type getType(String name);
}
