package _8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Reversed_SequenceTest {

    @Test
    void reverse() {
        assertArrayEquals(new int[]{5,4,3,2,1},Reversed_Sequence.reverse(5));
    }
}