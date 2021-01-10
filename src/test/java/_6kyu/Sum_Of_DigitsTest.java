package _6kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum_Of_DigitsTest {
    @Test
    public void Test1() {
        assertEquals( 7, Sum_Of_Digits.digital_root(16),"Nope!" );
    }
    @Test
    public void Test2() {
        assertEquals( 6, Sum_Of_Digits.digital_root(456),  "Nope!" );
    }
}