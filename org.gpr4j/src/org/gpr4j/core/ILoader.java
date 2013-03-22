package org.gpr4j.core;

import java.nio.file.Path;
import java.util.List;

import org.antlr.runtime.RecognitionException;

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
	 * Provides the list of loaded projects.
	 * 
	 * @return The list of last loaded project or a null list if load has not
	 *         been called.
	 */
	public List<IProjectUnit> getLoadedProjects();
}
