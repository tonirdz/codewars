package _8kyu;

public class Nth_Power {
    public static int nthPower(int[] array, int n) {
        return n>= array.length ? -1 : (int) Math.pow(array[n],n);
    }
}
