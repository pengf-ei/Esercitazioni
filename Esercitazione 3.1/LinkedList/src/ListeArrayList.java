import java.util.Iterator;
import java.util.ArrayList;
import java.util.Random;

public class ListeArrayList {
	
/*
 * Esercizio 1
 * ripetere gli esercizi utilizzando l¡¯ArrayList al posto della LinkedList. 
 */
	public static ArrayList<Integer> creaRandom(int n, int max){
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		Random rdm = new Random();
		
		for(int i = 0; i < n; i++) {
			listInt.add(rdm.nextInt(max));
		}
		
		return listInt;
		
	}
	
	public static void stampa(Iterator<Integer> i) {
		while(i.hasNext()) {
			System.out.print("<" + i.next() + ">");
			if(i.hasNext())
				System.out.print(",");
		}
	}
	

	
	public static void provaEx1() {
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		listInt = ListeArrayList.creaRandom(20, 3);
		
		Iterator<Integer> itr = listInt.iterator();
		
		ListeArrayList.stampa(itr);
		
	}

	
	public static void main(String[] args) {
		
		ListeArrayList.provaEx1();

	}

}
