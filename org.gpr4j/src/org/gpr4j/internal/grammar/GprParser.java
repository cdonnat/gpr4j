// Generated from org.gpr4j\src\org\gpr4j\internal\grammar\Gpr.g4 by ANTLR 4.5
package org.gpr4j.internal.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, STRING_LITERAL=2, COMMA=3, SEMI_COLON=4, DOT=5, LPAR=6, RPAR=7, 
		RARROW=8, PIPE=9, COLON=10, AFFECTATION_SIGN=11, AMPERSAND=12, APOSTROPHE=13, 
		ALL=14, AT=15, CASE=16, END=17, FOR=18, IS=19, LIMITED=20, NULL=21, OTHERS=22, 
		PACKAGE=23, PROJECT=24, RENAMES=25, TYPE=26, USE=27, WHEN=28, WITH=29, 
		EXTENDS=30, EXTERNAL=31, IDENTIFIER=32, WS=33;
	public static final int
		RULE_project = 0, RULE_context_clause = 1, RULE_with_clause = 2, RULE_path_name = 3, 
		RULE_project_declaration = 4, RULE_simple_project_declaration = 5, RULE_name = 6, 
		RULE_simple_name = 7, RULE_declarative_item = 8, RULE_simple_declarative_item = 9, 
		RULE_typed_string_declaration = 10, RULE_case_statement = 11, RULE_case_item = 12, 
		RULE_discrete_choice_list = 13, RULE_package_declaration = 14, RULE_package_spec = 15, 
		RULE_package_renaming = 16, RULE_package_extension = 17, RULE_typed_variable_declaration = 18, 
		RULE_attribute_declaration = 19, RULE_attribute_designator = 20, RULE_attribute_reference = 21, 
		RULE_attribute_prefix = 22, RULE_external_value = 23, RULE_variable_declaration = 24, 
		RULE_expression = 25, RULE_term = 26, RULE_string_expression = 27, RULE_string_list = 28, 
		RULE_empty_declaration = 29;
	public static final String[] ruleNames = {
		"project", "context_clause", "with_clause", "path_name", "project_declaration", 
		"simple_project_declaration", "name", "simple_name", "declarative_item", 
		"simple_declarative_item", "typed_string_declaration", "case_statement", 
		"case_item", "discrete_choice_list", "package_declaration", "package_spec", 
		"package_renaming", "package_extension", "typed_variable_declaration", 
		"attribute_declaration", "attribute_designator", "attribute_reference", 
		"attribute_prefix", "external_value", "variable_declaration", "expression", 
		"term", "string_expression", "string_list", "empty_declaration"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "','", "';'", "'.'", "'('", "')'", "'=>'", "'|'", "':'", 
		"':='", "'&'", "'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "STRING_LITERAL", "COMMA", "SEMI_COLON", "DOT", "LPAR", 
		"RPAR", "RARROW", "PIPE", "COLON", "AFFECTATION_SIGN", "AMPERSAND", "APOSTROPHE", 
		"ALL", "AT", "CASE", "END", "FOR", "IS", "LIMITED", "NULL", "OTHERS", 
		"PACKAGE", "PROJECT", "RENAMES", "TYPE", "USE", "WHEN", "WITH", "EXTENDS", 
		"EXTERNAL", "IDENTIFIER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProjectContext extends ParserRuleContext {
		public Context_clauseContext context_clause() {
			return getRuleContext(Context_clauseContext.class,0);
		}
		public Project_declarationContext project_declaration() {
			return getRuleContext(Project_declarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GprParser.EOF, 0); }
		public ProjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterProject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitProject(this);
		}
	}

	public final ProjectContext project() throws RecognitionException {
		ProjectContext _localctx = new ProjectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_project);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			context_clause();
			setState(61);
			project_declaration();
			setState(62);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_clauseContext extends ParserRuleContext {
		public List<With_clauseContext> with_clause() {
			return getRuleContexts(With_clauseContext.class);
		}
		public With_clauseContext with_clause(int i) {
			return getRuleContext(With_clauseContext.class,i);
		}
		public Context_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterContext_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitContext_clause(this);
		}
	}

	public final Context_clauseContext context_clause() throws RecognitionException {
		Context_clauseContext _localctx = new Context_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_context_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH) {
				{
				{
				setState(64);
				with_clause();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_clauseContext extends ParserRuleContext {
		public Path_nameContext first_path;
		public Path_nameContext other_path;
		public TerminalNode WITH() { return getToken(GprParser.WITH, 0); }
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public List<Path_nameContext> path_name() {
			return getRuleContexts(Path_nameContext.class);
		}
		public Path_nameContext path_name(int i) {
			return getRuleContext(Path_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GprParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitWith_clause(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(WITH);
			setState(71);
			((With_clauseContext)_localctx).first_path = path_name();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(72);
				match(COMMA);
				setState(73);
				((With_clauseContext)_localctx).other_path = path_name();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_nameContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(GprParser.STRING_LITERAL, 0); }
		public Path_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterPath_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitPath_name(this);
		}
	}

	public final Path_nameContext path_name() throws RecognitionException {
		Path_nameContext _localctx = new Path_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_path_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Project_declarationContext extends ParserRuleContext {
		public Simple_project_declarationContext simple_project_declaration() {
			return getRuleContext(Simple_project_declarationContext.class,0);
		}
		public Project_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterProject_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitProject_declaration(this);
		}
	}

	public final Project_declarationContext project_declaration() throws RecognitionException {
		Project_declarationContext _localctx = new Project_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_project_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			simple_project_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_project_declarationContext extends ParserRuleContext {
		public NameContext begin_project_name;
		public NameContext end_project_name;
		public TerminalNode PROJECT() { return getToken(GprParser.PROJECT, 0); }
		public TerminalNode IS() { return getToken(GprParser.IS, 0); }
		public TerminalNode END() { return getToken(GprParser.END, 0); }
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Declarative_itemContext> declarative_item() {
			return getRuleContexts(Declarative_itemContext.class);
		}
		public Declarative_itemContext declarative_item(int i) {
			return getRuleContext(Declarative_itemContext.class,i);
		}
		public Simple_project_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_project_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterSimple_project_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitSimple_project_declaration(this);
		}
	}

	public final Simple_project_declarationContext simple_project_declaration() throws RecognitionException {
		Simple_project_declarationContext _localctx = new Simple_project_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_project_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(PROJECT);
			setState(86);
			((Simple_project_declarationContext)_localctx).begin_project_name = name();
			setState(87);
			match(IS);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << FOR) | (1L << NULL) | (1L << PACKAGE) | (1L << TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(88);
				declarative_item();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(END);
			setState(95);
			((Simple_project_declarationContext)_localctx).end_project_name = name();
			setState(96);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Simple_nameContext first;
		public Simple_nameContext other;
		public List<Simple_nameContext> simple_name() {
			return getRuleContexts(Simple_nameContext.class);
		}
		public Simple_nameContext simple_name(int i) {
			return getRuleContext(Simple_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(GprParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GprParser.DOT, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((NameContext)_localctx).first = simple_name();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(99);
				match(DOT);
				setState(100);
				((NameContext)_localctx).other = simple_name();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GprParser.IDENTIFIER, 0); }
		public Simple_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterSimple_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitSimple_name(this);
		}
	}

	public final Simple_nameContext simple_name() throws RecognitionException {
		Simple_nameContext _localctx = new Simple_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarative_itemContext extends ParserRuleContext {
		public Simple_declarative_itemContext simple_declarative_item() {
			return getRuleContext(Simple_declarative_itemContext.class,0);
		}
		public Typed_string_declarationContext typed_string_declaration() {
			return getRuleContext(Typed_string_declarationContext.class,0);
		}
		public Package_declarationContext package_declaration() {
			return getRuleContext(Package_declarationContext.class,0);
		}
		public Declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterDeclarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitDeclarative_item(this);
		}
	}

	public final Declarative_itemContext declarative_item() throws RecognitionException {
		Declarative_itemContext _localctx = new Declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarative_item);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case CASE:
			case FOR:
			case NULL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				simple_declarative_item();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				typed_string_declaration();
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				package_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_declarative_itemContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Typed_variable_declarationContext typed_variable_declaration() {
			return getRuleContext(Typed_variable_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public Empty_declarationContext empty_declaration() {
			return getRuleContext(Empty_declarationContext.class,0);
		}
		public Simple_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterSimple_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitSimple_declarative_item(this);
		}
	}

	public final Simple_declarative_itemContext simple_declarative_item() throws RecognitionException {
		Simple_declarative_itemContext _localctx = new Simple_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simple_declarative_item);
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				typed_variable_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				attribute_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				case_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				empty_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typed_string_declarationContext extends ParserRuleContext {
		public Token first;
		public Token other;
		public TerminalNode TYPE() { return getToken(GprParser.TYPE, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode IS() { return getToken(GprParser.IS, 0); }
		public TerminalNode LPAR() { return getToken(GprParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(GprParser.RPAR, 0); }
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(GprParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(GprParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GprParser.COMMA, i);
		}
		public Typed_string_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_string_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterTyped_string_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitTyped_string_declaration(this);
		}
	}

	public final Typed_string_declarationContext typed_string_declaration() throws RecognitionException {
		Typed_string_declarationContext _localctx = new Typed_string_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typed_string_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(TYPE);
			setState(121);
			simple_name();
			setState(122);
			match(IS);
			setState(123);
			match(LPAR);
			setState(124);
			((Typed_string_declarationContext)_localctx).first = match(STRING_LITERAL);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(125);
				match(COMMA);
				setState(126);
				((Typed_string_declarationContext)_localctx).other = match(STRING_LITERAL);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(RPAR);
			setState(133);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_statementContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(GprParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(GprParser.CASE, i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode IS() { return getToken(GprParser.IS, 0); }
		public TerminalNode END() { return getToken(GprParser.END, 0); }
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public List<Case_itemContext> case_item() {
			return getRuleContexts(Case_itemContext.class);
		}
		public Case_itemContext case_item(int i) {
			return getRuleContext(Case_itemContext.class,i);
		}
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitCase_statement(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(CASE);
			setState(136);
			name();
			setState(137);
			match(IS);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(138);
				case_item();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(END);
			setState(145);
			match(CASE);
			setState(146);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_itemContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(GprParser.WHEN, 0); }
		public Discrete_choice_listContext discrete_choice_list() {
			return getRuleContext(Discrete_choice_listContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(GprParser.RARROW, 0); }
		public List<Case_statementContext> case_statement() {
			return getRuleContexts(Case_statementContext.class);
		}
		public Case_statementContext case_statement(int i) {
			return getRuleContext(Case_statementContext.class,i);
		}
		public List<Attribute_declarationContext> attribute_declaration() {
			return getRuleContexts(Attribute_declarationContext.class);
		}
		public Attribute_declarationContext attribute_declaration(int i) {
			return getRuleContext(Attribute_declarationContext.class,i);
		}
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<Empty_declarationContext> empty_declaration() {
			return getRuleContexts(Empty_declarationContext.class);
		}
		public Empty_declarationContext empty_declaration(int i) {
			return getRuleContext(Empty_declarationContext.class,i);
		}
		public Case_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterCase_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitCase_item(this);
		}
	}

	public final Case_itemContext case_item() throws RecognitionException {
		Case_itemContext _localctx = new Case_itemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_case_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(WHEN);
			setState(149);
			discrete_choice_list();
			setState(150);
			match(RARROW);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << FOR) | (1L << NULL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(155);
				switch (_input.LA(1)) {
				case CASE:
					{
					setState(151);
					case_statement();
					}
					break;
				case FOR:
					{
					setState(152);
					attribute_declaration();
					}
					break;
				case IDENTIFIER:
					{
					setState(153);
					variable_declaration();
					}
					break;
				case NULL:
					{
					setState(154);
					empty_declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Discrete_choice_listContext extends ParserRuleContext {
		public Token first;
		public Token other;
		public List<TerminalNode> STRING_LITERAL() { return getTokens(GprParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(GprParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> PIPE() { return getTokens(GprParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(GprParser.PIPE, i);
		}
		public TerminalNode OTHERS() { return getToken(GprParser.OTHERS, 0); }
		public Discrete_choice_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discrete_choice_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterDiscrete_choice_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitDiscrete_choice_list(this);
		}
	}

	public final Discrete_choice_listContext discrete_choice_list() throws RecognitionException {
		Discrete_choice_listContext _localctx = new Discrete_choice_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_discrete_choice_list);
		int _la;
		try {
			setState(169);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				((Discrete_choice_listContext)_localctx).first = match(STRING_LITERAL);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(161);
					match(PIPE);
					setState(162);
					((Discrete_choice_listContext)_localctx).other = match(STRING_LITERAL);
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OTHERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(OTHERS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_declarationContext extends ParserRuleContext {
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
		}
		public Package_renamingContext package_renaming() {
			return getRuleContext(Package_renamingContext.class,0);
		}
		public Package_extensionContext package_extension() {
			return getRuleContext(Package_extensionContext.class,0);
		}
		public Package_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterPackage_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitPackage_declaration(this);
		}
	}

	public final Package_declarationContext package_declaration() throws RecognitionException {
		Package_declarationContext _localctx = new Package_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_package_declaration);
		try {
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				package_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				package_renaming();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				package_extension();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_specContext extends ParserRuleContext {
		public Simple_nameContext begin_package_name;
		public Simple_nameContext end_package_name;
		public TerminalNode PACKAGE() { return getToken(GprParser.PACKAGE, 0); }
		public TerminalNode IS() { return getToken(GprParser.IS, 0); }
		public TerminalNode END() { return getToken(GprParser.END, 0); }
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public List<Simple_nameContext> simple_name() {
			return getRuleContexts(Simple_nameContext.class);
		}
		public Simple_nameContext simple_name(int i) {
			return getRuleContext(Simple_nameContext.class,i);
		}
		public List<Simple_declarative_itemContext> simple_declarative_item() {
			return getRuleContexts(Simple_declarative_itemContext.class);
		}
		public Simple_declarative_itemContext simple_declarative_item(int i) {
			return getRuleContext(Simple_declarative_itemContext.class,i);
		}
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterPackage_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitPackage_spec(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_package_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(PACKAGE);
			setState(177);
			((Package_specContext)_localctx).begin_package_name = simple_name();
			setState(178);
			match(IS);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << FOR) | (1L << NULL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(179);
				simple_declarative_item();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(END);
			setState(186);
			((Package_specContext)_localctx).end_package_name = simple_name();
			setState(187);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_renamingContext extends ParserRuleContext {
		public Simple_nameContext newPackageName;
		public Simple_nameContext projectName;
		public Simple_nameContext renamedPackage;
		public TerminalNode PACKAGE() { return getToken(GprParser.PACKAGE, 0); }
		public TerminalNode RENAMES() { return getToken(GprParser.RENAMES, 0); }
		public TerminalNode DOT() { return getToken(GprParser.DOT, 0); }
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public List<Simple_nameContext> simple_name() {
			return getRuleContexts(Simple_nameContext.class);
		}
		public Simple_nameContext simple_name(int i) {
			return getRuleContext(Simple_nameContext.class,i);
		}
		public Package_renamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_renaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterPackage_renaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitPackage_renaming(this);
		}
	}

	public final Package_renamingContext package_renaming() throws RecognitionException {
		Package_renamingContext _localctx = new Package_renamingContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_package_renaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(PACKAGE);
			setState(190);
			((Package_renamingContext)_localctx).newPackageName = simple_name();
			setState(191);
			match(RENAMES);
			setState(192);
			((Package_renamingContext)_localctx).projectName = simple_name();
			setState(193);
			match(DOT);
			setState(194);
			((Package_renamingContext)_localctx).renamedPackage = simple_name();
			setState(195);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_extensionContext extends ParserRuleContext {
		public Simple_nameContext begin_package_name;
		public Simple_nameContext projectName;
		public Simple_nameContext extendedPackage;
		public Simple_nameContext end_package_name;
		public TerminalNode PACKAGE() { return getToken(GprParser.PACKAGE, 0); }
		public TerminalNode EXTENDS() { return getToken(GprParser.EXTENDS, 0); }
		public TerminalNode DOT() { return getToken(GprParser.DOT, 0); }
		public TerminalNode IS() { return getToken(GprParser.IS, 0); }
		public TerminalNode END() { return getToken(GprParser.END, 0); }
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public List<Simple_nameContext> simple_name() {
			return getRuleContexts(Simple_nameContext.class);
		}
		public Simple_nameContext simple_name(int i) {
			return getRuleContext(Simple_nameContext.class,i);
		}
		public List<Simple_declarative_itemContext> simple_declarative_item() {
			return getRuleContexts(Simple_declarative_itemContext.class);
		}
		public Simple_declarative_itemContext simple_declarative_item(int i) {
			return getRuleContext(Simple_declarative_itemContext.class,i);
		}
		public Package_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterPackage_extension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitPackage_extension(this);
		}
	}

	public final Package_extensionContext package_extension() throws RecognitionException {
		Package_extensionContext _localctx = new Package_extensionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_package_extension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(PACKAGE);
			setState(198);
			((Package_extensionContext)_localctx).begin_package_name = simple_name();
			setState(199);
			match(EXTENDS);
			setState(200);
			((Package_extensionContext)_localctx).projectName = simple_name();
			setState(201);
			match(DOT);
			setState(202);
			((Package_extensionContext)_localctx).extendedPackage = simple_name();
			setState(203);
			match(IS);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << FOR) | (1L << NULL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(204);
				simple_declarative_item();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(END);
			setState(211);
			((Package_extensionContext)_localctx).end_package_name = simple_name();
			setState(212);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typed_variable_declarationContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GprParser.COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode AFFECTATION_SIGN() { return getToken(GprParser.AFFECTATION_SIGN, 0); }
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public Typed_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterTyped_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitTyped_variable_declaration(this);
		}
	}

	public final Typed_variable_declarationContext typed_variable_declaration() throws RecognitionException {
		Typed_variable_declarationContext _localctx = new Typed_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typed_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			simple_name();
			setState(215);
			match(COLON);
			setState(216);
			name();
			setState(217);
			match(AFFECTATION_SIGN);
			setState(218);
			string_expression();
			setState(219);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_declarationContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GprParser.FOR, 0); }
		public Attribute_designatorContext attribute_designator() {
			return getRuleContext(Attribute_designatorContext.class,0);
		}
		public TerminalNode USE() { return getToken(GprParser.USE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public Attribute_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterAttribute_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitAttribute_declaration(this);
		}
	}

	public final Attribute_declarationContext attribute_declaration() throws RecognitionException {
		Attribute_declarationContext _localctx = new Attribute_declarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attribute_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(FOR);
			setState(222);
			attribute_designator();
			setState(223);
			match(USE);
			setState(224);
			expression();
			setState(225);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_designatorContext extends ParserRuleContext {
		public Simple_nameContext att;
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(GprParser.LPAR, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(GprParser.STRING_LITERAL, 0); }
		public TerminalNode RPAR() { return getToken(GprParser.RPAR, 0); }
		public Attribute_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterAttribute_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitAttribute_designator(this);
		}
	}

	public final Attribute_designatorContext attribute_designator() throws RecognitionException {
		Attribute_designatorContext _localctx = new Attribute_designatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_attribute_designator);
		try {
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				((Attribute_designatorContext)_localctx).att = simple_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				((Attribute_designatorContext)_localctx).att = simple_name();
				{
				setState(229);
				match(LPAR);
				setState(230);
				match(STRING_LITERAL);
				setState(231);
				match(RPAR);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_referenceContext extends ParserRuleContext {
		public Attribute_prefixContext attribute_prefix() {
			return getRuleContext(Attribute_prefixContext.class,0);
		}
		public TerminalNode APOSTROPHE() { return getToken(GprParser.APOSTROPHE, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(GprParser.LPAR, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(GprParser.STRING_LITERAL, 0); }
		public TerminalNode RPAR() { return getToken(GprParser.RPAR, 0); }
		public Attribute_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterAttribute_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitAttribute_reference(this);
		}
	}

	public final Attribute_referenceContext attribute_reference() throws RecognitionException {
		Attribute_referenceContext _localctx = new Attribute_referenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attribute_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			attribute_prefix();
			setState(236);
			match(APOSTROPHE);
			setState(237);
			simple_name();
			setState(241);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(238);
				match(LPAR);
				setState(239);
				match(STRING_LITERAL);
				setState(240);
				match(RPAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_prefixContext extends ParserRuleContext {
		public Simple_nameContext project_name;
		public Simple_nameContext package_name;
		public TerminalNode PROJECT() { return getToken(GprParser.PROJECT, 0); }
		public List<Simple_nameContext> simple_name() {
			return getRuleContexts(Simple_nameContext.class);
		}
		public Simple_nameContext simple_name(int i) {
			return getRuleContext(Simple_nameContext.class,i);
		}
		public TerminalNode DOT() { return getToken(GprParser.DOT, 0); }
		public Attribute_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterAttribute_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitAttribute_prefix(this);
		}
	}

	public final Attribute_prefixContext attribute_prefix() throws RecognitionException {
		Attribute_prefixContext _localctx = new Attribute_prefixContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attribute_prefix);
		int _la;
		try {
			setState(249);
			switch (_input.LA(1)) {
			case PROJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(PROJECT);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				((Attribute_prefixContext)_localctx).project_name = simple_name();
				setState(247);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(245);
					match(DOT);
					setState(246);
					((Attribute_prefixContext)_localctx).package_name = simple_name();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class External_valueContext extends ParserRuleContext {
		public Token external_name;
		public Token defaultValue;
		public TerminalNode EXTERNAL() { return getToken(GprParser.EXTERNAL, 0); }
		public TerminalNode LPAR() { return getToken(GprParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(GprParser.RPAR, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(GprParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(GprParser.STRING_LITERAL, i);
		}
		public TerminalNode COMMA() { return getToken(GprParser.COMMA, 0); }
		public External_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterExternal_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitExternal_value(this);
		}
	}

	public final External_valueContext external_value() throws RecognitionException {
		External_valueContext _localctx = new External_valueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_external_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(EXTERNAL);
			setState(252);
			match(LPAR);
			setState(253);
			((External_valueContext)_localctx).external_name = match(STRING_LITERAL);
			setState(256);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(254);
				match(COMMA);
				setState(255);
				((External_valueContext)_localctx).defaultValue = match(STRING_LITERAL);
				}
			}

			setState(258);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode AFFECTATION_SIGN() { return getToken(GprParser.AFFECTATION_SIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			simple_name();
			setState(261);
			match(AFFECTATION_SIGN);
			setState(262);
			expression();
			setState(263);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TermContext first;
		public TermContext other;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> AMPERSAND() { return getTokens(GprParser.AMPERSAND); }
		public TerminalNode AMPERSAND(int i) {
			return getToken(GprParser.AMPERSAND, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			((ExpressionContext)_localctx).first = term();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMPERSAND) {
				{
				{
				setState(266);
				match(AMPERSAND);
				setState(267);
				((ExpressionContext)_localctx).other = term();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public String_listContext string_list() {
			return getRuleContext(String_listContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_term);
		try {
			setState(275);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case PROJECT:
			case EXTERNAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				string_expression();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				string_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_expressionContext extends ParserRuleContext {
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
	 
		public String_expressionContext() { }
		public void copyFrom(String_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringExpressionLiteralContext extends String_expressionContext {
		public TerminalNode STRING_LITERAL() { return getToken(GprParser.STRING_LITERAL, 0); }
		public StringExpressionLiteralContext(String_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterStringExpressionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitStringExpressionLiteral(this);
		}
	}
	public static class StringExpressionExternalValueContext extends String_expressionContext {
		public External_valueContext external_value() {
			return getRuleContext(External_valueContext.class,0);
		}
		public StringExpressionExternalValueContext(String_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterStringExpressionExternalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitStringExpressionExternalValue(this);
		}
	}
	public static class StringExpressionAttributeReferenceContext extends String_expressionContext {
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public StringExpressionAttributeReferenceContext(String_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterStringExpressionAttributeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitStringExpressionAttributeReference(this);
		}
	}
	public static class StringExpressionVariableNameContext extends String_expressionContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public StringExpressionVariableNameContext(String_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterStringExpressionVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitStringExpressionVariableName(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		String_expressionContext _localctx = new String_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_string_expression);
		try {
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new StringExpressionLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				_localctx = new StringExpressionVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				name();
				}
				break;
			case 3:
				_localctx = new StringExpressionExternalValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				external_value();
				}
				break;
			case 4:
				_localctx = new StringExpressionAttributeReferenceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				attribute_reference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_listContext extends ParserRuleContext {
		public ExpressionContext first;
		public ExpressionContext other;
		public TerminalNode LPAR() { return getToken(GprParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(GprParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GprParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public String_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterString_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitString_list(this);
		}
	}

	public final String_listContext string_list() throws RecognitionException {
		String_listContext _localctx = new String_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_string_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(LPAR);
			setState(285);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << LPAR) | (1L << PROJECT) | (1L << EXTERNAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(284);
				((String_listContext)_localctx).first = expression();
				}
			}

			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(287);
				match(COMMA);
				setState(288);
				((String_listContext)_localctx).other = expression();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_declarationContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(GprParser.NULL, 0); }
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public Empty_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).enterEmpty_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GprListener ) ((GprListener)listener).exitEmpty_declaration(this);
		}
	}

	public final Empty_declarationContext empty_declaration() throws RecognitionException {
		Empty_declarationContext _localctx = new Empty_declarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_empty_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(NULL);
			setState(297);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\3\7\3D\n\3\f\3\16\3G\13\3\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P"+
		"\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bh\n\b\f\b\16\bk\13\b\3\t\3\t\3\n\3\n\3"+
		"\n\5\nr\n\n\3\13\3\13\3\13\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u0082\n\f\f\f\16\f\u0085\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7"+
		"\r\u008e\n\r\f\r\16\r\u0091\13\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u009e\n\16\f\16\16\16\u00a1\13\16\3\17\3\17\3\17\7"+
		"\17\u00a6\n\17\f\17\16\17\u00a9\13\17\3\17\5\17\u00ac\n\17\3\20\3\20\3"+
		"\20\5\20\u00b1\n\20\3\21\3\21\3\21\3\21\7\21\u00b7\n\21\f\21\16\21\u00ba"+
		"\13\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00d0\n\23\f\23\16\23\u00d3\13"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ec\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00f4\n\27\3\30\3\30\3\30\3\30\5\30\u00fa"+
		"\n\30\5\30\u00fc\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0103\n\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u010f\n\33\f\33\16\33"+
		"\u0112\13\33\3\34\3\34\5\34\u0116\n\34\3\35\3\35\3\35\3\35\5\35\u011c"+
		"\n\35\3\36\3\36\5\36\u0120\n\36\3\36\3\36\7\36\u0124\n\36\f\36\16\36\u0127"+
		"\13\36\3\36\3\36\3\37\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<\2\2\u0131\2>\3\2\2\2\4E\3\2\2\2\6H\3"+
		"\2\2\2\bS\3\2\2\2\nU\3\2\2\2\fW\3\2\2\2\16d\3\2\2\2\20l\3\2\2\2\22q\3"+
		"\2\2\2\24x\3\2\2\2\26z\3\2\2\2\30\u0089\3\2\2\2\32\u0096\3\2\2\2\34\u00ab"+
		"\3\2\2\2\36\u00b0\3\2\2\2 \u00b2\3\2\2\2\"\u00bf\3\2\2\2$\u00c7\3\2\2"+
		"\2&\u00d8\3\2\2\2(\u00df\3\2\2\2*\u00eb\3\2\2\2,\u00ed\3\2\2\2.\u00fb"+
		"\3\2\2\2\60\u00fd\3\2\2\2\62\u0106\3\2\2\2\64\u010b\3\2\2\2\66\u0115\3"+
		"\2\2\28\u011b\3\2\2\2:\u011d\3\2\2\2<\u012a\3\2\2\2>?\5\4\3\2?@\5\n\6"+
		"\2@A\7\2\2\3A\3\3\2\2\2BD\5\6\4\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2F\5\3\2\2\2GE\3\2\2\2HI\7\37\2\2IN\5\b\5\2JK\7\5\2\2KM\5\b\5\2LJ\3"+
		"\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\6\2\2R\7"+
		"\3\2\2\2ST\7\4\2\2T\t\3\2\2\2UV\5\f\7\2V\13\3\2\2\2WX\7\32\2\2XY\5\16"+
		"\b\2Y]\7\25\2\2Z\\\5\22\n\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^"+
		"`\3\2\2\2_]\3\2\2\2`a\7\23\2\2ab\5\16\b\2bc\7\6\2\2c\r\3\2\2\2di\5\20"+
		"\t\2ef\7\7\2\2fh\5\20\t\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\17"+
		"\3\2\2\2ki\3\2\2\2lm\7\"\2\2m\21\3\2\2\2nr\5\24\13\2or\5\26\f\2pr\5\36"+
		"\20\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\23\3\2\2\2sy\5\62\32\2ty\5&\24\2"+
		"uy\5(\25\2vy\5\30\r\2wy\5<\37\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2"+
		"\2xw\3\2\2\2y\25\3\2\2\2z{\7\34\2\2{|\5\20\t\2|}\7\25\2\2}~\7\b\2\2~\u0083"+
		"\7\4\2\2\177\u0080\7\5\2\2\u0080\u0082\7\4\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\t\2\2\u0087\u0088\7\6\2\2\u0088"+
		"\27\3\2\2\2\u0089\u008a\7\22\2\2\u008a\u008b\5\16\b\2\u008b\u008f\7\25"+
		"\2\2\u008c\u008e\5\32\16\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0093\7\23\2\2\u0093\u0094\7\22\2\2\u0094\u0095\7\6\2\2\u0095"+
		"\31\3\2\2\2\u0096\u0097\7\36\2\2\u0097\u0098\5\34\17\2\u0098\u009f\7\n"+
		"\2\2\u0099\u009e\5\30\r\2\u009a\u009e\5(\25\2\u009b\u009e\5\62\32\2\u009c"+
		"\u009e\5<\37\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\33\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a7\7\4\2"+
		"\2\u00a3\u00a4\7\13\2\2\u00a4\u00a6\7\4\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ac\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\7\30\2\2\u00ab\u00a2\3\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\35\3\2\2\2\u00ad\u00b1\5 \21\2\u00ae\u00b1\5\"\22"+
		"\2\u00af\u00b1\5$\23\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\37\3\2\2\2\u00b2\u00b3\7\31\2\2\u00b3\u00b4\5\20\t\2\u00b4"+
		"\u00b8\7\25\2\2\u00b5\u00b7\5\24\13\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\7\23\2\2\u00bc\u00bd\5\20\t\2\u00bd\u00be\7"+
		"\6\2\2\u00be!\3\2\2\2\u00bf\u00c0\7\31\2\2\u00c0\u00c1\5\20\t\2\u00c1"+
		"\u00c2\7\33\2\2\u00c2\u00c3\5\20\t\2\u00c3\u00c4\7\7\2\2\u00c4\u00c5\5"+
		"\20\t\2\u00c5\u00c6\7\6\2\2\u00c6#\3\2\2\2\u00c7\u00c8\7\31\2\2\u00c8"+
		"\u00c9\5\20\t\2\u00c9\u00ca\7 \2\2\u00ca\u00cb\5\20\t\2\u00cb\u00cc\7"+
		"\7\2\2\u00cc\u00cd\5\20\t\2\u00cd\u00d1\7\25\2\2\u00ce\u00d0\5\24\13\2"+
		"\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\23\2\2"+
		"\u00d5\u00d6\5\20\t\2\u00d6\u00d7\7\6\2\2\u00d7%\3\2\2\2\u00d8\u00d9\5"+
		"\20\t\2\u00d9\u00da\7\f\2\2\u00da\u00db\5\16\b\2\u00db\u00dc\7\r\2\2\u00dc"+
		"\u00dd\58\35\2\u00dd\u00de\7\6\2\2\u00de\'\3\2\2\2\u00df\u00e0\7\24\2"+
		"\2\u00e0\u00e1\5*\26\2\u00e1\u00e2\7\35\2\2\u00e2\u00e3\5\64\33\2\u00e3"+
		"\u00e4\7\6\2\2\u00e4)\3\2\2\2\u00e5\u00ec\5\20\t\2\u00e6\u00e7\5\20\t"+
		"\2\u00e7\u00e8\7\b\2\2\u00e8\u00e9\7\4\2\2\u00e9\u00ea\7\t\2\2\u00ea\u00ec"+
		"\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e6\3\2\2\2\u00ec+\3\2\2\2\u00ed"+
		"\u00ee\5.\30\2\u00ee\u00ef\7\17\2\2\u00ef\u00f3\5\20\t\2\u00f0\u00f1\7"+
		"\b\2\2\u00f1\u00f2\7\4\2\2\u00f2\u00f4\7\t\2\2\u00f3\u00f0\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4-\3\2\2\2\u00f5\u00fc\7\32\2\2\u00f6\u00f9\5\20\t"+
		"\2\u00f7\u00f8\7\7\2\2\u00f8\u00fa\5\20\t\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f6\3\2"+
		"\2\2\u00fc/\3\2\2\2\u00fd\u00fe\7!\2\2\u00fe\u00ff\7\b\2\2\u00ff\u0102"+
		"\7\4\2\2\u0100\u0101\7\5\2\2\u0101\u0103\7\4\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\t\2\2\u0105\61\3\2\2"+
		"\2\u0106\u0107\5\20\t\2\u0107\u0108\7\r\2\2\u0108\u0109\5\64\33\2\u0109"+
		"\u010a\7\6\2\2\u010a\63\3\2\2\2\u010b\u0110\5\66\34\2\u010c\u010d\7\16"+
		"\2\2\u010d\u010f\5\66\34\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\65\3\2\2\2\u0112\u0110\3\2\2"+
		"\2\u0113\u0116\58\35\2\u0114\u0116\5:\36\2\u0115\u0113\3\2\2\2\u0115\u0114"+
		"\3\2\2\2\u0116\67\3\2\2\2\u0117\u011c\7\4\2\2\u0118\u011c\5\16\b\2\u0119"+
		"\u011c\5\60\31\2\u011a\u011c\5,\27\2\u011b\u0117\3\2\2\2\u011b\u0118\3"+
		"\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c9\3\2\2\2\u011d\u011f"+
		"\7\b\2\2\u011e\u0120\5\64\33\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2"+
		"\u0120\u0125\3\2\2\2\u0121\u0122\7\5\2\2\u0122\u0124\5\64\33\2\u0123\u0121"+
		"\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\t\2\2\u0129;\3\2\2\2"+
		"\u012a\u012b\7\27\2\2\u012b\u012c\7\6\2\2\u012c=\3\2\2\2\33EN]iqx\u0083"+
		"\u008f\u009d\u009f\u00a7\u00ab\u00b0\u00b8\u00d1\u00eb\u00f3\u00f9\u00fb"+
		"\u0102\u0110\u0115\u011b\u011f\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}