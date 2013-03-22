package org.gpr4j.core;

import java.nio.file.Path;

import org.gpr4j.core.internal.IProperties;

/**
 * A IProject is the representation of a basic representation of a Gpr project
 * file.
 * 
 */
public interface IProject extends IProperties {

	/**
	 * Provides the name of the project.
	 * 
	 * @return Name of the project.
	 */
	public abstract String getName();

	/**
	 * Provides the absolute path to the Gpr file represented.
	 * 
	 * @return Absolute path to the Gpr file.
	 */
	public abstract Path getPath();

	/**
	 * Test if a variable is defined in the project.
	 * 
	 * @param name
	 *            Qualified name of the variable.
	 * @return True if the variable is defined in the scope of the project.
	 *         False otherwise.
	 */
	public abstract boolean variableIsDefined(String name);

	/**
	 * Test if an attribute is defined in the project.
	 * 
	 * @param name
	 *            Qualified name of the attribute.
	 * @return True if the attribute is defined for the project. False
	 *         otherwise.
	 */
	public abstract boolean attributeIsDefined(String name);

	/**
	 * Provides Symbol corresponding to the given variable name.
	 * 
	 * @pre Variable must be defined (see variableIsDefined)
	 * @param name
	 *            Qualified name of the variable.
	 * @return Symbol corresponding to the given variable.
	 */
	public abstract Symbol getVariable(String name);

	/**
	 * Provides Symbol corresponding to the given attribute name.
	 * 
	 * @pre Attribute must be defined (see attributeIsDefined)
	 * @param name
	 *            Qualified name of the variable.
	 * @return Symbol corresponding to the given variable.
	 */
	public abstract Symbol getAttribute(String name);
}
