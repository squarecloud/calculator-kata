import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class BinaryOperator implements Calculator {
    protected Calculator next;

    public BinaryOperator(Calculator next) {
        this.next = next;
    }

    @Override
    public int evaluate(String expression) {
        Pattern additionPattern = Pattern.compile("(\\d+) \\" + getOperator() + " (\\d+)");
        Matcher matcher = additionPattern.matcher(expression);
        if (matcher.matches()) {
            int operand1 = Integer.parseInt(matcher.group(1));
            int operand2 = Integer.parseInt(matcher.group(2));
            return operate(operand1, operand2);
        } else return next.evaluate(expression);
    }

    protected abstract int operate(int operand1, int operand2);
    public abstract String getOperator();
}