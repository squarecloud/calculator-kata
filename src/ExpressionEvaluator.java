import com.google.common.base.Splitter;

public class ExpressionEvaluator {
    private TokenEvaluator tokenEvaluator;

    public ExpressionEvaluator(TokenEvaluator tokenEvaluator) {
        this.tokenEvaluator = tokenEvaluator;
    }

    public int evaluate(String expression) {
        int result = 0;
        Iterable<String> tokens = Splitter.on(" ").omitEmptyStrings().split(expression);

        for (String token : tokens) {
            result += tokenEvaluator.evaluate(token);
        }

        return result;
    }
}
