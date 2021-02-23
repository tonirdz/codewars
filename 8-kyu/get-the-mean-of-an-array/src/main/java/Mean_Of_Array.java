import java.util.Arrays;

public class Mean_Of_Array {
    public static int getAverage(int[] marks){
        return (int) Arrays.stream(marks).summaryStatistics().getAverage();
    }
}
