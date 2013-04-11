package org.gpr4j.core.internal.model;

import org.gpr4j.core.Symbol;
import org.gpr4j.core.Type;

import com.google.common.base.Preconditions;

/**
 * Represents the package unit contained in project unit.
 * 
 */
public class PackageUnit implements IUnit {

	private String name;
	private SymbolTable<Symbol> variables;
	private SymbolTable<Symbol> attributes;
	private SymbolTable<Type> types;

	/**
	 * Constructors
	 * 
	 * @param name
	 *            Name of the package.
	 */
	public PackageUnit(String name) {
		this.name = new String(name.toLowerCase());
		this.variables = new SymbolTable<Symbol>();
		this.attributes = new SymbolTable<Symbol>();
		this.types = new SymbolTable<Type>();
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

	/**
	 * 
	 * @param name
	 *            Name of the variable to look for.
	 * @return True is returned if the variable is found in the context.
	 */
	@Override
	public boolean variableIsDefined(String name) {
		return this.variables.isDefined(name);
	}

	/**
	 * 
	 * @param name
	 *            Name of the attribute to look for
	 * @return True is returned if the attribute is defined in the context.
	 */
	@Override
	public boolean attributeIsDefined(String name) {
		return this.attributes.isDefined(name);
	}

	@Override
	public boolean typeIsDefined(String name) {
		return this.types.isDefined(name);
	}

	/**
	 * @pre varName is defined in the context.
	 * @param varName
	 *            Name of the variable.
	 * @return Term corresponding to the name of variable.
	 * 
	 */
	@Override
	public Symbol getVariable(String name) {
		Preconditions.checkArgument(this.variableIsDefined(name));
		return this.variables.get(name);
	}

	/**
	 * @pre attributeName is defined in the package.
	 * @param attributeName
	 *            Name of the attribute.
	 * @return Symbol corresponding to the name of the attribute.
	 */
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
