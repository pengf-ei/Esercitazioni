/*
 * Definire una interfaccia 'operazione' e le sue classi derivate( sub. div, mul)
 * in modo che da ciascuna sia possibile eseguire la corrispondente operazione aritmetica
 * (di addizione, divisione, moltiplicazione) istanziando un oggetto di classe 'operazione' e due operandi.
 * Realizzare anche, una classe astratta che implementi le funzionalit¨¤ comuni come la stampa a video del risultato.
 */

public class TestMainOperazioni {

	public static void main(String[] args) {
		Operando op1 = new Operando(2);
		Operando op2 = new Operando(-1);
		
		Addizione add = new Addizione();
		
		add.esegui(op1, op2);
		add.stampa();
		
		Moltiplicazione mul = new Moltiplicazione();
		
		mul.esegui(op1, op2);
		mul.stampa();
		
		Divisione div = new Divisione();
		
		div.esegui(op1, op2);
		div.stampa();

	}

}


