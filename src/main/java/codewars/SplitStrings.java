package codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * Complete the solution so that it splits the string into
 * pairs of two characters. If the string contains an odd
 * number of characters then it should replace the missing
 * second character of the final pair with an underscore ('_').
 *
 * StringSplit.solution("abc") // should return {"ab", "c_"}
 * StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
 */
public class SplitStrings {

    public static List<String> splitIntoPairsList(String string) {
        char[] charsArray = string.toCharArray();

        List<String> result = new ArrayList<>();
        String buffer = "";

        for (int i = 0; i < charsArray.length; i++) {
            buffer += String.valueOf(string.charAt(i));
            if (buffer.length() == 2) {
                result.add(buffer);
                buffer = "";
            }
        }
        if(!buffer.isEmpty()) {
            result.add(buffer.concat("_"));
        }

        return result;
    }



    public static String[] splitIntoPairsArray(String string) {
        char[] charsArray = string.toCharArray();
        String[] result = initResultArray(string);

        String buffer = "";

        for (int i = 0; i < charsArray.length; i++) {
            buffer += String.valueOf(string.charAt(i));
            if (i > 0 && i%2 == 0) {
                result[i / 2] = buffer;
                buffer = "";
            }
        }

        if(!buffer.isEmpty()) {
            result[result.length-1] = buffer.concat("_");
        }

        return result;
    }

    private static String[] initResultArray(String string) {
        int length = string.length()/2;
        if(string.length() % 2 == 1) {
            length++;
        }
        return new String[length];
    }
}
