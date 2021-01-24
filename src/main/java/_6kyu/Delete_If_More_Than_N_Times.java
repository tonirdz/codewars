package _6kyu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Delete_If_More_Than_N_Times {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer,Integer> counts = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int e:elements){
            Integer count = counts.getOrDefault(e,0);
            if (count < maxOccurrences) {
                result.add(e);
                counts.put(e,++count);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
