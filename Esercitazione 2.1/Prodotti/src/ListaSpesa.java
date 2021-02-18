import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaSpesa {
	private String tessera;
	private ArrayList<Prodotto> listaProdotti;
	
	public ListaSpesa(String tessera, ArrayList<Prodotto> listaProdotti) {
		super();
		this.tessera = tessera;
		this.listaProdotti = listaProdotti;
	}

	public String getTessera() {
		return tessera;
	}

	public void setTessera(String tessera) {
		this.tessera = tessera;
	}
	
	public void aggiornaPrezzi() { //applico gli sconti dei singoli prodotti
		if(listaProdotti != null) {
			for(Prodotto prd : listaProdotti) {
				prd.applicaSconto();
			}
		}
	}

	public double calcolaTotale() {
		double totale = 0;
		if(listaProdotti != null) {
			for(Prodotto prd : listaProdotti) {
				totale += prd.getPrezzoUnitario();
			}
		}
		
		if(tessera != null && !tessera.equals(""))
			totale *= 0.95; // 5% di sconto con tessera
		
		return totale;
	}

	public static void main(String[] args) {
		Scanner snr = new Scanner(System.in);
		Scanner snr2 = new Scanner(System.in);

		
		LocalDate date = LocalDate.of(2021, 2, 28);
		Prodotto[] p = new Prodotto[6];
		
		ArrayList<Prodotto> prd = new ArrayList<Prodotto>();
		
		p[0] = new Alimentare("8090909A","Prodotto A",1, date);
		p[1] = new Alimentare("8090909B","Prodotto B",2, date);
		p[2] = new Alimentare("8090909C","Prodotto C",3, date);
		
		p[3] = new NonAlimentare("NO90909D","Prodotto D",1, "carta");
		p[4] = new NonAlimentare("NO90909E","Prodotto E",2, "plastica");
		p[5] = new NonAlimentare("NO90909F","Prodotto F",3, "vetro");
		
		int ind = 0;
		do {
			for(int i = 0; i < p.length; i++) {
				System.out.println(i + ") " + p[i].toString());
			}
			
			System.out.println("Inserire il numero per aggiungere alla spesa: (-1 per uscire)");
			ind = snr.nextInt();
			
			if(ind >=0 && ind <= p.length)
				prd.add(p[ind]);

		} while (ind >= 0 && ind <= 5);
		
		
		ListaSpesa ls = new ListaSpesa("",prd);	
		
		ls.aggiornaPrezzi();
		
		double totale = ls.calcolaTotale();
		
		System.out.println("Totale Scontato: " + totale);

	}

}
