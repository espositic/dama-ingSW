package it.uniba.main.InputOutput;
import it.uniba.main.Componenti.Damiera;
import java.util.ArrayList;

/**
 * Classe di tipo: Boundary.
 * La classe Grafica si occupa di:
 * -Stampare l'help con i vari comandi annessi;
 * -Stampare la damiera numerata;
 * -Stampare la damiera coi pezzi;
 * -Stampare il tempo trascorso per effettuare le mosse di  ogni giocatore;
 * -Stampare le prese effettuate dai giocatori;
 * -Stampare le mosse effettuate dai giocatori;
 */
public final class Grafica {

    /**
     * RESET.
     */
    static final String RESET = "\u001B[0m";
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
     * Simbolo alto.
     */
    static final String ALTO = "\u2533";
    /**
     * Simbolo basso.
     */
    static final String BASSO = "\u253B";
    /**
     * Simbolo centrale.
     */
    static final String CENTRALE = "\u254B";
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
     * Simbolo centro sinistra.
     */
    static final String CENTROSINISTRA = "\u2523";
    /**
     * Simbolo centro destra.
     */
    static final String CENTRODESTRA = "\u252B";
    /**
     * Simbolo black.
     */
    static final String BLACK = "\u2588";

    private Grafica() { }


    /**
     * Stampa l'elenco dei comandi completo all'avvio dell'applicazione.
     * Invocando l'app con flag "--help" o eseguendo "help"
     * all'interno dell'applicazione.
     */
    public static void help() {
        System.out.print("\n" + ALTOSINISTRA + PIATTO
                + " COMANDI DISPONIBILI:\n" + RESET
                + LATERALE + CYAN + " gioca" + RESET
                + ": inizia una nuova" + "partita\n"
                + LATERALE + CYAN + " damiera" + RESET
                + ": mostra la" + "damiera con i pezzi\n"
                + LATERALE + CYAN + " numeri" + RESET
                + ": mostra la damiera numerata\n" + LATERALE
                + CYAN + " tempo" + RESET + ": mostra il tempo"
                + "di gioco\n" + LATERALE + CYAN + " mosse" + RESET
                + ": mostra tutte le mosse effettuate\n" + LATERALE
                + CYAN + " prese" + RESET + ": mostra tutte le prese\n"
                + LATERALE + CYAN + " [partenza]-[arrivo]" + RESET
                + ": spostamento del pezzo (Es: 1-5)\n" + LATERALE
                + CYAN + " [partenza]x[arrivo]" + RESET
                + ": presa del pezzo (Es: 5x14)\n" + LATERALE
                + CYAN + " abbandona" + RESET + ": abbandona la partita\n"
                + LATERALE + CYAN + " help" + RESET
                + ": mostra tutti i comandi\n" + LATERALE + CYAN
                + " esci" + RESET + ": esci dal gioco\n"
                + BASSOSINISTRA + PIATTO + "\n\n");
    }

    /**
     * Stampa l'elenco dei comandi ridotto invocando l'app con flag "-h".
     */
    public static void shorthelp() {
        String help = "\n gioca \n damiera \n numeri \n tempo \n"
                + " mosse \n prese \n help \n abbandona \n esci\n\n";
        System.out.print(help);
    }

