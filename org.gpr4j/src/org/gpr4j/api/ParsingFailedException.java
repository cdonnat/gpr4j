package org.gpr4j.api;

/**
 * This class defines an exception that is thrown whenever parsing is failed.
 * 
 * @author RS
 * 
 */
public class ParsingFailedException extends RuntimeException {

	private static final long serialVersionUID = -3170126685531104547L;

	public ParsingFailedException(String message) {
		super(message);
	}
}
