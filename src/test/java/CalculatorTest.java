import org.junit.Test;

import static org.junit.Assert.*;
public class CalculatorTest {

    @Test
    public void sum() {
        assertEquals(4, Calculator.sum(2, 2));
        assertEquals(6, Calculator.sum(2, 4));
    }
}