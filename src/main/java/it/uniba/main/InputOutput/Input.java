package it.uniba.main.InputOutput;
import java.util.Locale;
import java.util.Scanner;
import it.uniba.main.Partita.GestioneTurno;

/**
 * Classe di tipo: Boundary.
 * La classe Input si occupa di:
 * -Richiedere all'utente il comando desiderato;
 * -Chiedere se l'utente vuole abbandonare la partita;
 * -Chiedere se l'utente vuole terminare il gioco;
 */
public final class Input {

    private Input() { }

    /**
     * Chiede un comando all'utente.
     * @return il comando dato dall'utente sottoforma di stringa;
     */
    public static String getComando() {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Inserisci il comando: ");
        String str = sc.nextLine();
        return str;
    }

    /**
     *     Chiede all'utente se è sicuro di voler abbandonare la partita.
     * @param tur turno nel momento in cui viene effettuata la richiesta;
     * @return true se l'utente ha scritto si, false altrimenti;
     */
    public static boolean confermaAbbandono(final GestioneTurno tur) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        boolean rispostaCorretta = false;
        String str;
        while (!rispostaCorretta) {
            System.out.println("Vuoi veramente abbandonare la "
                    + "partita? SI/NO");
            str = sc.nextLine();
            switch (str.toLowerCase(Locale.ROOT)) {
                case("si"):
                    if (tur.getTurno() == 'b') {
                        System.out.println("Il bianco "
                            + "ha abbandonato");
                        Messaggi.stampaVincitore('n');
                    } else {
                        System.out.println("Il nero "
                            + "ha abbandonato");
                        Messaggi.stampaVincitore('b');
                    }
                    return true;
                case("no"):
                    return false;
                default:
                    break;
            }
        }
        return false;
    }

    /**
     *     Chiede all'utente se è sicuro di voler chiudere il gioco.
     *     @return true se l'utente ha scritto si, false altrimenti;
     *     */
    public static boolean confermaChiusura() {
        Scanner sc = new Scanner(System.in, "UTF-8");
        boolean rispostaCorretta = false;
        String str;
        while (!rispostaCorretta) {
            System.out.println("Vuoi veramente chiudere il"
                    + " gioco ? SI/NO");
            str = sc.nextLine();
            switch (str.toLowerCase(Locale.ROOT)) {
                case("si"):
                    System.out.println("Il gioco e' "
                            + "stato chiuso");
                    return true;
                case("no"):
                    return false;
                default:
                    break;
            }
        }
        return false;
    }
}
