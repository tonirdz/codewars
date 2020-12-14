package _7kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepresentationTest {

    @Test
    void daysRepresented() {
        assertEquals(17,Representation.daysRepresented(new int[][] {{10,15},{25,35}}));
        assertEquals(24,Representation.daysRepresented(new int[][] {{2,8},{220,229},{10,16}}));
    }
}