package org.gpr4j.core.internal;

import org.gpr4j.core.Symbol;

/**
 * Symbol of a unit.
 * 
 * 
 */
public class SymbolTable implements ISymbolProvider {

	private KeyStringMap<Symbol> properties;

	/**
	 * Default constructor.
	 */
	public SymbolTable() {
		this.properties = new KeyStringMap<Symbol>();
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
	public void add(String name, Symbol value) {
		this.properties.put(FormatName(name), value);
	}

	/**
	 * Return the symbol value associated to a symbol.
	 * 
	 * @param name
	 *            Name of the symbol.
	 * @return Symbol value.
	 */
	@Override
	public Symbol get(String name) {
		// TODO Assert.isLegal(this.isDefined(name));
		return this.properties.get(FormatName(name));
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
