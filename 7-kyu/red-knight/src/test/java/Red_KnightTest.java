import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Red_KnightTest {
    @Test
    public void should_return_the_output_provided() {
        PawnDistance actual = Red_Knight.redKnight(0, 8);
        PawnDistance expected = new PawnDistance("White", 16);
        assertEquals(expected, actual);

        actual = Red_Knight.redKnight(0, 7);
        expected = new PawnDistance("Black", 14);
        assertEquals(expected, actual);

        actual = Red_Knight.redKnight(1, 6);
        expected = new PawnDistance("Black", 12);
        assertEquals(expected, actual);

        actual = Red_Knight.redKnight(1, 5);
        expected = new PawnDistance("White", 10);
        assertEquals(expected, actual);
    }
}