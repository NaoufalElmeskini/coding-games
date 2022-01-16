package codewars;

import java.util.*;

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
public class CamelCase {

    public static  String toCamelCase(String text){
        return toCamelCase(
                toCamelCase(text, "-")
                ,"_"
        );
    }

    public static String toCamelCase(String text, String separator){
        List<String> words = new ArrayList<>( Arrays.asList(text.split(separator)) );
        String firstWord = words.remove(0);

        String reducedString = words.stream()
                .map(CamelCase::capitalize) // capitalizing every word
                .reduce("", String::concat); // concatinate all the results
        return firstWord + reducedString;
    }

    public static String capitalize(String text) {
        String result = Character.toString(text.charAt(0)).toUpperCase() ;
        result += text.substring(1);
        return result;
    }
}
