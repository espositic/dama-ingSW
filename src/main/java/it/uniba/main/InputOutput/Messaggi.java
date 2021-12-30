package it.uniba.main.InputOutput;
import it.uniba.main.Utility.GestioneStringhe;

/**
 * Classe di tipo: Boundary.
 * La classe Messaggi si occupa di:
 * -Stampare vari messaggi di comunicazione, come "inizio partita",
 * "partita già in corso" oppure "nessuna partita avviata";
 * -Stampare il cambio turno;
 * -Stampare la riuscita o meno delle varie mosse(spostamento,
 * presa semplice e multipla);
 * -Stampare quando viene scritto un comando in maniera non corretta
 * invitando l'utente a riscrivere il comando;
 * -Stampare messaggi di errore quando le posizioni di partenza e di arrivo
 * sono uguali, oppure quando una posizione è
 * irraggiungibile, o quando nella posizione di partenza non è presente alcun
 * pezzo(e viceversa);
 * -Stampare quando non è stata effettuata alcuna mossa;
 * -Stampare un messaggio di errore quando non vi è alcun pezzo avversario
 * da mangiare;
 * -Stampare un messaggio di errore quando una pedina prova a mangiare una dama;
 * -Stampare la richiesta di conferma di abbandono o di uscita dal gioco;
 * -Stampare il vincitore della partita;
 */
public final class Messaggi {
    /**
     * RESET.
     */
    static final String RESET = "\u001B[0m";
    /**
     * GREEN.
     */
    static final String GREEN = "\u001B[32m";
    /**
     * RED.
     */
    static final String RED = "\u001B[31m";
    /**
     * YELLOW.
     */
    static final String YELLOW = "\u001B[33m";
    /**
     * CYAN.
     */
    static final String CYAN = "\u001B[36m";
    /**
     * Simbolo laterale.
     */
    static final String LATERALE = "\u2503";
    /**
     * Simbolo piatto.
     */
    static final String PIATTO = "\u2501";
    /**
     * Simbolo alto a sinistra.
     */
    static final String ALTOSINISTRA = "\u250F";
    /**
     * Simbolo alto a destra.
     */
    static final String ALTODESTRA = "\u2513";
    /**
     * Simbolo basso a sinistra.
     */
    static final String BASSOSINISTRA = "\u2517";
    /**
     * Simbolo basso a destra.
     */
    static final String BASSODESTRA = "\u251B";
    /**
     * Simbolo fatto.
     */
    static final String FATTO = "\u2714";
    /**
     * Simbolo non fatto.
     */
    static final String NONFATTO = "\u2718";

    private Messaggi() { }

    /**
     *     Stampa il messaggio di inizio partita.
     */
    public static void inizioPartita() {
        System.out.println(
                ALTOSINISTRA + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + ALTODESTRA
                + "\n" + LATERALE + " LA PARTITA HA INIZIO "
                + LATERALE + "\n" + BASSOSINISTRA + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + BASSODESTRA);
    }

    /**
     *  Stampa il messaggio che avvisa che la partita è già iniziata.
    */
    public static void partitaGiaIniziata() {
        System.out.println(YELLOW + "ATTENZIONE:" + RESET
                + " dovresti terminare la partita in esecuzione"
                + " prima di avviarne un'altra.");
    }

    /**
     * Stampa il messaggio che avvisa che la partita non è ancora iniziata.
    */
    public static void partitaNonIniziata() {
        System.out.println(YELLOW + "ATTENZIONE:" + RESET
                + " dovresti prima iniziare una partita "
                + "digitando " + CYAN
                + "gioca" + RESET);
    }

    /**
     *     Stampa il messaggio che indica il giocatore a cui tocca.
     *     @param turno turno da cambiare;
     */
    public static void cambioTurno(final char turno) {
        System.out.print("\n" + ALTOSINISTRA + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + ALTODESTRA + "\n" + LATERALE);
        if (turno == 'b') {
            System.out.print(" TURNO DEL BIANCO ");
        } else {
            System.out.print("  TURNO DEL NERO  ");
        }
        System.out.println(LATERALE + "\n" + BASSOSINISTRA
                + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + BASSODESTRA);
    }

    /**
     * Stampa il messaggio di spostamento effettuato.
     */
    public static void spostamentoEffettuato() {
        System.out.println(GREEN + FATTO
                + " Spostamento effettuato" + RESET);
    }

    /**
     * Stampa il messaggio di spostamento non effettuato.
     */
    public static void spostamentoNonEffettuato() {
        System.out.println(RED + NONFATTO
                + " Spostamento non effettuato" + RESET);
    }

    /**
     * Stampa il messaggio di presa effettuata.
     */
    public static void presaEffettuata() {
        System.out.println(GREEN + FATTO + " Presa effettuata" + RESET);
    }

    /**
     * Stampa il messaggio di damatura effettuata.
     */
    public static void damaturaEffettuata() {
        System.out.println(GREEN + FATTO
                + " Damatura effettuata" + RESET);
    }

