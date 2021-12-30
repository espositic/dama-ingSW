package it.uniba.main.Partita;
import it.uniba.main.Componenti.Damiera;
import it.uniba.main.Componenti.Pezzo;
import it.uniba.main.InputOutput.Messaggi;
import it.uniba.main.Utility.GestioneStringhe;
import java.util.regex.Pattern;

/**
 * Classe di tipo: Control.
 * La classe Controlli si occupa di:
 * -Verificare che la stringa inserita dall'utente sia una mossa;
 * -Verificare la validità delle varie mosse;
 * -Verificare lo spostamento in base a posizione iniziale e finale
 * e verificare che i dati siano corretti(per permettere lo spostamento);
 * -Verificare (in base ai parametri di input) se un pezzo si trova o
 * meno in una determinata posizione;
 * -Verificare se un pezzo può diventare dama (modificando poi
 * successivamente il pezzo in dama);
 * -Verificare la validità delle varie prese, sia semplici che multiple
 * (se multiple verifica che siano a 3 o a 4 termini)
 */

public class Controlli {
    /**
     * Costante 33.
     */
    private static final int TRENTATRE = 33;
    /**
     * Costante 25.
     */
    private static final int VENTICINQUE = 25;
    /**
     * Costante 8.
     */
    private static final int OTTO = 8;
    /**
     * Costante 4.
     */
    private static final int QUATTRO = 4;
    /**
     * Costante 3.
     */
    private static final int TRE = 3;
    /**
     * Costante 26.
     */
    private static final int VENTISEI = 26;
    /**
     * Costante 5.
     */
    private static final int CINQUE = 5;
    /**
     * Costante 29.
     */
    private static final int VENTINOVE = 29;
    /**
     * Costante 32.
     */
    private static final int TRENTADUE = 32;
    /**
     * Costante 12.
     */
    private static final int DODICI = 12;
    /**
     * Costante 16.
     */
    private static final int SEDICI = 16;
    /**
     * Costante 20.
     */
    private static final int VENTI = 20;
    /**
     * Costante 24.
     */
    private static final int VENTIQUATTRO = 24;
    /**
     * Costante 27.
     */
    private static final int VENTISETTE = 27;
    /**
     * Costante 28.
     */
    private static final int VENTOTTO = 28;
    /**
     * Costante 30.
     */
    private static final int TRENTA = 30;
    /**
     * Costante 31.
     */
    private static final int TRENTUNO = 31;
    /**
     * Costante 9.
     */
    private static final int NOVE = 9;
    /**
     * Costante 13.
     */
    private static final int TREDICI = 13;
    /**
     * Costante 17.
     */
    private static final int DICIASSETTE = 17;
    /**
     * Costante 21.
     */
    private static final int VENTUNO = 21;
    /**
     * Costante 6.
     */
    private static final int SEI = 6;
    /**
     * Costante 7.
     */
    private static final int SETTE = 7;

    /**
     * Controlla che la stringa str sia una mossa di spostamento o presa.
     * @param st stringa da controllare;
     * @return stringa modificata in base al tipo di mossa
     */
    public static String isMossa(final String st) {
        String str = st;
        if (Pattern.matches("[0-9]{1,2}-[0-9]{1,2}", str)) {
            str = "spostamentoSemplice";
        } else {
            if (Pattern.matches("[0-9]{1,2}[x][0-9]{1,2}", str)) {
                str = "spostamentoPresa";
            } else {
                if (Pattern.matches("[0-9]{1,2}[x][0-9]{1,2}[x][0-9]{1,2}",
                        str)) {
                    str = "presaMultipla1";
                } else {
                    if (Pattern.matches("[0-9]{1,2}[x][0-9]{1,2}"
                            + "[x][0-9]{1,2}[x][0-9]{1,2}", str)) {
                        str = "presaMultipla2";
                    }
                }
            }
        }
        return str;
    }

