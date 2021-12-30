package it.uniba.main;
import it.uniba.main.Componenti.Damiera;
import it.uniba.main.InputOutput.Grafica;
import it.uniba.main.InputOutput.Input;
import it.uniba.main.Partita.Controlli;
import it.uniba.main.Partita.GestionePartita;
import it.uniba.main.Partita.GestioneTurno;
import it.uniba.main.Partita.Mosse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.charset.Charset;
import java.util.ArrayList;

@Tag("AppMain")
public class AppMainTest {

	@Test
	@DisplayName("Stampa damiera con pedine in una partita non in corso.")
	public void testDamiera_partitaNonInCorso() {
		GestionePartita par = new GestionePartita();
		Damiera dam = new Damiera();
		AppMain.damiera(par, dam);
	}

	@Test
	@DisplayName("Stampa damiera con pedine.")
	public void testDamiera_partitaInCorso() {
		GestionePartita par = new GestionePartita();
		par.setPartitaInCorso(true);
		Damiera dam = new Damiera();
		AppMain.damiera(par, dam);
	}

	@Test
	@DisplayName("Esci gioco risposta si.")
	public void testEsci_rispostaSi() {
		String data = "si";
		System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
		assertTrue(AppMain.esci());
	}

	@Test
	@DisplayName("Esci gioco risposta no.")
	public void testEsci_rispostaNo() {
		String data = "no";
		System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
		assertFalse(AppMain.esci());
	}

	@Test
	@DisplayName("Stampa help")
	public void testHelp(){
		AppMain.help();
	}

	@Test
	@DisplayName("Stampa damiera numerata")
	public void testNumeri(){
		AppMain.numeri();
	}

	@Test
	@DisplayName("Stampa mosse")
	public void testMosse_partitaInCorso() {
		GestionePartita par = new GestionePartita();
		par.setPartitaInCorso(true);
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		mosseEffettuate.add("21-17");
		mosseEffettuate.add("9-13");
		AppMain.mosse(par, mosseEffettuate);
	}

	@Test
	@DisplayName("Stampa mosse partita non in corso")
	public void testMosse_partitaNonInCorso() {
		GestionePartita par = new GestionePartita();
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		AppMain.mosse(par, mosseEffettuate);
	}

	@Test
	@DisplayName("Stampa prese partita non in corso")
	public void testPrese_partitaNonInCorso() {
		GestionePartita par = new GestionePartita();
		Damiera dam = new Damiera();
		AppMain.prese(par, dam);
	}

	@Test
	@DisplayName("Stampa prese")
	public void testPrese_partitaInCorso() {
		GestionePartita par = new GestionePartita();
		par.setPartitaInCorso(true);
		Damiera dam = new Damiera();
		AppMain.prese(par, dam);
	}

	@Test
	@DisplayName("Abbandona partita non in corso.")
	public void testAbbandona_partitaNonInCorso() {
		GestionePartita par = new GestionePartita();
		GestioneTurno tur = new GestioneTurno();
		String data = "si";
		System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
		AppMain.abbandona(par, tur);
	}

	@Test
	@DisplayName("Abbandona partita con risposta si.")
	public void testAbbandona_rispostaSi() {
		GestionePartita par = new GestionePartita();
		par.setPartitaInCorso(true);
		GestioneTurno tur = new GestioneTurno();
		String data = "si";
		System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
		AppMain.abbandona(par, tur);
	}

	@Test
	@DisplayName("Abbandona partita con risposta no")
	public void testAbbandona_rispostaNo() {
		GestionePartita par = new GestionePartita();
		par.setPartitaInCorso(true);
		GestioneTurno tur = new GestioneTurno();
		String data = "no";
		System.setIn(new ByteArrayInputStream(data.getBytes(Charset.defaultCharset())));
		AppMain.abbandona(par, tur);
	}

	@Test
	@DisplayName("Richiesta tempo ma partita non in corso.")
	public void testTempo_partitaNonInCorso(){
		GestionePartita par = new GestionePartita();
		GestioneTurno tur = new GestioneTurno();
		AppMain.tempo(par, tur);
	}

	@Test
	@DisplayName("Richiesta tempo bianco.")
	public void testTempo_turnoBianco(){
		GestionePartita par = new GestionePartita();
		par.setPartitaInCorso(true);
		GestioneTurno tur = new GestioneTurno();
		tur.setTurno('b');
		AppMain.tempo(par, tur);
	}

	@Test
	@DisplayName("Richiesta tempo nero.")
	public void testTempo_turnoNero(){
		GestionePartita par = new GestionePartita();
		par.setPartitaInCorso(true);
		GestioneTurno tur = new GestioneTurno();
		tur.setTurno('n');
		AppMain.tempo(par, tur);
	}

