package org.gpr4j.api.test;


import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.gpr4j.api.GprLoader;
import org.gpr4j.api.Project;
import org.gpr4j.api.Symbol;

public class GprLoaderStub extends GprLoader {
	
	private boolean forceVariableDefinition;

	public GprLoaderStub(boolean forceVariableDefinition) {
		this.forceVariableDefinition = forceVariableDefinition;
	}

	@Override
	public void addVariable(String name, Symbol value) {
	}

	@Override
	public void addAttribute(String name, Symbol value) {
	}

	@Override
	public boolean variableIsDefined(String name) {
		return this.forceVariableDefinition;
	}

	@Override
	public Symbol getVariable(String name) {
		return Symbol.CreateString("");
	}

	@Override
	public Symbol getAttribute(String name) {
		return Symbol.CreateString("");
	}

	@Override
	public void load(Path pathToGpr) {

	}

	@Override
	public void addProject(String relativeProjectPath) {
	}

	@Override
	public List<Project> getLoadedProjects() {
		return new ArrayList<Project>();
	}

	@Override
	public void beginPackage(String packageName) {

	}

	@Override
	public void endPackage() {
	}

	@Override
	public Project getCurrentProject() {
		return new Project(null);
	}
	
	@Override
	public void addPackageFrom(String newPackageName, String projectName, String packageName) {
	}
}
