// Generated from C:\Users\diogo\Ambiente de Trabalho\Compilers\Compilers\TP_1\src\a22Lexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class a22LexerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, INT=3, STAR=4, SLASH=5, WS=6, IDENTIFICATOR=7, COMMENT=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "INT", "STAR", "SLASH", "WS", "IDENTIFICATOR", "LETRA", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", null, "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "INT", "STAR", "SLASH", "WS", "IDENTIFICATOR", 
			"COMMENT"
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


	public a22LexerLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nB\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\6\4\33\n\4\r\4\16\4\34\3\5\3\5\3\6\3\6\3\7\6\7$\n\7\r\7\16"+
		"\7%\3\7\3\7\3\b\6\b+\n\b\r\b\16\b,\3\b\7\b\60\n\b\f\b\16\b\63\13\b\6\b"+
		"\65\n\b\r\b\16\b\66\3\t\5\t:\n\t\3\n\3\n\7\n>\n\n\f\n\16\nA\13\n\2\2\13"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\n\3\2\6\5\2\13\13\17\17\"\"\3\2"+
		"\62;\5\2C\\aac|\3\2\f\f\2F\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5"+
		"\27\3\2\2\2\7\32\3\2\2\2\t\36\3\2\2\2\13 \3\2\2\2\r#\3\2\2\2\17\64\3\2"+
		"\2\2\219\3\2\2\2\23;\3\2\2\2\25\26\7-\2\2\26\4\3\2\2\2\27\30\7/\2\2\30"+
		"\6\3\2\2\2\31\33\4\62;\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34"+
		"\35\3\2\2\2\35\b\3\2\2\2\36\37\7,\2\2\37\n\3\2\2\2 !\7\61\2\2!\f\3\2\2"+
		"\2\"$\t\2\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\b"+
		"\7\2\2(\16\3\2\2\2)+\5\21\t\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2"+
		"-\61\3\2\2\2.\60\t\3\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\62\65\3\2\2\2\63\61\3\2\2\2\64*\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2"+
		"\2\66\67\3\2\2\2\67\20\3\2\2\28:\t\4\2\298\3\2\2\2:\22\3\2\2\2;?\7^\2"+
		"\2<>\n\5\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\24\3\2\2\2A?\3\2"+
		"\2\2\n\2\34%,\61\669?\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}