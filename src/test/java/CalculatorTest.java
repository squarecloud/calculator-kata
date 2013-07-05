import org.junit.Ignore;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void test1() {
        Calculator calculator = new CalculatorFactory().create();

        assertThat(calculator.evaluate(" ")).isEqualTo(0);
    }

    @Test
    public void test_number_evaluation() {
        Calculator calculator = new CalculatorFactory().create();

        assertThat(calculator.evaluate("234")).isEqualTo(234);
    }

    @Test
    public void test_simple_addition() {
        Calculator calculator = new CalculatorFactory().create();

        assertThat(calculator.evaluate("6 + 3")).isEqualTo(9);
    }

    @Test
    public void test_simple_addition2() {
        Calculator calculator = new CalculatorFactory().create();

        assertThat(calculator.evaluate("12 + 34")).isEqualTo(46);
    }

    @Test
    public void test_simple_subtraction() {
        Calculator calculator = new CalculatorFactory().create();

        assertThat(calculator.evaluate("6 - 3")).isEqualTo(3);
    }

    @Test
    public void test_simple_subtraction2() {
        Calculator calculator = new CalculatorFactory().create();

        assertThat(calculator.evaluate("18 - 4")).isEqualTo(14);
    }

    @Ignore
    @Test
    public void test_others() {
        Calculator calculator = new CalculatorFactory().create();
        assertThat(calculator.evaluate("6 * 3")).isEqualTo(18);
        assertThat(calculator.evaluate("5 * 22")).isEqualTo(110);
        assertThat(calculator.evaluate("6 / 3")).isEqualTo(2);
        assertThat(calculator.evaluate("36 / 12")).isEqualTo(3);
    }


    @Ignore
    @Test
    public void additionalChallenges() {
        Calculator calculator = new CalculatorFactory().create();

        assertThat(calculator.evaluate("18 - 4 + 3")).isEqualTo(17);
        assertThat(calculator.evaluate("18 - 4 * 3")).isEqualTo(6);
        assertThat(calculator.evaluate("18 - (4 + 3)")).isEqualTo(11);
    }
}
