package org.gpr4j.core;

import org.gpr4j.core.internal.model.Term;

public class ExternalVariable extends Symbol {

	private Term defaultValue;

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
		super(name, Term.CreateString(defaultValue), type);
		this.defaultValue = defaultValue == null ? Term.CreateString("") : this.getValue();
	}

	/**
	 * 
	 * @return The default value if specified or empty string if the default
	 *         value was not given during construction.
	 */
	public Term getDefaultValue() {
		return this.defaultValue;
	}

	/**
	 * 
	 * @param value
	 *            The new value is set to the external variable.
	 */
	public void setValue(String value) {
		this.value = Term.CreateString(value);
	}
}
