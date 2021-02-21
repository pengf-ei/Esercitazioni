/*
 * Scrivere un programma che sia in grado di istanziare degli oggetti 'distributori di benzina'
 * di cui sia nota la citt¨¤, il proprietario, la capacit¨¤ e la benzina attualmente
 * contenuta nel distributore. Dell'oggetto Distributore,
 * deve essere possibile simulare le operazioni di erogazione del carburante e dei corrispondenti incassi.
 * Implementa una interfaccia Comparable, in modo da consentire il confronto tra 2 distributori
 * in base alla capacit¨¤ del serbatoio di carburante.
 */

public class TestMainDistributore {

	public static void main(String[] args) {
		Distributore d1 = new Distributore("Milano","Eni",200,123,1.5);
		Distributore d2 = new Distributore("Bergamo","Shell",230,193,1.6);
		
		int capDiff = d1.confCapacita(d2);
		
		if(capDiff > 0)
			System.out.println("Primo distributore pu¨° contenere " + capDiff + " litri in pi¨´");
		else
			System.out.println("Primo distributore contiene " + capDiff * -1 + " litri in meno");
	}

}
