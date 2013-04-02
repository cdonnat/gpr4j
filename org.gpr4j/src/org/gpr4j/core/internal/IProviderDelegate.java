package org.gpr4j.core.internal;

import org.gpr4j.core.Symbol;

interface IProviderDelegate {
	abstract boolean isDefined(IUnit provider, String name);

	abstract Symbol get(IUnit provider, String name);
}