package org.gpr4j.api.test;


import java.util.HashMap;
import java.util.Map;

import org.gpr4j.api.IPropertiesProvider;
import org.gpr4j.api.Symbol;

public class PropertiesProviderStub implements IPropertiesProvider {

	public String name;
	public Map<String, Symbol> variables = new HashMap<String, Symbol>();
	public Map<String, Symbol> attributes = new HashMap<String, Symbol>();

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean variableIsDefined(String name) {
		return variables.containsKey(name);
	}

	@Override
	public boolean attributeIsDefined(String name) {
		return attributes.containsKey(name);
	}

	@Override
	public Symbol getVariable(String name) {
		return variables.get(name);
	}

	@Override
	public Symbol getAttribute(String name) {
		return attributes.get(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addVariable(String name, Symbol value) {
		this.variables.put(name, value);
	}

	public void addAttribute(String name, Symbol value) {
		this.attributes.put(name, value);
	}
}
