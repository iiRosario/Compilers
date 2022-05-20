package Interpreter;
import SymbolTable.FunctionSymbol;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Token;

public class TypeChecker extends a22BaseListener{

    public Scope globalScope;
    public Scope currentScope;

    public FunctionSymbol currentFunction;
    public int semanticErrors;

    public boolean hasMain = false;
    public boolean inLoop = false;


    public ParseTreeProperty<Symbol.Type> exprType = new ParseTreeProperty<>();
    public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();


    @Override
    public void enterStart(a22.StartContext ctx) {
        globalScope = new Scope(null);
        currentScope = globalScope;
        scopes.put(ctx, currentScope);
        this.semanticErrors = 0;

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

    }

    @Override
    public void enterBrackets(a22.BracketsContext ctx) {

    }

    @Override
    public void exitBrackets(a22.BracketsContext ctx) {

    }

    @Override
    public void enterVariable_initialization(a22.Variable_initializationContext ctx) {

    }

    @Override
    public void exitVariable_initialization(a22.Variable_initializationContext ctx) {
        String lefttype = ctx.getChild(0).getText().toUpperCase();
        Symbol.Type righttype = exprType.get(ctx.getChild(1).getChild(2));


        String name = ctx.getChild(1).getChild(0).

        if(!lefttype.equals(righttype.toString().toUpperCase())){
            semanticErrors++;
            System.out.println("Nao sao iguais : " + lefttype + " != " + righttype);
        }
        else{
            Symbol newSymbol = new Symbol(name, righttype);
        }



        System.out.println(exprType.get(ctx.getChild(1).getChild(2)));

        exprType.put(ctx, exprType.get(ctx.getChild(0)));
    }

    @Override
    public void enterPrimitive_data_type(a22.Primitive_data_typeContext ctx) {

    }

    @Override
    public void exitPrimitive_data_type(a22.Primitive_data_typeContext ctx) {

    }

    @Override
    public void enterComposite_data_type_def(a22.Composite_data_type_defContext ctx) {

    }

    @Override
    public void exitComposite_data_type_def(a22.Composite_data_type_defContext ctx) {

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
        exprType.put(ctx, Symbol.Type.INT);
    }

    @Override
    public void exitReal_literal(a22.Real_literalContext ctx) {
        exprType.put(ctx, Symbol.Type.REAL);
    }

    @Override
    public void exitString_literal(a22.String_literalContext ctx) {
        exprType.put(ctx, Symbol.Type.STRING);
    }

    @Override
    public void exitTrue(a22.TrueContext ctx) {
        exprType.put(ctx, Symbol.Type.BOOLEAN);
    }

    @Override
    public void exitFalse(a22.FalseContext ctx) {
        exprType.put(ctx, Symbol.Type.BOOLEAN);
    }

    // =============================


    @Override
    public void enterIdentifier(a22.IdentifierContext ctx) {

    }

    @Override
    public void exitIdentifier(a22.IdentifierContext ctx) {

    }

    @Override
    public void enterFun_call(a22.Fun_callContext ctx) {

    }

    @Override
    public void exitFun_call(a22.Fun_callContext ctx) {

    }

    @Override
    public void enterSimple_exp(a22.Simple_expContext ctx) {

    }

    @Override
    public void exitSimple_exp(a22.Simple_expContext ctx) {
        exprType.put(ctx, exprType.get(ctx.getChild(0)));
    }

    @Override
    public void enterPm_exp(a22.Pm_expContext ctx) {

    }

    @Override
    public void exitPm_exp(a22.Pm_expContext ctx) {

    }

    @Override
    public void enterEqual_exp(a22.Equal_expContext ctx) {

    }

    @Override
    public void exitEqual_exp(a22.Equal_expContext ctx) {

    }

    @Override
    public void enterIndex_exp(a22.Index_expContext ctx) {

    }

    @Override
    public void exitIndex_exp(a22.Index_expContext ctx) {

    }

    @Override
    public void enterParen_exp(a22.Paren_expContext ctx) {

    }

    @Override
    public void exitParen_exp(a22.Paren_expContext ctx) {

    }

    @Override
    public void enterMember_acc_exp(a22.Member_acc_expContext ctx) {

    }

    @Override
    public void exitMember_acc_exp(a22.Member_acc_expContext ctx) {

    }

    @Override
    public void enterLlgg_exp(a22.Llgg_expContext ctx) {

    }

    @Override
    public void exitLlgg_exp(a22.Llgg_expContext ctx) {

    }

    @Override
    public void enterNegation_exp(a22.Negation_expContext ctx) {

    }

    @Override
    public void exitNegation_exp(a22.Negation_expContext ctx) {

    }

    @Override
    public void enterMdr_exp(a22.Mdr_expContext ctx) {

    }

    @Override
    public void exitMdr_exp(a22.Mdr_expContext ctx) {

    }

    @Override
    public void enterAnd_exp(a22.And_expContext ctx) {

    }

    @Override
    public void exitAnd_exp(a22.And_expContext ctx) {

    }

    @Override
    public void enterOr_exp(a22.Or_expContext ctx) {

    }

    @Override
    public void exitOr_exp(a22.Or_expContext ctx) {

    }

    @Override
    public void enterFunction_def(a22.Function_defContext ctx) {

    }

    @Override
    public void exitFunction_def(a22.Function_defContext ctx) {

    }

    @Override
    public void enterFunction_def_args(a22.Function_def_argsContext ctx) {

    }

    @Override
    public void exitFunction_def_args(a22.Function_def_argsContext ctx) {

    }

    @Override
    public void enterFunction_def_args_types(a22.Function_def_args_typesContext ctx) {

    }

    @Override
    public void exitFunction_def_args_types(a22.Function_def_args_typesContext ctx) {

    }

    @Override
    public void enterNormal_fun_call(a22.Normal_fun_callContext ctx) {

    }

    @Override
    public void exitNormal_fun_call(a22.Normal_fun_callContext ctx) {

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

    }

    @Override
    public void enterConditional(a22.ConditionalContext ctx) {

    }

    @Override
    public void exitConditional(a22.ConditionalContext ctx) {

    }

    @Override
    public void enterWhile_loop(a22.While_loopContext ctx) {

    }

    @Override
    public void exitWhile_loop(a22.While_loopContext ctx) {

    }

    @Override
    public void enterFor_loop(a22.For_loopContext ctx) {

    }

    @Override
    public void exitFor_loop(a22.For_loopContext ctx) {

    }

    @Override
    public void enterControl(a22.ControlContext ctx) {

    }

    @Override
    public void exitControl(a22.ControlContext ctx) {

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
