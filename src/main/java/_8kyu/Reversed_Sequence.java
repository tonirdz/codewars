package _8kyu;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reversed_Sequence {
    public static int[] reverse(int n) {
        return IntStream.iterate(n, m -> m - 1).limit(n).toArray();
    }
}
