package _5kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Diophantine_EquationTest {

    @Test
    public void test1() {
        assertEquals("[[3, 1]]", Diophantine_Equation.solEquaStr(5));
    }

    @Test
    public void test2() {
        assertEquals("[[4, 1]]", Diophantine_Equation.solEquaStr(12));
    }

    @Test
    public void test3() {
        assertEquals("[[7, 3]]", Diophantine_Equation.solEquaStr(13));
    }

    @Test
    public void test4() {
        assertEquals("[[4, 0]]", Diophantine_Equation.solEquaStr(16));
    }

    @Test
    public void test5() {
        assertEquals("[[45003, 22501], [9003, 4499], [981, 467], [309, 37]]", Diophantine_Equation.solEquaStr(90005));
    }

    @Test
    public void test6() {
        assertEquals("[]", Diophantine_Equation.solEquaStr(90002));
    }

    @Test
    public void test7() {
        assertEquals("[]", Diophantine_Equation.solEquaStr(8));
    }

    @Test
    public void test26() {
        assertEquals("[[450000005, 225000002], [150000003, 75000000], [50000005, 24999998], [26470597, 13235290], [8823555, 4411752], [2941253, 1470550]]", Diophantine_Equation.solEquaStr(900000009));
    }
}