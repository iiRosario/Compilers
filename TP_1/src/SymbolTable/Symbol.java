package SymbolTable;

import org.antlr.v4.runtime.Token;

/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 *
 * -- with minor modifications by flobo (see readme.txt file for details)
***/
public class Symbol { // A generic programming language symbol
    public static enum Type {INVALID, tVOID, INT, REAL, BOOLEAN, STRING}

    Token token;
    Type type;
    Scope scope;      // All symbols know what scope contains them.

    public Symbol(Token token) { this.token = token; }
    public Symbol(Token token, Type type) { this(token); this.type = type; }
    public Token getToken() { return token; }
    public String lexeme() { return getToken().getText(); }

    public String toString() {
        if ( type!=Type.INVALID ) return '<'+lexeme()+":"+type+'>';
        return lexeme();
    }
}
