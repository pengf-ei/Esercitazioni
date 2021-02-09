/*
 * dato un array di interi, popolato casualmente, ordinarlo in ordine crescente
 * e stampare a video il risultato di tale ordinamento.
 */


public class Ordinamento {

	public static void main(String[] args) {
		
		int[] interi = {2, 4, 1, 0, 6, -1};
		
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

}
