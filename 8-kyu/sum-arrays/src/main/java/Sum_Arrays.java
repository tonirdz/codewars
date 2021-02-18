import java.util.stream.DoubleStream;

public class Sum_Arrays {
    public static double sum(double[] numbers) {
        return DoubleStream.of(numbers).sum();
    }
}
