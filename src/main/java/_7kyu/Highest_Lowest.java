package _7kyu;

import java.util.Arrays;

public class Highest_Lowest {
    public static String highAndLow(String numbers) {
        int[] result = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        return result[result.length - 1] + " " + result[0];
    }
}