    /**
     * Stampa la damiera numerata ricevendo in input un elemento Damiera.
     */
    public static void stampaDamieraNum() {
        final int sette = 7;
        final int quattro = 4;
        final int cinque = 5;
        final int otto = 8;
        final int dieci = 10;
        final int dodici = 12;
        final int tredici = 13;
        final int sedici = 16;
        final int diciasette = 17;
        final int venti = 20;
        final int ventuno = 21;
        final int ventiquattro = 24;
        final int venticinque = 25;
        final int ventotto = 28;
        final int ventinove = 29;
        final int trentadue = 32;
        System.out.print(ALTOSINISTRA);
        for (int i = 0; i < sette; i++) {
            System.out.print(PIATTO + PIATTO + PIATTO + PIATTO + ALTO);
        }
        System.out.println(PIATTO + PIATTO + PIATTO + PIATTO + ALTODESTRA);

        for (int i = 1; i <= quattro; i++) {
            System.out.print(LATERALE + " 0" + i + " " + LATERALE + BLACK
                    + BLACK + BLACK + BLACK);
        }
        System.out.print(LATERALE + "\n");

        System.out.print(CENTROSINISTRA);
        for (int i = 0; i < sette; i++) {
            System.out.print(PIATTO + PIATTO + PIATTO + PIATTO + CENTRALE);
        }
        System.out.println(PIATTO + PIATTO + PIATTO + PIATTO + CENTRODESTRA);

        for (int i = cinque; i <= otto; i++) {
            System.out.print(LATERALE + BLACK + BLACK + BLACK + BLACK
                    + LATERALE + " 0" + i + " ");
        }
        System.out.print(LATERALE + "\n");

        System.out.print(CENTROSINISTRA);
        for (int i = 0; i < sette; i++) {
            System.out.print(PIATTO + PIATTO + PIATTO + PIATTO + CENTRALE);
        }
        System.out.println(PIATTO + PIATTO + PIATTO + PIATTO + CENTRODESTRA);

        System.out.print(LATERALE + " 09 " + LATERALE + BLACK + BLACK
                + BLACK + BLACK);
        for (int i = dieci; i <= dodici; i++) {
            System.out.print(LATERALE + " " + i + " " + LATERALE + BLACK
                    + BLACK + BLACK + BLACK);
        }
        System.out.print(LATERALE + "\n");

        System.out.print(CENTROSINISTRA);
        for (int i = 0; i < sette; i++) {
            System.out.print(PIATTO + PIATTO + PIATTO + PIATTO + CENTRALE);
        }
        System.out.println(PIATTO + PIATTO + PIATTO + PIATTO + CENTRODESTRA);

        for (int i = tredici; i <= sedici; i++) {
            System.out.print(LATERALE + BLACK + BLACK + BLACK + BLACK
                    + LATERALE + " " + i + " ");
        }
        System.out.print(LATERALE + "\n");

        System.out.print(CENTROSINISTRA);
        for (int i = 0; i < sette; i++) {
            System.out.print(PIATTO + PIATTO + PIATTO + PIATTO + CENTRALE);
        }
        System.out.println(PIATTO + PIATTO + PIATTO + PIATTO + CENTRODESTRA);

        for (int i = diciasette; i <= venti; i++) {
            System.out.print(LATERALE + " " + i + " " + LATERALE + BLACK
                    + BLACK + BLACK + BLACK);
        }
        System.out.print(LATERALE + "\n");

        System.out.print(CENTROSINISTRA);
        for (int i = 0; i < sette; i++) {
            System.out.print(PIATTO + PIATTO + PIATTO + PIATTO + CENTRALE);
        }
        System.out.println(PIATTO + PIATTO + PIATTO + PIATTO + CENTRODESTRA);

        for (int i = ventuno; i <= ventiquattro; i++) {
            System.out.print(LATERALE + BLACK + BLACK + BLACK + BLACK
                    + LATERALE + " " + i + " ");
        }
        System.out.print(LATERALE + "\n");

        System.out.print(CENTROSINISTRA);
        for (int i = 0; i < sette; i++) {
            System.out.print(PIATTO + PIATTO + PIATTO + PIATTO + CENTRALE);
        }
        System.out.println(PIATTO + PIATTO + PIATTO + PIATTO + CENTRODESTRA);

        for (int i = venticinque; i <= ventotto; i++) {
            System.out.print(LATERALE + " " + i + " " + LATERALE + BLACK
                    + BLACK + BLACK + BLACK);
        }
        System.out.print(LATERALE + "\n");

        System.out.print(CENTROSINISTRA);
        for (int i = 0; i < sette; i++) {
            System.out.print(PIATTO + PIATTO + PIATTO + PIATTO + CENTRALE);
        }
        System.out.println(PIATTO + PIATTO + PIATTO + PIATTO + CENTRODESTRA);

        for (int i = ventinove; i <= trentadue; i++) {
            System.out.print(LATERALE + BLACK + BLACK + BLACK + BLACK
                    + LATERALE + " " + i + " ");
        }
        System.out.print(LATERALE + "\n");

        System.out.print(BASSOSINISTRA);
        for (int i = 0; i < sette; i++) {
            System.out.print(PIATTO + PIATTO + PIATTO + PIATTO + BASSO);
        }
        System.out.println(PIATTO + PIATTO + PIATTO + PIATTO + BASSODESTRA);
    }

