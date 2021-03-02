// Esercizio 1: Tipi di Bevande

import java.util.HashMap;

public class BevandeCod extends HashMap<String, Bevanda> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BevandeCod() {
		super();

	}

	@Override
	public Bevanda get(Object key) throws BevandaNonValida {
		if(super.get(key) == null)
			throw new BevandaNonValida("Codice Bevanda <" + key.toString() + "> Non Valida.");
		
		return super.get(key);
	}
	
	public void aggiungiBevanda(String key, String descrizione) {
		this.get(key).setDescrizione(descrizione);
	}

}
