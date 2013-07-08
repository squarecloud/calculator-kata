public class IntegerValue implements Calculator {
    private Calculator next;

    public IntegerValue(Calculator next) {

        this.next = next;
    }

    @Override
    public int evaluate(String expression) {
        try {
            return Integer.parseInt(expression);
        } catch (NumberFormatException e) {
            return next.evaluate(expression);
        }
    }

}
