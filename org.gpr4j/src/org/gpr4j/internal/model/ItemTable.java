package org.gpr4j.internal.model;

import java.util.ArrayList;
import java.util.List;

import org.gpr4j.api.Item;
import org.gpr4j.internal.utilities.KeyStringMap;

/**
 * Item table.
 * 
 * 
 */
public class ItemTable<I extends Item> {

	private KeyStringMap<I> properties;

	/**
	 * Default constructor.
	 */
	public ItemTable() {
		this.properties = new KeyStringMap<I>();
	}

	/**
	 * Return whether an item is defined.
	 * 
	 * @param name
	 *            Name of the item.
	 * @return True if the item is defined.
	 */
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
	 * Return the item value associated to a item.
	 * 
	 * @param name
	 *            Name of the item.
	 * @return Item value.
	 */
	public I get(String name) {
		return this.properties.get(FormatName(name));
	}

	/**
	 * Return the list of all items.
	 * 
	 * @return The list of all items.
	 */
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
