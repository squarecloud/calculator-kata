import java.util.Arrays;
import java.util.List;

import static com.google.common.collect.Lists.*;

public class OperatorFactory {
    private List<Operator> operatorList = newArrayList();

    public OperatorFactory(Operator ... operators) {
        operatorList = Arrays.asList(operators);
    }

    public Operator fromString(String operatorString) {
        for (Operator operator : operatorList) {
            if(operator.matches(operatorString)){
                return operator;
            }
        }
        throw new IllegalArgumentException("Bad operator " + operatorString);
    }
}
