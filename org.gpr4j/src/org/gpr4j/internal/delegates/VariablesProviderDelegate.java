package org.gpr4j.internal.delegates;

import org.gpr4j.api.Symbol;
import org.gpr4j.internal.model.IUnit;

public class VariablesProviderDelegate implements IProviderDelegate<Symbol> {
	
	@Override
	public boolean isDefined(IUnit provider, String name) {
		return provider.variableIsDefined(name);
	}

	@Override
	public Symbol get(IUnit provider, String name) {
		return provider.getVariable(name);
	}
}