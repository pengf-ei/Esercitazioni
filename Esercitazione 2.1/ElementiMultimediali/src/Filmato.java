
public class Filmato extends Audio implements ConImmagine {
	private int luminosita; // da 1 a 10
	
	

	public Filmato(String titolo, int durata, int volume, int luminosita) {
		super(titolo, durata, volume);
		
		if(luminosita >= 0 && luminosita <= 10)
			this.luminosita = luminosita;
		else
			this.luminosita = -1;
	}
	
	

	public int getLuminosita() {
		return luminosita;
	}



	public void setLuminosita(int luminosita) {
		if(luminosita >= 0 && luminosita <= 10)
			this.luminosita = luminosita;
	}



	@Override
	public void brighter() {
		if(luminosita < 10)
			luminosita += 1;

	}

	@Override
	public void darker() {
		if(luminosita < 10)
			luminosita -= 1;

	}



	@Override
	public void play() {
		String s ="";
		
		for(int i = 0; i < getVolume(); i++) {
			s += "!";
		}
		
		for(int i = 0; i < getLuminosita(); i++) {
			s += "*";
		}
		
		for(int i = 0; i < getDurata(); i++) {
			System.out.println("Filmato: " + getTitolo() + s);
		}
	}

}
