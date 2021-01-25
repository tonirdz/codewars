package _5kyu;

import java.util.*;
import java.util.stream.Collectors;

public class Pick_Peaks {
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        Map<String, List<Integer>> result = new HashMap<>();
        Stack<Integer> peaks = new Stack<>();

        if (arr.length < 3) {
            result.put("pos", new ArrayList<>());
            result.put("peaks", new ArrayList<>());
            return result;
        }

        int value = arr[0];
        boolean up = false;
        for (int i = 1, arrLength = arr.length; i < arrLength; i++) {
            if (arr[i] > value) {
                if (up) peaks.pop();
                peaks.push(i);
                up = true;
            } else if (arr[i] < value) up = false;
            value = arr[i];
        }
        if (up) peaks.pop();

        result.put("pos", new ArrayList<>(peaks));
        result.put("peaks", peaks.stream().map(i -> i = arr[i]).collect(Collectors.toList()));
        return result;
    }
}
