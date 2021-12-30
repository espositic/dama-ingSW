package it.uniba.main.Utility;

/**
 * Classe di tipo: Control.
 * La classe 'GestioneStringhe' si occupa di:
 * -Estrarre la posizione iniziale o finale
 * (sotto forma di intero) dalle stringa passata come comando.
 */

public final class GestioneStringhe {

    private GestioneStringhe() { }

    /**
     * Estrae dalla stringa mossa la posizione iniziale o finale.
     * @param tipoPosizione indica quale posizione viene
     * chiesta alla funzione;
     * @param mossa la mossa da cui dobbiamo estrarre la posizione;
     * @return la posizione iniziale o finale in base a tipoPosizione;
     */
    public static int estraePosizione(final char tipoPosizione,
                                      final String mossa) {
        final int tre = 3;
        final int quattro = 4;
        final int dieci = 10;
        final int cinque = 5;
        char cifra1;
        char cifra2;
        char cifra3;
        char cifra4;
        int posizioneIniziale = 0;
        int posizioneFinale = 0;

        switch (mossa.length()) {
            case(tre):
                cifra2 = mossa.charAt(0);
                posizioneIniziale = cifra2 - '0';
                cifra4 = mossa.charAt(2);
                posizioneFinale = cifra4 - '0';
                break;

            case(quattro):
                if ((mossa.charAt(1) == '-') || (mossa.charAt(1) == 'x')) {
                    cifra2 = mossa.charAt(0);
                    posizioneIniziale = cifra2 - '0';
                    cifra3 = mossa.charAt(2);
                    cifra4 = mossa.charAt(tre);
                    posizioneFinale = ((cifra3 - '0') * dieci) + (cifra4 - '0');
                } else {
                    cifra1 = mossa.charAt(0);
                    cifra2 = mossa.charAt(1);
                    posizioneIniziale = ((cifra1 - '0') * dieci)
                            + (cifra2 - '0');
                    cifra3 = mossa.charAt(tre);
                    posizioneFinale = ((cifra3 - '0'));
                }
                break;

            case(cinque):
                cifra1 = mossa.charAt(0);
                cifra2 = mossa.charAt(1);
                posizioneIniziale = ((cifra1 - '0') * dieci) + (cifra2 - '0');
                cifra3 = mossa.charAt(tre);
                cifra4 = mossa.charAt(quattro);
                posizioneFinale = ((cifra3 - '0') * dieci) + (cifra4 - '0');
                break;
            default:
                break;
        }

        int posizione = 0;
        if (tipoPosizione == 'i') {
            posizione = posizioneIniziale;
        } else {
            if (tipoPosizione == 'f') {
                posizione = posizioneFinale;
            }
        }
        return posizione;
    }
    /**
     * Estrae dalla stringa mossa la posizione iniziale o finale.
     * @param tipoPosizione indica quale posizione viene
     * chiesta alla funzione;
     * @param mossa la mossa da cui dobbiamo estrarre la posizione;
     * @return la posizione iniziale o finale in base a tipoPosizione;
     */
    public static int estraePosizione2(final char tipoPosizione,
                                       final String mossa) {
        int posIniziale = 0;
        int posIntermedia = 0;
        int posIntermedia2 = 0;
        int posFinale = 0;
        final int tre = 3;
        final int sei = 6;
        final int quattro = 4;
        final int dieci = 10;
        final int cinque = 5;
        final int sette = 7;
        final int otto = 8;
        final int nove = 9;
        final int undici = 11;

        switch (mossa.length()) {
            case(sei):
                if ((mossa.charAt(1) == 'x') && (mossa.charAt(tre) == 'x')) {
                    posIniziale = mossa.charAt(0) - '0';
                    posIntermedia = mossa.charAt(2) - '0';
                    posFinale = (mossa.charAt(quattro) - '0') * dieci
                            + (mossa.charAt(cinque) - '0');
                } else {
                    posIniziale = (mossa.charAt(0) - '0') * dieci
                            + (mossa.charAt(1) - '0');
                    posIntermedia = mossa.charAt(tre) - '0';
                    posFinale = mossa.charAt(cinque) - '0';
                }
                break;
            case(sette):
                if ((mossa.charAt(1) == 'x')
                        && (mossa.charAt(quattro) == 'x')) {
                    posIniziale = mossa.charAt(0) - '0';
                    posIntermedia = (mossa.charAt(2) - '0') * dieci
                            + (mossa.charAt(tre) - '0');
                    posFinale = (mossa.charAt(cinque) - '0') * dieci
                            + (mossa.charAt(sei) - '0');
                } else {
                    posIniziale = (mossa.charAt(0) - '0') * dieci
                            + (mossa.charAt(1) - '0');
                    posIntermedia = (mossa.charAt(tre) - '0') * dieci
                            + (mossa.charAt(quattro) - '0');
                    posFinale = mossa.charAt(sei) - '0';
                }
                break;
            case(otto):
                posIniziale = (mossa.charAt(0) - '0')
                        * dieci + mossa.charAt(1) - '0';
                posIntermedia = (mossa.charAt(tre) - '0')
                        * dieci + mossa.charAt(quattro) - '0';
                posFinale = (mossa.charAt(sei) - '0')
                        * dieci + mossa.charAt(sette) - '0';
                break;
            case(nove):
                if ((mossa.charAt(1) == 'x') && (mossa.charAt(tre) == 'x')) {
                    posIniziale = mossa.charAt(0) - '0';
                    posIntermedia = mossa.charAt(2) - '0';
                    posIntermedia2 = (mossa.charAt(quattro) - '0') * dieci
                            + (mossa.charAt(cinque) - '0');
                    posFinale = (mossa.charAt(sette) - '0') * dieci
                            + (mossa.charAt(otto) - '0');
                } else {
                    posIniziale = (mossa.charAt(0) - '0') * dieci
                            + (mossa.charAt(1) - '0');
                    posIntermedia = (mossa.charAt(tre) - '0') * dieci
                            + (mossa.charAt(quattro) - '0');
                    posIntermedia2 = (mossa.charAt(sei) - '0');
                    posFinale = mossa.charAt(otto) - '0';
                }
                break;
            case(dieci):
                if ((mossa.charAt(1) == 'x')
                        && (mossa.charAt(quattro) == 'x')) {
                    posIniziale = mossa.charAt(0) - '0';
                    posIntermedia = (mossa.charAt(2) - '0') * dieci
                            + (mossa.charAt(tre) - '0');
                    posIntermedia2 = (mossa.charAt(cinque) - '0') * dieci
                            + (mossa.charAt(sei) - '0');
                    posFinale = (mossa.charAt(otto) - '0') * dieci
                            + (mossa.charAt(nove) - '0');
                } else {
                    posIniziale = (mossa.charAt(0) - '0') * dieci
                            + (mossa.charAt(1) - '0');
                    posIntermedia = (mossa.charAt(tre) - '0') * dieci
                            + (mossa.charAt(quattro) - '0');
                    posIntermedia2 = (mossa.charAt(sei) - '0') * dieci
                            + (mossa.charAt(sette) - '0');
                    posFinale = mossa.charAt(nove) - '0';
                }
                break;
            case(undici):
                posIniziale = (mossa.charAt(0) - '0') * dieci
                        + (mossa.charAt(1) - '0');
                posIntermedia = (mossa.charAt(tre) - '0') * dieci
                        + (mossa.charAt(quattro) - '0');
                posIntermedia2 = (mossa.charAt(sei) - '0') * dieci
                        + (mossa.charAt(sette) - '0');
                posFinale = (mossa.charAt(nove) - '0') * dieci
                        + (mossa.charAt(dieci) - '0');
                break;
            default:
                break;
        }
        int posizione = 0;
        switch (tipoPosizione) {
            case('i'):
                posizione = posIniziale;
                break;

            case('j'):
                posizione = posIntermedia;
                break;

            case('k'):
                posizione = posIntermedia2;
                break;

            case('f'):
                posizione = posFinale;
                break;
            default:
                break;
        }
        return posizione;
    }
}
