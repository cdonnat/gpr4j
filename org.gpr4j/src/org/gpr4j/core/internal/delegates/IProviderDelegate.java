package org.gpr4j.core.internal.delegates;

import org.gpr4j.core.Symbol;
import org.gpr4j.core.internal.model.IUnit;

public interface IProviderDelegate {
	abstract boolean isDefined(IUnit provider, String name);

	abstract Symbol get(IUnit provider, String name);
}