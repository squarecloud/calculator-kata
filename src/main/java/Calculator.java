public class Calculator {
    private ExpressionEvaluator expressionEvaluator;

    public Calculator(ExpressionEvaluator expressionEvaluator) {
        this.expressionEvaluator = expressionEvaluator;
    }

    public int evaluate(String expression) {
             return expressionEvaluator.evaluate(expression);
    }
}
