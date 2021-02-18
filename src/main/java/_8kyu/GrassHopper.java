package _8kyu;

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        return switch ((s1 + s2 + s3) / 30) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
    }
}
