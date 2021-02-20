import java.util.Random;

public class DadoClasse {

	public int lancio() {
		Random ris = new Random();
		int d = 1 + ris.nextInt(6);
		return d;
	}

}
