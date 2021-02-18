import java.util.stream.IntStream;

public class Reversed_Sequence {
    public static int[] reverse(int n) {
        return IntStream.iterate(n, m -> m - 1).limit(n).toArray();
    }
}
