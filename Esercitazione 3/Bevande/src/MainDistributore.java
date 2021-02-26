/*
 * Esercizio 1: Tipi di Bevande
Il distributore di bevande ¨¨ in grado di erogare alcuni tipi di bevande;
ogni bevanda ¨¨ caratterizzata da un codice, nome ed un prezzo.
Ad esempio:
Codice	Bevanda	Prezzo
A	Acqua	0.20
B	Coca	0.30
C	Birra	1.00

Il metodo aggiungiBevanda() permette di aggiungere la descrizione di una bevanda.
Il distributore permette di conoscere, dato il codice, il prezzo e il nome della bevanda tramite i metodi getPrice() e getName() rispettivamente.
Quando si richiede un codice corrispondente ad una bevanda non disponibile, viene generata un¡¯eccezione di BevandaNonValida.

 */

import java.util.HashMap;

public class MainDistributore {

	public static void main(String[] args)  {
		HashMap<String, Bevanda> distributore = new HashMap<String, Bevanda>();
		
		distributore.put("A", new Bevanda("Acqua", -3));
		distributore.put("B", new Bevanda("Coca", 0.3));
		distributore.put("C", new Bevanda("Birra", 1));
		distributore.put("D", new Bevanda("Caffe", 0.5));
	
		try {
			//metodo per aggiungere descrizione alla bevanda
			distributore.get("A").aggiungiBevanda("Naturale");
			
		} catch (NullPointerException b) {
			throw new BevandaNonValida("Codice Bevanda Non Valida.");
	//		System.out.println("Codice Bevanda Non Valida.");
		}
	
		
		try {
			System.out.println(distributore.get(null).getName());
			System.out.println(distributore.get(null).descrizioneBevanda());
			System.out.println(distributore.get(null).getPrice());
			
		} catch (NullPointerException b) {
			throw new BevandaNonValida("Codice Bevanda Non Valida.");
		}
		
	}

}
