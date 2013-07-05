public class TokenEvaluator {
    public int evaluate(String expression) {
        if(expression.matches("\\d+")) {
            return Integer.parseInt(expression);
        }

        return 0;
    }
}
