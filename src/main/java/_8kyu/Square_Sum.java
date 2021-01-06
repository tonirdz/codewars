package _8kyu;

import java.util.stream.IntStream;

public class Square_Sum {
    public static int squareSum(int[] n){
        return IntStream.of(n).map(x -> x * x).sum();
    }
}
