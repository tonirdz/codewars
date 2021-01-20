package _6kyu;

public class Longest_Repetition {
    public static Object[] longestRepetition(String s) {
        Object[] result = new Object[]{"",0};
        char prev = '\0';
        int n = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            n = (c != prev) ? 1 : ++n;
            if (n > max) {
                result[0] = String.valueOf(c);
                result[1] = n;
                max = n;
            }
            prev = c;
        }
        return result;
    }
}
