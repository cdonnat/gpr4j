package org.gpr4j.core;

import org.gpr4j.core.internal.Builder;
import org.gpr4j.core.internal.Loader;

public final class Factory {

	private Factory() {
	}

	public static ILoader CreateLoader() {
		return new Loader();
	}

	public static Gpr CreateGpr(IProjectUnit projectUnit) {
		Builder builder = new Builder(projectUnit);
		return builder.build();
	}
}
