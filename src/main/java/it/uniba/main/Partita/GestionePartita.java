package it.uniba.main.Partita;

/**
 * Classe di tipo: Control.
 * La classe GestionePartita si occupa di:
 * -Verificare se la partita è in corso ed eventualmente
 * cambiare il valore di "partitaInCorso" se necessario;
 */

public class GestionePartita {
    /**
     * Ci dice se la partita é in corso.
     */
    private boolean partitaInCorso;

    /**
     * Metodo costruttore della classe.
     */
    public GestionePartita() {
        partitaInCorso = false;
    }

    /**
     * Permette di capire se la partita é in corso.
     * @return stato della partita
     */
    public boolean isPartitaInCorso() {
        return partitaInCorso;
    }

    /**
     * Modifica lo stato della partita.
     * @param statoPartita stato della partita da modificare;
     */
    public void setPartitaInCorso(final boolean statoPartita) {
        partitaInCorso = statoPartita;
    }
}
