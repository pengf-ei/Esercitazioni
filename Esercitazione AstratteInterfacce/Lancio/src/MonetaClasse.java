import java.util.Random;

public class MonetaClasse {

	public String lancio() {
		Random ris = new Random();
		int d = ris.nextInt(2);
		
		if(d == 0)
			return "Testa";
		else
			return "Croce";
	}

}
