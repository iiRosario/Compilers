// Generated from C:/Users/diogo/Ambiente de Trabalho/Compilers/Compilers/TP_1/src\a22.g4 by ANTLR 4.9.2
package Interpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class a22 extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_binaries_op = 1, RULE_unary_op = 2, RULE_voidd = 3, 
		RULE_declaracoes = 4, RULE_declaracao = 5, RULE_declaracao_variavel = 6, 
		RULE_pointer_types = 7, RULE_declaracao_variavel_simples = 8, RULE_declaracao_variavel_inicializacao = 9, 
		RULE_exp_binarias = 10, RULE_exp_unario = 11, RULE_exp_number = 12, RULE_exp_qualquer = 13, 
		RULE_exp_parenteses = 14, RULE_exp_indexacao_de_ponteiro = 15, RULE_exp_md = 16, 
		RULE_exp_ss = 17, RULE_exp_comparadores = 18, RULE_exp_elogico = 19, RULE_exp_ologico = 20, 
		RULE_op_indexacao_de_ponteiro = 21, RULE_op_isne = 22, RULE_op_comparadores = 23, 
		RULE_op_elogico = 24, RULE_op_ologico = 25, RULE_op_soma = 26, RULE_op_subtrair = 27, 
		RULE_op_dividir = 28, RULE_op_multiplicar = 29, RULE_op_resto = 30, RULE_argumento_funcao = 31, 
		RULE_argumentos_funcao = 32, RULE_declaracao_funcao_void = 33, RULE_declaracao_funcao = 34, 
		RULE_bloco = 35, RULE_instrucoes_controle = 36, RULE_atribuicao = 37, 
		RULE_instrucao_condicional = 38, RULE_ciclo = 39, RULE_subbloco = 40, 
		RULE_prologo = 41, RULE_epilogo = 42, RULE_instrucoes = 43, RULE_return_exp = 44, 
		RULE_invocacao_funcoes = 45, RULE_invocacao_funcao = 46, RULE_invocacao_funcao_especial = 47, 
		RULE_arroba = 48, RULE_sizeof = 49, RULE_write = 50, RULE_writeln = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "binaries_op", "unary_op", "voidd", "declaracoes", "declaracao", 
			"declaracao_variavel", "pointer_types", "declaracao_variavel_simples", 
			"declaracao_variavel_inicializacao", "exp_binarias", "exp_unario", "exp_number", 
			"exp_qualquer", "exp_parenteses", "exp_indexacao_de_ponteiro", "exp_md", 
			"exp_ss", "exp_comparadores", "exp_elogico", "exp_ologico", "op_indexacao_de_ponteiro", 
			"op_isne", "op_comparadores", "op_elogico", "op_ologico", "op_soma", 
			"op_subtrair", "op_dividir", "op_multiplicar", "op_resto", "argumento_funcao", 
			"argumentos_funcao", "declaracao_funcao_void", "declaracao_funcao", "bloco", 
			"instrucoes_controle", "atribuicao", "instrucao_condicional", "ciclo", 
			"subbloco", "prologo", "epilogo", "instrucoes", "return_exp", "invocacao_funcoes", 
			"invocacao_funcao", "invocacao_funcao_especial", "arroba", "sizeof", 
			"write", "writeln"
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

	@Override
	public String getGrammarFileName() { return "a22.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public a22(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(a22.EOF, 0); }
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID_) | (1L << TYPES) | (1L << INT_P) | (1L << BOOLEAN_P) | (1L << FLOAT_P) | (1L << STRING_P) | (1L << VOID_P) | (1L << WHITE_SPACE))) != 0)) {
				{
				{
				setState(104);
				declaracoes();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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

	public static class Binaries_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(a22.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(a22.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(a22.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(a22.DIVIDE, 0); }
		public TerminalNode PERCENTAGE() { return getToken(a22.PERCENTAGE, 0); }
		public TerminalNode LT() { return getToken(a22.LT, 0); }
		public TerminalNode GT() { return getToken(a22.GT, 0); }
		public TerminalNode GTE() { return getToken(a22.GTE, 0); }
		public TerminalNode EQUALS() { return getToken(a22.EQUALS, 0); }
		public TerminalNode NEQUAL() { return getToken(a22.NEQUAL, 0); }
		public TerminalNode AND() { return getToken(a22.AND, 0); }
		public TerminalNode OR() { return getToken(a22.OR, 0); }
		public TerminalNode LSB() { return getToken(a22.LSB, 0); }
		public TerminalNode RSB() { return getToken(a22.RSB, 0); }
		public Binaries_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaries_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterBinaries_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitBinaries_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitBinaries_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binaries_opContext binaries_op() throws RecognitionException {
		Binaries_opContext _localctx = new Binaries_opContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_binaries_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSB) | (1L << RSB) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << PERCENTAGE) | (1L << LT) | (1L << GT) | (1L << GTE) | (1L << EQUALS) | (1L << NEQUAL) | (1L << AND) | (1L << OR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Unary_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(a22.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(a22.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(a22.TILDE, 0); }
		public TerminalNode QM() { return getToken(a22.QM, 0); }
		public TerminalNode LP() { return getToken(a22.LP, 0); }
		public TerminalNode RP() { return getToken(a22.RP, 0); }
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitUnary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitUnary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP) | (1L << RP) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << QM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VoiddContext extends ParserRuleContext {
		public TerminalNode VOID_() { return getToken(a22.VOID_, 0); }
		public VoiddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterVoidd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitVoidd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitVoidd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoiddContext voidd() throws RecognitionException {
		VoiddContext _localctx = new VoiddContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_voidd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(VOID_);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracoes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(118);
					declaracao();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(121); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public Declaracao_variavelContext declaracao_variavel() {
			return getRuleContext(Declaracao_variavelContext.class,0);
		}
		public Declaracao_funcao_voidContext declaracao_funcao_void() {
			return getRuleContext(Declaracao_funcao_voidContext.class,0);
		}
		public Declaracao_funcaoContext declaracao_funcao() {
			return getRuleContext(Declaracao_funcaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracao);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				declaracao_variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				declaracao_funcao_void();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				declaracao_funcao();
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

	public static class Declaracao_variavelContext extends ParserRuleContext {
		public Declaracao_variavel_simplesContext declaracao_variavel_simples() {
			return getRuleContext(Declaracao_variavel_simplesContext.class,0);
		}
		public Declaracao_variavel_inicializacaoContext declaracao_variavel_inicializacao() {
			return getRuleContext(Declaracao_variavel_inicializacaoContext.class,0);
		}
		public Declaracao_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterDeclaracao_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitDeclaracao_variavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitDeclaracao_variavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_variavelContext declaracao_variavel() throws RecognitionException {
		Declaracao_variavelContext _localctx = new Declaracao_variavelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracao_variavel);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				declaracao_variavel_simples();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				declaracao_variavel_inicializacao();
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

	public static class Pointer_typesContext extends ParserRuleContext {
		public TerminalNode INT_P() { return getToken(a22.INT_P, 0); }
		public TerminalNode BOOLEAN_P() { return getToken(a22.BOOLEAN_P, 0); }
		public TerminalNode FLOAT_P() { return getToken(a22.FLOAT_P, 0); }
		public TerminalNode STRING_P() { return getToken(a22.STRING_P, 0); }
		public TerminalNode VOID_P() { return getToken(a22.VOID_P, 0); }
		public Pointer_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterPointer_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitPointer_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitPointer_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_typesContext pointer_types() throws RecognitionException {
		Pointer_typesContext _localctx = new Pointer_typesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pointer_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_P) | (1L << BOOLEAN_P) | (1L << FLOAT_P) | (1L << STRING_P) | (1L << VOID_P))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Declaracao_variavel_simplesContext extends ParserRuleContext {
		public TerminalNode TYPES() { return getToken(a22.TYPES, 0); }
		public List<TerminalNode> IDENTIFICATOR() { return getTokens(a22.IDENTIFICATOR); }
		public TerminalNode IDENTIFICATOR(int i) {
			return getToken(a22.IDENTIFICATOR, i);
		}
		public TerminalNode BT() { return getToken(a22.BT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(a22.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(a22.COMMA, i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Pointer_typesContext pointer_types() {
			return getRuleContext(Pointer_typesContext.class,0);
		}
		public Declaracao_variavel_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_variavel_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterDeclaracao_variavel_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitDeclaracao_variavel_simples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitDeclaracao_variavel_simples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_variavel_simplesContext declaracao_variavel_simples() throws RecognitionException {
		Declaracao_variavel_simplesContext _localctx = new Declaracao_variavel_simplesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracao_variavel_simples);
		int _la;
		try {
			int _alt;
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPES:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(TYPES);
				setState(135);
				match(IDENTIFICATOR);
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(139);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(136);
							match(WHITE_SPACE);
							}
							}
							setState(141);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(142);
						match(COMMA);
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(143);
							match(WHITE_SPACE);
							}
							}
							setState(148);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(149);
						match(IDENTIFICATOR);
						}
						} 
					}
					setState(154);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(155);
					match(WHITE_SPACE);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(BT);
				}
				break;
			case INT_P:
			case BOOLEAN_P:
			case FLOAT_P:
			case STRING_P:
			case VOID_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				pointer_types();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(163);
					match(WHITE_SPACE);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(IDENTIFICATOR);
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(170);
							match(WHITE_SPACE);
							}
							}
							setState(175);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(176);
						match(COMMA);
						setState(180);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(177);
							match(WHITE_SPACE);
							}
							}
							setState(182);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(183);
						match(IDENTIFICATOR);
						}
						} 
					}
					setState(188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(189);
					match(WHITE_SPACE);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(BT);
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

	public static class Declaracao_variavel_inicializacaoContext extends ParserRuleContext {
		public TerminalNode TYPES() { return getToken(a22.TYPES, 0); }
		public TerminalNode IDENTIFICATOR() { return getToken(a22.IDENTIFICATOR, 0); }
		public TerminalNode EQUAL() { return getToken(a22.EQUAL, 0); }
		public TerminalNode BT() { return getToken(a22.BT, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public List<Exp_qualquerContext> exp_qualquer() {
			return getRuleContexts(Exp_qualquerContext.class);
		}
		public Exp_qualquerContext exp_qualquer(int i) {
			return getRuleContext(Exp_qualquerContext.class,i);
		}
		public Pointer_typesContext pointer_types() {
			return getRuleContext(Pointer_typesContext.class,0);
		}
		public TerminalNode LSB() { return getToken(a22.LSB, 0); }
		public TerminalNode RSB() { return getToken(a22.RSB, 0); }
		public Declaracao_variavel_inicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_variavel_inicializacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterDeclaracao_variavel_inicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitDeclaracao_variavel_inicializacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitDeclaracao_variavel_inicializacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_variavel_inicializacaoContext declaracao_variavel_inicializacao() throws RecognitionException {
		Declaracao_variavel_inicializacaoContext _localctx = new Declaracao_variavel_inicializacaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracao_variavel_inicializacao);
		int _la;
		try {
			int _alt;
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPES:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(TYPES);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(200);
					match(WHITE_SPACE);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(IDENTIFICATOR);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(207);
					match(WHITE_SPACE);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(EQUAL);
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(214);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(219);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(221); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(220);
						exp_qualquer();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(223); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(225);
					match(WHITE_SPACE);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				match(BT);
				}
				break;
			case INT_P:
			case BOOLEAN_P:
			case FLOAT_P:
			case STRING_P:
			case VOID_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				pointer_types();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(234);
					match(WHITE_SPACE);
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(IDENTIFICATOR);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(241);
					match(WHITE_SPACE);
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(EQUAL);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(248);
					match(WHITE_SPACE);
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				match(LSB);
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(255);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(262); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(261);
						exp_qualquer();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(264); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(266);
					match(WHITE_SPACE);
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(RSB);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(273);
					match(WHITE_SPACE);
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(279);
				match(BT);
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

	public static class Exp_binariasContext extends ParserRuleContext {
		public Exp_indexacao_de_ponteiroContext exp_indexacao_de_ponteiro() {
			return getRuleContext(Exp_indexacao_de_ponteiroContext.class,0);
		}
		public Exp_mdContext exp_md() {
			return getRuleContext(Exp_mdContext.class,0);
		}
		public Exp_ssContext exp_ss() {
			return getRuleContext(Exp_ssContext.class,0);
		}
		public Exp_comparadoresContext exp_comparadores() {
			return getRuleContext(Exp_comparadoresContext.class,0);
		}
		public Exp_ologicoContext exp_ologico() {
			return getRuleContext(Exp_ologicoContext.class,0);
		}
		public Exp_elogicoContext exp_elogico() {
			return getRuleContext(Exp_elogicoContext.class,0);
		}
		public Exp_binariasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_binarias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExp_binarias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExp_binarias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExp_binarias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_binariasContext exp_binarias() throws RecognitionException {
		Exp_binariasContext _localctx = new Exp_binariasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp_binarias);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				exp_indexacao_de_ponteiro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				exp_md();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				exp_ss();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				exp_comparadores();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				exp_ologico();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(288);
				exp_elogico();
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

	public static class Exp_unarioContext extends ParserRuleContext {
		public Exp_numberContext exp_number() {
			return getRuleContext(Exp_numberContext.class,0);
		}
		public Exp_parentesesContext exp_parenteses() {
			return getRuleContext(Exp_parentesesContext.class,0);
		}
		public Invocacao_funcoesContext invocacao_funcoes() {
			return getRuleContext(Invocacao_funcoesContext.class,0);
		}
		public TerminalNode IDENTIFICATOR() { return getToken(a22.IDENTIFICATOR, 0); }
		public TerminalNode TRUE() { return getToken(a22.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(a22.FALSE, 0); }
		public Op_isneContext op_isne() {
			return getRuleContext(Op_isneContext.class,0);
		}
		public Exp_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExp_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExp_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_unarioContext exp_unario() throws RecognitionException {
		Exp_unarioContext _localctx = new Exp_unarioContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp_unario);
		int _la;
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				exp_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				exp_parenteses();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				invocacao_funcoes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(IDENTIFICATOR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				op_isne();
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

	public static class Exp_numberContext extends ParserRuleContext {
		public TerminalNode LITERAL_I() { return getToken(a22.LITERAL_I, 0); }
		public TerminalNode LITERAL_R() { return getToken(a22.LITERAL_R, 0); }
		public Exp_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExp_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExp_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExp_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_numberContext exp_number() throws RecognitionException {
		Exp_numberContext _localctx = new Exp_numberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exp_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !(_la==LITERAL_I || _la==LITERAL_R) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Exp_qualquerContext extends ParserRuleContext {
		public Exp_binariasContext exp_binarias() {
			return getRuleContext(Exp_binariasContext.class,0);
		}
		public Exp_unarioContext exp_unario() {
			return getRuleContext(Exp_unarioContext.class,0);
		}
		public Exp_qualquerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_qualquer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExp_qualquer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExp_qualquer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExp_qualquer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_qualquerContext exp_qualquer() throws RecognitionException {
		Exp_qualquerContext _localctx = new Exp_qualquerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exp_qualquer);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				exp_binarias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				exp_unario();
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

	public static class Exp_parentesesContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(a22.LP, 0); }
		public Exp_qualquerContext exp_qualquer() {
			return getRuleContext(Exp_qualquerContext.class,0);
		}
		public TerminalNode RP() { return getToken(a22.RP, 0); }
		public Exp_parentesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_parenteses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExp_parenteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExp_parenteses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExp_parenteses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_parentesesContext exp_parenteses() throws RecognitionException {
		Exp_parentesesContext _localctx = new Exp_parentesesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp_parenteses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(LP);
			setState(306);
			exp_qualquer();
			setState(307);
			match(RP);
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

	public static class Exp_indexacao_de_ponteiroContext extends ParserRuleContext {
		public Op_indexacao_de_ponteiroContext op_indexacao_de_ponteiro() {
			return getRuleContext(Op_indexacao_de_ponteiroContext.class,0);
		}
		public List<Binaries_opContext> binaries_op() {
			return getRuleContexts(Binaries_opContext.class);
		}
		public Binaries_opContext binaries_op(int i) {
			return getRuleContext(Binaries_opContext.class,i);
		}
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Exp_indexacao_de_ponteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_indexacao_de_ponteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExp_indexacao_de_ponteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExp_indexacao_de_ponteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExp_indexacao_de_ponteiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_indexacao_de_ponteiroContext exp_indexacao_de_ponteiro() throws RecognitionException {
		Exp_indexacao_de_ponteiroContext _localctx = new Exp_indexacao_de_ponteiroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exp_indexacao_de_ponteiro);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			op_indexacao_de_ponteiro();
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WHITE_SPACE) {
						{
						{
						setState(310);
						match(WHITE_SPACE);
						}
						}
						setState(315);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(316);
					binaries_op();
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(317);
							match(WHITE_SPACE);
							}
							} 
						}
						setState(322);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
					}
					setState(323);
					exp_unario();
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class Exp_mdContext extends ParserRuleContext {
		public Op_multiplicarContext op_multiplicar() {
			return getRuleContext(Op_multiplicarContext.class,0);
		}
		public List<Binaries_opContext> binaries_op() {
			return getRuleContexts(Binaries_opContext.class);
		}
		public Binaries_opContext binaries_op(int i) {
			return getRuleContext(Binaries_opContext.class,i);
		}
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Op_dividirContext op_dividir() {
			return getRuleContext(Op_dividirContext.class,0);
		}
		public Op_restoContext op_resto() {
			return getRuleContext(Op_restoContext.class,0);
		}
		public Exp_mdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_md; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExp_md(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExp_md(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExp_md(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_mdContext exp_md() throws RecognitionException {
		Exp_mdContext _localctx = new Exp_mdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exp_md);
		int _la;
		try {
			int _alt;
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				op_multiplicar();
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(334);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(331);
							match(WHITE_SPACE);
							}
							}
							setState(336);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(337);
						binaries_op();
						setState(341);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(338);
								match(WHITE_SPACE);
								}
								} 
							}
							setState(343);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
						}
						setState(344);
						exp_unario();
						}
						} 
					}
					setState(350);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				op_dividir();
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(355);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(352);
							match(WHITE_SPACE);
							}
							}
							setState(357);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(358);
						binaries_op();
						setState(362);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(359);
								match(WHITE_SPACE);
								}
								} 
							}
							setState(364);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
						}
						setState(365);
						exp_unario();
						}
						} 
					}
					setState(371);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				op_resto();
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(376);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(373);
							match(WHITE_SPACE);
							}
							}
							setState(378);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(379);
						binaries_op();
						setState(383);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(380);
								match(WHITE_SPACE);
								}
								} 
							}
							setState(385);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
						}
						setState(386);
						exp_unario();
						}
						} 
					}
					setState(392);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class Exp_ssContext extends ParserRuleContext {
		public Op_somaContext op_soma() {
			return getRuleContext(Op_somaContext.class,0);
		}
		public List<Binaries_opContext> binaries_op() {
			return getRuleContexts(Binaries_opContext.class);
		}
		public Binaries_opContext binaries_op(int i) {
			return getRuleContext(Binaries_opContext.class,i);
		}
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Op_subtrairContext op_subtrair() {
			return getRuleContext(Op_subtrairContext.class,0);
		}
		public Exp_ssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_ss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExp_ss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExp_ss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExp_ss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_ssContext exp_ss() throws RecognitionException {
		Exp_ssContext _localctx = new Exp_ssContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp_ss);
		int _la;
		try {
			int _alt;
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				op_soma();
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(399);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(396);
							match(WHITE_SPACE);
							}
							}
							setState(401);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(402);
						binaries_op();
						setState(406);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(403);
								match(WHITE_SPACE);
								}
								} 
							}
							setState(408);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
						}
						setState(409);
						exp_unario();
						}
						} 
					}
					setState(415);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				op_subtrair();
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(420);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(417);
							match(WHITE_SPACE);
							}
							}
							setState(422);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(423);
						binaries_op();
						setState(427);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(424);
								match(WHITE_SPACE);
								}
								} 
							}
							setState(429);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
						}
						setState(430);
						exp_unario();
						}
						} 
					}
					setState(436);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class Exp_comparadoresContext extends ParserRuleContext {
		public Op_comparadoresContext op_comparadores() {
			return getRuleContext(Op_comparadoresContext.class,0);
		}
		public List<Binaries_opContext> binaries_op() {
			return getRuleContexts(Binaries_opContext.class);
		}
		public Binaries_opContext binaries_op(int i) {
			return getRuleContext(Binaries_opContext.class,i);
		}
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Exp_comparadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_comparadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExp_comparadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExp_comparadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExp_comparadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_comparadoresContext exp_comparadores() throws RecognitionException {
		Exp_comparadoresContext _localctx = new Exp_comparadoresContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp_comparadores);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			op_comparadores();
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WHITE_SPACE) {
						{
						{
						setState(440);
						match(WHITE_SPACE);
						}
						}
						setState(445);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(446);
					binaries_op();
					setState(450);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(447);
							match(WHITE_SPACE);
							}
							} 
						}
						setState(452);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
					}
					setState(453);
					exp_unario();
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class Exp_elogicoContext extends ParserRuleContext {
		public Op_elogicoContext op_elogico() {
			return getRuleContext(Op_elogicoContext.class,0);
		}
		public List<Binaries_opContext> binaries_op() {
			return getRuleContexts(Binaries_opContext.class);
		}
		public Binaries_opContext binaries_op(int i) {
			return getRuleContext(Binaries_opContext.class,i);
		}
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Exp_elogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_elogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExp_elogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExp_elogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExp_elogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_elogicoContext exp_elogico() throws RecognitionException {
		Exp_elogicoContext _localctx = new Exp_elogicoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp_elogico);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			op_elogico();
			setState(478);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WHITE_SPACE) {
						{
						{
						setState(461);
						match(WHITE_SPACE);
						}
						}
						setState(466);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(467);
					binaries_op();
					setState(471);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(468);
							match(WHITE_SPACE);
							}
							} 
						}
						setState(473);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					}
					setState(474);
					exp_unario();
					}
					} 
				}
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class Exp_ologicoContext extends ParserRuleContext {
		public Op_ologicoContext op_ologico() {
			return getRuleContext(Op_ologicoContext.class,0);
		}
		public List<Binaries_opContext> binaries_op() {
			return getRuleContexts(Binaries_opContext.class);
		}
		public Binaries_opContext binaries_op(int i) {
			return getRuleContext(Binaries_opContext.class,i);
		}
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Exp_ologicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_ologico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExp_ologico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExp_ologico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExp_ologico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_ologicoContext exp_ologico() throws RecognitionException {
		Exp_ologicoContext _localctx = new Exp_ologicoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exp_ologico);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			op_ologico();
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WHITE_SPACE) {
						{
						{
						setState(482);
						match(WHITE_SPACE);
						}
						}
						setState(487);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(488);
					binaries_op();
					setState(492);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(489);
							match(WHITE_SPACE);
							}
							} 
						}
						setState(494);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
					}
					setState(495);
					exp_unario();
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class Op_indexacao_de_ponteiroContext extends ParserRuleContext {
		public TerminalNode LSB() { return getToken(a22.LSB, 0); }
		public Exp_qualquerContext exp_qualquer() {
			return getRuleContext(Exp_qualquerContext.class,0);
		}
		public TerminalNode RSB() { return getToken(a22.RSB, 0); }
		public TerminalNode IDENTIFICATOR() { return getToken(a22.IDENTIFICATOR, 0); }
		public TerminalNode LITERAL_I() { return getToken(a22.LITERAL_I, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Op_indexacao_de_ponteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_indexacao_de_ponteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterOp_indexacao_de_ponteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitOp_indexacao_de_ponteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitOp_indexacao_de_ponteiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_indexacao_de_ponteiroContext op_indexacao_de_ponteiro() throws RecognitionException {
		Op_indexacao_de_ponteiroContext _localctx = new Op_indexacao_de_ponteiroContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_indexacao_de_ponteiro);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(502);
				match(WHITE_SPACE);
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFICATOR || _la==LITERAL_I) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(509);
			match(LSB);
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(510);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(516);
			exp_qualquer();
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(517);
				match(WHITE_SPACE);
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
			match(RSB);
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(524);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class Op_isneContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(a22.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(a22.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(a22.TILDE, 0); }
		public TerminalNode QM() { return getToken(a22.QM, 0); }
		public TerminalNode IDENTIFICATOR() { return getToken(a22.IDENTIFICATOR, 0); }
		public Exp_numberContext exp_number() {
			return getRuleContext(Exp_numberContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Op_isneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_isne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterOp_isne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitOp_isne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitOp_isne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_isneContext op_isne() throws RecognitionException {
		Op_isneContext _localctx = new Op_isneContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op_isne);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(530);
				match(WHITE_SPACE);
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << QM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICATOR:
				{
				setState(537);
				match(IDENTIFICATOR);
				}
				break;
			case LITERAL_I:
			case LITERAL_R:
				{
				setState(538);
				exp_number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(541);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class Op_comparadoresContext extends ParserRuleContext {
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public TerminalNode LT() { return getToken(a22.LT, 0); }
		public TerminalNode GT() { return getToken(a22.GT, 0); }
		public TerminalNode GTE() { return getToken(a22.GTE, 0); }
		public TerminalNode LTE() { return getToken(a22.LTE, 0); }
		public TerminalNode EQUALS() { return getToken(a22.EQUALS, 0); }
		public TerminalNode NEQUAL() { return getToken(a22.NEQUAL, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Op_comparadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_comparadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterOp_comparadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitOp_comparadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitOp_comparadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_comparadoresContext op_comparadores() throws RecognitionException {
		Op_comparadoresContext _localctx = new Op_comparadoresContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_op_comparadores);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			exp_unario();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(548);
				match(WHITE_SPACE);
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << GTE) | (1L << LTE) | (1L << EQUALS) | (1L << NEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(555);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(561);
			exp_unario();
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

	public static class Op_elogicoContext extends ParserRuleContext {
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public TerminalNode AND() { return getToken(a22.AND, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Op_elogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_elogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterOp_elogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitOp_elogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitOp_elogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_elogicoContext op_elogico() throws RecognitionException {
		Op_elogicoContext _localctx = new Op_elogicoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_op_elogico);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			exp_unario();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(564);
				match(WHITE_SPACE);
				}
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(570);
			match(AND);
			setState(574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(571);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(577);
			exp_unario();
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

	public static class Op_ologicoContext extends ParserRuleContext {
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public TerminalNode OR() { return getToken(a22.OR, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Op_ologicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_ologico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterOp_ologico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitOp_ologico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitOp_ologico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_ologicoContext op_ologico() throws RecognitionException {
		Op_ologicoContext _localctx = new Op_ologicoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_ologico);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			exp_unario();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(580);
				match(WHITE_SPACE);
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(586);
			match(OR);
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(587);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(593);
			exp_unario();
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

	public static class Op_somaContext extends ParserRuleContext {
		public Op_somaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_soma; }
	 
		public Op_somaContext() { }
		public void copyFrom(Op_somaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Op_soma_label_uniqueContext extends Op_somaContext {
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(a22.PLUS, 0); }
		public Op_soma_label_uniqueContext(Op_somaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterOp_soma_label_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitOp_soma_label_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitOp_soma_label_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_somaContext op_soma() throws RecognitionException {
		Op_somaContext _localctx = new Op_somaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_op_soma);
		try {
			_localctx = new Op_soma_label_uniqueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			exp_unario();
			setState(596);
			match(PLUS);
			setState(597);
			exp_unario();
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

	public static class Op_subtrairContext extends ParserRuleContext {
		public Op_subtrairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_subtrair; }
	 
		public Op_subtrairContext() { }
		public void copyFrom(Op_subtrairContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Op_subtrair_label_uniqueContext extends Op_subtrairContext {
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(a22.MINUS, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Op_subtrair_label_uniqueContext(Op_subtrairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterOp_subtrair_label_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitOp_subtrair_label_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitOp_subtrair_label_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_subtrairContext op_subtrair() throws RecognitionException {
		Op_subtrairContext _localctx = new Op_subtrairContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_op_subtrair);
		int _la;
		try {
			int _alt;
			_localctx = new Op_subtrair_label_uniqueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			exp_unario();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(600);
				match(WHITE_SPACE);
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(606);
			match(MINUS);
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(607);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(613);
			exp_unario();
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

	public static class Op_dividirContext extends ParserRuleContext {
		public Op_dividirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_dividir; }
	 
		public Op_dividirContext() { }
		public void copyFrom(Op_dividirContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Op_dividir_label_uniqueContext extends Op_dividirContext {
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(a22.DIVIDE, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Op_dividir_label_uniqueContext(Op_dividirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterOp_dividir_label_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitOp_dividir_label_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitOp_dividir_label_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_dividirContext op_dividir() throws RecognitionException {
		Op_dividirContext _localctx = new Op_dividirContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_op_dividir);
		int _la;
		try {
			int _alt;
			_localctx = new Op_dividir_label_uniqueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			exp_unario();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(616);
				match(WHITE_SPACE);
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(622);
			match(DIVIDE);
			setState(626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(623);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(629);
			exp_unario();
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

	public static class Op_multiplicarContext extends ParserRuleContext {
		public Op_multiplicarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicar; }
	 
		public Op_multiplicarContext() { }
		public void copyFrom(Op_multiplicarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Op_multiplicar_label_uniqueContext extends Op_multiplicarContext {
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(a22.MULTIPLY, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Op_multiplicar_label_uniqueContext(Op_multiplicarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterOp_multiplicar_label_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitOp_multiplicar_label_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitOp_multiplicar_label_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_multiplicarContext op_multiplicar() throws RecognitionException {
		Op_multiplicarContext _localctx = new Op_multiplicarContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_multiplicar);
		int _la;
		try {
			int _alt;
			_localctx = new Op_multiplicar_label_uniqueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			exp_unario();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(632);
				match(WHITE_SPACE);
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(638);
			match(MULTIPLY);
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(639);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(645);
			exp_unario();
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

	public static class Op_restoContext extends ParserRuleContext {
		public Op_restoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_resto; }
	 
		public Op_restoContext() { }
		public void copyFrom(Op_restoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Op_resto_label_uniqueContext extends Op_restoContext {
		public List<Exp_unarioContext> exp_unario() {
			return getRuleContexts(Exp_unarioContext.class);
		}
		public Exp_unarioContext exp_unario(int i) {
			return getRuleContext(Exp_unarioContext.class,i);
		}
		public TerminalNode PERCENTAGE() { return getToken(a22.PERCENTAGE, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Op_resto_label_uniqueContext(Op_restoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterOp_resto_label_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitOp_resto_label_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitOp_resto_label_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_restoContext op_resto() throws RecognitionException {
		Op_restoContext _localctx = new Op_restoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_resto);
		int _la;
		try {
			int _alt;
			_localctx = new Op_resto_label_uniqueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			exp_unario();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(648);
				match(WHITE_SPACE);
				}
				}
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(654);
			match(PERCENTAGE);
			setState(658);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(655);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(661);
			exp_unario();
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

	public static class Argumento_funcaoContext extends ParserRuleContext {
		public Argumento_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento_funcao; }
	 
		public Argumento_funcaoContext() { }
		public void copyFrom(Argumento_funcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Arg_funcao_pointers_labelContext extends Argumento_funcaoContext {
		public Pointer_typesContext pointer_types() {
			return getRuleContext(Pointer_typesContext.class,0);
		}
		public TerminalNode IDENTIFICATOR() { return getToken(a22.IDENTIFICATOR, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Arg_funcao_pointers_labelContext(Argumento_funcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterArg_funcao_pointers_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitArg_funcao_pointers_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitArg_funcao_pointers_label(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Arg_funcao_labelContext extends Argumento_funcaoContext {
		public TerminalNode TYPES() { return getToken(a22.TYPES, 0); }
		public TerminalNode IDENTIFICATOR() { return getToken(a22.IDENTIFICATOR, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Arg_funcao_labelContext(Argumento_funcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterArg_funcao_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitArg_funcao_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitArg_funcao_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argumento_funcaoContext argumento_funcao() throws RecognitionException {
		Argumento_funcaoContext _localctx = new Argumento_funcaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_argumento_funcao);
		int _la;
		try {
			int _alt;
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				_localctx = new Arg_funcao_labelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(663);
					match(WHITE_SPACE);
					}
					}
					setState(668);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(669);
				match(TYPES);
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(670);
					match(WHITE_SPACE);
					}
					}
					setState(675);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(676);
				match(IDENTIFICATOR);
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(677);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(682);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new Arg_funcao_pointers_labelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(683);
					match(WHITE_SPACE);
					}
					}
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(689);
				pointer_types();
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(690);
					match(WHITE_SPACE);
					}
					}
					setState(695);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(696);
				match(IDENTIFICATOR);
				setState(700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(697);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(702);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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

	public static class Argumentos_funcaoContext extends ParserRuleContext {
		public Argumentos_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos_funcao; }
	 
		public Argumentos_funcaoContext() { }
		public void copyFrom(Argumentos_funcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Args_funcao_labelContext extends Argumentos_funcaoContext {
		public List<Argumento_funcaoContext> argumento_funcao() {
			return getRuleContexts(Argumento_funcaoContext.class);
		}
		public Argumento_funcaoContext argumento_funcao(int i) {
			return getRuleContext(Argumento_funcaoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(a22.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(a22.COMMA, i);
		}
		public Args_funcao_labelContext(Argumentos_funcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterArgs_funcao_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitArgs_funcao_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitArgs_funcao_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argumentos_funcaoContext argumentos_funcao() throws RecognitionException {
		Argumentos_funcaoContext _localctx = new Argumentos_funcaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_argumentos_funcao);
		int _la;
		try {
			_localctx = new Args_funcao_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			argumento_funcao();
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(706);
				match(COMMA);
				setState(707);
				argumento_funcao();
				}
				}
				setState(712);
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

	public static class Declaracao_funcao_voidContext extends ParserRuleContext {
		public Declaracao_funcao_voidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_funcao_void; }
	 
		public Declaracao_funcao_voidContext() { }
		public void copyFrom(Declaracao_funcao_voidContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declaracao_funcao_void_labelContext extends Declaracao_funcao_voidContext {
		public VoiddContext voidd() {
			return getRuleContext(VoiddContext.class,0);
		}
		public TerminalNode IDENTIFICATOR() { return getToken(a22.IDENTIFICATOR, 0); }
		public TerminalNode LP() { return getToken(a22.LP, 0); }
		public TerminalNode RP() { return getToken(a22.RP, 0); }
		public TerminalNode LB() { return getToken(a22.LB, 0); }
		public TerminalNode RB() { return getToken(a22.RB, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public List<Argumentos_funcaoContext> argumentos_funcao() {
			return getRuleContexts(Argumentos_funcaoContext.class);
		}
		public Argumentos_funcaoContext argumentos_funcao(int i) {
			return getRuleContext(Argumentos_funcaoContext.class,i);
		}
		public List<Declaracao_variavelContext> declaracao_variavel() {
			return getRuleContexts(Declaracao_variavelContext.class);
		}
		public Declaracao_variavelContext declaracao_variavel(int i) {
			return getRuleContext(Declaracao_variavelContext.class,i);
		}
		public List<InstrucoesContext> instrucoes() {
			return getRuleContexts(InstrucoesContext.class);
		}
		public InstrucoesContext instrucoes(int i) {
			return getRuleContext(InstrucoesContext.class,i);
		}
		public Declaracao_funcao_void_labelContext(Declaracao_funcao_voidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterDeclaracao_funcao_void_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitDeclaracao_funcao_void_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitDeclaracao_funcao_void_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_funcao_voidContext declaracao_funcao_void() throws RecognitionException {
		Declaracao_funcao_voidContext _localctx = new Declaracao_funcao_voidContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declaracao_funcao_void);
		int _la;
		try {
			int _alt;
			_localctx = new Declaracao_funcao_void_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			voidd();
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(714);
				match(WHITE_SPACE);
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(720);
			match(IDENTIFICATOR);
			setState(721);
			match(LP);
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPES) | (1L << INT_P) | (1L << BOOLEAN_P) | (1L << FLOAT_P) | (1L << STRING_P) | (1L << VOID_P) | (1L << WHITE_SPACE))) != 0)) {
				{
				{
				setState(722);
				argumentos_funcao();
				}
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(728);
			match(RP);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(729);
				match(WHITE_SPACE);
				}
				}
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(735);
			match(LB);
			setState(739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(736);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPES) | (1L << INT_P) | (1L << BOOLEAN_P) | (1L << FLOAT_P) | (1L << STRING_P) | (1L << VOID_P))) != 0)) {
				{
				{
				setState(742);
				declaracao_variavel();
				}
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(748);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(754);
					instrucoes();
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(760);
				match(WHITE_SPACE);
				}
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(766);
			match(RB);
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

	public static class Declaracao_funcaoContext extends ParserRuleContext {
		public Declaracao_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_funcao; }
	 
		public Declaracao_funcaoContext() { }
		public void copyFrom(Declaracao_funcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declaracao_funcao_labelContext extends Declaracao_funcaoContext {
		public TerminalNode TYPES() { return getToken(a22.TYPES, 0); }
		public TerminalNode IDENTIFICATOR() { return getToken(a22.IDENTIFICATOR, 0); }
		public TerminalNode LP() { return getToken(a22.LP, 0); }
		public TerminalNode RP() { return getToken(a22.RP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public List<Argumentos_funcaoContext> argumentos_funcao() {
			return getRuleContexts(Argumentos_funcaoContext.class);
		}
		public Argumentos_funcaoContext argumentos_funcao(int i) {
			return getRuleContext(Argumentos_funcaoContext.class,i);
		}
		public PrologoContext prologo() {
			return getRuleContext(PrologoContext.class,0);
		}
		public EpilogoContext epilogo() {
			return getRuleContext(EpilogoContext.class,0);
		}
		public Declaracao_funcao_labelContext(Declaracao_funcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterDeclaracao_funcao_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitDeclaracao_funcao_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitDeclaracao_funcao_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_funcaoContext declaracao_funcao() throws RecognitionException {
		Declaracao_funcaoContext _localctx = new Declaracao_funcaoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_declaracao_funcao);
		int _la;
		try {
			int _alt;
			_localctx = new Declaracao_funcao_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(768);
				match(WHITE_SPACE);
				}
				}
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(774);
			match(TYPES);
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(775);
				match(WHITE_SPACE);
				}
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(781);
			match(IDENTIFICATOR);
			setState(782);
			match(LP);
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPES) | (1L << INT_P) | (1L << BOOLEAN_P) | (1L << FLOAT_P) | (1L << STRING_P) | (1L << VOID_P) | (1L << WHITE_SPACE))) != 0)) {
				{
				{
				setState(783);
				argumentos_funcao();
				}
				}
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(789);
			match(RP);
			setState(793);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(790);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(795);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROBA || _la==WHITE_SPACE) {
				{
				setState(796);
				prologo();
				}
			}

			setState(799);
			bloco();
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(800);
				epilogo();
				}
				break;
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

	public static class BlocoContext extends ParserRuleContext {
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	 
		public BlocoContext() { }
		public void copyFrom(BlocoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Bloco_labelContext extends BlocoContext {
		public TerminalNode LB() { return getToken(a22.LB, 0); }
		public Return_expContext return_exp() {
			return getRuleContext(Return_expContext.class,0);
		}
		public TerminalNode RB() { return getToken(a22.RB, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public List<Declaracao_variavelContext> declaracao_variavel() {
			return getRuleContexts(Declaracao_variavelContext.class);
		}
		public Declaracao_variavelContext declaracao_variavel(int i) {
			return getRuleContext(Declaracao_variavelContext.class,i);
		}
		public List<InstrucoesContext> instrucoes() {
			return getRuleContexts(InstrucoesContext.class);
		}
		public InstrucoesContext instrucoes(int i) {
			return getRuleContext(InstrucoesContext.class,i);
		}
		public Bloco_labelContext(BlocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterBloco_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitBloco_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitBloco_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_bloco);
		int _la;
		try {
			int _alt;
			_localctx = new Bloco_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(LB);
			setState(807);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(804);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(809);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPES) | (1L << INT_P) | (1L << BOOLEAN_P) | (1L << FLOAT_P) | (1L << STRING_P) | (1L << VOID_P))) != 0)) {
				{
				{
				setState(810);
				declaracao_variavel();
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(819);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(816);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(821);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(825);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(822);
					instrucoes();
					}
					} 
				}
				setState(827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(828);
				match(WHITE_SPACE);
				}
				}
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(834);
			return_exp();
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(835);
				match(WHITE_SPACE);
				}
				}
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(841);
			match(RB);
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

	public static class Instrucoes_controleContext extends ParserRuleContext {
		public Instrucoes_controleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucoes_controle; }
	 
		public Instrucoes_controleContext() { }
		public void copyFrom(Instrucoes_controleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Restart_labelContext extends Instrucoes_controleContext {
		public TerminalNode RESTART() { return getToken(a22.RESTART, 0); }
		public Restart_labelContext(Instrucoes_controleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterRestart_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitRestart_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitRestart_label(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Leave_labelContext extends Instrucoes_controleContext {
		public TerminalNode LEAVE() { return getToken(a22.LEAVE, 0); }
		public Leave_labelContext(Instrucoes_controleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterLeave_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitLeave_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitLeave_label(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstCont_Return_exp_labelContext extends Instrucoes_controleContext {
		public Return_expContext return_exp() {
			return getRuleContext(Return_expContext.class,0);
		}
		public InstCont_Return_exp_labelContext(Instrucoes_controleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInstCont_Return_exp_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInstCont_Return_exp_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInstCont_Return_exp_label(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Return_labelContext extends Instrucoes_controleContext {
		public TerminalNode RETURN() { return getToken(a22.RETURN, 0); }
		public Return_labelContext(Instrucoes_controleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterReturn_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitReturn_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitReturn_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrucoes_controleContext instrucoes_controle() throws RecognitionException {
		Instrucoes_controleContext _localctx = new Instrucoes_controleContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_instrucoes_controle);
		try {
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				_localctx = new Leave_labelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				match(LEAVE);
				}
				break;
			case 2:
				_localctx = new Restart_labelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				match(RESTART);
				}
				break;
			case 3:
				_localctx = new Return_labelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(845);
				match(RETURN);
				}
				break;
			case 4:
				_localctx = new InstCont_Return_exp_labelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(846);
				return_exp();
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	 
		public AtribuicaoContext() { }
		public void copyFrom(AtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Atribuicao_labelContext extends AtribuicaoContext {
		public TerminalNode EQUAL() { return getToken(a22.EQUAL, 0); }
		public Exp_qualquerContext exp_qualquer() {
			return getRuleContext(Exp_qualquerContext.class,0);
		}
		public TerminalNode BT() { return getToken(a22.BT, 0); }
		public TerminalNode IDENTIFICATOR() { return getToken(a22.IDENTIFICATOR, 0); }
		public Exp_indexacao_de_ponteiroContext exp_indexacao_de_ponteiro() {
			return getRuleContext(Exp_indexacao_de_ponteiroContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Atribuicao_labelContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterAtribuicao_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitAtribuicao_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitAtribuicao_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_atribuicao);
		int _la;
		try {
			int _alt;
			_localctx = new Atribuicao_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(849);
				match(IDENTIFICATOR);
				}
				break;
			case 2:
				{
				setState(850);
				exp_indexacao_de_ponteiro();
				}
				break;
			}
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(853);
				match(WHITE_SPACE);
				}
				}
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(859);
			match(EQUAL);
			setState(863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(860);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			setState(866);
			exp_qualquer();
			setState(867);
			match(BT);
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

	public static class Instrucao_condicionalContext extends ParserRuleContext {
		public Instrucao_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_condicional; }
	 
		public Instrucao_condicionalContext() { }
		public void copyFrom(Instrucao_condicionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Instrucao_condicional_labelContext extends Instrucao_condicionalContext {
		public TerminalNode IF() { return getToken(a22.IF, 0); }
		public Exp_qualquerContext exp_qualquer() {
			return getRuleContext(Exp_qualquerContext.class,0);
		}
		public TerminalNode THEN() { return getToken(a22.THEN, 0); }
		public List<InstrucoesContext> instrucoes() {
			return getRuleContexts(InstrucoesContext.class);
		}
		public InstrucoesContext instrucoes(int i) {
			return getRuleContext(InstrucoesContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public TerminalNode ELSE() { return getToken(a22.ELSE, 0); }
		public Instrucao_condicional_labelContext(Instrucao_condicionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInstrucao_condicional_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInstrucao_condicional_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInstrucao_condicional_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrucao_condicionalContext instrucao_condicional() throws RecognitionException {
		Instrucao_condicionalContext _localctx = new Instrucao_condicionalContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_instrucao_condicional);
		int _la;
		try {
			int _alt;
			_localctx = new Instrucao_condicional_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(IF);
			setState(873);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(870);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(875);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(876);
			exp_qualquer();
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(877);
				match(WHITE_SPACE);
				}
				}
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(883);
			match(THEN);
			setState(887);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(884);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			setState(890);
			instrucoes();
			setState(894);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(891);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(897);
				match(ELSE);
				setState(901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(898);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(903);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
				}
				setState(904);
				instrucoes();
				setState(908);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(905);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(910);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				}
				break;
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

	public static class CicloContext extends ParserRuleContext {
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
	 
		public CicloContext() { }
		public void copyFrom(CicloContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Ciclo_labelContext extends CicloContext {
		public TerminalNode WHILE() { return getToken(a22.WHILE, 0); }
		public Exp_qualquerContext exp_qualquer() {
			return getRuleContext(Exp_qualquerContext.class,0);
		}
		public TerminalNode DO() { return getToken(a22.DO, 0); }
		public List<InstrucoesContext> instrucoes() {
			return getRuleContexts(InstrucoesContext.class);
		}
		public InstrucoesContext instrucoes(int i) {
			return getRuleContext(InstrucoesContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public TerminalNode FINALLY() { return getToken(a22.FINALLY, 0); }
		public Ciclo_labelContext(CicloContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterCiclo_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitCiclo_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitCiclo_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ciclo);
		int _la;
		try {
			int _alt;
			_localctx = new Ciclo_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(WHILE);
			setState(914);
			exp_qualquer();
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(915);
				match(WHITE_SPACE);
				}
				}
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(921);
			match(DO);
			setState(925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(922);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(928);
			instrucoes();
			setState(932);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(929);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(935);
				match(FINALLY);
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(936);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(941);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				}
				setState(942);
				instrucoes();
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(943);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(948);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				}
				}
				break;
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

	public static class SubblocoContext extends ParserRuleContext {
		public SubblocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subbloco; }
	 
		public SubblocoContext() { }
		public void copyFrom(SubblocoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Subbloco_labelContext extends SubblocoContext {
		public TerminalNode LB() { return getToken(a22.LB, 0); }
		public TerminalNode RB() { return getToken(a22.RB, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public List<InstrucoesContext> instrucoes() {
			return getRuleContexts(InstrucoesContext.class);
		}
		public InstrucoesContext instrucoes(int i) {
			return getRuleContext(InstrucoesContext.class,i);
		}
		public Subbloco_labelContext(SubblocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterSubbloco_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitSubbloco_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitSubbloco_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubblocoContext subbloco() throws RecognitionException {
		SubblocoContext _localctx = new SubblocoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_subbloco);
		int _la;
		try {
			int _alt;
			_localctx = new Subbloco_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(LB);
			setState(955);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(952);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP) | (1L << LB) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << QM) | (1L << ARROBA) | (1L << WRITE) | (1L << WRITELN) | (1L << SIZEOF) | (1L << TRUE) | (1L << FALSE) | (1L << LEAVE) | (1L << RESTART) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << IDENTIFICATOR) | (1L << LITERAL_I) | (1L << LITERAL_R) | (1L << WHITE_SPACE))) != 0)) {
				{
				{
				setState(958);
				instrucoes();
				setState(962);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(959);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(964);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				}
				}
				}
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(970);
			match(RB);
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

	public static class PrologoContext extends ParserRuleContext {
		public PrologoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prologo; }
	 
		public PrologoContext() { }
		public void copyFrom(PrologoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Prologo_labelContext extends PrologoContext {
		public TerminalNode ARROBA() { return getToken(a22.ARROBA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Prologo_labelContext(PrologoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterPrologo_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitPrologo_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitPrologo_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrologoContext prologo() throws RecognitionException {
		PrologoContext _localctx = new PrologoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_prologo);
		int _la;
		try {
			_localctx = new Prologo_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(972);
				match(WHITE_SPACE);
				}
				}
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(978);
			match(ARROBA);
			setState(979);
			bloco();
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

	public static class EpilogoContext extends ParserRuleContext {
		public EpilogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epilogo; }
	 
		public EpilogoContext() { }
		public void copyFrom(EpilogoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Epilogo_labelContext extends EpilogoContext {
		public TerminalNode EPILOGO_TOKEN() { return getToken(a22.EPILOGO_TOKEN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Epilogo_labelContext(EpilogoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterEpilogo_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitEpilogo_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitEpilogo_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EpilogoContext epilogo() throws RecognitionException {
		EpilogoContext _localctx = new EpilogoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_epilogo);
		int _la;
		try {
			_localctx = new Epilogo_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(981);
				match(WHITE_SPACE);
				}
				}
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(987);
			match(EPILOGO_TOKEN);
			setState(988);
			bloco();
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

	public static class InstrucoesContext extends ParserRuleContext {
		public InstrucoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucoes; }
	 
		public InstrucoesContext() { }
		public void copyFrom(InstrucoesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Instrucoes_exp_qualquerContext extends InstrucoesContext {
		public Exp_qualquerContext exp_qualquer() {
			return getRuleContext(Exp_qualquerContext.class,0);
		}
		public Instrucoes_exp_qualquerContext(InstrucoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInstrucoes_exp_qualquer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInstrucoes_exp_qualquer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInstrucoes_exp_qualquer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instrucoes_atribuicaoContext extends InstrucoesContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public Instrucoes_atribuicaoContext(InstrucoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInstrucoes_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInstrucoes_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInstrucoes_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instrucoes_instrucoes_controleContext extends InstrucoesContext {
		public Instrucoes_controleContext instrucoes_controle() {
			return getRuleContext(Instrucoes_controleContext.class,0);
		}
		public Instrucoes_instrucoes_controleContext(InstrucoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInstrucoes_instrucoes_controle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInstrucoes_instrucoes_controle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInstrucoes_instrucoes_controle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instrucoes_cicloContext extends InstrucoesContext {
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public Instrucoes_cicloContext(InstrucoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInstrucoes_ciclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInstrucoes_ciclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInstrucoes_ciclo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instrucoes_subblocoContext extends InstrucoesContext {
		public SubblocoContext subbloco() {
			return getRuleContext(SubblocoContext.class,0);
		}
		public Instrucoes_subblocoContext(InstrucoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInstrucoes_subbloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInstrucoes_subbloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInstrucoes_subbloco(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Instrucoes_instrucao_condicionalContext extends InstrucoesContext {
		public Instrucao_condicionalContext instrucao_condicional() {
			return getRuleContext(Instrucao_condicionalContext.class,0);
		}
		public Instrucoes_instrucao_condicionalContext(InstrucoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInstrucoes_instrucao_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInstrucoes_instrucao_condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInstrucoes_instrucao_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucoesContext instrucoes() throws RecognitionException {
		InstrucoesContext _localctx = new InstrucoesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_instrucoes);
		try {
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				_localctx = new Instrucoes_exp_qualquerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				exp_qualquer();
				}
				break;
			case 2:
				_localctx = new Instrucoes_instrucoes_controleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				instrucoes_controle();
				}
				break;
			case 3:
				_localctx = new Instrucoes_atribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(992);
				atribuicao();
				}
				break;
			case 4:
				_localctx = new Instrucoes_instrucao_condicionalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(993);
				instrucao_condicional();
				}
				break;
			case 5:
				_localctx = new Instrucoes_cicloContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(994);
				ciclo();
				}
				break;
			case 6:
				_localctx = new Instrucoes_subblocoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(995);
				subbloco();
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

	public static class Return_expContext extends ParserRuleContext {
		public Return_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_exp; }
	 
		public Return_expContext() { }
		public void copyFrom(Return_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Return_exp_labelContext extends Return_expContext {
		public TerminalNode RETURN() { return getToken(a22.RETURN, 0); }
		public Exp_qualquerContext exp_qualquer() {
			return getRuleContext(Exp_qualquerContext.class,0);
		}
		public TerminalNode BT() { return getToken(a22.BT, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Return_exp_labelContext(Return_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterReturn_exp_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitReturn_exp_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitReturn_exp_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_expContext return_exp() throws RecognitionException {
		Return_expContext _localctx = new Return_expContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_return_exp);
		try {
			int _alt;
			_localctx = new Return_exp_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(RETURN);
			setState(1002);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(999);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			setState(1005);
			exp_qualquer();
			setState(1006);
			match(BT);
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

	public static class Invocacao_funcoesContext extends ParserRuleContext {
		public Invocacao_funcoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocacao_funcoes; }
	 
		public Invocacao_funcoesContext() { }
		public void copyFrom(Invocacao_funcoesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InvFunc_invocao_funcaoContext extends Invocacao_funcoesContext {
		public Invocacao_funcaoContext invocacao_funcao() {
			return getRuleContext(Invocacao_funcaoContext.class,0);
		}
		public InvFunc_invocao_funcaoContext(Invocacao_funcoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInvFunc_invocao_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInvFunc_invocao_funcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInvFunc_invocao_funcao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvFunc_funcao_especialContext extends Invocacao_funcoesContext {
		public Invocacao_funcao_especialContext invocacao_funcao_especial() {
			return getRuleContext(Invocacao_funcao_especialContext.class,0);
		}
		public InvFunc_funcao_especialContext(Invocacao_funcoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInvFunc_funcao_especial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInvFunc_funcao_especial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInvFunc_funcao_especial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Invocacao_funcoesContext invocacao_funcoes() throws RecognitionException {
		Invocacao_funcoesContext _localctx = new Invocacao_funcoesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_invocacao_funcoes);
		try {
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				_localctx = new InvFunc_invocao_funcaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1008);
				invocacao_funcao();
				}
				break;
			case 2:
				_localctx = new InvFunc_funcao_especialContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1009);
				invocacao_funcao_especial();
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

	public static class Invocacao_funcaoContext extends ParserRuleContext {
		public Invocacao_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocacao_funcao; }
	 
		public Invocacao_funcaoContext() { }
		public void copyFrom(Invocacao_funcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Invocacao_funcao_labelContext extends Invocacao_funcaoContext {
		public TerminalNode IDENTIFICATOR() { return getToken(a22.IDENTIFICATOR, 0); }
		public TerminalNode LP() { return getToken(a22.LP, 0); }
		public TerminalNode RP() { return getToken(a22.RP, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public List<Exp_qualquerContext> exp_qualquer() {
			return getRuleContexts(Exp_qualquerContext.class);
		}
		public Exp_qualquerContext exp_qualquer(int i) {
			return getRuleContext(Exp_qualquerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(a22.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(a22.COMMA, i);
		}
		public Invocacao_funcao_labelContext(Invocacao_funcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInvocacao_funcao_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInvocacao_funcao_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInvocacao_funcao_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Invocacao_funcaoContext invocacao_funcao() throws RecognitionException {
		Invocacao_funcaoContext _localctx = new Invocacao_funcaoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_invocacao_funcao);
		int _la;
		try {
			int _alt;
			_localctx = new Invocacao_funcao_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1012);
				match(WHITE_SPACE);
				}
				}
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1018);
			match(IDENTIFICATOR);
			setState(1019);
			match(LP);
			setState(1023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1020);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1029);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1026);
					exp_qualquer();
					}
					} 
				}
				setState(1031);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			setState(1042);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1035);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WHITE_SPACE) {
						{
						{
						setState(1032);
						match(WHITE_SPACE);
						}
						}
						setState(1037);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1038);
					match(COMMA);
					setState(1039);
					exp_qualquer();
					}
					} 
				}
				setState(1044);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1045);
				match(WHITE_SPACE);
				}
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1051);
			match(RP);
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

	public static class Invocacao_funcao_especialContext extends ParserRuleContext {
		public Invocacao_funcao_especialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocacao_funcao_especial; }
	 
		public Invocacao_funcao_especialContext() { }
		public void copyFrom(Invocacao_funcao_especialContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InvFuncEspecial_writeContext extends Invocacao_funcao_especialContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public InvFuncEspecial_writeContext(Invocacao_funcao_especialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInvFuncEspecial_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInvFuncEspecial_write(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInvFuncEspecial_write(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvFuncEspecial_arrobaContext extends Invocacao_funcao_especialContext {
		public ArrobaContext arroba() {
			return getRuleContext(ArrobaContext.class,0);
		}
		public InvFuncEspecial_arrobaContext(Invocacao_funcao_especialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInvFuncEspecial_arroba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInvFuncEspecial_arroba(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInvFuncEspecial_arroba(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvFuncEspecial_sizeofContext extends Invocacao_funcao_especialContext {
		public SizeofContext sizeof() {
			return getRuleContext(SizeofContext.class,0);
		}
		public InvFuncEspecial_sizeofContext(Invocacao_funcao_especialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInvFuncEspecial_sizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInvFuncEspecial_sizeof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInvFuncEspecial_sizeof(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvFuncEspecial_writelnContext extends Invocacao_funcao_especialContext {
		public WritelnContext writeln() {
			return getRuleContext(WritelnContext.class,0);
		}
		public InvFuncEspecial_writelnContext(Invocacao_funcao_especialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInvFuncEspecial_writeln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInvFuncEspecial_writeln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInvFuncEspecial_writeln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Invocacao_funcao_especialContext invocacao_funcao_especial() throws RecognitionException {
		Invocacao_funcao_especialContext _localctx = new Invocacao_funcao_especialContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_invocacao_funcao_especial);
		try {
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				_localctx = new InvFuncEspecial_arrobaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				arroba();
				}
				break;
			case 2:
				_localctx = new InvFuncEspecial_sizeofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1054);
				sizeof();
				}
				break;
			case 3:
				_localctx = new InvFuncEspecial_writeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1055);
				write();
				}
				break;
			case 4:
				_localctx = new InvFuncEspecial_writelnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1056);
				writeln();
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

	public static class ArrobaContext extends ParserRuleContext {
		public ArrobaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arroba; }
	 
		public ArrobaContext() { }
		public void copyFrom(ArrobaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Arroba_labelContext extends ArrobaContext {
		public TerminalNode ARROBA() { return getToken(a22.ARROBA, 0); }
		public TerminalNode LP() { return getToken(a22.LP, 0); }
		public TerminalNode RP() { return getToken(a22.RP, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Arroba_labelContext(ArrobaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterArroba_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitArroba_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitArroba_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrobaContext arroba() throws RecognitionException {
		ArrobaContext _localctx = new ArrobaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_arroba);
		int _la;
		try {
			int _alt;
			_localctx = new Arroba_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1059);
				match(WHITE_SPACE);
				}
				}
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1065);
			match(ARROBA);
			setState(1066);
			match(LP);
			setState(1070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1067);
				match(WHITE_SPACE);
				}
				}
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1073);
			match(RP);
			setState(1077);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1074);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1079);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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

	public static class SizeofContext extends ParserRuleContext {
		public SizeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof; }
	 
		public SizeofContext() { }
		public void copyFrom(SizeofContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sizeof_labelContext extends SizeofContext {
		public TerminalNode SIZEOF() { return getToken(a22.SIZEOF, 0); }
		public TerminalNode LP() { return getToken(a22.LP, 0); }
		public Exp_qualquerContext exp_qualquer() {
			return getRuleContext(Exp_qualquerContext.class,0);
		}
		public TerminalNode RP() { return getToken(a22.RP, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public Sizeof_labelContext(SizeofContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterSizeof_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitSizeof_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitSizeof_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeofContext sizeof() throws RecognitionException {
		SizeofContext _localctx = new SizeofContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_sizeof);
		int _la;
		try {
			int _alt;
			_localctx = new Sizeof_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1080);
				match(WHITE_SPACE);
				}
				}
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1086);
			match(SIZEOF);
			setState(1087);
			match(LP);
			setState(1091);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1088);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1093);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			setState(1094);
			exp_qualquer();
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1095);
				match(WHITE_SPACE);
				}
				}
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1101);
			match(RP);
			setState(1105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1102);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
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

	public static class WriteContext extends ParserRuleContext {
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	 
		public WriteContext() { }
		public void copyFrom(WriteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Write_labelContext extends WriteContext {
		public TerminalNode WRITE() { return getToken(a22.WRITE, 0); }
		public TerminalNode LP() { return getToken(a22.LP, 0); }
		public TerminalNode RP() { return getToken(a22.RP, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public List<Exp_qualquerContext> exp_qualquer() {
			return getRuleContexts(Exp_qualquerContext.class);
		}
		public Exp_qualquerContext exp_qualquer(int i) {
			return getRuleContext(Exp_qualquerContext.class,i);
		}
		public Write_labelContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterWrite_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitWrite_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitWrite_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_write);
		int _la;
		try {
			int _alt;
			_localctx = new Write_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1108);
				match(WHITE_SPACE);
				}
				}
				setState(1113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1114);
			match(WRITE);
			setState(1115);
			match(LP);
			setState(1119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1116);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			setState(1125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1122);
					exp_qualquer();
					}
					} 
				}
				setState(1127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1128);
				match(WHITE_SPACE);
				}
				}
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1134);
			match(RP);
			setState(1138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1135);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
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

	public static class WritelnContext extends ParserRuleContext {
		public WritelnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeln; }
	 
		public WritelnContext() { }
		public void copyFrom(WritelnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Writeln_labelContext extends WritelnContext {
		public TerminalNode WRITELN() { return getToken(a22.WRITELN, 0); }
		public TerminalNode LP() { return getToken(a22.LP, 0); }
		public TerminalNode RP() { return getToken(a22.RP, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(a22.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(a22.WHITE_SPACE, i);
		}
		public List<Exp_qualquerContext> exp_qualquer() {
			return getRuleContexts(Exp_qualquerContext.class);
		}
		public Exp_qualquerContext exp_qualquer(int i) {
			return getRuleContext(Exp_qualquerContext.class,i);
		}
		public Writeln_labelContext(WritelnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterWriteln_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitWriteln_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitWriteln_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritelnContext writeln() throws RecognitionException {
		WritelnContext _localctx = new WritelnContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_writeln);
		int _la;
		try {
			int _alt;
			_localctx = new Writeln_labelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1141);
				match(WHITE_SPACE);
				}
				}
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1147);
			match(WRITELN);
			setState(1148);
			match(LP);
			setState(1152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1149);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			}
			setState(1158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1155);
					exp_qualquer();
					}
					} 
				}
				setState(1160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1161);
				match(WHITE_SPACE);
				}
				}
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1167);
			match(RP);
			setState(1171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1168);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(1173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0499\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\6\6z\n\6\r\6\16\6{\3\7\3\7\3\7\5\7\u0081\n\7\3\b\3\b\5\b\u0085"+
		"\n\b\3\t\3\t\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f\13\n\3\n\3\n\7\n"+
		"\u0093\n\n\f\n\16\n\u0096\13\n\3\n\7\n\u0099\n\n\f\n\16\n\u009c\13\n\3"+
		"\n\7\n\u009f\n\n\f\n\16\n\u00a2\13\n\3\n\3\n\3\n\7\n\u00a7\n\n\f\n\16"+
		"\n\u00aa\13\n\3\n\3\n\7\n\u00ae\n\n\f\n\16\n\u00b1\13\n\3\n\3\n\7\n\u00b5"+
		"\n\n\f\n\16\n\u00b8\13\n\3\n\7\n\u00bb\n\n\f\n\16\n\u00be\13\n\3\n\7\n"+
		"\u00c1\n\n\f\n\16\n\u00c4\13\n\3\n\3\n\5\n\u00c8\n\n\3\13\3\13\7\13\u00cc"+
		"\n\13\f\13\16\13\u00cf\13\13\3\13\3\13\7\13\u00d3\n\13\f\13\16\13\u00d6"+
		"\13\13\3\13\3\13\7\13\u00da\n\13\f\13\16\13\u00dd\13\13\3\13\6\13\u00e0"+
		"\n\13\r\13\16\13\u00e1\3\13\7\13\u00e5\n\13\f\13\16\13\u00e8\13\13\3\13"+
		"\3\13\3\13\3\13\7\13\u00ee\n\13\f\13\16\13\u00f1\13\13\3\13\3\13\7\13"+
		"\u00f5\n\13\f\13\16\13\u00f8\13\13\3\13\3\13\7\13\u00fc\n\13\f\13\16\13"+
		"\u00ff\13\13\3\13\3\13\7\13\u0103\n\13\f\13\16\13\u0106\13\13\3\13\6\13"+
		"\u0109\n\13\r\13\16\13\u010a\3\13\7\13\u010e\n\13\f\13\16\13\u0111\13"+
		"\13\3\13\3\13\7\13\u0115\n\13\f\13\16\13\u0118\13\13\3\13\3\13\5\13\u011c"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0124\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u012c\n\r\3\16\3\16\3\17\3\17\5\17\u0132\n\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\7\21\u013a\n\21\f\21\16\21\u013d\13\21\3\21\3\21\7\21\u0141\n"+
		"\21\f\21\16\21\u0144\13\21\3\21\3\21\7\21\u0148\n\21\f\21\16\21\u014b"+
		"\13\21\3\22\3\22\7\22\u014f\n\22\f\22\16\22\u0152\13\22\3\22\3\22\7\22"+
		"\u0156\n\22\f\22\16\22\u0159\13\22\3\22\3\22\7\22\u015d\n\22\f\22\16\22"+
		"\u0160\13\22\3\22\3\22\7\22\u0164\n\22\f\22\16\22\u0167\13\22\3\22\3\22"+
		"\7\22\u016b\n\22\f\22\16\22\u016e\13\22\3\22\3\22\7\22\u0172\n\22\f\22"+
		"\16\22\u0175\13\22\3\22\3\22\7\22\u0179\n\22\f\22\16\22\u017c\13\22\3"+
		"\22\3\22\7\22\u0180\n\22\f\22\16\22\u0183\13\22\3\22\3\22\7\22\u0187\n"+
		"\22\f\22\16\22\u018a\13\22\5\22\u018c\n\22\3\23\3\23\7\23\u0190\n\23\f"+
		"\23\16\23\u0193\13\23\3\23\3\23\7\23\u0197\n\23\f\23\16\23\u019a\13\23"+
		"\3\23\3\23\7\23\u019e\n\23\f\23\16\23\u01a1\13\23\3\23\3\23\7\23\u01a5"+
		"\n\23\f\23\16\23\u01a8\13\23\3\23\3\23\7\23\u01ac\n\23\f\23\16\23\u01af"+
		"\13\23\3\23\3\23\7\23\u01b3\n\23\f\23\16\23\u01b6\13\23\5\23\u01b8\n\23"+
		"\3\24\3\24\7\24\u01bc\n\24\f\24\16\24\u01bf\13\24\3\24\3\24\7\24\u01c3"+
		"\n\24\f\24\16\24\u01c6\13\24\3\24\3\24\7\24\u01ca\n\24\f\24\16\24\u01cd"+
		"\13\24\3\25\3\25\7\25\u01d1\n\25\f\25\16\25\u01d4\13\25\3\25\3\25\7\25"+
		"\u01d8\n\25\f\25\16\25\u01db\13\25\3\25\3\25\7\25\u01df\n\25\f\25\16\25"+
		"\u01e2\13\25\3\26\3\26\7\26\u01e6\n\26\f\26\16\26\u01e9\13\26\3\26\3\26"+
		"\7\26\u01ed\n\26\f\26\16\26\u01f0\13\26\3\26\3\26\7\26\u01f4\n\26\f\26"+
		"\16\26\u01f7\13\26\3\27\7\27\u01fa\n\27\f\27\16\27\u01fd\13\27\3\27\3"+
		"\27\3\27\7\27\u0202\n\27\f\27\16\27\u0205\13\27\3\27\3\27\7\27\u0209\n"+
		"\27\f\27\16\27\u020c\13\27\3\27\3\27\7\27\u0210\n\27\f\27\16\27\u0213"+
		"\13\27\3\30\7\30\u0216\n\30\f\30\16\30\u0219\13\30\3\30\3\30\3\30\5\30"+
		"\u021e\n\30\3\30\7\30\u0221\n\30\f\30\16\30\u0224\13\30\3\31\3\31\7\31"+
		"\u0228\n\31\f\31\16\31\u022b\13\31\3\31\3\31\7\31\u022f\n\31\f\31\16\31"+
		"\u0232\13\31\3\31\3\31\3\32\3\32\7\32\u0238\n\32\f\32\16\32\u023b\13\32"+
		"\3\32\3\32\7\32\u023f\n\32\f\32\16\32\u0242\13\32\3\32\3\32\3\33\3\33"+
		"\7\33\u0248\n\33\f\33\16\33\u024b\13\33\3\33\3\33\7\33\u024f\n\33\f\33"+
		"\16\33\u0252\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u025c"+
		"\n\35\f\35\16\35\u025f\13\35\3\35\3\35\7\35\u0263\n\35\f\35\16\35\u0266"+
		"\13\35\3\35\3\35\3\36\3\36\7\36\u026c\n\36\f\36\16\36\u026f\13\36\3\36"+
		"\3\36\7\36\u0273\n\36\f\36\16\36\u0276\13\36\3\36\3\36\3\37\3\37\7\37"+
		"\u027c\n\37\f\37\16\37\u027f\13\37\3\37\3\37\7\37\u0283\n\37\f\37\16\37"+
		"\u0286\13\37\3\37\3\37\3 \3 \7 \u028c\n \f \16 \u028f\13 \3 \3 \7 \u0293"+
		"\n \f \16 \u0296\13 \3 \3 \3!\7!\u029b\n!\f!\16!\u029e\13!\3!\3!\7!\u02a2"+
		"\n!\f!\16!\u02a5\13!\3!\3!\7!\u02a9\n!\f!\16!\u02ac\13!\3!\7!\u02af\n"+
		"!\f!\16!\u02b2\13!\3!\3!\7!\u02b6\n!\f!\16!\u02b9\13!\3!\3!\7!\u02bd\n"+
		"!\f!\16!\u02c0\13!\5!\u02c2\n!\3\"\3\"\3\"\7\"\u02c7\n\"\f\"\16\"\u02ca"+
		"\13\"\3#\3#\7#\u02ce\n#\f#\16#\u02d1\13#\3#\3#\3#\7#\u02d6\n#\f#\16#\u02d9"+
		"\13#\3#\3#\7#\u02dd\n#\f#\16#\u02e0\13#\3#\3#\7#\u02e4\n#\f#\16#\u02e7"+
		"\13#\3#\7#\u02ea\n#\f#\16#\u02ed\13#\3#\7#\u02f0\n#\f#\16#\u02f3\13#\3"+
		"#\7#\u02f6\n#\f#\16#\u02f9\13#\3#\7#\u02fc\n#\f#\16#\u02ff\13#\3#\3#\3"+
		"$\7$\u0304\n$\f$\16$\u0307\13$\3$\3$\7$\u030b\n$\f$\16$\u030e\13$\3$\3"+
		"$\3$\7$\u0313\n$\f$\16$\u0316\13$\3$\3$\7$\u031a\n$\f$\16$\u031d\13$\3"+
		"$\5$\u0320\n$\3$\3$\5$\u0324\n$\3%\3%\7%\u0328\n%\f%\16%\u032b\13%\3%"+
		"\7%\u032e\n%\f%\16%\u0331\13%\3%\7%\u0334\n%\f%\16%\u0337\13%\3%\7%\u033a"+
		"\n%\f%\16%\u033d\13%\3%\7%\u0340\n%\f%\16%\u0343\13%\3%\3%\7%\u0347\n"+
		"%\f%\16%\u034a\13%\3%\3%\3&\3&\3&\3&\5&\u0352\n&\3\'\3\'\5\'\u0356\n\'"+
		"\3\'\7\'\u0359\n\'\f\'\16\'\u035c\13\'\3\'\3\'\7\'\u0360\n\'\f\'\16\'"+
		"\u0363\13\'\3\'\3\'\3\'\3(\3(\7(\u036a\n(\f(\16(\u036d\13(\3(\3(\7(\u0371"+
		"\n(\f(\16(\u0374\13(\3(\3(\7(\u0378\n(\f(\16(\u037b\13(\3(\3(\7(\u037f"+
		"\n(\f(\16(\u0382\13(\3(\3(\7(\u0386\n(\f(\16(\u0389\13(\3(\3(\7(\u038d"+
		"\n(\f(\16(\u0390\13(\5(\u0392\n(\3)\3)\3)\7)\u0397\n)\f)\16)\u039a\13"+
		")\3)\3)\7)\u039e\n)\f)\16)\u03a1\13)\3)\3)\7)\u03a5\n)\f)\16)\u03a8\13"+
		")\3)\3)\7)\u03ac\n)\f)\16)\u03af\13)\3)\3)\7)\u03b3\n)\f)\16)\u03b6\13"+
		")\5)\u03b8\n)\3*\3*\7*\u03bc\n*\f*\16*\u03bf\13*\3*\3*\7*\u03c3\n*\f*"+
		"\16*\u03c6\13*\7*\u03c8\n*\f*\16*\u03cb\13*\3*\3*\3+\7+\u03d0\n+\f+\16"+
		"+\u03d3\13+\3+\3+\3+\3,\7,\u03d9\n,\f,\16,\u03dc\13,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\5-\u03e7\n-\3.\3.\7.\u03eb\n.\f.\16.\u03ee\13.\3.\3.\3.\3/"+
		"\3/\5/\u03f5\n/\3\60\7\60\u03f8\n\60\f\60\16\60\u03fb\13\60\3\60\3\60"+
		"\3\60\7\60\u0400\n\60\f\60\16\60\u0403\13\60\3\60\7\60\u0406\n\60\f\60"+
		"\16\60\u0409\13\60\3\60\7\60\u040c\n\60\f\60\16\60\u040f\13\60\3\60\3"+
		"\60\7\60\u0413\n\60\f\60\16\60\u0416\13\60\3\60\7\60\u0419\n\60\f\60\16"+
		"\60\u041c\13\60\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u0424\n\61\3\62\7\62"+
		"\u0427\n\62\f\62\16\62\u042a\13\62\3\62\3\62\3\62\7\62\u042f\n\62\f\62"+
		"\16\62\u0432\13\62\3\62\3\62\7\62\u0436\n\62\f\62\16\62\u0439\13\62\3"+
		"\63\7\63\u043c\n\63\f\63\16\63\u043f\13\63\3\63\3\63\3\63\7\63\u0444\n"+
		"\63\f\63\16\63\u0447\13\63\3\63\3\63\7\63\u044b\n\63\f\63\16\63\u044e"+
		"\13\63\3\63\3\63\7\63\u0452\n\63\f\63\16\63\u0455\13\63\3\64\7\64\u0458"+
		"\n\64\f\64\16\64\u045b\13\64\3\64\3\64\3\64\7\64\u0460\n\64\f\64\16\64"+
		"\u0463\13\64\3\64\7\64\u0466\n\64\f\64\16\64\u0469\13\64\3\64\7\64\u046c"+
		"\n\64\f\64\16\64\u046f\13\64\3\64\3\64\7\64\u0473\n\64\f\64\16\64\u0476"+
		"\13\64\3\65\7\65\u0479\n\65\f\65\16\65\u047c\13\65\3\65\3\65\3\65\7\65"+
		"\u0481\n\65\f\65\16\65\u0484\13\65\3\65\7\65\u0487\n\65\f\65\16\65\u048a"+
		"\13\65\3\65\7\65\u048d\n\65\f\65\16\65\u0490\13\65\3\65\3\65\7\65\u0494"+
		"\n\65\f\65\16\65\u0497\13\65\3\65\2\2\66\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\n\6\2\r\16"+
		"\21\22\25\32\34\37\5\2\n\n\f\f\21\24\3\2\5\t\3\2()\3\2\64\65\3\2\63\64"+
		"\3\2\21\24\3\2\30\35\2\u0513\2m\3\2\2\2\4r\3\2\2\2\6t\3\2\2\2\bv\3\2\2"+
		"\2\ny\3\2\2\2\f\u0080\3\2\2\2\16\u0084\3\2\2\2\20\u0086\3\2\2\2\22\u00c7"+
		"\3\2\2\2\24\u011b\3\2\2\2\26\u0123\3\2\2\2\30\u012b\3\2\2\2\32\u012d\3"+
		"\2\2\2\34\u0131\3\2\2\2\36\u0133\3\2\2\2 \u0137\3\2\2\2\"\u018b\3\2\2"+
		"\2$\u01b7\3\2\2\2&\u01b9\3\2\2\2(\u01ce\3\2\2\2*\u01e3\3\2\2\2,\u01fb"+
		"\3\2\2\2.\u0217\3\2\2\2\60\u0225\3\2\2\2\62\u0235\3\2\2\2\64\u0245\3\2"+
		"\2\2\66\u0255\3\2\2\28\u0259\3\2\2\2:\u0269\3\2\2\2<\u0279\3\2\2\2>\u0289"+
		"\3\2\2\2@\u02c1\3\2\2\2B\u02c3\3\2\2\2D\u02cb\3\2\2\2F\u0305\3\2\2\2H"+
		"\u0325\3\2\2\2J\u0351\3\2\2\2L\u0355\3\2\2\2N\u0367\3\2\2\2P\u0393\3\2"+
		"\2\2R\u03b9\3\2\2\2T\u03d1\3\2\2\2V\u03da\3\2\2\2X\u03e6\3\2\2\2Z\u03e8"+
		"\3\2\2\2\\\u03f4\3\2\2\2^\u03f9\3\2\2\2`\u0423\3\2\2\2b\u0428\3\2\2\2"+
		"d\u043d\3\2\2\2f\u0459\3\2\2\2h\u047a\3\2\2\2jl\5\n\6\2kj\3\2\2\2lo\3"+
		"\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\2\2\3q\3\3\2\2\2rs"+
		"\t\2\2\2s\5\3\2\2\2tu\t\3\2\2u\7\3\2\2\2vw\7\3\2\2w\t\3\2\2\2xz\5\f\7"+
		"\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\13\3\2\2\2}\u0081\5\16\b\2"+
		"~\u0081\5D#\2\177\u0081\5F$\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177"+
		"\3\2\2\2\u0081\r\3\2\2\2\u0082\u0085\5\22\n\2\u0083\u0085\5\24\13\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\17\3\2\2\2\u0086\u0087\t\4\2"+
		"\2\u0087\21\3\2\2\2\u0088\u0089\7\4\2\2\u0089\u009a\7\63\2\2\u008a\u008c"+
		"\7\66\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0094"+
		"\7&\2\2\u0091\u0093\7\66\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0099\7\63\2\2\u0098\u008d\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a0\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009f\7\66\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00c8\7\'\2\2\u00a4\u00a8\5\20\t\2\u00a5\u00a7\7\66\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00bc\7\63\2\2\u00ac"+
		"\u00ae\7\66\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b6\7&\2\2\u00b3\u00b5\7\66\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00bb\7\63\2\2\u00ba\u00af\3\2\2\2\u00bb\u00be\3"+
		"\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c2\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c1\7\66\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7\'\2\2\u00c6\u00c8\3\2\2\2\u00c7\u0088\3\2"+
		"\2\2\u00c7\u00a4\3\2\2\2\u00c8\23\3\2\2\2\u00c9\u00cd\7\4\2\2\u00ca\u00cc"+
		"\7\66\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d4"+
		"\7\63\2\2\u00d1\u00d3\7\66\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2"+
		"\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d7\u00db\7\13\2\2\u00d8\u00da\7\66\2\2\u00d9\u00d8\3\2\2\2"+
		"\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\5\34\17\2\u00df\u00de\3\2\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e6"+
		"\3\2\2\2\u00e3\u00e5\7\66\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ea\7\'\2\2\u00ea\u011c\3\2\2\2\u00eb\u00ef\5\20\t\2"+
		"\u00ec\u00ee\7\66\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f6\7\63\2\2\u00f3\u00f5\7\66\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3"+
		"\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fd\7\13\2\2\u00fa\u00fc\7\66\2\2\u00fb\u00fa\3"+
		"\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0104\7\r\2\2\u0101\u0103\7\66"+
		"\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\5\34"+
		"\17\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010f\3\2\2\2\u010c\u010e\7\66\2\2\u010d\u010c\3"+
		"\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0116\7\16\2\2\u0113\u0115\7"+
		"\66\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\'"+
		"\2\2\u011a\u011c\3\2\2\2\u011b\u00c9\3\2\2\2\u011b\u00eb\3\2\2\2\u011c"+
		"\25\3\2\2\2\u011d\u0124\5 \21\2\u011e\u0124\5\"\22\2\u011f\u0124\5$\23"+
		"\2\u0120\u0124\5&\24\2\u0121\u0124\5*\26\2\u0122\u0124\5(\25\2\u0123\u011d"+
		"\3\2\2\2\u0123\u011e\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\27\3\2\2\2\u0125\u012c\5\32\16"+
		"\2\u0126\u012c\5\36\20\2\u0127\u012c\5\\/\2\u0128\u012c\7\63\2\2\u0129"+
		"\u012c\t\5\2\2\u012a\u012c\5.\30\2\u012b\u0125\3\2\2\2\u012b\u0126\3\2"+
		"\2\2\u012b\u0127\3\2\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012c\31\3\2\2\2\u012d\u012e\t\6\2\2\u012e\33\3\2\2\2\u012f"+
		"\u0132\5\26\f\2\u0130\u0132\5\30\r\2\u0131\u012f\3\2\2\2\u0131\u0130\3"+
		"\2\2\2\u0132\35\3\2\2\2\u0133\u0134\7\n\2\2\u0134\u0135\5\34\17\2\u0135"+
		"\u0136\7\f\2\2\u0136\37\3\2\2\2\u0137\u0149\5,\27\2\u0138\u013a\7\66\2"+
		"\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0142\5\4\3\2\u013f"+
		"\u0141\7\66\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u0146\5\30\r\2\u0146\u0148\3\2\2\2\u0147\u013b\3\2\2\2\u0148\u014b\3"+
		"\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a!\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u015e\5<\37\2\u014d\u014f\7\66\2\2\u014e\u014d\3\2\2\2"+
		"\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0157\5\4\3\2\u0154\u0156\7\66\2\2"+
		"\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\5\30\r\2"+
		"\u015b\u015d\3\2\2\2\u015c\u0150\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u018c\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0173\5:\36\2\u0162\u0164\7\66\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3"+
		"\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u016c\5\4\3\2\u0169\u016b\7\66\2\2\u016a\u0169\3"+
		"\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\5\30\r\2\u0170\u0172\3"+
		"\2\2\2\u0171\u0165\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u018c\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0188\5>"+
		" \2\u0177\u0179\7\66\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017d\u0181\5\4\3\2\u017e\u0180\7\66\2\2\u017f\u017e\3\2\2\2\u0180"+
		"\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0184\u0185\5\30\r\2\u0185\u0187\3\2\2\2\u0186"+
		"\u017a\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u014c\3\2\2\2\u018b"+
		"\u0161\3\2\2\2\u018b\u0176\3\2\2\2\u018c#\3\2\2\2\u018d\u019f\5\66\34"+
		"\2\u018e\u0190\7\66\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0194\u0198\5\4\3\2\u0195\u0197\7\66\2\2\u0196\u0195\3\2\2\2\u0197"+
		"\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019b\u019c\5\30\r\2\u019c\u019e\3\2\2\2\u019d"+
		"\u0191\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01b8\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01b4\58\35\2\u01a3"+
		"\u01a5\7\66\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3"+
		"\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9"+
		"\u01ad\5\4\3\2\u01aa\u01ac\7\66\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3"+
		"\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01b0\u01b1\5\30\r\2\u01b1\u01b3\3\2\2\2\u01b2\u01a6\3"+
		"\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u018d\3\2\2\2\u01b7\u01a2\3\2"+
		"\2\2\u01b8%\3\2\2\2\u01b9\u01cb\5\60\31\2\u01ba\u01bc\7\66\2\2\u01bb\u01ba"+
		"\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c4\5\4\3\2\u01c1\u01c3\7\66"+
		"\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\5\30"+
		"\r\2\u01c8\u01ca\3\2\2\2\u01c9\u01bd\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\'\3\2\2\2\u01cd\u01cb\3\2\2\2"+
		"\u01ce\u01e0\5\62\32\2\u01cf\u01d1\7\66\2\2\u01d0\u01cf\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2"+
		"\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d9\5\4\3\2\u01d6\u01d8\7\66\2\2\u01d7"+
		"\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\5\30\r\2\u01dd"+
		"\u01df\3\2\2\2\u01de\u01d2\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1)\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01f5"+
		"\5\64\33\2\u01e4\u01e6\7\66\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2\2"+
		"\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7"+
		"\3\2\2\2\u01ea\u01ee\5\4\3\2\u01eb\u01ed\7\66\2\2\u01ec\u01eb\3\2\2\2"+
		"\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1"+
		"\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\5\30\r\2\u01f2\u01f4\3\2\2\2"+
		"\u01f3\u01e7\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6+\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fa\7\66\2\2\u01f9"+
		"\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2"+
		"\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\t\7\2\2\u01ff"+
		"\u0203\7\r\2\2\u0200\u0202\7\66\2\2\u0201\u0200\3\2\2\2\u0202\u0205\3"+
		"\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0206\u020a\5\34\17\2\u0207\u0209\7\66\2\2\u0208\u0207"+
		"\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u0211\7\16\2\2\u020e\u0210\7"+
		"\66\2\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212-\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0216\7\66\2\2"+
		"\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021d\t\b\2\2\u021b"+
		"\u021e\7\63\2\2\u021c\u021e\5\32\16\2\u021d\u021b\3\2\2\2\u021d\u021c"+
		"\3\2\2\2\u021e\u0222\3\2\2\2\u021f\u0221\7\66\2\2\u0220\u021f\3\2\2\2"+
		"\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223/\3"+
		"\2\2\2\u0224\u0222\3\2\2\2\u0225\u0229\5\30\r\2\u0226\u0228\7\66\2\2\u0227"+
		"\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022a\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u0230\t\t\2\2\u022d"+
		"\u022f\7\66\2\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3"+
		"\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233"+
		"\u0234\5\30\r\2\u0234\61\3\2\2\2\u0235\u0239\5\30\r\2\u0236\u0238\7\66"+
		"\2\2\u0237\u0236\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u0240\7\36"+
		"\2\2\u023d\u023f\7\66\2\2\u023e\u023d\3\2\2\2\u023f\u0242\3\2\2\2\u0240"+
		"\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0240\3\2"+
		"\2\2\u0243\u0244\5\30\r\2\u0244\63\3\2\2\2\u0245\u0249\5\30\r\2\u0246"+
		"\u0248\7\66\2\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3"+
		"\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c"+
		"\u0250\7\37\2\2\u024d\u024f\7\66\2\2\u024e\u024d\3\2\2\2\u024f\u0252\3"+
		"\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0253\u0254\5\30\r\2\u0254\65\3\2\2\2\u0255\u0256\5\30"+
		"\r\2\u0256\u0257\7\21\2\2\u0257\u0258\5\30\r\2\u0258\67\3\2\2\2\u0259"+
		"\u025d\5\30\r\2\u025a\u025c\7\66\2\2\u025b\u025a\3\2\2\2\u025c\u025f\3"+
		"\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u0260\u0264\7\22\2\2\u0261\u0263\7\66\2\2\u0262\u0261\3"+
		"\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0268\5\30\r\2\u02689\3\2\2\2"+
		"\u0269\u026d\5\30\r\2\u026a\u026c\7\66\2\2\u026b\u026a\3\2\2\2\u026c\u026f"+
		"\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f"+
		"\u026d\3\2\2\2\u0270\u0274\7\26\2\2\u0271\u0273\7\66\2\2\u0272\u0271\3"+
		"\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u0277\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0278\5\30\r\2\u0278;\3\2\2\2"+
		"\u0279\u027d\5\30\r\2\u027a\u027c\7\66\2\2\u027b\u027a\3\2\2\2\u027c\u027f"+
		"\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f"+
		"\u027d\3\2\2\2\u0280\u0284\7\25\2\2\u0281\u0283\7\66\2\2\u0282\u0281\3"+
		"\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0287\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288\5\30\r\2\u0288=\3\2\2\2"+
		"\u0289\u028d\5\30\r\2\u028a\u028c\7\66\2\2\u028b\u028a\3\2\2\2\u028c\u028f"+
		"\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0290\3\2\2\2\u028f"+
		"\u028d\3\2\2\2\u0290\u0294\7\27\2\2\u0291\u0293\7\66\2\2\u0292\u0291\3"+
		"\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u0297\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0298\5\30\r\2\u0298?\3\2\2\2"+
		"\u0299\u029b\7\66\2\2\u029a\u0299\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a"+
		"\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u029c\3\2\2\2\u029f"+
		"\u02a3\7\4\2\2\u02a0\u02a2\7\66\2\2\u02a1\u02a0\3\2\2\2\u02a2\u02a5\3"+
		"\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5"+
		"\u02a3\3\2\2\2\u02a6\u02aa\7\63\2\2\u02a7\u02a9\7\66\2\2\u02a8\u02a7\3"+
		"\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02c2\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02af\7\66\2\2\u02ae\u02ad\3"+
		"\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02b3\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b7\5\20\t\2\u02b4\u02b6\7"+
		"\66\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02be\7\63"+
		"\2\2\u02bb\u02bd\7\66\2\2\u02bc\u02bb\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be"+
		"\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2"+
		"\2\2\u02c1\u029c\3\2\2\2\u02c1\u02b0\3\2\2\2\u02c2A\3\2\2\2\u02c3\u02c8"+
		"\5@!\2\u02c4\u02c5\7&\2\2\u02c5\u02c7\5@!\2\u02c6\u02c4\3\2\2\2\u02c7"+
		"\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9C\3\2\2\2"+
		"\u02ca\u02c8\3\2\2\2\u02cb\u02cf\5\b\5\2\u02cc\u02ce\7\66\2\2\u02cd\u02cc"+
		"\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\u02d2\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d3\7\63\2\2\u02d3\u02d7\7"+
		"\n\2\2\u02d4\u02d6\5B\"\2\u02d5\u02d4\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7"+
		"\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02d7\3\2"+
		"\2\2\u02da\u02de\7\f\2\2\u02db\u02dd\7\66\2\2\u02dc\u02db\3\2\2\2\u02dd"+
		"\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2"+
		"\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e5\7\17\2\2\u02e2\u02e4\7\66\2\2\u02e3"+
		"\u02e2\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2"+
		"\2\2\u02e6\u02eb\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02ea\5\16\b\2\u02e9"+
		"\u02e8\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2"+
		"\2\2\u02ec\u02f1\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02f0\7\66\2\2\u02ef"+
		"\u02ee\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2"+
		"\2\2\u02f2\u02f7\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f6\5X-\2\u02f5\u02f4"+
		"\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"\u02fd\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fc\7\66\2\2\u02fb\u02fa\3"+
		"\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
		"\u0300\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u0301\7\20\2\2\u0301E\3\2\2\2"+
		"\u0302\u0304\7\66\2\2\u0303\u0302\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303"+
		"\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0305\3\2\2\2\u0308"+
		"\u030c\7\4\2\2\u0309\u030b\7\66\2\2\u030a\u0309\3\2\2\2\u030b\u030e\3"+
		"\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030f\3\2\2\2\u030e"+
		"\u030c\3\2\2\2\u030f\u0310\7\63\2\2\u0310\u0314\7\n\2\2\u0311\u0313\5"+
		"B\"\2\u0312\u0311\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u031b\7\f"+
		"\2\2\u0318\u031a\7\66\2\2\u0319\u0318\3\2\2\2\u031a\u031d\3\2\2\2\u031b"+
		"\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2"+
		"\2\2\u031e\u0320\5T+\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321"+
		"\3\2\2\2\u0321\u0323\5H%\2\u0322\u0324\5V,\2\u0323\u0322\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324G\3\2\2\2\u0325\u0329\7\17\2\2\u0326\u0328\7\66\2"+
		"\2\u0327\u0326\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u032a"+
		"\3\2\2\2\u032a\u032f\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032e\5\16\b\2"+
		"\u032d\u032c\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330"+
		"\3\2\2\2\u0330\u0335\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0334\7\66\2\2"+
		"\u0333\u0332\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336"+
		"\3\2\2\2\u0336\u033b\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u033a\5X-\2\u0339"+
		"\u0338\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2"+
		"\2\2\u033c\u0341\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u0340\7\66\2\2\u033f"+
		"\u033e\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2"+
		"\2\2\u0342\u0344\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u0348\5Z.\2\u0345\u0347"+
		"\7\66\2\2\u0346\u0345\3\2\2\2\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2"+
		"\u0348\u0349\3\2\2\2\u0349\u034b\3\2\2\2\u034a\u0348\3\2\2\2\u034b\u034c"+
		"\7\20\2\2\u034cI\3\2\2\2\u034d\u0352\7*\2\2\u034e\u0352\7+\2\2\u034f\u0352"+
		"\7,\2\2\u0350\u0352\5Z.\2\u0351\u034d\3\2\2\2\u0351\u034e\3\2\2\2\u0351"+
		"\u034f\3\2\2\2\u0351\u0350\3\2\2\2\u0352K\3\2\2\2\u0353\u0356\7\63\2\2"+
		"\u0354\u0356\5 \21\2\u0355\u0353\3\2\2\2\u0355\u0354\3\2\2\2\u0356\u035a"+
		"\3\2\2\2\u0357\u0359\7\66\2\2\u0358\u0357\3\2\2\2\u0359\u035c\3\2\2\2"+
		"\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\3\2\2\2\u035c\u035a"+
		"\3\2\2\2\u035d\u0361\7\13\2\2\u035e\u0360\7\66\2\2\u035f\u035e\3\2\2\2"+
		"\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364"+
		"\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0365\5\34\17\2\u0365\u0366\7\'\2\2"+
		"\u0366M\3\2\2\2\u0367\u036b\7-\2\2\u0368\u036a\7\66\2\2\u0369\u0368\3"+
		"\2\2\2\u036a\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u036e\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u0372\5\34\17\2\u036f\u0371\7"+
		"\66\2\2\u0370\u036f\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372"+
		"\u0373\3\2\2\2\u0373\u0375\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u0379\7/"+
		"\2\2\u0376\u0378\7\66\2\2\u0377\u0376\3\2\2\2\u0378\u037b\3\2\2\2\u0379"+
		"\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037c\3\2\2\2\u037b\u0379\3\2"+
		"\2\2\u037c\u0380\5X-\2\u037d\u037f\7\66\2\2\u037e\u037d\3\2\2\2\u037f"+
		"\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0391\3\2"+
		"\2\2\u0382\u0380\3\2\2\2\u0383\u0387\7.\2\2\u0384\u0386\7\66\2\2\u0385"+
		"\u0384\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2"+
		"\2\2\u0388\u038a\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038e\5X-\2\u038b\u038d"+
		"\7\66\2\2\u038c\u038b\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038c\3\2\2\2"+
		"\u038e\u038f\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0391\u0383"+
		"\3\2\2\2\u0391\u0392\3\2\2\2\u0392O\3\2\2\2\u0393\u0394\7\60\2\2\u0394"+
		"\u0398\5\34\17\2\u0395\u0397\7\66\2\2\u0396\u0395\3\2\2\2\u0397\u039a"+
		"\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\3\2\2\2\u039a"+
		"\u0398\3\2\2\2\u039b\u039f\7\61\2\2\u039c\u039e\7\66\2\2\u039d\u039c\3"+
		"\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0"+
		"\u03a2\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a6\5X-\2\u03a3\u03a5\7\66"+
		"\2\2\u03a4\u03a3\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6"+
		"\u03a7\3\2\2\2\u03a7\u03b7\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03ad\7\62"+
		"\2\2\u03aa\u03ac\7\66\2\2\u03ab\u03aa\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad"+
		"\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b0\3\2\2\2\u03af\u03ad\3\2"+
		"\2\2\u03b0\u03b4\5X-\2\u03b1\u03b3\7\66\2\2\u03b2\u03b1\3\2\2\2\u03b3"+
		"\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b8\3\2"+
		"\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03a9\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"Q\3\2\2\2\u03b9\u03bd\7\17\2\2\u03ba\u03bc\7\66\2\2\u03bb\u03ba\3\2\2"+
		"\2\u03bc\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c9"+
		"\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c4\5X-\2\u03c1\u03c3\7\66\2\2\u03c2"+
		"\u03c1\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2"+
		"\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7\u03c0\3\2\2\2\u03c8"+
		"\u03cb\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\3\2"+
		"\2\2\u03cb\u03c9\3\2\2\2\u03cc\u03cd\7\20\2\2\u03cdS\3\2\2\2\u03ce\u03d0"+
		"\7\66\2\2\u03cf\u03ce\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2\2"+
		"\u03d1\u03d2\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4\u03d5"+
		"\7 \2\2\u03d5\u03d6\5H%\2\u03d6U\3\2\2\2\u03d7\u03d9\7\66\2\2\u03d8\u03d7"+
		"\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03dd\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03de\7$\2\2\u03de\u03df\5H%"+
		"\2\u03dfW\3\2\2\2\u03e0\u03e7\5\34\17\2\u03e1\u03e7\5J&\2\u03e2\u03e7"+
		"\5L\'\2\u03e3\u03e7\5N(\2\u03e4\u03e7\5P)\2\u03e5\u03e7\5R*\2\u03e6\u03e0"+
		"\3\2\2\2\u03e6\u03e1\3\2\2\2\u03e6\u03e2\3\2\2\2\u03e6\u03e3\3\2\2\2\u03e6"+
		"\u03e4\3\2\2\2\u03e6\u03e5\3\2\2\2\u03e7Y\3\2\2\2\u03e8\u03ec\7,\2\2\u03e9"+
		"\u03eb\7\66\2\2\u03ea\u03e9\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3"+
		"\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef"+
		"\u03f0\5\34\17\2\u03f0\u03f1\7\'\2\2\u03f1[\3\2\2\2\u03f2\u03f5\5^\60"+
		"\2\u03f3\u03f5\5`\61\2\u03f4\u03f2\3\2\2\2\u03f4\u03f3\3\2\2\2\u03f5]"+
		"\3\2\2\2\u03f6\u03f8\7\66\2\2\u03f7\u03f6\3\2\2\2\u03f8\u03fb\3\2\2\2"+
		"\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03f9"+
		"\3\2\2\2\u03fc\u03fd\7\63\2\2\u03fd\u0401\7\n\2\2\u03fe\u0400\7\66\2\2"+
		"\u03ff\u03fe\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402\u0407\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0406\5\34\17\2"+
		"\u0405\u0404\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0407\u0408"+
		"\3\2\2\2\u0408\u0414\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u040c\7\66\2\2"+
		"\u040b\u040a\3\2\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e"+
		"\3\2\2\2\u040e\u0410\3\2\2\2\u040f\u040d\3\2\2\2\u0410\u0411\7&\2\2\u0411"+
		"\u0413\5\34\17\2\u0412\u040d\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3"+
		"\2\2\2\u0414\u0415\3\2\2\2\u0415\u041a\3\2\2\2\u0416\u0414\3\2\2\2\u0417"+
		"\u0419\7\66\2\2\u0418\u0417\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u0418\3"+
		"\2\2\2\u041a\u041b\3\2\2\2\u041b\u041d\3\2\2\2\u041c\u041a\3\2\2\2\u041d"+
		"\u041e\7\f\2\2\u041e_\3\2\2\2\u041f\u0424\5b\62\2\u0420\u0424\5d\63\2"+
		"\u0421\u0424\5f\64\2\u0422\u0424\5h\65\2\u0423\u041f\3\2\2\2\u0423\u0420"+
		"\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0422\3\2\2\2\u0424a\3\2\2\2\u0425"+
		"\u0427\7\66\2\2\u0426\u0425\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426\3"+
		"\2\2\2\u0428\u0429\3\2\2\2\u0429\u042b\3\2\2\2\u042a\u0428\3\2\2\2\u042b"+
		"\u042c\7 \2\2\u042c\u0430\7\n\2\2\u042d\u042f\7\66\2\2\u042e\u042d\3\2"+
		"\2\2\u042f\u0432\3\2\2\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431"+
		"\u0433\3\2\2\2\u0432\u0430\3\2\2\2\u0433\u0437\7\f\2\2\u0434\u0436\7\66"+
		"\2\2\u0435\u0434\3\2\2\2\u0436\u0439\3\2\2\2\u0437\u0435\3\2\2\2\u0437"+
		"\u0438\3\2\2\2\u0438c\3\2\2\2\u0439\u0437\3\2\2\2\u043a\u043c\7\66\2\2"+
		"\u043b\u043a\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e"+
		"\3\2\2\2\u043e\u0440\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0441\7#\2\2\u0441"+
		"\u0445\7\n\2\2\u0442\u0444\7\66\2\2\u0443\u0442\3\2\2\2\u0444\u0447\3"+
		"\2\2\2\u0445\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0448\3\2\2\2\u0447"+
		"\u0445\3\2\2\2\u0448\u044c\5\34\17\2\u0449\u044b\7\66\2\2\u044a\u0449"+
		"\3\2\2\2\u044b\u044e\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d"+
		"\u044f\3\2\2\2\u044e\u044c\3\2\2\2\u044f\u0453\7\f\2\2\u0450\u0452\7\66"+
		"\2\2\u0451\u0450\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0451\3\2\2\2\u0453"+
		"\u0454\3\2\2\2\u0454e\3\2\2\2\u0455\u0453\3\2\2\2\u0456\u0458\7\66\2\2"+
		"\u0457\u0456\3\2\2\2\u0458\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a"+
		"\3\2\2\2\u045a\u045c\3\2\2\2\u045b\u0459\3\2\2\2\u045c\u045d\7!\2\2\u045d"+
		"\u0461\7\n\2\2\u045e\u0460\7\66\2\2\u045f\u045e\3\2\2\2\u0460\u0463\3"+
		"\2\2\2\u0461\u045f\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0467\3\2\2\2\u0463"+
		"\u0461\3\2\2\2\u0464\u0466\5\34\17\2\u0465\u0464\3\2\2\2\u0466\u0469\3"+
		"\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u046d\3\2\2\2\u0469"+
		"\u0467\3\2\2\2\u046a\u046c\7\66\2\2\u046b\u046a\3\2\2\2\u046c\u046f\3"+
		"\2\2\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0470\3\2\2\2\u046f"+
		"\u046d\3\2\2\2\u0470\u0474\7\f\2\2\u0471\u0473\7\66\2\2\u0472\u0471\3"+
		"\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475"+
		"g\3\2\2\2\u0476\u0474\3\2\2\2\u0477\u0479\7\66\2\2\u0478\u0477\3\2\2\2"+
		"\u0479\u047c\3\2\2\2\u047a\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047d"+
		"\3\2\2\2\u047c\u047a\3\2\2\2\u047d\u047e\7\"\2\2\u047e\u0482\7\n\2\2\u047f"+
		"\u0481\7\66\2\2\u0480\u047f\3\2\2\2\u0481\u0484\3\2\2\2\u0482\u0480\3"+
		"\2\2\2\u0482\u0483\3\2\2\2\u0483\u0488\3\2\2\2\u0484\u0482\3\2\2\2\u0485"+
		"\u0487\5\34\17\2\u0486\u0485\3\2\2\2\u0487\u048a\3\2\2\2\u0488\u0486\3"+
		"\2\2\2\u0488\u0489\3\2\2\2\u0489\u048e\3\2\2\2\u048a\u0488\3\2\2\2\u048b"+
		"\u048d\7\66\2\2\u048c\u048b\3\2\2\2\u048d\u0490\3\2\2\2\u048e\u048c\3"+
		"\2\2\2\u048e\u048f\3\2\2\2\u048f\u0491\3\2\2\2\u0490\u048e\3\2\2\2\u0491"+
		"\u0495\7\f\2\2\u0492\u0494\7\66\2\2\u0493\u0492\3\2\2\2\u0494\u0497\3"+
		"\2\2\2\u0495\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496i\3\2\2\2\u0497\u0495"+
		"\3\2\2\2\u009fm{\u0080\u0084\u008d\u0094\u009a\u00a0\u00a8\u00af\u00b6"+
		"\u00bc\u00c2\u00c7\u00cd\u00d4\u00db\u00e1\u00e6\u00ef\u00f6\u00fd\u0104"+
		"\u010a\u010f\u0116\u011b\u0123\u012b\u0131\u013b\u0142\u0149\u0150\u0157"+
		"\u015e\u0165\u016c\u0173\u017a\u0181\u0188\u018b\u0191\u0198\u019f\u01a6"+
		"\u01ad\u01b4\u01b7\u01bd\u01c4\u01cb\u01d2\u01d9\u01e0\u01e7\u01ee\u01f5"+
		"\u01fb\u0203\u020a\u0211\u0217\u021d\u0222\u0229\u0230\u0239\u0240\u0249"+
		"\u0250\u025d\u0264\u026d\u0274\u027d\u0284\u028d\u0294\u029c\u02a3\u02aa"+
		"\u02b0\u02b7\u02be\u02c1\u02c8\u02cf\u02d7\u02de\u02e5\u02eb\u02f1\u02f7"+
		"\u02fd\u0305\u030c\u0314\u031b\u031f\u0323\u0329\u032f\u0335\u033b\u0341"+
		"\u0348\u0351\u0355\u035a\u0361\u036b\u0372\u0379\u0380\u0387\u038e\u0391"+
		"\u0398\u039f\u03a6\u03ad\u03b4\u03b7\u03bd\u03c4\u03c9\u03d1\u03da\u03e6"+
		"\u03ec\u03f4\u03f9\u0401\u0407\u040d\u0414\u041a\u0423\u0428\u0430\u0437"+
		"\u043d\u0445\u044c\u0453\u0459\u0461\u0467\u046d\u0474\u047a\u0482\u0488"+
		"\u048e\u0495";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}