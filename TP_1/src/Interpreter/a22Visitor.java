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
	 * Visit a parse tree produced by {@link a22#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(a22.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#binaries_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaries_op(a22.Binaries_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op(a22.Unary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#voidd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidd(a22.VoiddContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(a22.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(a22.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#declaracao_variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_variavel(a22.Declaracao_variavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#pointer_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_types(a22.Pointer_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#declaracao_variavel_simples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_variavel_simples(a22.Declaracao_variavel_simplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#declaracao_variavel_inicializacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_variavel_inicializacao(a22.Declaracao_variavel_inicializacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#exp_binarias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_binarias(a22.Exp_binariasContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#exp_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_unario(a22.Exp_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#exp_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_number(a22.Exp_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#exp_qualquer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_qualquer(a22.Exp_qualquerContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#exp_parenteses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_parenteses(a22.Exp_parentesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#exp_indexacao_de_ponteiro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_indexacao_de_ponteiro(a22.Exp_indexacao_de_ponteiroContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#exp_md}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_md(a22.Exp_mdContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#exp_ss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_ss(a22.Exp_ssContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#exp_comparadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_comparadores(a22.Exp_comparadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#exp_elogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_elogico(a22.Exp_elogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#exp_ologico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_ologico(a22.Exp_ologicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#op_indexacao_de_ponteiro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_indexacao_de_ponteiro(a22.Op_indexacao_de_ponteiroContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#op_isne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_isne(a22.Op_isneContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#op_comparadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_comparadores(a22.Op_comparadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#op_elogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_elogico(a22.Op_elogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22#op_ologico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_ologico(a22.Op_ologicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Op_soma_label_unique}
	 * labeled alternative in {@link a22#op_soma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_soma_label_unique(a22.Op_soma_label_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Op_subtrair_label_unique}
	 * labeled alternative in {@link a22#op_subtrair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_subtrair_label_unique(a22.Op_subtrair_label_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Op_dividir_label_unique}
	 * labeled alternative in {@link a22#op_dividir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_dividir_label_unique(a22.Op_dividir_label_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Op_multiplicar_label_unique}
	 * labeled alternative in {@link a22#op_multiplicar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_multiplicar_label_unique(a22.Op_multiplicar_label_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Op_resto_label_unique}
	 * labeled alternative in {@link a22#op_resto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_resto_label_unique(a22.Op_resto_label_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arg_funcao_label}
	 * labeled alternative in {@link a22#argumento_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_funcao_label(a22.Arg_funcao_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arg_funcao_pointers_label}
	 * labeled alternative in {@link a22#argumento_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_funcao_pointers_label(a22.Arg_funcao_pointers_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Args_funcao_label}
	 * labeled alternative in {@link a22#argumentos_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_funcao_label(a22.Args_funcao_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declaracao_funcao_void_label}
	 * labeled alternative in {@link a22#declaracao_funcao_void}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_funcao_void_label(a22.Declaracao_funcao_void_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declaracao_funcao_label}
	 * labeled alternative in {@link a22#declaracao_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_funcao_label(a22.Declaracao_funcao_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bloco_label}
	 * labeled alternative in {@link a22#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco_label(a22.Bloco_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Leave_label}
	 * labeled alternative in {@link a22#instrucoes_controle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeave_label(a22.Leave_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Restart_label}
	 * labeled alternative in {@link a22#instrucoes_controle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestart_label(a22.Restart_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return_label}
	 * labeled alternative in {@link a22#instrucoes_controle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_label(a22.Return_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstCont_Return_exp_label}
	 * labeled alternative in {@link a22#instrucoes_controle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstCont_Return_exp_label(a22.InstCont_Return_exp_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atribuicao_label}
	 * labeled alternative in {@link a22#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao_label(a22.Atribuicao_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instrucao_condicional_label}
	 * labeled alternative in {@link a22#instrucao_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao_condicional_label(a22.Instrucao_condicional_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ciclo_label}
	 * labeled alternative in {@link a22#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_label(a22.Ciclo_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subbloco_label}
	 * labeled alternative in {@link a22#subbloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubbloco_label(a22.Subbloco_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Prologo_label}
	 * labeled alternative in {@link a22#prologo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrologo_label(a22.Prologo_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Epilogo_label}
	 * labeled alternative in {@link a22#epilogo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpilogo_label(a22.Epilogo_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instrucoes_exp_qualquer}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucoes_exp_qualquer(a22.Instrucoes_exp_qualquerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instrucoes_instrucoes_controle}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucoes_instrucoes_controle(a22.Instrucoes_instrucoes_controleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instrucoes_atribuicao}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucoes_atribuicao(a22.Instrucoes_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instrucoes_instrucao_condicional}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucoes_instrucao_condicional(a22.Instrucoes_instrucao_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instrucoes_ciclo}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucoes_ciclo(a22.Instrucoes_cicloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instrucoes_subbloco}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucoes_subbloco(a22.Instrucoes_subblocoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return_exp_label}
	 * labeled alternative in {@link a22#return_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_exp_label(a22.Return_exp_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvFunc_invocao_funcao}
	 * labeled alternative in {@link a22#invocacao_funcoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvFunc_invocao_funcao(a22.InvFunc_invocao_funcaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvFunc_funcao_especial}
	 * labeled alternative in {@link a22#invocacao_funcoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvFunc_funcao_especial(a22.InvFunc_funcao_especialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Invocacao_funcao_label}
	 * labeled alternative in {@link a22#invocacao_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocacao_funcao_label(a22.Invocacao_funcao_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvFuncEspecial_arroba}
	 * labeled alternative in {@link a22#invocacao_funcao_especial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvFuncEspecial_arroba(a22.InvFuncEspecial_arrobaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvFuncEspecial_sizeof}
	 * labeled alternative in {@link a22#invocacao_funcao_especial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvFuncEspecial_sizeof(a22.InvFuncEspecial_sizeofContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvFuncEspecial_write}
	 * labeled alternative in {@link a22#invocacao_funcao_especial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvFuncEspecial_write(a22.InvFuncEspecial_writeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvFuncEspecial_writeln}
	 * labeled alternative in {@link a22#invocacao_funcao_especial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvFuncEspecial_writeln(a22.InvFuncEspecial_writelnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arroba_label}
	 * labeled alternative in {@link a22#arroba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArroba_label(a22.Arroba_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sizeof_label}
	 * labeled alternative in {@link a22#sizeof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_label(a22.Sizeof_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Write_label}
	 * labeled alternative in {@link a22#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_label(a22.Write_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Writeln_label}
	 * labeled alternative in {@link a22#writeln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteln_label(a22.Writeln_labelContext ctx);
}