package SymbolTable;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class TypeSymbol extends Symbol{
    ArrayList<Symbol> atributes = new ArrayList<Symbol>();

    public TypeSymbol(Token token) {
        super(token);
    }

    public ArrayList<Symbol> get_arguments() { return atributes; }
    public void add_argument( Symbol sym ) { atributes.add(sym); }
    public String toString() { return "function"+super.toString()+":"+atributes; }
}
