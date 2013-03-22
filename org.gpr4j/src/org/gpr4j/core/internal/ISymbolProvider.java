package org.gpr4j.core.internal;

import org.gpr4j.core.Symbol;

public interface ISymbolProvider {

	public boolean isDefined(String name);

	public Symbol get(String name);

}
