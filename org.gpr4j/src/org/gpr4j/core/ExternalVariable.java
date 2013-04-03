package org.gpr4j.core;

import java.util.List;

import org.gpr4j.utilities.StringUtilities;

public class ExternalVariable {

	private String name;
	private String defaultValue;
	private List<String> values;

	public ExternalVariable(String name, String defaultValue, List<String> values) {
		this.name = StringUtilities.RemoveQuotes(name);
		this.defaultValue = StringUtilities.RemoveQuotes(defaultValue);
		this.values = values;
	}

	public String getName() {
		return name;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public List<String> getValues() {
		return values;
	}
}
