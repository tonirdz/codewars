package _6kyu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Rectangle_Into_SquaresTest {
    @Test
    public void test1() {
        List<Integer> res = new ArrayList<>(Arrays.asList(3, 2, 1, 1));
        for (int r : res)
            assertEquals(res, Rectangle_Into_Squares.sqInRect(5, 3));
    }
    @Test
    public void test2() {
        assertNull(Rectangle_Into_Squares.sqInRect(5, 5));
    }
}