package org.gpr4j.internal.model;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.gpr4j.api.ExternalVariable;
import org.gpr4j.api.IProjectUnit;
import org.gpr4j.api.Item;
import org.gpr4j.api.Symbol;
import org.gpr4j.api.Type;
import org.gpr4j.internal.delegates.AttributesProviderDelegate;
import org.gpr4j.internal.delegates.IProviderDelegate;
import org.gpr4j.internal.delegates.TypesProviderDelegate;
import org.gpr4j.internal.delegates.VariablesProviderDelegate;
import org.gpr4j.internal.utilities.KeyStringMap;
import org.gpr4j.internal.utilities.StringUtilities;

import com.google.common.base.Preconditions;

/**
 * Represents a project unit of a Gpr file.
 * 
 */
public class ProjectUnit implements IProjectUnit {

	private String name;
	private Path pathToGpr;
	private PackageUnit selfPackage;
	private PackageUnit currentPackage;
	private KeyStringMap<PackageUnit> packages;
	private KeyStringMap<ProjectUnit> references;

	/**
	 * Constructors
	 * 
	 * @param name
	 *            Name of the project.
	 */
	public ProjectUnit(Path pathToGpr) {
		this.pathToGpr = pathToGpr;
		String fileName = pathToGpr.getFileName().toString();
		String[] tab = fileName.split("\\.");
		this.name = tab[0].toLowerCase();
		this.selfPackage = new PackageUnit("self");
		this.packages = new KeyStringMap<PackageUnit>();
		this.references = new KeyStringMap<ProjectUnit>();
		this.currentPackage = this.selfPackage;
		this.addDefaultAttribute();
	}

	/**
	 * Add the default attribute to project ("name", "project_dir, etc).
	 */
	private void addDefaultAttribute() {
		this.addAttribute(new Symbol("name", Term.CreateString(this.name), null));
		this.addAttribute(new Symbol("project_dir", Term.CreateString(this.pathToGpr.getParent()
				.toString()), null));
	}

	// Queries:

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Path getPath() {
		return this.pathToGpr;
	}

	@Override
	public List<IProjectUnit> getReferenceProjects() {
		return new ArrayList<IProjectUnit>(this.references.values());
	}

	@Override
	public boolean variableIsDefined(String varName) {
		return this.isDefined(varName, new VariablesProviderDelegate());
	}

	@Override
	public boolean attributeIsDefined(String attributeName) {
		return this.isDefined(FormatAttribute(attributeName), new AttributesProviderDelegate());
	}

	@Override
	public boolean typeIsDefined(String typeName) {
		return this.isDefined(typeName, new TypesProviderDelegate());
	}

	@Override
	public Symbol getVariable(String varName) {
		Preconditions.checkArgument(this.variableIsDefined(varName));
		return (Symbol) this.get(varName, new VariablesProviderDelegate());
	}

	@Override
	public Symbol getAttribute(String attributeName) {
		Preconditions.checkArgument(this.attributeIsDefined(attributeName));
		return (Symbol) this.get(FormatAttribute(attributeName), new AttributesProviderDelegate());
	}

	@Override
	public Type getType(String typeName) {
		Preconditions.checkArgument(this.typeIsDefined(typeName));
		return (Type) this.get(FormatAttribute(typeName), new TypesProviderDelegate());
	}

	// Commands:

	/**
	 * Add a variable to the context.
	 * 
	 * @param varName
	 *            Name of the variable to add.
	 * @param varValue
	 *            Value of the variable to add.
	 */
	public void addVariable(Symbol variable) {
		this.currentPackage.addVariable(variable);
	}

	/**
	 * Add an attribute to the context
	 * 
	 * @param attributeName
	 *            Attribute to add.
	 */
	public void addAttribute(Symbol attribute) {
		this.currentPackage.addAttribute(attribute);
	}

	/**
	 * Add a type to the context
	 * 
	 * @param type
	 *            Type to add.
	 */
	public void addType(Type type) {
		this.currentPackage.addType(type);
	}

	/**
	 * Add a reference project to the project. The project will have the
	 * visibility on the symbols defined in the referenced projects.
	 * 
	 * @param reference
	 *            Reference context to add.
	 */
	public void addReferenceProject(ProjectUnit referenceProject) {
		this.references.put(referenceProject.getName(), referenceProject);
	}

