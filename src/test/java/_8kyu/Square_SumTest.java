package _8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Square_SumTest {
    @Test
    public void testBasic()
    {
        assertEquals(9, Square_Sum.squareSum(new int[] {1,2,2}));
        assertEquals(5, Square_Sum.squareSum(new int[] {1,2}));
        assertEquals(50, Square_Sum.squareSum(new int[] {5,-3,4}));
    }
}