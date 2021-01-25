package _6kyu;

import java.util.stream.IntStream;

public class Mexican_Wave {
    public static String[] wave(String str) {
        return IntStream
                .range(0, str.length())
                .filter(x -> !Character.isWhitespace(str.charAt(x)))
                .mapToObj(x -> new StringBuilder(str).replace(x, x + 1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
                .toArray(String[]::new);
    }
}
