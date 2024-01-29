package FUNDAMENTALS.STRING;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareNSummTest {
    @Test
    public void testBasic()
    {
        assertEquals(9, SquareNSumm.squareSum(new int[] {1,2,2}));
        assertEquals(5, SquareNSumm.squareSum(new int[] {1,2}));
        assertEquals(50, SquareNSumm.squareSum(new int[] {5,-3,4}));
        assertEquals(0, SquareNSumm.squareSum(new int[] {}));
    }
}