lexer grammar a22Lexer;

WHITE_SPACE :  [ \t\r\n]+ -> skip;



IDENTIFICATOR: LETTER (LETTER | DIGIT)*;



LETTER: [a-zA-Z]|'_';




INTEGER: '0'  ([1-9] DIGIT*);
fragment DIGIT: [0-9];

REAL_LITERAL: [0-9]+ POINT [0-9]+;


WRITE: 'write';
WRITELN: 'writeln';
READ: 'read';
AND: 'and';
OR: 'or';
NOT: 'not';
INT: 'int';
BOOL: 'bool';
REAL: 'real';
STRING: 'string';
VOID: 'void';
TRUE: 'true';
FALSE: 'false';
IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
FOR: 'for';
TO: 'to';
DOWNTO: 'downto';
STEP: 'step';
RETURN: 'return';
TYPE: 'type';
ASSIGN: '=';

SEMICOLON : ';';
COLON: ',';
POINT: '.';
CIRCUMFLEX: '^';
LEFT_BRACKET: '(';
RIGHT_BRACKET: ')';
LEFT_SQUARE_BRACKET: '[';
RIGHT_SQUARE_BRACKET: ']';
LEFT_CURLY_BRACKET: '{';
RIGHT_CURLY_BRACKET: '}';


