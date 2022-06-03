package Main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import Interpreter.a22Lexer;
import Interpreter.a22;
import Interpreter.TypeChecker;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            //modify args[0] if needed
            a22Lexer lexer = new a22Lexer(CharStreams.fromFileName(args[0]));
            a22 parser = new a22(new CommonTokenStream(lexer));
            ParseTree tree = parser.start();
            System.out.println("syntatic parsing finished");

            // create a standard ANTLR parse tree walker
            ParseTreeWalker walker = new ParseTreeWalker();
            // create listener then feed to walker
            TypeChecker listener = new TypeChecker();
            System.out.println("Type checking...");
            walker.walk(listener, tree);

            if(listener.semanticErrors > 0) {
                System.out.println(listener.semanticErrors + " semantic errors found. Compilation process halted.");
                System.exit(1);
            }

            System.out.println("No semantic errors found");
        }
        catch(IOException e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}

