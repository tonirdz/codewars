package _6kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Delete_If_More_Than_N_TimesTest {
    @Test
    public void deleteNth() {
        assertArrayEquals(
                new int[]{20, 37, 21},
                Delete_If_More_Than_N_Times.deleteNth(new int[]{20, 37, 20, 21}, 1)
        );
        assertArrayEquals(
                new int[]{1, 1, 3, 3, 7, 2, 2, 2},
                Delete_If_More_Than_N_Times.deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)

        );
        assertArrayEquals(
                new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5},
                Delete_If_More_Than_N_Times.deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3)
        );
        assertArrayEquals(
                new int[]{1, 1, 1, 1, 1},
                Delete_If_More_Than_N_Times.deleteNth(new int[]{1, 1, 1, 1, 1}, 5)
        );
        assertArrayEquals(
                new int[]{},
                Delete_If_More_Than_N_Times.deleteNth(new int[]{}, 5)
        );
    }
}