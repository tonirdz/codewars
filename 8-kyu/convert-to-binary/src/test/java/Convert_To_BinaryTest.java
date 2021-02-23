import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Convert_To_BinaryTest {

    @Test
    public void testToBinary() {
        assertEquals(1, Convert_To_Binary.toBinary(1));
        assertEquals(10, Convert_To_Binary.toBinary(2));
        assertEquals(11, Convert_To_Binary.toBinary(3));
        assertEquals(101, Convert_To_Binary.toBinary(5));
    }
}