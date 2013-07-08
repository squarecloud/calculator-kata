public class Subtract extends BinaryOperator {
    public Subtract(Calculator next) {
        super(next);
    }

    @Override
    protected int operate(int operand1, int operand2) {
        return operand1 - operand2;
    }

    @Override
    public String getOperator() {
        return "-";
    }
}
