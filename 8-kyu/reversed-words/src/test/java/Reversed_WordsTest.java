import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Reversed_WordsTest {
    @Test
    public void testSomething() {
        assertEquals("eating like I", Reversed_Words.reverseWords("I like eating"));
        assertEquals("flying like I", Reversed_Words.reverseWords("I like flying"));
        assertEquals("nice is world The", Reversed_Words.reverseWords("The world is nice"));
    }
}