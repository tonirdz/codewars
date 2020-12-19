package _8kyu;

import java.time.*;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Clock {
    public static int Past(int h, int m, int s) {
        return (3600 * h + 60 * m + s) * 1000;
    }
}
