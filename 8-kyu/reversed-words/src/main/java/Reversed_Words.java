import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reversed_Words {
    public static String reverseWords(String str) {
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
