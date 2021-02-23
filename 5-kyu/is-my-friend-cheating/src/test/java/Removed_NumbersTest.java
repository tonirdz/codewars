import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Removed_NumbersTest {
    @Test
    public void test12() {
        List<long[]> res = new ArrayList<>();
        res.add(new long[] {15, 21});
        res.add(new long[] {21, 15});
        List<long[]> a = Removed_Numbers.removNb(26);
        assertArrayEquals(res.get(0), a.get(0));
        assertArrayEquals(res.get(1), a.get(1));
    }
}