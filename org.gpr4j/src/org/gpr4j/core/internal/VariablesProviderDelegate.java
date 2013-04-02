package org.gpr4j.core.internal;

import org.gpr4j.core.Symbol;

class VariablesProviderDelegate implements IProviderDelegate {
	@Override
	public boolean isDefined(IUnit provider, String name) {
		return provider.variableIsDefined(name);
	}

	@Override
	public Symbol get(IUnit provider, String name) {
		return provider.getVariable(name);
	}
}