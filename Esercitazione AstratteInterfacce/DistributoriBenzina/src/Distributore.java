
public class Distributore implements Comparable {
	private String citt¨¤;
	private String proprietario;
	private int capacita;
	private double benzinaAttuale;
	private double costo;


	public Distributore(String citt¨¤, String proprietario, int capacita, double benzinaAttuale, double costo) {
		super();
		this.citt¨¤ = citt¨¤;
		this.proprietario = proprietario;
		
		if(capacita > 0 && benzinaAttuale > 0 && capacita >= benzinaAttuale) {
			this.capacita = capacita;
			this.benzinaAttuale = benzinaAttuale;
		} else {
			this.capacita = -1;
			this.benzinaAttuale = -1;
		}
		
		if(costo > 0)
			this.costo = costo;
		else
			this.costo = -1;
	}

	

	public String getCitt¨¤() {
		return citt¨¤;
	}



	public void setCitt¨¤(String citt¨¤) {
		this.citt¨¤ = citt¨¤;
	}



	public String getProprietario() {
		return proprietario;
	}



	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}



	public int getCapacita() {
		return capacita;
	}



	public void setCapacita(int capacita) {
		if(capacita > 0)
			this.capacita = capacita;
	}



	public double getBenzinaAttuale() {
		return benzinaAttuale;
	}



	public void setBenzinaAttuale(double benzinaAttuale) {
		if(benzinaAttuale >= 0 && benzinaAttuale <= capacita)
			this.benzinaAttuale = benzinaAttuale;
	}



	public double getCosto() {
		return costo;
	}



	public void setCosto(double costo) {
		if(costo > 0)
			this.costo = costo;
	}

	public double erogazione(double litri) {
		return litri * costo; //ritorna il costo dell'erogazione
	}

	@Override
	public int confCapacita(Object d) {
		return this.getCapacita() - ((Distributore) d).getCapacita();
	}

}
