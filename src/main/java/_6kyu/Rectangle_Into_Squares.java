package _6kyu;

import java.util.ArrayList;
import java.util.List;

public class Rectangle_Into_Squares {
    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) return null;
        List<Integer> result = new ArrayList<>();
        while (lng != wdth) {
            if (lng > wdth) {
                result.add(wdth);
                lng -= wdth;
            } else {
                result.add(lng);
                wdth -= lng;
            }
        }
        result.add(lng);
        return result;
    }
}
