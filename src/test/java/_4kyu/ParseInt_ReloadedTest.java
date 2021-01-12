package _4kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParseInt_ReloadedTest {

    @Test
    public void fixedTests() {
        assertEquals(1 , ParseInt_Reloaded.parseInt("one"));
        assertEquals(20 , ParseInt_Reloaded.parseInt("twenty"));
        assertEquals(246 , ParseInt_Reloaded.parseInt("two hundred forty-six"));
        assertEquals(783919 , ParseInt_Reloaded.parseInt("seven hundred eighty-three thousand nine hundred and nineteen"));
        assertEquals(67000 , ParseInt_Reloaded.parseInt("sixty seven thousand"));
        assertEquals(4567090 , ParseInt_Reloaded.parseInt("four million, five hundred and sixty seven thousand and ninety"));
    }
}