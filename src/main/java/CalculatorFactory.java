public class CalculatorFactory {
    public Calculator create() {
        TokenEvaluator tokenEvaluator = new TokenEvaluator();
        ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator(tokenEvaluator);
        return new Calculator(expressionEvaluator);
    }
}
