
public class Prodotto {
	private String codiceBarre;
	private String descrizione;
	private double prezzoUnitario;
	
	public Prodotto(String codiceBarre, String descrizione, double prezzoUnitario) {
		super();
		this.codiceBarre = codiceBarre;
		this.descrizione = descrizione;
		this.prezzoUnitario = prezzoUnitario;
	}

	public String getCodiceBarre() {
		return codiceBarre;
	}

	public void setCodiceBarre(String codiceBarre) {
		this.codiceBarre = codiceBarre;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzoUnitario() {
		return prezzoUnitario;
	}

	public void setPrezzoUnitario(double prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}
	
	public void applicaSconto() {
		this.prezzoUnitario = this.prezzoUnitario * 0.95;
	}

	@Override
	public String toString() {
		return "Prodotto [codiceBarre=" + codiceBarre + ", descrizione=" + descrizione + ", prezzoUnitario="
				+ prezzoUnitario + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodotto other = (Prodotto) obj;
		if (codiceBarre == null) {
			if (other.codiceBarre != null)
				return false;
		} else if (!codiceBarre.equals(other.codiceBarre))
			return false;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (Double.doubleToLongBits(prezzoUnitario) != Double.doubleToLongBits(other.prezzoUnitario))
			return false;
		return true;
	}

	


	
	

}
