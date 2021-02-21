
public class Immagine extends ElementoMultimediale implements ConImmagine {
	
	private int luminosita; // da 1 a 10

	public Immagine(String titolo, int luminosita) {
		super(titolo);
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
		if(luminosita > 0)
			luminosita -= 1;
			

	}
	
	public void show() {
		String s ="";
		
		for(int i = 0; i < luminosita; i++) {
			s += "*";
		}
		
		System.out.println("Immagine: " + getTitolo() + s);
	}

	@Override
	public void esegui() {
		show();

	}

}
