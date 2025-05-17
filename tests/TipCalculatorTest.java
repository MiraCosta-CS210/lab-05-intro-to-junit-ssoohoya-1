import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipCalculatorTest {
    @Test
    void calculateTipTest1() {
        TipCalculator tipCalculator = new TipCalculator();
        double result = tipCalculator.calculateTip(100.00, 20);
        assertEquals(20, result);
    }

    @Test
    void calculateTipTest2() {
        TipCalculator tipCalculator = new TipCalculator();
        double result = tipCalculator.calculateTip(213.89, 18);
        assertEquals(38.50, result);
    }
}
