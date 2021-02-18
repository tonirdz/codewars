package _8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("ConstantConditions")
class AlarmTest {
    @Test
    public void setAlarmTest() {
        assertTrue(Alarm.setAlarm(true, false),"Should be true.");
        assertFalse(Alarm.setAlarm(true, true),"Should be false.");
        assertFalse(Alarm.setAlarm(false, false),"Should be false.");
        assertFalse(Alarm.setAlarm(false, true), "Should be false.");
    }
}