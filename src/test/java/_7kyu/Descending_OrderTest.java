package _7kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Descending_OrderTest {

    @Test
    public void test_01() {
        assertEquals(0, Descending_Order.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, Descending_Order.sortDesc(15));
    }


    @Test
    public void test_03() {
        assertEquals(987654321, Descending_Order.sortDesc(123456789));
    }
}