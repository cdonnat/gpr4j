package org.gpr4j.internal.grammar.test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.gpr4j.api.Symbol;
import org.gpr4j.internal.Loader;
import org.gpr4j.internal.grammar.ErrorLogger;
import org.gpr4j.internal.grammar.GprFileListener;
import org.gpr4j.internal.grammar.GprLexer;
import org.gpr4j.internal.grammar.GprParser;
import org.gpr4j.internal.model.Term;

public class GprGrammarFixture {

	public GprLexer lexer;
	public GprParser parser;
	public Loader loader;
	public ErrorLogger errorLogger;
	public GprFileListener gprListener;
	private ParseTreeWalker walker;

	public static GprParser CreateParser(GprLexer lexer, Loader loader)
			throws IOException {
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GprParser parser = new GprParser(tokens);

		return parser;
	}

	public static GprLexer CreateLexer(String testString) throws IOException {
		CharStream stream = new ANTLRInputStream(testString);
		GprLexer lexer = new GprLexer(stream);

		return lexer;
	}

	public static Loader CreateLoaderMock(boolean forceVariableDefinition) {
		Loader loader = mock(Loader.class);
		when(loader.variableIsDefined(anyString())).thenReturn(
				forceVariableDefinition);
		when(loader.getVariable(anyString())).thenReturn(
				new Symbol("", Term.CreateString("")));
		when(loader.getAttribute(anyString())).thenReturn(
				new Symbol("", Term.CreateString("")));
		when(loader.getExternalVariable(anyString())).thenReturn(
				new Symbol("", Term.CreateString("")));

		return loader;
	}

	public GprGrammarFixture(String testString, boolean forceVariableDefinition) {
		try {
			this.loader = CreateLoaderMock(forceVariableDefinition);
			this.lexer = CreateLexer(testString);
			this.parser = CreateParser(this.lexer, this.loader);
			this.errorLogger = new ErrorLogger();
			this.lexer.removeErrorListeners();
			this.parser.removeErrorListeners();
			this.lexer.addErrorListener(this.errorLogger);
			this.parser.addErrorListener(this.errorLogger);
			this.gprListener = new GprFileListener(this.loader);
			this.walker = new ParseTreeWalker();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public GprGrammarFixture(String testString) {
		this(testString, true);
	}

	public void walk(ParseTree parseTree) {
		this.walker.walk(this.gprListener, parseTree);
	}

}
