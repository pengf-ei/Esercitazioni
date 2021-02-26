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
			System.out.println(distributore.get(null).getDescrizione());
			System.out.println(distributore.get(null).getPrice());
			
		} catch (NullPointerException b) {
			throw new BevandaNonValida("Codice Bevanda Non Valida.");
		}
		
	}

}
