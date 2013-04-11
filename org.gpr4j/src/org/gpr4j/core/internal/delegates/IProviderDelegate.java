package org.gpr4j.core.internal.delegates;

import org.gpr4j.core.internal.model.IUnit;
import org.gpr4j.core.internal.model.Item;

public interface IProviderDelegate <I extends Item>{
	
	abstract boolean isDefined(IUnit provider, String name);

	abstract I get(IUnit provider, String name);
}