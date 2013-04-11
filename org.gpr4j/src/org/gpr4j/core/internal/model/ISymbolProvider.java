package org.gpr4j.core.internal.model;


public interface ISymbolProvider<I extends Item> {

	public boolean isDefined(String name);

	public I get(String name);

}
