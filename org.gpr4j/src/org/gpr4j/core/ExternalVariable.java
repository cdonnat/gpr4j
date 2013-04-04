package org.gpr4j.core;

import java.util.List;

import org.gpr4j.utilities.StringUtilities;

import com.google.common.base.Preconditions;

public class ExternalVariable {

	private String name;
	private String defaultValue;
	private List<String> typeValues;

	/**
	 * @pre name != null && (typeValues == null || !typeValues.isEmpty())
	 * @param name
	 *            Name of the external variable.
	 * @param defaultValue
	 *            Default value or null if none.
	 * @param typeValues
	 *            Variable type values if the variable is typed, null otherwise.
	 */
	public ExternalVariable(String name, String defaultValue, List<String> typeValues) {
		Preconditions.checkArgument(name != null);
		Preconditions.checkArgument(typeValues == null || !typeValues.isEmpty());
		this.name = StringUtilities.RemoveQuotes(name);
		this.defaultValue = defaultValue == null ? "" : StringUtilities.RemoveQuotes(defaultValue);
		this.typeValues = typeValues;
	}

	/**
	 * 
	 * @return True if the external variable is typed.
	 */
	public boolean isTyped() {
		return this.typeValues != null;
	}

	/**
	 * 
	 * @return Return the name of the external variable.
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return The default value if specified or empty string if the default
	 *         value was not given during construction.
	 */
	public String getDefaultValue() {
		return this.defaultValue;
	}

	/**
	 * @pre The external variable is typed.
	 * @return The type of the variable.
	 */
	public List<String> getTypeValues() {
		Preconditions.checkState(this.isTyped());
		return typeValues;
	}
}
