import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Will_There_Be_Enough_SpaceTest {

    @Test
    void enough() {
        assertEquals(0, Will_There_Be_Enough_Space.enough(10, 5, 5));
        assertEquals(10, Will_There_Be_Enough_Space.enough(100, 60, 50));
        assertEquals(0, Will_There_Be_Enough_Space.enough(20, 5, 5));
    }
}