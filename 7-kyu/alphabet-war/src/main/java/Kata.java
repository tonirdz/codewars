import java.util.HashMap;

public class Kata {
    public static String alphabetWar(String fight) {
        HashMap<Character, Integer> powers = new HashMap<>();
        powers.put('w', -4);
        powers.put('p', -3);
        powers.put('b', -2);
        powers.put('s', -1);
        powers.put('m', 4);
        powers.put('q', 3);
        powers.put('d', 2);
        powers.put('z', 1);

        int result = 0;
        for(int i = 0; i < fight.length(); i++){
            Character c = fight.charAt(i);
            if (powers.containsKey(c)) result += powers.get(c);
        }
        if (result == 0) return "Let's fight again!";
        return result < 0 ? "Left side wins!" : "Right side wins!";
    }
}