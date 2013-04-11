package org.gpr4j.core.internal.delegates;

import org.gpr4j.core.Type;
import org.gpr4j.core.internal.model.IUnit;

public class TypesProviderDelegate implements IProviderDelegate<Type> {

	@Override
	public boolean isDefined(IUnit provider, String name) {
		return provider.typeIsDefined(name);
	}

	@Override
	public Type get(IUnit provider, String name) {
		return provider.getType(name);
	}
}