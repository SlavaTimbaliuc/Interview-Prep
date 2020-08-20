import Problems.SumTwoNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTwoNumbersTests {

    @Test
    public void simpleTest() {
        int[] a = {1, 40};
        assertTrue(SumTwoNumbers.execute(a, 41));
        assertFalse(SumTwoNumbers.execute(a, 42));
    }

    @Test
    public void basic() {
        int[] a = {98, 1, 5, 300, 8, 23, 45, 4326, 3245, 43, 6, 341234};
        assertTrue(SumTwoNumbers.execute(a, 7571));
        assertFalse(SumTwoNumbers.execute(a, 98765));
    }

    @Test
    public void simpleNegatives() {
        int[] a = {50, -30, 20, 39};
        assertTrue(SumTwoNumbers.execute(a, 9));
        assertFalse(SumTwoNumbers.execute(a, -50));
    }
}
