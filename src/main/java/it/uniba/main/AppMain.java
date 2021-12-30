package it.uniba.main;
import it.uniba.main.Componenti.Damiera;
import it.uniba.main.InputOutput.Grafica;
import it.uniba.main.InputOutput.Input;
import it.uniba.main.InputOutput.Messaggi;
import it.uniba.main.Partita.Controlli;
import it.uniba.main.Partita.GestionePartita;
import it.uniba.main.Partita.GestioneTurno;
import it.uniba.main.Partita.Mosse;
import java.util.ArrayList;

/**
 * Classe di tipo: Control.
 * Questa classe si occupa di controllare l'esecuzione logica
 * dell'applicazione mediante specifici input dell'utente.
 * In base all'input dell'utente vengono indirizzati nelle
 * specifiche classi ed è lì che verrà gestita l'esecuzione.
 * Inoltre le classi di tipo control sono collegate a tutte
 * le altre classi proprio per garantire il funzionamento corretto.
 * Infatti la classe AppMain, una volta eseguita, andrà a verificare
 * la stringa ricevuta in input scritta dall'utente
 * e, in base al comando richiesto, andrà nei vari casi per poi essere
 * indirizzato nella classe che gestisce quel determinato comando.
 * Quindi, la classe AppMain fa da intermedio tra le varie classi.
 */
public final class AppMain {

    /**
     * Private constructor. Change if needed.
     */
    private AppMain() {

    }

    /**
     * * This is the main entry of the application.
     *
     * @param args The command-line arguments.
     */
    public static void main(final String[] args) {
        System.out.println("Current working dir: "
                + System.getProperty("user.dir"));
        if (args.length > 0) {
            switch (args[0]) {
                case "it":
                    System.out.println("Applicazione avviata.");
                    break;
                case "en":
                    System.out.println("Application started.");
                    break;
                case "help":
                    Grafica.help();
                    break;
                case "h":
                    Grafica.shorthelp();
                    break;
                default:
                    System.out.println("Specify the language. "
                            + "Languages supported: 'it' or 'en'");
                    break;
            }
        } else {
            System.out.println("Using default language 'en'");
            System.out.println("Application started.");
        }
        Grafica.logo();
        Grafica.help();
        gioco();
    }


    /**
     * Metodo che gestisce l'intero gioco.
     */
    private static void gioco() {
        ArrayList<String>  mosseEffettuate = new ArrayList<>();
        GestionePartita par = new GestionePartita();
        GestioneTurno tur = new GestioneTurno();
        Controlli contr = new Controlli();
        Mosse mos = new Mosse();
        Damiera dam = new Damiera();
        boolean chiudiGioco = false;
        while (!chiudiGioco) {
            String str = Input.getComando();
            String mossa = str;
            str = contr.isMossa(str);
            switch (str) {
                case ("gioca"):
                    if (par.isPartitaInCorso()) {
                        Messaggi.partitaGiaIniziata();
                    } else {
                        par = new GestionePartita();
                        tur = new GestioneTurno();
                        dam = new Damiera();
                        mosseEffettuate = new ArrayList<>();
                        par.setPartitaInCorso(true);
                        Messaggi.inizioPartita();
                        Grafica.stampaDamieraPezzi(dam);
                        Messaggi.cambioTurno('b');
                    }
                    break;
                case("damiera"):
                    damiera(par, dam);
                    break;
                case("tempo"):
                    tempo(par, tur);
                    break;
                case("numeri"):
                    numeri();
                    break;
                case("help"):
                    help();
                    break;
                case("abbandona"):
                    abbandona(par, tur);
                    break;
                case("esci"):
                    chiudiGioco = esci();
                    break;
                case("prese"):
                    prese(par, dam);
                    break;
                case("mosse"):
                    mosse(par, mosseEffettuate);
                    break;
                case("spostamentoSemplice"):
                    spostamentoSemplice(par, contr, dam, tur,
                            mossa, mos, mosseEffettuate);
                    break;
                case("spostamentoPresa"):
                    spostamentoPresa(par, contr, dam, tur,
                            mossa, mos, mosseEffettuate);
                    break;
                case("presaMultipla1"):
                    presaMultipla1(par, contr, dam, tur,
                            mossa, mos, mosseEffettuate);
                    break;
                case("presaMultipla2"):
                    presaMultipla2(par, contr, dam, tur,
                            mossa, mos, mosseEffettuate);
                    break;
                default:
                    Messaggi.comandoErrato(str);
                    break;
            }
        }
    }

