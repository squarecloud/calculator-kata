public class CalculatorFactory {
    public Calculator create() {
        NumberParser numberParser = new NumberParser();
        OperatorParser operatorParser = new OperatorParser();
        ExpressionParser expressionParser = new ExpressionParser(numberParser, operatorParser);
        return new Calculator(expressionParser);
    }
}
