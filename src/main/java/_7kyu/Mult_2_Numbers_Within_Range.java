package _7kyu;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mult_2_Numbers_Within_Range {
    public static List<Integer> findMultiples(int s1, int s2, int s3) {
        return IntStream.range(1,s3).filter(x -> (x % s1 == 0) && (x % s2 == 0)).boxed().collect(Collectors.toList());
    }
}
