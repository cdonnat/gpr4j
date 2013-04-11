package org.gpr4j.api;

import org.gpr4j.internal.model.Item;
import org.gpr4j.internal.model.Term;

/**
 * A Symbol corresponds to a variable or to an attribute of a project unit.
 * 
 */
public class Symbol extends Item {

	protected Term value;
	private Type type;

	/**
	 * Create an untyped symbol.
	 * 
	 * @param name Name of the symbol.
	 * @param value Value of the symbol.
	 */
	public Symbol(String name, Term value) {
		this(name, value, null);
	}

	/**
	 * Create a symbol.
	 * 
	 * @param name Name of the symbol.
	 * @param value Value of the symbol.
	 * @param type Type of the symbol for a typed symbol or null.
	 */
	public Symbol(String name, Term value, Type type) {
		super(name);
		this.value = value;
		this.type = type;
	}

	/**
	 * 
	 * @return The value of the symbol.
	 */
	public Term getValue() {
		return this.value;
	}

	/**
	 * 
	 * @return The type of the symbol or null if none.
	 */
	public Type getType() {
		return this.type;
	}

	/**
	 * 
	 * @return True is returned if the symbol is typed.
	 */
	public boolean isTyped() {
		return this.type != null;
	}
}
