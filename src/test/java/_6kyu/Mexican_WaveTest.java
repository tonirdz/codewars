package _6kyu;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Mexican_WaveTest {

    @Test
    public void basicTest1() {
        String[] result = new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
        assertArrayEquals(result, Mexican_Wave.wave("hello"),"it should return '" + Arrays.toString(result) + "'");
    }

    @Test
    public void basicTest2() {
        String[] result = new String[] { "Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS" };
        assertArrayEquals(result, Mexican_Wave.wave("codewars"),"it should return '" + Arrays.toString(result) + "'");
    }

    @Test
    public void basicTest3() {
        String[] result = new String[] { };
        assertArrayEquals(result, Mexican_Wave.wave(""),"it should return '" + Arrays.toString(result) + "'");
    }

    @Test
    public void basicTest4() {
        String[] result = new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS" };
        assertArrayEquals(result, Mexican_Wave.wave("two words"),"it should return '" + Arrays.toString(result) + "'");
    }

    @Test
    public void basicTest5() {
        String[] result = new String[] { " Gap ", " gAp ", " gaP " };
        assertArrayEquals(result, Mexican_Wave.wave(" gap "), "it should return '" + Arrays.toString(result) + "'");
    }
}