lexer grammar a22Lexer;

// ------------------------------ ARITHMETIC OPERATORS ------------------------------

PLUS_OP: '+';
MINUS_OP: '-';
MULTIPLICATION_OP: '*';
DIVISION_OP: '/';
REMAINDER_OP: '%';
ASSIGN_OP: '=';

// ------------------------------ RELATIONAL OPERATORS ------------------------------

EQUAL: '==';
UNEQUAL: '!=';
GREATER: '>';
LESS: '<';
GREATER_EQUAL: '>=';
LESS_EQUAL: '<=';

// ------------------------------ LOGIC OPERATORS ------------------------------

AND: 'and';
OR: 'or';
NOT: 'not';
TRUE: 'true';
FALSE: 'false';

// ------------------------------ DATA TYPES ------------------------------

BOOL: 'bool';
INT: 'int';
REAL: 'real';
STRING: 'string';
VOID: 'void';
TYPE: 'type';

// ------------------------------ FUNCTIONS ------------------------------

WRITE: 'write';
WRITELN: 'writeln';
READ: 'read';

// ------------------------------ FLOW CONTROL ------------------------------

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

// ------------------------------ MISCELLANEOUS ------------------------------

SEMICOLON: ';';
COMMA: ',';
CARET: '^';
PERIOD: '.';
LEFT_PARENTHESIS: '(';
RIGHT_PARENTHESIS: ')';
LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';
LEFT_CURLY: '{';
RIGHT_CURLY: '}';

// ------------------------------ LITERALS ------------------------------

INT_LITERAL: '0' | [1-9] [0-9]*;
REAL_LITERAL: INT_LITERAL '.' [0-9]+;
fragment ESCAPE_SEQUENCE: '\\' [trn"\\];
STRING_LITERAL: '"' (ESCAPE_SEQUENCE | .)*? '"';
fragment LETTER: [a-zA-Z];
IDENTIFIER: (LETTER | '_') (LETTER | [0-9] | '_')*;

// ------------------------------ WHITESPACES/COMMENTS ------------------------------

WHITESPACE: [ \t\r\n]+ -> skip;
SINGLE_LINE_COMMENT: '//' ~[\r\n]* -> skip;
MULTIPLE_LINE_COMMENT: '/*' .*? '*/' -> skip;

// Authors: PL2-g20(a64543 & a64560).