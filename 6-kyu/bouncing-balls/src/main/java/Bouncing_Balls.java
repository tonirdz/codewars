public class Bouncing_Balls {
    public static int bouncingBall(double h, double bounce, double window) {
        if ((h <= 0) || (bounce <= 0) || (bounce >= 1) || (window >= h)) return -1;
        int result = 1;
        for(double x = h * bounce; x > window; x *= bounce) result += 2;
        return result;
    }
}
