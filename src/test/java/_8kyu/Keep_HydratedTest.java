package _8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Keep_HydratedTest {

    @Test
    void liters() {
        assertEquals(1, Keep_Hydrated.Liters(2));
        assertEquals(0, Keep_Hydrated.Liters(0.97));
        assertEquals(7, Keep_Hydrated.Liters(14.64));
        assertEquals(800, Keep_Hydrated.Liters(1600.20));
        assertEquals(40, Keep_Hydrated.Liters(80));
    }
}