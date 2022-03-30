parser grammar a22;
options{tokenVocab = a22Lexer;}

programa : declaracoes* EOF;

//================ DECLARAÇões ================
binaries_op: PLUS | MINUS | MULTIPLY | DIVIDE | PERCENTAGE |  LT |  GT | GTE | EQUALS | NEQUAL | AND | OR | LSB | RSB;
unary_op: PLUS | MINUS | TILDE | QM | LP | RP;
voidd: VOID_;


declaracoes: declaracao+

declaracao: declaracao_variavel
            | declaracao_funcao_void
            | declaracao_funcao
            ;

declaracao_variavel:
                    declaracao_variavel_simples
                    | declaracao_variavel_inicializacao
                    ;


pointer_types:  INT_P
                | BOOLEAN_P
                | FLOAT_P
                | STRING_P
                | VOID_P
                ;

//declaração variavel simples
declaracao_variavel_simples:
                 TYPES IDENTIFICATOR (WHITE_SPACE* COMMA WHITE_SPACE* IDENTIFICATOR)* WHITE_SPACE* BT
                 | pointer_types WHITE_SPACE* IDENTIFICATOR  (WHITE_SPACE* COMMA WHITE_SPACE* IDENTIFICATOR)*  WHITE_SPACE*  BT
;


declaracao_variavel_inicializacao:
                TYPES WHITE_SPACE* IDENTIFICATOR WHITE_SPACE* EQUAL WHITE_SPACE* exp_qualquer+ WHITE_SPACE* BT
                | pointer_types WHITE_SPACE* IDENTIFICATOR WHITE_SPACE* EQUAL WHITE_SPACE* LSB WHITE_SPACE* exp_qualquer+ WHITE_SPACE* RSB WHITE_SPACE* BT
                ;

exp_binarias: exp_indexacao_de_ponteiro
              | exp_md
              | exp_ss
              | exp_comparadores
              | exp_ologico
              | exp_elogico
              ;

exp_unario: exp_number
            | exp_parenteses
            | invocacao_funcoes
            | IDENTIFICATOR
            | (TRUE|FALSE)
            | op_isne
            ;

exp_number: LITERAL_I
            | LITERAL_R
            ;



exp_qualquer: exp_binarias
             |  exp_unario
            ;


exp_parenteses: LP exp_qualquer  RP;

exp_indexacao_de_ponteiro: op_indexacao_de_ponteiro(WHITE_SPACE* binaries_op  WHITE_SPACE* exp_unario)*;

exp_md: op_multiplicar (WHITE_SPACE* binaries_op  WHITE_SPACE* exp_unario)*
        | op_dividir (WHITE_SPACE* binaries_op  WHITE_SPACE* exp_unario)*
        | op_resto(WHITE_SPACE* binaries_op  WHITE_SPACE* exp_unario)*
        ;

exp_ss: op_soma (WHITE_SPACE* binaries_op  WHITE_SPACE* exp_unario)*
        | op_subtrair (WHITE_SPACE* binaries_op  WHITE_SPACE* exp_unario)*
        ;
        //soma e subtração

exp_comparadores: op_comparadores (WHITE_SPACE* binaries_op  WHITE_SPACE* exp_unario)*     ;       // <,>,>=,<=,==,!=
exp_elogico: op_elogico (WHITE_SPACE* binaries_op  WHITE_SPACE* exp_unario)*               ;            //&&
exp_ologico: op_ologico (WHITE_SPACE* binaries_op  WHITE_SPACE* exp_unario)*               ;            // ||

op_indexacao_de_ponteiro: WHITE_SPACE* (IDENTIFICATOR|LITERAL_I) LSB WHITE_SPACE* exp_qualquer WHITE_SPACE* RSB WHITE_SPACE*      ;
op_isne: WHITE_SPACE* (PLUS|MINUS|TILDE|QM) (IDENTIFICATOR|exp_number) WHITE_SPACE*                                               ;
op_comparadores: exp_unario WHITE_SPACE* (LT|GT|GTE|LTE|EQUALS|NEQUAL)  WHITE_SPACE*  exp_unario                                  ;
op_elogico: exp_unario WHITE_SPACE* AND WHITE_SPACE*  exp_unario                                                                  ;
op_ologico: exp_unario WHITE_SPACE* OR WHITE_SPACE*  exp_unario                                                                   ;

//operações
//op_qualquer: op_soma            #Op_soma_label
           // | op_subtrair       #Op_subtrair_label
          //  | op_dividir        #Op_dividir_label
          //  | op_multiplicar    #Op_multiplicar_label
          //  | op_resto          #Op_resto_label
           // ;

