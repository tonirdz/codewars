package _7kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum_MultipleTest {
    private void test(String message, int expected, int actual) {
        assertEquals(expected, actual, message);
    }

    @Test
    public void smallPositives() {
        test("The largest multiple of 2 between 0 and 7 is 6.", 6, Maximum_Multiple.maxMultiple(2, 7));
        test("The largest multiple of 3 between 0 and 10 is 9.", 9, Maximum_Multiple.maxMultiple(3, 10));
        test("The largest multiple of 7 between 0 and 17 is 14.", 14, Maximum_Multiple.maxMultiple(7, 17));
    }

    @Test
    public void largerPositives() {
        test("The largest multiple of 10 between 0 and 50 is 50.", 50, Maximum_Multiple.maxMultiple(10, 50));
        test("The largest multiple of 37 between 0 and 200 is 185.", 185, Maximum_Multiple.maxMultiple(37, 200));
        test("The largest multiple of 7 between 0 and 100 is 98.", 98, Maximum_Multiple.maxMultiple(7, 100));
    }
}