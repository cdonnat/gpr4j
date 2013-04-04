package org.gpr4j.core.internal.delegates;

import org.gpr4j.core.Symbol;
import org.gpr4j.core.internal.model.IUnit;

public class TypesProviderDelegate implements IProviderDelegate {
	@Override
	public boolean isDefined(IUnit provider, String name) {
		return provider.typeIsDefined(name);
	}

	@Override
	public Symbol get(IUnit provider, String name) {
		return provider.getType(name);
	}
}