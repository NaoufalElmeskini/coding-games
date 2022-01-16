package functionnal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Write a function that takes a string, breaks it up and returns it with vowels first,
 *  consonants second. For any character that's not a vowel
 *  (like special characters or spaces), treat them like consonants.
 *
 * split("abcde") ➞ "aebcd"
 * split("Hello!") ➞ "eoHll!"
 * split("What's the time?") ➞ "aeieWht's th tm?"
 */
class VowelMagicTest {

    @Test
    void split() {
        assertEquals("aebcd", VowelMagic.rearrangeVowelsFirst("abcde"));
        assertEquals("ooubnjr", VowelMagic.rearrangeVowelsFirst("bonjour"));
        assertEquals("aeieWht's th tm?", VowelMagic.rearrangeVowelsFirst("What's the time?"));
    }

    @Test
    void getConsonantPart() {
        assertEquals("bcd", VowelMagic.getConsonantPart("abcd"));
        assertEquals("bnjr", VowelMagic.getConsonantPart("bonjour"));
        assertEquals("j n ss ps dsp", VowelMagic.getConsonantPart("je ne suis pas dispo"));
    }
    @Test
    void getVowelPart() {
        assertEquals("a", VowelMagic.getVowelPart("abcd"));
        assertEquals("oou", VowelMagic.getVowelPart("bonjour"));
        assertEquals("eeuiaio", VowelMagic.getVowelPart("je ne suis pas dispo"));
    }
}
