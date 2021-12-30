package it.uniba.main.InputOutput;
import it.uniba.main.InputOutput.Messaggi;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.Test;

@Tag("Messaggi")
@DisplayName(value="Test per package InputOtput della classe Messaggi")
public class MessaggiTest {
    String str;
    String mossa;
    char tipo;
    int posN;

    @Test
    @DisplayName(value="Test per la funzione 'cambioTurno()' del bianco")
    public void testCambioTurno_turnoBianco() {
        char tur='b';
        Messaggi.cambioTurno(tur);

    }

    @Test
    @DisplayName(value="Test per la funzione 'cambioTurno()' del nero")
    public void testCambioTurno_turnoNero() {
        char tur='n';
        Messaggi.cambioTurno(tur);

    }

    @Test
    @DisplayName(value="Test per la funzione 'comandoErrato()' con comando errato 'gvoca'")
    public void testComandoErrato_0Comando() {
        str="gvoca";
        Messaggi.comandoErrato(str);
    }

    @Test
    @DisplayName(value="Test per la funzione 'comandoErrato()' con comando errato 'ehlp'")
    public void testComandoErrato_1Comando() {
        str="ehlp";
        Messaggi.comandoErrato(str);
    }

    @Test
    @DisplayName(value="Test per la funzione 'comandoErrato()' con comando errato 'dmiera'")
    public void testComandoErrato_2Comando() {
        str="dmiera";
        Messaggi.comandoErrato(str);
    }

    @Test
    @DisplayName(value="Test per la funzione 'casellaInesistente()' con la mossa '5x0'")
    public void testCasellaInesistente_0Casella() {
        mossa = "5x0";
        tipo = 'f';
        Messaggi.casellaInesistente(mossa, tipo);

    }

    @Test
    @DisplayName(value="Test per la funzione 'casellaInesistente'() con la mossa '28-33'")
    public void testCasellaInesistente_1Casella() {
        mossa = "28-33";
        tipo = 'f';
        Messaggi.casellaInesistente(mossa, tipo);

    }

    @Test
    @DisplayName(value="Test per la funzione 'posizioneOccupata()' con posizione 10 occupata")
    public void testPosizioneOccupata_0Posizione() {
        mossa = "5-10";
        Messaggi.posizioneOccupata(mossa);
    }

    @Test
    @DisplayName(value="Test per la funzione 'posizioneOccupata()' con posizione 27 occupata")
    public void testPosizioneOccupata_1Posizione() {
        mossa = "31-27";
        Messaggi.posizioneOccupata(mossa);
    }

    @Test
    @DisplayName(value="Test per la funzione 'posizioneOccupata()' con posizione 10 occupata")
    public void testPosizioneOccupata_2Posizione() {
        mossa = "6-10";
        Messaggi.posizioneOccupata(mossa);
    }

    @Test
    @DisplayName(value="Test per la funzione 'posIrrSpostamento()' con spostamento mediante la mossa '1-10'")
    public void testPosIrrSpostamento_0Spostamento() {
        mossa="1-10";
        Messaggi.posIrrSpostamento(mossa);
    }

    @Test
    @DisplayName(value="Test per la funzione 'posIrrSpostamento()' con spostamento mediante la mossa '29-21'")
    public void testPosIrrSpostamento_1Spostamento() {
        mossa="29-21";
        Messaggi.posIrrSpostamento(mossa);
    }

    @Test
    @DisplayName(value="Test per la funzione 'posIrrSpostamento()' con spostamento mediante la mossa '5-13'")
    public void testPosIrrSpostamento_2Spostamento() {
        mossa="5-13";
        Messaggi.posIrrSpostamento(mossa);
    }

    @Test
    @DisplayName(value="Test per la funzione 'PIrPrs_1Presa()' con presa mediante la mossa '1x10'")
    public void testPIrPrs_0Presa() {
        mossa="1x10";
        Messaggi.pIrPrs(mossa);
    }

    @Test
    @DisplayName(value="Test per la funzione 'PIrPrs_1Presa()' con presa mediante la mossa '18x27'")
    public void testPIrPrs_1Presa() {
        mossa="18x27";
        Messaggi.pIrPrs(mossa);
    }

    @Test
    @DisplayName(value="Test per la funzione 'PIrPrs_1Presa()' con presa mediante la mossa '6x15'")
    public void testPIrPrs_2Presa() {
        mossa="6x15";
        Messaggi.pIrPrs(mossa);
    }

