import java.util.Stack;

public class BackspacesInString {
    public String cleanString(String s) {
        Stack<Integer> result = new Stack<>();
        s.chars().forEach(c -> {
            if (c == '#') {
                if (!result.isEmpty()) result.pop();
            } else {
                result.push(c);
            }
        });
        return result.stream().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}