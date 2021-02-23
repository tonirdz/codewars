import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Highest_LowestTest {
    @Test
    public void test1() {
        assertEquals("42 -9", Highest_Lowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}