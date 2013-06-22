package org.gpr4j.internal.grammar.test;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.gpr4j.internal.Loader;
import org.gpr4j.internal.grammar.ErrorLogger;
import org.gpr4j.internal.grammar.GprLexer;
import org.gpr4j.internal.grammar.GprParser;
import org.gpr4j.internal.model.Term;

public class GprGrammarTestUtils {

	public static GprParser CreateParser(GprLexer lexer, Loader loader)
			throws IOException {
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GprParser parser = new GprParser(loader, tokens);

		return parser;
	}

	public static GprLexer CreateLexer(String testString) throws IOException {
		CharStream stream = new ANTLRInputStream(testString);
		GprLexer lexer = new GprLexer(stream);

		return lexer;
	}

	public static boolean NoRecognitionExceptionOccurred(GprParser parser,
			GprLexer lexer, ErrorLogger errorLogger) {
		return errorLogger.getExceptions().isEmpty();

	}

	private static boolean RunSimpleParserRuleCheck(
			SimpleParserRuleChecker checker, String input,
			boolean forceVariableDefinition) {
		GprGrammarFixture fixture = new GprGrammarFixture(input,
				forceVariableDefinition);

		return checker.isInputRecognizedByParserRule(fixture);
	}

	private static boolean RunSimpleParserRuleCheck(
			SimpleParserRuleChecker checker, String input) {
		GprGrammarFixture fixture = new GprGrammarFixture(input);

		return checker.isInputRecognizedByParserRule(fixture);
	}

	private static boolean RunStringParserRuleCheck(
			StringParserRuleChecker checker, String input, String expString) {
		GprGrammarFixture fixture = new GprGrammarFixture(input);

		return checker.isInputRecognizedByParserRule(fixture, expString);
	}

	private static boolean RunTermParserRuleCheck(
			TermParserRuleChecker checker, String input, Term expTerm) {
		GprGrammarFixture fixture = new GprGrammarFixture(input);

		return checker.isInputRecognizedByParserRule(fixture, expTerm);
	}

	public static abstract class TermParserRuleChecker {

		private boolean areSymbolsIdentical(Term left, Term right) {
			boolean areEqual;

			if (left.isAString() && right.isAString()) {
				areEqual = left.getAsString().equals(right.getAsString());
			} else {
				areEqual = !left.isAString()
						&& !right.isAString()
						&& left.getAsStringList().equals(
								right.getAsStringList());
			}

			return areEqual;
		}

		public boolean isInputRecognizedByParserRule(GprGrammarFixture fixture,
				Term expectedSymbol) {
			Term result = null;

			try {
				result = this.executeParserRule(fixture);
			} catch (RecognitionException e) {
				e.printStackTrace();
			}

			return GprGrammarTestUtils.NoRecognitionExceptionOccurred(
					fixture.parser, fixture.lexer, fixture.errorLogger)
					&& this.areSymbolsIdentical(result, expectedSymbol);
		}

		protected abstract Term executeParserRule(GprGrammarFixture fixture)
				throws RecognitionException;
	}

	public static abstract class StringParserRuleChecker {

		public boolean isInputRecognizedByParserRule(GprGrammarFixture fixture,
				String expectedString) {
			String result = null;

			try {
				result = this.executeParserRule(fixture);
			} catch (RecognitionException e) {
				e.printStackTrace();
			}

			return GprGrammarTestUtils.NoRecognitionExceptionOccurred(
					fixture.parser, fixture.lexer, fixture.errorLogger)
					&& result.equals(expectedString);
		}

		protected abstract String executeParserRule(GprGrammarFixture fixture)
				throws RecognitionException;

	}

	public static abstract class SimpleParserRuleChecker {
		public boolean isInputRecognizedByParserRule(GprGrammarFixture fixture) {
			try {
				this.executeParserRule(fixture);
			} catch (RecognitionException e) {
				e.printStackTrace();
			}

			return GprGrammarTestUtils.NoRecognitionExceptionOccurred(
					fixture.parser, fixture.lexer, fixture.errorLogger);
		}

		protected abstract void executeParserRule(GprGrammarFixture fixture)
				throws RecognitionException;
	}

