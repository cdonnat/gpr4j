package org.gpr4j.internal.delegates;

import org.gpr4j.internal.model.IUnit;
import org.gpr4j.internal.model.Item;

public interface IProviderDelegate <I extends Item>{
	
	abstract boolean isDefined(IUnit provider, String name);

	abstract I get(IUnit provider, String name);
}