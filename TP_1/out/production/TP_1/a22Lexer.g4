lexer grammar a22Lexer;
VOID_: 'void';
TYPES: INT_ | BOOLEAN_ | FLOAT_ | STRING_ | VOID_;

fragment INT_: 'int';
fragment BOOLEAN_: 'boolean';
fragment FLOAT_: 'float';
fragment STRING_: 'string';


 INT_P: '<int>';
 BOOLEAN_P: '<bool>';
 FLOAT_P: '<float>';
 STRING_P: '<string>';
 VOID_P: '<void>';

//BINARIES_OP: PLUS | MINUS | MULTIPLY | DIVIDE | PERCENTAGE |  LT |  GT | GTE | EQUALS | NEQUAL | AND | OR | LSB | RSB;
//UNARY_OP: PLUS | MINUS | TILDE | QM | LP | RP;

LP: '(';
EQUAL: '=';
RP: ')';
LSB: '[';
RSB: ']';
LB: '{';
RB: '}';
PLUS: '+';
MINUS: '-';
TILDE: '~';
QM: '?';
MULTIPLY: '*';
DIVIDE: '/';
PERCENTAGE: '%';
LT: '<';
GT: '>';
GTE: '>=';
LTE: '<=';
EQUALS: '==';
NEQUAL: '!=';
AND: '&&';
OR: '||';
ARROBA: '@';
WRITE: 'write';
WRITELN: 'writeln';
SIZEOF: 'sizeof';
EPILOGO_TOKEN: '>>';
OPERATORS: '(' | ')' | '['| ']' | '+' | '-'| '?' | '%' | '>' | '<' | '>=' | '<='
            | '==' | '!=' | '~' | '&&' | '||' | '=' | '>>' | '@';

COMMA: ',';
BT: ';';

TRUE: 'true';
FALSE: 'false';


//KEYWORDS : 'int' | 'bool' |'float' |'string' |'void' |'sizeof' |'null' |'alg' |'true' |'false'|
//           'while' |'do' |'finally' |'leave' |'restart' |'return' |'if' |'then' |'else' |'write' |'writeln';



LEAVE: 'leave';
RESTART: 'restart';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
THEN: 'then';
WHILE: 'while';
DO: 'do';
FINALLY: 'finally';

IDENTIFICATOR : (LETRA+[0-9]* | LETRA+ | [0-9]*LETRA+)+ ;

fragment LETRA : [a-zA-Z]|[\u00C0-\u00D6]|[\u00D8-\u00F6]|[\u00F8-\u00FF]|'_';

LITERAL_I : ([1-9] [0-9]*) | [0] ;

LITERAL_R : [0-9]+ '.' [0-9]* EXPONENT?
            |  '.' [0-9]+ EXPONENT?
            |  [0-9]+ EXPONENT;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? [0-9]+ ;

WHITE_SPACE :  [ \t\r\n]+ -> skip;

SINGLE_LINE_COMMENT : '##' ~[\r\n]* -> skip;
MULTIPLE_LINE_COMMENT : '(*'.*'*)' -> skip;



TERMINATORS : (',' | ';' | ' e');

STRING :  ['] ( ~[\u0000~'] | '~'['rtn~] )* ['];


ANY: . ;