    /**
     * Controlla la validità della mossa di spostamento.
     * @param dam damiera da controllare;
     * @param mossa mossa da controllare;
     * @param tur controllo del colore del turno;
     * @return true se lo spostamento é lecito, false altrimenti;
     */
    public boolean controllaMossaSpostamento(final Damiera dam,
           final GestioneTurno tur, final String mossa) {
        int posI = GestioneStringhe.estraePosizione('i', mossa);
        int posF = GestioneStringhe.estraePosizione('f', mossa);
        // controlla che sia stata inserita come posizione
        // iniziale una casella esistente
        if (posI > 0 && posI < TRENTATRE) {
            // controlla che sia stata inserita come posizione
            // finale una casella esistente
            if (posF > 0 && posF < TRENTATRE) {
                // controlla che posizione iniziale e finale siano uguali
                if (posI != posF) {
                    // controlla che in posizione iniziale ci sia un pezzo
                    if ((dam.trovaPezzo(dam, posI) != -1)) {
                        // controlla che in posizione iniziale ci sia un pezzo
                        // appartenente al giocatore che sta effettuando
                        // la mossa
                        if (dam.getPezzo(dam.trovaPezzo(dam,
                                posI)).getColore() == tur.getTurno()) {
                            // controlla se il pezzo è una dama o una pedina e
                            // permette i relativi spostamenti consentiti
                            if (dam.getPezzo(dam.trovaPezzo(dam,
                                    posI)).getTipo() == 'd') {
                                // controlla che lo spostamento sia valido
                                if (controllaSpostamento(posI, posF)
                                        || controllaSpostamento(posF, posI)) {
                                    // controlla che la posizione finale
                                    // sia libera
                                    if (dam.trovaPezzo(dam, posF) == -1) {
                                        return true;
                                    } else {
                                        Messaggi.posizioneOccupata(mossa);
                                        Messaggi.spostamentoNonEffettuato();
                                        return false;
                                    }
                                } else {
                                    Messaggi.posIrrSpostamento(mossa);
                                    Messaggi.spostamentoNonEffettuato();
                                    return false;
                                }
                            } else {
                                if (tur.getTurno() == 'n') {
                                    // controlla che lo spostamento sia valido
                                    if (controllaSpostamento(posI, posF)) {
                                        //controlla che la posizione finale
                                        // sia libera
                                        if (dam.trovaPezzo(dam, posF) == -1) {
                                            return true;
                                        } else {
                                            Messaggi.
                                            posizioneOccupata(mossa);
                                            Messaggi.spostamentoNonEffettuato();
                                            return false;
                                        }
                                    } else {
                                        Messaggi.posIrrSpostamento(mossa);
                                        Messaggi.spostamentoNonEffettuato();
                                        return false;

                                    }
                                } else {
                                    // controlla che lo spostamento sia valido
                                    if (controllaSpostamento(posF, posI)) {
                                        //controlla che la posizione finale
                                        // sia libera
                                        if (dam.trovaPezzo(dam, posF) == -1) {
                                            return true;
                                        } else {
                                            Messaggi.posizioneOccupata(mossa);
                                            Messaggi.spostamentoNonEffettuato();
                                            return false;
                                        }
                                    } else {
                                        Messaggi.posIrrSpostamento(mossa);
                                        Messaggi.spostamentoNonEffettuato();
                                        return false;
                                    }
                                }
                            }
                        } else {
                            Messaggi.pezzoAssente(mossa);
                            Messaggi.spostamentoNonEffettuato();
                            return false;
                        }
                    } else {
                        Messaggi.pezzoAssente(mossa);
                        Messaggi.spostamentoNonEffettuato();
                        return false;
                    }
                } else {
                    Messaggi.posizioniUguali();
                    Messaggi.spostamentoNonEffettuato();
                    return false;
                }
            } else {
                Messaggi.casellaInesistente(mossa, 'f');
                Messaggi.spostamentoNonEffettuato();
                return false;
            }
        } else {
            Messaggi.casellaInesistente(mossa, 'i');
            Messaggi.spostamentoNonEffettuato();
            return false;
        }
    }