    /**
     * Stampa la damiera con la disposizione dei pezzi aggiornata.
     * @param dam damiera da stampare;
     */
    public static void stampaDamieraPezzi(final Damiera dam) {
        String pezzoBianco = "\u26C2";
        String damaBianca = "\u26C3";
        String pezzoNero = "\u26C0";
        String damaNera = "\u26C1";
        final int sette = 7;
        final int trentadue = 32;
        final int quattro = 4;
        final int ventiquattro = 24;
        final int otto = 8;
        final int tre = 3;
        int ultimaRiga = 0;
        System.out.print(ALTOSINISTRA);
        for (int ii = 0; ii < sette; ii++) {
            System.out.print(PIATTO + PIATTO + PIATTO + PIATTO + ALTO);
        }
        System.out.println(PIATTO + PIATTO + PIATTO + PIATTO + ALTODESTRA);
        int i = 1;
        while (i <= trentadue) {
            int j = 1;
            while (j <= quattro) {
                int k = 0;
                boolean pezzoTrovato = false;
                while (k < ventiquattro && !pezzoTrovato) {
                    if (dam.getPezzo(k).getColore() == 'b'
                            && dam.getPezzo(k).getPosizione()
                            == i && dam.getPezzo(k).getTipo() == 'p') {
                        System.out.print(LATERALE + " " + pezzoBianco
                                + "  " + LATERALE
                                + BLACK + BLACK + BLACK + BLACK);
                        pezzoTrovato = true;
                    } else {
                        if (dam.getPezzo(k).getColore() == 'b'
                                && dam.getPezzo(k).getPosizione()
                                == i && dam.getPezzo(k).getTipo() == 'd') {
                            System.out.print(LATERALE + " " + damaBianca
                                    + "  " + LATERALE
                                    + BLACK + BLACK + BLACK + BLACK);
                            pezzoTrovato = true;
                        } else {
                            if (dam.getPezzo(k).getColore() == 'n'
                                    && dam.getPezzo(k).getPosizione()
                                    == i && dam.getPezzo(k).getTipo() == 'p') {
                                System.out.print(LATERALE + " " + pezzoNero
                                        + "  " + LATERALE + BLACK + BLACK
                                        + BLACK + BLACK);
                                pezzoTrovato = true;
                            } else {
                                if (dam.getPezzo(k).getColore() == 'n'
                                        && dam.getPezzo(k).getPosizione()
                                        == i && dam.getPezzo(k).getTipo()
                                        == 'd') {
                                    System.out.print(LATERALE + " " + damaNera
                                            + "  " + LATERALE + BLACK + BLACK
                                            + BLACK + BLACK);
                                    pezzoTrovato = true;
                                }
                            }
                        }
                    }
                    k++;
                }
                if (!pezzoTrovato) {
                    System.out.print(LATERALE + "    " + LATERALE + BLACK
                            + BLACK + BLACK + BLACK);
                }
                j++;
                i++;
            }
            System.out.print(LATERALE + "\n");
            System.out.print(CENTROSINISTRA);
            for (int ii = 0; ii < sette; ii++) {
                System.out.print(PIATTO + PIATTO + PIATTO + PIATTO + CENTRALE);
            }
            System.out.println(PIATTO + PIATTO + PIATTO + PIATTO
                    + CENTRODESTRA);
            System.out.print(LATERALE);
            while (j <= otto) {
                int k = 0;
                boolean pezzoTrovato = false;
                while (k < ventiquattro && !pezzoTrovato) {
                    if (dam.getPezzo(k).getColore() == 'b'
                            && dam.getPezzo(k).getPosizione()
                            == i && dam.getPezzo(k).getTipo()
                            == 'p') {
                        System.out.print(BLACK + BLACK + BLACK + BLACK
                                + LATERALE + "  "
                                + pezzoBianco + " " + LATERALE);
                        pezzoTrovato = true;
                    } else {
                        if (dam.getPezzo(k).getColore() == 'b'
                                && dam.getPezzo(k).getPosizione()
                                == i && dam.getPezzo(k).getTipo() == 'd') {
                            System.out.print(BLACK + BLACK + BLACK + BLACK
                                    + LATERALE + "  "
                                    + damaBianca + " " + LATERALE);
                            pezzoTrovato = true;
                        } else {
                            if (dam.getPezzo(k).getColore() == 'n'
                                    && dam.getPezzo(k).getPosizione()
                                    == i && dam.getPezzo(k).getTipo() == 'p') {
                                System.out.print(BLACK + BLACK + BLACK + BLACK
                                        + LATERALE + "  "
                                        + pezzoNero + " " + LATERALE);
                                pezzoTrovato = true;
                            } else {
                                if (dam.getPezzo(k).getColore() == 'n'
                                        && dam.getPezzo(k).getPosizione()
                                        == i && dam.getPezzo(k).getTipo()
                                        == 'd') {
                                    System.out.print(BLACK + BLACK + BLACK
                                            + BLACK + LATERALE + "  " + damaNera
                                            + " " + LATERALE);
                                    pezzoTrovato = true;
                                }
                            }
                        }
                    }
                    k++;
                }
                if (!pezzoTrovato) {
                    System.out.print(BLACK + BLACK + BLACK + BLACK + LATERALE
                            + "    " + LATERALE);
                }
                j++;
                i++;
            }
            System.out.print("\n");
            if (ultimaRiga < tre) {
                System.out.print(CENTROSINISTRA);
                for (int ii = 0; ii < sette; ii++) {
                    System.out.print(PIATTO + PIATTO + PIATTO + PIATTO
                            + CENTRALE);
                }
                System.out.println(PIATTO + PIATTO + PIATTO + PIATTO
                        + CENTRODESTRA);
            } else {
                System.out.print(BASSOSINISTRA);
                for (int ii = 0; ii < sette; ii++) {
                    System.out.print(PIATTO + PIATTO + PIATTO + PIATTO + BASSO);
                }
                System.out.println(PIATTO + PIATTO + PIATTO + PIATTO
                        + BASSODESTRA);
            }
            ultimaRiga++;
        }
    }

