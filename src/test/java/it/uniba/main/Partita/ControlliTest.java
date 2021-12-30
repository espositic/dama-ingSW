package it.uniba.main.Partita;
import it.uniba.main.Componenti.Damiera;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ControlliTest {

    //isMossa************************************************************************************************************

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]-[1 cifra]")
    public void testIsMossa1() {
        assertEquals("spostamentoSemplice", Controlli.isMossa("0-0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]-[1 cifra]")
    public void testIsMossa2() {
        assertEquals("spostamentoSemplice", Controlli.isMossa("00-0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]-[2 cifre]")
    public void testIsMossa3() {
        assertEquals("spostamentoSemplice", Controlli.isMossa("0-00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]-[2 cifre]")
    public void testIsMossa4() {
        assertEquals("spostamentoSemplice", Controlli.isMossa("00-00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[1 cifra]")
    public void testIsMossa5() {
        assertEquals("spostamentoPresa", Controlli.isMossa("0x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]x[1 cifra]")
    public void testIsMossa6() {
        assertEquals("spostamentoPresa", Controlli.isMossa("00x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[2 cifre]")
    public void testIsMossa7() {
        assertEquals("spostamentoPresa", Controlli.isMossa("0x00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]x[2 cifre]")
    public void testIsMossa8() {
        assertEquals("spostamentoPresa", Controlli.isMossa("00x00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[1 cifra]x[1 cifra]")
    public void testIsMossa9() {
        assertEquals("presaMultipla1", Controlli.isMossa("0x0x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[1 cifra]x[2 cifre]")
    public void testIsMossa10() {
        assertEquals("presaMultipla1", Controlli.isMossa("0x0x00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[2 cifre]x[1 cifra]")
    public void testIsMossa11() {
        assertEquals("presaMultipla1", Controlli.isMossa("0x00x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[2 cifre]x[2 cifre]")
    public void testIsMossa12() {
        assertEquals("presaMultipla1", Controlli.isMossa("0x00x00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]x[1 cifra]x[1 cifra]")
    public void testIsMossa13() {
        assertEquals("presaMultipla1", Controlli.isMossa("00x0x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]x[1 cifra]x[2 cifre]")
    public void testIsMossa14() {
        assertEquals("presaMultipla1", Controlli.isMossa("00x0x00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]x[2 cifre]x[1 cifra]")
    public void testIsMossa15() {
        assertEquals("presaMultipla1", Controlli.isMossa("00x00x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]x[2 cifre]x[2 cifre]")
    public void testIsMossa16() {
        assertEquals("presaMultipla1", Controlli.isMossa("00x00x00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[1 cifra]x[1 cifra]x[1 cifra]")
    public void testIsMossa17() {
        assertEquals("presaMultipla2", Controlli.isMossa("0x0x0x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[1 cifra]x[1 cifra]x[2 cifre]")
    public void testIsMossa18() {
        assertEquals("presaMultipla2", Controlli.isMossa("0x0x0x00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[1 cifra]x[2 cifre]x[1 cifra]")
    public void testIsMossa19() {
        assertEquals("presaMultipla2", Controlli.isMossa("0x0x00x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[1 cifra]x[2 cifre]x[2 cifre]")
    public void testIsMossa20() {
        assertEquals("presaMultipla2", Controlli.isMossa("0x0x00x00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[2 cifre]x[1 cifra]x[1 cifra]")
    public void testIsMossa21() {
        assertEquals("presaMultipla2", Controlli.isMossa("0x00x0x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[2 cifre]x[1 cifra]x[2 cifre]")
    public void testIsMossa22() {
        assertEquals("presaMultipla2", Controlli.isMossa("0x00x0x00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[2 cifre]x[2 cifre]x[1 cifra]")
    public void testIsMossa23() {
        assertEquals("presaMultipla2", Controlli.isMossa("0x00x00x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [1 cifra]x[2 cifre]x[2 cifre]x[2 cifre]")
    public void testIsMossa24() {
        assertEquals("presaMultipla2", Controlli.isMossa("0x00x00x00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]x[1 cifra]x[1 cifra]x[1 cifra]")
    public void testIsMossa25() {
        assertEquals("presaMultipla2", Controlli.isMossa("00x0x0x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifra]x[1 cifra]x[1 cifra]x[2 cifre]")
    public void testIsMossa26() {
        assertEquals("presaMultipla2", Controlli.isMossa("00x0x0x00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]x[1 cifra]x[2 cifre]x[1 cifra]")
    public void testIsMossa27() {
        assertEquals("presaMultipla2", Controlli.isMossa("00x0x00x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]x[1 cifra]x[2 cifre]x[2 cifre]")
    public void testIsMossa28() {
        assertEquals("presaMultipla2", Controlli.isMossa("00x0x00x00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]x[2 cifre]x[1 cifra]x[1 cifra]")
    public void testIsMossa29() {
        assertEquals("presaMultipla2", Controlli.isMossa("00x00x0x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]x[2 cifre]x[1 cifra]x[2 cifre]")
    public void testIsMossa30() {
        assertEquals("presaMultipla2", Controlli.isMossa("00x00x0x00"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]x[2 cifre]x[2 cifre]x[1 cifra]")
    public void testIsMossa31() {
        assertEquals("presaMultipla2", Controlli.isMossa("00x00x00x0"));
    }

    @Test
    @DisplayName("testMossa: testa l'inserimento di [2 cifre]x[2 cifre]x[2 cifre]x[2 cifre]")
    public void testIsMossa32() {
        assertEquals("presaMultipla2", Controlli.isMossa("00x00x00x00"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa l'inserimento di una posizione iniziale inesistente")
    public void testControllaMossaSpostamento() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaSpostamento(new Damiera(), new GestioneTurno(), "0-1"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa l'inserimento di una posizione finale inesistente")
    public void testControllaMossaSpostamento2() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaSpostamento(new Damiera(), new GestioneTurno(), "32-33"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa l'inserimento di una posizione finale uguale a quella iniziale")
    public void testCrollaMossaSpostamento3() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaSpostamento(new Damiera(), new GestioneTurno(), "21-21"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa l'inserimento di una posizione iniziale in cui non è presente nessun pezzo")
    public void testControllaMossaSpostamento4() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaSpostamento(new Damiera(), new GestioneTurno(), "13-17"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa l'inserimento di una posizione iniziale in cui non è presente un pezzo proprio")
    public void testControllaMossaSpostamento5() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaSpostamento(new Damiera(), new GestioneTurno(), "9-13"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa il tentativo di spostamento di una pedina bianca nel senso opposto a quello consentito")
    public void testControllaMossaSpostamento6() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaSpostamento(new Damiera(), new GestioneTurno(), "21-25"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa il tentativo di spostamento di una pedina nera nel senso opposto a quello consentito")
    public void testControllaMossaSpostamento7() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        assertFalse(contr.controllaMossaSpostamento(new Damiera(), tur, "12-8"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa l'inserimento di una posizione finale in cui non è consentito lo spostamento della pedina bianca")
    public void testControllaMossaSpostamento8() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaSpostamento(new Damiera(), new GestioneTurno(), "21-14"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa l'inserimento di una posizione finale in cui non è consentito lo spostamento della pedina nera")
    public void testControllaMossaSpostamento9() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        assertFalse(contr.controllaMossaSpostamento(new Damiera(), tur, "12-19"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa l'inserimento di una posizione finale in cui non è consentito lo spostamento della dama bianca")
    public void testControllaMossaSpostamento10() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(12).setTipo('d');
        assertFalse(contr.controllaMossaSpostamento(new Damiera(), new GestioneTurno(), "21-14"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa l'inserimento di una posizione finale in cui non è consentito lo spostamento della dama nera")
    public void testControllaMossaSpostamento11() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        Damiera dam = new Damiera();
        dam.getPezzo(11).setTipo('d');
        assertFalse(contr.controllaMossaSpostamento(dam, tur, "12-19"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa l'inserimento di una posizione finale occupata da parte del bianco con la pedina")
    public void testControllaMossaSpostamento12() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(13).setPosizione(18);
        assertFalse(contr.controllaMossaSpostamento(dam, new GestioneTurno(), "21-18"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa l'inserimento di una posizione finale occupata da parte del nero con la pedina")
    public void testControllaMossaSpostamento13() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        Damiera dam = new Damiera();
        dam.getPezzo(10).setPosizione(15);
        assertFalse(contr.controllaMossaSpostamento(dam, tur, "12-15"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa l'inserimento di una posizione finale occupata da parte del bianco con la dama")
    public void testControllaMossaSpostamento14() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(12).setTipo('d');
        dam.getPezzo(13).setPosizione(18);
        assertFalse(contr.controllaMossaSpostamento(dam, new GestioneTurno(), "21-18"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa l'inserimento di una posizione finale occupata da parte del nero con la dama")
    public void testControllaMossaSpostamento15() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        Damiera dam = new Damiera();
        dam.getPezzo(11).setTipo('d');
        assertFalse(contr.controllaMossaSpostamento(dam, tur, "12-19"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa lo spostamento corretto del bianco")
    public void testControllaMossaSpostamento16() {
        Controlli contr = new Controlli();
        assertTrue(contr.controllaMossaSpostamento(new Damiera(), new GestioneTurno(), "22-18"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa lo spostamento corretto del nero")
    public void testControllaMossaSpostamento17() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        assertTrue(contr.controllaMossaSpostamento(new Damiera(), tur, "9-13"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa lo spostamento corretto della dama bianca")
    public void testControllaMossaSpostamento18() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(13).setTipo('d');
        assertTrue(contr.controllaMossaSpostamento(new Damiera(), new GestioneTurno(), "22-18"));
    }

    @Test
    @DisplayName("testControllaMossaSpostamento: testa lo spostamento corretto della dama nera")
    public void testControllaMossaSpostamento19() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(8).setTipo('d');
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        assertTrue(contr.controllaMossaSpostamento(dam, tur, "9-13"));
    }

    @Test
    @DisplayName("testControllaSpostamento: testa lo spostamento da una casella laterale sinistra")
    public void testControllaSpostamento() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        assertTrue(contr.controllaSpostamento(9, 13));
    }

    @Test
    @DisplayName("testControllaSpostamento: testa lo spostamento ad una casella laterale sinistra")
    public void testControllaSpostamento2() {
        Controlli contr = new Controlli();
        assertTrue(contr.controllaSpostamento(17, 21));
    }

    @Test
    @DisplayName("testControllaSpostamento: testa lo spostamento ad una casella centrale")
    public void testControllaSpostamento3() {
        Controlli contr = new Controlli();
        assertTrue(contr.controllaSpostamento(19, 22));
    }

    @Test
    @DisplayName("testControllaSpostamento: testa lo spostamento da una casella centrale")
    public void testControllaSpostamento4() {
        Controlli contr = new Controlli();
        assertTrue(contr.controllaSpostamento(13, 18));
    }

    @Test
    @DisplayName("testControllaSpostamento: testa lo spostamento da una casella laterale destra")
    public void testControllaSpostamento5() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(11).setPosizione(20);
        assertTrue(contr.controllaSpostamento(8, 12));
    }

    @Test
    @DisplayName("testControllaSpostamento: testa lo spostamento ad una casella laterale destra")
    public void testControllaSpostamento6() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        assertTrue(contr.controllaSpostamento(12, 16));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa l'inserimento di una posizione iniziale inesistente")
    public void testControllaMossaPresaSemplice() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), new GestioneTurno(), "0x5"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa l'inserimento di una posizione finale inesistente")
    public void testControllaMossaPresaSemplice2() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), new GestioneTurno(), "28x33"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa l'inserimento di una posizione finale uguale a quella iniziale")
    public void testControllaMossaPresaSemplice3() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), new GestioneTurno(), "21x21"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa l'inserimento di una posizione iniziale in cui non è presente nessun pezzo")
    public void testControllaMossaPresaSemplice4() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), new GestioneTurno(), "13x22"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa l'inserimento di una posizione iniziale in cui non è presente un pezzo proprio")
    public void testControllaMossaPresaSemplice5() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), new GestioneTurno(), "9x18"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa il tentativo di presa di una pedina bianca nel senso opposto a quello consentito")
    public void testControllaMossaPresaSemplice6() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), new GestioneTurno(), "21x30"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa il tentativo di presa senza nessun pezzo avversario da prendere")
    public void testControllaMossaPresaSemplice7() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), new GestioneTurno(), "21x14"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa il tentativo di presa di un pezzo proprio")
    public void testControllaMossaPresaSemplice8() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(16).setPosizione(18);
        assertFalse(contr.controllaMossaPresaSemplice(dam, new GestioneTurno(), "21x14"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa il tentativo di presa di una pedina nera nel senso opposto a quello consentito")
    public void testControllaMossaPresaSemplice9() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), tur, "12x3"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa l'inserimento di una posizione finale in cui non è consentito lo spostamento della pedina bianca")
    public void testControllaMossaPresaSemplice10() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), new GestioneTurno(), "21x18"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa l'inserimento di una posizione finale in cui non è consentito lo spostamento della pedina nera")
    public void testControllaMossaPresaSemplice11() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), tur, "11x14"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa l'inserimento di una posizione finale in cui non è consentito lo spostamento della dama")
    public void testControllaMossaPresaSemplice12() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(12).setTipo('d');
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), new GestioneTurno(), "21x18"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa l'inserimento di una posizione finale in cui non è consentito lo spostamento della dama nera")
    public void testControllaMossaPresaSemplice13() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        Damiera dam = new Damiera();
        dam.getPezzo(11).setTipo('d');
        assertFalse(contr.controllaMossaPresaSemplice(dam, tur, "12x15"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa l'inserimento di una posizione finale occupata da parte del bianco con la pedina")
    public void testControllaMossaPresaSemplice14() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), new GestioneTurno(), "21x18"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa l'inserimento di una posizione finale occupata da parte del nero con la pedina")
    public void testControllaMossaPresaSemplice15() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), tur, "12x15"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa l'inserimento di una posizione finale occupata da parte del bianco con la dama")
    public void testControllaMossaPresaSemplice16() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(12).setTipo('d');
        assertFalse(contr.controllaMossaPresaSemplice(new Damiera(), new GestioneTurno(), "21x18"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa l'inserimento di una posizione finale occupata da parte del nero con la dama")
    public void testControllaMossaPresaSemplice17() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        Damiera dam = new Damiera();
        dam.getPezzo(11).setTipo('d');
        assertFalse(contr.controllaMossaPresaSemplice(dam, tur, "12x15"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa la presa semplice corretta del bianco")
    public void testControllaMossaPresaSemplice18() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(14).setColore('n');
        assertTrue(contr.controllaMossaPresaSemplice(dam, new GestioneTurno(), "27x20"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa la presa semplice corretta della nero")
    public void testControllaMossaPresaSemplice19() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(11).setColore('b');
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        assertTrue(contr.controllaMossaPresaSemplice(dam, tur, "8x15"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa la presa semplice corretta e crescente della dama ")
    public void testControllaMossaPresaSemplice20() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        Damiera dam = new Damiera();
        dam.getPezzo(10).setColore('b');
        dam.getPezzo(5).setTipo('d');
        assertTrue(contr.controllaMossaPresaSemplice(dam, tur, "6x15"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa la presa semplice corretta e decrescente della dama ")
    public void testControllaMossaPresaSemplice21() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(14).setColore('n');
        dam.getPezzo(18).setTipo('d');
        assertTrue(contr.controllaMossaPresaSemplice(dam, new GestioneTurno(), "27x20"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa il tentativo di presa da parte della pedina bianca sulla dama")
    public void testControllaMossaPresaSemplice22() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(14).setColore('n');
        dam.getPezzo(14).setTipo('d');
        assertFalse(contr.controllaMossaPresaSemplice(dam, new GestioneTurno(), "27x20"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa il tentativo di presa da parte della pedina bianca all'indietro")
    public void testControllaMossaPresaSemplice23() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(21).setPosizione(17);
        dam.getPezzo(17).setColore('n');
        assertFalse(contr.controllaMossaPresaSemplice(dam, new GestioneTurno(), "21x30"));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa il tentativo di presa da parte della pedina nera all'indietro")
    public void testControllaMossaPresaSemplice24() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        dam.getPezzo(0).setPosizione(13);
        dam.getPezzo(4).setColore('b');
        assertFalse(contr.controllaMossaPresaSemplice(dam, tur, "10x1"));
    }

    @Test
    @DisplayName("testCtrlPresaSemplice: testa una presa accettata dal primo if")
    public void testCtrlPresaSemplice() {
        Controlli contr = new Controlli();
        assertTrue(contr.ctrlPrsSemplice(10, 1));
    }

    @Test
    @DisplayName("testCtrlPresaSemplice: testa una presa non accettata dal primo if")
    public void testCtrlPresaSemplice2() {
        Controlli contr = new Controlli();
        assertFalse(contr.ctrlPrsSemplice(4, 13));
    }

    @Test
    @DisplayName("testCtrlPresaSemplice: testa una presa accettata dal secondo if")
    public void testCtrlPresaSemplice3() {
        Controlli contr = new Controlli();
        assertTrue(contr.ctrlPrsSemplice(12, 19));
    }

    @Test
    @DisplayName("testCtrlPresaSemplice: testa una presa accettata dal terzo if")
    public void testCtrlPresaSemplice4() {
        Controlli contr = new Controlli();
        assertTrue(contr.ctrlPrsSemplice(22, 15));
    }

    @Test
    @DisplayName("testCtrlPresaSemplice: testa una presa accettata dal quarto if")
    public void testCtrlPresaSemplice5() {
        Controlli contr = new Controlli();
        assertTrue(contr.ctrlPrsSemplice(13, 22));
    }

    @Test
    @DisplayName("testControllaMossaPresaMultipla1: testa l'inserimento di una mossa multipla doppia valida")
    public void testControllaMossaPresaMultipla1() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(6).setPosizione(18);
        assertTrue(contr.controllaMossaPresaMultipla1(dam, new GestioneTurno(), "21x14x7"));
    }

    @Test
    @DisplayName("testControllaMossaPresaMultipla1: testa l'inserimento di una mossa multipla doppia valida con la dama")
    public void testControllaMossaPresaMultipla1_2() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(6).setPosizione(18);
        dam.getPezzo(12).setTipo('d');
        assertTrue(contr.controllaMossaPresaMultipla1(dam, new GestioneTurno(), "21x14x7"));
    }

    @Test
    @DisplayName("testControllaMossaPresaMultipla1: testa l'inserimento di una mossa multipla doppia non valida")
    public void testControllaMossaPresaMultipla1_3() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(11).setPosizione(18);
        assertFalse(contr.controllaMossaPresaMultipla1(dam, new GestioneTurno(), "21x14x7"));
    }

    @Test
    @DisplayName("testControllaMossaPresaMultipla1: testa l'inserimento di una mossa multipla doppia non valida con la dama")
    public void testControllaMossaPresaMultipla1_4() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(6).setPosizione(18);
        dam.getPezzo(12).setPosizione(17);
        assertFalse(contr.controllaMossaPresaMultipla1(dam, new GestioneTurno(), "21x14x7"));
    }

    @Test
    @DisplayName("testControllaMossaPresaMultipla2: testa l'inserimento di una mossa multipla tripla valida")
    public void testControllaMossaPresaMultipla2() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(12).setColore('n');
        dam.getPezzo(10).setPosizione(14);
        dam.getPezzo(3).setPosizione(20);
        assertTrue(contr.controllaMossaPresaMultipla2(dam, new GestioneTurno(), "25x18x11x4"));
    }

    @Test
    @DisplayName("testControllaMossaPresaMultipla1: testa l'inserimento di una mossa multipla tripla valida con la dama")
    public void testControllaMossaPresaMultipla2_2() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(12).setColore('n');
        dam.getPezzo(10).setPosizione(14);
        dam.getPezzo(3).setPosizione(20);
        dam.getPezzo(16).setTipo('d');
        assertTrue(contr.controllaMossaPresaMultipla2(dam, new GestioneTurno(), "25x18x11x4"));
    }

    @Test
    @DisplayName("testControllaMossaPresaMultipla2: testa l'inserimento di una mossa multipla tripla non valida")
    public void testControllaMossaPresaMultipla2_3() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(16).setPosizione(17);
        dam.getPezzo(12).setColore('n');
        dam.getPezzo(10).setPosizione(14);
        dam.getPezzo(3).setPosizione(20);
        assertFalse(contr.controllaMossaPresaMultipla2(dam, new GestioneTurno(), "25x18x11x4"));
    }

    @Test
    @DisplayName("testControllaMossaPresaMultipla2: testa l'inserimento di una mossa multipla tripla non valida con la dama")
    public void testControllaMossaPresaMultipla2_4() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(16).setTipo('d');
        assertFalse(contr.controllaMossaPresaMultipla2(dam, new GestioneTurno(), "25x18x11x4"));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa l'inserimento di una posizione iniziale inesistente")
    public void testControllaMossaPresa() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresa(new Damiera(), new GestioneTurno(), "0x5", 'n', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa l'inserimento di una posizione finale inesistente")
    public void testControllaMossaPresa2() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresa(new Damiera(), new GestioneTurno(), "28x33", 'b', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa l'inserimento di una posizione finale uguale a quella iniziale")
    public void testControllaMossaPresa3() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresa(new Damiera(), new GestioneTurno(), "21x21", 'b', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa l'inserimento di una posizione iniziale in cui non è presente nessun pezzo")
    public void testControllaMossaPresa4() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresa(new Damiera(), new GestioneTurno(), "13x22", 'n', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa l'inserimento di una posizione iniziale in cui non è presente un pezzo proprio")
    public void testControllaMossaPresa5() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresa(new Damiera(), new GestioneTurno(), "9x18", 'n', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa il tentativo di presa di una pedina bianca nel senso opposto a quello consentito")
    public void testControllaMossaPresa6() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresa(new Damiera(), new GestioneTurno(), "21x30", 'b', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa il tentativo di presa senza nessun pezzo avversario da prendere")
    public void testControllaMossaPresa7() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresa(new Damiera(), new GestioneTurno(), "21x14", 'b', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa il tentativo di presa di un pezzo proprio")
    public void testControllaMossaPresa8() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(16).setPosizione(18);
        assertFalse(contr.controllaMossaPresa(dam, new GestioneTurno(), "21x14", 'b', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa il tentativo di presa di una pedina nera nel senso opposto a quello consentito")
    public void testControllaMossaPresa9() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        assertFalse(contr.controllaMossaPresa(new Damiera(), tur, "12x3", 'n', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa l'inserimento di una posizione finale in cui non è consentito lo spostamento della pedina bianca")
    public void testControllaMossaPresa10() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresa(new Damiera(), new GestioneTurno(), "21x18", 'b', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa l'inserimento di una posizione finale in cui non è consentito lo spostamento della pedina nera")
    public void testControllaMossaPresa11() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        assertFalse(contr.controllaMossaPresa(new Damiera(), tur, "11x14", 'n', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa l'inserimento di una posizione finale in cui non è consentito lo spostamento della dama")
    public void testControllaMossaPresa12() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(12).setTipo('d');
        assertFalse(contr.controllaMossaPresa(new Damiera(), new GestioneTurno(), "21x18", 'b', true));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa l'inserimento di una posizione finale in cui non è consentito lo spostamento della dama nera")
    public void testControllaMossaPresa13() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        Damiera dam = new Damiera();
        dam.getPezzo(11).setTipo('d');
        assertFalse(contr.controllaMossaPresa(dam, tur, "12x15", 'n', true));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa l'inserimento di una posizione finale occupata da parte del bianco con la pedina")
    public void testControllaMossaPresa14() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresa(new Damiera(), new GestioneTurno(), "21x18", 'b', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa l'inserimento di una posizione finale occupata da parte del nero con la pedina")
    public void testControllaMossaPresa15() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        assertFalse(contr.controllaMossaPresa(new Damiera(), tur, "12x15", 'n', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa l'inserimento di una posizione finale occupata da parte del bianco con la dama")
    public void testControllaMossaPresa16() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(12).setTipo('d');
        assertFalse(contr.controllaMossaPresa(new Damiera(), new GestioneTurno(), "21x18", 'b', true));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa l'inserimento di una posizione finale occupata da parte del nero con la dama")
    public void testControllaMossaPresa17() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        Damiera dam = new Damiera();
        dam.getPezzo(11).setTipo('d');
        assertFalse(contr.controllaMossaPresa(dam, tur, "12x15", 'n', true));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa la presa corretta del nero")
    public void testControllaMossaPresa18() {
        Controlli contr = new Controlli();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        Damiera dam = new Damiera();
        dam.getPezzo(13).setPosizione(19);
        assertTrue(contr.controllaMossaPresa(dam, tur, "15x22", 'n', false));
    }


    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa il tentativo di presa da parte della pedina bianca all'indietro")
    public void testControllaMossaPresa19() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        GestioneTurno tur = new GestioneTurno();
        dam.getPezzo(17).setPosizione(18);
        dam.getPezzo(12).setColore('n');
        assertFalse(contr.controllaMossaPresa(dam, tur, "17x26", 'b', false));
    }

    @Test
    @DisplayName("testControllaMossaPresaSemplice: testa il tentativo di presa da parte della pedina nera all'indietro")
    public void testControllaMossaPresa20() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        GestioneTurno tur = new GestioneTurno();
        tur.setTurno('n');
        dam.getPezzo(4).setPosizione(13);
        dam.getPezzo(9).setColore('b');
        assertFalse(contr.controllaMossaPresa(dam, tur, "14x5", 'n', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa il tentativo di presa con spostamento non obliquo")
    public void testControllaMossaPresa21() {
        Controlli contr = new Controlli();
        assertFalse(contr.controllaMossaPresa(new Damiera(), new GestioneTurno(), "19x20", 'b', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa il tentativo di presa senza un pezzo avversario da prendere")
    public void testControllaMossaPresa22() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(11).setPosizione(16);
        assertFalse(contr.controllaMossaPresa(dam, new GestioneTurno(), "19x12", 'b', false));
    }

    @Test
    @DisplayName("testControllaMossaPresa: testa il tentativo di presa su un pezzo proprio")
    public void testControllaMossaPresa23() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(17).setPosizione(17);
        assertFalse(contr.controllaMossaPresa(dam, new GestioneTurno(), "26x19", 'b', false));
    }

    @Test
    @DisplayName("testControllaDama: testa il tentativo di damatura del bianco")
    public void testControllaDama() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(3).setColore('b');
        contr.controllaDama(dam, 4);
        assertEquals(dam.getPezzo(3).getTipo(), 'd');
    }

    @Test
    @DisplayName("testControllaDama: testa il tentativo di damatura del nero")
    public void testControllaDama2() {
        Controlli contr = new Controlli();
        Damiera dam = new Damiera();
        dam.getPezzo(21).setColore('n');
        contr.controllaDama(dam, 30);
        assertEquals(dam.getPezzo(21).getTipo(), 'd');
    }
}