    /**
     * Controlla la validità delle posizioni relativi allo spostamento.
     * @param pos1 posizione iniziale;
     * @param pos2 posizione finale;
     * @return true se lo spostamento é lecito, false altrimenti;
     */
    public boolean controllaSpostamento(final int pos1, final int pos2) {
        boolean valido = false;
        int i;
        int j;

        //convalida gli spostamenti da e per le caselle 1, 9, 17, 25
        for (i = 1; i <= VENTICINQUE; i = i + OTTO) {
            if ((pos1 == i) && (pos2 == pos1 + QUATTRO)) {
                valido = true;
            }
        }

        //convalida gli spostamenti da e per le caselle
        // che non sono a contatto con i bordi laterali
        j = 0;
        while (j < TRE && !valido) {
            for (i = 2 + j; i <= VENTISEI + j; i = i + OTTO) {
                if ((pos1 == i && pos2 == pos1 + TRE)
                        || (pos1 == i && pos2 == pos1 + QUATTRO)) {
                    valido = true;
                }
            }
            j++;
        }
        j = 0;
        while (j < TRE && !valido) {
            for (i = CINQUE + j; i <= VENTINOVE + j; i = i + OTTO) {
                if ((pos1 == i && pos2 == pos1 + QUATTRO)
                        || (pos1 == i && pos2 == pos1 + CINQUE)) {
                    valido = true;
                }
            }
            j++;
        }

        //convalida gli spostamenti da e per le caselle 8, 16, 24, 32
        for (i = OTTO; i <= TRENTADUE; i = i + OTTO) {
            if ((pos1 == i) && (pos2 == pos1 + QUATTRO)) {
                valido = true;
            }
        }
        return valido;
    }

    /**
     * Controlla la validità della mossa di presa.
     * @param dam damiera su cui effettuare il controllo;
     * @param tur turno in cui effettuiamo il controllo;
     * @param ms mossa su cui effettuare il controllo;
     * @return true se la mossa é fattibile, false altrimenti;
     */
    public boolean controllaMossaPresaSemplice(final Damiera dam,
        final GestioneTurno tur, final String ms) {
        boolean valido = false;
        int posI = GestioneStringhe.estraePosizione('i', ms);
        int posF = GestioneStringhe.estraePosizione('f', ms);
        int posM;
        if (posI % OTTO == 1 || posI % OTTO == 2
                || posI % OTTO == TRE || posI % OTTO == QUATTRO) {
            posM = (posI + posF) / 2;
        } else {
            posM = (posI + posF) / 2 + 1;
        }
        // controlla che sia stata inserita come
        // posizione iniziale una casella esistente
        if (posI > 0 && posI < TRENTATRE) {
            // controlla che sia stata inserita come
            // posizione finale una casella esistente
            if (posF > 0 && posF < TRENTATRE) {
                // controllo posizione iniziale diversa da quella finale
                if (posI != posF) {
                    // controllo posizione iniziale che non deve essere vuota
                    if (dam.trovaPezzo(dam, posI) != -1) {
                        // controllo del colore del pezzo in posizione iniziale
                        if (dam.getPezzo(dam.trovaPezzo(dam, posI)).getColore()
                                == tur.getTurno()) {
                            // controllo posizione finale che deve essere vuota
                            if (dam.trovaPezzo(dam, posF) == -1) {
                                //controllo validitá della presa in base alla
                                // posizione intermedia
                                if ((posI == posM - QUATTRO && posF == posM
                                        + CINQUE) || (posI == posM - TRE
                                        && posF == posM + QUATTRO) || (posF
                                        == posM - QUATTRO && posI == posM
                                        + CINQUE) || (posF == posM - TRE
                                        && posI == posM + QUATTRO) || (posI
                                        == posM - CINQUE && posF == posM
                                        + QUATTRO) || (posI == posM - QUATTRO
                                        && posF == posM + TRE) || (posF == posM
                                        - CINQUE && posI == posM + QUATTRO)
                                        || (posF == posM - QUATTRO && posI
                                        == posM + TRE)) {
                                    // controllo posizione intermedia che
                                    // non deve essere vuota
                                    if (dam.trovaPezzo(dam, posM) != -1) {
                                        // controllo del colore del pezzo in
                                        // posizione intermedia
                                        if (dam.getPezzo(dam.trovaPezzo(dam,
                                                posM)).getColore()
                                                != tur.getTurno()) {
                                            // controllo dama
                                            if (dam.getPezzo(dam.trovaPezzo(dam,
                                                    posI)).getTipo() == 'd') {
                                                if (ctrlPrsSemplice(posI,
                                                    posF) || ctrlPrsSemplice(
                                                    posF, posI)) {
                                                    valido = true;
                                                }
                                            } else {
                                                // controllo colore
                                                if (tur.getTurno() == 'n'
                                                    && dam.getPezzo(
                                                        dam.trovaPezzo(dam,
                                                        posM)).getTipo()
                                                        != 'd') {
                                                    if ((ctrlPrsSemplice(
                                                        posI, posF)
                                                        || ctrlPrsSemplice(
                                                        posF, posI))
                                                        && posI < posF) {
                                                            valido = true;
                                                    } else {
                                                        Messaggi.pIrPrs(ms);
                                                        Messaggi.prNonEff();
                                                        valido = false;
                                                    }
                                                } else {
                                                    if (tur.getTurno() == 'b'
                                                        && dam.getPezzo(
                                                        dam.trovaPezzo(dam,
                                                        posM)).getTipo()
                                                            != 'd') {
                                                        if ((ctrlPrsSemplice(
                                                            posI, posF)
                                                            || ctrlPrsSemplice(
                                                            posF, posI))
                                                            && posI > posF) {
                                                            valido = true;
                                                        } else {
                                                            Messaggi.pIrPrs(ms);
                                                            Messaggi.prNonEff();
                                                            valido = false;
                                                        }
                                                    } else {
                                                        Messaggi.impPrDama();
                                                        Messaggi.prNonEff();
                                                    }
                                                }
                                            }
                                        } else {
                                            Messaggi.noPzNemPerPresa(posM);
                                            Messaggi.prNonEff();
                                            valido = false;
                                        }
                                    } else {
                                        Messaggi.noPzNemPerPresa(posM);
                                        Messaggi.prNonEff();
                                        valido = false;
                                    }
                                } else {
                                    Messaggi.pIrPrs(ms);
                                    Messaggi.prNonEff();
                                    valido = false;
                                }
                            } else {
                                Messaggi.posizioneOccupata(ms);
                                Messaggi.prNonEff();
                                valido = false;
                            }
                        } else {
                            Messaggi.pezzoAssente(ms);
                            Messaggi.prNonEff();
                            valido = false;
                        }
                    } else {
                        Messaggi.pezzoAssente(ms);
                        Messaggi.prNonEff();
                        valido = false;
                    }
                } else {
                    Messaggi.posizioniUguali();
                    Messaggi.prNonEff();
                    valido = false;

                }
            } else {
                Messaggi.casellaInesistente(ms, 'f');
                Messaggi.spostamentoNonEffettuato();
                valido = false;
            }
        } else {
            Messaggi.casellaInesistente(ms, 'i');
            Messaggi.spostamentoNonEffettuato();
            valido = false;
        }
        return valido;
    }

