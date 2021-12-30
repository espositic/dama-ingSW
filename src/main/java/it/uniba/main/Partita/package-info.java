/**
 * Package Partita.
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
 * La classe GestionePartita si occupa di:
 * -Verificare se la partita è in corso ed eventualmente
 * cambiare il valore di "partitaInCorso" se necessario;
 * La classe 'GestioneTurno' si occupa di:
 * -Verificare il turno in corso per poi cambiarlo passando il turno
 * (così da permettere la corretta esecuzione della partita);
 * -Verificare la data nel momento in cui inizia un turno;
 * -Verificare il tempo totale trascorso per entrambi i giocatori;
 * -Verificare il tempo per ogni giocatore e lo restituisce;
 * La classe 'Mosse' si occupa di:
 * -Effettuare lo spostamento;
 * -Effettuare la presa semplice e multipla;
 */
package it.uniba.main.Partita;
