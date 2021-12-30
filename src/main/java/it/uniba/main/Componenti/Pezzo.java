package it.uniba.main.Componenti;

/**
 * Classe di tipo: Entity.
 * La classe pezzo si occupa di:
 * -Creare il pezzo e metterlo nella posizione giusta;
 * -Impostare e restituire il colore di un determinato pezzo;
 * -Impostare e restituire la posizione di un determinato pezzo;
 * -Impostare e restituire il tipo di un determinato pezzo;
 * -Impostare o vedere l'eventuale presa di un determinato pezzo;
 */
public class Pezzo {
    /**
     * Colore della pedina.
     */
    private char colore;
    /**
     * Posizione della pedina.
     */
    private int posizione;
    /**
     * Costante pedina ='p'.
     */
    private static final char PEDINA = 'p';
    /**
     * Tipo di pedina ('d=dama' e 'p'=pezzo).
     */
    private char tipo = PEDINA;
    /**
     * Booleano che ci indica se il pezzo é stato preso.
     */
    private boolean presa;

    /**
    * Crea il pezzo impostando colore, posizione e il valore di presa.
     * @param color colore del nuovo pezzo;
     * @param newPos posizione del nuovo pezzo;
     */
    public Pezzo(final char color, final int newPos) {
        colore = color;
        posizione = newPos;
        presa = false;
    }

    /**
     * Imposta il colore del pezzo.
     * @param color nuovo colore del pezzo;
     */
    public void setColore(final char color) {
        colore = color;
    }

    /**
     *  Restituisce il colore del pezzo.
     *  @return colore del pezzo in questione;
      */
    public char getColore() {
        return colore;
    }

    /**
     * Modifica la posizione del pezzo.
     * @param newPos nuova posizione per il pezzo;
     */
    public void setPosizione(final int newPos) {
        posizione = newPos;
    }

    /**
     * Restituisce la posizione del pezzo.
     * @return la posizione del pezzo in questione;
     */
    public int getPosizione() {
        return posizione;
    }

    /**
     * Modifica il tipo del pezzo.
     * @param newTipo nuovo tipo di pezzo (dama o pedina);
      */
    public void setTipo(final char newTipo) {
        tipo = newTipo;
    }

    /**
     * Restituisce il tipo del pezzo.
     * @return il tipo di pezzo in questione;
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Restituisce il valore di presa.
     * @return true se il pezzo é in presa, false altrimenti;
     */
    public boolean isPresa() {
        return presa;
    }

    /**
     * Modifica il valore di presa.
     */
    public void setPresa() {
        presa = !presa;
    }
}
