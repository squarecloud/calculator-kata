public class Multiply extends Operator {
    public Multiply(ExpressionNode operand1, ExpressionNode operand2) {
        super(operand1, operand2);
    }

    @Override
    public int evaluate() {
        return operand1.evaluate() * operand2.evaluate();
    }
}
