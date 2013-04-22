package org.gpr4j.internal.model;

import org.gpr4j.api.Symbol;
import org.gpr4j.api.Type;

import com.google.common.base.Preconditions;

/**
 * Environment of gpr4j. This class contains all the external variable defined
 * and allows to set them to a specific value.
 * 
 */
public class Environment {

	private ItemTable<Symbol> externalVariables;

	/**
	 * Default constructor.
	 */
	public Environment() {
		this.externalVariables = new ItemTable<>();
	}

	/**
	 * Add an external variable.
	 * 
	 * @param name
	 *            Name of the external variable to add.
	 * @param defaultValue
	 * @param type
	 */
	public void addExternalVariable(String name, String defaultValue, Type type) {
		if (!this.externalVariables.isDefined(name)) {
			this.externalVariables.add(new Symbol(name, Term.CreateString(defaultValue), type));
		}
	}

	/**
	 * Provides whether a external variable is defined or not.
	 * 
	 * @param varName
	 *            Name of the external variable.
	 * @return True if the external variable is defined in the environment.
	 */
	public boolean isDefined(String varName) {
		return this.externalVariables.isDefined(varName);
	}

	/**
	 * Set the value of an external variable.
	 * 
	 * @param varName
	 *            Name of the external variable to set.
	 * 
	 * @param value
	 *            Value to set.
	 */
	public void setExternalVariable(String varName, String value) {
		this.externalVariables.add(new Symbol(varName, Term.CreateString(value)));
	}

	/**
	 * Provides the external variable required.
	 * 
	 * @param varName
	 *            Name of the external variable.
	 * @return The external variable.
	 */
	public Symbol getExternalVariable(String varName) {
		Preconditions.checkArgument(this.isDefined(varName));
		return this.externalVariables.get(varName);
	}

}
