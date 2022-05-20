// Generated from C:/Users/diogo/Ambiente de Trabalho/Compilers/Compilers/TP_1/out/production/TP_1\a22Lexer.g4 by ANTLR 4.9.2
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
		PLUS_OP=1, MINUS_OP=2, MULTIPLICATION_OP=3, DIVISION_OP=4, REMAINDER_OP=5, 
		ASSIGN_OP=6, EQUAL=7, UNEQUAL=8, GREATER=9, LESS=10, GREATER_EQUAL=11, 
		LESS_EQUAL=12, AND=13, OR=14, NOT=15, TRUE=16, FALSE=17, BOOL=18, INT=19, 
		REAL=20, STRING=21, VOID=22, TYPE=23, WRITE=24, WRITELN=25, READ=26, IF=27, 
		THEN=28, ELSE=29, WHILE=30, DO=31, FOR=32, TO=33, DOWNTO=34, STEP=35, 
		RETURN=36, SEMICOLON=37, COMMA=38, CARET=39, PERIOD=40, LEFT_PARENTHESIS=41, 
		RIGHT_PARENTHESIS=42, LEFT_BRACKET=43, RIGHT_BRACKET=44, LEFT_CURLY=45, 
		RIGHT_CURLY=46, INT_LITERAL=47, REAL_LITERAL=48, STRING_LITERAL=49, IDENTIFIER=50, 
		WHITESPACE=51, SINGLE_LINE_COMMENT=52, MULTIPLE_LINE_COMMENT=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS_OP", "MINUS_OP", "MULTIPLICATION_OP", "DIVISION_OP", "REMAINDER_OP", 
			"ASSIGN_OP", "EQUAL", "UNEQUAL", "GREATER", "LESS", "GREATER_EQUAL", 
			"LESS_EQUAL", "AND", "OR", "NOT", "TRUE", "FALSE", "BOOL", "INT", "REAL", 
			"STRING", "VOID", "TYPE", "WRITE", "WRITELN", "READ", "IF", "THEN", "ELSE", 
			"WHILE", "DO", "FOR", "TO", "DOWNTO", "STEP", "RETURN", "SEMICOLON", 
			"COMMA", "CARET", "PERIOD", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_CURLY", "RIGHT_CURLY", "INT_LITERAL", 
			"REAL_LITERAL", "ESCAPE_SEQUENCE", "STRING_LITERAL", "LETTER", "IDENTIFIER", 
			"WHITESPACE", "SINGLE_LINE_COMMENT", "MULTIPLE_LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'and'", "'or'", "'not'", "'true'", "'false'", 
			"'bool'", "'int'", "'real'", "'string'", "'void'", "'type'", "'write'", 
			"'writeln'", "'read'", "'if'", "'then'", "'else'", "'while'", "'do'", 
			"'for'", "'to'", "'downto'", "'step'", "'return'", "';'", "','", "'^'", 
			"'.'", "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS_OP", "MINUS_OP", "MULTIPLICATION_OP", "DIVISION_OP", "REMAINDER_OP", 
			"ASSIGN_OP", "EQUAL", "UNEQUAL", "GREATER", "LESS", "GREATER_EQUAL", 
			"LESS_EQUAL", "AND", "OR", "NOT", "TRUE", "FALSE", "BOOL", "INT", "REAL", 
			"STRING", "VOID", "TYPE", "WRITE", "WRITELN", "READ", "IF", "THEN", "ELSE", 
			"WHILE", "DO", "FOR", "TO", "DOWNTO", "STEP", "RETURN", "SEMICOLON", 
			"COMMA", "CARET", "PERIOD", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_CURLY", "RIGHT_CURLY", "INT_LITERAL", 
			"REAL_LITERAL", "STRING_LITERAL", "IDENTIFIER", "WHITESPACE", "SINGLE_LINE_COMMENT", 
			"MULTIPLE_LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0164\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3"+
		"\60\3\60\7\60\u011d\n\60\f\60\16\60\u0120\13\60\5\60\u0122\n\60\3\61\3"+
		"\61\3\61\6\61\u0127\n\61\r\61\16\61\u0128\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\7\63\u0131\n\63\f\63\16\63\u0134\13\63\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\5\65\u013c\n\65\3\65\3\65\7\65\u0140\n\65\f\65\16\65\u0143\13\65\3\66"+
		"\6\66\u0146\n\66\r\66\16\66\u0147\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u0150"+
		"\n\67\f\67\16\67\u0153\13\67\3\67\3\67\38\38\38\38\78\u015b\n8\f8\168"+
		"\u015e\138\38\38\38\38\38\4\u0132\u015c\29\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\2e\63g\2i\64k\65m\66o\67\3\2\t\3\2\63;\3\2\62;\7"+
		"\2$$^^ppttvv\4\2C\\c|\4\2\62;aa\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u016c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2e\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2"+
		"\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17}\3\2\2\2"+
		"\21\u0080\3\2\2\2\23\u0083\3\2\2\2\25\u0085\3\2\2\2\27\u0087\3\2\2\2\31"+
		"\u008a\3\2\2\2\33\u008d\3\2\2\2\35\u0091\3\2\2\2\37\u0094\3\2\2\2!\u0098"+
		"\3\2\2\2#\u009d\3\2\2\2%\u00a3\3\2\2\2\'\u00a8\3\2\2\2)\u00ac\3\2\2\2"+
		"+\u00b1\3\2\2\2-\u00b8\3\2\2\2/\u00bd\3\2\2\2\61\u00c2\3\2\2\2\63\u00c8"+
		"\3\2\2\2\65\u00d0\3\2\2\2\67\u00d5\3\2\2\29\u00d8\3\2\2\2;\u00dd\3\2\2"+
		"\2=\u00e2\3\2\2\2?\u00e8\3\2\2\2A\u00eb\3\2\2\2C\u00ef\3\2\2\2E\u00f2"+
		"\3\2\2\2G\u00f9\3\2\2\2I\u00fe\3\2\2\2K\u0105\3\2\2\2M\u0107\3\2\2\2O"+
		"\u0109\3\2\2\2Q\u010b\3\2\2\2S\u010d\3\2\2\2U\u010f\3\2\2\2W\u0111\3\2"+
		"\2\2Y\u0113\3\2\2\2[\u0115\3\2\2\2]\u0117\3\2\2\2_\u0121\3\2\2\2a\u0123"+
		"\3\2\2\2c\u012a\3\2\2\2e\u012d\3\2\2\2g\u0137\3\2\2\2i\u013b\3\2\2\2k"+
		"\u0145\3\2\2\2m\u014b\3\2\2\2o\u0156\3\2\2\2qr\7-\2\2r\4\3\2\2\2st\7/"+
		"\2\2t\6\3\2\2\2uv\7,\2\2v\b\3\2\2\2wx\7\61\2\2x\n\3\2\2\2yz\7\'\2\2z\f"+
		"\3\2\2\2{|\7?\2\2|\16\3\2\2\2}~\7?\2\2~\177\7?\2\2\177\20\3\2\2\2\u0080"+
		"\u0081\7#\2\2\u0081\u0082\7?\2\2\u0082\22\3\2\2\2\u0083\u0084\7@\2\2\u0084"+
		"\24\3\2\2\2\u0085\u0086\7>\2\2\u0086\26\3\2\2\2\u0087\u0088\7@\2\2\u0088"+
		"\u0089\7?\2\2\u0089\30\3\2\2\2\u008a\u008b\7>\2\2\u008b\u008c\7?\2\2\u008c"+
		"\32\3\2\2\2\u008d\u008e\7c\2\2\u008e\u008f\7p\2\2\u008f\u0090\7f\2\2\u0090"+
		"\34\3\2\2\2\u0091\u0092\7q\2\2\u0092\u0093\7t\2\2\u0093\36\3\2\2\2\u0094"+
		"\u0095\7p\2\2\u0095\u0096\7q\2\2\u0096\u0097\7v\2\2\u0097 \3\2\2\2\u0098"+
		"\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a\u009b\7w\2\2\u009b\u009c\7g\2\2"+
		"\u009c\"\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7n"+
		"\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a2$\3\2\2\2\u00a3\u00a4"+
		"\7d\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"&\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7v\2\2\u00ab"+
		"(\3\2\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7c\2\2\u00af"+
		"\u00b0\7n\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7t\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7i\2\2"+
		"\u00b7,\3\2\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7k\2"+
		"\2\u00bb\u00bc\7f\2\2\u00bc.\3\2\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7"+
		"{\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7g\2\2\u00c1\60\3\2\2\2\u00c2\u00c3"+
		"\7y\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca\7t\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7n\2\2"+
		"\u00ce\u00cf\7p\2\2\u00cf\64\3\2\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7"+
		"g\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7f\2\2\u00d4\66\3\2\2\2\u00d5\u00d6"+
		"\7k\2\2\u00d6\u00d7\7h\2\2\u00d78\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da"+
		"\7j\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7p\2\2\u00dc:\3\2\2\2\u00dd\u00de"+
		"\7g\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7g\2\2\u00e1"+
		"<\3\2\2\2\u00e2\u00e3\7y\2\2\u00e3\u00e4\7j\2\2\u00e4\u00e5\7k\2\2\u00e5"+
		"\u00e6\7n\2\2\u00e6\u00e7\7g\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7f\2\2\u00e9"+
		"\u00ea\7q\2\2\u00ea@\3\2\2\2\u00eb\u00ec\7h\2\2\u00ec\u00ed\7q\2\2\u00ed"+
		"\u00ee\7t\2\2\u00eeB\3\2\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7q\2\2\u00f1"+
		"D\3\2\2\2\u00f2\u00f3\7f\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7y\2\2\u00f5"+
		"\u00f6\7p\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7q\2\2\u00f8F\3\2\2\2\u00f9"+
		"\u00fa\7u\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7r\2\2"+
		"\u00fdH\3\2\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7v\2"+
		"\2\u0101\u0102\7w\2\2\u0102\u0103\7t\2\2\u0103\u0104\7p\2\2\u0104J\3\2"+
		"\2\2\u0105\u0106\7=\2\2\u0106L\3\2\2\2\u0107\u0108\7.\2\2\u0108N\3\2\2"+
		"\2\u0109\u010a\7`\2\2\u010aP\3\2\2\2\u010b\u010c\7\60\2\2\u010cR\3\2\2"+
		"\2\u010d\u010e\7*\2\2\u010eT\3\2\2\2\u010f\u0110\7+\2\2\u0110V\3\2\2\2"+
		"\u0111\u0112\7]\2\2\u0112X\3\2\2\2\u0113\u0114\7_\2\2\u0114Z\3\2\2\2\u0115"+
		"\u0116\7}\2\2\u0116\\\3\2\2\2\u0117\u0118\7\177\2\2\u0118^\3\2\2\2\u0119"+
		"\u0122\7\62\2\2\u011a\u011e\t\2\2\2\u011b\u011d\t\3\2\2\u011c\u011b\3"+
		"\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0119\3\2\2\2\u0121\u011a\3\2"+
		"\2\2\u0122`\3\2\2\2\u0123\u0124\5_\60\2\u0124\u0126\7\60\2\2\u0125\u0127"+
		"\t\3\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129b\3\2\2\2\u012a\u012b\7^\2\2\u012b\u012c\t\4\2\2\u012c"+
		"d\3\2\2\2\u012d\u0132\7$\2\2\u012e\u0131\5c\62\2\u012f\u0131\13\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u0136\7$\2\2\u0136f\3\2\2\2\u0137\u0138\t\5\2\2\u0138h\3\2\2\2\u0139"+
		"\u013c\5g\64\2\u013a\u013c\7a\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2"+
		"\2\2\u013c\u0141\3\2\2\2\u013d\u0140\5g\64\2\u013e\u0140\t\6\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142j\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146"+
		"\t\7\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b\66\2\2\u014al\3\2\2\2"+
		"\u014b\u014c\7\61\2\2\u014c\u014d\7\61\2\2\u014d\u0151\3\2\2\2\u014e\u0150"+
		"\n\b\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\b\67"+
		"\2\2\u0155n\3\2\2\2\u0156\u0157\7\61\2\2\u0157\u0158\7,\2\2\u0158\u015c"+
		"\3\2\2\2\u0159\u015b\13\2\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2"+
		"\u015c\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015f\u0160\7,\2\2\u0160\u0161\7\61\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\b8\2\2\u0163p\3\2\2\2\16\2\u011e\u0121\u0128\u0130\u0132\u013b"+
		"\u013f\u0141\u0147\u0151\u015c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}