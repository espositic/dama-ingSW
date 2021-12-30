package it.uniba.main.Utility;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

@Tag("GestioneStringhe")
public class GestioneStringheTest {

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 2 (i-f)")
    void estraePosizioneTest1() {
        String mossa = "2-4";
        assertEquals(2, GestioneStringhe.estraePosizione('i', mossa));
    }
    @Test
    @DisplayName("Controlla estrazione posizione finale cardinalità 2 (i-f) per differenza")
    void estraePosizioneTest2() {
        String mossa = "2-4";
        assertNotEquals(3, GestioneStringhe.estraePosizione('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 3 (i-ff)")
    void estraePosizioneTest3() {
        String mossa = "2-14";
        assertEquals(2, GestioneStringhe.estraePosizione('i', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione finale cardinalità 3 (i-ff)")
    void estraePosizioneTest4() {
        String mossa = "2-14";
        assertNotEquals(3, GestioneStringhe.estraePosizione('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 3 (ii-f)")
    void estraePosizioneTest5() {
        String mossa = "12-8";
        assertEquals(12, GestioneStringhe.estraePosizione('i', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione finale cardinalità 3 (ii-f) per differenza")
    void estraePosizioneTest6() {
        String mossa = "12-8";
        assertNotEquals(10, GestioneStringhe.estraePosizione('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 4")
    void estraePosizioneTest7() {
        String mossa = "12-21";
        assertEquals(12, GestioneStringhe.estraePosizione('i', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione finale cardinalità 4 per differenza")
    void estraePosizioneTest8() {
        String mossa = "12-21";
        assertNotEquals(13, GestioneStringhe.estraePosizione('i', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione cardinalità 3 e segno - (i-j-f)")
    void estraePosizione2Test0() {
        String mossa = "2-4-6";
        assertNotEquals(6, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(10,GestioneStringhe.estraePosizione2('j', mossa));
        assertNotEquals(8, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione cardinalità 3 e segno x (i-j-f)")
    void estraePosizione2Test1() {
        String mossa = "6x4x2";
        assertNotEquals(2, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(8,GestioneStringhe.estraePosizione2('j', mossa));
        assertNotEquals(12, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 4 e segno - (ii-k-f)")
    void estraePosizione2Test2() {
        String mossa = "12-4-6";
        assertEquals(12, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(7, GestioneStringhe.estraePosizione2('k',mossa));
        assertEquals(6, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 4 e segno - (i-jj-f)")
    void estraePosizione2Test3() {
        String mossa = "1-14-6";
        assertNotEquals(4, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(21, GestioneStringhe.estraePosizione2('j',mossa));
        assertEquals(6, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 4 e segno x (i-k-ff)")
    void estraePosizione2Test4() {
        String mossa = "4x8x12";
        assertEquals(4, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(12, GestioneStringhe.estraePosizione2('k',mossa));
        assertNotEquals(16, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 5 e segno - (i-kk-fff)")
    void estraePosizione2Test5() {
        String mossa = "4-12-16";
        assertNotEquals(10, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(14, GestioneStringhe.estraePosizione2('k',mossa));
        assertNotEquals(18, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 5 e segno x (i-kk-ff)")
    void estraePosizione2Test6() {
        String mossa = "4x12x16";
        assertEquals(4, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(14, GestioneStringhe.estraePosizione2('k',mossa));
        assertEquals(16, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 6 e segno - (ii-kk-ff)")
    void estraePosizione2Test7() {
        String mossa = "12x14x16";
        assertEquals(12, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(12, GestioneStringhe.estraePosizione2('k',mossa));
        assertEquals(16, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 6 e segno x (ii-jj-ff)")
    void estraePosizione2Test8() {
        String mossa = "12x15x17";
        assertEquals(12, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(12, GestioneStringhe.estraePosizione2('j',mossa));
        assertEquals(17, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 6 e segno - (ii-jj-k-f)")
    void estraePosizione2Test9() {
        String mossa = "12-14-9-5";
        assertEquals(12, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(12, GestioneStringhe.estraePosizione2('j',mossa));
        assertEquals(9,GestioneStringhe.estraePosizione2('k', mossa));
        assertNotEquals(7, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 6 e segno x (ii-jj-k-f)")
    void estraePosizione2Test10() {
        String mossa = "12x15x9x6";
        assertEquals(12, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(12, GestioneStringhe.estraePosizione2('j',mossa));
        assertEquals(9,GestioneStringhe.estraePosizione2('k', mossa));
        assertNotEquals(12, GestioneStringhe.estraePosizione2('f', mossa));
    }
    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 6 e segno - (i-j-kk-ff)")
    void estraePosizione2Test11() {
        String mossa = "1-4-16-17";
        assertNotEquals(5, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(8, GestioneStringhe.estraePosizione2('j',mossa));
        assertNotEquals(12,GestioneStringhe.estraePosizione2('k', mossa));
        assertNotEquals(18, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 6 e segno x (i-j-kk-ff)")
    void estraePosizione2Test12() {
        String mossa = "1x5x17x16";
        assertEquals(1, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(3, GestioneStringhe.estraePosizione2('j',mossa));
        assertEquals(17,GestioneStringhe.estraePosizione2('k', mossa));
        assertNotEquals(20, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 7 e segno - (ii-jj-kk-f)")
    void estraePosizione2Test13() {
        String mossa = "12-14-11-5";
        assertEquals(12, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(12, GestioneStringhe.estraePosizione2('j',mossa));
        assertEquals(11,GestioneStringhe.estraePosizione2('k', mossa));
        assertEquals(5, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 7 e segno x (ii-jj-kk-f)")
    void estraePosizione2Test14() {
        String mossa = "12x15x11x6";
        assertEquals(12, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(12, GestioneStringhe.estraePosizione2('j',mossa));
        assertEquals(11,GestioneStringhe.estraePosizione2('k', mossa));
        assertEquals(6, GestioneStringhe.estraePosizione2('f', mossa));
    }
    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 7 e segno - (i-jj-kk-ff)")
    void estraePosizione2Test15() {
        String mossa = "9-11-16-17";
        assertNotEquals(1, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(11, GestioneStringhe.estraePosizione2('j',mossa));
        assertNotEquals(16,GestioneStringhe.estraePosizione2('k', mossa));
        assertNotEquals(17, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 7 e segno x (i-jj-kk-ff)")
    void estraePosizione2Test16() {
        String mossa = "9x12x17x16";
        assertEquals(9, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(13, GestioneStringhe.estraePosizione2('j', mossa));
        assertEquals(17, GestioneStringhe.estraePosizione2('k', mossa));
        assertEquals(16, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 8 e segno - (ii-jj-kk-ff)")
    void estraePosizione2Test17() {
        String mossa = "11-12-16-17";
        assertEquals(11, GestioneStringhe.estraePosizione2('i', mossa));
        assertEquals(12, GestioneStringhe.estraePosizione2('j',mossa));
        assertNotEquals(18,GestioneStringhe.estraePosizione2('k', mossa));
        assertNotEquals(19, GestioneStringhe.estraePosizione2('f', mossa));
    }

    @Test
    @DisplayName("Controlla estrazione posizione inziale cardinalità 8 e segno x (ii-jj-kk-ff)")
    void estraePosizione2Test18() {
        String mossa = "11x12x17x16";
        assertEquals(11, GestioneStringhe.estraePosizione2('i', mossa));
        assertNotEquals(13, GestioneStringhe.estraePosizione2('j', mossa));
        assertEquals(17, GestioneStringhe.estraePosizione2('k', mossa));
        assertEquals(16, GestioneStringhe.estraePosizione2('f', mossa));
    }
}