    /**
     * Stampa il messaggio di presa multipla effettuata.
     */
    public static void presaMultiplaEffettuata() {
        System.out.println(GREEN + FATTO
                + " Presa multipla effettuata" + RESET);
    }

    /**
     * Stampa il messaggio di presa non effettuata.
     */
    public static void prNonEff() {
        System.out.println(RED + NONFATTO
                + " Presa non effettuata" + RESET);
    }

    /**
     * Stampa il messaggio che segnala l'inserimento di un comando errato.
     * @param str stringa contenente il comando errato;
     */
    public static void comandoErrato(final String str) {
        System.out.println(YELLOW + "ATTENZIONE:" + RESET
                + " \"" + str + "\" e' un comando errato. "
                + "Digita " + CYAN + "help" + RESET
                + " per visualizzare l'elenco dei comandi "
                + "validi");
    }

    /**
     * Stampa il messaggio che indica che la casella inserita nel
     * comando è inesistente.
     * @param mossa contiene la posizione che non esiste;
     * @param tipoPosizione contiene la posizione della pedina
     * interessata.
     */
    public static void casellaInesistente(final String mossa,
                    final char tipoPosizione) {
        System.out.println(YELLOW + "ATTENZIONE:" + RESET
                + " la casella "
                + GestioneStringhe.estraePosizione(
                tipoPosizione, mossa) + " non esiste");
    }

    /**
     * Stampa posizione iniziale e finale uguali.
     */
    public static void posizioniUguali() {
        System.out.println(YELLOW + "ATTENZIONE:" + RESET
                + " la casella di arrivo dev'essere diversa"
                + " da quella di partenza");
    }

    /**
     * Stampa posizione finale occupata.
     * @param mossa mossa da cui prendere le posizioni;
     */
    public static void posizioneOccupata(final String mossa) {
        System.out.println(YELLOW + "ATTENZIONE:"
                + RESET + " la casella "
                + GestioneStringhe.estraePosizione('f',
                mossa) + " e' gia' occupata da un altro pezzo");
    }

    /**
     * Stampa posizione non raggiungibile con uno spostamento.
     * @param mossa mossa da cui prendere le posizioni;
     */
    public static void posIrrSpostamento(
            final String mossa) {
        System.out.println(YELLOW + "ATTENZIONE:" + RESET
                + " la casella "
                + GestioneStringhe.estraePosizione('f',
                mossa) + " non e' raggiungibile dalla casella "
                + GestioneStringhe.estraePosizione('i',
                mossa) + " con uno spostamento");
    }

    /**
     * Stampa posizione non raggiungibile con una presa.
     * @param mossa mossa da cui prendere le posizioni;
     */
    public static void pIrPrs(final String mossa) {
        System.out.println(YELLOW + "ATTENZIONE:" + RESET
                + " la casella "
                + GestioneStringhe.estraePosizione('f',
                mossa) + " non e' raggiungibile dalla casella "
                + GestioneStringhe.estraePosizione('i',
                mossa) + " con una presa");
    }

    /**
     * Stampa nessun pezzo nella posizione iniziale.
     * @param mossa mossa dalla cui prendere la posizione iniziale;
     */
    public static void pezzoAssente(final String mossa) {
        System.out.println(YELLOW + "ATTENZIONE:" + RESET
                + " non possiedi nessun pezzo nella casella "
                + GestioneStringhe.estraePosizione('i', mossa));
    }

    /**
     * Stampa il messaggio che indica l'assenza di mosse effettuate.
     */
    public static void mosseAssenti() {
        System.out.println(YELLOW + "ATTENZIONE:" + RESET
                + " non e' ancora stata effettuata "
                + "nessuna mossa");
    }

    /**
     * Stampa il messaggio che indica l'assenza di una pedina avversaria
     * nella presa.
     * @param n posizione del pezzo nemico inesistente;
     */
    public static void noPzNemPerPresa(final int n) {
        System.out.println(YELLOW + "ATTENZIONE:"
                + RESET + " non c'e' nessun pezzo "
                + "avversario in posizione " + n);
    }

    /**
     * Stampa il messaggio che indica che non è possibile prendere una dama.
     */
    public static void impPrDama() {
        System.out.println(YELLOW + "ATTENZIONE:"
                + RESET + " impossibile effettuare"
                + " la presa sulla dama");
    }

    /**
     * Stampa il messaggio che annuncia il vincitore.
     * @param vincitore colore del vincitore;
     */
    public static void stampaVincitore(final char vincitore) {
        System.out.print(ALTOSINISTRA + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + ALTODESTRA + "\n" + LATERALE);
        if (vincitore == 'b') {
            System.out.print(" VINCE IL BIANCO! ");
        } else {
            if (vincitore == 'n') {
                System.out.print("  VINCE IL NERO!  ");
            }
        }
        System.out.println(LATERALE + "\n" + BASSOSINISTRA
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + BASSODESTRA
                + "\n");
    }
}
