package org.gpr4j.core;

import java.util.List;

import org.gpr4j.core.internal.StringUtilities;

public class ExternalVariable {

	private String name;
	private List<String> values;

	public ExternalVariable(String name, List<String> values) {
		this.name = StringUtilities.RemoveQuotes(name);
		this.values = values;
	}

	public String getName() {
		return name;
	}

	public List<String> getValues() {
		return values;
	}
}