	public static boolean IsNameIdentified(String inputName) {
		String result = null;
		GprGrammarFixture fixture = new GprGrammarFixture(inputName);

		try {
			result = fixture.parser.name().result;
		} catch (RecognitionException e) {

		}

		return GprGrammarTestUtils.NoRecognitionExceptionOccurred(
				fixture.parser, fixture.lexer, fixture.errorLogger)
				&& result.equals(inputName);
	}

	public static boolean IsEmptyDeclaration(String input) {
		SimpleParserRuleChecker emptyDecChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.empty_declaration();
			}
		};

		return RunSimpleParserRuleCheck(emptyDecChecker, input);
	}

	public static boolean IsExpressionIdentified(String input,
			Term expectedSymbol) {
		TermParserRuleChecker expressionChecker = new TermParserRuleChecker() {

			@Override
			protected Term executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				return fixture.parser.expression().result;
			}
		};

		return RunTermParserRuleCheck(expressionChecker, input, expectedSymbol);
	}

	public static boolean IsVariableDeclaration(String input) {
		SimpleParserRuleChecker varDecChecker = new SimpleParserRuleChecker() {

			@Override
			public void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.variable_declaration();

			}
		};

		return RunSimpleParserRuleCheck(varDecChecker, input);
	}

	public static boolean IsTypedVariableDeclaration(String input) {
		SimpleParserRuleChecker typedVariableDecChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.typed_variable_declaration();
			}
		};

		return RunSimpleParserRuleCheck(typedVariableDecChecker, input, false);
	}

	public static boolean IsStringListIdentified(String input, Term expectedTerm) {
		TermParserRuleChecker stringListChecker = new TermParserRuleChecker() {

			@Override
			protected Term executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				return fixture.parser.string_list().result;
			}
		};

		return RunTermParserRuleCheck(stringListChecker, input, expectedTerm);
	}

	public static boolean IsAttributeDeclaration(String input) {
		SimpleParserRuleChecker attributeDecChecker = new SimpleParserRuleChecker() {

			@Override
			public void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.attribute_declaration();

			}
		};

		return RunSimpleParserRuleCheck(attributeDecChecker, input);
	}

	public static boolean IsAttributeReference(String input) {
		SimpleParserRuleChecker attributeRefChecker = new SimpleParserRuleChecker() {

			@Override
			public void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.attribute_reference();

			}
		};

		return RunSimpleParserRuleCheck(attributeRefChecker, input);
	}

	public static boolean IsProjectDeclaration(String input) {
		SimpleParserRuleChecker projectDecChecker = new SimpleParserRuleChecker() {

			@Override
			public void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.project_declaration();

			}
		};

		return RunSimpleParserRuleCheck(projectDecChecker, input);
	}

	public static boolean IsSimpleProjectDeclaration(String input) {
		SimpleParserRuleChecker simpleProjectDecChecker = new SimpleParserRuleChecker() {

			@Override
			public void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.simple_project_declaration();

			}
		};

		return RunSimpleParserRuleCheck(simpleProjectDecChecker, input);
	}

	public static boolean IsExternalValue(String input) {
		SimpleParserRuleChecker externalValueChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.external_value();
			}
		};

		return RunSimpleParserRuleCheck(externalValueChecker, input);
	}

	public static boolean IsWithClause(String input) {
		SimpleParserRuleChecker withClauseChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.with_clause();
			}
		};

		return RunSimpleParserRuleCheck(withClauseChecker, input);
	}

	public static boolean IsContextClause(String input) {
		SimpleParserRuleChecker ctxtClauseChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.context_clause();
			}
		};

		return RunSimpleParserRuleCheck(ctxtClauseChecker, input);
	}

	public static boolean IsCaseStatement(String input) {
		SimpleParserRuleChecker caseStmtChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.case_statement();
			}
		};

		return RunSimpleParserRuleCheck(caseStmtChecker, input);
	}

	public static boolean IsTypedStringDeclaration(String input) {
		SimpleParserRuleChecker typedStringDecChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.typed_string_declaration();
			}
		};

		return RunSimpleParserRuleCheck(typedStringDecChecker, input);
	}

	public static boolean IsPackageDeclaration(String input) {
		SimpleParserRuleChecker packageDecChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.package_declaration();
			}
		};

		return RunSimpleParserRuleCheck(packageDecChecker, input);
	}

	public static boolean IsProject(String input) {
		SimpleParserRuleChecker projectChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.project();

			}
		};

		return RunSimpleParserRuleCheck(projectChecker, input);
	}

	public static boolean IsPathNameIdentified(String input,
			String expectedString) {
		StringParserRuleChecker pathNameChecker = new StringParserRuleChecker() {

			@Override
			protected String executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				return fixture.parser.path_name().result;
			}
		};

		return RunStringParserRuleCheck(pathNameChecker, input, expectedString);
	}

	public static boolean IsSimpleName(String input) {
		SimpleParserRuleChecker simpleNameChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.simple_name();

			}
		};

		return RunSimpleParserRuleCheck(simpleNameChecker, input);
	}

	public static boolean IsSimpleDeclarativeItem(String input) {
		SimpleParserRuleChecker simpleDecItemChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.simple_declarative_item();

			}
		};

		return RunSimpleParserRuleCheck(simpleDecItemChecker, input, false);
	}

	public static boolean IsDeclarativeItem(String input) {
		SimpleParserRuleChecker declarativeItemChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.declarative_item();

			}
		};

		return RunSimpleParserRuleCheck(declarativeItemChecker, input);
	}

	public static boolean IsDiscreteChoiceList(String input) {
		SimpleParserRuleChecker discreteChoiceChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.discrete_choice_list();

			}
		};

		return RunSimpleParserRuleCheck(discreteChoiceChecker, input, false);
	}

	public static boolean IsCaseItem(String input) {
		SimpleParserRuleChecker caseItemChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.case_item();

			}
		};

		return RunSimpleParserRuleCheck(caseItemChecker, input);
	}

	public static boolean IsPackageSpec(String input) {
		SimpleParserRuleChecker packageSpecChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.package_spec();

			}
		};

		return RunSimpleParserRuleCheck(packageSpecChecker, input, false);
	}

	public static boolean IsPackageRenaming(String input) {
		SimpleParserRuleChecker packageRenamingChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.package_renaming();

			}
		};

		return RunSimpleParserRuleCheck(packageRenamingChecker, input, false);
	}

	public static boolean IsPackageExtension(String input) {
		SimpleParserRuleChecker packageExtensionChecker = new SimpleParserRuleChecker() {

			@Override
			protected void executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				fixture.parser.package_extension();

			}
		};

		return RunSimpleParserRuleCheck(packageExtensionChecker, input, false);
	}

	public static boolean IsAttributeDesignatorIdentified(String input,
			String expString) {
		StringParserRuleChecker attDesignatorChecker = new StringParserRuleChecker() {

			@Override
			protected String executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				return fixture.parser.attribute_designator().result;
			}
		};

		return RunStringParserRuleCheck(attDesignatorChecker, input, expString);
	}

	public static boolean IsAttributePrefix(String input, String expString) {
		StringParserRuleChecker attPrefixChecker = new StringParserRuleChecker() {

			@Override
			protected String executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				return fixture.parser.attribute_prefix().result;
			}
		};

		return RunStringParserRuleCheck(attPrefixChecker, input, expString);
	}

	public static boolean IsTermIdentified(String input, Term expTerm) {
		TermParserRuleChecker termChecker = new TermParserRuleChecker() {

			@Override
			protected Term executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				return fixture.parser.expression().result;
			}
		};

		return RunTermParserRuleCheck(termChecker, input, expTerm);
	}

	public static boolean IsStringExpressionIdentified(String input,
			Term expTerm) {
		TermParserRuleChecker stringExpChecker = new TermParserRuleChecker() {

			@Override
			protected Term executeParserRule(GprGrammarFixture fixture)
					throws RecognitionException {
				return fixture.parser.string_expression().result;
			}
		};

		return RunTermParserRuleCheck(stringExpChecker, input, expTerm);
	}

}