	public void addExternalVariable(ExternalVariable var) {
		this.currentPackage.addExternalVariable(var);
	}

	public Set<ExternalVariable> getExternalVariables() {
		Set<ExternalVariable> res = new HashSet<>();

		res.addAll(this.selfPackage.getExternalVariables());
		for (PackageUnit tmp : this.packages) {
			res.addAll(tmp.getExternalVariables());
		}
		for (ProjectUnit tmp : this.references) {
			res.addAll(tmp.getExternalVariables());
		}

		return res;
	}

	/**
	 * Notify the project that a begin package instruction has been found. A new
	 * package is create and it is set to the current package.
	 * 
	 * @param packageName
	 *            Name of the package.
	 */
	public void beginPackage(String packageName) {
		PackageUnit newPackage = new PackageUnit(packageName);
		this.packages.put(newPackage.getName(), newPackage);
		this.currentPackage = newPackage;
	}

	/**
	 * Current package is set to self package.
	 */
	public void endPackage() {
		this.currentPackage = this.selfPackage;
	}

	/**
	 * Add a new package to the current project based on another package.
	 * 
	 * @param newPackageName
	 *            Name of the package to be added.
	 * @param projectName
	 *            Name of the project containing the package to copy.
	 * @param packageName
	 *            Name of the package to copy.
	 */
	public void addPackageFrom(String newPackageName, String projectName, String packageName) {
		Preconditions.checkState(this.references.contains(projectName));
		Preconditions.checkState(this.references.get(projectName).packages.contains(packageName));

		PackageUnit newPackage = new PackageUnit(newPackageName,
				this.references.get(projectName).packages.get(packageName));
		this.packages.put(newPackageName, newPackage);
	}

	/**
	 * Return the prefix of the given name.
	 * 
	 * @param fullName
	 *            Full name.
	 * @return Prefix of the fullName or fullName is no prefix is found.
	 */
	private static String GetPrefix(String fullName) {
		String[] fullNameAsList = fullName.split("\\.", 2);
		return fullNameAsList[0];
	}

	/**
	 * Return the fullName without the prefix.
	 * 
	 * @param fullName
	 *            Full name.
	 * @pre There is a prefix.
	 * @return The full name without the prefix.
	 */
	private static String GetNameWithoutPrefix(String fullName) {
		Preconditions.checkArgument(!GetPrefix(fullName).isEmpty());
		String[] fullNameAsList = fullName.split("\\.", 2);
		return StringUtilities.Join(fullNameAsList, 1, fullNameAsList.length - 1);
	}

	private boolean isDefined(String symbolName, IProviderDelegate<? extends Item> delegate) {
		String prefix = GetPrefix(symbolName);
		String nameWithoutPrefix = GetNameWithoutPrefix(symbolName);
		boolean isDefined = delegate.isDefined(this.currentPackage, symbolName);

		if (!isDefined) {
			isDefined = delegate.isDefined(this.selfPackage, symbolName);
		}

		if (!isDefined && this.references.contains(prefix)) {
			IUnit referenceProvider = this.references.get(prefix);
			isDefined = delegate.isDefined(referenceProvider, nameWithoutPrefix);
		}

		if (!isDefined && this.packages.contains(prefix)) {
			IUnit packageProvider = this.packages.get(prefix);
			isDefined = delegate.isDefined(packageProvider, nameWithoutPrefix);
		}
		return isDefined;
	}

	private Item get(String symbolName, IProviderDelegate<? extends Item> delegate) {
		Item res = null;
		boolean isDefined = delegate.isDefined(this.currentPackage, symbolName);
		if (isDefined) {
			res = delegate.get(this.currentPackage, symbolName);
		} else if (delegate.isDefined(this.selfPackage, symbolName)) {
			res = delegate.get(this.selfPackage, symbolName);
		} else if (this.references.contains(GetPrefix(symbolName))) {
			IUnit referenceProvider = this.references.get(GetPrefix(symbolName));
			res = delegate.get(referenceProvider, GetNameWithoutPrefix(symbolName));
		} else {
			IUnit packageProvider = this.packages.get(GetPrefix(symbolName));
			res = delegate.get(packageProvider, GetNameWithoutPrefix(symbolName));
		}
		return res;
	}

	private static String FormatAttribute(String attributeName) {
		return attributeName.replace('\'', '.');
	}
}
