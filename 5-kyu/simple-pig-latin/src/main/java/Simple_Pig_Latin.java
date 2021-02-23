import java.util.regex.Pattern;

public class Simple_Pig_Latin {
    public static String pigIt(String str){
        StringBuilder result = new StringBuilder();
        String[] words = str.split("((?<=[\\p{Punct}\\s])|(?=[\\p{Punct}\\s]))");
        for (String word: words) {
            System.out.println(word);
            if (!Pattern.matches("[\\p{Punct}\\s]", Character.toString(word.charAt(0)))) {
                result.append(word.substring(1)).append(word.charAt(0)).append("ay");
            } else {
                result.append(word);
            }
        }
        return result.toString();
    }
}
