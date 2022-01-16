package codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Complete the solution so that it splits the string into
 * pairs of two characters. If the string contains an odd
 * number of characters then it should replace the missing
 * second character of the final pair with an underscore ('_').
 *
 * StringSplit.solution("abc") // should return {"ab", "c_"}
 * StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
 */
class SplitStringsTest {

    @Test
    void testSplitIntoPairsList() {
        assertEquals(List.of(), SplitStrings.splitIntoPairsList(""));
        assertEquals(List.of("ab"), SplitStrings.splitIntoPairsList("ab"));
        assertEquals(List.of("ab", "c_"), SplitStrings.splitIntoPairsList("abc"));
        assertEquals(List.of("ab", "cd", "ef"), SplitStrings.splitIntoPairsList("abcdef"));
    }

    @Test
    void testSplitIntoPairsArray() {
        String[] expectedArrayOf1 = {"ab"};
        assertEquals(expectedArrayOf1.length,
                SplitStrings.splitIntoPairsArray("ab").length);
        assertEquals(expectedArrayOf1[0], SplitStrings.splitIntoPairsArray("ab")[0]);
        assertEquals(expectedArrayOf1.length, SplitStrings.splitIntoPairsArray("ab").length);

        String[] expectedArrayOf2 = {"ab", "c_"};
        assertEquals(expectedArrayOf2[1], SplitStrings.splitIntoPairsArray("abc")[1]);
    }

    @Test
    void testStringValueOfCharacter() {
        assertEquals("c", String.valueOf('c'));
    }
}