    @Test
    @DisplayName(value="Test per la funzione 'pezzoAssente()' in posizione 13")
    public void testPezzoAssente_0Pezzo() {
        mossa="13-18";
        Messaggi.pezzoAssente(mossa);
    }

    @Test
    @DisplayName(value="Test per la funzione 'pezzoAssente()' in posizione 27")
    public void testPezzoAssente_1Pezzo() {
        mossa="27-22";
        Messaggi.pezzoAssente(mossa);
    }

    @Test
    @DisplayName(value="Test per la funzione 'pezzoAssente()' in posizione 12")
    public void testPezzoAssente_2Pezzo() {
        mossa="12-16";
        Messaggi.pezzoAssente(mossa);
    }

    @Test
    @DisplayName(value="Test per la funzione 'NoPzNemPerPresa()' con pezzo nemico assente in posizione 18")
    public void testNoPzNemPerPresa_0Presa() {
        posN=18;
        Messaggi.noPzNemPerPresa(posN);
    }

    @Test
    @DisplayName(value="Test per la funzione 'NoPzNemPerPresa()' con pezzo nemico assente in posizione 27")
    public void testNoPzNemPerPresa_1Presa() {
        posN=27;
        Messaggi.noPzNemPerPresa(posN);
    }

    @Test
    @DisplayName(value="Test per la funzione 'NoPzNemPerPresa()' con pezzo nemico assente in posizione 5")
    public void testNoPzNemPerPresa_2Presa() {
        posN=5;
        Messaggi.noPzNemPerPresa(posN);
    }

    @Test
    @DisplayName(value="Test per la funzione 'stampaVincitore()' bianco")
    public void testStampaVincitore_biancoVincitore() {
        tipo='b';
        Messaggi.stampaVincitore(tipo);
    }

    @Test
    @DisplayName(value="Test per la funzione 'stampaVincitore()' nero")
    public void testStampaVincitore_neroVincitore() {
        tipo='n';
        Messaggi.stampaVincitore(tipo);
    }

    @Test
    @DisplayName(value="Test per la funzione 'iniziaPartita()'")
    public void testInizioPartita() {
        Messaggi.inizioPartita();
    }

    @Test
    @DisplayName(value="Test per la funzione inizia 'partitaGiàIniziata()'")
    public void testPartitaGiaIniziata() {
        Messaggi.partitaGiaIniziata();
    }

    @Test
    @DisplayName(value="Test per la funzione 'partitaNonIniziata()'")
    public void testPartitaNonIniziata(){
        Messaggi.partitaNonIniziata();
    }

    @Test
    @DisplayName(value="Test per la funzione 'spostamentoEffettuato()'")
    public void testSpostamentoEffettuato(){
        Messaggi.spostamentoEffettuato();
    }

    @Test
    @DisplayName(value="Test per la funzione 'spostamentoNonEffettuato()'")
    public void testSpostamentoNonEffettuato(){
        Messaggi.spostamentoNonEffettuato();
    }

    @Test
    @DisplayName(value="Test per la funzione 'presaEffettuata()'")
    public void testPresaEffettuata(){
        Messaggi.presaEffettuata();
    }

    @Test
    @DisplayName(value="Test per la funzione 'damaturaEffettuata()'")
    public void testDamaturaEffettuata(){
        Messaggi.damaturaEffettuata();
    }

    @Test
    @DisplayName(value="Test per la funzione 'presaMultiplaEffettuata()'")
    public void testPresaMultiplaEffettuata(){
        Messaggi.presaMultiplaEffettuata();
    }

    @Test
    @DisplayName(value="Test per la funzione 'PrNonEff()'")
    public void testPrNonEff(){
        Messaggi.prNonEff();
    }

    @Test
    @DisplayName(value="Test per la funzione 'posizioniUguali()'")
    public void testPosizioniUguali(){
        Messaggi.posizioniUguali();
    }

    @Test
    @DisplayName(value="Test per la funzione 'ImpPrDama()'")
    public void testImpPrDama(){
        Messaggi.impPrDama();
    }

    @Test
    @DisplayName(value="Test per la funzione 'mosseAssenti()'")
    public void testMosseAssenti(){
        Messaggi.mosseAssenti();
    }
}
