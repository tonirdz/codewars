import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Find_First_Non_consecutive_NumberTest {

    @Test
    void find() {
        assertEquals(Integer.valueOf(6), Find_First_Non_consecutive_Number.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        assertNull(Find_First_Non_consecutive_Number.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(Integer.valueOf(6), Find_First_Non_consecutive_Number.find(new int[]{4, 6, 7, 8, 9, 11}));
        assertEquals(Integer.valueOf(11), Find_First_Non_consecutive_Number.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        assertNull(Find_First_Non_consecutive_Number.find(new int[]{31, 32}));
        assertEquals(Integer.valueOf(0), Find_First_Non_consecutive_Number.find(new int[]{-3, -2, 0, 1}));
        assertEquals(Integer.valueOf(-1), Find_First_Non_consecutive_Number.find(new int[]{-5, -4, -3, -1}));
    }
}