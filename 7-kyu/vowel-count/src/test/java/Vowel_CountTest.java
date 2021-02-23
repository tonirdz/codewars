import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vowel_CountTest {
    @Test
    public void testCase1() {
        assertEquals(5, Vowel_Count.getCount("abracadabra"), "Nope!");
    }
}