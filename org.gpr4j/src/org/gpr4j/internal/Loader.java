package org.gpr4j.internal;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.gpr4j.api.ExternalVariable;
import org.gpr4j.api.ILoader;
import org.gpr4j.api.IProjectUnit;
import org.gpr4j.api.Symbol;
import org.gpr4j.api.Type;
import org.gpr4j.internal.grammar.GprLexer;
import org.gpr4j.internal.grammar.GprParser;
import org.gpr4j.internal.model.Environment;
import org.gpr4j.internal.model.ProjectUnit;
import org.gpr4j.internal.model.Term;

/**
 * Loads project units from a gpr file.
 * 
 */
public class Loader implements ILoader {

	private static String GPR_EXTENSION = "gpr";

	private Stack<ProjectUnit> projectsToLoad;
	private List<ProjectUnit> loadedProjects;
	private Environment environment;
	private Type currentType;
	
	public Loader() {
		this.projectsToLoad = new Stack<>();
		this.loadedProjects = new ArrayList<>();
		this.environment = new Environment();
	}

	/**
	 * Add a variable to the current project.
	 * 
	 * @param variable
	 *            Variable to add.
	 */
	public void addVariable(String varName, Term value) {
		this.getCurrentProject().addVariable(new Symbol(varName, value, this.currentType));
	}

	/**
	 * Add an attribute to the current project.
	 * 
	 * @param attribute
	 *            Attribute to add.
	 */
	public void addAttribute(String attributeName, Term value) {
		this.getCurrentProject().addAttribute(new Symbol(attributeName, value, null));
	}

	/**
	 * Return whether the variable is defined in the current project.
	 * 
	 * @param name
	 *            Name of the variable.
	 * @return True is returned if variable is defined in the current project.
	 *         False otherwise.
	 */
	public boolean variableIsDefined(String name) {
		return this.getCurrentProject().variableIsDefined(name);
	}

	/**
	 * Return variable symbol corresponding to given name in the current
	 * project.
	 * 
	 * @param name
	 *            Qualified name of the variable.
	 * @return Symbol associated to given name.
	 */
	public Symbol getVariable(String name) {
		return this.getCurrentProject().getVariable(name);
	}

	/**
	 * Return attribute symbol corresponding to given name in the current
	 * project.
	 * 
	 * @param name
	 *            Qualified name of the attribute.
	 * @return Symbol associated to given name.
	 */
	public Symbol getAttribute(String name) {
		return this.getCurrentProject().getAttribute(name);
	}

