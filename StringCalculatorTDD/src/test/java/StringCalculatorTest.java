import org.StringCalculatorTDD.StringCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    public void testEmptyStringReturnsZero() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void testSingleNumberReturnsValue() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }

    @Test
    public void testTwoNumbersReturnsSum() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void testMultipleNumbersReturnsSum() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1,2,3"));
        assertEquals(15, calculator.add("4,5,6"));
    }

}
