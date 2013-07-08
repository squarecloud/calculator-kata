public class OperatorParser {
    public Operator parse(String operatorString, ExpressionNode operand1, ExpressionNode operand2) {

        switch(operatorString.charAt(0)) {
            case '+':
                return new Plus(operand1, operand2);
            case '-':
                return new Minus(operand1, operand2);
            case '*':
                return new Multiply(operand1, operand2);
            case '/':
                return new Divide(operand1, operand2);

        }
        throw new IllegalArgumentException("Bad operator " + operatorString);
    }
}
