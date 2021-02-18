
public class NonAlimentare extends Prodotto {
	private String materiale;

	public NonAlimentare(String codiceBarre, String descrizione, double prezzoUnitario, String materiale) {
		super(codiceBarre, descrizione, prezzoUnitario);
		this.materiale = materiale;
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	@Override
	public String toString() {
		return "NonAlimentare [materiale=" + materiale + ", Codice a Barre=" + getCodiceBarre()
				+ ", Descrizione=" + getDescrizione() + ", Prezzo Unitario=" + getPrezzoUnitario() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		NonAlimentare other = (NonAlimentare) obj;
		if (materiale == null) {
			if (other.materiale != null)
				return false;
		} else if (!materiale.equals(other.materiale))
			return false;
		return true;
	}
	
	public void applicaSconto() {	
		if(materiale.equalsIgnoreCase("carta") || 
				materiale.equalsIgnoreCase("plastica") ||
				materiale.equalsIgnoreCase("vetro")) {
			this.setPrezzoUnitario(this.getPrezzoUnitario() * 0.9);
		}
	}
	

}
