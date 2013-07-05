public class Multiply implements Operator{
    @Override
    public int evaluate(int operand1, int operand2) {
        return operand1 * operand2;
    }

    @Override
    public boolean matches(String operatorString) {
        return operatorString.equals("*");
    }
}
