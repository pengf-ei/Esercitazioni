
public class TestMainSenzaAstratte {
	
	public static void main(String[] args) {
		DadoClasse dado = new DadoClasse();
		MonetaClasse moneta = new MonetaClasse();
		
		System.out.println(dado.lancio());
		System.out.println(moneta.lancio());
	
	}
}
