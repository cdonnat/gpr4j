package org.gpr4j.core;

import java.nio.file.Path;
import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.gpr4j.core.internal.model.Environment;

/**
 * Provides an interface to load project units.
 */
public interface ILoader {

	/**
	 * Load a list of projects.
	 * 
	 * @param absolutePathToGpr
	 *            Absolute path to the Gpr file to load.
	 */
	public void load(Path absolutePathToGpr) throws RecognitionException;

	/**
	 * Set an external variable value.
	 * 
	 * @param varName
	 *            Name of the external variable to set.
	 * @param value
	 *            Value to set.
	 */
	public void setExternalVariable(String varName, String value);

	/**
	 * Provides the list of loaded projects.
	 * 
	 * @return The list of last loaded project or a null list if load has not
	 *         been called.
	 */
	public List<IProjectUnit> getLoadedProjects();
	
	/**
	 * Provides the environment. 
	 * 
	 * @return The environment.
	 */
	public Environment getEnvironment();
}
