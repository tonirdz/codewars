public class Maximum_Multiple {
    public static int maxMultiple(int divisor, int bound) {
        return bound - (bound % divisor);
    }
}