    /**
     * Mostra le prese del bianco e del nero al comando prese.
     * @param dam damiera da cui vedremo il numero di prese;
     */
    public static void mostraPrese(final Damiera dam) {
        String pezzoBianco = "\u26C2";
        String damaBianca = "\u26C3";
        String pezzoNero = "\u26C0";
        String damaNera = "\u26C1";
        final int dodici = 12;
        final int ventiquattro = 24;
        System.out.print("Bianco: ");
        int i = 0;
        while (i < dodici) {
            if (dam.getPezzo(i).isPresa()) {
                if (dam.getPezzo(i).getTipo() == 'd') {
                    System.out.print(damaNera);
                } else {
                    System.out.print(pezzoNero);
                }
            }
            i++;
        }
        System.out.print("\n");
        System.out.print("Nero: ");
        while (i < ventiquattro) {
            if (dam.getPezzo(i).isPresa()) {
                if (dam.getPezzo(i).getTipo() == 'd') {
                    System.out.print(damaBianca);
                } else {
                    System.out.print(pezzoBianco);
                }
            }
            i++;
        }
        System.out.print("\n");
    }

    /**
     * Stampa le mosse effettuate durante tutta la partita.
     * @param mosseEffettuate array in cui abbiamo salvato tutte le mosse;
     */
    public static void mostraMosse(final ArrayList<String> mosseEffettuate) {
        int i = 0;
        while (i < mosseEffettuate.size()) {
            if (i % 2 == 0) {
                System.out.println("B " + mosseEffettuate.get(i));
            } else {
                System.out.println("N " + mosseEffettuate.get(i));
            }
            i++;
        }
        if (i == 0) {
            Messaggi.mosseAssenti();
        }
    }

