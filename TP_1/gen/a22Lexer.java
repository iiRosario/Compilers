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
		VOID_=1, TYPES=2, INT_P=3, BOOLEAN_P=4, FLOAT_P=5, STRING_P=6, VOID_P=7, 
		LP=8, EQUAL=9, RP=10, LSB=11, RSB=12, LB=13, RB=14, PLUS=15, MINUS=16, 
		TILDE=17, QM=18, MULTIPLY=19, DIVIDE=20, PERCENTAGE=21, LT=22, GT=23, 
		GTE=24, LTE=25, EQUALS=26, NEQUAL=27, AND=28, OR=29, ARROBA=30, WRITE=31, 
		WRITELN=32, SIZEOF=33, EPILOGO_TOKEN=34, OPERATORS=35, COMMA=36, BT=37, 
		TRUE=38, FALSE=39, LEAVE=40, RESTART=41, RETURN=42, IF=43, ELSE=44, THEN=45, 
		WHILE=46, DO=47, FINALLY=48, IDENTIFICATOR=49, LITERAL_I=50, LITERAL_R=51, 
		WHITE_SPACE=52, SINGLE_LINE_COMMENT=53, MULTIPLE_LINE_COMMENT=54, TERMINATORS=55, 
		STRING=56, ANY=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VOID_", "TYPES", "INT_", "BOOLEAN_", "FLOAT_", "STRING_", "INT_P", "BOOLEAN_P", 
			"FLOAT_P", "STRING_P", "VOID_P", "LP", "EQUAL", "RP", "LSB", "RSB", "LB", 
			"RB", "PLUS", "MINUS", "TILDE", "QM", "MULTIPLY", "DIVIDE", "PERCENTAGE", 
			"LT", "GT", "GTE", "LTE", "EQUALS", "NEQUAL", "AND", "OR", "ARROBA", 
			"WRITE", "WRITELN", "SIZEOF", "EPILOGO_TOKEN", "OPERATORS", "COMMA", 
			"BT", "TRUE", "FALSE", "LEAVE", "RESTART", "RETURN", "IF", "ELSE", "THEN", 
			"WHILE", "DO", "FINALLY", "IDENTIFICATOR", "LETRA", "LITERAL_I", "LITERAL_R", 
			"EXPONENT", "WHITE_SPACE", "SINGLE_LINE_COMMENT", "MULTIPLE_LINE_COMMENT", 
			"TERMINATORS", "STRING", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", null, "'<int>'", "'<bool>'", "'<float>'", "'<string>'", 
			"'<void>'", "'('", "'='", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", 
			"'~'", "'?'", "'*'", "'/'", "'%'", "'<'", "'>'", "'>='", "'<='", "'=='", 
			"'!='", "'&&'", "'||'", "'@'", "'write'", "'writeln'", "'sizeof'", "'>>'", 
			null, "','", "';'", "'true'", "'false'", "'leave'", "'restart'", "'return'", 
			"'if'", "'else'", "'then'", "'while'", "'do'", "'finally'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID_", "TYPES", "INT_P", "BOOLEAN_P", "FLOAT_P", "STRING_P", 
			"VOID_P", "LP", "EQUAL", "RP", "LSB", "RSB", "LB", "RB", "PLUS", "MINUS", 
			"TILDE", "QM", "MULTIPLY", "DIVIDE", "PERCENTAGE", "LT", "GT", "GTE", 
			"LTE", "EQUALS", "NEQUAL", "AND", "OR", "ARROBA", "WRITE", "WRITELN", 
			"SIZEOF", "EPILOGO_TOKEN", "OPERATORS", "COMMA", "BT", "TRUE", "FALSE", 
			"LEAVE", "RESTART", "RETURN", "IF", "ELSE", "THEN", "WHILE", "DO", "FINALLY", 
			"IDENTIFICATOR", "LITERAL_I", "LITERAL_R", "WHITE_SPACE", "SINGLE_LINE_COMMENT", 
			"MULTIPLE_LINE_COMMENT", "TERMINATORS", "STRING", "ANY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u01f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u008c\n"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5("+
		"\u012a\n(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-"+
		"\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\6\66\u016f"+
		"\n\66\r\66\16\66\u0170\3\66\7\66\u0174\n\66\f\66\16\66\u0177\13\66\3\66"+
		"\6\66\u017a\n\66\r\66\16\66\u017b\3\66\7\66\u017f\n\66\f\66\16\66\u0182"+
		"\13\66\3\66\6\66\u0185\n\66\r\66\16\66\u0186\6\66\u0189\n\66\r\66\16\66"+
		"\u018a\3\67\5\67\u018e\n\67\38\38\78\u0192\n8\f8\168\u0195\138\38\58\u0198"+
		"\n8\39\69\u019b\n9\r9\169\u019c\39\39\79\u01a1\n9\f9\169\u01a4\139\39"+
		"\59\u01a7\n9\39\39\69\u01ab\n9\r9\169\u01ac\39\59\u01b0\n9\39\69\u01b3"+
		"\n9\r9\169\u01b4\39\59\u01b8\n9\3:\3:\5:\u01bc\n:\3:\6:\u01bf\n:\r:\16"+
		":\u01c0\3;\6;\u01c4\n;\r;\16;\u01c5\3;\3;\3<\3<\3<\3<\7<\u01ce\n<\f<\16"+
		"<\u01d1\13<\3<\3<\3=\3=\3=\3=\7=\u01d9\n=\f=\16=\u01dc\13=\3=\3=\3=\3"+
		"=\3=\3>\3>\3>\5>\u01e6\n>\3?\3?\3?\3?\7?\u01ec\n?\f?\16?\u01ef\13?\3?"+
		"\3?\3@\3@\2\2A\3\3\5\4\7\2\t\2\13\2\r\2\17\5\21\6\23\7\25\b\27\t\31\n"+
		"\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67"+
		"\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e\60g\61"+
		"i\62k\63m\2o\64q\65s\2u\66w\67y8{9}:\177;\3\2\17\n\2\'\'*+--//>>@A]]_"+
		"_\3\2\62;\b\2C\\aac|\u00c2\u00d8\u00da\u00f8\u00fa\u0101\3\2\63;\3\2\62"+
		"\62\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2..==\3\2))\5\2"+
		"\2\2))\u0080\u0080\7\2))ppttvv\u0080\u0080\2\u0215\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\3\u0081\3\2\2\2\5\u008b\3\2\2\2\7\u008d\3\2\2\2\t\u0091\3"+
		"\2\2\2\13\u0099\3\2\2\2\r\u009f\3\2\2\2\17\u00a6\3\2\2\2\21\u00ac\3\2"+
		"\2\2\23\u00b3\3\2\2\2\25\u00bb\3\2\2\2\27\u00c4\3\2\2\2\31\u00cb\3\2\2"+
		"\2\33\u00cd\3\2\2\2\35\u00cf\3\2\2\2\37\u00d1\3\2\2\2!\u00d3\3\2\2\2#"+
		"\u00d5\3\2\2\2%\u00d7\3\2\2\2\'\u00d9\3\2\2\2)\u00db\3\2\2\2+\u00dd\3"+
		"\2\2\2-\u00df\3\2\2\2/\u00e1\3\2\2\2\61\u00e3\3\2\2\2\63\u00e5\3\2\2\2"+
		"\65\u00e7\3\2\2\2\67\u00e9\3\2\2\29\u00eb\3\2\2\2;\u00ee\3\2\2\2=\u00f1"+
		"\3\2\2\2?\u00f4\3\2\2\2A\u00f7\3\2\2\2C\u00fa\3\2\2\2E\u00fd\3\2\2\2G"+
		"\u00ff\3\2\2\2I\u0105\3\2\2\2K\u010d\3\2\2\2M\u0114\3\2\2\2O\u0129\3\2"+
		"\2\2Q\u012b\3\2\2\2S\u012d\3\2\2\2U\u012f\3\2\2\2W\u0134\3\2\2\2Y\u013a"+
		"\3\2\2\2[\u0140\3\2\2\2]\u0148\3\2\2\2_\u014f\3\2\2\2a\u0152\3\2\2\2c"+
		"\u0157\3\2\2\2e\u015c\3\2\2\2g\u0162\3\2\2\2i\u0165\3\2\2\2k\u0188\3\2"+
		"\2\2m\u018d\3\2\2\2o\u0197\3\2\2\2q\u01b7\3\2\2\2s\u01b9\3\2\2\2u\u01c3"+
		"\3\2\2\2w\u01c9\3\2\2\2y\u01d4\3\2\2\2{\u01e5\3\2\2\2}\u01e7\3\2\2\2\177"+
		"\u01f2\3\2\2\2\u0081\u0082\7x\2\2\u0082\u0083\7q\2\2\u0083\u0084\7k\2"+
		"\2\u0084\u0085\7f\2\2\u0085\4\3\2\2\2\u0086\u008c\5\7\4\2\u0087\u008c"+
		"\5\t\5\2\u0088\u008c\5\13\6\2\u0089\u008c\5\r\7\2\u008a\u008c\5\3\2\2"+
		"\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008a\3\2\2\2\u008c\6\3\2\2\2\u008d\u008e\7k\2\2\u008e"+
		"\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\b\3\2\2\2\u0091\u0092\7d\2\2\u0092"+
		"\u0093\7q\2\2\u0093\u0094\7q\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2"+
		"\u0096\u0097\7c\2\2\u0097\u0098\7p\2\2\u0098\n\3\2\2\2\u0099\u009a\7h"+
		"\2\2\u009a\u009b\7n\2\2\u009b\u009c\7q\2\2\u009c\u009d\7c\2\2\u009d\u009e"+
		"\7v\2\2\u009e\f\3\2\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2"+
		"\7t\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7i\2\2\u00a5"+
		"\16\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\u00aa\7v\2\2\u00aa\u00ab\7@\2\2\u00ab\20\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad"+
		"\u00ae\7d\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7n\2\2"+
		"\u00b1\u00b2\7@\2\2\u00b2\22\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4\u00b5\7"+
		"h\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9"+
		"\7v\2\2\u00b9\u00ba\7@\2\2\u00ba\24\3\2\2\2\u00bb\u00bc\7>\2\2\u00bc\u00bd"+
		"\7u\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7k\2\2\u00c0"+
		"\u00c1\7p\2\2\u00c1\u00c2\7i\2\2\u00c2\u00c3\7@\2\2\u00c3\26\3\2\2\2\u00c4"+
		"\u00c5\7>\2\2\u00c5\u00c6\7x\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7k\2\2"+
		"\u00c8\u00c9\7f\2\2\u00c9\u00ca\7@\2\2\u00ca\30\3\2\2\2\u00cb\u00cc\7"+
		"*\2\2\u00cc\32\3\2\2\2\u00cd\u00ce\7?\2\2\u00ce\34\3\2\2\2\u00cf\u00d0"+
		"\7+\2\2\u00d0\36\3\2\2\2\u00d1\u00d2\7]\2\2\u00d2 \3\2\2\2\u00d3\u00d4"+
		"\7_\2\2\u00d4\"\3\2\2\2\u00d5\u00d6\7}\2\2\u00d6$\3\2\2\2\u00d7\u00d8"+
		"\7\177\2\2\u00d8&\3\2\2\2\u00d9\u00da\7-\2\2\u00da(\3\2\2\2\u00db\u00dc"+
		"\7/\2\2\u00dc*\3\2\2\2\u00dd\u00de\7\u0080\2\2\u00de,\3\2\2\2\u00df\u00e0"+
		"\7A\2\2\u00e0.\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2\60\3\2\2\2\u00e3\u00e4"+
		"\7\61\2\2\u00e4\62\3\2\2\2\u00e5\u00e6\7\'\2\2\u00e6\64\3\2\2\2\u00e7"+
		"\u00e8\7>\2\2\u00e8\66\3\2\2\2\u00e9\u00ea\7@\2\2\u00ea8\3\2\2\2\u00eb"+
		"\u00ec\7@\2\2\u00ec\u00ed\7?\2\2\u00ed:\3\2\2\2\u00ee\u00ef\7>\2\2\u00ef"+
		"\u00f0\7?\2\2\u00f0<\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2\u00f3\7?\2\2\u00f3"+
		">\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\7?\2\2\u00f6@\3\2\2\2\u00f7\u00f8"+
		"\7(\2\2\u00f8\u00f9\7(\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7~\2\2\u00fb\u00fc"+
		"\7~\2\2\u00fcD\3\2\2\2\u00fd\u00fe\7B\2\2\u00feF\3\2\2\2\u00ff\u0100\7"+
		"y\2\2\u0100\u0101\7t\2\2\u0101\u0102\7k\2\2\u0102\u0103\7v\2\2\u0103\u0104"+
		"\7g\2\2\u0104H\3\2\2\2\u0105\u0106\7y\2\2\u0106\u0107\7t\2\2\u0107\u0108"+
		"\7k\2\2\u0108\u0109\7v\2\2\u0109\u010a\7g\2\2\u010a\u010b\7n\2\2\u010b"+
		"\u010c\7p\2\2\u010cJ\3\2\2\2\u010d\u010e\7u\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7|\2\2\u0110\u0111\7g\2\2\u0111\u0112\7q\2\2\u0112\u0113\7h\2\2"+
		"\u0113L\3\2\2\2\u0114\u0115\7@\2\2\u0115\u0116\7@\2\2\u0116N\3\2\2\2\u0117"+
		"\u012a\t\2\2\2\u0118\u0119\7@\2\2\u0119\u012a\7?\2\2\u011a\u011b\7>\2"+
		"\2\u011b\u012a\7?\2\2\u011c\u011d\7?\2\2\u011d\u012a\7?\2\2\u011e\u011f"+
		"\7#\2\2\u011f\u012a\7?\2\2\u0120\u012a\7\u0080\2\2\u0121\u0122\7(\2\2"+
		"\u0122\u012a\7(\2\2\u0123\u0124\7~\2\2\u0124\u012a\7~\2\2\u0125\u012a"+
		"\7?\2\2\u0126\u0127\7@\2\2\u0127\u012a\7@\2\2\u0128\u012a\7B\2\2\u0129"+
		"\u0117\3\2\2\2\u0129\u0118\3\2\2\2\u0129\u011a\3\2\2\2\u0129\u011c\3\2"+
		"\2\2\u0129\u011e\3\2\2\2\u0129\u0120\3\2\2\2\u0129\u0121\3\2\2\2\u0129"+
		"\u0123\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0128\3\2"+
		"\2\2\u012aP\3\2\2\2\u012b\u012c\7.\2\2\u012cR\3\2\2\2\u012d\u012e\7=\2"+
		"\2\u012eT\3\2\2\2\u012f\u0130\7v\2\2\u0130\u0131\7t\2\2\u0131\u0132\7"+
		"w\2\2\u0132\u0133\7g\2\2\u0133V\3\2\2\2\u0134\u0135\7h\2\2\u0135\u0136"+
		"\7c\2\2\u0136\u0137\7n\2\2\u0137\u0138\7u\2\2\u0138\u0139\7g\2\2\u0139"+
		"X\3\2\2\2\u013a\u013b\7n\2\2\u013b\u013c\7g\2\2\u013c\u013d\7c\2\2\u013d"+
		"\u013e\7x\2\2\u013e\u013f\7g\2\2\u013fZ\3\2\2\2\u0140\u0141\7t\2\2\u0141"+
		"\u0142\7g\2\2\u0142\u0143\7u\2\2\u0143\u0144\7v\2\2\u0144\u0145\7c\2\2"+
		"\u0145\u0146\7t\2\2\u0146\u0147\7v\2\2\u0147\\\3\2\2\2\u0148\u0149\7t"+
		"\2\2\u0149\u014a\7g\2\2\u014a\u014b\7v\2\2\u014b\u014c\7w\2\2\u014c\u014d"+
		"\7t\2\2\u014d\u014e\7p\2\2\u014e^\3\2\2\2\u014f\u0150\7k\2\2\u0150\u0151"+
		"\7h\2\2\u0151`\3\2\2\2\u0152\u0153\7g\2\2\u0153\u0154\7n\2\2\u0154\u0155"+
		"\7u\2\2\u0155\u0156\7g\2\2\u0156b\3\2\2\2\u0157\u0158\7v\2\2\u0158\u0159"+
		"\7j\2\2\u0159\u015a\7g\2\2\u015a\u015b\7p\2\2\u015bd\3\2\2\2\u015c\u015d"+
		"\7y\2\2\u015d\u015e\7j\2\2\u015e\u015f\7k\2\2\u015f\u0160\7n\2\2\u0160"+
		"\u0161\7g\2\2\u0161f\3\2\2\2\u0162\u0163\7f\2\2\u0163\u0164\7q\2\2\u0164"+
		"h\3\2\2\2\u0165\u0166\7h\2\2\u0166\u0167\7k\2\2\u0167\u0168\7p\2\2\u0168"+
		"\u0169\7c\2\2\u0169\u016a\7n\2\2\u016a\u016b\7n\2\2\u016b\u016c\7{\2\2"+
		"\u016cj\3\2\2\2\u016d\u016f\5m\67\2\u016e\u016d\3\2\2\2\u016f\u0170\3"+
		"\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0175\3\2\2\2\u0172"+
		"\u0174\t\3\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\u0189\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u017a\5m\67\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u0189\3\2\2\2\u017d\u017f\t\3\2\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0185\5m\67\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0189\3\2\2\2\u0188\u016e\3\2\2\2\u0188\u0179\3\2\2\2\u0188"+
		"\u0180\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018bl\3\2\2\2\u018c\u018e\t\4\2\2\u018d\u018c\3\2\2\2\u018en\3\2"+
		"\2\2\u018f\u0193\t\5\2\2\u0190\u0192\t\3\2\2\u0191\u0190\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0198\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0196\u0198\t\6\2\2\u0197\u018f\3\2\2\2\u0197"+
		"\u0196\3\2\2\2\u0198p\3\2\2\2\u0199\u019b\t\3\2\2\u019a\u0199\3\2\2\2"+
		"\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e"+
		"\3\2\2\2\u019e\u01a2\7\60\2\2\u019f\u01a1\t\3\2\2\u01a0\u019f\3\2\2\2"+
		"\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a6"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\5s:\2\u01a6\u01a5\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01b8\3\2\2\2\u01a8\u01aa\7\60\2\2\u01a9\u01ab\t"+
		"\3\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01b0\5s:\2\u01af\u01ae\3\2\2"+
		"\2\u01af\u01b0\3\2\2\2\u01b0\u01b8\3\2\2\2\u01b1\u01b3\t\3\2\2\u01b2\u01b1"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b8\5s:\2\u01b7\u019a\3\2\2\2\u01b7\u01a8\3\2\2"+
		"\2\u01b7\u01b2\3\2\2\2\u01b8r\3\2\2\2\u01b9\u01bb\t\7\2\2\u01ba\u01bc"+
		"\t\b\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd"+
		"\u01bf\t\3\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01be\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1t\3\2\2\2\u01c2\u01c4\t\t\2\2\u01c3\u01c2"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c8\b;\2\2\u01c8v\3\2\2\2\u01c9\u01ca\7%\2\2\u01ca"+
		"\u01cb\7%\2\2\u01cb\u01cf\3\2\2\2\u01cc\u01ce\n\n\2\2\u01cd\u01cc\3\2"+
		"\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\b<\2\2\u01d3x\3\2\2\2\u01d4"+
		"\u01d5\7*\2\2\u01d5\u01d6\7,\2\2\u01d6\u01da\3\2\2\2\u01d7\u01d9\13\2"+
		"\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\7,"+
		"\2\2\u01de\u01df\7+\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\b=\2\2\u01e1z"+
		"\3\2\2\2\u01e2\u01e6\t\13\2\2\u01e3\u01e4\7\"\2\2\u01e4\u01e6\7g\2\2\u01e5"+
		"\u01e2\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6|\3\2\2\2\u01e7\u01ed\t\f\2\2"+
		"\u01e8\u01ec\n\r\2\2\u01e9\u01ea\7\u0080\2\2\u01ea\u01ec\t\16\2\2\u01eb"+
		"\u01e8\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2"+
		"\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0"+
		"\u01f1\t\f\2\2\u01f1~\3\2\2\2\u01f2\u01f3\13\2\2\2\u01f3\u0080\3\2\2\2"+
		"\36\2\u008b\u0129\u0170\u0175\u017b\u0180\u0186\u0188\u018a\u018d\u0193"+
		"\u0197\u019c\u01a2\u01a6\u01ac\u01af\u01b4\u01b7\u01bb\u01c0\u01c5\u01cf"+
		"\u01da\u01e5\u01eb\u01ed\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}