    /**
     * Stampa la damiera aggiornata con i vari spostamenti/prese.
     * @param par Istanza della partita;
     * @param dam Istanza della damiera;
     */
    static void damiera(final GestionePartita par, final Damiera dam) {
        if (par.isPartitaInCorso()) {
            Grafica.stampaDamieraPezzi(dam);
        } else {
            Messaggi.partitaNonIniziata();
        }
    }

    /**
     * Stampa il tempo di entrambi i giocatori.
     * @param par Istanza della partita;
     * @param tur Tiene conto del turno in cui ci si trova
     *            e del tempo;
     */
    static void tempo(final GestionePartita par, final GestioneTurno tur) {
        if (par.isPartitaInCorso()) {
            tur.tempo(tur);
        } else {
            Messaggi.partitaNonIniziata();
        }
    }

    /**
     * Stampa la damiera numerata.
     */
    static void numeri() {
        Grafica.stampaDamieraNum();
    }

    /**
     * Stampa l'help per i comandi.
     */
    static void help() {
        Grafica.help();
    }

    /**
     * Nel caso l'utente chiede di abbandonare, viene chiesta una conferma.
     * @param par Istanza della partita;
     * @param tur Tiene conto del turno in cui ci si trova;
     */
    static void abbandona(final GestionePartita par, final GestioneTurno tur) {
        if (!par.isPartitaInCorso()) {
            Messaggi.partitaNonIniziata();
        } else if (Input.confermaAbbandono(tur)) {
            par.setPartitaInCorso(false);
        }
    }

    /**
     * Nel caso l'utente chiede di uscire, viene chiesta una conferma.
     * @return true se l'utente scrive si, false altrimenti;
     */
    static boolean esci() {
        return Input.confermaChiusura();
    }

    /**
     * Stampa le pedine prese da entrambi i giocatori.
     * @param par Istanza della partita;
     * @param dam Damiera da cui calcoleremo le prese;
     */
    static void prese(final GestionePartita par, final Damiera dam) {
        if (par.isPartitaInCorso()) {
            Grafica.mostraPrese(dam);
        } else {
            Messaggi.partitaNonIniziata();
        }
    }

    /**
     * Stampa le mosse effettuate dai giocatori.
     * @param par Istanza della partita;
     * @param mosseEffettuate Array che contiene le mosse
     *                        effettuate fino a quel momento;
     */
    static void mosse(final GestionePartita par,
                      final ArrayList<String> mosseEffettuate) {
        if (par.isPartitaInCorso()) {
            Grafica.mostraMosse(mosseEffettuate);
        } else {
            Messaggi.partitaNonIniziata();
        }
    }

    /**
     * Effettua uno spostamento semplice.
     * @param par Istanza della partita;
     * @param contr Effettua il controllo di damatura;
     * @param dam Damiera su cui andremo a spostare le pedine;
     * @param tur Ci permette di capire il turno in cui ci troviamo;
     * @param mossa Stringa contenente la mossa di spostamento;
     * @param mos Istanza di Mosse che ci permetterá di effettuare
     *            lo spostamento;
     * @param mosseEffettuate Serve a salvare la mossa, se effettuata;
     */
    static void spostamentoSemplice(final GestionePartita par,
                                    final Controlli contr,
                                    final Damiera dam,
                                    final GestioneTurno tur,
                                    final String mossa,
                                    final Mosse mos,
                                    final ArrayList<String> mosseEffettuate) {
        if (par.isPartitaInCorso()) {
            if (contr.controllaMossaSpostamento(dam, tur,
                    mossa)) {
                mos.spostamentoSemplice(dam, contr, mossa);
                mosseEffettuate.add(mossa);
                if (tur.getTurno() == 'b') {
                    tur.setTurno('n');
                } else {
                    tur.setTurno('b');
                }
            }
        } else {
            Messaggi.partitaNonIniziata();
        }
    }

