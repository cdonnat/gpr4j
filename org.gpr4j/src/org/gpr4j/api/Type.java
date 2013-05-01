package org.gpr4j.api;

import java.util.Set;

import com.google.common.base.Preconditions;

public class Type extends Item {

	private Set<String> values;

	/**
	 * @pre values is not null and values is not empty.
	 * @param name
	 *            Name of the type.
	 * @param values
	 *            Possible values.
	 */
	public Type(String name, Set<String> values) {
		super(name);
		Preconditions.checkArgument(values != null && !values.isEmpty());
		this.values = values;
	}

	/**
	 * 
	 * @return The list of type values.
	 */
	public Set<String> getValues() {
		return this.values;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;

		if (!(o instanceof Type))
			return false;

		Type t = (Type) o;
		return this.getName().equals(t.getName()) && this.values.equals(t.values);
	}
	
	@Override
	public int hashCode() {
		return this.getName().hashCode() + this.values.hashCode();
	}
}
