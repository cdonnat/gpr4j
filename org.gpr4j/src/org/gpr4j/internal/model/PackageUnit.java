package org.gpr4j.internal.model;

import org.gpr4j.api.Symbol;
import org.gpr4j.api.Type;

import com.google.common.base.Preconditions;

/**
 * Represents the package unit contained in project unit.
 * 
 */
public class PackageUnit implements IUnit {

	private String name;
	private ItemTable<Symbol> variables;
	private ItemTable<Symbol> attributes;
	private ItemTable<Type> types;

	/**
	 * Constructors
	 * 
	 * @param name
	 *            Name of the package.
	 */
	public PackageUnit(String name) {
		this.name = new String(name.toLowerCase());
		this.variables = new ItemTable<Symbol>();
		this.attributes = new ItemTable<Symbol>();
		this.types = new ItemTable<Type>();
	}

	/**
	 * Create a package from another package. Only the attributes properties of
	 * the package are copied.
	 * 
	 * @param name
	 *            Name of the package.
	 * @param from
	 *            Package to be copied.
	 */
	public PackageUnit(String name, PackageUnit from) {
		this(name);
		this.attributes = from.attributes;
	}

	/**
	 * @return The name of the context.
	 */
	public String getName() {
		return this.name;
	}

	@Override
	public boolean variableIsDefined(String name) {
		return this.variables.isDefined(name);
	}

	@Override
	public boolean attributeIsDefined(String name) {
		return this.attributes.isDefined(name);
	}

	@Override
	public boolean typeIsDefined(String name) {
		return this.types.isDefined(name);
	}

	@Override
	public Symbol getVariable(String name) {
		Preconditions.checkArgument(this.variableIsDefined(name));
		return this.variables.get(name);
	}

	@Override
	public Symbol getAttribute(String name) {
		Preconditions.checkArgument(this.attributeIsDefined(name));
		return this.attributes.get(name);
	}

	@Override
	public Type getType(String name) {
		Preconditions.checkArgument(this.types.isDefined(name));
		return this.types.get(name);
	}

	/**
	 * Add a variable to the package.
	 * 
	 * @param variable
	 *            Variable to add.
	 * 
	 */
	public void addVariable(Symbol variable) {
		this.variables.add(variable);
	}

	/**
	 * Add an attribute to the package.
	 * 
	 * @param attribute
	 *            Attribute to add.
	 */
	public void addAttribute(Symbol attribute) {
		this.attributes.add(attribute);
	}

	/**
	 * Add a type to the package.
	 * 
	 * @param type
	 *            Type to add.
	 */
	public void addType(Type type) {
		this.types.add(type);
	}
}
