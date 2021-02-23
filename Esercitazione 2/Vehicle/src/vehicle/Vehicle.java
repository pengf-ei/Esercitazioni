package vehicle;

public class Vehicle {
	private String targa;
	private String marca;
	private String modello;
	private boolean isGuasto;
	
	public Vehicle(String targa, String marca, String modello, boolean isGuasto) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.isGuasto = isGuasto;
	}

	public String getTarga() {
		return targa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModello() {
		return modello;
	}

	public boolean isGuasto() {
		return isGuasto;
	}

	public void setTarga(String targa) {
		if(targa != null)
			this.targa = targa;
	}

	public void setMarca(String marca) {
		if(targa != null)
			this.marca = marca;
	}

	public void setModello(String modello) {
		if(modello != null)
			this.modello = modello;
	}

	public void setGuasto(boolean isGuasto) {
		this.isGuasto = isGuasto;
	}
	
	
}
