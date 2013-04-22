package org.gpr4j.api;


import com.google.common.base.Preconditions;

public class ExternalVariable extends Item {

	private String defaultValue;
	private Type type;

	/**
	 * @pre name != null
	 * @param name
	 *            Name of the external variable.
	 * @param defaultValue
	 *            Default value or null if none.
	 * @param type
	 *            Variable type if the variable is typed, null otherwise.
	 */
	public ExternalVariable(String name, String defaultValue, Type type) {
		super(name);
		this.defaultValue = defaultValue == null ? "" : defaultValue;
		this.type = type;
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
	 * 
	 * @return The type of the external variable.
	 */
	public Type getType() {
		Preconditions.checkState(this.isTyped());
		return this.type;
	}

	public boolean isTyped() {		
		return this.type != null;
	}
}
