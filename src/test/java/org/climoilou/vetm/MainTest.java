package org.climoilou.vetm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void mainTest() {
        assertTrue(true);
    }

    @Test
    void foufouTest() {
        assertTrue(true);
    }

    @Test
    void testCesarCipherSimple() {
        String result = Main.cesarCipher("abc", 1);
        assertEquals("bcd", result);
    }

    @Test
    void testCesarCipherAvecEspace() {
        String result = Main.cesarCipher("a b", 1);
        assertEquals("b c", result);
    }

    @Test
    void testCesarCipherBoucleAlphabet() {
        String result = Main.cesarCipher("xyz", 2);
        assertEquals("zab", result);
    }

    @Test
    void testCesarDecipher() {
        String encoded = Main.cesarCipher("bonjour", 3);
        String decoded = Main.cesarDecipher(encoded, 3);

        assertEquals("bonjour", decoded);
    }

    @Test
    void testOffsetSuperieur26() {
        String result = Main.cesarCipher("abc", 27);
        assertEquals("bcd", result);
    }
}