import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Convert_String_To_Camel_CaseTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        assertEquals("theStealthWarrior", Convert_String_To_Camel_Case.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        assertEquals("theStealthWarrior", Convert_String_To_Camel_Case.toCamelCase(input));
    }
}