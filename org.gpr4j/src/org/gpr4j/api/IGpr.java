package org.gpr4j.api;

import java.nio.file.Path;
import java.util.List;
import java.util.Set;

/**
 * A Gpr provides a user friendly API to use project unit.
 * 
 */
public interface IGpr {

	/**
	 * Return the list of sources directory.
	 * 
	 * @return The list of sources directory.
	 */
	public List<String> getSourcesDir();

	/**
	 * Return the object directory or null if none was specified.
	 * 
	 * @return Object directory.
	 */
	public String getObjectDir();

	/**
	 * Return executable directory or null if none was specified.
	 * 
	 * @pre GPR is an executable project.
	 * @return The executable directory
	 */
	public String getExecutableDir();

	/**
	 * Return true if the GPR is an executable project, false otherwise.
	 * 
	 * @return true if the GPR is an executable project, false otherwise.
	 */
	public boolean isExecutable();

	/**
	 * The project name is returned.
	 * 
	 * @return The project name.
	 */
	public String getName();

	/**
	 * Returns the names of the executable source files of the project.
	 * 
	 * @return a list of String corresponding to the names of executable source
	 *         files.
	 */
	public List<String> getExecutableSourceNames();

	/**
	 * Returns the path to the root directory of the project.
	 * 
	 * @return a path denoting the root directory
	 */
	public Path getRootDirPath();

	/**
	 * Returns the list of the external variable impacting the Gpr.
	 * 
	 * @return The list of external variable impacting the Gpr.
	 */
	public Set<ExternalVariable> getExternalVariables();
}
