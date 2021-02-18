import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N_Divisible_by_X_YTest {
    @Test
    public void test1() {
        assertTrue(N_Divisible_by_X_Y.isDivisible(12, 4, 3));
    }
    @Test
    public void test2() {
        assertFalse(N_Divisible_by_X_Y.isDivisible(3, 3, 4));
    }
}