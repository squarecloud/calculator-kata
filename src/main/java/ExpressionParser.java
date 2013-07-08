import com.google.common.base.Splitter;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class ExpressionParser {
    private NumberParser numberParser;
    private OperatorParser operatorParser;

    public ExpressionParser(NumberParser numberParser, OperatorParser operatorFactory) {
        this.numberParser = numberParser;
        this.operatorParser = operatorFactory;
    }

    public int evaluate(String expression) {
        List<String> tokens = newArrayList(Splitter.on(" ").omitEmptyStrings().split(expression));

        if(tokens.size() == 0)
            return 0;

        return expression(tokens).evaluate();
    }

    ExpressionNode expression (List<String> tokens) {
        int tokenSize = tokens.size();

        if(tokenSize == 1) {
            return numberParser.parse(tokens.get(0));
        }

        ExpressionNode operand1 = expression(tokens.subList(0, tokenSize - 2));
        ExpressionNode operand2 = numberParser.parse(tokens.get(tokenSize - 1));

        return operatorParser.parse(tokens.get(tokenSize - 2), operand1, operand2);
    }
}
