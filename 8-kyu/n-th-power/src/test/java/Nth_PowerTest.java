import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Nth_PowerTest {

    @Test
    void nthPower() {
        assertEquals(-1, Nth_Power.nthPower(new int[] {1,2}, 2));
        assertEquals(8, Nth_Power.nthPower(new int[] {3,1,2,2}, 3));
        assertEquals(4, Nth_Power.nthPower(new int[] {3,1,2}, 2));
    }
}