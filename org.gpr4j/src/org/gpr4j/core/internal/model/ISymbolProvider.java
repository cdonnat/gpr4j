package org.gpr4j.core.internal.model;

import org.gpr4j.core.Symbol;

public interface ISymbolProvider {

	public boolean isDefined(String name);

	public Symbol get(String name);

}