    /**
     * Stampa il logo del programma.
     */
    public static void logo() {
        System.out.println("\n      " + ALTOSINISTRA + PIATTO + ALTODESTRA
                + "\n" + "      " + LATERALE + " " + LATERALE + "\n"
                + "      " + LATERALE + " " + LATERALE + "\n"
                + ALTOSINISTRA + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + BASSODESTRA + " " + LATERALE + ALTOSINISTRA + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + ALTODESTRA + ALTOSINISTRA + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + ALTODESTRA + ALTOSINISTRA + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + ALTODESTRA + "\n"
                + LATERALE + " " + ALTOSINISTRA + PIATTO + PIATTO + PIATTO
                + ALTODESTRA + " " + LATERALE + BASSOSINISTRA + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + ALTODESTRA + " "
                + LATERALE + LATERALE + " " + ALTOSINISTRA + PIATTO + ALTODESTRA
                + " " + ALTOSINISTRA + PIATTO + ALTODESTRA + " " + LATERALE
                + BASSOSINISTRA + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + ALTODESTRA + " " + LATERALE + "\n" + LATERALE + " " + LATERALE
                + "   " + LATERALE + " " + LATERALE + ALTOSINISTRA + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + BASSODESTRA + " "
                + LATERALE + LATERALE + " " + LATERALE + " " + LATERALE + " "
                + LATERALE + " " + LATERALE + " " + LATERALE + ALTOSINISTRA
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO + BASSODESTRA + " "
                + LATERALE + "\n" + LATERALE + " " + LATERALE + "   " + LATERALE
                + " " + LATERALE + LATERALE + " " + ALTOSINISTRA + PIATTO
                + PIATTO + PIATTO + ALTODESTRA + " " + LATERALE + LATERALE + " "
                + LATERALE + " " + LATERALE + " " + LATERALE + " " + LATERALE
                + " " + LATERALE + LATERALE + " " + ALTOSINISTRA + PIATTO
                + PIATTO + PIATTO + ALTODESTRA + " " + LATERALE + "\n"
                + LATERALE + " " + BASSOSINISTRA + PIATTO + PIATTO + PIATTO
                + BASSODESTRA + " " + LATERALE + LATERALE + " " + BASSOSINISTRA
                + PIATTO + PIATTO + PIATTO + BASSODESTRA + " " + LATERALE
                + LATERALE + " " + LATERALE + " " + LATERALE + " " + LATERALE
                + " " + LATERALE + " " + LATERALE + LATERALE + " "
                + BASSOSINISTRA + PIATTO + PIATTO + PIATTO + BASSODESTRA + " "
                + LATERALE + "\n" + BASSOSINISTRA + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + PIATTO + PIATTO + BASSODESTRA
                + BASSOSINISTRA + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + PIATTO + PIATTO + BASSODESTRA + BASSOSINISTRA + PIATTO
                + BASSODESTRA + " " + BASSOSINISTRA + PIATTO + BASSODESTRA
                + " " + BASSOSINISTRA + PIATTO + BASSODESTRA + BASSOSINISTRA
                + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO + PIATTO
                + BASSODESTRA + " Widenius Group");
    }
}
