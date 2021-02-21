
public class Moltiplicazione extends MetodiComuni implements Operazione {
	private double ris;

	public double getRis() {
		return ris;
	}
	

	public Moltiplicazione() {
		super();
		this.ris = 0;
	}

	@Override
	public void esegui(Object obj, Object obt) {
		this.ris = ((Operando) obj).getOp() * ((Operando) obt).getOp();

	}

	@Override
	public void stampa() {
		System.out.println("Risultato moltiplicazione : " + this.getRis());

	}

}