	@Test
	@DisplayName("Spostamento semplice ma partita non in corso.")
	public void testSpostamentoSemplice_partitaNonInCorso() {
		GestionePartita par = new GestionePartita();
		Controlli contr = new Controlli();
		Damiera dam = new Damiera();
		GestioneTurno tur = new GestioneTurno();
		String mossa = "21-18";
		Mosse mos = new Mosse();
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		AppMain.spostamentoSemplice(par, contr, dam, tur, mossa, mos, mosseEffettuate);
	}

	@Test
	@DisplayName("Spostamento semplice 21-18 bianco.")
	public void testSpostamentoSemplice_mossaBianco() {
		GestionePartita par = new GestionePartita();
		par.setPartitaInCorso(true);
		Controlli contr = new Controlli();
		Damiera dam = new Damiera();
		GestioneTurno tur = new GestioneTurno();
		tur.setTurno('b');
		String mossa = "21-18";
		Mosse mos = new Mosse();
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		AppMain.spostamentoSemplice(par, contr, dam, tur, mossa, mos, mosseEffettuate);
	}

	@Test
	@DisplayName("Spostamento semplice 9-13 nero.")
	public void testSpostamentoSemplice_mossaNero() {
		GestionePartita par = new GestionePartita();
		par.setPartitaInCorso(true);
		Controlli contr = new Controlli();
		Damiera dam = new Damiera();
		GestioneTurno tur = new GestioneTurno();
		tur.setTurno('n');
		String mossa = "9-13";
		Mosse mos = new Mosse();
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		AppMain.spostamentoSemplice(par, contr, dam, tur, mossa, mos, mosseEffettuate);
	}

	@Test
	@DisplayName("Presa ma partita non in corso.")
	public void testSpostamentoPresa_partitaNonInCorso() {
		GestionePartita par = new GestionePartita();
		Controlli contr = new Controlli();
		Damiera dam = new Damiera();
		GestioneTurno tur = new GestioneTurno();
		String mossa = "18x9";
		Mosse mos = new Mosse();
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		AppMain.spostamentoPresa(par, contr, dam, tur, mossa, mos, mosseEffettuate);
	}

	@Test
	@DisplayName("Presa 18x9 bianco.")
	public void testSpostamentoPresa_mossaBianco() {
		GestionePartita par = new GestionePartita();
		par.setPartitaInCorso(true);
		Controlli contr = new Controlli();
		Damiera dam = new Damiera();
		GestioneTurno tur = new GestioneTurno();
		tur.setTurno('b');
		String mossa = "21-18";
		Mosse mos = new Mosse();
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		AppMain.spostamentoSemplice(par, contr, dam, tur, mossa, mos, mosseEffettuate);
		mossa = "9-13";
		tur.setTurno('n');
		AppMain.spostamentoSemplice(par, contr, dam, tur, mossa, mos, mosseEffettuate);
		mossa = "18x9";
		tur.setTurno('b');
		AppMain.spostamentoPresa(par, contr, dam, tur, mossa, mos, mosseEffettuate);
	}

	@Test
	@DisplayName("Presa 13x21 nero.")
	public void testSpostamentoPresa_mossaNero() {
		GestionePartita par = new GestionePartita();
		par.setPartitaInCorso(true);
		Controlli contr = new Controlli();
		Damiera dam = new Damiera();
		GestioneTurno tur = new GestioneTurno();
		tur.setTurno('n');
		String mossa = "9-13";
		Mosse mos = new Mosse();
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		AppMain.spostamentoSemplice(par, contr, dam, tur, mossa, mos, mosseEffettuate);
		mossa = "21-18";
		tur.setTurno('b');
		AppMain.spostamentoSemplice(par, contr, dam, tur, mossa, mos, mosseEffettuate);
		mossa = "13x21";
		tur.setTurno('n');
		AppMain.spostamentoPresa(par, contr, dam, tur, mossa, mos, mosseEffettuate);
	}

	@Test
	@DisplayName("Presa multipla ma partita non in corso.")
	public void testPresaMultipla1_partitaNonInCorso() {
		GestionePartita par = new GestionePartita();
		Controlli contr = new Controlli();
		Damiera dam = new Damiera();
		GestioneTurno tur = new GestioneTurno();
		String mossa = "18x9x2";
		Mosse mos = new Mosse();
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		AppMain.presaMultipla1(par, contr, dam, tur, mossa, mos, mosseEffettuate);
	}

