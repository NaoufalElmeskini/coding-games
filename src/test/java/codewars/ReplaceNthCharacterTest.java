package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceNthCharacterTest {

    @Test
    void replaceNth() {
        assertNull(ReplaceNthCharacter.replaceNth(null, 2, 'i', 'o'));

        assertEquals("",
                ReplaceNthCharacter.replaceNth("", 2, 'i', 'o'));
        assertEquals("oooo",
                ReplaceNthCharacter.replaceNth("aaaa", 1, 'a', 'o'));
        assertEquals("aoao",
                ReplaceNthCharacter.replaceNth("aaaa", 2, 'a', 'o'));


//        assertEquals("aaaa",
//                CodeWars.replaceNth("aaaa", 2, 'i', 'o'));
//        Assertions.assertEquals("Vader soid: No, I am your fother!",
//                CodeWars.replaceNth("Vader said: No, I am your father!", 2, 'a', 'o'));
    }
}
