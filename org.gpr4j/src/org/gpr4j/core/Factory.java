package org.gpr4j.core;

import org.gpr4j.core.internal.Builder;
import org.gpr4j.core.internal.Loader;

/**
 * Entry point to create gpr4j objects.
 * 
 */
public final class Factory {

	private Factory() {
	}

	/**
	 * Create a loader.
	 * 
	 * @return A new loader.
	 */
	public static ILoader CreateLoader() {
		return new Loader();
	}

	/**
	 * Create a Gpr from an IProjectUnit.
	 * 
	 * @param projectUnit
	 *            Project unit.
	 * @return A Gpr corresponding to the given IProjectUnit.
	 */
	public static Gpr CreateGpr(IProjectUnit projectUnit) {
		Builder builder = new Builder(projectUnit);
		return builder.build();
	}
}
