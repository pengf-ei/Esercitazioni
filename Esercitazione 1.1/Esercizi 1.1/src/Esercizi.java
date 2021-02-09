
public class Esercizi {
	
/*
 * 	dato un array di interi, popolato casualmente, ordinarlo in ordine crescente
 * 	e stampare a video il risultato di tale ordinamento.
 */
	public static void ordineCrescente() {
		
		int[] interi = {2, 4, 1, 0, 6, -1, 123, 45};
		
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

	}

	
/*
 * Scrivere un metodo che verifichi se una data stringa inserita in input ¨¨ palindroma,
 * tale metodo dovr¨¤ restituire un booleano.	
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
 * Scrivere un metodo che mostri i primi 50 numeri della serie di fibonacci
 * (i primi due numeri di fibonacci sono 0 e 1 i successivi si calcolano come somma dei 2 precedenti).
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
	
	
	public static void main(String[] args) {
		
	//	ordineCrescente();
		
	//	boolean t = isPalindroma("alla");
	//	System.out.print(t);
		
		fib();

	}
}
