import java.time.LocalDate;
import java.time.temporal.IsoFields;

public class Quarter_Of_The_Year {
    public static int quarterOf(int month) {
        return LocalDate.of(2020,month,1).get(IsoFields.QUARTER_OF_YEAR);
    }
}
