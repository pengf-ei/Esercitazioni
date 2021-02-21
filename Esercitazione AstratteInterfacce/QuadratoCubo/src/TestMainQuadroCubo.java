/*
 * Scrivere un programma che dato un numero intero in ingresso vengano restituiti
 * un oggetto rappresentativo del quadrato del numero dato e
 * un oggetto rappresentativo del cubo del numero assegnato.
 * Implementa l'algoritmo attraverso l'uso di una interfaccia comune. 
 */


public class TestMainQuadroCubo {

	public static void main(String[] args) {
		Numero num = new Numero(2);
		
		Numero numQ = num.alQuadrato();
		Numero numC = num.alCubo();
		
		System.out.println("Num al Quadrato: " + numQ.getNum());
		System.out.println("Num al Cubo: " + numC.getNum());

	}

}
