package it.uniba.main.Partita;
import org.junit.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import java.util.Date;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

@Tag("GestioneTurno")
public class GestioneTurnoTest {

	GestioneTurno turno;

	@Test
	@DisplayName("SetTurno mai usato.")
	public void testSetTurno_neverSetted(){
		final char bianco = 'b';
		turno = new GestioneTurno();
		assertEquals(bianco,turno.getTurno());
	}

	@Test
	@DisplayName("SetTurno usato per il bianco.")
	public void testSetTurno_setBianco(){
		final char bianco = 'b';
		turno = new GestioneTurno();
		turno.setTurno(bianco);
		assertEquals(bianco,turno.getTurno());
	}

	@Test
	@DisplayName("SetTurno usato per il nero.")
	public void testSetTurno_setNero(){
		final char nero = 'n';
		turno = new GestioneTurno();
		turno.setTurno(nero);
		assertEquals(nero,turno.getTurno());
	}

	@Test
	@DisplayName("GetTempoTotale usato per il bianco.")
	public void testGetTempoTotale_getTempoTotaleBianco(){
		final char bianco = 'b';
		turno = new GestioneTurno();
		Date tempoAttuale = new Date();
		long diff = tempoAttuale.getTime() - turno.getInizioTurno().getTime();
		long tempoTotaleBianco =+ diff;
		assumeTrue(turno.getTempoTotale(bianco)==tempoTotaleBianco);
	}

	@Test
	@DisplayName("GetTempoTotale usato per il nero.")
	public void testGetTempoTotale_getTempoTotaleNero(){
		final char nero = 'n';
		turno = new GestioneTurno();
		turno.setTurno(nero);
		Date tempoAttuale = new Date();
		long diff = tempoAttuale.getTime() - turno.getInizioTurno().getTime();
		long tempoTotaleNero =+ diff;
		assumeTrue(turno.getTempoTotale(nero)==tempoTotaleNero);
	}

	@Test
	@DisplayName("Tempo stampato per il bianco.")
	public void testTempo_turnoBianco(){
		final char bianco = 'b';
		turno = new GestioneTurno();
		turno.setTurno(bianco);
		turno.tempo(turno);
	}

	@Test
	@DisplayName("Tempo stampato per il nero.")
	public void testTempo_turnoNero(){
		final char nero = 'n';
		turno = new GestioneTurno();
		turno.setTurno(nero);
		turno.tempo(turno);
	}

}
