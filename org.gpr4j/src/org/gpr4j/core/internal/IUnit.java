package org.gpr4j.core.internal;

import org.gpr4j.core.Symbol;

/**
 * Provides unit services. An unit can be a project or a package.
 * 
 */
public interface IUnit {

	public abstract boolean variableIsDefined(String name);

	public abstract boolean attributeIsDefined(String name);

	public abstract boolean typeIsDefined(String name);

	public abstract Symbol getVariable(String name);

	public abstract Symbol getAttribute(String name);

	public abstract Symbol getType(String name);
}
