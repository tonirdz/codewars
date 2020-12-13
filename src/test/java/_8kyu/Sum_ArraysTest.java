package _8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum_ArraysTest {

    @Test
    void sum() {
        assertEquals(0,      Sum_Arrays.sum(new double[] { }),                1e-4);
        assertEquals(-2.398, Sum_Arrays.sum(new double[] {-2.398}),           1e-4);
        assertEquals(6,      Sum_Arrays.sum(new double[] {1, 2, 3}),          1e-4);
        assertEquals(6.6,    Sum_Arrays.sum(new double[] {1.1, 2.2, 3.3}),    1e-4);
        assertEquals(9.2,    Sum_Arrays.sum(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
        assertEquals(320,    Sum_Arrays.sum(new double[] {30, 89, 100, 101}), 1e-4);
    }
}