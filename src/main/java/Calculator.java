public class Calculator {
    private ExpressionParser expressionParser;

    public Calculator(ExpressionParser expressionParser) {
        this.expressionParser = expressionParser;
    }

    public int evaluate(String expression) {
             return expressionParser.evaluate(expression);
    }
}
