import java.time.LocalTime;
import java.util.Collections;

public class FizzBuzzCuckooClock {
    public static String fizzBuzzCuckooClock(String time) {
        LocalTime localtime = LocalTime.parse(time);
        int hour = localtime.getHour();
        int minute = localtime.getMinute();
        if (minute == 0) return String.join(" ", Collections.nCopies((hour % 12 == 0 ? 12 : hour % 12), "Cuckoo"));
        if (minute == 30) return "Cuckoo";
        if (minute % 15 == 0) return "Fizz Buzz";
        if (minute % 3 == 0) return "Fizz";
        if (minute % 5 == 0) return "Buzz";
        return "tick";
    }
}