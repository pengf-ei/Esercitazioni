import java.util.Scanner;

public class Cicli {

/*
 * 	Scrivere un programma / metodo che data una sequenza di interi stampi "Tutti positivi e pari"
 * 	se i numeri inseriti sono tutti positivi e pari, altrimenti stampa "NO".
 * 	Risolvere questo esercizio senza usare array.
 */
	public static void funct1(int... interi) {
		if(interi != null) {
			boolean verifica = true;
			
			for(int x : interi) {
				if(!(x >=0 && (x % 2 == 0))) {
					verifica = false;
					break;
				}
			}
			
			if(verifica == false)
				System.out.println("NO");
			else
				System.out.println("Tutti positivi e pari");
		} else
			System.out.println("Valori null");

	}
	
	
/*
 *	Scrivere un programma / metodo che data una sequenza di interi stampi la media di tutti
 *	i numeri inseriti che siano divisibili per tre.
 *	Per esempio, se si immettono i valori 5, 8, 9, 12, 7, 6 ,1
 *	il risultato stampato dovr¨¤ essere 9. Risolvere questo esercizio senza usare array. 
 */
	public static void funct2(int... interi) {
		if(interi != null) {
			int sum = 0;
			int nDivisibili = 0;
			
			for(int n : interi) {
				if(n % 3 == 0) {
					nDivisibili++;
					sum += n;
				}
			}
			
			System.out.println((float)sum/nDivisibili);
		} else
			System.out.println("Valori null");
	}
	
	
/*
 *  Scrivere un programma / metodo che chiede all¡¯utente di inserire una sequenza di caratteri
 *  (chiedendo prima quanti caratteri voglia inserire) e li ristampa man mano che vengono inseriti.
 *  L¡¯intero procedimento (chiedere quanti caratteri voglia inserire,
 *  leggere i caratteri e man mano stamparli) dovr¨¤ essere ripetuto 5 volte.
 *  Risolvere questo esercizio senza usare array.
 */
	public static void funct3() {
		Scanner insert = new Scanner(System.in);
		Scanner caratt = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Quanti caratteri vuoi inserire?");
			int n = insert.nextInt();
			
			StringBuffer str = new StringBuffer(n);
			for(int j = 0; j < n; j++) {
				System.out.println("Inserisci carattere: ");
				String c = caratt.nextLine();
				str.append(c);
				System.out.println("Caratteri inseriti: " + str);
			}
				
		}

		insert.close();
		caratt.close();
		
	}
	
	public static void main(String[] args) {
		
		funct1(2, 3, -1, 5, 8, 9, 10, 4, 6);
		funct2(5, 8, 9, 12, 7, 6 ,1);
		
		funct3();

	}

}
