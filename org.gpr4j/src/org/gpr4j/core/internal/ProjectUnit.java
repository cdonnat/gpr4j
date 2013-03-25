package org.gpr4j.core.internal;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.gpr4j.core.IProjectUnit;
import org.gpr4j.core.Symbol;

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
		this.addAttribute("name", Symbol.CreateString(this.name));
		this.addAttribute("project_dir", Symbol.CreateString(this.pathToGpr.getParent().toString()));
	}

	// Queries:

	/**
	 * @return The name of the context.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return The path to the gpr project.
	 */
	public Path getPath() {
		return this.pathToGpr;
	}

	/**
	 * 
	 * @return The list of reference projects.
	 */
	public List<IProjectUnit> getReferenceProjects() {
		return new ArrayList<IProjectUnit>(this.references.values());
	}

	/**
	 * 
	 * @param varName
	 *            Name of the variable to look for.
	 * @return True is returned if the variable is found in the project.
	 */
	public boolean variableIsDefined(String varName) {
		return this.isDefined(varName, new VariablesProviderDelegate());
	}

	/**
	 * 
	 * @param attributeName
	 *            Name of the attribute to look for
	 * @return True is returned if the attribute is defined in the project.
	 */
	public boolean attributeIsDefined(String attributeName) {
		return this.isDefined(FormatAttribute(attributeName), new AttributesProviderDelegate());
	}

	/**
	 * @pre varName is defined in the context.
	 * @param varName
	 *            Name of the variable.
	 * @return Term corresponding to the name of variable.
	 * 
	 */
	public Symbol getVariable(String varName) {
		Preconditions.checkArgument(this.variableIsDefined(varName));
		return this.get(varName, new VariablesProviderDelegate());
	}

	/**
	 * @pre attributeName is defined in the context.
	 * @param attributeName
	 *            Name of the attribute.
	 * @return Term corresponding to the name of the attribute.
	 */
	public Symbol getAttribute(String attributeName) {
		Preconditions.checkArgument(this.attributeIsDefined(attributeName));
		return this.get(FormatAttribute(attributeName), new AttributesProviderDelegate());
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
	public void addVariable(String varName, Symbol varValue) {
		this.currentPackage.addVariable(varName, varValue);
	}

	/**
	 * Add an attribute to the context
	 * 
	 * @param attributeName
	 *            Name of the attribute to add.
	 * @param attributeValue
	 *            Value of the attribute to add.
	 */
	public void addAttribute(String attributeName, Symbol attributeValue) {
		this.currentPackage.addAttribute(attributeName, attributeValue);
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
		// TODOAssert.isLegal(this.references.contains(projectName));
		// TODOAssert.isLegal(this.references.get(projectName).packages.contains(packageName));

		PackageUnit newPackage = new PackageUnit(newPackageName,
				this.references.get(projectName).packages.get(packageName));
		this.packages.put(newPackageName, newPackage);
	}

	/**
	 * Join the string element of an array
	 * 
	 * @param tab
	 *            Array containing the element to join
	 * @param from
	 *            Starting index in the array
	 * @param size
	 *            Number of element to join
	 * @pre from + size - 1 <= tab.length
	 * @return A string containing the joined element.
	 */
	private static String Join(String[] tab, int from, int size) {
		// TODOAssert.isLegal(from + size - 1 <= tab.length);
		StringBuilder res = new StringBuilder();

		for (int i = from; i < from + size; i++) {
			res.append(tab[i]);
		}
		return res.toString();
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
		return Join(fullNameAsList, 1, fullNameAsList.length - 1);
	}

	interface IProviderDelegate {
		abstract boolean isDefined(IUnit provider, String name);

		abstract Symbol get(IUnit provider, String name);
	}

	class VariablesProviderDelegate implements IProviderDelegate {
		@Override
		public boolean isDefined(IUnit provider, String name) {
			return provider.variableIsDefined(name);
		}

		@Override
		public Symbol get(IUnit provider, String name) {
			return provider.getVariable(name);
		}
	}

	class AttributesProviderDelegate implements IProviderDelegate {
		@Override
		public boolean isDefined(IUnit provider, String name) {
			return provider.attributeIsDefined(name);
		}

		@Override
		public Symbol get(IUnit provider, String name) {
			return provider.getAttribute(name);
		}
	}

	private boolean isDefined(String symbolName, IProviderDelegate delegate) {
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

	private Symbol get(String symbolName, IProviderDelegate delegate) {
		Symbol res = null;
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
