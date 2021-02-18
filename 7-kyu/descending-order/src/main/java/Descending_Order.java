import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Descending_Order {
    public static int sortDesc(final int num) {
        List<Character> list = Integer.toString(num).chars().mapToObj(e -> (char) e).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return Integer.parseInt(list.stream().map(String::valueOf).collect(Collectors.joining()));
    }
}
