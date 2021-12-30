package it.uniba.main.Partita;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertTrue;
import it.uniba.main.Componenti.Damiera;

@Tag("Mosse")
public class MosseTest {

	Damiera dam;
	Mosse mos;
	Controlli contr;

	@Test
	@DisplayName("Spostamento 21-18 colore bianco.")
	public void testSpostamentoSemplice_spostaBianco() {
		dam = new Damiera();
		mos = new Mosse();
		contr = new Controlli();
		mos.spostamentoSemplice(dam, contr,"21-18");
		assertTrue(dam.getPezzo(12).getPosizione()==18
				&& dam.getPezzo(12).getColore()=='b');
	}

	@Test
	@DisplayName("Spostamento 9-13 colore nero.")
	public void testSpostamentoSemplice_spostaNero() {
		dam = new Damiera();
		mos = new Mosse();
		contr = new Controlli();
		mos.spostamentoSemplice(dam, contr,"9-13");
		assertTrue(dam.getPezzo(8).getPosizione()==13
				&& dam.getPezzo(8).getColore()=='n');
	}

	@Test
	@DisplayName("Presa semplice 18x9 colore bianco.")
	public void testPresaSemplice_presaSempliceBianco() {
		dam = new Damiera();
		mos = new Mosse();
		contr = new Controlli();
		mos.spostamentoSemplice(dam, contr, "21-18");
		mos.spostamentoSemplice(dam, contr, "9-13");
		mos.presaSemplice(dam, contr,"18x9");
		assertTrue(dam.getPezzo(12).getPosizione()==9
				&& dam.getPezzo(12).getColore()=='b'
				&& dam.getPezzo(8).isPresa());
	}


	@Test
	@DisplayName("Presa semplice 13x22 colore nero.")
	public void testPresaSemplice_presaSempliceNero() {
		dam = new Damiera();
		mos = new Mosse();
		contr = new Controlli();
		mos.spostamentoSemplice(dam, contr, "21-18");
		mos.spostamentoSemplice(dam, contr, "9-13");
		mos.spostamentoSemplice(dam, contr, "22-19");
		mos.presaSemplice(dam, contr,"13x22");
		assertTrue(dam.getPezzo(8).getPosizione()==22
				&& dam.getPezzo(8).getColore()=='n');
	}

	@Test
	@DisplayName("Presa multipla 23x14x5 colore bianco.")
	public void testPresaMultipla1_presaMultiplaBianco() {
		dam = new Damiera();
		mos = new Mosse();
		contr = new Controlli();
		mos.spostamentoSemplice(dam, contr, "21-18");
		mos.spostamentoSemplice(dam, contr, "9-13");
		mos.presaSemplice(dam, contr,"18x9");
		mos.spostamentoSemplice(dam, contr, "10-14");
		mos.spostamentoSemplice(dam, contr, "25-21");
		mos.spostamentoSemplice(dam, contr, "5-10");
		mos.spostamentoSemplice(dam, contr, "21-17");
		mos.spostamentoSemplice(dam, contr, "14-19");
		mos.presaMultipla1(dam, contr,"23x14x5");
		assertTrue(dam.getPezzo(14).getPosizione()==5
				&& dam.getPezzo(14).getColore()=='b');
	}

	@Test
	@DisplayName("Presa multipla 14x21x30 colore nero.")
	public void testPresaMultipla1_presaMultiplaNero() {
		dam = new Damiera();
		mos = new Mosse();
		contr = new Controlli();
		mos.spostamentoSemplice(dam, contr, "21-18");
		mos.spostamentoSemplice(dam, contr, "11-14");
		dam.getPezzo(21).setPresa();
		mos.presaMultipla1(dam, contr,"14x21x30");
		assertTrue(dam.getPezzo(10).getPosizione()==30
				&& dam.getPezzo(10).getColore()=='n');
	}

	@Test
	@DisplayName("Presa multipla 30x23x16x7 colore bianco.")
	public void testPresaMultipla2_presaMultiplaBianco() {
		dam = new Damiera();
		mos = new Mosse();
		contr = new Controlli();
		dam.getPezzo(18).setPosizione(33);
		dam.getPezzo(18).setPresa();
		dam.getPezzo(0).setPosizione(27);
		dam.getPezzo(14).setPresa();
		dam.getPezzo(14).setPosizione(33);
		dam.getPezzo(1).setPosizione(20);
		dam.getPezzo(6).setPresa();
		mos.presaMultipla2(dam, contr,"30x23x16x7");
		assertTrue(dam.getPezzo(21).getPosizione()==7
				&& dam.getPezzo(21).getColore()=='b');
	}

	@Test
	@DisplayName("Presa multipla 2x11x18x27 colore nero.")
	public void testPresaMultipla2_presaMultiplaNero() {
		dam = new Damiera();
		mos = new Mosse();
		contr = new Controlli();
		dam.getPezzo(5).setPosizione(33);
		dam.getPezzo(5).setPresa();
		dam.getPezzo(10).setPosizione(33);
		dam.getPezzo(10).setPresa();
		dam.getPezzo(23).setPosizione(6);
		dam.getPezzo(22).setPosizione(14);
		dam.getPezzo(21).setPosizione(22);
		dam.getPezzo(18).setPosizione(33);
		dam.getPezzo(18).setPresa();
		mos.presaMultipla2(dam, contr,"2x11x18x27");
		assertTrue(dam.getPezzo(1).getColore()=='n'
				&& dam.getPezzo(1).getPosizione()==27);
	}

}