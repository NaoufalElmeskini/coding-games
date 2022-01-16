package coc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EchangeTechniqueTest {

    @Test
    void test() {
        assertEquals("Chaussettes", ChaussettesSalesChallenge.chaussettessalles(3));
        assertEquals("Sales", ChaussettesSalesChallenge.chaussettessalles(5));
        assertEquals("ChaussettesSales", ChaussettesSalesChallenge.chaussettessalles(15));
    }

    @Test
    void testEquivalence() {
        for (int i = 0; i < 100; i++) {
            assertEquals(ChaussettesSalesChallenge.chaussettessalles(i),
                    ChaussettesSalesChallenge.chaussettessalles2(i));
        }
    }

}
