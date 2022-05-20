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
		PLUS_OP=1, MINUS_OP=2, MULTIPLICATION_OP=3, DIVISION_OP=4, REMAINDER_OP=5, 
		ASSIGN_OP=6, EQUAL=7, UNEQUAL=8, GREATER=9, LESS=10, GREATER_EQUAL=11, 
		LESS_EQUAL=12, AND=13, OR=14, NOT=15, TRUE=16, FALSE=17, BOOL=18, INT=19, 
		REAL=20, STRING=21, VOID=22, TYPE=23, WRITE=24, WRITELN=25, READ=26, IF=27, 
		THEN=28, ELSE=29, WHILE=30, DO=31, FOR=32, TO=33, DOWNTO=34, STEP=35, 
		RETURN=36, SEMICOLON=37, COMMA=38, CARET=39, PERIOD=40, LEFT_PARENTHESIS=41, 
		RIGHT_PARENTHESIS=42, LEFT_BRACKET=43, RIGHT_BRACKET=44, LEFT_CURLY=45, 
		RIGHT_CURLY=46, INT_LITERAL=47, REAL_LITERAL=48, STRING_LITERAL=49, IDENTIFIER=50, 
		WHITESPACE=51, SINGLE_LINE_COMMENT=52, MULTIPLE_LINE_COMMENT=53;
	public static final int
		RULE_start = 0, RULE_file = 1, RULE_variable = 2, RULE_variable_declaration = 3, 
		RULE_brackets = 4, RULE_variable_initialization = 5, RULE_primitive_data_type = 6, 
		RULE_composite_data_type_def = 7, RULE_simple_expression = 8, RULE_expression = 9, 
		RULE_function_def = 10, RULE_function_def_args = 11, RULE_function_def_args_types = 12, 
		RULE_function_call = 13, RULE_function_call_args = 14, RULE_statement = 15, 
		RULE_assignment = 16, RULE_conditional = 17, RULE_while_loop = 18, RULE_for_loop = 19, 
		RULE_control = 20, RULE_block_statement = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "file", "variable", "variable_declaration", "brackets", "variable_initialization", 
			"primitive_data_type", "composite_data_type_def", "simple_expression", 
			"expression", "function_def", "function_def_args", "function_def_args_types", 
			"function_call", "function_call_args", "statement", "assignment", "conditional", 
			"while_loop", "for_loop", "control", "block_statement"
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

	public static class StartContext extends ParserRuleContext {
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode EOF() { return getToken(a22.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			file();
			setState(45);
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

	public static class FileContext extends ParserRuleContext {
		public List<Composite_data_type_defContext> composite_data_type_def() {
			return getRuleContexts(Composite_data_type_defContext.class);
		}
		public Composite_data_type_defContext composite_data_type_def(int i) {
			return getRuleContext(Composite_data_type_defContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(47);
				composite_data_type_def();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					variable();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL) | (1L << STRING) | (1L << VOID) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(59);
				function_def();
				}
				}
				setState(64);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(a22.SEMICOLON, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Variable_initializationContext variable_initialization() {
			return getRuleContext(Variable_initializationContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(65);
				variable_declaration();
				}
				break;
			case 2:
				{
				setState(66);
				variable_initialization();
				}
				break;
			}
			setState(69);
			match(SEMICOLON);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(a22.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(a22.IDENTIFIER, i);
		}
		public Primitive_data_typeContext primitive_data_type() {
			return getRuleContext(Primitive_data_typeContext.class,0);
		}
		public List<BracketsContext> brackets() {
			return getRuleContexts(BracketsContext.class);
		}
		public BracketsContext brackets(int i) {
			return getRuleContext(BracketsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(a22.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(a22.COMMA, i);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case REAL:
			case STRING:
				{
				setState(71);
				primitive_data_type();
				}
				break;
			case IDENTIFIER:
				{
				setState(72);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(75);
			match(IDENTIFIER);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(76);
				brackets();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(82);
				match(COMMA);
				setState(83);
				match(IDENTIFIER);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFT_BRACKET) {
					{
					{
					setState(84);
					brackets();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(94);
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

	public static class BracketsContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(a22.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(a22.RIGHT_BRACKET, 0); }
		public BracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketsContext brackets() throws RecognitionException {
		BracketsContext _localctx = new BracketsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_brackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(LEFT_BRACKET);
			setState(96);
			expression(0);
			setState(97);
			match(RIGHT_BRACKET);
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

	public static class Variable_initializationContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Primitive_data_typeContext primitive_data_type() {
			return getRuleContext(Primitive_data_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(a22.IDENTIFIER, 0); }
		public Variable_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterVariable_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitVariable_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitVariable_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_initializationContext variable_initialization() throws RecognitionException {
		Variable_initializationContext _localctx = new Variable_initializationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case REAL:
			case STRING:
				{
				setState(99);
				primitive_data_type();
				}
				break;
			case IDENTIFIER:
				{
				setState(100);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(103);
			assignment();
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

	public static class Primitive_data_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(a22.BOOL, 0); }
		public TerminalNode INT() { return getToken(a22.INT, 0); }
		public TerminalNode REAL() { return getToken(a22.REAL, 0); }
		public TerminalNode STRING() { return getToken(a22.STRING, 0); }
		public Primitive_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterPrimitive_data_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitPrimitive_data_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitPrimitive_data_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_data_typeContext primitive_data_type() throws RecognitionException {
		Primitive_data_typeContext _localctx = new Primitive_data_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primitive_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) ) {
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

	public static class Composite_data_type_defContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(a22.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(a22.IDENTIFIER, 0); }
		public TerminalNode LEFT_CURLY() { return getToken(a22.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(a22.RIGHT_CURLY, 0); }
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(a22.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(a22.SEMICOLON, i);
		}
		public Composite_data_type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composite_data_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterComposite_data_type_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitComposite_data_type_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitComposite_data_type_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composite_data_type_defContext composite_data_type_def() throws RecognitionException {
		Composite_data_type_defContext _localctx = new Composite_data_type_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_composite_data_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(TYPE);
			setState(108);
			match(IDENTIFIER);
			setState(109);
			match(LEFT_CURLY);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				variable_declaration();
				setState(111);
				match(SEMICOLON);
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL) | (1L << STRING) | (1L << IDENTIFIER))) != 0) );
			setState(117);
			match(RIGHT_CURLY);
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

	public static class Simple_expressionContext extends ParserRuleContext {
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
	 
		public Simple_expressionContext() { }
		public void copyFrom(Simple_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Int_literalContext extends Simple_expressionContext {
		public TerminalNode INT_LITERAL() { return getToken(a22.INT_LITERAL, 0); }
		public Int_literalContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInt_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInt_literal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class String_literalContext extends Simple_expressionContext {
		public TerminalNode STRING_LITERAL() { return getToken(a22.STRING_LITERAL, 0); }
		public String_literalContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends Simple_expressionContext {
		public TerminalNode IDENTIFIER() { return getToken(a22.IDENTIFIER, 0); }
		public IdentifierContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Fun_callContext extends Simple_expressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Fun_callContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterFun_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitFun_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitFun_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Real_literalContext extends Simple_expressionContext {
		public TerminalNode REAL_LITERAL() { return getToken(a22.REAL_LITERAL, 0); }
		public Real_literalContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterReal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitReal_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitReal_literal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends Simple_expressionContext {
		public TerminalNode TRUE() { return getToken(a22.TRUE, 0); }
		public TrueContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends Simple_expressionContext {
		public TerminalNode FALSE() { return getToken(a22.FALSE, 0); }
		public FalseContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simple_expression);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Int_literalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(INT_LITERAL);
				}
				break;
			case 2:
				_localctx = new Real_literalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(REAL_LITERAL);
				}
				break;
			case 3:
				_localctx = new String_literalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(TRUE);
				}
				break;
			case 5:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(FALSE);
				}
				break;
			case 6:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				match(IDENTIFIER);
				}
				break;
			case 7:
				_localctx = new Fun_callContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				function_call();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Simple_expContext extends ExpressionContext {
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public Simple_expContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterSimple_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitSimple_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitSimple_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pm_expContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS_OP() { return getToken(a22.PLUS_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(a22.MINUS_OP, 0); }
		public Pm_expContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterPm_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitPm_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitPm_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Equal_expContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(a22.EQUAL, 0); }
		public TerminalNode UNEQUAL() { return getToken(a22.UNEQUAL, 0); }
		public Equal_expContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterEqual_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitEqual_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitEqual_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Index_expContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(a22.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(a22.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(a22.RIGHT_BRACKET, 0); }
		public Index_expContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterIndex_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitIndex_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitIndex_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Paren_expContext extends ExpressionContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(a22.LEFT_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(a22.RIGHT_PARENTHESIS, 0); }
		public Paren_expContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterParen_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitParen_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitParen_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Member_acc_expContext extends ExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(a22.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(a22.IDENTIFIER, i);
		}
		public List<TerminalNode> PERIOD() { return getTokens(a22.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(a22.PERIOD, i);
		}
		public Member_acc_expContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterMember_acc_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitMember_acc_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitMember_acc_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Llgg_expContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS() { return getToken(a22.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(a22.LESS_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(a22.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(a22.GREATER_EQUAL, 0); }
		public Llgg_expContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterLlgg_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitLlgg_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitLlgg_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Negation_expContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS_OP() { return getToken(a22.MINUS_OP, 0); }
		public TerminalNode NOT() { return getToken(a22.NOT, 0); }
		public Negation_expContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterNegation_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitNegation_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitNegation_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Mdr_expContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLICATION_OP() { return getToken(a22.MULTIPLICATION_OP, 0); }
		public TerminalNode DIVISION_OP() { return getToken(a22.DIVISION_OP, 0); }
		public TerminalNode REMAINDER_OP() { return getToken(a22.REMAINDER_OP, 0); }
		public Mdr_expContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterMdr_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitMdr_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitMdr_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class And_expContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(a22.AND, 0); }
		public And_expContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterAnd_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitAnd_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitAnd_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Or_expContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(a22.OR, 0); }
		public Or_expContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterOr_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitOr_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitOr_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new Simple_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(129);
				simple_expression();
				}
				break;
			case 2:
				{
				_localctx = new Paren_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(LEFT_PARENTHESIS);
				setState(131);
				expression(0);
				setState(132);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 3:
				{
				_localctx = new Index_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(IDENTIFIER);
				setState(135);
				match(LEFT_BRACKET);
				setState(136);
				expression(0);
				setState(137);
				match(RIGHT_BRACKET);
				}
				break;
			case 4:
				{
				_localctx = new Member_acc_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(IDENTIFIER);
				setState(142); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(140);
						match(PERIOD);
						setState(141);
						match(IDENTIFIER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(144); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				{
				_localctx = new Negation_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				_la = _input.LA(1);
				if ( !(_la==MINUS_OP || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(147);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Mdr_expContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(151);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION_OP) | (1L << DIVISION_OP) | (1L << REMAINDER_OP))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new Pm_expContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(154);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OP || _la==MINUS_OP) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(155);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new Llgg_expContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(157);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << GREATER_EQUAL) | (1L << LESS_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(158);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new Equal_expContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==UNEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(161);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new And_expContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						match(AND);
						setState(164);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new Or_expContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(166);
						match(OR);
						setState(167);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_defContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(a22.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(a22.IDENTIFIER, i);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(a22.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(a22.RIGHT_PARENTHESIS, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Primitive_data_typeContext primitive_data_type() {
			return getRuleContext(Primitive_data_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(a22.VOID, 0); }
		public Function_def_argsContext function_def_args() {
			return getRuleContext(Function_def_argsContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitFunction_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case REAL:
			case STRING:
				{
				setState(173);
				primitive_data_type();
				}
				break;
			case VOID:
				{
				setState(174);
				match(VOID);
				}
				break;
			case IDENTIFIER:
				{
				setState(175);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
			match(IDENTIFIER);
			setState(179);
			match(LEFT_PARENTHESIS);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(180);
				function_def_args();
				}
			}

			setState(183);
			match(RIGHT_PARENTHESIS);
			setState(184);
			block_statement();
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

	public static class Function_def_argsContext extends ParserRuleContext {
		public List<Function_def_args_typesContext> function_def_args_types() {
			return getRuleContexts(Function_def_args_typesContext.class);
		}
		public Function_def_args_typesContext function_def_args_types(int i) {
			return getRuleContext(Function_def_args_typesContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(a22.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(a22.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(a22.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(a22.COMMA, i);
		}
		public Function_def_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterFunction_def_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitFunction_def_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitFunction_def_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_def_argsContext function_def_args() throws RecognitionException {
		Function_def_argsContext _localctx = new Function_def_argsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_def_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			function_def_args_types();
			setState(187);
			match(IDENTIFIER);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				function_def_args_types();
				setState(190);
				match(IDENTIFIER);
				}
				}
				setState(196);
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

	public static class Function_def_args_typesContext extends ParserRuleContext {
		public Primitive_data_typeContext primitive_data_type() {
			return getRuleContext(Primitive_data_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(a22.IDENTIFIER, 0); }
		public TerminalNode CARET() { return getToken(a22.CARET, 0); }
		public Function_def_args_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def_args_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterFunction_def_args_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitFunction_def_args_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitFunction_def_args_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_def_args_typesContext function_def_args_types() throws RecognitionException {
		Function_def_args_typesContext _localctx = new Function_def_args_typesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_def_args_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case REAL:
			case STRING:
				{
				setState(197);
				primitive_data_type();
				}
				break;
			case IDENTIFIER:
				{
				setState(198);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARET) {
				{
				setState(201);
				match(CARET);
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Normal_fun_callContext extends Function_callContext {
		public TerminalNode IDENTIFIER() { return getToken(a22.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(a22.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(a22.RIGHT_PARENTHESIS, 0); }
		public Function_call_argsContext function_call_args() {
			return getRuleContext(Function_call_argsContext.class,0);
		}
		public Normal_fun_callContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterNormal_fun_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitNormal_fun_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitNormal_fun_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Write_fun_callContext extends Function_callContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(a22.LEFT_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(a22.RIGHT_PARENTHESIS, 0); }
		public TerminalNode WRITE() { return getToken(a22.WRITE, 0); }
		public TerminalNode WRITELN() { return getToken(a22.WRITELN, 0); }
		public Write_fun_callContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterWrite_fun_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitWrite_fun_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitWrite_fun_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Read_fun_callContext extends Function_callContext {
		public TerminalNode READ() { return getToken(a22.READ, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(a22.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(a22.IDENTIFIER, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(a22.RIGHT_PARENTHESIS, 0); }
		public Read_fun_callContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterRead_fun_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitRead_fun_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitRead_fun_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new Normal_fun_callContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(IDENTIFIER);
				setState(205);
				match(LEFT_PARENTHESIS);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS_OP) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << WRITE) | (1L << WRITELN) | (1L << READ) | (1L << LEFT_PARENTHESIS) | (1L << INT_LITERAL) | (1L << REAL_LITERAL) | (1L << STRING_LITERAL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(206);
					function_call_args();
					}
				}

				setState(209);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case WRITE:
			case WRITELN:
				_localctx = new Write_fun_callContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				_la = _input.LA(1);
				if ( !(_la==WRITE || _la==WRITELN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
				match(LEFT_PARENTHESIS);
				setState(212);
				expression(0);
				setState(213);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case READ:
				_localctx = new Read_fun_callContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(READ);
				setState(216);
				match(LEFT_PARENTHESIS);
				setState(217);
				match(IDENTIFIER);
				setState(218);
				match(RIGHT_PARENTHESIS);
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

	public static class Function_call_argsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(a22.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(a22.COMMA, i);
		}
		public Function_call_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterFunction_call_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitFunction_call_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitFunction_call_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_argsContext function_call_args() throws RecognitionException {
		Function_call_argsContext _localctx = new Function_call_argsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_call_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			expression(0);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(222);
				match(COMMA);
				setState(223);
				expression(0);
				}
				}
				setState(228);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class While_stateContext extends StatementContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public While_stateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterWhile_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitWhile_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitWhile_state(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Block_stateContext extends StatementContext {
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Block_stateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterBlock_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitBlock_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitBlock_state(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Semicolon_stateContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(a22.SEMICOLON, 0); }
		public Semicolon_stateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterSemicolon_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitSemicolon_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitSemicolon_state(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Conditional_stateContext extends StatementContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Conditional_stateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterConditional_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitConditional_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitConditional_state(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_stateContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(a22.SEMICOLON, 0); }
		public Expression_stateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExpression_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExpression_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExpression_state(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assignment_stateContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(a22.SEMICOLON, 0); }
		public Assignment_stateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterAssignment_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitAssignment_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitAssignment_state(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Control_stateContext extends StatementContext {
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(a22.SEMICOLON, 0); }
		public Control_stateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterControl_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitControl_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitControl_state(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class For_stateContext extends StatementContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public For_stateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterFor_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitFor_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitFor_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new Assignment_stateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				assignment();
				setState(230);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new Conditional_stateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				conditional();
				}
				break;
			case 3:
				_localctx = new While_stateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				while_loop();
				}
				break;
			case 4:
				_localctx = new For_stateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				for_loop();
				}
				break;
			case 5:
				_localctx = new Control_stateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				control();
				setState(236);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new Expression_stateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				expression(0);
				setState(239);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new Block_stateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(241);
				block_statement();
				}
				break;
			case 8:
				_localctx = new Semicolon_stateContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(242);
				match(SEMICOLON);
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN_OP() { return getToken(a22.ASSIGN_OP, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			expression(0);
			setState(246);
			match(ASSIGN_OP);
			setState(247);
			expression(0);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(a22.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(a22.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(a22.ELSE, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IF);
			setState(250);
			expression(0);
			setState(251);
			match(THEN);
			setState(252);
			statement();
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(253);
				match(ELSE);
				setState(254);
				statement();
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(a22.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(WHILE);
			setState(258);
			expression(0);
			setState(259);
			statement();
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(a22.FOR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> INT_LITERAL() { return getTokens(a22.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(a22.INT_LITERAL, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TO() { return getToken(a22.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(a22.DOWNTO, 0); }
		public TerminalNode STEP() { return getToken(a22.STEP, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(FOR);
			setState(262);
			assignment();
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(264);
			match(INT_LITERAL);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(265);
				match(STEP);
				setState(266);
				match(INT_LITERAL);
				}
			}

			setState(269);
			statement();
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

	public static class ControlContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(a22.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_control);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(RETURN);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS_OP) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << WRITE) | (1L << WRITELN) | (1L << READ) | (1L << LEFT_PARENTHESIS) | (1L << INT_LITERAL) | (1L << REAL_LITERAL) | (1L << STRING_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(272);
				expression(0);
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

	public static class Block_statementContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(a22.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(a22.RIGHT_CURLY, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(LEFT_CURLY);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					variable();
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS_OP) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << WRITE) | (1L << WRITELN) | (1L << READ) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << SEMICOLON) | (1L << LEFT_PARENTHESIS) | (1L << LEFT_CURLY) | (1L << INT_LITERAL) | (1L << REAL_LITERAL) | (1L << STRING_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(282);
				statement();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(RIGHT_CURLY);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0125\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\7\3"+
		"\63\n\3\f\3\16\3\66\13\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\7\3?\n\3\f\3"+
		"\16\3B\13\3\3\4\3\4\5\4F\n\4\3\4\3\4\3\5\3\5\5\5L\n\5\3\5\3\5\7\5P\n\5"+
		"\f\5\16\5S\13\5\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\7\5]\n\5\f\5\16\5"+
		"`\13\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7h\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\6\tt\n\t\r\t\16\tu\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0081\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\6\13\u0091\n\13\r\13\16\13\u0092\3\13\3\13\5\13\u0097\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00ab\n\13\f\13\16\13\u00ae\13\13\3\f\3\f\3"+
		"\f\5\f\u00b3\n\f\3\f\3\f\3\f\5\f\u00b8\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u00c3\n\r\f\r\16\r\u00c6\13\r\3\16\3\16\5\16\u00ca\n\16\3"+
		"\16\5\16\u00cd\n\16\3\17\3\17\3\17\5\17\u00d2\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00de\n\17\3\20\3\20\3\20\7\20\u00e3"+
		"\n\20\f\20\16\20\u00e6\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f6\n\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0102\n\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u010e\n\25\3\25\3\25\3\26\3\26\5\26\u0114\n"+
		"\26\3\27\3\27\7\27\u0118\n\27\f\27\16\27\u011b\13\27\3\27\7\27\u011e\n"+
		"\27\f\27\16\27\u0121\13\27\3\27\3\27\3\27\2\3\24\30\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,\2\n\3\2\24\27\4\2\4\4\21\21\3\2\5\7\3\2"+
		"\3\4\3\2\13\16\3\2\t\n\3\2\32\33\3\2#$\2\u013f\2.\3\2\2\2\4\64\3\2\2\2"+
		"\6E\3\2\2\2\bK\3\2\2\2\na\3\2\2\2\fg\3\2\2\2\16k\3\2\2\2\20m\3\2\2\2\22"+
		"\u0080\3\2\2\2\24\u0096\3\2\2\2\26\u00b2\3\2\2\2\30\u00bc\3\2\2\2\32\u00c9"+
		"\3\2\2\2\34\u00dd\3\2\2\2\36\u00df\3\2\2\2 \u00f5\3\2\2\2\"\u00f7\3\2"+
		"\2\2$\u00fb\3\2\2\2&\u0103\3\2\2\2(\u0107\3\2\2\2*\u0111\3\2\2\2,\u0115"+
		"\3\2\2\2./\5\4\3\2/\60\7\2\2\3\60\3\3\2\2\2\61\63\5\20\t\2\62\61\3\2\2"+
		"\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65:\3\2\2\2\66\64\3\2\2\2"+
		"\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;@\3\2\2\2<:\3\2"+
		"\2\2=?\5\26\f\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\5\3\2\2\2B@\3"+
		"\2\2\2CF\5\b\5\2DF\5\f\7\2EC\3\2\2\2ED\3\2\2\2FG\3\2\2\2GH\7\'\2\2H\7"+
		"\3\2\2\2IL\5\16\b\2JL\7\64\2\2KI\3\2\2\2KJ\3\2\2\2LM\3\2\2\2MQ\7\64\2"+
		"\2NP\5\n\6\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R^\3\2\2\2SQ\3\2\2"+
		"\2TU\7(\2\2UY\7\64\2\2VX\5\n\6\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2"+
		"\2Z]\3\2\2\2[Y\3\2\2\2\\T\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\t\3"+
		"\2\2\2`^\3\2\2\2ab\7-\2\2bc\5\24\13\2cd\7.\2\2d\13\3\2\2\2eh\5\16\b\2"+
		"fh\7\64\2\2ge\3\2\2\2gf\3\2\2\2hi\3\2\2\2ij\5\"\22\2j\r\3\2\2\2kl\t\2"+
		"\2\2l\17\3\2\2\2mn\7\31\2\2no\7\64\2\2os\7/\2\2pq\5\b\5\2qr\7\'\2\2rt"+
		"\3\2\2\2sp\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\60\2\2"+
		"x\21\3\2\2\2y\u0081\7\61\2\2z\u0081\7\62\2\2{\u0081\7\63\2\2|\u0081\7"+
		"\22\2\2}\u0081\7\23\2\2~\u0081\7\64\2\2\177\u0081\5\34\17\2\u0080y\3\2"+
		"\2\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\23\3\2\2\2\u0082\u0083\b\13\1\2\u0083"+
		"\u0097\5\22\n\2\u0084\u0085\7+\2\2\u0085\u0086\5\24\13\2\u0086\u0087\7"+
		",\2\2\u0087\u0097\3\2\2\2\u0088\u0089\7\64\2\2\u0089\u008a\7-\2\2\u008a"+
		"\u008b\5\24\13\2\u008b\u008c\7.\2\2\u008c\u0097\3\2\2\2\u008d\u0090\7"+
		"\64\2\2\u008e\u008f\7*\2\2\u008f\u0091\7\64\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097\3\2"+
		"\2\2\u0094\u0095\t\3\2\2\u0095\u0097\5\24\13\t\u0096\u0082\3\2\2\2\u0096"+
		"\u0084\3\2\2\2\u0096\u0088\3\2\2\2\u0096\u008d\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u00ac\3\2\2\2\u0098\u0099\f\b\2\2\u0099\u009a\t\4\2\2\u009a"+
		"\u00ab\5\24\13\t\u009b\u009c\f\7\2\2\u009c\u009d\t\5\2\2\u009d\u00ab\5"+
		"\24\13\b\u009e\u009f\f\6\2\2\u009f\u00a0\t\6\2\2\u00a0\u00ab\5\24\13\7"+
		"\u00a1\u00a2\f\5\2\2\u00a2\u00a3\t\7\2\2\u00a3\u00ab\5\24\13\6\u00a4\u00a5"+
		"\f\4\2\2\u00a5\u00a6\7\17\2\2\u00a6\u00ab\5\24\13\5\u00a7\u00a8\f\3\2"+
		"\2\u00a8\u00a9\7\20\2\2\u00a9\u00ab\5\24\13\4\u00aa\u0098\3\2\2\2\u00aa"+
		"\u009b\3\2\2\2\u00aa\u009e\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a4\3\2"+
		"\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\25\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b3\5\16\b"+
		"\2\u00b0\u00b3\7\30\2\2\u00b1\u00b3\7\64\2\2\u00b2\u00af\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\64"+
		"\2\2\u00b5\u00b7\7+\2\2\u00b6\u00b8\5\30\r\2\u00b7\u00b6\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba\u00bb\5,\27"+
		"\2\u00bb\27\3\2\2\2\u00bc\u00bd\5\32\16\2\u00bd\u00c4\7\64\2\2\u00be\u00bf"+
		"\7(\2\2\u00bf\u00c0\5\32\16\2\u00c0\u00c1\7\64\2\2\u00c1\u00c3\3\2\2\2"+
		"\u00c2\u00be\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\31\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\5\16\b\2\u00c8"+
		"\u00ca\7\64\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cc\3"+
		"\2\2\2\u00cb\u00cd\7)\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\33\3\2\2\2\u00ce\u00cf\7\64\2\2\u00cf\u00d1\7+\2\2\u00d0\u00d2\5\36\20"+
		"\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00de"+
		"\7,\2\2\u00d4\u00d5\t\b\2\2\u00d5\u00d6\7+\2\2\u00d6\u00d7\5\24\13\2\u00d7"+
		"\u00d8\7,\2\2\u00d8\u00de\3\2\2\2\u00d9\u00da\7\34\2\2\u00da\u00db\7+"+
		"\2\2\u00db\u00dc\7\64\2\2\u00dc\u00de\7,\2\2\u00dd\u00ce\3\2\2\2\u00dd"+
		"\u00d4\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de\35\3\2\2\2\u00df\u00e4\5\24\13"+
		"\2\u00e0\u00e1\7(\2\2\u00e1\u00e3\5\24\13\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\37\3\2\2"+
		"\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\5\"\22\2\u00e8\u00e9\7\'\2\2\u00e9"+
		"\u00f6\3\2\2\2\u00ea\u00f6\5$\23\2\u00eb\u00f6\5&\24\2\u00ec\u00f6\5("+
		"\25\2\u00ed\u00ee\5*\26\2\u00ee\u00ef\7\'\2\2\u00ef\u00f6\3\2\2\2\u00f0"+
		"\u00f1\5\24\13\2\u00f1\u00f2\7\'\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f6\5"+
		",\27\2\u00f4\u00f6\7\'\2\2\u00f5\u00e7\3\2\2\2\u00f5\u00ea\3\2\2\2\u00f5"+
		"\u00eb\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f0\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6!\3\2\2\2\u00f7\u00f8"+
		"\5\24\13\2\u00f8\u00f9\7\b\2\2\u00f9\u00fa\5\24\13\2\u00fa#\3\2\2\2\u00fb"+
		"\u00fc\7\35\2\2\u00fc\u00fd\5\24\13\2\u00fd\u00fe\7\36\2\2\u00fe\u0101"+
		"\5 \21\2\u00ff\u0100\7\37\2\2\u0100\u0102\5 \21\2\u0101\u00ff\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102%\3\2\2\2\u0103\u0104\7 \2\2\u0104\u0105\5\24"+
		"\13\2\u0105\u0106\5 \21\2\u0106\'\3\2\2\2\u0107\u0108\7\"\2\2\u0108\u0109"+
		"\5\"\22\2\u0109\u010a\t\t\2\2\u010a\u010d\7\61\2\2\u010b\u010c\7%\2\2"+
		"\u010c\u010e\7\61\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\5 \21\2\u0110)\3\2\2\2\u0111\u0113\7&\2\2\u0112\u0114"+
		"\5\24\13\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114+\3\2\2\2\u0115"+
		"\u0119\7/\2\2\u0116\u0118\5\6\4\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011f\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011c\u011e\5 \21\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\7\60\2\2\u0123-\3\2\2\2\37\64:@EKQY^gu\u0080"+
		"\u0092\u0096\u00aa\u00ac\u00b2\u00b7\u00c4\u00c9\u00cc\u00d1\u00dd\u00e4"+
		"\u00f5\u0101\u010d\u0113\u0119\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}