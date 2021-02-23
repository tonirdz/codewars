import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        return Arrays.stream(words).map(w -> (w.length() >= 5 ? new StringBuilder(w).reverse().toString() : w))
                .collect(Collectors.joining(" "));
    }
}