//op_soma:  exp_number|IDENTIFICATOR WHITE_SPACE* PLUS  WHITE_SPACE* exp_number|IDENTIFICATOR ;
op_soma: exp_unario  PLUS    exp_unario             #Op_soma_label_unique;
op_subtrair: exp_unario WHITE_SPACE* MINUS  WHITE_SPACE* exp_unario         #Op_subtrair_label_unique;
op_dividir: exp_unario WHITE_SPACE* DIVIDE  WHITE_SPACE* exp_unario         #Op_dividir_label_unique;
op_multiplicar: exp_unario WHITE_SPACE* MULTIPLY  WHITE_SPACE* exp_unario   #Op_multiplicar_label_unique;
op_resto: exp_unario WHITE_SPACE* PERCENTAGE  WHITE_SPACE* exp_unario       #Op_resto_label_unique;




//                                                  FUNCOES


argumento_funcao: WHITE_SPACE* TYPES WHITE_SPACE* IDENTIFICATOR WHITE_SPACE*                    #Arg_funcao_label
                  | WHITE_SPACE* pointer_types WHITE_SPACE* IDENTIFICATOR WHITE_SPACE*          #Arg_funcao_pointers_label;

argumentos_funcao:  argumento_funcao (COMMA argumento_funcao)*                                  #Args_funcao_label;

declaracao_funcao_void: voidd WHITE_SPACE* IDENTIFICATOR LP argumentos_funcao* RP WHITE_SPACE*
                        LB WHITE_SPACE* declaracao_variavel* WHITE_SPACE* instrucoes* WHITE_SPACE* RB                                #Declaracao_funcao_void_label;

declaracao_funcao: WHITE_SPACE* TYPES WHITE_SPACE* IDENTIFICATOR LP argumentos_funcao* RP WHITE_SPACE* prologo? bloco epilogo?       #Declaracao_funcao_label;



bloco: LB WHITE_SPACE* declaracao_variavel* WHITE_SPACE* instrucoes* WHITE_SPACE* return_exp WHITE_SPACE* RB                         #Bloco_label;


instrucoes_controle: LEAVE        #Leave_label
                    | RESTART     #Restart_label
                    | RETURN      #Return_label
                    | return_exp  #InstCont_Return_exp_label
                    ;

atribuicao: (IDENTIFICATOR | exp_indexacao_de_ponteiro) WHITE_SPACE* EQUAL WHITE_SPACE* exp_qualquer BT       #Atribuicao_label;

instrucao_condicional: IF WHITE_SPACE* exp_qualquer WHITE_SPACE* THEN WHITE_SPACE* instrucoes WHITE_SPACE*
                        (ELSE WHITE_SPACE* instrucoes WHITE_SPACE*)?                                          #Instrucao_condicional_label;

ciclo: WHILE exp_qualquer WHITE_SPACE* DO WHITE_SPACE* instrucoes WHITE_SPACE* (FINALLY WHITE_SPACE* instrucoes WHITE_SPACE*)?   #Ciclo_label;

subbloco: LB WHITE_SPACE* (instrucoes WHITE_SPACE*)* RB                 #Subbloco_label;

prologo: WHITE_SPACE* ARROBA bloco                                      #Prologo_label;

epilogo: WHITE_SPACE* EPILOGO_TOKEN bloco                               #Epilogo_label;

instrucoes: exp_qualquer            #Instrucoes_exp_qualquer
            | instrucoes_controle   #Instrucoes_instrucoes_controle
            | atribuicao            #Instrucoes_atribuicao
            | instrucao_condicional #Instrucoes_instrucao_condicional
            | ciclo                 #Instrucoes_ciclo
            | subbloco              #Instrucoes_subbloco
            ;

return_exp: RETURN WHITE_SPACE* exp_qualquer BT   #Return_exp_label;

invocacao_funcoes: invocacao_funcao             #InvFunc_invocao_funcao
                    | invocacao_funcao_especial #InvFunc_funcao_especial
                    ;
invocacao_funcao: WHITE_SPACE* IDENTIFICATOR LP WHITE_SPACE* exp_qualquer* (WHITE_SPACE* COMMA exp_qualquer)* WHITE_SPACE* RP   #Invocacao_funcao_label;

invocacao_funcao_especial: arroba   #InvFuncEspecial_arroba
                         | sizeof   #InvFuncEspecial_sizeof
                         | write    #InvFuncEspecial_write
                         | writeln  #InvFuncEspecial_writeln
                         ;

arroba: WHITE_SPACE* ARROBA LP WHITE_SPACE* RP WHITE_SPACE*                                 #Arroba_label;

sizeof: WHITE_SPACE* SIZEOF LP WHITE_SPACE* exp_qualquer WHITE_SPACE* RP WHITE_SPACE*       #Sizeof_label;

write: WHITE_SPACE* WRITE  LP WHITE_SPACE* exp_qualquer* WHITE_SPACE* RP WHITE_SPACE*       #Write_label;

writeln: WHITE_SPACE* WRITELN  LP WHITE_SPACE* exp_qualquer* WHITE_SPACE* RP WHITE_SPACE*   #Writeln_label;