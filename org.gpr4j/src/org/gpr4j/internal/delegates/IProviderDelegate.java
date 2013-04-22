package org.gpr4j.internal.delegates;

import org.gpr4j.api.Item;
import org.gpr4j.internal.model.IUnit;

public interface IProviderDelegate <I extends Item>{
	
	abstract boolean isDefined(IUnit provider, String name);

	abstract I get(IUnit provider, String name);
}