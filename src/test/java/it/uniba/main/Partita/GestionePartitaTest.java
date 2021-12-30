package it.uniba.main.Partita;
import org.junit.Test;
import org.junit.jupiter.api.Tag;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.jupiter.api.DisplayName;

@Tag("GestionePartita")
public class GestionePartitaTest {

	GestionePartita partita;

	@Test
	@DisplayName("SetPartitaInCorso mai usato.")
	public void testSetPartitaInCorso_neverSetted(){
		partita = new GestionePartita();
		assertFalse(partita.isPartitaInCorso());
	}

	@Test
	@DisplayName("SetPartitaInCorso settato a false.")
	public void testSetPartitaInCorso_setFalse(){
		partita = new GestionePartita();
		partita.setPartitaInCorso(false);
		assertFalse(partita.isPartitaInCorso());
	}

	@Test
	@DisplayName("SetPartitaInCorso settato a true.")
	public void testSetPartitaInCorso_setTrue(){
		partita = new GestionePartita();
		partita.setPartitaInCorso(true);
		assertTrue(partita.isPartitaInCorso());
	}

}
