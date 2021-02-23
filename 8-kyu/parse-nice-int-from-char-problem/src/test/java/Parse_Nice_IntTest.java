import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Parse_Nice_IntTest {

    @Test
    public void test1() {
        assertEquals(5, Parse_Nice_Int.howOld("5 years old"));
    }

    @Test
    public void test2() {
        assertEquals(9, Parse_Nice_Int.howOld("9 years old"));
    }

    @Test
    public void test3() {
        assertEquals(1, Parse_Nice_Int.howOld("1 year old"));
    }
}