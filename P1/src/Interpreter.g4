grammar Interpreter;
start :
expression+ EOF;

expression:
 INT
 | expression (PLUS | MINUS | SLASH |STAR) expression
 | IDENTIFICATOR
 | COMMENT
 ;

PLUS : '+';
MINUS : '-';
INT : '0'..'9'+;
STAR : '*';
SLASH : '/';

WS : [ \r\t]+ -> skip ;


IDENTIFICATOR : ([0-9]*LETRA+[0-9]*)+ ;
fragment LETRA : [a-zA-Z]|'_';
COMMENT: '\\' ~[\n]*;