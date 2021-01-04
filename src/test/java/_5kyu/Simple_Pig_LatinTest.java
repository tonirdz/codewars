package _5kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Simple_Pig_LatinTest {
    @Test
    public void FixedTests() {
//        assertEquals("igPay atinlay siay oolcay", Simple_Pig_Latin.pigIt("Pig latin is cool"));
        assertEquals("hisTay! siay ,  ymay tringsay", Simple_Pig_Latin.pigIt("This! is ,  my string"));
    }
}