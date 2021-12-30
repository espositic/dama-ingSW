package it.uniba.main.InputOutput;
import it.uniba.main.InputOutput.Input;
import it.uniba.main.Partita.GestioneTurno;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.*;


@Tag("Input")
@DisplayName(value="Test per package InputOtput della classe Input")
public class InputTest {
    GestioneTurno tur;

    @Test
    @DisplayName(value="Test per la funzione 'confermaAbbandono()' con abbandono del bianco")
    public void testConfermaAbbandono_testBiancoAbbandono(){
        String data = "si";
        System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
        tur = new GestioneTurno();
        assertTrue(Input.confermaAbbandono(tur));
    }

    @Test
    @DisplayName(value="Test per la funzione 'confermaAbbandono()' senza abbandono del bianco")
    public void testConfermaAbbandono_testBiancoNonAbbandono(){
        String data = "no";
        System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
        tur = new GestioneTurno();
        assertFalse(Input.confermaAbbandono(tur));
    }

    @Test
    @DisplayName(value="Test per la funzione 'confermaAbbandono()' con abbandono del nero")
    public void testConfermaAbbandono_testNeroAbbandono(){
        String data = "si";
        System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
        tur = new GestioneTurno();
        tur.setTurno('n');
        assertTrue(Input.confermaAbbandono(tur));
    }

    @Test
    @DisplayName(value="Test per la funzione 'confermaAbbandono()' senza abbandono del nero")
    public void testConfermaAbbandono_testNeroNonAbbandono(){
        String data = "no";
        System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
        tur = new GestioneTurno();
        tur.setTurno('n');
        assertFalse(Input.confermaAbbandono(tur));
    }

    @Test
    @DisplayName(value="Test per la funzione 'getComando()' con l'inserimento del comando gioca")
    public void testGetComando()
    {
        String data = "gioca";
        System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
        assertEquals(Input.getComando(),"gioca");
    }

    @Test
    @DisplayName(value="Test per la funzione 'confermaChiusura()' con l'inserimento della risposta si")
    public void testConfermaChiusura_testSi(){
        String data = "si";
        System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
        assertTrue(Input.confermaChiusura());
    }

    @Test
    @DisplayName(value="Test per la funzione 'confermaChiusura()' con l'inserimento della risposta no")
    public void testConfermaChiusura_testNo(){
        String data = "no";
        System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
        assertFalse(Input.confermaChiusura());
    }

    @Test
    @DisplayName(value="Test per la funzione 'confermaChiusura()' con l'inserimento della risposta errata")
    public void testConfermaChiusura_testSbagliato(){
        String data = "ciao"+"\nno";
        System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
        assertFalse(Input.confermaChiusura());
    }

    @Test
    @DisplayName(value="Test per la funzione 'confermaAbbandono()' con l'inserimento della risposta errata del bianco")
    public void testConfermaAbbandono_testSbagliatoBianco(){
        String data = "ciao"+"\nno";
        System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
        tur = new GestioneTurno();
        assertFalse(Input.confermaAbbandono(tur));
    }

    @Test
    @DisplayName(value="Test per la funzione 'confermaAbbandono()' con l'inserimento della risposta errata del nero")
    public void testConfermaAbbandono_testSbagliatoNero(){
        String data = "ciao"+"\nno";
        System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
        tur = new GestioneTurno();
        tur.setTurno('n');
        assertFalse(Input.confermaAbbandono(tur));
    }

}
