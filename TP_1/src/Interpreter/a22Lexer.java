// Generated from C:\Users\diogo\Ambiente de Trabalho\Compilers\Compilers\TP_1\src\a22Lexer.g4 by ANTLR 4.9.2
package Interpreter;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class a22Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFICATOR=1, LETTER=2, DIGIT=3, WRITE=4, WRITELN=5, READ=6, AND=7, 
		OR=8, NOT=9, INT=10, BOOL=11, REAL=12, STRING=13, VOID=14, TRUE=15, FALSE=16, 
		IF=17, THEN=18, ELSE=19, WHILE=20, DO=21, FOR=22, TO=23, DOWNTO=24, STEP=25, 
		RETURN=26, TYPE=27, ASSIGN=28, SEMICOLON=29, COLON=30, POINT=31, CIRCUMFLEX=32, 
		LEFT_BRACKET=33, RIGHT_BRACKET=34, LEFT_SQUARE_BRACKET=35, RIGHT_SQUARE_BRACKET=36, 
		LEFT_CURLY_BRACKET=37, RIGHT_CURLY_BRACKET=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFICATOR", "LETTER", "DIGIT", "WRITE", "WRITELN", "READ", "AND", 
			"OR", "NOT", "INT", "BOOL", "REAL", "STRING", "VOID", "TRUE", "FALSE", 
			"IF", "THEN", "ELSE", "WHILE", "DO", "FOR", "TO", "DOWNTO", "STEP", "RETURN", 
			"TYPE", "ASSIGN", "SEMICOLON", "COLON", "POINT", "CIRCUMFLEX", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "LEFT_CURLY_BRACKET", 
			"RIGHT_CURLY_BRACKET"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'write'", "'writeln'", "'read'", "'and'", "'or'", 
			"'not'", "'int'", "'bool'", "'real'", "'string'", "'void'", "'true'", 
			"'false'", "'if'", "'then'", "'else'", "'while'", "'do'", "'for'", "'to'", 
			"'downto'", "'step'", "'return'", "'type'", "'='", "';'", "','", "'.'", 
			"'^'", "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFICATOR", "LETTER", "DIGIT", "WRITE", "WRITELN", "READ", 
			"AND", "OR", "NOT", "INT", "BOOL", "REAL", "STRING", "VOID", "TRUE", 
			"FALSE", "IF", "THEN", "ELSE", "WHILE", "DO", "FOR", "TO", "DOWNTO", 
			"STEP", "RETURN", "TYPE", "ASSIGN", "SEMICOLON", "COLON", "POINT", "CIRCUMFLEX", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", 
			"LEFT_CURLY_BRACKET", "RIGHT_CURLY_BRACKET"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public a22Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "a22Lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00ea\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\7\2S\n\2\f\2\16"+
		"\2V\13\2\3\3\5\3Y\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3"+
		"\2\4\5\2C\\aac|\3\2\62;\2\u00eb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O"+
		"\3\2\2\2\5X\3\2\2\2\7Z\3\2\2\2\t\\\3\2\2\2\13b\3\2\2\2\rj\3\2\2\2\17o"+
		"\3\2\2\2\21s\3\2\2\2\23v\3\2\2\2\25z\3\2\2\2\27~\3\2\2\2\31\u0083\3\2"+
		"\2\2\33\u0088\3\2\2\2\35\u008f\3\2\2\2\37\u0094\3\2\2\2!\u0099\3\2\2\2"+
		"#\u009f\3\2\2\2%\u00a2\3\2\2\2\'\u00a7\3\2\2\2)\u00ac\3\2\2\2+\u00b2\3"+
		"\2\2\2-\u00b5\3\2\2\2/\u00b9\3\2\2\2\61\u00bc\3\2\2\2\63\u00c3\3\2\2\2"+
		"\65\u00c8\3\2\2\2\67\u00cf\3\2\2\29\u00d4\3\2\2\2;\u00d6\3\2\2\2=\u00d8"+
		"\3\2\2\2?\u00da\3\2\2\2A\u00dc\3\2\2\2C\u00de\3\2\2\2E\u00e0\3\2\2\2G"+
		"\u00e2\3\2\2\2I\u00e4\3\2\2\2K\u00e6\3\2\2\2M\u00e8\3\2\2\2OT\5\5\3\2"+
		"PS\5\5\3\2QS\5\7\4\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2"+
		"U\4\3\2\2\2VT\3\2\2\2WY\t\2\2\2XW\3\2\2\2Y\6\3\2\2\2Z[\t\3\2\2[\b\3\2"+
		"\2\2\\]\7y\2\2]^\7t\2\2^_\7k\2\2_`\7v\2\2`a\7g\2\2a\n\3\2\2\2bc\7y\2\2"+
		"cd\7t\2\2de\7k\2\2ef\7v\2\2fg\7g\2\2gh\7n\2\2hi\7p\2\2i\f\3\2\2\2jk\7"+
		"t\2\2kl\7g\2\2lm\7c\2\2mn\7f\2\2n\16\3\2\2\2op\7c\2\2pq\7p\2\2qr\7f\2"+
		"\2r\20\3\2\2\2st\7q\2\2tu\7t\2\2u\22\3\2\2\2vw\7p\2\2wx\7q\2\2xy\7v\2"+
		"\2y\24\3\2\2\2z{\7k\2\2{|\7p\2\2|}\7v\2\2}\26\3\2\2\2~\177\7d\2\2\177"+
		"\u0080\7q\2\2\u0080\u0081\7q\2\2\u0081\u0082\7n\2\2\u0082\30\3\2\2\2\u0083"+
		"\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086\7c\2\2\u0086\u0087\7n\2\2"+
		"\u0087\32\3\2\2\2\u0088\u0089\7u\2\2\u0089\u008a\7v\2\2\u008a\u008b\7"+
		"t\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7i\2\2\u008e\34"+
		"\3\2\2\2\u008f\u0090\7x\2\2\u0090\u0091\7q\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0093\7f\2\2\u0093\36\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096"+
		"\u0097\7w\2\2\u0097\u0098\7g\2\2\u0098 \3\2\2\2\u0099\u009a\7h\2\2\u009a"+
		"\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2"+
		"\u009e\"\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7h\2\2\u00a1$\3\2\2\2"+
		"\u00a2\u00a3\7v\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa"+
		"\7u\2\2\u00aa\u00ab\7g\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae"+
		"\7j\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		"*\3\2\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7q\2\2\u00b4,\3\2\2\2\u00b5\u00b6"+
		"\7h\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7t\2\2\u00b8.\3\2\2\2\u00b9\u00ba"+
		"\7v\2\2\u00ba\u00bb\7q\2\2\u00bb\60\3\2\2\2\u00bc\u00bd\7f\2\2\u00bd\u00be"+
		"\7q\2\2\u00be\u00bf\7y\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1"+
		"\u00c2\7q\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7v\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\u00c7\7r\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7t\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7t\2\2"+
		"\u00cd\u00ce\7p\2\2\u00ce\66\3\2\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7"+
		"{\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3\7g\2\2\u00d38\3\2\2\2\u00d4\u00d5"+
		"\7?\2\2\u00d5:\3\2\2\2\u00d6\u00d7\7=\2\2\u00d7<\3\2\2\2\u00d8\u00d9\7"+
		".\2\2\u00d9>\3\2\2\2\u00da\u00db\7\60\2\2\u00db@\3\2\2\2\u00dc\u00dd\7"+
		"`\2\2\u00ddB\3\2\2\2\u00de\u00df\7*\2\2\u00dfD\3\2\2\2\u00e0\u00e1\7+"+
		"\2\2\u00e1F\3\2\2\2\u00e2\u00e3\7]\2\2\u00e3H\3\2\2\2\u00e4\u00e5\7_\2"+
		"\2\u00e5J\3\2\2\2\u00e6\u00e7\7}\2\2\u00e7L\3\2\2\2\u00e8\u00e9\7\177"+
		"\2\2\u00e9N\3\2\2\2\6\2RTX\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}