package _8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Find_The_PositionTest {
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", Find_The_Position.position('a'));
        assertEquals("Position of alphabet: 26", Find_The_Position.position('z'));
        assertEquals("Position of alphabet: 5", Find_The_Position.position('e'));
    }
}