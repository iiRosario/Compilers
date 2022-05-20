// Generated from C:/Users/diogo/Ambiente de Trabalho/Compilers/Compilers/TP_1/src\a22.g4 by ANTLR 4.9.2
package Interpreter;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link a22}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface a22Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link a22#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(a22.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(a22.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(a22.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(a22.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(a22.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#variable_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_initialization(a22.Variable_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#primitive_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_data_type(a22.Primitive_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#composite_data_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_data_type_def(a22.Composite_data_type_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int_literal}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(a22.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real_literal}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_literal(a22.Real_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_literal}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(a22.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(a22.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(a22.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(a22.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fun_call}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_call(a22.Fun_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_exp(a22.Simple_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pm_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPm_exp(a22.Pm_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_exp(a22.Equal_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code index_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_exp(a22.Index_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_exp(a22.Paren_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code member_acc_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_acc_exp(a22.Member_acc_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code llgg_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlgg_exp(a22.Llgg_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negation_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation_exp(a22.Negation_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mdr_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdr_exp(a22.Mdr_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_exp(a22.And_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_exp(a22.Or_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(a22.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#function_def_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def_args(a22.Function_def_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#function_def_args_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def_args_types(a22.Function_def_args_typesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normal_fun_call}
	 * labeled alternative in {@link a22#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_fun_call(a22.Normal_fun_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code write_fun_call}
	 * labeled alternative in {@link a22#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_fun_call(a22.Write_fun_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read_fun_call}
	 * labeled alternative in {@link a22#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_fun_call(a22.Read_fun_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#function_call_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_args(a22.Function_call_argsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_state(a22.Assignment_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditional_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_state(a22.Conditional_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_state(a22.While_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_state(a22.For_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code control_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_state(a22.Control_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_state(a22.Expression_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_state(a22.Block_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code semicolon_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_state(a22.Semicolon_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(a22.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(a22.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(a22.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(a22.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl(a22.ControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(a22.Block_statementContext ctx);
}