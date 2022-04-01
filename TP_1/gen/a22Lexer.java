// Generated from C:/Users/diogo/Ambiente de Trabalho/Compilers/Compilers/TP_1/src\a22Lexer.g4 by ANTLR 4.9.2
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
		WHITE_SPACE=1, IDENTIFICATOR=2, LETTER=3, INTEGER=4, REAL_LITERAL=5, WRITE=6, 
		WRITELN=7, READ=8, AND=9, OR=10, NOT=11, INT=12, BOOL=13, REAL=14, STRING=15, 
		VOID=16, TRUE=17, FALSE=18, IF=19, THEN=20, ELSE=21, WHILE=22, DO=23, 
		FOR=24, TO=25, DOWNTO=26, STEP=27, RETURN=28, TYPE=29, ASSIGN=30, SEMICOLON=31, 
		COLON=32, POINT=33, CIRCUMFLEX=34, LEFT_BRACKET=35, RIGHT_BRACKET=36, 
		LEFT_SQUARE_BRACKET=37, RIGHT_SQUARE_BRACKET=38, LEFT_CURLY_BRACKET=39, 
		RIGHT_CURLY_BRACKET=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITE_SPACE", "IDENTIFICATOR", "LETTER", "INTEGER", "DIGIT", "REAL_LITERAL", 
			"WRITE", "WRITELN", "READ", "AND", "OR", "NOT", "INT", "BOOL", "REAL", 
			"STRING", "VOID", "TRUE", "FALSE", "IF", "THEN", "ELSE", "WHILE", "DO", 
			"FOR", "TO", "DOWNTO", "STEP", "RETURN", "TYPE", "ASSIGN", "SEMICOLON", 
			"COLON", "POINT", "CIRCUMFLEX", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SQUARE_BRACKET", 
			"RIGHT_SQUARE_BRACKET", "LEFT_CURLY_BRACKET", "RIGHT_CURLY_BRACKET"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'write'", "'writeln'", "'read'", 
			"'and'", "'or'", "'not'", "'int'", "'bool'", "'real'", "'string'", "'void'", 
			"'true'", "'false'", "'if'", "'then'", "'else'", "'while'", "'do'", "'for'", 
			"'to'", "'downto'", "'step'", "'return'", "'type'", "'='", "';'", "','", 
			"'.'", "'^'", "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITE_SPACE", "IDENTIFICATOR", "LETTER", "INTEGER", "REAL_LITERAL", 
			"WRITE", "WRITELN", "READ", "AND", "OR", "NOT", "INT", "BOOL", "REAL", 
			"STRING", "VOID", "TRUE", "FALSE", "IF", "THEN", "ELSE", "WHILE", "DO", 
			"FOR", "TO", "DOWNTO", "STEP", "RETURN", "TYPE", "ASSIGN", "SEMICOLON", 
			"COLON", "POINT", "CIRCUMFLEX", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SQUARE_BRACKET", 
			"RIGHT_SQUARE_BRACKET", "LEFT_CURLY_BRACKET", "RIGHT_CURLY_BRACKET"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u010a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\6\2"+
		"W\n\2\r\2\16\2X\3\2\3\2\3\3\3\3\3\3\7\3`\n\3\f\3\16\3c\13\3\3\4\5\4f\n"+
		"\4\3\5\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\3\6\3\6\3\7\6\7s\n\7\r\7\16\7t"+
		"\3\7\3\7\6\7y\n\7\r\7\16\7z\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\2"+
		"\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24"+
		")\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'"+
		"O(Q)S*\3\2\6\5\2\13\f\17\17\"\"\5\2C\\aac|\3\2\63;\3\2\62;\2\u010e\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3V\3\2\2\2\5\\\3"+
		"\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13o\3\2\2\2\rr\3\2\2\2\17|\3\2\2\2\21\u0082"+
		"\3\2\2\2\23\u008a\3\2\2\2\25\u008f\3\2\2\2\27\u0093\3\2\2\2\31\u0096\3"+
		"\2\2\2\33\u009a\3\2\2\2\35\u009e\3\2\2\2\37\u00a3\3\2\2\2!\u00a8\3\2\2"+
		"\2#\u00af\3\2\2\2%\u00b4\3\2\2\2\'\u00b9\3\2\2\2)\u00bf\3\2\2\2+\u00c2"+
		"\3\2\2\2-\u00c7\3\2\2\2/\u00cc\3\2\2\2\61\u00d2\3\2\2\2\63\u00d5\3\2\2"+
		"\2\65\u00d9\3\2\2\2\67\u00dc\3\2\2\29\u00e3\3\2\2\2;\u00e8\3\2\2\2=\u00ef"+
		"\3\2\2\2?\u00f4\3\2\2\2A\u00f6\3\2\2\2C\u00f8\3\2\2\2E\u00fa\3\2\2\2G"+
		"\u00fc\3\2\2\2I\u00fe\3\2\2\2K\u0100\3\2\2\2M\u0102\3\2\2\2O\u0104\3\2"+
		"\2\2Q\u0106\3\2\2\2S\u0108\3\2\2\2UW\t\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2"+
		"\2\2XY\3\2\2\2YZ\3\2\2\2Z[\b\2\2\2[\4\3\2\2\2\\a\5\7\4\2]`\5\7\4\2^`\5"+
		"\13\6\2_]\3\2\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\6\3\2\2\2c"+
		"a\3\2\2\2df\t\3\2\2ed\3\2\2\2f\b\3\2\2\2gh\7\62\2\2hl\t\4\2\2ik\5\13\6"+
		"\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\n\3\2\2\2nl\3\2\2\2op\t\5"+
		"\2\2p\f\3\2\2\2qs\t\5\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3"+
		"\2\2\2vx\5E#\2wy\t\5\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\16\3"+
		"\2\2\2|}\7y\2\2}~\7t\2\2~\177\7k\2\2\177\u0080\7v\2\2\u0080\u0081\7g\2"+
		"\2\u0081\20\3\2\2\2\u0082\u0083\7y\2\2\u0083\u0084\7t\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7v\2\2\u0086\u0087\7g\2\2\u0087\u0088\7n\2\2\u0088"+
		"\u0089\7p\2\2\u0089\22\3\2\2\2\u008a\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c"+
		"\u008d\7c\2\2\u008d\u008e\7f\2\2\u008e\24\3\2\2\2\u008f\u0090\7c\2\2\u0090"+
		"\u0091\7p\2\2\u0091\u0092\7f\2\2\u0092\26\3\2\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7t\2\2\u0095\30\3\2\2\2\u0096\u0097\7p\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7v\2\2\u0099\32\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c"+
		"\u009d\7v\2\2\u009d\34\3\2\2\2\u009e\u009f\7d\2\2\u009f\u00a0\7q\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7n\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7n\2\2\u00a7 \3\2\2\2\u00a8"+
		"\u00a9\7u\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7k\2\2"+
		"\u00ac\u00ad\7p\2\2\u00ad\u00ae\7i\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7x"+
		"\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7f\2\2\u00b3$\3"+
		"\2\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7w\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7c\2\2\u00bb"+
		"\u00bc\7n\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be(\3\2\2\2\u00bf"+
		"\u00c0\7k\2\2\u00c0\u00c1\7h\2\2\u00c1*\3\2\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		"\u00c4\7j\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7p\2\2\u00c6,\3\2\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7g\2\2"+
		"\u00cb.\3\2\2\2\u00cc\u00cd\7y\2\2\u00cd\u00ce\7j\2\2\u00ce\u00cf\7k\2"+
		"\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1\60\3\2\2\2\u00d2\u00d3"+
		"\7f\2\2\u00d3\u00d4\7q\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7"+
		"\7q\2\2\u00d7\u00d8\7t\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7v\2\2\u00da\u00db"+
		"\7q\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7q\2\2\u00de\u00df"+
		"\7y\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7q\2\2\u00e2"+
		"8\3\2\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"\u00e7\7r\2\2\u00e7:\3\2\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7v\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7p\2\2"+
		"\u00ee<\3\2\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7{\2\2\u00f1\u00f2\7r\2"+
		"\2\u00f2\u00f3\7g\2\2\u00f3>\3\2\2\2\u00f4\u00f5\7?\2\2\u00f5@\3\2\2\2"+
		"\u00f6\u00f7\7=\2\2\u00f7B\3\2\2\2\u00f8\u00f9\7.\2\2\u00f9D\3\2\2\2\u00fa"+
		"\u00fb\7\60\2\2\u00fbF\3\2\2\2\u00fc\u00fd\7`\2\2\u00fdH\3\2\2\2\u00fe"+
		"\u00ff\7*\2\2\u00ffJ\3\2\2\2\u0100\u0101\7+\2\2\u0101L\3\2\2\2\u0102\u0103"+
		"\7]\2\2\u0103N\3\2\2\2\u0104\u0105\7_\2\2\u0105P\3\2\2\2\u0106\u0107\7"+
		"}\2\2\u0107R\3\2\2\2\u0108\u0109\7\177\2\2\u0109T\3\2\2\2\n\2X_aeltz\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}