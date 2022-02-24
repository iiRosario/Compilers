# Compilers

This is a coursework, where we'll be developing iteratively the front-end of a compiler using *ANTLR*, *JAVA* and *IntelliJ IDEA*.

First iteration, Lexical Analysis, consists of developing a Lexer, that'll check if the input (source program) is valid lexically, by tokenizing the input.

Second iteration, Syntactic Analysis, also known as a Parser, will generate an Abstract Syntax Tree, which then'll be used to check if the input (source program) is syntactically correct.

Third iteration, Semantic Analysis, makes sure that the input makes sense, for example:

```C
// This statement is correct, both lexically and syntactically.
// However, this statement is not semantically correct (variable x is not defined).
int y = x + 9;
```

Fourth and final iteration, Intermediate Code Generation, translates the statements into Three Address Code.
