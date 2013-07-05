import static com.google.common.collect.Maps.newHashMap;

public class CalculatorFactory {
    public Calculator create() {
        TokenEvaluator tokenEvaluator = new TokenEvaluator();
        OperatorFactory operatorFactory = new OperatorFactory(new Plus(), new Minus(), new Multiply(), new Divide());
        ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator(tokenEvaluator, operatorFactory);
        return new Calculator(expressionEvaluator);
    }
}
