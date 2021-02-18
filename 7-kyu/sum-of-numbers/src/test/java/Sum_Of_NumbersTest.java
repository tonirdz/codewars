import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum_Of_NumbersTest {

    final Sum_Of_Numbers s = new Sum_Of_Numbers();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }
}