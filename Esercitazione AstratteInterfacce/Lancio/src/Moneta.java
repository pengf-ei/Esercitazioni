import java.util.Random;

public class Moneta extends MetodiComuni {

	@Override
	public int lancio() {
		Random ris = new Random();
		int d = ris.nextInt(2);
		return d;
	}

}
