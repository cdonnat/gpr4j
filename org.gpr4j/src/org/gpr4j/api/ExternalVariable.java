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
		this.defaultValue = defaultValue == null ? "" : defaultValue.toLowerCase();
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
	 * @pre External variable is typed.
	 * @return The type of the external variable.
	 */
	public Type getType() {
		Preconditions.checkState(this.isTyped());
		return this.type;
	}

	/**
	 * 
	 * @return True if the external variable is typed;
	 */
	public boolean isTyped() {
		return this.type != null;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;

		if (!(o instanceof ExternalVariable))
			return false;

		ExternalVariable var = (ExternalVariable) o;
		boolean areEqual = this.getName().equals(var.getName())
				&& this.getDefaultValue().equals(var.getDefaultValue())
				&& this.isTyped() == var.isTyped();
		if (this.isTyped()) {
			areEqual = areEqual && this.getType().equals(var.getType());
		}

		return areEqual;
	}

	@Override
	public int hashCode() {
		return this.getName().hashCode() + this.getDefaultValue().hashCode()
				+ (this.isTyped() ? this.type.hashCode() : 0);
	}
}
