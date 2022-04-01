// Generated from C:/Users/diogo/Ambiente de Trabalho/Compilers/Compilers/TP_1/src\a22.g4 by ANTLR 4.9.2
package Interpreter;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link a22}.
 */
public interface a22Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link a22#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(a22.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(a22.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#binaries_op}.
	 * @param ctx the parse tree
	 */
	void enterBinaries_op(a22.Binaries_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#binaries_op}.
	 * @param ctx the parse tree
	 */
	void exitBinaries_op(a22.Binaries_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(a22.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(a22.Unary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#voidd}.
	 * @param ctx the parse tree
	 */
	void enterVoidd(a22.VoiddContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#voidd}.
	 * @param ctx the parse tree
	 */
	void exitVoidd(a22.VoiddContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(a22.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(a22.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(a22.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(a22.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#declaracao_variavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_variavel(a22.Declaracao_variavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#declaracao_variavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_variavel(a22.Declaracao_variavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#pointer_types}.
	 * @param ctx the parse tree
	 */
	void enterPointer_types(a22.Pointer_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#pointer_types}.
	 * @param ctx the parse tree
	 */
	void exitPointer_types(a22.Pointer_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#declaracao_variavel_simples}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_variavel_simples(a22.Declaracao_variavel_simplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#declaracao_variavel_simples}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_variavel_simples(a22.Declaracao_variavel_simplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#declaracao_variavel_inicializacao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_variavel_inicializacao(a22.Declaracao_variavel_inicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#declaracao_variavel_inicializacao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_variavel_inicializacao(a22.Declaracao_variavel_inicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#exp_binarias}.
	 * @param ctx the parse tree
	 */
	void enterExp_binarias(a22.Exp_binariasContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#exp_binarias}.
	 * @param ctx the parse tree
	 */
	void exitExp_binarias(a22.Exp_binariasContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#exp_unario}.
	 * @param ctx the parse tree
	 */
	void enterExp_unario(a22.Exp_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#exp_unario}.
	 * @param ctx the parse tree
	 */
	void exitExp_unario(a22.Exp_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#exp_number}.
	 * @param ctx the parse tree
	 */
	void enterExp_number(a22.Exp_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#exp_number}.
	 * @param ctx the parse tree
	 */
	void exitExp_number(a22.Exp_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#exp_qualquer}.
	 * @param ctx the parse tree
	 */
	void enterExp_qualquer(a22.Exp_qualquerContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#exp_qualquer}.
	 * @param ctx the parse tree
	 */
	void exitExp_qualquer(a22.Exp_qualquerContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#exp_parenteses}.
	 * @param ctx the parse tree
	 */
	void enterExp_parenteses(a22.Exp_parentesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#exp_parenteses}.
	 * @param ctx the parse tree
	 */
	void exitExp_parenteses(a22.Exp_parentesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#exp_indexacao_de_ponteiro}.
	 * @param ctx the parse tree
	 */
	void enterExp_indexacao_de_ponteiro(a22.Exp_indexacao_de_ponteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#exp_indexacao_de_ponteiro}.
	 * @param ctx the parse tree
	 */
	void exitExp_indexacao_de_ponteiro(a22.Exp_indexacao_de_ponteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#exp_md}.
	 * @param ctx the parse tree
	 */
	void enterExp_md(a22.Exp_mdContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#exp_md}.
	 * @param ctx the parse tree
	 */
	void exitExp_md(a22.Exp_mdContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#exp_ss}.
	 * @param ctx the parse tree
	 */
	void enterExp_ss(a22.Exp_ssContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#exp_ss}.
	 * @param ctx the parse tree
	 */
	void exitExp_ss(a22.Exp_ssContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#exp_comparadores}.
	 * @param ctx the parse tree
	 */
	void enterExp_comparadores(a22.Exp_comparadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#exp_comparadores}.
	 * @param ctx the parse tree
	 */
	void exitExp_comparadores(a22.Exp_comparadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#exp_elogico}.
	 * @param ctx the parse tree
	 */
	void enterExp_elogico(a22.Exp_elogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#exp_elogico}.
	 * @param ctx the parse tree
	 */
	void exitExp_elogico(a22.Exp_elogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#exp_ologico}.
	 * @param ctx the parse tree
	 */
	void enterExp_ologico(a22.Exp_ologicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#exp_ologico}.
	 * @param ctx the parse tree
	 */
	void exitExp_ologico(a22.Exp_ologicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#op_indexacao_de_ponteiro}.
	 * @param ctx the parse tree
	 */
	void enterOp_indexacao_de_ponteiro(a22.Op_indexacao_de_ponteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#op_indexacao_de_ponteiro}.
	 * @param ctx the parse tree
	 */
	void exitOp_indexacao_de_ponteiro(a22.Op_indexacao_de_ponteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#op_isne}.
	 * @param ctx the parse tree
	 */
	void enterOp_isne(a22.Op_isneContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#op_isne}.
	 * @param ctx the parse tree
	 */
	void exitOp_isne(a22.Op_isneContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#op_comparadores}.
	 * @param ctx the parse tree
	 */
	void enterOp_comparadores(a22.Op_comparadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#op_comparadores}.
	 * @param ctx the parse tree
	 */
	void exitOp_comparadores(a22.Op_comparadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#op_elogico}.
	 * @param ctx the parse tree
	 */
	void enterOp_elogico(a22.Op_elogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#op_elogico}.
	 * @param ctx the parse tree
	 */
	void exitOp_elogico(a22.Op_elogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22#op_ologico}.
	 * @param ctx the parse tree
	 */
	void enterOp_ologico(a22.Op_ologicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22#op_ologico}.
	 * @param ctx the parse tree
	 */
	void exitOp_ologico(a22.Op_ologicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Op_soma_label_unique}
	 * labeled alternative in {@link a22#op_soma}.
	 * @param ctx the parse tree
	 */
	void enterOp_soma_label_unique(a22.Op_soma_label_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Op_soma_label_unique}
	 * labeled alternative in {@link a22#op_soma}.
	 * @param ctx the parse tree
	 */
	void exitOp_soma_label_unique(a22.Op_soma_label_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Op_subtrair_label_unique}
	 * labeled alternative in {@link a22#op_subtrair}.
	 * @param ctx the parse tree
	 */
	void enterOp_subtrair_label_unique(a22.Op_subtrair_label_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Op_subtrair_label_unique}
	 * labeled alternative in {@link a22#op_subtrair}.
	 * @param ctx the parse tree
	 */
	void exitOp_subtrair_label_unique(a22.Op_subtrair_label_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Op_dividir_label_unique}
	 * labeled alternative in {@link a22#op_dividir}.
	 * @param ctx the parse tree
	 */
	void enterOp_dividir_label_unique(a22.Op_dividir_label_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Op_dividir_label_unique}
	 * labeled alternative in {@link a22#op_dividir}.
	 * @param ctx the parse tree
	 */
	void exitOp_dividir_label_unique(a22.Op_dividir_label_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Op_multiplicar_label_unique}
	 * labeled alternative in {@link a22#op_multiplicar}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiplicar_label_unique(a22.Op_multiplicar_label_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Op_multiplicar_label_unique}
	 * labeled alternative in {@link a22#op_multiplicar}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiplicar_label_unique(a22.Op_multiplicar_label_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Op_resto_label_unique}
	 * labeled alternative in {@link a22#op_resto}.
	 * @param ctx the parse tree
	 */
	void enterOp_resto_label_unique(a22.Op_resto_label_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Op_resto_label_unique}
	 * labeled alternative in {@link a22#op_resto}.
	 * @param ctx the parse tree
	 */
	void exitOp_resto_label_unique(a22.Op_resto_label_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arg_funcao_label}
	 * labeled alternative in {@link a22#argumento_funcao}.
	 * @param ctx the parse tree
	 */
	void enterArg_funcao_label(a22.Arg_funcao_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arg_funcao_label}
	 * labeled alternative in {@link a22#argumento_funcao}.
	 * @param ctx the parse tree
	 */
	void exitArg_funcao_label(a22.Arg_funcao_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arg_funcao_pointers_label}
	 * labeled alternative in {@link a22#argumento_funcao}.
	 * @param ctx the parse tree
	 */
	void enterArg_funcao_pointers_label(a22.Arg_funcao_pointers_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arg_funcao_pointers_label}
	 * labeled alternative in {@link a22#argumento_funcao}.
	 * @param ctx the parse tree
	 */
	void exitArg_funcao_pointers_label(a22.Arg_funcao_pointers_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Args_funcao_label}
	 * labeled alternative in {@link a22#argumentos_funcao}.
	 * @param ctx the parse tree
	 */
	void enterArgs_funcao_label(a22.Args_funcao_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Args_funcao_label}
	 * labeled alternative in {@link a22#argumentos_funcao}.
	 * @param ctx the parse tree
	 */
	void exitArgs_funcao_label(a22.Args_funcao_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declaracao_funcao_void_label}
	 * labeled alternative in {@link a22#declaracao_funcao_void}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_funcao_void_label(a22.Declaracao_funcao_void_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declaracao_funcao_void_label}
	 * labeled alternative in {@link a22#declaracao_funcao_void}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_funcao_void_label(a22.Declaracao_funcao_void_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declaracao_funcao_label}
	 * labeled alternative in {@link a22#declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_funcao_label(a22.Declaracao_funcao_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declaracao_funcao_label}
	 * labeled alternative in {@link a22#declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_funcao_label(a22.Declaracao_funcao_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bloco_label}
	 * labeled alternative in {@link a22#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco_label(a22.Bloco_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bloco_label}
	 * labeled alternative in {@link a22#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco_label(a22.Bloco_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Leave_label}
	 * labeled alternative in {@link a22#instrucoes_controle}.
	 * @param ctx the parse tree
	 */
	void enterLeave_label(a22.Leave_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Leave_label}
	 * labeled alternative in {@link a22#instrucoes_controle}.
	 * @param ctx the parse tree
	 */
	void exitLeave_label(a22.Leave_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Restart_label}
	 * labeled alternative in {@link a22#instrucoes_controle}.
	 * @param ctx the parse tree
	 */
	void enterRestart_label(a22.Restart_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Restart_label}
	 * labeled alternative in {@link a22#instrucoes_controle}.
	 * @param ctx the parse tree
	 */
	void exitRestart_label(a22.Restart_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return_label}
	 * labeled alternative in {@link a22#instrucoes_controle}.
	 * @param ctx the parse tree
	 */
	void enterReturn_label(a22.Return_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return_label}
	 * labeled alternative in {@link a22#instrucoes_controle}.
	 * @param ctx the parse tree
	 */
	void exitReturn_label(a22.Return_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstCont_Return_exp_label}
	 * labeled alternative in {@link a22#instrucoes_controle}.
	 * @param ctx the parse tree
	 */
	void enterInstCont_Return_exp_label(a22.InstCont_Return_exp_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstCont_Return_exp_label}
	 * labeled alternative in {@link a22#instrucoes_controle}.
	 * @param ctx the parse tree
	 */
	void exitInstCont_Return_exp_label(a22.InstCont_Return_exp_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atribuicao_label}
	 * labeled alternative in {@link a22#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_label(a22.Atribuicao_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atribuicao_label}
	 * labeled alternative in {@link a22#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_label(a22.Atribuicao_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Instrucao_condicional_label}
	 * labeled alternative in {@link a22#instrucao_condicional}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_condicional_label(a22.Instrucao_condicional_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Instrucao_condicional_label}
	 * labeled alternative in {@link a22#instrucao_condicional}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_condicional_label(a22.Instrucao_condicional_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ciclo_label}
	 * labeled alternative in {@link a22#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_label(a22.Ciclo_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ciclo_label}
	 * labeled alternative in {@link a22#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_label(a22.Ciclo_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subbloco_label}
	 * labeled alternative in {@link a22#subbloco}.
	 * @param ctx the parse tree
	 */
	void enterSubbloco_label(a22.Subbloco_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subbloco_label}
	 * labeled alternative in {@link a22#subbloco}.
	 * @param ctx the parse tree
	 */
	void exitSubbloco_label(a22.Subbloco_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Prologo_label}
	 * labeled alternative in {@link a22#prologo}.
	 * @param ctx the parse tree
	 */
	void enterPrologo_label(a22.Prologo_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Prologo_label}
	 * labeled alternative in {@link a22#prologo}.
	 * @param ctx the parse tree
	 */
	void exitPrologo_label(a22.Prologo_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Epilogo_label}
	 * labeled alternative in {@link a22#epilogo}.
	 * @param ctx the parse tree
	 */
	void enterEpilogo_label(a22.Epilogo_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Epilogo_label}
	 * labeled alternative in {@link a22#epilogo}.
	 * @param ctx the parse tree
	 */
	void exitEpilogo_label(a22.Epilogo_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Instrucoes_exp_qualquer}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 */
	void enterInstrucoes_exp_qualquer(a22.Instrucoes_exp_qualquerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Instrucoes_exp_qualquer}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 */
	void exitInstrucoes_exp_qualquer(a22.Instrucoes_exp_qualquerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Instrucoes_instrucoes_controle}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 */
	void enterInstrucoes_instrucoes_controle(a22.Instrucoes_instrucoes_controleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Instrucoes_instrucoes_controle}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 */
	void exitInstrucoes_instrucoes_controle(a22.Instrucoes_instrucoes_controleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Instrucoes_atribuicao}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 */
	void enterInstrucoes_atribuicao(a22.Instrucoes_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Instrucoes_atribuicao}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 */
	void exitInstrucoes_atribuicao(a22.Instrucoes_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Instrucoes_instrucao_condicional}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 */
	void enterInstrucoes_instrucao_condicional(a22.Instrucoes_instrucao_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Instrucoes_instrucao_condicional}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 */
	void exitInstrucoes_instrucao_condicional(a22.Instrucoes_instrucao_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Instrucoes_ciclo}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 */
	void enterInstrucoes_ciclo(a22.Instrucoes_cicloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Instrucoes_ciclo}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 */
	void exitInstrucoes_ciclo(a22.Instrucoes_cicloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Instrucoes_subbloco}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 */
	void enterInstrucoes_subbloco(a22.Instrucoes_subblocoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Instrucoes_subbloco}
	 * labeled alternative in {@link a22#instrucoes}.
	 * @param ctx the parse tree
	 */
	void exitInstrucoes_subbloco(a22.Instrucoes_subblocoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return_exp_label}
	 * labeled alternative in {@link a22#return_exp}.
	 * @param ctx the parse tree
	 */
	void enterReturn_exp_label(a22.Return_exp_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return_exp_label}
	 * labeled alternative in {@link a22#return_exp}.
	 * @param ctx the parse tree
	 */
	void exitReturn_exp_label(a22.Return_exp_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvFunc_invocao_funcao}
	 * labeled alternative in {@link a22#invocacao_funcoes}.
	 * @param ctx the parse tree
	 */
	void enterInvFunc_invocao_funcao(a22.InvFunc_invocao_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvFunc_invocao_funcao}
	 * labeled alternative in {@link a22#invocacao_funcoes}.
	 * @param ctx the parse tree
	 */
	void exitInvFunc_invocao_funcao(a22.InvFunc_invocao_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvFunc_funcao_especial}
	 * labeled alternative in {@link a22#invocacao_funcoes}.
	 * @param ctx the parse tree
	 */
	void enterInvFunc_funcao_especial(a22.InvFunc_funcao_especialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvFunc_funcao_especial}
	 * labeled alternative in {@link a22#invocacao_funcoes}.
	 * @param ctx the parse tree
	 */
	void exitInvFunc_funcao_especial(a22.InvFunc_funcao_especialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Invocacao_funcao_label}
	 * labeled alternative in {@link a22#invocacao_funcao}.
	 * @param ctx the parse tree
	 */
	void enterInvocacao_funcao_label(a22.Invocacao_funcao_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Invocacao_funcao_label}
	 * labeled alternative in {@link a22#invocacao_funcao}.
	 * @param ctx the parse tree
	 */
	void exitInvocacao_funcao_label(a22.Invocacao_funcao_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvFuncEspecial_arroba}
	 * labeled alternative in {@link a22#invocacao_funcao_especial}.
	 * @param ctx the parse tree
	 */
	void enterInvFuncEspecial_arroba(a22.InvFuncEspecial_arrobaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvFuncEspecial_arroba}
	 * labeled alternative in {@link a22#invocacao_funcao_especial}.
	 * @param ctx the parse tree
	 */
	void exitInvFuncEspecial_arroba(a22.InvFuncEspecial_arrobaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvFuncEspecial_sizeof}
	 * labeled alternative in {@link a22#invocacao_funcao_especial}.
	 * @param ctx the parse tree
	 */
	void enterInvFuncEspecial_sizeof(a22.InvFuncEspecial_sizeofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvFuncEspecial_sizeof}
	 * labeled alternative in {@link a22#invocacao_funcao_especial}.
	 * @param ctx the parse tree
	 */
	void exitInvFuncEspecial_sizeof(a22.InvFuncEspecial_sizeofContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvFuncEspecial_write}
	 * labeled alternative in {@link a22#invocacao_funcao_especial}.
	 * @param ctx the parse tree
	 */
	void enterInvFuncEspecial_write(a22.InvFuncEspecial_writeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvFuncEspecial_write}
	 * labeled alternative in {@link a22#invocacao_funcao_especial}.
	 * @param ctx the parse tree
	 */
	void exitInvFuncEspecial_write(a22.InvFuncEspecial_writeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvFuncEspecial_writeln}
	 * labeled alternative in {@link a22#invocacao_funcao_especial}.
	 * @param ctx the parse tree
	 */
	void enterInvFuncEspecial_writeln(a22.InvFuncEspecial_writelnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvFuncEspecial_writeln}
	 * labeled alternative in {@link a22#invocacao_funcao_especial}.
	 * @param ctx the parse tree
	 */
	void exitInvFuncEspecial_writeln(a22.InvFuncEspecial_writelnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arroba_label}
	 * labeled alternative in {@link a22#arroba}.
	 * @param ctx the parse tree
	 */
	void enterArroba_label(a22.Arroba_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arroba_label}
	 * labeled alternative in {@link a22#arroba}.
	 * @param ctx the parse tree
	 */
	void exitArroba_label(a22.Arroba_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sizeof_label}
	 * labeled alternative in {@link a22#sizeof}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_label(a22.Sizeof_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sizeof_label}
	 * labeled alternative in {@link a22#sizeof}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_label(a22.Sizeof_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Write_label}
	 * labeled alternative in {@link a22#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite_label(a22.Write_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Write_label}
	 * labeled alternative in {@link a22#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite_label(a22.Write_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Writeln_label}
	 * labeled alternative in {@link a22#writeln}.
	 * @param ctx the parse tree
	 */
	void enterWriteln_label(a22.Writeln_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Writeln_label}
	 * labeled alternative in {@link a22#writeln}.
	 * @param ctx the parse tree
	 */
	void exitWriteln_label(a22.Writeln_labelContext ctx);
}