package it.uniba.main.InputOutput;
import it.uniba.main.InputOutput.Grafica;
import it.uniba.main.Componenti.Damiera;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.Test;
import java.util.ArrayList;

@Tag("Grafica")
@DisplayName(value="Test per package InputOtput della classe Grafica")
public class GraficaTest {
    Damiera dam;
    ArrayList<String> mosseEffettuate;
    @Test
    @DisplayName(value="Test di 'mostraPrese()' con 0 prese effettuate")
    public void testMostraPrese_0Prese() {
        dam = new Damiera();
        Grafica.mostraPrese(dam);
    }

    @Test
    @DisplayName(value="Test di 'mostraPrese()' con 1 presa del bianco effettuata")
    public void testMostraPrese_1Prese() {
        dam = new Damiera();
        dam.getPezzo(0).setPresa();
        Grafica.mostraPrese(dam);
    }

    @Test
    @DisplayName(value="Test di 'mostraPrese()' con 1 presa del nero effettuata")
    public void testMostraPrese_2Prese() {
        dam = new Damiera();
        dam.getPezzo(13).setPresa();
        Grafica.mostraPrese(dam);
    }

    @Test
    @DisplayName(value="Test di 'mostraPrese()' con tutte le 12 pedine del nero prese")
    public void testMostraPrese_3Prese() {
        dam = new Damiera();
        int i=0;
        while(i<12)
        {
            dam.getPezzo(i).setPresa();
            i++;
        }
        Grafica.mostraPrese(dam);
    }

    @Test
    @DisplayName(value="Test di 'mostraPrese()' con tutte le 12 pedine del bianco prese")
    public void testMostraPrese_4Prese() {
        dam = new Damiera();
        int i=13;
        while(i<24)
        {
            dam.getPezzo(i).setPresa();
            i++;
        }
        Grafica.mostraPrese(dam);
    }

    @Test
    @DisplayName(value="Test di 'mostraPrese()' con una dama del nero presa")
    public void testMostraPrese_5PresaDama() {
        dam = new Damiera();

        dam.getPezzo(1).setPresa();
        dam.getPezzo(1).setTipo('d');
        Grafica.mostraPrese(dam);
    }

    @Test
    @DisplayName(value="Test di 'mostraPrese()' con una dama del bianco presa")
    public void testMostraPrese_6PresaDama() {
        dam = new Damiera();
        dam.getPezzo(23).setPresa();
        dam.getPezzo(23).setTipo('d');
        Grafica.mostraPrese(dam);
    }

    @Test
    @DisplayName(value="Test di 'stampaDamieraNum()'")
    public void testStampaDamieraNum() {
        dam = new Damiera();
        Grafica.stampaDamieraNum();
    }

    @Test
    @DisplayName(value="Test di 'mostraMosse()' con nessuna mossa effettuata")
    public void testMostraMosse_0Mosse() {
        mosseEffettuate = new ArrayList<>();
        Grafica.mostraMosse(mosseEffettuate);
    }

    @Test
    @DisplayName(value="Test di 'mostraMosse()' con 1 spostamento effettuato")
    public void testMostraMosse_1Mosse() {
        mosseEffettuate = new ArrayList<>();
        mosseEffettuate.add("21-17");
        Grafica.mostraMosse(mosseEffettuate);
    }

    @Test
    @DisplayName(value="Test di 'mostraMosse()' con 2 spostamenti effettuati")
    public void testMostraMosse_2Mosse() {
        mosseEffettuate = new ArrayList<>();
        mosseEffettuate.add("21-17");
        mosseEffettuate.add("9-13");
        Grafica.mostraMosse(mosseEffettuate);
    }
    @Test
    @DisplayName(value="Test di 'mostraMosse()' con 3 prese effettuate")
    public void testMostraMosse_3Mosse() {
        mosseEffettuate = new ArrayList<>();
        mosseEffettuate.add("21x14");
        mosseEffettuate.add("9x18");
        mosseEffettuate.add("24x15");
        Grafica.mostraMosse(mosseEffettuate);
    }
    @Test
    @DisplayName(value="Test di 'mostraMosse()' con 3 prese multiple effettuate")
    public void testMostraMosse_4Mosse() {
        mosseEffettuate = new ArrayList<>();
        mosseEffettuate.add("21x14x5");
        mosseEffettuate.add("9x18x27");
        mosseEffettuate.add("24x15x8");
        Grafica.mostraMosse(mosseEffettuate);
    }

    @Test
    @DisplayName(value="Test di 'stampaDamieraPezzi()' con 0 pezzi spostati")
    public void testStampaDamieraPezzi_0PezziSpostati() {
        dam = new Damiera();
        Grafica.stampaDamieraPezzi(dam);
    }

    @Test
    @DisplayName(value="Test di 'stampaDamieraPezzi()' con 1 pezzo nero spostato")
    public void testStampaDamieraPezzi_1PezziSpostati() {
        dam = new Damiera();
        dam.getPezzo(9).setPosizione(13);
        Grafica.stampaDamieraPezzi(dam);
    }

    @Test
    @DisplayName(value="Test di 'stampaDamieraPezzi()' con 4 dame")
    public void testStampaDamieraPezzi_4Dame() {
        dam = new Damiera();
        dam.getPezzo(8).setTipo('d');
        dam.getPezzo(12).setTipo('d');
        dam.getPezzo(4).setTipo('d');
        dam.getPezzo(16).setTipo('d');
        Grafica.stampaDamieraPezzi(dam);
    }

    @Test
    @DisplayName(value="Test di 'stampaDamieraPezzi()' con 3 pezzi spostati")
    public void testStampaDamieraPezzi_3PezziSpostati() {
        dam = new Damiera();
        dam.getPezzo(10).setPosizione(15);
        dam.getPezzo(13).setPosizione(19);
        dam.getPezzo(11).setPosizione(16);
        Grafica.stampaDamieraPezzi(dam);
    }

    @Test
    @DisplayName(value="Test di 'stampaDamieraPezzi()' con 4 pezzi spostati")
    public void testStampaDamieraPezzi_4PezziSpostati() {
        dam = new Damiera();
        dam.getPezzo(10).setPosizione(15);
        dam.getPezzo(12).setPosizione(17);
        dam.getPezzo(9).setPosizione(13);
        dam.getPezzo(14).setPosizione(20);
        Grafica.stampaDamieraPezzi(dam);
    }

    @Test
    @DisplayName(value="Test della funzione 'help()'")
    public void testHelp(){
        Grafica.help();
    }

    @Test
    @DisplayName(value="Test della funzione 'shorthelp()'")
    public void testShortHelp(){
        Grafica.shorthelp();
    }

    @Test
    @DisplayName(value="Test della funzione 'logo()'")
    public void testLogo(){
        Grafica.logo();
    }
}