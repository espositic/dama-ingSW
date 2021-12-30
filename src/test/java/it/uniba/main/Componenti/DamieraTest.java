package it.uniba.main.Componenti;
import it.uniba.main.Componenti.Damiera;
import it.uniba.main.Componenti.Pezzo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


@Tag("Damiera")
public class DamieraTest {

    Damiera dam;

    @Test
    @DisplayName("Controlla se il pezzo 1 è nero")
    void getPezzoTest1() {
        dam = new Damiera();
        Pezzo pez;
        pez = dam.getPezzo(0);
        assertTrue(pez.getColore() == 'n' && pez.getPosizione() == 1);
    }

    @Test
    @DisplayName("Controlla che il pezzo 0 non sia bianco")
    void getPezzoTest2() {
        dam = new Damiera();
        Pezzo pez;
        pez = dam.getPezzo(0);
        assertFalse(pez.getColore() == 'b');
    }

    @Test
    @DisplayName("Controlla che il pezzo 23 sia bianco")
    void getPezzoTest3() {
        dam = new Damiera();
        Pezzo pez;
        pez = dam.getPezzo(23);
        assertTrue(pez.getColore() == 'b');
    }

    @Test
    @DisplayName("Controlla che il pezzo 23 non sia nero")
    void getPezzoTest4() {
        dam = new Damiera();
        Pezzo pez;
        pez = dam.getPezzo(23);
        assertFalse(pez.getColore() == 'n');
    }

    @Test
    @DisplayName("Controlla che il pezzo 23 sia una pedina")
    void getPezzoTest5() {
        dam = new Damiera();
        Pezzo pez;
        pez = dam.getPezzo(23);
        assertEquals('p', pez.getTipo());

    }

    @Test
    @DisplayName("Controlla che il pezzo 23 non sia una dama")
    void getPezzoTest6() {
        dam = new Damiera();
        Pezzo pez;
        pez = dam.getPezzo(23);
        assertFalse(pez.getTipo() == 'd');

    }

    @Test
    @DisplayName("Controlla se c'è un pezzo in posizione 1")
    void trovaPezzoTest1() {
        dam = new Damiera();
        assertNotEquals(-1, dam.trovaPezzo(dam, 1));
    }

    @Test
    @DisplayName("Controlla se c'è un pezzo in posizione 13")
    void trovaPezzoTest2() {
        dam = new Damiera();
        assertEquals(-1, dam.trovaPezzo(dam, 13));
    }

    @Test
    @DisplayName("Controlla se c'è un pezzo in posizone 20")
    void trovaPezzoTest3() {
        dam = new Damiera();
        assertEquals(-1, dam.trovaPezzo(dam, 20));
    }

    @Test
    @DisplayName("Controlla se c'è un pezzo in posizone 32")
    void trovaPezzoTest4() {
        dam = new Damiera();
        assertNotEquals(-1, dam.trovaPezzo(dam, 32));
    }
}