    /**
     * Controlla se l'utente puó effettuare una determinata presa.
     * @param pos1 posizione di partenza;
     * @param pos2 posizione di arrivo;
     * @return true se si puó effettuare la presa semplice, false altrimenti.
     */
    public boolean ctrlPrsSemplice(final int pos1, final int pos2) {
        boolean valido = false;

        if (pos1 != QUATTRO && pos1 != OTTO && pos1 != DODICI && pos1 != SEDICI
                && pos1 != VENTI && pos1 != VENTIQUATTRO && pos1 != VENTICINQUE
                && pos1 != VENTISEI && pos1 != VENTISETTE && pos1 != VENTOTTO
                && pos1 != VENTINOVE && pos1 != TRENTA && pos1 != TRENTUNO
                && pos1 != TRENTADUE && pos1 == pos2 + NOVE) {
            valido = true;
        }
        if (pos1 != 1 && pos1 != CINQUE && pos1 != NOVE && pos1 != TREDICI
                && pos1 != DICIASSETTE && pos1 != VENTUNO && pos1 != VENTICINQUE
                && pos1 != VENTISEI && pos1 != VENTISETTE && pos1 != VENTOTTO
                && pos1 != VENTINOVE && pos1 != TRENTA && pos1 != TRENTUNO
                && pos1 != TRENTADUE && pos1 == pos2 + SETTE) {
            valido = true;
        }
        if (pos1 != 1 && pos1 != 2 && pos1 != TRE && pos1 != QUATTRO
                && pos1 != CINQUE && pos1 != SEI && pos1 != SETTE
                && pos1 != OTTO && pos1 != NOVE && pos1 != TREDICI
                && pos1 != DICIASSETTE && pos1 != VENTUNO && pos1 != VENTICINQUE
                && pos1 != VENTINOVE && pos1 == pos2 - SETTE) {
            valido = true;
        }
        if (pos1 != 1 && pos1 != 2 && pos1 != TRE && pos1 != QUATTRO
                && pos1 != CINQUE && pos1 != SEI && pos1 != SETTE
                && pos1 != OTTO && pos1 != DODICI && pos1 != SEDICI
                && pos1 != VENTI && pos1 != VENTIQUATTRO && pos1 != VENTOTTO
                && pos1 != TRENTADUE && pos1 == pos2 - NOVE) {
            valido = true;
        }
        return valido;
    }

