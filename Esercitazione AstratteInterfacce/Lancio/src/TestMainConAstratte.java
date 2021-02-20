/*
 * Scrivere un programma che simuli il lancio di un dado e di una moneta stampandone il risultato;
 * con e senza l'utilizzo di una classe astratta che rappresenti i comportamenti comuni
 * degli oggetti dado e moneta istanziati.
 */


public class TestMainConAstratte {

	public static void main(String[] args) {
		Dado dado = new Dado();
		Moneta moneta = new Moneta();
		
		System.out.println(dado.lancio());
		
		if(moneta.lancio() == 0)
			System.out.println("Testa");
		else
			System.out.println("Croce");

	}

}
