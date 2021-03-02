import java.util.HashMap;

public class MainDistributore {

	public static void main(String[] args) throws TesseraNonValida, BevandaNonValida, BevandaEsaurita, CreditoInsufficiente {
		BevandeCod bevandecod= new BevandeCod();
		
		Bevanda acqua = new Bevanda("Acqua", 0.2);
		Bevanda coca = new Bevanda("Coca", 0.3);
		Bevanda birra = new Bevanda("Birra", 1);
		Bevanda caffe = new Bevanda("Caffe", 0.5);
		
		// assiocia codice - bevande
		bevandecod.put("A", acqua);
		bevandecod.put("B", coca);
		bevandecod.put("C", birra);
		bevandecod.put(null, caffe);

		
		Tessere tsr = new Tessere();
		
		// tessere credito
		tsr.put(123, 1.0);
		tsr.put(122, 2.0);
		tsr.put(121, 3.0);
		
		bevandecod.aggiungiBevanda("B","Light");
		
		System.out.println("Bevanda          :  " + bevandecod.get("B").getName());
		System.out.println("Prezzo           :  " + bevandecod.get("B").getPrice());
		System.out.println("Descrizione      :  " + bevandecod.get("B").getDescrizione());
		
		
		System.out.println("Credito residuo  :  " + tsr.leggiCredito(123));
		
		//incrementa di 1 la tessera 123
		tsr.caricaTessera(123, 1);

		System.out.println("Credito residuo  :  " + tsr.leggiCredito(123));

		
		// associa quantita - bevanda
		HashMap<Integer, QuantitaBevanda> colonna = new HashMap<Integer, QuantitaBevanda>();
		
		QuantitaBevanda qAcqua = new QuantitaBevanda(40, acqua);
		QuantitaBevanda qCoca = new QuantitaBevanda(20, coca);
		QuantitaBevanda qBirra = new QuantitaBevanda(10, birra);
		QuantitaBevanda qCaffe = new QuantitaBevanda(15, caffe);
		
		colonna.put(1, qAcqua);
		colonna.put(2, qCoca);
		colonna.put(3, qBirra);
		colonna.put(4, qCaffe);
		
		Distributore distr = new Distributore(colonna, bevandecod);
		
		System.out.println("---------------------------------------------");
		System.out.println("Bevanda      :  " + colonna.get(1).getBevanda().getName());
		System.out.println("Prezzo       :  " + colonna.get(1).getBevanda().getPrice());
		System.out.println("Descrizione  :  " + colonna.get(1).getBevanda().getDescrizione());
		System.out.println("Quantita     :  " + colonna.get(1).getQuantita());
		
		System.out.println("---------------------------------------------");
		// aggiorna numero di Acqua
		distr.aggiornaColonna(1, "Acqua", 2);
		
		System.out.println("Quantita         :  " + colonna.get(1).getQuantita());
		System.out.println("---------------------------------------------");
		
		// disponibilita di A
		System.out.println("Quantita di A    :  " + distr.lattineDisponibili("A"));
		System.out.println("---------------------------------------------");

		//erogazione
		System.out.println("Erogato da       :  " + distr.eroga(123, "A", tsr, bevandecod));
		
		System.out.println("Quantita di A    :  " + distr.lattineDisponibili("A"));

		System.out.println("Credito residuo  :  " + tsr.leggiCredito(123));
		
		
	}

}
