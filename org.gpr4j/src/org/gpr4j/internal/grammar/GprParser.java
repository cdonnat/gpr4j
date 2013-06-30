// Generated from D:\Users\RS\workspace_ada\gpr4j\org.gpr4j\src\org\gpr4j\internal\grammar\Gpr.g4 by ANTLR 4.0
package org.gpr4j.internal.grammar;

import org.gpr4j.internal.model.Term;

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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, STRING_LITERAL=2, COMMA=3, SEMI_COLON=4, DOT=5, LPAR=6, RPAR=7, 
		RARROW=8, PIPE=9, COLON=10, AFFECTATION_SIGN=11, AMPERSAND=12, APOSTROPHE=13, 
		ALL=14, AT=15, CASE=16, END=17, FOR=18, IS=19, LIMITED=20, NULL=21, OTHERS=22, 
		PACKAGE=23, PROJECT=24, RENAMES=25, TYPE=26, USE=27, WHEN=28, WITH=29, 
		EXTENDS=30, EXTERNAL=31, IDENTIFIER=32, WS=33;
	public static final String[] tokenNames = {
		"<INVALID>", "COMMENT", "STRING_LITERAL", "','", "';'", "'.'", "'('", 
		"')'", "'=>'", "'|'", "':'", "':='", "'&'", "'''", "ALL", "AT", "CASE", 
		"END", "FOR", "IS", "LIMITED", "NULL", "OTHERS", "PACKAGE", "PROJECT", 
		"RENAMES", "TYPE", "USE", "WHEN", "WITH", "EXTENDS", "EXTERNAL", "IDENTIFIER", 
		"WS"
	};
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

	@Override
	public String getGrammarFileName() { return "Gpr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

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
		public TerminalNode EOF() { return getToken(GprParser.EOF, 0); }
		public Project_declarationContext project_declaration() {
			return getRuleContext(Project_declarationContext.class,0);
		}
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
			setState(60); context_clause();
			setState(61); project_declaration();
			setState(62); match(EOF);
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
				setState(64); with_clause();
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
		public List<Path_nameContext> path_name() {
			return getRuleContexts(Path_nameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(GprParser.COMMA, i);
		}
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GprParser.COMMA); }
		public TerminalNode WITH() { return getToken(GprParser.WITH, 0); }
		public Path_nameContext path_name(int i) {
			return getRuleContext(Path_nameContext.class,i);
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
			setState(70); match(WITH);
			setState(71); ((With_clauseContext)_localctx).first_path = path_name();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(72); match(COMMA);
				setState(73); ((With_clauseContext)_localctx).other_path = path_name();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79); match(SEMI_COLON);
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
		public String result;
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
			setState(81); match(STRING_LITERAL);
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
			setState(83); simple_project_declaration();
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
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode END() { return getToken(GprParser.END, 0); }
		public TerminalNode PROJECT() { return getToken(GprParser.PROJECT, 0); }
		public List<Declarative_itemContext> declarative_item() {
			return getRuleContexts(Declarative_itemContext.class);
		}
		public TerminalNode IS() { return getToken(GprParser.IS, 0); }
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
			setState(85); match(PROJECT);
			setState(86); ((Simple_project_declarationContext)_localctx).begin_project_name = name();
			setState(87); match(IS);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << FOR) | (1L << NULL) | (1L << PACKAGE) | (1L << TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(88); declarative_item();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94); match(END);
			setState(95); ((Simple_project_declarationContext)_localctx).end_project_name = name();
			setState(96); match(SEMI_COLON);
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
		public String result;
		public Simple_nameContext first;
		public Simple_nameContext other;
		public TerminalNode DOT(int i) {
			return getToken(GprParser.DOT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(GprParser.DOT); }
		public Simple_nameContext simple_name(int i) {
			return getRuleContext(Simple_nameContext.class,i);
		}
		public List<Simple_nameContext> simple_name() {
			return getRuleContexts(Simple_nameContext.class);
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
			setState(98); ((NameContext)_localctx).first = simple_name();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(99); match(DOT);
				setState(100); ((NameContext)_localctx).other = simple_name();
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
			setState(106); match(IDENTIFIER);
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
		public Package_declarationContext package_declaration() {
			return getRuleContext(Package_declarationContext.class,0);
		}
		public Typed_string_declarationContext typed_string_declaration() {
			return getRuleContext(Typed_string_declarationContext.class,0);
		}
		public Simple_declarative_itemContext simple_declarative_item() {
			return getRuleContext(Simple_declarative_itemContext.class,0);
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
				setState(108); simple_declarative_item();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); typed_string_declaration();
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(110); package_declaration();
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
		public Empty_declarationContext empty_declaration() {
			return getRuleContext(Empty_declarationContext.class,0);
		}
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
				setState(113); variable_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114); typed_variable_declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115); attribute_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116); case_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(117); empty_declaration();
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
		public TerminalNode RPAR() { return getToken(GprParser.RPAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(GprParser.COMMA, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(GprParser.STRING_LITERAL); }
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public TerminalNode LPAR() { return getToken(GprParser.LPAR, 0); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(GprParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GprParser.COMMA); }
		public TerminalNode IS() { return getToken(GprParser.IS, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(GprParser.TYPE, 0); }
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
			setState(120); match(TYPE);
			setState(121); simple_name();
			setState(122); match(IS);
			setState(123); match(LPAR);
			setState(124); ((Typed_string_declarationContext)_localctx).first = match(STRING_LITERAL);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(125); match(COMMA);
				setState(126); ((Typed_string_declarationContext)_localctx).other = match(STRING_LITERAL);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132); match(RPAR);
			setState(133); match(SEMI_COLON);
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
		public Case_itemContext case_item(int i) {
			return getRuleContext(Case_itemContext.class,i);
		}
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<Case_itemContext> case_item() {
			return getRuleContexts(Case_itemContext.class);
		}
		public TerminalNode END() { return getToken(GprParser.END, 0); }
		public TerminalNode IS() { return getToken(GprParser.IS, 0); }
		public TerminalNode CASE(int i) {
			return getToken(GprParser.CASE, i);
		}
		public List<TerminalNode> CASE() { return getTokens(GprParser.CASE); }
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
			setState(135); match(CASE);
			setState(136); name();
			setState(137); match(IS);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(138); case_item();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144); match(END);
			setState(145); match(CASE);
			setState(146); match(SEMI_COLON);
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
		public List<Empty_declarationContext> empty_declaration() {
			return getRuleContexts(Empty_declarationContext.class);
		}
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Case_statementContext case_statement(int i) {
			return getRuleContext(Case_statementContext.class,i);
		}
		public Discrete_choice_listContext discrete_choice_list() {
			return getRuleContext(Discrete_choice_listContext.class,0);
		}
		public List<Attribute_declarationContext> attribute_declaration() {
			return getRuleContexts(Attribute_declarationContext.class);
		}
		public Empty_declarationContext empty_declaration(int i) {
			return getRuleContext(Empty_declarationContext.class,i);
		}
		public Attribute_declarationContext attribute_declaration(int i) {
			return getRuleContext(Attribute_declarationContext.class,i);
		}
		public List<Case_statementContext> case_statement() {
			return getRuleContexts(Case_statementContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public TerminalNode WHEN() { return getToken(GprParser.WHEN, 0); }
		public TerminalNode RARROW() { return getToken(GprParser.RARROW, 0); }
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
			setState(148); match(WHEN);
			setState(149); discrete_choice_list();
			setState(150); match(RARROW);
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(155);
				switch (_input.LA(1)) {
				case CASE:
					{
					setState(151); case_statement();
					}
					break;
				case FOR:
					{
					setState(152); attribute_declaration();
					}
					break;
				case IDENTIFIER:
					{
					setState(153); variable_declaration();
					}
					break;
				case NULL:
					{
					setState(154); empty_declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << FOR) | (1L << NULL) | (1L << IDENTIFIER))) != 0) );
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
		public List<TerminalNode> PIPE() { return getTokens(GprParser.PIPE); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(GprParser.STRING_LITERAL); }
		public TerminalNode PIPE(int i) {
			return getToken(GprParser.PIPE, i);
		}
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(GprParser.STRING_LITERAL, i);
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
			setState(168);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); ((Discrete_choice_listContext)_localctx).first = match(STRING_LITERAL);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(160); match(PIPE);
					setState(161); ((Discrete_choice_listContext)_localctx).other = match(STRING_LITERAL);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OTHERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(167); match(OTHERS);
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
		public Package_extensionContext package_extension() {
			return getRuleContext(Package_extensionContext.class,0);
		}
		public Package_renamingContext package_renaming() {
			return getRuleContext(Package_renamingContext.class,0);
		}
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
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
			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); package_spec();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); package_renaming();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172); package_extension();
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
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public Simple_declarative_itemContext simple_declarative_item(int i) {
			return getRuleContext(Simple_declarative_itemContext.class,i);
		}
		public TerminalNode END() { return getToken(GprParser.END, 0); }
		public TerminalNode IS() { return getToken(GprParser.IS, 0); }
		public List<Simple_declarative_itemContext> simple_declarative_item() {
			return getRuleContexts(Simple_declarative_itemContext.class);
		}
		public Simple_nameContext simple_name(int i) {
			return getRuleContext(Simple_nameContext.class,i);
		}
		public List<Simple_nameContext> simple_name() {
			return getRuleContexts(Simple_nameContext.class);
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
			setState(175); match(PACKAGE);
			setState(176); ((Package_specContext)_localctx).begin_package_name = simple_name();
			setState(177); match(IS);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << FOR) | (1L << NULL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(178); simple_declarative_item();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184); match(END);
			setState(185); ((Package_specContext)_localctx).end_package_name = simple_name();
			setState(186); match(SEMI_COLON);
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
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public TerminalNode DOT() { return getToken(GprParser.DOT, 0); }
		public Simple_nameContext simple_name(int i) {
			return getRuleContext(Simple_nameContext.class,i);
		}
		public List<Simple_nameContext> simple_name() {
			return getRuleContexts(Simple_nameContext.class);
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
			setState(188); match(PACKAGE);
			setState(189); ((Package_renamingContext)_localctx).newPackageName = simple_name();
			setState(190); match(RENAMES);
			setState(191); ((Package_renamingContext)_localctx).projectName = simple_name();
			setState(192); match(DOT);
			setState(193); ((Package_renamingContext)_localctx).renamedPackage = simple_name();
			setState(194); match(SEMI_COLON);
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
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public Simple_declarative_itemContext simple_declarative_item(int i) {
			return getRuleContext(Simple_declarative_itemContext.class,i);
		}
		public TerminalNode END() { return getToken(GprParser.END, 0); }
		public TerminalNode DOT() { return getToken(GprParser.DOT, 0); }
		public TerminalNode IS() { return getToken(GprParser.IS, 0); }
		public TerminalNode EXTENDS() { return getToken(GprParser.EXTENDS, 0); }
		public List<Simple_declarative_itemContext> simple_declarative_item() {
			return getRuleContexts(Simple_declarative_itemContext.class);
		}
		public Simple_nameContext simple_name(int i) {
			return getRuleContext(Simple_nameContext.class,i);
		}
		public List<Simple_nameContext> simple_name() {
			return getRuleContexts(Simple_nameContext.class);
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
			setState(196); match(PACKAGE);
			setState(197); ((Package_extensionContext)_localctx).begin_package_name = simple_name();
			setState(198); match(EXTENDS);
			setState(199); ((Package_extensionContext)_localctx).projectName = simple_name();
			setState(200); match(DOT);
			setState(201); ((Package_extensionContext)_localctx).extendedPackage = simple_name();
			setState(202); match(IS);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << FOR) | (1L << NULL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(203); simple_declarative_item();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209); match(END);
			setState(210); ((Package_extensionContext)_localctx).end_package_name = simple_name();
			setState(211); match(SEMI_COLON);
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
		public TerminalNode COLON() { return getToken(GprParser.COLON, 0); }
		public TerminalNode AFFECTATION_SIGN() { return getToken(GprParser.AFFECTATION_SIGN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
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
			setState(213); simple_name();
			setState(214); match(COLON);
			setState(215); name();
			setState(216); match(AFFECTATION_SIGN);
			setState(217); string_expression();
			setState(218); match(SEMI_COLON);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FOR() { return getToken(GprParser.FOR, 0); }
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public TerminalNode USE() { return getToken(GprParser.USE, 0); }
		public Attribute_designatorContext attribute_designator() {
			return getRuleContext(Attribute_designatorContext.class,0);
		}
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
			setState(220); match(FOR);
			setState(221); attribute_designator();
			setState(222); match(USE);
			setState(223); expression();
			setState(224); match(SEMI_COLON);
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
		public String result;
		public Simple_nameContext att;
		public TerminalNode RPAR() { return getToken(GprParser.RPAR, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(GprParser.STRING_LITERAL, 0); }
		public TerminalNode LPAR() { return getToken(GprParser.LPAR, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
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
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226); ((Attribute_designatorContext)_localctx).att = simple_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227); ((Attribute_designatorContext)_localctx).att = simple_name();
				{
				setState(228); match(LPAR);
				setState(229); match(STRING_LITERAL);
				setState(230); match(RPAR);
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
		public Term result;
		public TerminalNode RPAR() { return getToken(GprParser.RPAR, 0); }
		public Attribute_prefixContext attribute_prefix() {
			return getRuleContext(Attribute_prefixContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(GprParser.STRING_LITERAL, 0); }
		public TerminalNode LPAR() { return getToken(GprParser.LPAR, 0); }
		public TerminalNode APOSTROPHE() { return getToken(GprParser.APOSTROPHE, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
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
			setState(234); attribute_prefix();
			setState(235); match(APOSTROPHE);
			setState(236); simple_name();
			setState(240);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(237); match(LPAR);
				setState(238); match(STRING_LITERAL);
				setState(239); match(RPAR);
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
		public String result;
		public Simple_nameContext project_name;
		public Simple_nameContext package_name;
		public TerminalNode DOT() { return getToken(GprParser.DOT, 0); }
		public TerminalNode PROJECT() { return getToken(GprParser.PROJECT, 0); }
		public Simple_nameContext simple_name(int i) {
			return getRuleContext(Simple_nameContext.class,i);
		}
		public List<Simple_nameContext> simple_name() {
			return getRuleContexts(Simple_nameContext.class);
		}
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
			setState(248);
			switch (_input.LA(1)) {
			case PROJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); match(PROJECT);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); ((Attribute_prefixContext)_localctx).project_name = simple_name();
				setState(246);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(244); match(DOT);
					setState(245); ((Attribute_prefixContext)_localctx).package_name = simple_name();
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
		public Term result;
		public Token external_name;
		public Token defaultValue;
		public TerminalNode EXTERNAL() { return getToken(GprParser.EXTERNAL, 0); }
		public TerminalNode RPAR() { return getToken(GprParser.RPAR, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(GprParser.STRING_LITERAL); }
		public TerminalNode LPAR() { return getToken(GprParser.LPAR, 0); }
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
			setState(250); match(EXTERNAL);
			setState(251); match(LPAR);
			setState(252); ((External_valueContext)_localctx).external_name = match(STRING_LITERAL);
			setState(255);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(253); match(COMMA);
				setState(254); ((External_valueContext)_localctx).defaultValue = match(STRING_LITERAL);
				}
			}

			setState(257); match(RPAR);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AFFECTATION_SIGN() { return getToken(GprParser.AFFECTATION_SIGN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
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
			setState(259); simple_name();
			setState(260); match(AFFECTATION_SIGN);
			setState(261); expression();
			setState(262); match(SEMI_COLON);
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
		public Term result;
		public TermContext first;
		public TermContext other;
		public List<TerminalNode> AMPERSAND() { return getTokens(GprParser.AMPERSAND); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode AMPERSAND(int i) {
			return getToken(GprParser.AMPERSAND, i);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
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
			setState(264); ((ExpressionContext)_localctx).first = term();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMPERSAND) {
				{
				{
				setState(265); match(AMPERSAND);
				setState(266); ((ExpressionContext)_localctx).other = term();
				}
				}
				setState(271);
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
		public Term result;
		public String_listContext string_list() {
			return getRuleContext(String_listContext.class,0);
		}
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
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
			setState(274);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case PROJECT:
			case EXTERNAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(272); string_expression();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); string_list();
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
		public Term result;
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
	 
		public String_expressionContext() { }
		public void copyFrom(String_expressionContext ctx) {
			super.copyFrom(ctx);
			this.result = ctx.result;
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

	public final String_expressionContext string_expression() throws RecognitionException {
		String_expressionContext _localctx = new String_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_string_expression);
		try {
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new StringExpressionLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276); match(STRING_LITERAL);
				}
				break;

			case 2:
				_localctx = new StringExpressionVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277); name();
				}
				break;

			case 3:
				_localctx = new StringExpressionExternalValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278); external_value();
				}
				break;

			case 4:
				_localctx = new StringExpressionAttributeReferenceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(279); attribute_reference();
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
		public Term result;
		public ExpressionContext first;
		public ExpressionContext other;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(GprParser.RPAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(GprParser.COMMA, i);
		}
		public TerminalNode LPAR() { return getToken(GprParser.LPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GprParser.COMMA); }
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
			setState(282); match(LPAR);
			setState(284);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << LPAR) | (1L << PROJECT) | (1L << EXTERNAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(283); ((String_listContext)_localctx).first = expression();
				}
			}

			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(286); match(COMMA);
				setState(287); ((String_listContext)_localctx).other = expression();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293); match(RPAR);
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
		public TerminalNode SEMI_COLON() { return getToken(GprParser.SEMI_COLON, 0); }
		public TerminalNode NULL() { return getToken(GprParser.NULL, 0); }
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
			setState(295); match(NULL);
			setState(296); match(SEMI_COLON);
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
		"\2\3#\u012d\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\3\2\3\2\3\2\3\2\3\3\7\3D\n\3\f\3\16\3G\13\3\3\4\3\4\3\4\3\4"+
		"\7\4M\n\4\f\4\16\4P\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7\\"+
		"\n\7\f\7\16\7_\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bh\n\b\f\b\16\bk\13"+
		"\b\3\t\3\t\3\n\3\n\3\n\5\nr\n\n\3\13\3\13\3\13\3\13\3\13\5\13y\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0082\n\f\f\f\16\f\u0085\13\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\7\r\u008e\n\r\f\r\16\r\u0091\13\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u009e\n\16\r\16\16\16\u009f\3\17"+
		"\3\17\3\17\7\17\u00a5\n\17\f\17\16\17\u00a8\13\17\3\17\5\17\u00ab\n\17"+
		"\3\20\3\20\3\20\5\20\u00b0\n\20\3\21\3\21\3\21\3\21\7\21\u00b6\n\21\f"+
		"\21\16\21\u00b9\13\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00cf\n\23\f\23"+
		"\16\23\u00d2\13\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00eb"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f3\n\27\3\30\3\30\3\30\3\30"+
		"\5\30\u00f9\n\30\5\30\u00fb\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0102\n"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u010e\n\33"+
		"\f\33\16\33\u0111\13\33\3\34\3\34\5\34\u0115\n\34\3\35\3\35\3\35\3\35"+
		"\5\35\u011b\n\35\3\36\3\36\5\36\u011f\n\36\3\36\3\36\7\36\u0123\n\36\f"+
		"\36\16\36\u0126\13\36\3\36\3\36\3\37\3\37\3\37\3\37\2 \2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\2\u0130\2>\3\2\2\2"+
		"\4E\3\2\2\2\6H\3\2\2\2\bS\3\2\2\2\nU\3\2\2\2\fW\3\2\2\2\16d\3\2\2\2\20"+
		"l\3\2\2\2\22q\3\2\2\2\24x\3\2\2\2\26z\3\2\2\2\30\u0089\3\2\2\2\32\u0096"+
		"\3\2\2\2\34\u00aa\3\2\2\2\36\u00af\3\2\2\2 \u00b1\3\2\2\2\"\u00be\3\2"+
		"\2\2$\u00c6\3\2\2\2&\u00d7\3\2\2\2(\u00de\3\2\2\2*\u00ea\3\2\2\2,\u00ec"+
		"\3\2\2\2.\u00fa\3\2\2\2\60\u00fc\3\2\2\2\62\u0105\3\2\2\2\64\u010a\3\2"+
		"\2\2\66\u0114\3\2\2\28\u011a\3\2\2\2:\u011c\3\2\2\2<\u0129\3\2\2\2>?\5"+
		"\4\3\2?@\5\n\6\2@A\7\1\2\2A\3\3\2\2\2BD\5\6\4\2CB\3\2\2\2DG\3\2\2\2EC"+
		"\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GE\3\2\2\2HI\7\37\2\2IN\5\b\5\2JK\7\5\2\2"+
		"KM\5\b\5\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2"+
		"QR\7\6\2\2R\7\3\2\2\2ST\7\4\2\2T\t\3\2\2\2UV\5\f\7\2V\13\3\2\2\2WX\7\32"+
		"\2\2XY\5\16\b\2Y]\7\25\2\2Z\\\5\22\n\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2"+
		"]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\23\2\2ab\5\16\b\2bc\7\6\2\2c\r\3\2"+
		"\2\2di\5\20\t\2ef\7\7\2\2fh\5\20\t\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3"+
		"\2\2\2j\17\3\2\2\2ki\3\2\2\2lm\7\"\2\2m\21\3\2\2\2nr\5\24\13\2or\5\26"+
		"\f\2pr\5\36\20\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\23\3\2\2\2sy\5\62\32\2"+
		"ty\5&\24\2uy\5(\25\2vy\5\30\r\2wy\5<\37\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2"+
		"\2xv\3\2\2\2xw\3\2\2\2y\25\3\2\2\2z{\7\34\2\2{|\5\20\t\2|}\7\25\2\2}~"+
		"\7\b\2\2~\u0083\7\4\2\2\177\u0080\7\5\2\2\u0080\u0082\7\4\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\t\2\2\u0087\u0088\7\6"+
		"\2\2\u0088\27\3\2\2\2\u0089\u008a\7\22\2\2\u008a\u008b\5\16\b\2\u008b"+
		"\u008f\7\25\2\2\u008c\u008e\5\32\16\2\u008d\u008c\3\2\2\2\u008e\u0091"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\7\23\2\2\u0093\u0094\7\22\2\2\u0094\u0095\7"+
		"\6\2\2\u0095\31\3\2\2\2\u0096\u0097\7\36\2\2\u0097\u0098\5\34\17\2\u0098"+
		"\u009d\7\n\2\2\u0099\u009e\5\30\r\2\u009a\u009e\5(\25\2\u009b\u009e\5"+
		"\62\32\2\u009c\u009e\5<\37\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\33\3\2\2\2\u00a1\u00a6\7\4\2\2\u00a2\u00a3"+
		"\7\13\2\2\u00a3\u00a5\7\4\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a9\u00ab\7\30\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00ab\35\3\2\2\2\u00ac\u00b0\5 \21\2\u00ad\u00b0\5\"\22\2\u00ae\u00b0"+
		"\5$\23\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\37\3\2\2\2\u00b1\u00b2\7\31\2\2\u00b2\u00b3\5\20\t\2\u00b3\u00b7\7\25"+
		"\2\2\u00b4\u00b6\5\24\13\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00bb\7\23\2\2\u00bb\u00bc\5\20\t\2\u00bc\u00bd\7\6\2\2\u00bd"+
		"!\3\2\2\2\u00be\u00bf\7\31\2\2\u00bf\u00c0\5\20\t\2\u00c0\u00c1\7\33\2"+
		"\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3\7\7\2\2\u00c3\u00c4\5\20\t\2\u00c4"+
		"\u00c5\7\6\2\2\u00c5#\3\2\2\2\u00c6\u00c7\7\31\2\2\u00c7\u00c8\5\20\t"+
		"\2\u00c8\u00c9\7 \2\2\u00c9\u00ca\5\20\t\2\u00ca\u00cb\7\7\2\2\u00cb\u00cc"+
		"\5\20\t\2\u00cc\u00d0\7\25\2\2\u00cd\u00cf\5\24\13\2\u00ce\u00cd\3\2\2"+
		"\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\23\2\2\u00d4\u00d5\5\20\t\2"+
		"\u00d5\u00d6\7\6\2\2\u00d6%\3\2\2\2\u00d7\u00d8\5\20\t\2\u00d8\u00d9\7"+
		"\f\2\2\u00d9\u00da\5\16\b\2\u00da\u00db\7\r\2\2\u00db\u00dc\58\35\2\u00dc"+
		"\u00dd\7\6\2\2\u00dd\'\3\2\2\2\u00de\u00df\7\24\2\2\u00df\u00e0\5*\26"+
		"\2\u00e0\u00e1\7\35\2\2\u00e1\u00e2\5\64\33\2\u00e2\u00e3\7\6\2\2\u00e3"+
		")\3\2\2\2\u00e4\u00eb\5\20\t\2\u00e5\u00e6\5\20\t\2\u00e6\u00e7\7\b\2"+
		"\2\u00e7\u00e8\7\4\2\2\u00e8\u00e9\7\t\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e4"+
		"\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb+\3\2\2\2\u00ec\u00ed\5.\30\2\u00ed"+
		"\u00ee\7\17\2\2\u00ee\u00f2\5\20\t\2\u00ef\u00f0\7\b\2\2\u00f0\u00f1\7"+
		"\4\2\2\u00f1\u00f3\7\t\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"-\3\2\2\2\u00f4\u00fb\7\32\2\2\u00f5\u00f8\5\20\t\2\u00f6\u00f7\7\7\2"+
		"\2\u00f7\u00f9\5\20\t\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb/\3\2\2\2"+
		"\u00fc\u00fd\7!\2\2\u00fd\u00fe\7\b\2\2\u00fe\u0101\7\4\2\2\u00ff\u0100"+
		"\7\5\2\2\u0100\u0102\7\4\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0104\7\t\2\2\u0104\61\3\2\2\2\u0105\u0106\5\20\t"+
		"\2\u0106\u0107\7\r\2\2\u0107\u0108\5\64\33\2\u0108\u0109\7\6\2\2\u0109"+
		"\63\3\2\2\2\u010a\u010f\5\66\34\2\u010b\u010c\7\16\2\2\u010c\u010e\5\66"+
		"\34\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\65\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0115\58\35"+
		"\2\u0113\u0115\5:\36\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\67"+
		"\3\2\2\2\u0116\u011b\7\4\2\2\u0117\u011b\5\16\b\2\u0118\u011b\5\60\31"+
		"\2\u0119\u011b\5,\27\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011a\u0119\3\2\2\2\u011b9\3\2\2\2\u011c\u011e\7\b\2\2\u011d"+
		"\u011f\5\64\33\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0124\3"+
		"\2\2\2\u0120\u0121\7\5\2\2\u0121\u0123\5\64\33\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\t\2\2\u0128;\3\2\2\2\u0129\u012a"+
		"\7\27\2\2\u012a\u012b\7\6\2\2\u012b=\3\2\2\2\33EN]iqx\u0083\u008f\u009d"+
		"\u009f\u00a6\u00aa\u00af\u00b7\u00d0\u00ea\u00f2\u00f8\u00fa\u0101\u010f"+
		"\u0114\u011a\u011e\u0124";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}