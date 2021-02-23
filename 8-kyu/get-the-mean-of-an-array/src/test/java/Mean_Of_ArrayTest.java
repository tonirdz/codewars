import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mean_Of_ArrayTest {
    @Test
    public void simpleTest() {
        assertEquals(2,Mean_Of_Array.getAverage(new int[] {2,2,2,2}));
        assertEquals(3,Mean_Of_Array.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1,Mean_Of_Array.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }
}