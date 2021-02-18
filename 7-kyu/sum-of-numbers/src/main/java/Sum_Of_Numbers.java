import java.util.stream.IntStream;

public class Sum_Of_Numbers {
    public int GetSum(int a, int b)
    {
        if (a > b) return IntStream.rangeClosed(b,a).sum();
        return IntStream.rangeClosed(a,b).sum();
    }
}
