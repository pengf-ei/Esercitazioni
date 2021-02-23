package vehicle;

public class Motocycle extends Vehicle {
	private int cilindrata;

	public Motocycle(String targa, String marca, String modello, boolean isGuasto, int cilindrata) {
		super(targa, marca, modello, isGuasto);
		this.cilindrata = cilindrata;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		if(cilindrata > 0)
			this.cilindrata = cilindrata;
	}
	
	

}
