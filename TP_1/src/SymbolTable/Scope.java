package SymbolTable;

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

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    Scope enclosingScope;    // null if global (outermost) scope // scope parent
    String name;             // for debug, there's really no need for it otherwise.
    public Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();

    public Scope(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
        this.name = "noname";
    }

    public Scope(Scope enclosingScope, String name) {
        this.enclosingScope = enclosingScope;
        this.name = name;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    // return true if identifier name is in this scope, and return false otherwise
    public boolean contains(String name) {
        return resolve_local(name) != null;
    }

    // look for identifier name in this scope alone.
    // return Symbol if found, and null otherwise.
    public Symbol resolve_local(String name) {
        return symbols.get(name);
    }

    public Symbol resolve(String name) {
        Symbol s = resolve_local(name);
        if ( s != null )
            return s;
        // if not here, check any enclosing scope
        if ( enclosingScope != null )
            return enclosingScope.resolve(name);
        return null; // not found
    }

    public void define(Symbol sym) {
        symbols.put(sym.lexeme(), sym);
        sym.scope = this; // track the scope in each symbol
    }

    public Scope getEnclosingScope() { return enclosingScope; }

    public String toString() {
        if ( enclosingScope != null )
            return getName() + ":" + symbols.keySet().toString()
                      + " --> " + enclosingScope.toString() ;
        else
            return getName() + ":" + symbols.keySet().toString();   // global scope
    }

}
