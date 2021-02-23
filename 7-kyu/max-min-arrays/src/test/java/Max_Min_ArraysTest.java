import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Max_Min_ArraysTest {
    @Test
    public void basicTests(){
        assertArrayEquals(new int[]{15,7,12,10,11},Max_Min_Arrays.solve(new int[]{15,11,10,7,12}));
        assertArrayEquals(new int[]{15,7,12,10,11},Max_Min_Arrays.solve(new int[]{15,11,10,7,12}));
        assertArrayEquals(new int[]{15,7,12,10,11},Max_Min_Arrays.solve(new int[]{15,11,10,7,12}));
    }
}