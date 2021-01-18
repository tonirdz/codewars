package _8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Smallest_unused_IDTest {

    @Test
    public void fixedTests() {
        assertEquals(4, Smallest_unused_ID.nextId(new int[] { 0, 1, 2, 3, 5 }));
        assertEquals(4, Smallest_unused_ID.nextId(new int[] { 1, 2, 0, 2, 3, 2}));
        assertEquals(4, Smallest_unused_ID.nextId(new int[] { 1, 2, 0, 2, 3, 5 }));
        assertEquals(11, Smallest_unused_ID.nextId(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
    }
}