package org.gpr4j.core.internal;

import org.gpr4j.core.Symbol;

class AttributesProviderDelegate implements IProviderDelegate {
	@Override
	public boolean isDefined(IUnit provider, String name) {
		return provider.attributeIsDefined(name);
	}

	@Override
	public Symbol get(IUnit provider, String name) {
		return provider.getAttribute(name);
	}
}