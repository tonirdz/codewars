package _7kyu;

import java.util.HashMap;

public class Representation {
    public static int daysRepresented(int[][] trips) {
        HashMap<Integer,Integer> days = new HashMap<>();
        for (int[] trip : trips) {
            for (int i = trip[0]; i <= trip[1]; i++) days.put(i,1);
        }
        return days.size();
    }
}
