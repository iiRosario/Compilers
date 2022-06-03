package SymbolTable;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class TypeSymbol extends Symbol{
    ArrayList<Symbol> atributes = new ArrayList<>();

    public TypeSymbol(Token token, String retType) {
        super(token, retType);
    }

    public ArrayList<Symbol> get_arguments() { return atributes; }
    public void add_argument( Symbol sym ) { atributes.add(sym); }
    public String toString() { return "struct"+super.toString()+":"+atributes; }
}
