package vehicle;

public class Car extends Vehicle {
	private String tipologia;

	public Car(String targa, String marca, String modello, boolean isGuasto, String tipologia) {
		super(targa, marca, modello, isGuasto);
		this.tipologia = tipologia;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	
	

}
