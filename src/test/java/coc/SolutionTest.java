package coc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortArray() {
        int[] array = {1, 5, 3, 2, 15, 4};

        int[] sorted = new Solution().sortArray(array);

        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 15}, sorted));
    }

    @Test
    void testComputeClosestToZero() {
        assertEquals(1,
                Solution.computeClosestToZero(new int[] {18, -15, 2, -1, 1}));
    }
}
