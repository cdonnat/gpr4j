package org.gpr4j.api;

import java.util.List;

/**
 * Environment services of gpr4j. This interface provides access to all the
 * external variable defined and allows to set them to a specific value.
 * 
 */
public interface IEnvironment {

	/**
	 * Set the value of an external variable.
	 * 
	 * @pre The external variable is defined.
	 * 
	 * @param varName
	 *            Name of the external variable to set.
	 * 
	 * @param value
	 *            Value to set.
	 */
	public void setExternalVariable(String varName, String value);

	/**
	 * Provides whether a external variable is defined or not.
	 * 
	 * @param varName
	 *            Name of the external variable.
	 * @return True if the external variable is defined in the environment.
	 */
	public boolean isDefined(String varName);

	/**
	 * Provides the external variable required.
	 * 
	 * @pre The external variable is defined.
	 * 
	 * @param varName
	 *            Name of the external variable.
	 * @return The external variable.
	 */
	public ExternalVariable getExternalVariable(String varName);

	/**
	 * Provides the list of all external variables.
	 * 
	 * @return The list of all external variables.
	 */
	public List<ExternalVariable> getExternalVariables();
}
