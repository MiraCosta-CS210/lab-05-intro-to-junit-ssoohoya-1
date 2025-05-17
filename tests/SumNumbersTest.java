import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumNumbersTest {
    @org.junit.jupiter.api.Test
    void sumIsEvenTest1() {
        SumNumbers sumNumbers = new SumNumbers();
        double result = sumNumbers.sumIsEven(1, 1);
        assertEquals(1, result);
    }
    @org.junit.jupiter.api.Test
    void sumIsEvenTest2() {
        SumNumbers sumNumbers = new SumNumbers();
        double result = sumNumbers.sumIsEven(1, 2);
        assertEquals(0, result);
    }
}
