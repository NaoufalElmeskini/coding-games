package functionnal;

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
    private final static String VOWELS = "aeiou";

    /**
     * name changed from 'split' to 'rearrangeVowelsFirst' for precision
     * @param text text to rearrange
     * @return rearranged text, with vowels first, and consonnants after
     */
    public static String rearrangeVowelsFirst(String text) {
        String result;
        String vowlPart = getVowelPart(text);
        String consonantPart = getConsonantPart(text);

        result = vowlPart + consonantPart;

        return result;
    }

    public static String getVowelPart(String text) {
        return text.chars()
                .filter(c -> isVowel((char) c))
                .mapToObj(Character::toString)
                .reduce("", String::concat);
    }

    private static boolean isVowel(char character) {
        return Character.isLetter(character) &&
                VOWELS.contains(Character.toString(character));
    }
    private static boolean isConsonnant(char character) {
        return !isVowel(character);
    }

    public static String getConsonantPart(String text) {
        return text.chars()
                .filter(c -> isConsonnant((char) c))
                .mapToObj(Character::toString)
                .reduce("", String::concat);
    }
}
