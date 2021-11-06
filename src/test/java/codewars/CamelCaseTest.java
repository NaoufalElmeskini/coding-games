package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Complete the method/function so that it converts dash/underscore
 * delimited words into camel casing. The first word within
 * the output should be capitalized only if the original word was
 * capitalized (known as Upper Camel Case, also often referred
 * to as Pascal case).
 *
 * Examples :
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */
class CamelCaseTest {

    @Test
    void toCamelCase() {
        assertEquals("theStealthWarrior", CamelCase.toCamelCase("the-stealth-warrior"));
        assertEquals("TheStealthWarrior", CamelCase.toCamelCase("The_Stealth_Warrior"));
        assertEquals("TheStealthWarrior", CamelCase.toCamelCase("The_Stealth-Warrior"));
    }

    @Test
    void capitalize() {
        assertEquals("Bonjour", CamelCase.capitalize("bonjour"));
    }
}
