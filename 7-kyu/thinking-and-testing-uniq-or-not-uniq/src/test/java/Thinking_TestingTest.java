import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Thinking_TestingTest {
    int[] a;
    int[] b;
    int[] expected;
    int[] actual;


    @Test
    public void basicTests() {

        a = new int[] { 0 };
        b = new int[] { 1 };
        expected = new int[] { 0, 1 };
        actual = Thinking_Testing.testit(a, b);
        assertArrayEquals(expected, actual);

        a = new int[] { 1, 2 };
        b = new int[] { 3, 4 };
        expected = new int[] { 1, 2, 3, 4 };
        actual = Thinking_Testing.testit(a, b);
        assertArrayEquals(expected, actual);

        a = new int[] { 1 };
        b = new int[] { 2, 3, 4 };
        expected = new int[] { 1, 2, 3, 4 };
        actual = Thinking_Testing.testit(a, b);
        assertArrayEquals(expected, actual);

        a = new int[] { 1, 2, 3 };
        b = new int[] { 4 };
        expected = new int[] { 1, 2, 3, 4 };
        actual = Thinking_Testing.testit(a, b);
        assertArrayEquals(expected, actual);

        a = new int[] { 1, 2 };
        b = new int[] { 1, 2 };
        expected = new int[] { 1, 1, 2, 2 };
        actual = Thinking_Testing.testit(a, b);
        assertArrayEquals(expected, actual);

        a = new int[] { 1, 1 };
        b = new int[] { 2, 2 };
        expected = new int[] { 1, 2 };
        actual = Thinking_Testing.testit(a, b);
        assertArrayEquals(expected, actual);

        a = new int[] { 1, 1, 1 };
        b = new int[] { 2, 2, 2 };
        expected = new int[] { 1, 2 };
        actual = Thinking_Testing.testit(a, b);
        assertArrayEquals(expected, actual);

        a = new int[] { 1, 2, 1 };
        b = new int[] { 2, 1, 2 };
        expected = new int[] { 1, 1, 2, 2 };
        actual = Thinking_Testing.testit(a, b);
        assertArrayEquals(expected, actual);

        a = new int[] { 1, 1, 1, 1, 1 };
        b = new int[] { 1, 1, 1, 1, 1, 1, 1 };
        expected = new int[] { 1, 1 };
        actual = Thinking_Testing.testit(a, b);
        assertArrayEquals(expected, actual);

    }
}