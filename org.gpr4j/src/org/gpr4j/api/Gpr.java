package org.gpr4j.api;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import com.google.common.base.Preconditions;

/**
 * A Gpr provides a user friendly API to use project unit.
 * 
 */
public final class Gpr implements IGpr {

	private String name;
	private List<String> sourcesDir = new ArrayList<>();
	private String objectDir = null;
	private boolean isExecutable = false;
	private String execDir = null;
	private List<String> execSourceNames = new ArrayList<>(1);
	private Set<ExternalVariable> externalVariables = new HashSet<>();
	private Path rootDirPath;

	/**
	 * Create a default GPR project with given name.
	 * 
	 * @param name
	 *            GPR name
	 * @param rootDir
	 *            the absolute root directory path
	 * @pre name is not empty.
	 */
	public Gpr(String name, Path rootDir) {
		Preconditions.checkArgument(!name.isEmpty());

		this.name = name;
		this.rootDirPath = rootDir;
	}

	@Override
	public List<String> getSourcesDir() {
		return sourcesDir;
	}

	@Override
	public String getObjectDir() {
		return objectDir;
	}

	@Override
	public String getExecutableDir() {
		Preconditions.checkArgument(this.isExecutable());

		return execDir;
	}

	@Override
	public boolean isExecutable() {
		return this.isExecutable;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public List<String> getExecutableSourceNames() {
		return this.execSourceNames;
	}

	@Override
	public Path getRootDirPath() {
		return this.rootDirPath;
	}

	@Override
	public Set<ExternalVariable> getExternalVariables() {
		return this.externalVariables;
	}

	/**
	 * Add a new source directory
	 * 
	 * @param dirName
	 *            Source directory to add.
	 */
	public void addSourceDir(String dirName) {
		this.sourcesDir.add(dirName);
	}

	/**
	 * Set the new object directory.
	 * 
	 * @param objectDir
	 *            New object directory.
	 */
	public void setObjectDir(String objectDir) {
		this.objectDir = objectDir;
	}

	/**
	 * Set if the project is an executable project.
	 * 
	 * @param isExecutable
	 */
	public void setExecutable(boolean isExecutable) {
		this.isExecutable = isExecutable;
	}

	/**
	 * Add an executable to the project.
	 * 
	 * @pre GPR is an executable project.
	 * @param execName
	 */
	public void addSourceExecutableName(String execName) {
		Preconditions.checkState(this.isExecutable());

		this.execSourceNames.add(execName);
	}

	/**
	 * Set the executable directory.
	 * 
	 * @pre GPR is an executable project.
	 */
	public void setExecutableDir(String execDir) {
		Preconditions.checkState(this.isExecutable());

		this.execDir = execDir;
	}

	/**
	 * Returns the String corresponding to the list of executable names.
	 * 
	 * @pre the project is executable.
	 * 
	 * @return the String corresponding to the list of executable names under
	 *         the form ("exe1", "exe2",...)
	 */
	private String executableNamesAsString() {
		Preconditions.checkArgument(this.isExecutable());

		String listOfExecutablesAsString = "(";

		for (int exec = 0; exec < this.execSourceNames.size(); exec++) {

			listOfExecutablesAsString = listOfExecutablesAsString + "\""
					+ this.execSourceNames.get(exec) + "\"";

			if (exec != this.execSourceNames.size() - 1) {
				listOfExecutablesAsString = listOfExecutablesAsString + ", ";
			}
		}

		listOfExecutablesAsString = listOfExecutablesAsString + ")";

		return listOfExecutablesAsString;

	}

	/**
	 * Content of the GPR project is returned.
	 * 
	 * @return Content of the GPR project.
	 */
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("project " + this.getName() + " is\n");

		this.appendSourceDirsIfAny(stringBuilder);
		this.appendObjectDirIfDefined(stringBuilder);
		this.appendExecSourceNamesIfAny(stringBuilder);

		stringBuilder.append("end " + this.getName() + ";");

		return stringBuilder.toString();
	}

	private void appendExecSourceNamesIfAny(StringBuilder stringBuilder) {
		if (isExecutable) {
			if (this.getExecutableDir() != null) {
				stringBuilder.append("\tfor Exec_Dir use \"" + this.getExecutableDir() + "\";\n");
			}
			stringBuilder.append("\tfor Main use " + this.executableNamesAsString() + ";\n");
		}
	}

	private void appendObjectDirIfDefined(StringBuilder stringBuilder) {
		if (this.getObjectDir() != null) {
			stringBuilder.append("\tfor Object_Dir use \"" + this.getObjectDir() + "\";\n");
		}
	}

	private void appendSourceDirsIfAny(StringBuilder stringBuilder) {
		if (this.getSourcesDir().size() != 0) {
			stringBuilder.append("\tfor Source_Dirs use (");

			for (int i = 0; i < this.getSourcesDir().size() - 1; i++) {
				stringBuilder.append("\"" + this.getSourcesDir().get(i) + "\",\n");
			}
			stringBuilder.append("\"" + this.getSourcesDir().get(this.getSourcesDir().size() - 1)
					+ "\");\n");
		}
	}

	public void addExternalVariable(ExternalVariable var) {
		this.externalVariables.add(var);
	}

}
