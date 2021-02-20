/*
 *Esercizio 1
 *Realizzare un programma che sia in grado di valutare il volume di
 *oggetti tridimensionali come cilindri e parallelepipedi basandosi
 *sul valore della loro area e dell'altezza.
 *Delegare i metodi comuni, come il calcolo e la stampa del volume ad una classe astratta.
 */


public class TestOggetti {

	public static void main(String[] args) {
		OggettoTridimensionale oggtr = new OggettoTridimensionale(2,2);
		
		System.out.println(oggtr.calVolume());
		System.out.println(oggtr.toString());

	}

}
