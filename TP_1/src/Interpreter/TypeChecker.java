package Interpreter;
import SymbolTable.FunctionSymbol;
import SymbolTable.Scope;
import SymbolTable.Symbol;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class TypeChecker extends a22BaseListener{

    public Scope globalScope;
    public Scope currentScope;
    public FunctionSymbol currentFunction;
    public int semanticErrors;

    public boolean hasMain = false;
    public boolean inLoop = false;


    public ParseTreeProperty<String> exprType = new ParseTreeProperty<>();
    public List<ParseTreeProperty<Symbol>> structList = new ArrayList<>();
    public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();



    private boolean defineSymbol(ParserRuleContext ctx, Symbol S){

        if(S == null) return false;

        Symbol symbol = this.currentScope.resolve(S.lexeme());
        if(symbol == null){
            this.currentScope.define(S);
            return true;
        }

        if(symbol instanceof FunctionSymbol)
            System.err.println("Line: " + ctx.start.getLine() + "; Redefining previously function " + symbol.lexeme());
        else
            System.err.println("Line: " + ctx.start.getLine() + "; Redefining previously variable " + symbol.lexeme());

        this.semanticErrors++;
        return false;
    }



    private Symbol containsVariable(ParserRuleContext ctx, String variableName){

        if(variableName.isEmpty()) return null;

        Symbol s = currentScope.resolve(variableName);
        if(s == null){
            System.err.println("Define variable: "
                    + variableName
                    + " in line " + ctx.getStart().getLine());
            semanticErrors++;

            return null;
        }
        return s;
    }


    public void printExpErrors(ParserRuleContext ctx, String v1, String op){
        System.err.println("" +
                "Cannot do the operation : "
                + op
                + v1
                + " in line " + ctx.getStart().getLine());
        semanticErrors++;
    }

    public void printExpErrors(ParserRuleContext ctx, String v1, String v2, String op){
        if(v2 == null) {
            System.err.println("" +
                    "Cannot do the operation : "
                    + op
                    + v1
                    + " in line " + ctx.getStart().getLine());
        }
        else{
            System.err.println("" +
                    "Cannot do the operation : "
                    + v1
                    + " " + op +  " "
                    + v2
                    + " in line " + ctx.getStart().getLine());
        }
        semanticErrors++;
    }





    //================================================ START ========================================




    @Override
    public void enterStart(a22.StartContext ctx) {
        globalScope = new Scope(null, "GLOBAL");
        currentScope = globalScope;
        scopes.put(ctx, currentScope);
        this.semanticErrors = 0;
        Symbol.TypesList.add("int");
        Symbol.TypesList.add("real");
        Symbol.TypesList.add("string");
        Symbol.TypesList.add("bool");
        Symbol.TypesList.add("void");
    }

    @Override
    public void exitStart(a22.StartContext ctx) {
        if(!hasMain){
            System.out.println("COMPILATION ERROR : a22 file must have a main function.");
            semanticErrors++;
        }
    }

    @Override
    public void enterFile(a22.FileContext ctx) { }

    @Override
    public void exitFile(a22.FileContext ctx) {

    }

    @Override
    public void enterVariable(a22.VariableContext ctx) {

    }

    @Override
    public void exitVariable(a22.VariableContext ctx) {

    }

    @Override
    public void enterVariable_declaration(a22.Variable_declarationContext ctx) {



    }
    @Override
    public void exitVariable_declaration(a22.Variable_declarationContext ctx) {
        List<TerminalNode>  tns = ctx.IDENTIFIER();
        try{
            ctx.primitive_data_type();
            String type = ctx.primitive_data_type().getText();
            for( TerminalNode t : tns){

                Symbol symbol = switch (type) {
                    case "int" -> new Symbol(t.getSymbol(), "int");
                    case "real" -> new Symbol(t.getSymbol(), "real");
                    case "string" -> new Symbol(t.getSymbol(), "string");
                    case "bool" -> new Symbol(t.getSymbol(), "bool");
                    default -> null;
                };

                defineSymbol(ctx, symbol);
                exprType.put(ctx, symbol.type);
            }

        }catch (NullPointerException e) {           // Non primitive type
            String type = ctx.IDENTIFIER(0).getText();

            if(!Symbol.TypesList.contains(type)){
                semanticErrors++;
                System.err.println("Line: " + ctx.start.getLine() + "; Type: " + type +"not defined" );

            }
            for( TerminalNode t : tns){
                if(t.getText().equals(type)){
                    continue;
                }
                if(Symbol.TypesList.contains(t.getText())){
                    System.err.println("Variable name can't be equal to the type "
                            + t.getText()
                            + " in line " + t.getSymbol().getLine());
                    semanticErrors++;
                }
                if(type.equals(t.getText())) {
                    System.err.println("Type and variable name are equal: "
                            + " type: " + type
                            + " variable name: " + t.getText()
                            + " in line " + t.getSymbol().getLine());
                    semanticErrors++;
                }
                defineSymbol(ctx, new Symbol(t.getSymbol(), type));
                exprType.put(ctx, type);
            }

        }
        System.out.println("scope: " + this.currentScope );
    }

    @Override
    public void enterBrackets(a22.BracketsContext ctx) {

    }

    @Override
    public void exitBrackets(a22.BracketsContext ctx) {

    }

    @Override
    public void enterVariable_initialization(a22.Variable_initializationContext ctx) {
        String variableName1 = ctx.assignment().expression(0).getText();
        String variableName2 = ctx.assignment().expression(1).getText();


        String type = "invalid";

        if(ctx.primitive_data_type() != null)
            type = ctx.primitive_data_type().getText();
        else
            type = ctx.IDENTIFIER().getText();

        if(!Symbol.TypesList.contains(type)){
            System.err.println("Type is not declared: "
                    + type
                    + " in line " + ctx.assignment().getStart().getLine());
            semanticErrors++;
        }
        if(type.equals(variableName1)) {
            System.err.println("Type and variable name are equal: "
                    + " type: " + type
                    + " variable name: " + variableName1
                    + " in line " + ctx.assignment().getStart().getLine());
            semanticErrors++;
        }
        defineSymbol(ctx, new Symbol(ctx.assignment().expression(0).start, type));
        exprType.put(ctx, type);
        System.out.println("scope: " + this.currentScope );
    }

    @Override
    public void exitVariable_initialization(a22.Variable_initializationContext ctx) {

    }

    @Override
    public void enterPrimitive_data_type(a22.Primitive_data_typeContext ctx) {

    }

    @Override
    public void exitPrimitive_data_type(a22.Primitive_data_typeContext ctx) {

    }

    @Override
    public void enterComposite_data_type_def(a22.Composite_data_type_defContext ctx) {
        this.currentScope = new Scope(this.globalScope, "struct type : " + ctx.IDENTIFIER().getText());

        if(Symbol.TypesList.contains(ctx.IDENTIFIER().getText())){
            System.err.println("" +
                    "Type already defined : " + ctx.IDENTIFIER().getText()
                    + " in line " + ctx.IDENTIFIER().getSymbol().getLine());
            semanticErrors++;
            return;
        }
        Symbol.addType(ctx.IDENTIFIER().getText());


    }

    @Override
    public void exitComposite_data_type_def(a22.Composite_data_type_defContext ctx) {

        this.currentScope = this.globalScope;
        defineSymbol(ctx, new Symbol(ctx.IDENTIFIER().getSymbol(), ctx.IDENTIFIER().getText() ));
    }


    // ============================ DATA TYPES ===================
    @Override
    public void enterInt_literal(a22.Int_literalContext ctx) { }
    @Override
    public void enterReal_literal(a22.Real_literalContext ctx) { }
    @Override
    public void enterString_literal(a22.String_literalContext ctx) { }
    @Override
    public void enterFalse(a22.FalseContext ctx) { }
    @Override
    public void enterTrue(a22.TrueContext ctx) { }


    @Override
    public void exitInt_literal(a22.Int_literalContext ctx) {
        exprType.put(ctx, "int");
    }

    @Override
    public void exitReal_literal(a22.Real_literalContext ctx) {
        exprType.put(ctx, "real");
    }

    @Override
    public void exitString_literal(a22.String_literalContext ctx) {
        exprType.put(ctx, "string");
    }

    @Override
    public void exitTrue(a22.TrueContext ctx) {
        exprType.put(ctx, "bool");
    }

    @Override
    public void exitFalse(a22.FalseContext ctx) {
        exprType.put(ctx, "bool");
    }

    // =============================


    @Override
    public void enterIdentifier(a22.IdentifierContext ctx) {
        //containsVariable(ctx, ctx.IDENTIFIER().getText());
    }

    @Override
    public void exitIdentifier(a22.IdentifierContext ctx) {

        exprType.put(ctx, "ID");
    }

    @Override
    public void enterFun_call(a22.Fun_callContext ctx) {

    }

    @Override
    public void exitFun_call(a22.Fun_callContext ctx) {
        exprType.put(ctx, ctx.getChild(0).getText());
    }

    @Override
    public void enterSimple_exp(a22.Simple_expContext ctx) { }

    @Override
    public void exitSimple_exp(a22.Simple_expContext ctx) {

        exprType.put(ctx, exprType.get(ctx.getChild(0)));
    }

    @Override
    public void enterPm_exp(a22.Pm_expContext ctx) { }

    @Override
    public void exitPm_exp(a22.Pm_expContext ctx) {

        String exp0Type = exprType.get(ctx.expression(0));
        String exp1Type = exprType.get(ctx.expression(1));
        String op = ctx.getChild(1).getText();

        //getting the type of the variable
        if(exp0Type.equals("ID")){
            String name = ctx.expression(0).getText();
            Symbol s1 = containsVariable(ctx, name);
            if(s1 == null) return;
            exp0Type = s1.type;
        }
        if(exp1Type.equals("ID")){
            String name = ctx.expression(1).getText();
            Symbol s2 = containsVariable(ctx, name);
            if(s2 == null) return;
            exp1Type = s2.type;

        }

        //cannot process booleans
        if(exp0Type.equals("bool") || exp1Type.equals("bool")){
            printExpErrors(ctx, exp0Type, exp1Type, op);
            return;
        }

        if((exp0Type.equals("int") && exp1Type.equals("real")) || (exp0Type.equals("real") && exp1Type.equals("int"))){
            exprType.put(ctx, "real");
        }
        else{
            exprType.put(ctx, exp0Type);
        }

    }

    @Override
    public void enterEqual_exp(a22.Equal_expContext ctx) { }

    @Override
    public void exitEqual_exp(a22.Equal_expContext ctx) {
        exprType.put(ctx, "bool");
    }

    @Override
    public void enterIndex_exp(a22.Index_expContext ctx) {

    }

    @Override
    public void exitIndex_exp(a22.Index_expContext ctx) {

    }

    @Override
    public void enterParen_exp(a22.Paren_expContext ctx) { }

    @Override
    public void exitParen_exp(a22.Paren_expContext ctx) {
        String exp0Type = exprType.get(ctx.expression());
        exprType.put(ctx, exp0Type);
    }

    @Override
    public void enterMember_acc_exp(a22.Member_acc_expContext ctx) {

    }

    @Override
    public void exitMember_acc_exp(a22.Member_acc_expContext ctx) {
        //ctx.ID()
        //1 ID +e sempre onome da variavel
        //verificar se o tipo existe
        //for percorrer os ids para ver se existem
        //a.b.c.d
        //ver se o b existe no a, etc etc
        String name = ctx.IDENTIFIER(0).getText();
        String lastType = "invalid";
        List<TerminalNode> atributes = ctx.IDENTIFIER();


       for(int i = 1 ; i < atributes.size(); i++){
           String atributeName = ctx.IDENTIFIER(i).getText();

       }


        String op = ctx.getChild(1).getText();

        exprType.put(ctx, "lastType");
        return;

    }

    @Override
    public void enterLlgg_exp(a22.Llgg_expContext ctx) { }

    @Override
    public void exitLlgg_exp(a22.Llgg_expContext ctx) {

        String exp0Type = exprType.get(ctx.expression(0));
        String exp1Type = exprType.get(ctx.expression(1));
        String op = ctx.getChild(1).getText();

        //getting the type of the variable
        if(exp0Type.equals("ID")){
            String name = ctx.expression(0).getText();
            Symbol s1 = containsVariable(ctx, name);
            if(s1 == null) return;
            exp0Type = s1.type;
        }
        if(exp1Type.equals("ID")){
            String name = ctx.expression(1).getText();
            Symbol s2 = containsVariable(ctx, name);
            if(s2 == null) return;
            exp1Type = s2.type;

        }

        //cannot process booleans
        if(exp0Type.equals("bool") || exp1Type.equals("bool")){
            printExpErrors(ctx, exp0Type, exp1Type, op);
            return;
        }
        exprType.put(ctx, "bool");
    }

    @Override
    public void enterNegation_exp(a22.Negation_expContext ctx) { }

    @Override
    public void exitNegation_exp(a22.Negation_expContext ctx) {
        String exp0Type = exprType.get(ctx.expression());
        String op = ctx.getChild(1).getText();

        //getting the type of the variable
        if(exp0Type.equals("ID")){
            String name = ctx.expression().getText();
            Symbol s1 = containsVariable(ctx, name);
            if(s1 == null) return;
            exp0Type = s1.type;
        }
        //cannot do "-bool" and "not int/real/string"
        if((op.equals("-") && exp0Type.equals("bool"))
                || op.equals("not") && !exp0Type.equals("bool")){
            printExpErrors(ctx, exp0Type, op);
            return;
        }


        exprType.put(ctx, exp0Type);
        return;
    }

    @Override
    public void enterMdr_exp(a22.Mdr_expContext ctx) { }

    @Override
    public void exitMdr_exp(a22.Mdr_expContext ctx) {
        String exp0Type = exprType.get(ctx.expression(0));
        String exp1Type = exprType.get(ctx.expression(1));
        String op = ctx.getChild(1).getText();

        //getting the type of the variable
        //getting the type of the variable
        if(exp0Type.equals("ID")){
            String name = ctx.expression(0).getText();
            Symbol s1 = containsVariable(ctx, name);
            if(s1 == null) return;
            exp0Type = s1.type;
        }
        if(exp1Type.equals("ID")){
            String name = ctx.expression(1).getText();
            Symbol s2 = containsVariable(ctx, name);
            if(s2 == null) return;
            exp1Type = s2.type;

        }

        //cannot process booleans
        if(exp0Type.equals("bool") || exp1Type.equals("bool")){
            printExpErrors(ctx, exp0Type, exp1Type, op);
            return;
        }

        //is only permited : int % int
        if(op.equals("%")){
            if(!exp0Type.equals("int") || !exp1Type.equals("int")){
                printExpErrors(ctx, exp0Type, exp1Type, op);
                return;
            }
        }

        if((exp0Type.equals("int") && exp1Type.equals("real")) || exp0Type.equals("real") && exp1Type.equals("int")){
            exprType.put(ctx, "real");
            return;
        }

        exprType.put(ctx, exp0Type);
        return;
    }

    @Override
    public void enterAnd_exp(a22.And_expContext ctx) {

    }

    @Override
    public void exitAnd_exp(a22.And_expContext ctx) {
        String exp0Type = exprType.get(ctx.expression(0));
        String exp1Type = exprType.get(ctx.expression(1));
        String op = ctx.getChild(1).getText();

        //getting the type of the variable
        if(exp0Type.equals("ID")){
            String name = ctx.expression(0).getText();
            Symbol s1 = containsVariable(ctx, name);
            if(s1 == null) return;
            exp0Type = s1.type;
        }
        if(exp1Type.equals("ID")){
            String name = ctx.expression(1).getText();
            Symbol s2 = containsVariable(ctx, name);
            if(s2 == null) return;
            exp1Type = s2.type;

        }

        //cannot process booleans
        if(!exp0Type.equals("bool") || !exp1Type.equals("bool")){
            printExpErrors(ctx, exp0Type, exp1Type, op);
            return;
        }

        exprType.put(ctx, exp0Type);
        return;
    }

    @Override
    public void enterOr_exp(a22.Or_expContext ctx) {}

    @Override
    public void exitOr_exp(a22.Or_expContext ctx) {
        String exp0Type = exprType.get(ctx.expression(0));
        String exp1Type = exprType.get(ctx.expression(1));
        String op = ctx.getChild(1).getText();

        //getting the type of the variable
        if(exp0Type.equals("ID")){
            String name = ctx.expression(0).getText();
            Symbol s1 = containsVariable(ctx, name);
            if(s1 == null) return;
            exp0Type = s1.type;
        }
        if(exp1Type.equals("ID")){
            String name = ctx.expression(1).getText();
            Symbol s2 = containsVariable(ctx, name);
            if(s2 == null) return;
            exp1Type = s2.type;

        }

        //cannot process booleans
        if(!exp0Type.equals("bool") || !exp1Type.equals("bool")){
            printExpErrors(ctx, exp0Type, exp1Type, op);
            return;
        }

        exprType.put(ctx, exp0Type);
    }

    @Override
    public void enterFunction_def(a22.Function_defContext ctx) {
        List<TerminalNode> tns = ctx.IDENTIFIER();
        String type = ctx.getChild(0).getText();
        String name = ctx.getChild(1).getText();


        System.out.println("function name: " + name + " -> " + type);

        //check if already exists a function with the same name
        if(this.globalScope.resolve(name) != null){
            System.err.println("" +
                    "Already defined the name on a Variable or a Function :" + name
                    + " in line " + ctx.IDENTIFIER(0).getSymbol().getLine());
            semanticErrors++;
            return;
        }


        currentFunction = new FunctionSymbol(ctx.IDENTIFIER(0).getSymbol(), type);
        this.currentScope = new Scope(this.globalScope, name);
        scopes.put(ctx, this.globalScope);
    }

    @Override
    public void exitFunction_def(a22.Function_defContext ctx) {
        List<TerminalNode> tns = ctx.IDENTIFIER();


        if(ctx.primitive_data_type() != null){
            String type = ctx.primitive_data_type().getText();
            currentFunction = new FunctionSymbol(ctx.IDENTIFIER(0).getSymbol(), type);
        }
        else if(!Symbol.TypesList.contains(ctx.IDENTIFIER(0).getText())){
            System.err.println("Undefiend type on line " + ctx.IDENTIFIER(0).getSymbol().getLine());
            semanticErrors++;
            return;
        }
        else{
            String type = ctx.IDENTIFIER(0).getText();
            currentFunction = new FunctionSymbol(ctx.IDENTIFIER(1).getSymbol(), type);
        }

        for(TerminalNode tn : tns){
            if(tn.getText().equals("main")){
                if(hasMain){
                    System.err.println("Duplicated Main function in line: " + tn.getSymbol().getLine());
                    semanticErrors++;
                    return;
                }
                hasMain = true;
                break;
            }
        }





    }

    @Override
    public void enterFunction_def_args(a22.Function_def_argsContext ctx) {

    }

    @Override
    public void exitFunction_def_args(a22.Function_def_argsContext ctx) {
        List<a22.Function_def_args_typesContext> listFunctionArgsTypes = ctx.function_def_args_types();
        List<TerminalNode> listVariableNames = ctx.IDENTIFIER();

        for(int i = 0; i < listVariableNames.size(); i++){
            String type = exprType.get(listFunctionArgsTypes.get(i));
            String name = listVariableNames.get(i).getText();
            if(currentScope.contains(name)){return;}
            //System.out.println("NAME: " + name + "  TYPE: " + type);

            Symbol s = new Symbol(listVariableNames.get(i).getSymbol(), type);
            currentFunction.add_argument(s);
            defineSymbol(ctx, s);
            System.out.println("list arguments: " + currentFunction.get_arguments());
        }

    }

    @Override
    public void enterFunction_def_args_types(a22.Function_def_args_typesContext ctx) {

    }

    @Override
    public void exitFunction_def_args_types(a22.Function_def_args_typesContext ctx) {
        exprType.put(ctx, ctx.getChild(0).getText() );
    }

    @Override
    public void enterNormal_fun_call(a22.Normal_fun_callContext ctx) {
        System.out.println(" enter normal fun cal");

        String functionName = ctx.IDENTIFIER().getText();
        Symbol f =  this.currentScope.resolve(functionName);

        if(f == null){
            System.err.println("" +
                    "Undefined function " + functionName
                    + " in line " + ctx.IDENTIFIER().getSymbol().getLine());
            semanticErrors++;
            return;
        }
        if(!(f instanceof FunctionSymbol)){
            System.err.println("" +
                    "Using variable " + functionName
                    + " as function in line " + ctx.IDENTIFIER().getSymbol().getLine());
            semanticErrors++;
            return;
        }

        this.currentFunction = (FunctionSymbol) f;
        this.currentScope = new Scope(this.currentScope);
        scopes.put(ctx, currentScope);
    }

    @Override
    public void exitNormal_fun_call(a22.Normal_fun_callContext ctx) {

        System.out.println(" exit normal fun cal");

    }

    @Override
    public void enterWrite_fun_call(a22.Write_fun_callContext ctx) {

    }

    @Override
    public void exitWrite_fun_call(a22.Write_fun_callContext ctx) {

    }

    @Override
    public void enterRead_fun_call(a22.Read_fun_callContext ctx) {

    }

    @Override
    public void exitRead_fun_call(a22.Read_fun_callContext ctx) {

    }

    @Override
    public void enterFunction_call_args(a22.Function_call_argsContext ctx) {

    }

    @Override
    public void exitFunction_call_args(a22.Function_call_argsContext ctx) {

    }

    @Override
    public void enterAssignment_state(a22.Assignment_stateContext ctx) {

    }

    @Override
    public void exitAssignment_state(a22.Assignment_stateContext ctx) {
        //exprType.get(ctx, exprType.get(ctx.assignment().expression(0).ç));
    }

    @Override
    public void enterConditional_state(a22.Conditional_stateContext ctx) {

    }

    @Override
    public void exitConditional_state(a22.Conditional_stateContext ctx) {

    }

    @Override
    public void enterWhile_state(a22.While_stateContext ctx) {

    }

    @Override
    public void exitWhile_state(a22.While_stateContext ctx) {

    }

    @Override
    public void enterFor_state(a22.For_stateContext ctx) {

    }

    @Override
    public void exitFor_state(a22.For_stateContext ctx) {

    }

    @Override
    public void enterControl_state(a22.Control_stateContext ctx) {

    }

    @Override
    public void exitControl_state(a22.Control_stateContext ctx) {
        exprType.put(ctx, exprType.get(ctx.getChild(0)));
    }

    @Override
    public void enterExpression_state(a22.Expression_stateContext ctx) {

    }

    @Override
    public void exitExpression_state(a22.Expression_stateContext ctx) {

    }

    @Override
    public void enterBlock_state(a22.Block_stateContext ctx) {

    }

    @Override
    public void exitBlock_state(a22.Block_stateContext ctx) {

    }

    @Override
    public void enterSemicolon_state(a22.Semicolon_stateContext ctx) {

    }

    @Override
    public void exitSemicolon_state(a22.Semicolon_stateContext ctx) {

    }

    @Override
    public void enterAssignment(a22.AssignmentContext ctx) {

    }

    @Override
    public void exitAssignment(a22.AssignmentContext ctx) {
        String variableName1 = ctx.expression(0).getText();
        String variableName2 = ctx.expression(1).getText();
        String exp1Type = exprType.get(ctx.expression(0));;
        String exp2Type = exprType.get(ctx.expression(1));


        if(exp1Type.equals("ID") ){
            Symbol s1 = containsVariable(ctx.expression(0), variableName1);
            if(s1 != null) exp1Type = s1.type;
        }
        if(exp2Type.equals("ID") ){
            Symbol s2 = containsVariable(ctx.expression(1), variableName2);
            if(s2 != null) exp2Type = s2.type;
        }

        if((exp1Type.equals("int") && exp2Type.equals("real")) || (!exp1Type.equals(exp2Type))){
            System.err.println("Type mismatch: "
                    + exp1Type
                    + " != "
                    + exp2Type
                    + " in line " + ctx.getStart().getLine());
            semanticErrors++;
        }

        exprType.put(ctx, exp1Type);
    }

    @Override
    public void enterConditional(a22.ConditionalContext ctx) {

    }

    @Override
    public void exitConditional(a22.ConditionalContext ctx) {
        String expressionType = exprType.get(ctx.expression());
        if(!expressionType.equals("bool")){
            System.err.println(
                    "Only permited boolean expressions : "
                    + "expressionType : " + expressionType + " in line " + ctx.expression().start.getLine()
            );
        }
        exprType.put(ctx, expressionType);
    }

    @Override
    public void enterWhile_loop(a22.While_loopContext ctx) {
        inLoop = true;
    }

    @Override
    public void exitWhile_loop(a22.While_loopContext ctx) {
        inLoop = false;
        String expressionType = exprType.get(ctx.expression());
        if(!expressionType.equals("bool")){
            System.err.println(
                    "Only permited boolean expressions : "
                            + "expressionType : " + expressionType + " in line " + ctx.expression().start.getLine()
            );
        }
        exprType.put(ctx, expressionType);
    }

    @Override
    public void enterFor_loop(a22.For_loopContext ctx) {
        inLoop = true;
    }

    @Override
    public void exitFor_loop(a22.For_loopContext ctx) {
        inLoop = false;
    }

    @Override
    public void enterControl(a22.ControlContext ctx) {

    }

    @Override
    public void exitControl(a22.ControlContext ctx) {
        System.out.println("exitControl: " );
        String fType = this.currentFunction.type;
        String rType = exprType.get(ctx.expression());
        System.out.println("fType: " + fType);
        System.out.println("rType: " + rType);

        //fType = real && rType = int
        if(Symbol.isConvertibleTo(rType, fType)){
            exprType.put(ctx, fType);
        }
        else if(!fType.equals(rType)){
            System.err.println("Function type mismatch: "
                    + fType
                    + " != "
                    + rType
                    + " in line " + ctx.getStart().getLine());
            semanticErrors++;
        }
        else{
            exprType.put(ctx, fType);
        }

    }

    @Override
    public void enterBlock_statement(a22.Block_statementContext ctx) {

    }

    @Override
    public void exitBlock_statement(a22.Block_statementContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
