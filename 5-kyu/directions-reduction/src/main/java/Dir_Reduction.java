import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Dir_Reduction {
    public static String[] dirReduc(String[] arr) {
        List<String> list = Arrays.asList(arr);
        Stack<String> result = new Stack<>();
        list.forEach(s -> {
            if (result.empty()) {
                result.push(s);
            } else {
                String prev = result.peek();
                if ((prev.equals("NORTH") && s.equals("SOUTH")) ||
                        (prev.equals("SOUTH") && s.equals("NORTH")) ||
                        (prev.equals("EAST") && s.equals("WEST")) ||
                        (prev.equals("WEST") && s.equals("EAST"))) {
                    result.pop();
                } else {
                    result.push(s);
                }
            }
        });

        return result.toArray(new String[0]);
    }
}