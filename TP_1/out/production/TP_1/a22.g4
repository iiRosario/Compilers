parser grammar a22;

options { tokenVocab = a22Lexer; }

// ------------------------------ START/FILE ------------------------------

start: file EOF;
file: composite_data_type_def* variable* function_def*;


// ------------------------------ VARIABLES ------------------------------

variable: (variable_declaration | variable_initialization) SEMICOLON;

variable_declaration: (primitive_data_type | IDENTIFIER) IDENTIFIER brackets* (COMMA IDENTIFIER brackets*)*;

brackets: LEFT_BRACKET expression RIGHT_BRACKET;

variable_initialization: (primitive_data_type | IDENTIFIER) assignment;

// ------------------------------ DATA TYPES ------------------------------

primitive_data_type: BOOL
                    | INT
                    | REAL
                    | STRING
                    ;

composite_data_type_def: TYPE IDENTIFIER LEFT_CURLY (variable_declaration SEMICOLON)+ RIGHT_CURLY;

// ------------------------------ EXPRESSIONS ------------------------------

//Argumentar com o prof sobre function_call
simple_expression: INT_LITERAL          #int_literal
                    | REAL_LITERAL      #real_literal
                    | STRING_LITERAL    #string_literal
                    | TRUE              #true
                    | FALSE             #false
                    | IDENTIFIER        #identifier
                    | function_call     #fun_call
                    ;

expression: simple_expression                                                           #simple_exp
            | LEFT_PARENTHESIS expression RIGHT_PARENTHESIS                             #paren_exp
            | IDENTIFIER LEFT_BRACKET expression RIGHT_BRACKET                          #index_exp
            | IDENTIFIER (PERIOD IDENTIFIER)+                                           #member_acc_exp
            | (MINUS_OP | NOT) expression                                               #negation_exp
            | expression (MULTIPLICATION_OP | DIVISION_OP | REMAINDER_OP) expression    #mdr_exp
            | expression (PLUS_OP | MINUS_OP) expression                                #pm_exp
            | expression (LESS | LESS_EQUAL | GREATER | GREATER_EQUAL) expression       #llgg_exp
            | expression (EQUAL | UNEQUAL) expression                                   #equal_exp
            | expression AND expression                                                 #and_exp
            | expression OR expression                                                  #or_exp
            //| function_call
            ;

// ------------------------------ FUNCTIONS ------------------------------

//function: function_def | function_call;

function_def: (primitive_data_type | VOID | IDENTIFIER) IDENTIFIER LEFT_PARENTHESIS function_def_args? RIGHT_PARENTHESIS block_statement;

function_def_args: function_def_args_types IDENTIFIER (COMMA function_def_args_types IDENTIFIER)*;

function_def_args_types: (primitive_data_type | IDENTIFIER) CARET?;

function_call: IDENTIFIER LEFT_PARENTHESIS function_call_args? RIGHT_PARENTHESIS    #normal_fun_call
               | (WRITE | WRITELN) LEFT_PARENTHESIS expression RIGHT_PARENTHESIS    #write_fun_call
               | READ LEFT_PARENTHESIS IDENTIFIER RIGHT_PARENTHESIS                 #read_fun_call
               ;

function_call_args: expression (COMMA expression)*;

// ------------------------------ STATEMENTS ------------------------------

statement: assignment SEMICOLON     #assignment_state
           | conditional            #conditional_state
           | while_loop             #while_state
           | for_loop               #for_state
           | control SEMICOLON      #control_state
           | expression SEMICOLON   #expression_state
           | block_statement        #block_state
           | SEMICOLON              #semicolon_state
            ;

assignment: expression ASSIGN_OP expression;

conditional: IF expression THEN statement (ELSE statement)?;

while_loop: WHILE expression statement;

for_loop: FOR assignment (TO | DOWNTO) INT_LITERAL (STEP INT_LITERAL)? statement;

control: RETURN expression?;

block_statement: LEFT_CURLY variable*  statement* RIGHT_CURLY;

// Authors: PL2-g20(a64543 & a64560).