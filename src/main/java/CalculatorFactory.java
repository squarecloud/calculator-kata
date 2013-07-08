public class CalculatorFactory {
    public Calculator create() {
        Calculator integerValue = new IntegerValue(new EmptyStringIsZero());
        Calculator add = new Add(integerValue);
        Calculator subtract = new Subtract(add);
        Calculator multiply = new Multiply(subtract);
        Calculator divide = new Divide(multiply);
        return divide;
    }
}
