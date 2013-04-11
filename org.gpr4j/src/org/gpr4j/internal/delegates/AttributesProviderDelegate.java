package org.gpr4j.internal.delegates;

import org.gpr4j.api.Symbol;
import org.gpr4j.internal.model.IUnit;

public class AttributesProviderDelegate implements IProviderDelegate<Symbol> {

	@Override
	public boolean isDefined(IUnit provider, String name) {
		return provider.attributeIsDefined(name);
	}

	@Override
	public Symbol get(IUnit provider, String name) {
		return provider.getAttribute(name);
	}
}