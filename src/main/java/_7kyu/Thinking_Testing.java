package _7kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Thinking_Testing {
    public static int[] testit(int[] a, int[] b){
        IntStream aStr = Arrays.stream(a).distinct();
        IntStream bStr = Arrays.stream(b).distinct();
        return IntStream.concat(aStr, bStr).sorted().toArray();
    }
}
