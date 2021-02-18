public class Mumbling {
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            String str = Character.toString(s.charAt(i)).repeat(i+1);
            result.append(str.substring(0, 1).toUpperCase()).append(str.substring(1).toLowerCase()).append('-');
        }
        return result.substring(0,result.length() - 1);
    }
}
