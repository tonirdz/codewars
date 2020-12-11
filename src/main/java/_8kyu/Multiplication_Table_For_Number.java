package _8kyu;

import javax.annotation.processing.SupportedSourceVersion;

public class Multiplication_Table_For_Number {
    public static String multiTable(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append(i).append(" * ").append(num).append(" = ").append(i*num).append(System.getProperty("line.separator"));
        }
        return result.toString().trim();
    }
}
