import org.junit.Ignore;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class CalculatorTest {
    Calculator calculator = new CalculatorFactory().create();

    @Test
    public void test1() {
        assertThat(calculator.evaluate(" ")).isEqualTo(0);
    }

    @Test
    public void test_number_evaluation() {
        assertThat(calculator.evaluate("234")).isEqualTo(234);
    }

    @Test
    public void test_simple_addition() {
        assertThat(calculator.evaluate("6 + 3")).isEqualTo(9);
    }

    @Test
    public void test_simple_addition2() {
        assertThat(calculator.evaluate("12 + 34")).isEqualTo(46);
    }

    @Test
    public void test_simple_subtraction() {
        assertThat(calculator.evaluate("6 - 3")).isEqualTo(3);
    }

    @Test
    public void test_simple_subtraction2() {
        assertThat(calculator.evaluate("18 - 4")).isEqualTo(14);
    }

    @Test
    public void test_multiplication() {
        assertThat(calculator.evaluate("6 * 3")).isEqualTo(18);
    }

    @Test
    public void test_multiplication2() {
        assertThat(calculator.evaluate("5 * 22")).isEqualTo(110);
    }

    @Test
    public void test_division() {
        assertThat(calculator.evaluate("6 / 3")).isEqualTo(2);
    }

    @Test
    public void test_division2() {
        assertThat(calculator.evaluate("36 / 12")).isEqualTo(3);
    }

    @Test
    public void test_multiple_operators() {
        assertThat(calculator.evaluate("18 - 4 + 3")).isEqualTo(17);
    }

    @Ignore
    @Test
    public void test_multiple_operators2() {
        assertThat(calculator.evaluate("18 - 4 * 3")).isEqualTo(6);
    }

    @Ignore
    @Test
    public void additionalChallenges() {
        assertThat(calculator.evaluate("18 - (4 + 3)")).isEqualTo(11);
    }
}
