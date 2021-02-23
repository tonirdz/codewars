import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Mult_2_Numbers_Within_RangeTest {
    @Test
    public void testSomeValues14() {
        List<Integer> list1 = Mult_2_Numbers_Within_Range.findMultiples(2,4,40);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 8, 12, 16, 20, 24, 28, 32, 36));
        System.out.println(list1+"\n"+list2);
        assertEquals(list1, list2);
    }
    @Test
    public void testSomeValues() {
        List<Integer> list1 = Mult_2_Numbers_Within_Range.findMultiples(5,13,800);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(65, 130, 195, 260, 325, 390, 455, 520, 585, 650, 715, 780));
        System.out.println(list1+"\n"+list2);
        assertEquals(list1, list2);
    }
    @Test
    public void testSomeValues4() {
        List<Integer> list1 = Mult_2_Numbers_Within_Range.findMultiples(7,16,1000);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(112, 224, 336, 448, 560, 672, 784, 896));
        System.out.println(list1+"\n"+list2);
        assertEquals(list1, list2);
    }
}