package org.gpr4j.api.test;


import java.io.IOException;

import org.gpr4j.api.GprLoader;
import org.gpr4j.grammar.GprLexer;
import org.gpr4j.grammar.GprParser;

public class GprGrammarFixture {

	public GprLexer lexer;
	public GprParser parser;
	public GprLoader loader;

	public GprGrammarFixture(String testString, boolean forceVariableDefinition) {
		try {
			this.loader = new GprLoaderStub(forceVariableDefinition);
			this.lexer = GprGrammarTestUtils.CreateLexer(testString);
			this.parser = GprGrammarTestUtils.CreateParser(this.lexer,
					this.loader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public GprGrammarFixture(String testString) {
		try {
			this.loader = new GprLoaderStub(true);
			this.lexer = GprGrammarTestUtils.CreateLexer(testString);
			this.parser = GprGrammarTestUtils.CreateParser(this.lexer,
					this.loader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
