package org.gpr4j.core.internal.model;

import java.util.ArrayList;
import java.util.List;

import org.gpr4j.utilities.KeyStringMap;

/**
 * Symbol of a unit.
 * 
 * 
 */
public class SymbolTable<I extends Item> implements ISymbolProvider<I> {

	private KeyStringMap<I> properties;

	/**
	 * Default constructor.
	 */
	public SymbolTable() {
		this.properties = new KeyStringMap<I>();
	}

	/**
	 * Return whether a symbol is defined.
	 * 
	 * @param name
	 *            Name of the symbol.
	 * @return True if the symbol is defined.
	 */
	@Override
	public boolean isDefined(String name) {
		return this.properties.contains(FormatName(name));
	}

	/**
	 * Add a symbol to the symbol table.
	 * 
	 * @param name
	 *            Name of the symbol.
	 * @param value
	 *            Symbol value.
	 */
	public void add(I item) {
		this.properties.put(FormatName(item.getName()), item);
	}

	/**
	 * Return the symbol value associated to a symbol.
	 * 
	 * @param name
	 *            Name of the symbol.
	 * @return Symbol value.
	 */
	@Override
	public I get(String name) {
		return this.properties.get(FormatName(name));
	}

	public List<I> getAll() {
		return new ArrayList<>(this.properties.values());
	}
	
	/**
	 * Return a formated name. Formated = lower case and no white spaces.
	 * 
	 * @param name
	 * @return A formated name.
	 */
	private static String FormatName(String name) {
		return name.replace(" ", "");
	}
}
