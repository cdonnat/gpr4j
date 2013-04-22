package org.gpr4j.internal.model;

import java.util.HashSet;
import java.util.Set;

import org.gpr4j.api.ExternalVariable;
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
	private Set<ExternalVariable> externalVariables;

	/**
	 * Constructors
	 * 
	 * @param name
	 *            Name of the package.
	 */
	public PackageUnit(String name) {
		this.name = new String(name.toLowerCase());
		this.variables = new ItemTable<>();
		this.attributes = new ItemTable<>();
		this.types = new ItemTable<>();
		this.externalVariables = new HashSet<>();
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

	@Override
	public Set<ExternalVariable> getExternalVariables() {
		return this.externalVariables;
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

	/**
	 * Add an external variable to the package.
	 * 
	 * @param externalVariable
	 *            External variable to add.
	 */
	public void addExternalVariable(ExternalVariable externalVariable) {
		this.externalVariables.add(externalVariable);
	}
}
