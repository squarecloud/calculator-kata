public class NumberParser {
    public ExpressionNode parse(final String symbol) {
        return new ExpressionNode() {
            @Override
            public int evaluate() {
                return Integer.parseInt(symbol);
            }
        };
    }
}