    /**
     * Effettua una presa semplice.
     * @param par Istanza della partita;
     * @param contr Effettua il controllo di damatura;
     * @param dam Damiera su cui andremo a effettuare le prese;
     * @param tur Ci permette di capire il turno in cui ci troviamo;
     * @param mossa Stringa contenente la mossa di presa;
     * @param mos Istanza di Mosse che ci permetterá di effettuare
     *            la presa;
     * @param mosseEffettuate Serve a salvare la mossa, se effettuata;
     */
    static void spostamentoPresa(final GestionePartita par,
                                 final Controlli contr,
                                 final Damiera dam,
                                 final GestioneTurno tur,
                                 final String mossa,
                                 final Mosse mos,
                                 final ArrayList<String> mosseEffettuate) {
        if (par.isPartitaInCorso()) {
            if (contr.controllaMossaPresaSemplice(dam, tur,
                    mossa)) {
                mos.presaSemplice(dam, contr, mossa);
                mosseEffettuate.add(mossa);
                Messaggi.presaEffettuata();
                if (tur.getTurno() == 'b') {
                    tur.setTurno('n');
                } else {
                    tur.setTurno('b');
                }
            }
        } else {
            Messaggi.partitaNonIniziata();
        }
    }

    /**
     * Effettua una presa multipla a 3 termini.
     * @param par Istanza della partita;
     * @param contr Effettua il controllo di damatura;
     * @param dam Damiera su cui andremo a effettuare le prese;
     * @param tur Ci permette di capire il turno in cui ci troviamo;
     * @param mossa Stringa contenente la mossa di presa;
     * @param mos Istanza di Mosse che ci permetterá di effettuare
     *            la presa;
     * @param mosseEffettuate Serve a salvare la mossa, se effettuata;
     */
    static void presaMultipla1(final GestionePartita par,
                               final Controlli contr,
                               final Damiera dam,
                               final GestioneTurno tur,
                               final String mossa,
                               final Mosse mos,
                               final ArrayList<String> mosseEffettuate) {
        if (par.isPartitaInCorso()) {
            if (contr.controllaMossaPresaMultipla1(dam, tur,
                    mossa)) {
                mos.presaMultipla1(dam, contr, mossa);
                mosseEffettuate.add(mossa);
                Messaggi.presaMultiplaEffettuata();
                if (tur.getTurno() == 'b') {
                    tur.setTurno('n');
                } else {
                    tur.setTurno('b');
                }
            }
        } else {
            Messaggi.partitaNonIniziata();
        }
    }

    /**
     * Effettua una presa multipla a 4 termini.
     * @param par Istanza della partita;
     * @param contr Effettua il controllo di damatura;
     * @param dam Damiera su cui andremo a effettuare le prese;
     * @param tur Ci permette di capire il turno in cui ci troviamo;
     * @param mossa Stringa contenente la mossa di presa;
     * @param mos Istanza di Mosse che ci permetterá di effettuare
     *            la presa;
     * @param mosseEffettuate Serve a salvare la mossa, se effettuata;
     */
    static void presaMultipla2(final GestionePartita par,
                               final Controlli contr,
                               final Damiera dam,
                               final GestioneTurno tur,
                               final String mossa,
                               final Mosse mos,
                               final ArrayList<String> mosseEffettuate) {
        if (par.isPartitaInCorso()) {
            if (contr.controllaMossaPresaMultipla2(dam, tur,
                    mossa)) {
                mos.presaMultipla2(dam, contr, mossa);
                mosseEffettuate.add(mossa);
                Messaggi.presaMultiplaEffettuata();
                if (tur.getTurno() == 'b') {
                    tur.setTurno('n');
                } else {
                    tur.setTurno('b');
                }
            }
        } else {
            Messaggi.partitaNonIniziata();
        }
    }

}


