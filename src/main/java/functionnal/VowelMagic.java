package functionnal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a function that takes a string, breaks it up and returns it with vowels first,
 *  consonants second. For any character that's not a vowel
 *  (like special characters or spaces), treat them like consonants.
 *
 * split("abcde") ➞ "aebcd"
 * split("Hello!") ➞ "eoHll!"
 * split("What's the time?") ➞ "aeieWht's th tm?"
 */
public class VowelMagic {
    private static String VOWELS = "aeiou";

    public static String split(String text) {
        String result = text;

        String vowlPart = getVowelPart(text);
        String consonantPart = getConsonantPart(text);

        result = vowlPart + consonantPart;

        return result;
    }

    public static String getConsonantPart(String text) {
        List<String> textAsStringList = new ArrayList<>();
        text.chars().forEach(c -> textAsStringList.add(Character.toString(c)));

        return textAsStringList.stream()
                .filter(VowelMagic::isVowel)
                .reduce("", String::concat);
    }

    public static boolean isVowel(String string) {
        return VOWELS.contains(string);
    }

    public static String getVowelPart(String text) {
        List<String> textAsStringList = new ArrayList<>();
        text.chars().forEach(c -> textAsStringList.add(Character.toString(c)));

        return textAsStringList.stream()
                .filter(VowelMagic::isVowel)
                .reduce("", String::concat);
    }
}
