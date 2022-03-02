grammar Interpreter;
start :
 expression EOF
 ;
expression
 :
 | INT
 | SLASH
 | STAR
 | expression (PLUS | MINUS) expression
 | IDENTIFICATOR
 | expression COMMENT expression
 ;
PLUS : '+';
MINUS : '-';
INT : '0'..'9'+;
STAR : '*';
SLASH : '/';

WS : [ \r\t]+ -> skip ;

COMMENT: '\\' ~[\n]*;

IDENTIFICATOR : (LETRA+[0-9]* | LETRA+ | [0-9]*LETRA+)+ ;
fragment LETRA : [a-zA-Z]|'_';
