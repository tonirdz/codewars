package _6kyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Find_The_Odd_Int {
    public static int findIt(int[] a) {
        HashMap<Integer,Integer> count = new HashMap<>();
        Arrays.stream(a).forEach(x -> count.put(x, count.containsKey(x) ? count.get(x) + 1 : 1));
        return count.entrySet().stream().filter(e -> (e.getValue() % 2 != 0)).map(Map.Entry::getKey).findFirst().orElse(0);
    }
}
