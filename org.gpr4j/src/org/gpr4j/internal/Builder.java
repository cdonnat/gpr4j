package org.gpr4j.internal;

import java.nio.file.Path;

import org.gpr4j.api.ExternalVariable;
import org.gpr4j.api.Gpr;
import org.gpr4j.api.IGpr;
import org.gpr4j.api.IProjectUnit;

/**
 * A Builder converts a project unit to a Gpr.
 * 
 */
public class Builder {

	private final static String EXECUTABLE_DIRECTORY_ATTRIBUTE = "Exec_Dir";
	private final static String OBJECT_DIRECTORY_ATTRIBUTE = "Object_Dir";
	private final static String MAIN_ATTRIBUTE = "Main";
	private final static String SOURCE_DIRECTORIES_ATTRIBUTE = "Source_Dirs";

	private IProjectUnit referenceProject;
	private Path referencePath;

	public Builder(IProjectUnit project) {
		this.referenceProject = project;
		this.referencePath = project.getPath();
	}

	public IGpr build() {
		Gpr res = new Gpr(this.referenceProject.getName(), this.referencePath.getParent());
		this.addSourceDirs(res);
		this.addExecDir(res);
		this.addObjectDir(res);
		this.addExecutables(res);
		this.addExternalVariables(res);
		return res;
	}

	private void addExecutables(Gpr gprProject) {
		if (this.referenceProject.attributeIsDefined(MAIN_ATTRIBUTE)) {

			gprProject.setExecutable(true);

			for (String execName : this.referenceProject.getAttribute(MAIN_ATTRIBUTE).getValue()
					.getAsStringList()) {
				gprProject.addSourceExecutableName(execName);
			}
		}
	}

	private void addObjectDir(Gpr gprProject) {
		if (this.referenceProject.attributeIsDefined(OBJECT_DIRECTORY_ATTRIBUTE)) {
			gprProject.setObjectDir(this.referenceProject.getAttribute(OBJECT_DIRECTORY_ATTRIBUTE)
					.getValue().getAsString());
		}
	}

	private void addExecDir(Gpr gprProject) {
		if (this.referenceProject.attributeIsDefined(EXECUTABLE_DIRECTORY_ATTRIBUTE)) {
			gprProject.setExecutable(true);
			gprProject.setExecutableDir(this.referenceProject
					.getAttribute(EXECUTABLE_DIRECTORY_ATTRIBUTE).getValue().getAsString());
		}
	}

	private void addSourceDirs(Gpr gprProject) {
		if (this.referenceProject.attributeIsDefined(SOURCE_DIRECTORIES_ATTRIBUTE)) {
			for (String sourceDir : this.referenceProject
					.getAttribute(SOURCE_DIRECTORIES_ATTRIBUTE).getValue().getAsStringList()) {
				gprProject.addSourceDir(sourceDir);
			}
		}
	}
	
	private void addExternalVariables(Gpr gprProject) {
		for (ExternalVariable var : this.referenceProject.getExternalVariables()) {
			gprProject.addExternalVariable (var);
		}
	}

}
