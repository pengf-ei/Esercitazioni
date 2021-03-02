//Esercizio 3: Approvvigionamento Distributore.

import java.util.HashMap;

public class Distributore {
	private BevandeCod bevandecod;
	private HashMap<Integer, QuantitaBevanda> colonne;

	public HashMap<Integer, QuantitaBevanda> getColonne() {
		return colonne;
	}

	public void setColonne(HashMap<Integer, QuantitaBevanda> colonne) {
		this.colonne = colonne;
	}

	public Distributore(HashMap<Integer, QuantitaBevanda> colonne, BevandeCod bevandecod) {
		super();
		this.bevandecod = bevandecod;
		this.colonne = colonne;
	}

	public BevandeCod getBevandecod() {
		return bevandecod;
	}

	public void setBevandecod(BevandeCod bevandecod) {
		if(bevandecod != null)
			this.bevandecod = bevandecod;
	}
	

	
	public void aggiornaColonna(int colonna, String nomeBevanda, int num) {
		if(this.colonne.get(colonna).getBevanda().getName().equalsIgnoreCase(nomeBevanda)) {
			this.colonne.get(colonna).setQuantita(num);
		}
		
	}
	
	public int lattineDisponibili(String codBevanda) {
	//	if(codBevanda != null) {
			String nomeBevanda = bevandecod.get(codBevanda).getName();
			for(int i = 1; i <= colonne.size(); i++) {
				if(this.colonne.get(i).getBevanda().getName() == nomeBevanda) {
					return this.colonne.get(i).getQuantita();
				}
			}
	//	}
		
		return -1;
		
	}
	
	//Esercizio 4: Erogazione
	public int eroga(int codTessera, String codBevanda, Tessere tsr, BevandeCod bevandecod) throws BevandaEsaurita, CreditoInsufficiente, TesseraNonValida {
	//	if(codBevanda != null) {
			if(this.lattineDisponibili(codBevanda) > 0) {
				if(tsr.get(codTessera) != null) {
					if(tsr.get(codTessera) >= this.bevandecod.get(codBevanda).getPrice()) {
						
						for(int i = 1; i <= colonne.size(); i++) {
							if(this.colonne.get(i).getBevanda().equals(bevandecod.get(codBevanda))) {
								this.colonne.get(i).setQuantita(this.colonne.get(i).getQuantita() - 1);
								tsr.put(codTessera, tsr.get(codTessera) - this.colonne.get(i).getBevanda().getPrice());
								return i;
							}
							
						}
						
					} else
						throw new CreditoInsufficiente();
				} else
					throw new TesseraNonValida("Codice Tessera <" + codTessera + "> Non Valida.");
			} else
				throw new BevandaEsaurita();
			
			return -1;
	//	}
		
	}
	
	
	
}


		

