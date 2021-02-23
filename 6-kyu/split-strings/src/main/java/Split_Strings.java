import java.util.ArrayList;
import java.util.List;

public class Split_Strings {
    public static String[] solution(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String pair = Character.toString(s.charAt(i++));
            pair += (i >= s.length()? "_":s.charAt(i));
            result.add(pair);
        }
        return result.toArray(String[]::new);
    }
}
