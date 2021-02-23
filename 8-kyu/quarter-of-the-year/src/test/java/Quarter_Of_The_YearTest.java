import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quarter_Of_The_YearTest {

    @Test
    public void exampleTests() {
        assertEquals(1,Quarter_Of_The_Year.quarterOf( 3));
        assertEquals(3,Quarter_Of_The_Year.quarterOf( 8));
        assertEquals(4,Quarter_Of_The_Year.quarterOf( 11));
    }
}