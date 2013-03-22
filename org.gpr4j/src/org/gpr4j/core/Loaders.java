package org.gpr4j.core;

import org.gpr4j.core.internal.Loader;

public final class Loaders {

	private Loaders() {
	}

	public static ILoader Create() {
		return new Loader();
	}
}
