package it.uniba.main.Componenti;
import it.uniba.main.Componenti.Damiera;
import it.uniba.main.Componenti.Pezzo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

@Tag("Pezzo")
public class PezzoTest {

    Damiera dam;

    @Test
    @DisplayName("Controlla l'effetto del cambio colore")
    void setColoreTest1() {

        dam = new Damiera();
        Pezzo pez;
        pez = dam.getPezzo(0);
        pez.setColore('b');
        assertEquals ('b', pez.getColore());
    }
    @Test
    @DisplayName("Controlla l'effetto del cambio colore per differenza")
    void setColoreTest2() {

        dam = new Damiera();
        Pezzo pez;
        pez = dam.getPezzo(0);
        pez.setColore('b');
        assertNotEquals ('n', pez.getColore());
    }


    @Test
    @DisplayName("Controlla l'effetto del cambio posizione")
    void setPosizioneTest1(){
        dam = new Damiera();
        Pezzo pez;
        pez = dam.getPezzo(0);
        pez.setPosizione(32);
        assertEquals(32,pez.getPosizione());

    }

    @Test
    @DisplayName("Controlla l'effetto del cambio posizione per differenza")
    void setPosizioneTest2(){
        dam = new Damiera();
        Pezzo pez;
        pez = dam.getPezzo(0);
        pez.setPosizione(32);
        assertNotEquals(0,pez.getPosizione());

    }


    @Test
    @DisplayName("Controlla l'effetto del cambio tipo")
    void setTipoTest1(){
        dam=new Damiera();
        Pezzo pez;
        pez=dam.getPezzo(0);
        pez.setTipo('d');
        assertEquals('d',pez.getTipo());
    }

    @Test
    @DisplayName("Controlla l'effetto del cambio tipo per differenza")
    void setTipoTest2(){
        dam=new Damiera();
        Pezzo pez;
        pez=dam.getPezzo(0);
        pez.setTipo('d');
        assertNotEquals('p',pez.getTipo());
    }

    @Test
    @DisplayName("Controlla l'effetto di setPresa")
    void setPresaTest1(){
        dam = new Damiera();
        Pezzo pez;
        pez=dam.getPezzo(1);
        pez.setPresa();
        assertTrue(pez.isPresa());
    }
    @Test
    @DisplayName("Controlla l'effetto di isPresa")
    void isPresaTest1(){
        dam = new Damiera();
        Pezzo pez;
        pez=dam.getPezzo(2);
        assertFalse(pez.isPresa());
    }
}
