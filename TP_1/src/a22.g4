parser grammar a22;
options{tokenVocab = a22Lexer;}

programa : declaracoes* EOF;

type: INT | BOOL | REAL | STRING | VOID;







declaracoes:  REAL_LITERAL;