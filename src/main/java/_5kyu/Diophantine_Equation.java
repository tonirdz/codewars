package _5kyu;

import java.util.ArrayList;
import java.util.List;

public class Diophantine_Equation {
    public static String solEquaStr(long n) {
        ArrayList<ArrayList<Long>> xy = new ArrayList<>();
        for (long a = n; a >= Math.sqrt(n); a--) {
            if (n % a == 0) {
                long b = n / a;
                long x = (a + b) >> 1;
                long y = (a - b) >> 2;
                if (((a + b) % 2 == 0) && ((b - a) % 4 == 0)) xy.add(new ArrayList<>(List.of(x, y)));
            }
        }
        return xy.toString();
    }
}
