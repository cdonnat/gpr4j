// Generated from org.gpr4j\src\org\gpr4j\internal\grammar\Gpr.g4 by ANTLR 4.5
package org.gpr4j.internal.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GprLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMENT", "STRING_LITERAL", "COMMA", "SEMI_COLON", "DOT", "LPAR", "RPAR", 
		"RARROW", "PIPE", "COLON", "AFFECTATION_SIGN", "AMPERSAND", "APOSTROPHE", 
		"ALL", "AT", "CASE", "END", "FOR", "IS", "LIMITED", "NULL", "OTHERS", 
		"PACKAGE", "PROJECT", "RENAMES", "TYPE", "USE", "WHEN", "WITH", "EXTENDS", 
		"EXTERNAL", "IDENTIFIER", "UPPER_CASE_LETTER", "LOWER_CASE_LETTER", "DIGIT", 
		"STRING_ELEMENT", "WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
		"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
		"Y", "Z"
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


	public GprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u016b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\7\2\u0086\n\2\f\2\16\2\u0089\13\2\3"+
		"\2\3\2\3\3\3\3\7\3\u008f\n\3\f\3\16\3\u0092\13\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3!\3!\5!\u0117\n!\3!\5!\u011a\n!\3!\3!\3!\5!\u011f"+
		"\n!\7!\u0121\n!\f!\16!\u0124\13!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\5%\u012f"+
		"\n%\3&\6&\u0132\n&\r&\16&\u0133\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3"+
		"=\3>\3>\3?\3?\3@\3@\2\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C\2E\2G\2I\2K#M\2O\2Q\2S\2U\2W\2Y\2[\2]"+
		"\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\3\2\37\4\2\f"+
		"\f\16\17\5\2\f\f\17\17$$\5\2\n\f\16\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2"+
		"FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4"+
		"\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWw"+
		"w\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u0155\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2K\3\2\2\2\3\u0081\3\2\2\2\5\u008c\3\2\2\2\7\u0095\3"+
		"\2\2\2\t\u0097\3\2\2\2\13\u0099\3\2\2\2\r\u009b\3\2\2\2\17\u009d\3\2\2"+
		"\2\21\u009f\3\2\2\2\23\u00a2\3\2\2\2\25\u00a4\3\2\2\2\27\u00a6\3\2\2\2"+
		"\31\u00a9\3\2\2\2\33\u00ab\3\2\2\2\35\u00ad\3\2\2\2\37\u00b1\3\2\2\2!"+
		"\u00b4\3\2\2\2#\u00b9\3\2\2\2%\u00bd\3\2\2\2\'\u00c1\3\2\2\2)\u00c4\3"+
		"\2\2\2+\u00cc\3\2\2\2-\u00d1\3\2\2\2/\u00d8\3\2\2\2\61\u00e0\3\2\2\2\63"+
		"\u00e8\3\2\2\2\65\u00f0\3\2\2\2\67\u00f5\3\2\2\29\u00f9\3\2\2\2;\u00fe"+
		"\3\2\2\2=\u0103\3\2\2\2?\u010b\3\2\2\2A\u0116\3\2\2\2C\u0125\3\2\2\2E"+
		"\u0127\3\2\2\2G\u0129\3\2\2\2I\u012e\3\2\2\2K\u0131\3\2\2\2M\u0137\3\2"+
		"\2\2O\u0139\3\2\2\2Q\u013b\3\2\2\2S\u013d\3\2\2\2U\u013f\3\2\2\2W\u0141"+
		"\3\2\2\2Y\u0143\3\2\2\2[\u0145\3\2\2\2]\u0147\3\2\2\2_\u0149\3\2\2\2a"+
		"\u014b\3\2\2\2c\u014d\3\2\2\2e\u014f\3\2\2\2g\u0151\3\2\2\2i\u0153\3\2"+
		"\2\2k\u0155\3\2\2\2m\u0157\3\2\2\2o\u0159\3\2\2\2q\u015b\3\2\2\2s\u015d"+
		"\3\2\2\2u\u015f\3\2\2\2w\u0161\3\2\2\2y\u0163\3\2\2\2{\u0165\3\2\2\2}"+
		"\u0167\3\2\2\2\177\u0169\3\2\2\2\u0081\u0082\7/\2\2\u0082\u0083\7/\2\2"+
		"\u0083\u0087\3\2\2\2\u0084\u0086\n\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\b\2\2\2\u008b\4\3\2\2\2\u008c\u0090\7$\2\2"+
		"\u008d\u008f\5I%\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\7$\2\2\u0094\6\3\2\2\2\u0095\u0096\7.\2\2\u0096\b\3\2\2\2\u0097"+
		"\u0098\7=\2\2\u0098\n\3\2\2\2\u0099\u009a\7\60\2\2\u009a\f\3\2\2\2\u009b"+
		"\u009c\7*\2\2\u009c\16\3\2\2\2\u009d\u009e\7+\2\2\u009e\20\3\2\2\2\u009f"+
		"\u00a0\7?\2\2\u00a0\u00a1\7@\2\2\u00a1\22\3\2\2\2\u00a2\u00a3\7~\2\2\u00a3"+
		"\24\3\2\2\2\u00a4\u00a5\7<\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7<\2\2\u00a7"+
		"\u00a8\7?\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7(\2\2\u00aa\32\3\2\2\2\u00ab"+
		"\u00ac\7)\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\5M\'\2\u00ae\u00af\5c\62\2"+
		"\u00af\u00b0\5c\62\2\u00b0\36\3\2\2\2\u00b1\u00b2\5M\'\2\u00b2\u00b3\5"+
		"s:\2\u00b3 \3\2\2\2\u00b4\u00b5\5Q)\2\u00b5\u00b6\5M\'\2\u00b6\u00b7\5"+
		"q9\2\u00b7\u00b8\5U+\2\u00b8\"\3\2\2\2\u00b9\u00ba\5U+\2\u00ba\u00bb\5"+
		"g\64\2\u00bb\u00bc\5S*\2\u00bc$\3\2\2\2\u00bd\u00be\5W,\2\u00be\u00bf"+
		"\5i\65\2\u00bf\u00c0\5o8\2\u00c0&\3\2\2\2\u00c1\u00c2\5]/\2\u00c2\u00c3"+
		"\5q9\2\u00c3(\3\2\2\2\u00c4\u00c5\5c\62\2\u00c5\u00c6\5]/\2\u00c6\u00c7"+
		"\5e\63\2\u00c7\u00c8\5]/\2\u00c8\u00c9\5s:\2\u00c9\u00ca\5U+\2\u00ca\u00cb"+
		"\5S*\2\u00cb*\3\2\2\2\u00cc\u00cd\5g\64\2\u00cd\u00ce\5u;\2\u00ce\u00cf"+
		"\5c\62\2\u00cf\u00d0\5c\62\2\u00d0,\3\2\2\2\u00d1\u00d2\5i\65\2\u00d2"+
		"\u00d3\5s:\2\u00d3\u00d4\5[.\2\u00d4\u00d5\5U+\2\u00d5\u00d6\5o8\2\u00d6"+
		"\u00d7\5q9\2\u00d7.\3\2\2\2\u00d8\u00d9\5k\66\2\u00d9\u00da\5M\'\2\u00da"+
		"\u00db\5Q)\2\u00db\u00dc\5a\61\2\u00dc\u00dd\5M\'\2\u00dd\u00de\5Y-\2"+
		"\u00de\u00df\5U+\2\u00df\60\3\2\2\2\u00e0\u00e1\5k\66\2\u00e1\u00e2\5"+
		"o8\2\u00e2\u00e3\5i\65\2\u00e3\u00e4\5_\60\2\u00e4\u00e5\5U+\2\u00e5\u00e6"+
		"\5Q)\2\u00e6\u00e7\5s:\2\u00e7\62\3\2\2\2\u00e8\u00e9\5o8\2\u00e9\u00ea"+
		"\5U+\2\u00ea\u00eb\5g\64\2\u00eb\u00ec\5M\'\2\u00ec\u00ed\5e\63\2\u00ed"+
		"\u00ee\5U+\2\u00ee\u00ef\5q9\2\u00ef\64\3\2\2\2\u00f0\u00f1\5s:\2\u00f1"+
		"\u00f2\5}?\2\u00f2\u00f3\5k\66\2\u00f3\u00f4\5U+\2\u00f4\66\3\2\2\2\u00f5"+
		"\u00f6\5u;\2\u00f6\u00f7\5q9\2\u00f7\u00f8\5U+\2\u00f88\3\2\2\2\u00f9"+
		"\u00fa\5y=\2\u00fa\u00fb\5[.\2\u00fb\u00fc\5U+\2\u00fc\u00fd\5g\64\2\u00fd"+
		":\3\2\2\2\u00fe\u00ff\5y=\2\u00ff\u0100\5]/\2\u0100\u0101\5s:\2\u0101"+
		"\u0102\5[.\2\u0102<\3\2\2\2\u0103\u0104\5U+\2\u0104\u0105\5{>\2\u0105"+
		"\u0106\5s:\2\u0106\u0107\5U+\2\u0107\u0108\5g\64\2\u0108\u0109\5S*\2\u0109"+
		"\u010a\5q9\2\u010a>\3\2\2\2\u010b\u010c\5U+\2\u010c\u010d\5{>\2\u010d"+
		"\u010e\5s:\2\u010e\u010f\5U+\2\u010f\u0110\5o8\2\u0110\u0111\5g\64\2\u0111"+
		"\u0112\5M\'\2\u0112\u0113\5c\62\2\u0113@\3\2\2\2\u0114\u0117\5C\"\2\u0115"+
		"\u0117\5E#\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0122\3\2\2"+
		"\2\u0118\u011a\7a\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011e"+
		"\3\2\2\2\u011b\u011f\5C\"\2\u011c\u011f\5E#\2\u011d\u011f\5G$\2\u011e"+
		"\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0121\3\2"+
		"\2\2\u0120\u0119\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123B\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\4C\\\2\u0126"+
		"D\3\2\2\2\u0127\u0128\4c|\2\u0128F\3\2\2\2\u0129\u012a\4\62;\2\u012aH"+
		"\3\2\2\2\u012b\u012c\7$\2\2\u012c\u012f\7$\2\2\u012d\u012f\n\3\2\2\u012e"+
		"\u012b\3\2\2\2\u012e\u012d\3\2\2\2\u012fJ\3\2\2\2\u0130\u0132\t\4\2\2"+
		"\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\b&\2\2\u0136L\3\2\2\2\u0137\u0138"+
		"\t\5\2\2\u0138N\3\2\2\2\u0139\u013a\t\6\2\2\u013aP\3\2\2\2\u013b\u013c"+
		"\t\7\2\2\u013cR\3\2\2\2\u013d\u013e\t\b\2\2\u013eT\3\2\2\2\u013f\u0140"+
		"\t\t\2\2\u0140V\3\2\2\2\u0141\u0142\t\n\2\2\u0142X\3\2\2\2\u0143\u0144"+
		"\t\13\2\2\u0144Z\3\2\2\2\u0145\u0146\t\f\2\2\u0146\\\3\2\2\2\u0147\u0148"+
		"\t\r\2\2\u0148^\3\2\2\2\u0149\u014a\t\16\2\2\u014a`\3\2\2\2\u014b\u014c"+
		"\t\17\2\2\u014cb\3\2\2\2\u014d\u014e\t\20\2\2\u014ed\3\2\2\2\u014f\u0150"+
		"\t\21\2\2\u0150f\3\2\2\2\u0151\u0152\t\22\2\2\u0152h\3\2\2\2\u0153\u0154"+
		"\t\23\2\2\u0154j\3\2\2\2\u0155\u0156\t\24\2\2\u0156l\3\2\2\2\u0157\u0158"+
		"\t\25\2\2\u0158n\3\2\2\2\u0159\u015a\t\26\2\2\u015ap\3\2\2\2\u015b\u015c"+
		"\t\27\2\2\u015cr\3\2\2\2\u015d\u015e\t\30\2\2\u015et\3\2\2\2\u015f\u0160"+
		"\t\31\2\2\u0160v\3\2\2\2\u0161\u0162\t\32\2\2\u0162x\3\2\2\2\u0163\u0164"+
		"\t\33\2\2\u0164z\3\2\2\2\u0165\u0166\t\34\2\2\u0166|\3\2\2\2\u0167\u0168"+
		"\t\35\2\2\u0168~\3\2\2\2\u0169\u016a\t\36\2\2\u016a\u0080\3\2\2\2\13\2"+
		"\u0087\u0090\u0116\u0119\u011e\u0122\u012e\u0133\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}