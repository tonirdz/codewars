package _6kyu;

public class Sum_Of_Digits {
    public static int digital_root(int n) {
        while (n > 9) {
            n = Integer.toString(n).chars().map(Character::getNumericValue).sum();
        }
        return n;
    }
}
