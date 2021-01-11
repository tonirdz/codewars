package _5kyu;

import java.util.ArrayList;
import java.util.List;

public class Removed_Numbers {
    public static List<long[]> removNb(long n) {
        List<long[]> result = new ArrayList<>();
        long sum = (n * (n + 1)) >> 1;
        for (long a = n / 2; a <= n; a++) {
            long b = sum - a;
            if ( b % (a + 1) == 0) {
                result.add(new long[] {a,b / (a + 1)});
            }
        }
        return result;
    }
}
