import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Pick_PeaksTest {
    private static final String[] msg = {"should support finding peaks",
            "should support finding peaks, but should ignore peaks on the edge of the array",
            "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
            "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
            "should support finding peaks, but should ignore peaks on the edge of the array"};

    private static final int[][] array = {{1, 2, 3, 6, 4, 1, 2, 3, 2, 1},
            {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3},
            {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1},
            {2, 1, 3, 1, 2, 2, 2, 2, 1},
            {2, 1, 3, 1, 2, 2, 2, 2}};

    private static final int[][] posS = {{3, 7},
            {3, 7},
            {3, 7, 10},
            {2, 4},
            {2},};

    private static final int[][] peaksS = {{6, 3},
            {6, 3},
            {6, 3, 2},
            {3, 2},
            {3}};

    @Test
    public void sampleTests() {
        for (int n = 0; n < msg.length; n++) {
            final int[] p1 = posS[n], p2 = peaksS[n];
            Map<String, List<Integer>> expected = new HashMap<>() {{
                put("pos", Arrays.stream(p1).boxed().collect(Collectors.toList()));
                put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
            }},
                    actual = Pick_Peaks.getPeaks(array[n]);
            assertEquals(expected, actual,msg[n]);
        }
    }
}