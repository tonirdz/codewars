import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convert_String_To_Camel_Case {
    static String toCamelCase(String s) {
        List<String> words = Stream.of(s.split("[-_]")).collect(Collectors.toList());
        StringBuilder out = new StringBuilder().append(words.get(0));
        words.stream().skip(1).forEach(word -> out.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)));
        return out.toString();
    }
}
