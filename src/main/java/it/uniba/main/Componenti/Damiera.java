package it.uniba.main.Componenti;

/**
 * Classe di tipo: Entity.
 * la classe damiera si occupa  di costruire la damiera,
 * restituire un pezzo richiesto in una determinata posizione
 * dell'array o di restituire la posizione nell'array
 * sapendo la posizione sulla damiera.
 */
public class Damiera {
    /**
     * Numero dei pezzi presenti sulla damiera.
     */
    private static final int NPEZZI = 24;
    /**
     * Inizializzazione dei pezzi della damiera.
     */
    private Pezzo[] pezzi = new Pezzo[NPEZZI];
    /**
     * Costante 12.
     */
    private static final int DODICI = 12;
    /**
     * Costante 21.
     */
    private static final int VENTUNO = 21;
    /**
     * Costante 24.
     */
    private static final int VENTIQUATTRO = 24;
    /**
     * Costante 24.
     */
    private static final int VENTITRE = 23;

    /**
     *  Crea i pezzi che compongono la damiera.
     */
    public Damiera() {
        int i = 0;
        int j = 1;
        while (i < DODICI) {
            pezzi[i] = new Pezzo('n', j);
            i++;
            j++;
        }
        j = VENTUNO;
        while (i < VENTIQUATTRO) {
            pezzi[i] = new Pezzo('b', j);
            i++;
            j++;
        }
    }


    /**
     * Restituisce il pezzo numero numPezzo.
     * @param numPezzo posizione del pezzo nell'array;
     * @return pezzo in poszione numPezzo;
     */
    public Pezzo getPezzo(final int numPezzo) {
        return pezzi[numPezzo];
    }


    /**
     * Data una posizione sulla damiera restituisce il numero del pezzo.
     * Se nessun pezzo la occupa restituisce -1;
     * @param dam damiera su cui effetturare il controllo;
     * @param pos posizione su cui effettuare il controllo;
     * @return la posizoone del pezzo se esiste, -1 altrimenti;
     */
    public int trovaPezzo(final Damiera dam, final int pos) {
        int i = 0;
        int pezzo = -1;
        while (i <= VENTITRE && pezzo == -1) {
            if (dam.getPezzo(i).getPosizione() == pos) {
                pezzo = i;
            }
            i++;
        }
        return pezzo;
    }
}


