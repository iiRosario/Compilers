// Generated from C:/Users/diogo/Ambiente de Trabalho/Compilers/Compilers/TP_1/src\a22.g4 by ANTLR 4.9.2
package Interpreter;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link a22}.
 */
public interface a22Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link a22#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(a22.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(a22.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(a22.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(a22.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(a22.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(a22.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(a22.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(a22.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#brackets}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(a22.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#brackets}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(a22.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#variable_initialization}.
	 * @param ctx the parse tree
	 */
	void enterVariable_initialization(a22.Variable_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#variable_initialization}.
	 * @param ctx the parse tree
	 */
	void exitVariable_initialization(a22.Variable_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#primitive_data_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_data_type(a22.Primitive_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#primitive_data_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_data_type(a22.Primitive_data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#composite_data_type_def}.
	 * @param ctx the parse tree
	 */
	void enterComposite_data_type_def(a22.Composite_data_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#composite_data_type_def}.
	 * @param ctx the parse tree
	 */
	void exitComposite_data_type_def(a22.Composite_data_type_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_literal}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(a22.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_literal}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(a22.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real_literal}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterReal_literal(a22.Real_literalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real_literal}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitReal_literal(a22.Real_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_literal}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(a22.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_literal}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(a22.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterTrue(a22.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitTrue(a22.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterFalse(a22.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitFalse(a22.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(a22.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(a22.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fun_call}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterFun_call(a22.Fun_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fun_call}
	 * labeled alternative in {@link a22#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitFun_call(a22.Fun_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_exp(a22.Simple_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_exp(a22.Simple_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pm_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void enterPm_exp(a22.Pm_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pm_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void exitPm_exp(a22.Pm_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqual_exp(a22.Equal_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqual_exp(a22.Equal_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code index_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndex_exp(a22.Index_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code index_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndex_exp(a22.Index_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void enterParen_exp(a22.Paren_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void exitParen_exp(a22.Paren_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code member_acc_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void enterMember_acc_exp(a22.Member_acc_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code member_acc_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void exitMember_acc_exp(a22.Member_acc_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code llgg_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void enterLlgg_exp(a22.Llgg_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code llgg_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void exitLlgg_exp(a22.Llgg_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negation_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegation_exp(a22.Negation_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negation_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegation_exp(a22.Negation_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mdr_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void enterMdr_exp(a22.Mdr_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mdr_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void exitMdr_exp(a22.Mdr_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_exp(a22.And_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_exp(a22.And_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_exp(a22.Or_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or_exp}
	 * labeled alternative in {@link a22#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_exp(a22.Or_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(a22.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(a22.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#function_def_args}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def_args(a22.Function_def_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#function_def_args}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def_args(a22.Function_def_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#function_def_args_types}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def_args_types(a22.Function_def_args_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#function_def_args_types}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def_args_types(a22.Function_def_args_typesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normal_fun_call}
	 * labeled alternative in {@link a22#function_call}.
	 * @param ctx the parse tree
	 */
	void enterNormal_fun_call(a22.Normal_fun_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normal_fun_call}
	 * labeled alternative in {@link a22#function_call}.
	 * @param ctx the parse tree
	 */
	void exitNormal_fun_call(a22.Normal_fun_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write_fun_call}
	 * labeled alternative in {@link a22#function_call}.
	 * @param ctx the parse tree
	 */
	void enterWrite_fun_call(a22.Write_fun_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write_fun_call}
	 * labeled alternative in {@link a22#function_call}.
	 * @param ctx the parse tree
	 */
	void exitWrite_fun_call(a22.Write_fun_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read_fun_call}
	 * labeled alternative in {@link a22#function_call}.
	 * @param ctx the parse tree
	 */
	void enterRead_fun_call(a22.Read_fun_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read_fun_call}
	 * labeled alternative in {@link a22#function_call}.
	 * @param ctx the parse tree
	 */
	void exitRead_fun_call(a22.Read_fun_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#function_call_args}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_args(a22.Function_call_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#function_call_args}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_args(a22.Function_call_argsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_state(a22.Assignment_stateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_state(a22.Assignment_stateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditional_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_state(a22.Conditional_stateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditional_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_state(a22.Conditional_stateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_state(a22.While_stateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_state(a22.While_stateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_state(a22.For_stateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_state(a22.For_stateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code control_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void enterControl_state(a22.Control_stateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code control_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void exitControl_state(a22.Control_stateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_state(a22.Expression_stateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_state(a22.Expression_stateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_state(a22.Block_stateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_state(a22.Block_stateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code semicolon_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon_state(a22.Semicolon_stateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code semicolon_state}
	 * labeled alternative in {@link a22#statement}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon_state(a22.Semicolon_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(a22.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(a22.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(a22.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(a22.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(a22.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(a22.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(a22.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(a22.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#control}.
	 * @param ctx the parse tree
	 */
	void enterControl(a22.ControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#control}.
	 * @param ctx the parse tree
	 */
	void exitControl(a22.ControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(a22.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(a22.Block_statementContext ctx);
}