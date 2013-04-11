package org.gpr4j.core.internal.model;

import java.util.List;

import org.gpr4j.core.ExternalVariable;
import org.gpr4j.core.IEnvironment;
import org.gpr4j.core.Type;

/**
 * Environment of gpr4j. This class contains all the external variable defined
 * and allows to set them to a specific value.
 * 
 */
public class Environment implements IEnvironment {

	private SymbolTable<ExternalVariable> externalVariables;

	/**
	 * Default constructor.
	 */
	public Environment() {
		this.externalVariables = new SymbolTable<>();
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
			this.externalVariables.add(new ExternalVariable(name, defaultValue, type));
		}
	}

	@Override
	public boolean isDefined(String varName) {
		return this.externalVariables.isDefined(varName);
	}

	@Override
	public void setExternalVariable(String varName, String value) {
		this.externalVariables.get(varName).setValue(value);
	}

	@Override
	public ExternalVariable getExternalVariable(String varName) {
		return this.externalVariables.get(varName);
	}

	@Override
	public List<ExternalVariable> getExternalVariables() {
		return this.externalVariables.getAll();
	}

}
