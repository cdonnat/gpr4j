package org.gpr4j.api;

public interface ISymbolProvider {

	public boolean isDefined(String name);

	public Symbol get(String name);

}
