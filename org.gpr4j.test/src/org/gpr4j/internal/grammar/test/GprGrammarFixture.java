package org.gpr4j.internal.grammar.test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.gpr4j.api.Symbol;
import org.gpr4j.internal.Loader;
import org.gpr4j.internal.grammar.GprLexer;
import org.gpr4j.internal.grammar.GprParser;
import org.gpr4j.internal.model.Term;

public class GprGrammarFixture {

	public GprLexer lexer;
	public GprParser parser;
	public Loader loader;

	public void createMock (boolean forceVariableDefinition) {
		this.loader = mock(Loader.class);
		when(this.loader.variableIsDefined(anyString())).thenReturn(forceVariableDefinition);
		when(this.loader.getVariable(anyString())).thenReturn(new Symbol("", Term.CreateString("")));
		when(this.loader.getAttribute(anyString())).thenReturn(new Symbol("",Term.CreateString("")));
		when(this.loader.getExternalVariable(anyString())).thenReturn(new Symbol("",Term.CreateString("")));
	}
	
	public GprGrammarFixture(String testString, boolean forceVariableDefinition) {
		try {
			this.createMock(forceVariableDefinition);
			this.lexer = GprGrammarTestUtils.CreateLexer(testString);
			this.parser = GprGrammarTestUtils.CreateParser(this.lexer, this.loader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public GprGrammarFixture(String testString) {
		try {
			this.createMock(true);
			this.lexer = GprGrammarTestUtils.CreateLexer(testString);
			this.parser = GprGrammarTestUtils.CreateParser(this.lexer, this.loader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
