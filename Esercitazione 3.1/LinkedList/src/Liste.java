import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Liste {

// ------------------------------------------------------------------
	
/*
 * Esercizio 1
 * Realizzare il metodo static LinkedList<Integer> creaRandom(int n, int max) che genera
 * una lista costituita da n valori interi random tra 0 e max-1. 
 */
	public static LinkedList<Integer> creaRandom(int n, int max) {
		LinkedList<Integer> listInt = new LinkedList<Integer>();
		Random rdm = new Random();
		
		for(int i = 0; i < n; i++) {
			listInt.add(rdm.nextInt(max));
		}
		
		return listInt;
		
	}
	
/*
 * Parte 2
 * Realizzare il metodo static void stampa(Iterator<Integer> i) che stampa
 * gli elementi dell¡¯iteratore nella forma <elem1>,<elem2>,¡­., <elemN>
 */
	public static void stampa(Iterator<Integer> i) {
		while(i.hasNext()) {
			System.out.print("<" + i.next() + ">");
			if(i.hasNext())
				System.out.print(", ");
		}
		
		System.out.println();
	}
	
/*
 * Parte 3
 * Realizzare il metodo static void provaEx1() che, utilizzando i metodi appena creati,
 * crei un vettore di 20 elementi random (sia ordinato che non) e li stampa.
 * Questo metodo andr¨¤ poi chiamato dal main per i test di correttezza.
 */
	public static void provaEx1() {
		LinkedList<Integer> listInt = new LinkedList<Integer>();
		listInt = Liste.creaRandom(20, 3);
		
		Iterator<Integer> itr = listInt.iterator();
		
		Liste.stampa(itr);
		
	}

// ------------------------------------------------------------------
	
/*
 * Esercizio 2
 * Realizzare il metodo static LinkedList<Integer> creaRandomCrescente(int n)
 * che genera una lista collegata costituita da n valori random crescenti.
 */
	public static LinkedList<Integer> creaRandomCrescente(int n){
		LinkedList<Integer> listInt = new LinkedList<Integer>();
		Random rdm = new Random();
		
		// valori 0-100
		int val = rdm.nextInt(101);
		
		for(int i = 0; i < n; i++) {
			listInt.add(val);
			// valori 0-100
			val += rdm.nextInt(101);
		}
		
		return listInt;
	}
	
/*
 * Parte 2
 * Realizzare un metodo static LinkedList<Integer> parseString(LinkedList<String> a)
 * che ritorna una lista  Collegata di interi ottenuti applicando
 * il metodo Integer.parseInt(¡­) agli elementi dell¡¯iteratore passato come parametro.
 */
	public static LinkedList<Integer> parseString(LinkedList<String> a){
		if(a == null)
			return null;
		
		LinkedList<Integer> listInt = new LinkedList<Integer>();
		
		for(String str : a) {
			// controllo eccezione se numerico
			if(str.matches("[+-]?\\d+")) {
				int ind = Integer.parseInt(str);
				listInt.add(ind);
			}
			
		}
		
		return listInt;
	}
	
/*
 * Realizzare il metodo static void provaEx2() per il test dei metodi
 */
	public static void provaEx2() {
		LinkedList<Integer> listInt = new LinkedList<Integer>();
		LinkedList<String> 	listStr = new LinkedList<String>();
		
		listStr.add("+3");
		listStr.add("4");
		listStr.add("A");
		listStr.add("-6");
		listStr.add("7");
		listStr.add("B");
		listStr.add("-9");
		listStr.add("10");
		
		listInt = Liste.parseString(listStr);
		
		System.out.println(listInt.toString());	
		
	//	Iterator<Integer> itr = listInt.iterator();
		
	//	Liste.stampa(itr);
		
	}
	
// ------------------------------------------------------------------
	
/*
 * Esercizio 3
 * Realizzare il metodo static LinkedList<Integer> mergeOrdinato(Iterator<Integer> a, Iterator<Integer> b)
 * che effettua il merge ordinato degli elementi dei due iteratori,
 * ritornando il risultato in una lista collegata.
 * In particolare il merge di due liste ordinate (qui rappresentate dai corrispondenti iteratori,
 * da assumerecome gi¨¤ ordinati) restituisce una nuova lista ordinata
 * contente tutti gli elementi appartenenti alle due liste di input.
 */
	public static LinkedList<Integer> mergeOrdinato(Iterator<Integer> a, Iterator<Integer> b) {
		LinkedList<Integer> listInt = new LinkedList<Integer>();
		
		int valEscape = -999999999;
		
		int valA = a.hasNext() ? a.next() : valEscape;
		int valB = b.hasNext() ? b.next() : valEscape;
		
		while(valA != -999999999 && valB != valEscape) {	
			if(valA < valB) {
				listInt.add(valA);
			//	a.remove();
				valA = a.hasNext() ? a.next() : valEscape;
			} else {
				listInt.add(valB);
			//	b.remove();
				valB = b.hasNext() ? b.next() : valEscape;
			}
		}
		
		if(valA != valEscape) {
			listInt.add(valA);
		//	a.remove();
			while(a.hasNext()) {
				listInt.add(a.next());
		//		a.remove();
			}
		}

		if(valB != valEscape) {
			listInt.add(valB);
		//	b.remove();
			while(b.hasNext()) {
				listInt.add(b.next());
		//		b.remove();
			}
		}
		
		return listInt;
		
	}
	
/*
 * 2. Realizzare il metodo static void provaEx3() che crea due liste random ordinate e restituisce il merge ordinato delle due.
 * Il risultato cos¨¬ ottenuto dovr¨¤ essere stampata, insieme ai corrispondenti vettori di input.
 */
	public static void provaEx3() {
		LinkedList<Integer> a = Liste.creaRandomCrescente(4);
		LinkedList<Integer> b = Liste.creaRandomCrescente(2);
		
		Iterator<Integer> ia = a.iterator();
		Iterator<Integer> ib =  b.iterator();

//		LinkedList<Integer> merge = Liste.mergeOrdinato(ia, ib);
		
		System.out.println(a.toString());
		System.out.println(b.toString());

		System.out.println(Liste.mergeOrdinato(ia, ib));
		
	}
	
// ------------------------------------------------------------------
	
/*
 * Esercizio 4
 * Realizzare il metodo static LinkedList<LinkedList<Integer> insiemeDiInsiemi(int n)
 * che costruisce una lista di liste cos¨¬ definita:
 * a. Il primo elemento della lista contiene una lista con il solo valore 0;
 * b. Il secondo elemento contiene una lista con gli elementi 0 e 1
 * c. Il terzo contiene una lista con gli elementi 0,1,2
 * d. ¡­ e cos¨¬ via fino ad n-1
 */
	public static LinkedList<LinkedList<Integer>> insiemeDiInsiemi(int n) {
		LinkedList<LinkedList<Integer>> insIns = new LinkedList<LinkedList<Integer>>();
		
		for(int i = 0 ; i < n; i++) {
			LinkedList<Integer> temp = new LinkedList<Integer>();
			for(int d = 0; d <= i; d++) {
				temp.add(d);
			}
			insIns.add(temp);
		}
		
		return insIns;
	}
	
/*
 * 2. Realizzare il metodo static void stampa(LinkedList <LinkedList<Integer>> a) in grado di stampare il contenuto della lista
 */
	public static void stampa(LinkedList<LinkedList<Integer>> a) {
		for(LinkedList<Integer> list : a) {
			Iterator<Integer> iList = list.iterator();
			Liste.stampa(iList);
		}
	}
	
// ------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		Liste.provaEx1();
		
		System.out.println();
		
		Liste.provaEx2();
		
		System.out.println();
		
		Liste.provaEx3();
		
		System.out.println();
		
		Liste.stampa(Liste.insiemeDiInsiemi(9));

	}

}
