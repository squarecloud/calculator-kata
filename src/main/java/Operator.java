public abstract class Operator implements ExpressionNode {
    protected final ExpressionNode operand1;
    protected final ExpressionNode operand2;

    public Operator(ExpressionNode operand1, ExpressionNode operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
}