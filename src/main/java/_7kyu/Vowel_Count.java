package _7kyu;

public class Vowel_Count {
    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

}