	@Test
	@DisplayName("Presa multipla 23x14x5 colore bianco.")
	public void testPresaMultipla1_presaMultiplaBianco() {
		GestionePartita par = new GestionePartita();
		GestioneTurno tur = new GestioneTurno();
		par.setPartitaInCorso(true);
		Damiera dam = new Damiera();
		Mosse mos = new Mosse();
		Controlli contr = new Controlli();
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		AppMain.spostamentoSemplice(par, contr, dam, tur, "21-18", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "9-13", mos, mosseEffettuate);
		AppMain.spostamentoPresa(par, contr, dam, tur, "18x9", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "10-14", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "25-21", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "5-10", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "21-17", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "14-19", mos, mosseEffettuate);
		AppMain.presaMultipla1(par, contr, dam, tur, "23x14x5", mos, mosseEffettuate);
		assertTrue(dam.getPezzo(14).getPosizione()==5
				&& dam.getPezzo(14).getColore()=='b');
	}

	@Test
	@DisplayName("Presa multipla 10x19x26 colore nero.")
	public void testPresaMultipla1_presaMultiplaNero() {
		GestionePartita par = new GestionePartita();
		GestioneTurno tur = new GestioneTurno();
		par.setPartitaInCorso(true);
		Damiera dam = new Damiera();
		Mosse mos = new Mosse();
		Controlli contr = new Controlli();
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		AppMain.spostamentoSemplice(par, contr, dam, tur, "21-18", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "11-15", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "18-14", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "12-16", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "26-21", mos, mosseEffettuate);
		AppMain.presaMultipla1(par, contr, dam, tur, "10x19x26", mos, mosseEffettuate);
		assertTrue(dam.getPezzo(9).getPosizione()==26
				&& dam.getPezzo(9).getColore()=='n');
	}

	@Test
	@DisplayName("Presa multipla ma partita non in corso.")
	public void testPresaMultipla2_partitaNonInCorso() {
		GestionePartita par = new GestionePartita();
		Controlli contr = new Controlli();
		Damiera dam = new Damiera();
		GestioneTurno tur = new GestioneTurno();
		String mossa = "25x18x9x2";
		Mosse mos = new Mosse();
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		AppMain.presaMultipla2(par, contr, dam, tur, mossa, mos, mosseEffettuate);
	}

	@Test
	@DisplayName("Presa multipla 26x17x10x1 colore bianco.")
	public void testPresaMultipla2_presaMultiplaBianco() {
		GestionePartita par = new GestionePartita();
		GestioneTurno tur = new GestioneTurno();
		par.setPartitaInCorso(true);
		Damiera dam = new Damiera();
		Mosse mos = new Mosse();
		Controlli contr = new Controlli();
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		AppMain.spostamentoSemplice(par, contr, dam, tur, "21-17", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "10-13", mos, mosseEffettuate);
		AppMain.spostamentoPresa(par, contr, dam, tur, "17x10", mos, mosseEffettuate);
		AppMain.spostamentoPresa(par, contr, dam, tur, "5x14", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "24-20", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "1-5", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "23-19", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "9-13", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "20-16", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "11-15", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "28-24", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "14-18", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "32-28", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "18-21", mos, mosseEffettuate);
		AppMain.presaMultipla2(par, contr, dam, tur, "26x17x10x1", mos, mosseEffettuate);
		assertTrue(dam.getPezzo(17).getPosizione()==1
				&& dam.getPezzo(17).getColore()=='b');
	}

	@Test
	@DisplayName("Presa multipla 2x11x18x27 colore nero.")
	public void testPresaMultipla2_presaMultiplaNero() {
		GestionePartita par = new GestionePartita();
		GestioneTurno tur = new GestioneTurno();
		par.setPartitaInCorso(true);
		Damiera dam = new Damiera();
		Mosse mos = new Mosse();
		Controlli contr = new Controlli();
		ArrayList<String> mosseEffettuate;
		mosseEffettuate = new ArrayList<>();
		AppMain.spostamentoSemplice(par, contr, dam, tur, "23-20", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "11-15", mos, mosseEffettuate);
		AppMain.spostamentoPresa(par, contr, dam, tur, "20x11", mos, mosseEffettuate);
		AppMain.spostamentoPresa(par, contr, dam, tur, "6x15", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "22-18", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "12-16", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "27-22", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "8-12", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "18-14", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "4-8", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "21-17", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "10-13", mos, mosseEffettuate);
		AppMain.spostamentoPresa(par, contr, dam, tur, "17x10", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "16-20", mos, mosseEffettuate);
		AppMain.spostamentoSemplice(par, contr, dam, tur, "10-6", mos, mosseEffettuate);
		AppMain.presaMultipla2(par, contr, dam, tur, "2x11x18x27", mos, mosseEffettuate);
		assertTrue(dam.getPezzo(1).getPosizione()==27
				&& dam.getPezzo(1).getColore()=='n');
	}
}

