package _8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Switch_It_UpTest {

    @Test
    void switchItUp() {
        assertEquals("One", Switch_It_Up.switchItUp(1));
        assertEquals("Three", Switch_It_Up.switchItUp(3));
        assertEquals("Five", Switch_It_Up.switchItUp(5));
    }
}