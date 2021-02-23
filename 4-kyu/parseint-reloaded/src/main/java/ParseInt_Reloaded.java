import java.util.HashMap;

public class ParseInt_Reloaded {
    public static int parseInt(String numStr) {
        HashMap<String,Integer> map = createMap();
        String[] words = numStr.split(" and |[ -]|, ");
        int res = 0, acc = 0;
        for (String word : words) {
            int val = map.get(word);
            if (val == 100) acc *= 100;
            if (val >= 1000) {
                res += acc * val;
                acc = 0;
            }
            if (val < 100) acc += val;
        }
        res += acc;
        return res;
    }

    private static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("zero",           0);
        map.put("one",            1);
        map.put("two",            2);
        map.put("three",          3);
        map.put("four",           4);
        map.put("five",           5);
        map.put("six",            6);
        map.put("seven",          7);
        map.put("eight",          8);
        map.put("nine",           9);
        map.put("ten",           10);
        map.put("eleven",        11);
        map.put("twelve",        12);
        map.put("thirteen",      13);
        map.put("fourteen",      14);
        map.put("fifteen",       15);
        map.put("sixteen",       16);
        map.put("seventeen",     17);
        map.put("eighteen",      18);
        map.put("nineteen",      19);
        map.put("twenty",        20);
        map.put("thirty",        30);
        map.put("forty",         40);
        map.put("fifty",         50);
        map.put("sixty",         60);
        map.put("seventy",       70);
        map.put("eighty",        80);
        map.put("ninety",        90);
        map.put("hundred",      100);
        map.put("thousand",    1000);
        map.put("million",  1000000);
        return map;
    }
}
