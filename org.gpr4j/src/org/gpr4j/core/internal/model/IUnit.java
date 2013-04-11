package org.gpr4j.core.internal.model;

import org.gpr4j.core.Symbol;
import org.gpr4j.core.Type;

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

	public abstract Type getType(String name);
}
