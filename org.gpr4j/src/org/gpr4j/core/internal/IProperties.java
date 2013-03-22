package org.gpr4j.core.internal;

import org.gpr4j.core.Symbol;

public interface IProperties {

	public abstract boolean variableIsDefined(String name);

	public abstract boolean attributeIsDefined(String name);

	public abstract Symbol getVariable(String name);

	public abstract Symbol getAttribute(String name);
}
