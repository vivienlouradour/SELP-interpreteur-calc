package parser;

import lexer.tokens.OpToken;

public class UnaryExpressionAST extends ExpressionAST {
    private ExpressionAST expressionAST;

    public UnaryExpressionAST(ExpressionAST expressionAST){
        this.expressionAST = expressionAST;
    }

    @Override
    public String toString() {
        return  "UnaryExpression(" + this.expressionAST + ")";
    }
}