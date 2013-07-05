import com.google.common.base.Splitter;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class ExpressionEvaluator {
    private TokenEvaluator tokenEvaluator;
    private OperatorFactory operatorFactory;

    public ExpressionEvaluator(TokenEvaluator tokenEvaluator, OperatorFactory operatorFactory) {
        this.tokenEvaluator = tokenEvaluator;
        this.operatorFactory = operatorFactory;
    }

    public int evaluate(String expression) {
        int result = 0;
        List<String> tokens = newArrayList(Splitter.on(" ").omitEmptyStrings().split(expression));

        if(tokens.size() == 1){
            result = tokenEvaluator.evaluate(tokens.get(0));
        }

        if(tokens.size() == 3){
            int operand1 = tokenEvaluator.evaluate(tokens.get(0));
            Operator operator = operatorFactory.fromString(tokens.get(1));
            int operand2 = tokenEvaluator.evaluate(tokens.get(2));
            result = operator.evaluate(operand1, operand2);
        }

        return result;
    }
}
