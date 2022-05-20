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

import java.util.ArrayList;

public class FunctionSymbol extends Symbol {
    ArrayList<Symbol> arguments = new ArrayList<Symbol>();

    public FunctionSymbol(Token token, Type retType) {
        super(token, retType);
    }

    public ArrayList<Symbol> get_arguments() { return arguments; }
    public void add_argument( Symbol sym ) { arguments.add(sym); }
    public String toString() { return "function"+super.toString()+":"+arguments; }
}