    /**
     * Controlla la validita' della mossa di presa multipla a 3 termini.
     * @param dam damiera su cui effettuare il controllo;
     * @param tur turno in cui ci troviamo;
     * @param mossa mossa su cui effettuare il controllo;
     * @return true se é possibile effettuare la presa o meno;
     */
    public boolean controllaMossaPresaMultipla1(final Damiera dam,
        final GestioneTurno tur, final String mossa) {
        String mossa1 = "" + GestioneStringhe.estraePosizione2('i', mossa)
                + 'x' + GestioneStringhe.estraePosizione2('j', mossa);
        String mossa2 = "" + GestioneStringhe.estraePosizione2('j', mossa)
                + 'x' + GestioneStringhe.estraePosizione2('f', mossa);
        boolean dama;

        if ((dam.trovaPezzo(dam,
                GestioneStringhe.estraePosizione2('i', mossa)) != -1)) {
            Pezzo pezzo = dam.getPezzo(dam.trovaPezzo(dam,
                    GestioneStringhe.estraePosizione2('i', mossa)));
            char colore = pezzo.getColore();
            if (pezzo.getTipo() == 'd') {
                dama = true;
            } else {
                dama = false;
            }
            return controllaMossaPresaSemplice(dam, tur, mossa1)
                    && controllaMossaPresa(dam, tur, mossa2, colore, dama);
        } else {
            return false;
        }
    }

    /**
     * Controlla la validita' della mossa di presa multipla a 4 termini.
     * @param dam damiera su cui effettuare il controllo;
     * @param tur turno in cui ci troviamo;
     * @param mossa mossa su cui effettuare il controllo;
     * @return true se é possibile effettuare la presa o meno;
     */
    public boolean controllaMossaPresaMultipla2(final Damiera dam,
        final GestioneTurno tur, final String mossa) {
        String mossa1 = "" + GestioneStringhe.estraePosizione2('i', mossa)
                + 'x' + GestioneStringhe.estraePosizione2('j', mossa);
        String mossa2 = "" + GestioneStringhe.estraePosizione2('j', mossa)
                + 'x' + GestioneStringhe.estraePosizione2('k', mossa);
        String mossa3 = "" + GestioneStringhe.estraePosizione2('k', mossa)
                + 'x' + GestioneStringhe.estraePosizione2('f', mossa);
        boolean dama;

        if ((dam.trovaPezzo(dam,
                GestioneStringhe.estraePosizione2('i', mossa)) != -1)) {
            Pezzo pezzo = dam.getPezzo(dam.trovaPezzo(dam,
                    GestioneStringhe.estraePosizione2('i', mossa)));
            char colore = pezzo.getColore();
            if (pezzo.getTipo() == 'd') {
                dama = true;
            } else {
                dama = false;
            }
            return controllaMossaPresaSemplice(dam, tur, mossa1)
                    && controllaMossaPresa(dam, tur, mossa2, colore, dama)
                    && controllaMossaPresa(dam, tur, mossa3, colore, dama);
        } else {
            return false;
        }
    }


