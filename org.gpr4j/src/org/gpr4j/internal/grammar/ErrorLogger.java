package org.gpr4j.internal.grammar;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;

/**
 * This class is used to store errors encountered from both lexer and parsers.
 * 
 * @author rs
 * 
 */
public class ErrorLogger extends BaseErrorListener {

	private List<RecognitionException> exceptions;

	public ErrorLogger() {
		this.exceptions = new ArrayList<RecognitionException>();
		this.exceptions.clear();
	}

	public List<RecognitionException> getExceptions() {
		return exceptions;
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		this.exceptions.add(e);
	}

}
