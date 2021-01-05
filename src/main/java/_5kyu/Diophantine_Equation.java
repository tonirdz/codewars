package _5kyu;

public class Diophantine_Equation extends Thread {
    public static String solEquaStr(long n) {
        StringBuilder result = new StringBuilder("[");
        for (long a = n; a >= Math.sqrt(n); a--) {
            if (n % a == 0) {
                long b = n / a;
                if (((a + b) % 2 == 0) && ((b - a) % 4 == 0)) {
                    long x = (a + b) >> 1;
                    long y = (a - b) >> 2;
                    result.append("[").append(x).append(", ").append(y).append("], ");
                }
            }
        }
        if (result.toString().equals("[")) return "[]";
        return result.substring(0, result.length() -2) + "]";
    }
}
