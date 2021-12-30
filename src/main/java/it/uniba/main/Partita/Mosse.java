package it.uniba.main.Partita;
import it.uniba.main.Componenti.Damiera;
import it.uniba.main.Utility.GestioneStringhe;
import it.uniba.main.InputOutput.Messaggi;

/**
 * Classe di tipo: Control.
 * La classe 'Mosse' si occupa di:
 * -Effettuare lo spostamento;
 * -Effettuare la presa semplice e multipla;
 */

public class Mosse {
    /**
     * Costante 8.
     */
    private static final int OTTO = 8;
    /**
     * Costante 3.
     */
    private static final int TRE = 3;
    /**
     * Costante 4.
     */
    private static final int QUATTRO = 4;
    /**
     * Costante 33.
     */
    private static final int TRENTATRE = 33;

    /**
     * Va ad effettuare lo spostamento semplice.
     * @param dam istanza di damiera;
     * @param contr istanza di controlli;
     * @param mossa comando dell'utente;
     */
    public void spostamentoSemplice(final Damiera dam, final Controlli contr,
                                    final String mossa) {
        int posiniziale = GestioneStringhe.estraePosizione('i', mossa);
        int posfinale = GestioneStringhe.estraePosizione('f', mossa);
        dam.getPezzo(dam.trovaPezzo(dam, posiniziale)).setPosizione(posfinale);
        contr.controllaDama(dam, posfinale);
        Messaggi.spostamentoEffettuato();
    }

    /**
     * Va ad effettuare la presa semplice.
     * @param dam istanza di damiera;
     * @param contr istanza di controlli;
     * @param mossa comando dell'utente;
     */
    public void presaSemplice(final Damiera dam, final Controlli contr,
                              final String mossa) {
        int posI = GestioneStringhe.estraePosizione('i', mossa);
        int posF = GestioneStringhe.estraePosizione('f', mossa);
        int posM;
        if (posI % OTTO == 1 || posI % OTTO == 2
                || posI % OTTO == TRE || posI % OTTO == QUATTRO) {
            posM = (posI + posF) / 2;
        } else {
            posM = (posI + posF) / 2 + 1;
        }
        dam.getPezzo(dam.trovaPezzo(dam, posI)).setPosizione(posF);
        dam.getPezzo(dam.trovaPezzo(dam, posM)).setPresa();
        dam.getPezzo(dam.trovaPezzo(dam, posM)).setPosizione(TRENTATRE);
        contr.controllaDama(dam, posF);
    }

    /**
     * Va ad effettuare la presa multipla su 2 pedine avversarie.
     * @param dam istanza di damiera;
     * @param contr istanza di controlli;
     * @param mossa comando dell'utente;
     */
    public void presaMultipla1(final Damiera dam, final Controlli contr,
                               final String mossa) {
        String mossa1 = "" + GestioneStringhe.estraePosizione2('i', mossa)
                + 'x' + GestioneStringhe.estraePosizione2('j', mossa);
        String mossa2 = "" + GestioneStringhe.estraePosizione2('j', mossa)
                + 'x' + GestioneStringhe.estraePosizione2('f', mossa);
        presaSemplice(dam, contr, mossa1);
        presaSemplice(dam, contr, mossa2);
    }

    /**
     * Va ad effettuare la presa multipla su 3 pedine avversarie.
     * @param dam istanza di damiera;
     * @param contr istanza di controlli;
     * @param mossa comando dell'utente;
     */
    public void presaMultipla2(final Damiera dam, final Controlli contr,
                               final String mossa) {
        String mossa1 = "" + GestioneStringhe.estraePosizione2('i', mossa)
                + 'x' + GestioneStringhe.estraePosizione2('j', mossa);
        String mossa2 = "" + GestioneStringhe.estraePosizione2('j', mossa)
                + 'x' + GestioneStringhe.estraePosizione2('k', mossa);
        String mossa3 = "" + GestioneStringhe.estraePosizione2('k', mossa)
                + 'x' + GestioneStringhe.estraePosizione2('f', mossa);
        presaSemplice(dam, contr, mossa1);
        presaSemplice(dam, contr, mossa2);
        presaSemplice(dam, contr, mossa3);
    }
}
