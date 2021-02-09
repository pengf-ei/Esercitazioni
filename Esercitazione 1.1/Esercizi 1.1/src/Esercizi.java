
public class Esercizi {
	
/*
 * 	dato un array di interi, popolato casualmente, ordinarlo in ordine crescente
 * 	e stampare a video il risultato di tale ordinamento.
 */
	public static void ordineCrescente(int[] interi) {
			
		for(int i = 0; i < interi.length -1; i++) {
			int attuale = i;
			
			for(int succ = i+1; succ < interi.length; succ++)
				if(interi[succ] < interi[attuale])
					attuale = succ;
			
			int cache = interi[attuale];
			interi[attuale] = interi[i];
			interi[i] = cache;
				
		}
		
		for(int i =0; i < interi.length; i++)
			System.out.print(interi[i] + " ");
		
		System.out.println();

	}

	
/*
 * 	Scrivere un metodo che verifichi se una data stringa inserita in input ¨¨ palindroma,
 * 	tale metodo dovr¨¤ restituire un booleano.	
 */
	public static boolean isPalindroma(String str) {
		String stringa = "";
		
		for(int i = str.length() -1; i >= 0; i--) {
			stringa += str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(stringa))
			return true;
		else
			return false;
	}
	
	
/*
 * 	Scrivere un metodo che mostri i primi 50 numeri della serie di fibonacci
 * 	(i primi due numeri di fibonacci sono 0 e 1 i successivi si calcolano come somma dei 2 precedenti).
 */
	public static void fib() {
		long prec1 = 0;
		long prec2 = 1;
		long sum = 0;
		
		System.out.println(prec1);
		System.out.println(prec2);
		
		for(int i = 0; i < 50; i++) {
			sum = prec1 + prec2;
			System.out.println(sum);
			prec1 = prec2;
			prec2 = sum;
		}
	}

// 	Data una matrice effettuare la trasposta della stessa.
	public static void isTrasposta(int[][] matrix) {
		
		int [][] mTrasp = new int[matrix[0].length][matrix.length];
		
		for(int i = 0; i < matrix.length; i++) {
			for( int j = 0; j < matrix[i].length; j++) {
				mTrasp[j][i] = matrix[i][j];
			}
		}
		
		for(int i = 0; i < mTrasp.length; i++) {
			for(int j = 0; j < mTrasp[i].length; j++)
				System.out.print(mTrasp[i][j] + " ");
			
			System.out.println("");
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] interi = {2, 4, 1, 0, 6, -1, 123, 45};
		
		int[][] matrix = {
				{2, 4, 8},
				{3, 2, 0},
				{5, 3, 1},
				{0, 1, 0}
		};
		
		int[][] matrix2 = {
				{2, 3, 5, 0},
				{4, 2, 3, 1},
				{8, 0, 1, 0}
		};
	
		
		ordineCrescente(interi);
		
		boolean t = isPalindroma("alla");
		System.out.println(t);
		
		fib();
		
		isTrasposta(matrix);

	}
}
