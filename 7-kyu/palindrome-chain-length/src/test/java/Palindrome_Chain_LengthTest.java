import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Palindrome_Chain_LengthTest {

    @Test
    public void testPalindrome() {
        assertEquals(0, Palindrome_Chain_Length.palindromeChainLength(1));
        assertEquals(0, Palindrome_Chain_Length.palindromeChainLength(88));
        assertEquals(0, Palindrome_Chain_Length.palindromeChainLength(393));
    }

    @Test
    public void testNonPalindrome() {
        assertEquals(1, Palindrome_Chain_Length.palindromeChainLength(10));
        assertEquals(1, Palindrome_Chain_Length.palindromeChainLength(134));
        assertEquals(4, Palindrome_Chain_Length.palindromeChainLength(87));
        assertEquals(7, Palindrome_Chain_Length.palindromeChainLength(2897));
        assertEquals(24, Palindrome_Chain_Length.palindromeChainLength(89));
    }
}