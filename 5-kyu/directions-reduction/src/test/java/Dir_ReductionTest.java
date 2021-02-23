import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Dir_ReductionTest {
    @Test
    public void testSimpleDirReduc() {
        assertArrayEquals(
                new String[]{"WEST"},
                Dir_Reduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}),
                "\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"");
        assertArrayEquals(
                new String[]{},
                Dir_Reduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}),
                "\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"");
    }
}