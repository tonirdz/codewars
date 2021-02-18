public class N_Divisible_by_X_Y {
    public static boolean isDivisible(long n, long x, long y) {
        return (n % x == 0) && (n % y == 0);
    }
}
