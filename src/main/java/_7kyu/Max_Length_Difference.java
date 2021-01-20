package _7kyu;

import java.util.Arrays;

public class Max_Length_Difference {
    public static int mxdiflg(String[] a1, String[] a2) {
        if ((a1.length == 0) || (a2.length == 0)) return -1;
        int a1min = Arrays.stream(a1).map(String::length).min(Integer::compare).get();
        int a1max = Arrays.stream(a1).map(String::length).max(Integer::compare).get();
        int a2min = Arrays.stream(a2).map(String::length).min(Integer::compare).get();
        int a2max = Arrays.stream(a2).map(String::length).max(Integer::compare).get();
        return Math.max(a1max - a2min, a2max - a1min);
    }
}
