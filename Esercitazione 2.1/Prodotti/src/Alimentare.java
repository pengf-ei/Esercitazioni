
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Alimentare extends Prodotto {
	private LocalDate dataScadenza;

	public Alimentare(String codiceBarre, String descrizione, double prezzoUnitario, LocalDate dataScadenza) {
		super(codiceBarre, descrizione, prezzoUnitario);
		if(dataScadenza != null)
			this.dataScadenza = dataScadenza;
	}

	public LocalDate getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public void applicaSconto() {
		LocalDate dataOdierna = LocalDate.now();
		Long daysLeft = ChronoUnit.DAYS.between(dataOdierna, dataScadenza);		
		if(daysLeft <= 10) {
			this.setPrezzoUnitario(this.getPrezzoUnitario() * 0.8);
		}
	}

	@Override
	public String toString() {
		return "Alimentare [dataScadenza=" + dataScadenza.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", Codice a Barre="
				+ getCodiceBarre()
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
		Alimentare other = (Alimentare) obj;
		if (dataScadenza == null) {
			if (other.dataScadenza != null)
				return false;
		} else if (!dataScadenza.equals(other.dataScadenza))
			return false;
		return true;
	}
	
	
	

}
