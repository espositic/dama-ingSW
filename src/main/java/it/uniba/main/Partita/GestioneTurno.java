package it.uniba.main.Partita;
import it.uniba.main.InputOutput.Messaggi;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Classe di tipo: Control.
 * La classe 'GestioneTurno' si occupa di:
 * -Verificare il turno in corso per poi cambiarlo passando il turno
 * (così da permettere la corretta esecuzione della partita);
 * -Verificare la data nel momento in cui inizia un turno;
 * -Verificare il tempo totale trascorso per entrambi i giocatori;
 * -Verificare il tempo per ogni giocatore e lo restituisce;
 */
public class GestioneTurno {
    /**
     * Colore del turno 'n' o 'b'.
     */
    private char turno;
    /**
     * Costante colore nero.
     */
    private static final char NERO = 'n';
    /**
     * Costante colore bianco.
     */
    private static final char BIANCO = 'b';
    /**
     * Tempo utilizzato dal bianco durante i suoi turni.
     */
    private long tempoTotaleBianco;
    /**
     * Tempo utilizzato dal nero durante i suoi turni.
     */
    private long tempoTotaleNero;
    /**
     * Inizio del turno, aggiornato ad ogni inizio turno.
     */
    private Date inizioTurno;
    /**
     * Numero dei secondi che compongono un minuto.
     */
    private static final int SESSANTA = 60;

    /**
     * Costruttore di GestioneTurno.
     */
    public GestioneTurno() {
        turno = BIANCO;
        tempoTotaleBianco = 0;
        tempoTotaleNero = 0;
        inizioTurno = new Date();
    }

    /**
     * Restituisce il colore dell'utente in quel turno.
     * @return colore dell'utente nello specifico turno;
     */
    public char getTurno() {
        return turno;
    }

    /**
     * Modifica il turno.
     * @param newTurno colore del nuovo turno;
     */
    public void setTurno(final char newTurno) {
        turno = newTurno;
        if (newTurno == BIANCO) {
            Date tempoAttuale = new Date();
            long diff = tempoAttuale.getTime() - getInizioTurno().getTime();
            tempoTotaleNero = tempoTotaleNero + diff;
            inizioTurno = new Date();
            Messaggi.cambioTurno(BIANCO);
        } else {
            Date tempoAttuale = new Date();
            long diff = tempoAttuale.getTime() - getInizioTurno().getTime();
            tempoTotaleBianco = tempoTotaleBianco + diff;
            inizioTurno = new Date();
            Messaggi.cambioTurno(NERO);
        }
    }

    /**
     * Ci restituisce la Data nel momento esatto in cui é cominciato il turno.
     * @return inizio di quel turno;
     */
    Date getInizioTurno() {
        return inizioTurno;
    }

    /**
     * Ci restituisce il tempo totale trascorso per entrambi i giocatori.
     * @param c colore del turno;
     * @return tempoTotaleBianco se c='b' altrimenti tempoTotaleNero;
     */
    public long getTempoTotale(final char c) {
        if (c == BIANCO) {
            return tempoTotaleBianco;
        } else {
            return tempoTotaleNero;
        }
    }

    /**
     * Stampa il tempo impiegato dal giocatore corrente.
     * @param tur colore del turno in cui ci troviamo;
     */
    public void tempo(final GestioneTurno tur) {
        if (tur.getTurno() == BIANCO) {
            Date tempoAttuale = new Date();
            long diff = tur.getTempoTotale(BIANCO) + tempoAttuale.getTime()
                    - tur.getInizioTurno().getTime();
            TimeUnit time = TimeUnit.SECONDS;
            long difference = time.convert(diff, TimeUnit.MILLISECONDS);
            System.out.println("Il giocatore bianco ha impiegato "
                    + difference / SESSANTA + " min " + difference
                    % SESSANTA + " sec e il giocatore nero ha impiegato "
                    + time.convert(tur.getTempoTotale(NERO),
                    TimeUnit.MILLISECONDS) / SESSANTA + " min "
                    + time.convert(tur.getTempoTotale(NERO),
                    TimeUnit.MILLISECONDS) % SESSANTA + " sec");
        } else {
            Date tempoAttuale = new Date();
            long diff = tur.getTempoTotale(NERO)
                    + tempoAttuale.getTime() - tur.getInizioTurno().getTime();
            TimeUnit time = TimeUnit.SECONDS;
            long difference = time.convert(diff, TimeUnit.MILLISECONDS);
            System.out.println("Il giocatore nero ha impiegato "
                    + difference / SESSANTA + " min " + difference % SESSANTA
                    + " sec e il giocatore bianco ha impiegato "
                    + time.convert(tur.getTempoTotale(BIANCO),
                    TimeUnit.MILLISECONDS) / SESSANTA + " min "
                    + time.convert(tur.getTempoTotale(BIANCO),
                    TimeUnit.MILLISECONDS) % SESSANTA + " sec");
        }
    }
}