	/**
	 * Run the parser on Gpr file located at given path.
	 * 
	 * @param path
	 *            Path to the Gpr file.
	 * @throws RecognitionException
	 */
	private void parseGpr(Path path) throws RecognitionException {
		GprLexer lexer;
		try {
			lexer = new GprLexer(new ANTLRFileStream(path.toFile().getAbsolutePath()));
			GprParser parser = new GprParser(this, new CommonTokenStream(lexer));
			parser.project();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Evaluate the path of a Gpr file according to its relativeProjectPath.
	 * Evaluation is based on the path of the project in progress.
	 * 
	 * @param relativeProjectPath
	 * @return
	 */
	private Path evaluatePath(String relativeProjectPath) {
		Path referencePath = this.getCurrentProject().getPath().getParent();
		Path path = Paths.get(referencePath.toString(), relativeProjectPath).normalize();
		boolean hasExtension = path.getFileName().toString().split("\\.").length == 2;

		if (!hasExtension) {
			path = Paths.get(path.toString() + "." + GPR_EXTENSION);
		}

		return path;
	}

	/**
	 * Load the project located at pathToGpr and add it the loaded project list.
	 * 
	 * @param pathToGpr
	 *            Path to a Gpr file.
	 * @throws RecognitionException
	 */
	@Override
	public void load(Path absolutePathToGpr) throws RecognitionException {
		ProjectUnit projectToAdd = new ProjectUnit(absolutePathToGpr);
		this.projectsToLoad.push(projectToAdd);
		this.parseGpr(this.getCurrentProject().getPath());
		this.projectsToLoad.pop();
		this.loadedProjects.add(0, projectToAdd);
		if (!this.projectsToLoad.isEmpty()) {
			this.getCurrentProject().addReferenceProject(projectToAdd);
		}
	}

	/**
	 * Add a project to current project. If the project is already loaded, the
	 * parsing is not performed.
	 * 
	 * @param relativeProjectPath
	 *            Relative path to the Gpr file of the project to add.
	 */
	public void addProject(String relativeProjectPath) throws RecognitionException {
		Path projectToAddPath = evaluatePath(relativeProjectPath);

		if (this.projectIsAlreadyLoaded(projectToAddPath)) {
			ProjectUnit projectToAdd = this.getProject(projectToAddPath);
			this.getCurrentProject().addReferenceProject(projectToAdd);
		} else {
			this.load(projectToAddPath);
		}
	}

	/**
	 * 
	 * @return List of the loaded projects.
	 */
	@Override
	public List<IProjectUnit> getLoadedProjects() {
		List<IProjectUnit> loadedProjects = new ArrayList<IProjectUnit>(this.loadedProjects.size());
		for (ProjectUnit project : this.loadedProjects) {
			loadedProjects.add(project);
		}
		return loadedProjects;
	}

	/**
	 * Notify current project that a begin package has been found.
	 * 
	 * @param packageName
	 *            Name of the package.
	 */
	public void beginPackage(String packageName) {
		this.getCurrentProject().beginPackage(packageName);
	}

	/**
	 * Notify current project that an end package has been found.
	 */
	public void endPackage() {
		this.getCurrentProject().endPackage();
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
		this.getCurrentProject().addPackageFrom(newPackageName, projectName, packageName);
	}

	/**
	 * @return The project in progress.
	 */
	public ProjectUnit getCurrentProject() {
		return this.projectsToLoad.peek();
	}

	/**
	 * Return the project associated to given path in the list of the loaded
	 * project.
	 * 
	 * @param pathToGpr
	 *            Path to Gpr file.
	 * @return Project associated to given path in the list of the loaded
	 *         project or null if not found.
	 */
	private ProjectUnit getProject(Path pathToGpr) {
		ProjectUnit project = null;
		for (ProjectUnit loadedProject : this.loadedProjects) {
			if (loadedProject.getPath().toString().equalsIgnoreCase(pathToGpr.toString())) {
				project = loadedProject;
				break;
			}
		}
		return project;
	}

	/**
	 * @param pathToGpr
	 *            Path to Gpr project file.
	 * @return True if project located at given path has already been loaded.
	 *         False otherwise.
	 */
	private boolean projectIsAlreadyLoaded(Path pathToGpr) {
		return getProject(pathToGpr) != null;
	}

	/**
	 * Add a type to current project.
	 * 
	 * @param type
	 *            Type to add.
	 */
	public void addType(String typeName, List<String> values) {
		this.getCurrentProject().addType(new Type(typeName, values));
	}

	/**
	 * Set the last type parsed.
	 * 
	 * @param typeName
	 *            Name of the type.
	 */
	public void setCurrentType(String typeName) {
		if (typeName != null) {
			this.currentType = this.getCurrentProject().getType(typeName);
		} else {
			this.currentType = null;
		}
	}

	/**
	 * Add a external variable.
	 * 
	 * @param name
	 *            Name of the external variable.
	 */
	public void addExternalVariable(String name, String defaultValue) {
		this.environment.addExternalVariable(name, defaultValue, this.currentType);

	}

	@Override
	public void setExternalVariable(String varName, String value) {
		this.environment.setExternalVariable(varName, value);
	}

	public ExternalVariable getExternalVariable(String varName) {
		return this.environment.getExternalVariable(varName);
	}

	@Override
	public Environment getEnvironment() {
		return this.environment;
	}
}
