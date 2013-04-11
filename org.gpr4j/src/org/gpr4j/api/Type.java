package org.gpr4j.api;

import java.util.List;

import org.gpr4j.internal.model.Item;

import com.google.common.base.Preconditions;

public class Type extends Item {

	private List<String> values;

	/**
	 * @pre values is not null and values is not empty. 
	 * @param name
	 *            Name of the type.
	 * @param values
	 *            Possible values.
	 */
	public Type(String name, List<String> values) {
		super(name);
		Preconditions.checkArgument(values != null && !values.isEmpty());
		this.values = values;
	}

	/**
	 * 
	 * @return The list of type values.
	 */
	public List<String> getValues() {
		return this.values;
	}

}
