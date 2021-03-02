// Esercizio 2: Credito

import java.util.HashMap;

public class Tessere extends HashMap<Integer, Double> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Tessere() {
		super();
		// TODO Auto-generated constructor stub
	}



	public double leggiCredito(int codiceTessera) throws TesseraNonValida {
		if(codiceTessera < 0)
			throw new TesseraNonValida("Codice Tessera <" + codiceTessera + "> Non Valida.");
		
		if(this.get(codiceTessera) != null)
			return this.get(codiceTessera);
		
		throw new TesseraNonValida("Codice Tessera <" + codiceTessera + "> Non Valida.");
		
	}
	
	public void caricaTessera(int codiceTessera, double d) throws TesseraNonValida {
		if(d > 0) {
			if(this.get(codiceTessera) != null ) {
				if(this.get(codiceTessera) >= 0)
					this.put(codiceTessera, this.get(codiceTessera) + d );
				else
					this.put(codiceTessera, this.get(codiceTessera));
			} else 
				throw new TesseraNonValida("Codice Tessera <" + codiceTessera + "> Non Valida.");	
		}
	}


	
	

}
