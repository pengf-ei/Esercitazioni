
public class Audio extends ElementoMultimediale implements Riproducibile {
	private int durata; // maggiore di 0
	private int volume; // tra 0 e 10
	
	public Audio(String titolo, int durata, int volume) {
		super(titolo);
		if(durata > 0)
			this.durata = durata;
		else
			this.durata = -1;
		
		if(volume >= 0 && volume <= 10)
			this.volume = volume;
		else
			this.volume = -1;
	}

	

	public int getDurata() {
		return durata;
	}



	public void setDurata(int durata) {
		if(durata > 0)
			this.durata = durata;
	}



	public int getVolume() {
		return volume;
	}



	public void setVolume(int volume) {
		if(volume >= 0 && volume <= 10)
			this.volume = volume;
	}



	@Override
	public void play() {
		String s ="";
		
		for(int i = 0; i < volume; i++) {
			s += "!";
		}
		
		for(int i = 0; i < durata; i++) {
			System.out.println("Audio: " + getTitolo() + s);
		}

	}

	@Override
	public void weaker() {
		if(volume < 10)
			volume += 1;

	}

	@Override
	public void lower() {
		if(volume > 0 )
			volume -= 1;

	}

	@Override
	public void esegui() {
		play();

	}

}