    /**
     * Controlla la validita' delle prese in una presa multipla.
     * @param dam damiera su cui controlleremo la validitá delle prese;
     * @param tur turno in cui ci troviamo;
     * @param mossa mossa da effettuare;
     * @param colore colore del pezzo in questione;
     * @param dama utile al controllo del tipo di pezzo;
     * @return true o false se la presa si puó effettuare o meno;
     */
    public boolean controllaMossaPresa(final Damiera dam,
        final GestioneTurno tur, final String mossa,
        final char colore, final boolean dama) {
        boolean valido = false;
        int posI = GestioneStringhe.estraePosizione('i', mossa);
        int posF = GestioneStringhe.estraePosizione('f', mossa);

        int posM;
        if (posI % OTTO == 1 || posI % OTTO == 2
                || posI % OTTO == TRE || posI % OTTO == QUATTRO) {
            posM = (posI + posF) / 2;
        } else {
            posM = (posI + posF) / 2 + 1;
        }
        // controlla che sia stata inserita come
        // posizione iniziale una casella esistente
        if (posI > 0 && posI < TRENTATRE) {
            // controlla che sia stata inserita
            // come posizione finale una casella esistente
            if (posF > 0 && posF < TRENTATRE) {
                // controllo posizione iniziale diversa da quella finale
                if (posI != posF) {
                    // controllo posizione iniziale che deve essere vuota
                    if (dam.trovaPezzo(dam, posI) == -1) {
                        // controllo posizione finale che deve essere vuota
                        if (dam.trovaPezzo(dam, posF) == -1) {
                            //controllo validitá della presa in base
                            // alla posizione intermedia
                            if ((posI == posM - QUATTRO && posF == posM
                                    + CINQUE) || (posI == posM - TRE && posF
                                    == posM + QUATTRO) || (posF == posM
                                    - QUATTRO && posI == posM + CINQUE)
                                    || (posF == posM - TRE && posI == posM
                                    + QUATTRO) || (posI == posM - CINQUE
                                    && posF == posM + QUATTRO) || (posI
                                    == posM - QUATTRO && posF == posM
                                    + TRE) || (posF == posM - CINQUE
                                    && posI == posM + QUATTRO) || (posF
                                    == posM - QUATTRO && posI == posM
                                    + TRE)) {
                                // controllo posizione intermedia che
                                // non deve essere vuota
                                if (dam.trovaPezzo(dam, posM) != -1) {
                                    // controllo del colore del pezzo
                                    // in posizione intermedia
                                    if (dam.getPezzo(dam.trovaPezzo(dam,
                                            posM)).getColore()
                                            != tur.getTurno()) {
                                        if (dama) {
                                            if ((ctrlPrsSemplice(posI,
                                            posF)) || (ctrlPrsSemplice(posF,
                                            posI))) {
                                                valido = true;
                                            }
                                        } else {
                                            // controllo colore
                                            if (colore == 'n') {
                                                if (((ctrlPrsSemplice(posI,
                                                posF)) || (ctrlPrsSemplice(posF,
                                                posI))) && posI < posF) {
                                                    valido = true;
                                                } else {
                                                    Messaggi.pIrPrs(mossa);
                                                    Messaggi.prNonEff();
                                                    valido = false;
                                                }
                                            } else {
                                                if (((ctrlPrsSemplice(posI,
                                                posF)) || (ctrlPrsSemplice(posF,
                                                posI))) && posF < posI) {
                                                    valido = true;
                                                } else {
                                                    Messaggi.pIrPrs(mossa);
                                                    Messaggi.prNonEff();
                                                    valido = false;
                                                }
                                            }
                                        }
                                    } else {
                                        Messaggi.noPzNemPerPresa(posM);
                                        Messaggi.prNonEff();
                                        valido = false;
                                    }
                                } else {
                                    Messaggi.noPzNemPerPresa(posM);
                                    Messaggi.prNonEff();
                                    valido = false;
                                }
                            } else {
                                Messaggi.pIrPrs(mossa);
                                Messaggi.prNonEff();
                                valido = false;
                            }
                        } else {
                            Messaggi.pIrPrs(mossa);
                            Messaggi.prNonEff();
                            valido = false;
                        }
                    } else {
                        Messaggi.pezzoAssente(mossa);
                        Messaggi.prNonEff();
                        valido = false;
                    }
                } else {
                    Messaggi.posizioniUguali();
                    Messaggi.prNonEff();
                    valido = false;
                }
            } else {
                Messaggi.casellaInesistente(mossa, 'f');
                Messaggi.spostamentoNonEffettuato();
                valido = false;
            }
        } else {
            Messaggi.casellaInesistente(mossa, 'i');
            Messaggi.spostamentoNonEffettuato();
            valido = false;
        }
        return valido;
    }

    /**
     * Controlla se un pezzo é diventato dama.
     * @param dam su cui controllare il pezzo;
     * @param pospezzo posizione del pezzo da controllare;
     */
    public void controllaDama(final Damiera dam, final int pospezzo) {
        Pezzo pezzo = dam.getPezzo(dam.trovaPezzo(dam, pospezzo));
        char colore = pezzo.getColore();

        if (colore == 'n') {
            if (pezzo.getPosizione() >= VENTINOVE
                    && pezzo.getPosizione() <= TRENTADUE) {
                pezzo.setTipo('d');
                Messaggi.damaturaEffettuata();
            }
        } else {
            if (pezzo.getPosizione() >= 1 && pezzo.getPosizione() <= QUATTRO) {
                pezzo.setTipo('d');
                Messaggi.damaturaEffettuata();
            }
        }
    }
}
