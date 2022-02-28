package interpreter;// Generated from C:/Users/diogo/Ambiente de Trabalho/Compilers/Compilers/P1/src\Interpreter.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterpreterParser}.
 */
public interface InterpreterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(InterpreterParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(InterpreterParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(InterpreterParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(InterpreterParser.ExpressionContext ctx);
}