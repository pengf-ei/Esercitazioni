
public class Divisione extends MetodiComuni implements Operazione {
	private double ris;
	
	public Divisione() {
		super();
		this.ris = 0;
	}

	public double getRis() {
		return ris;
	}

	@Override
	public void esegui(Object obj, Object obt) {
		if(((Operando) obt).getOp() != 0)
			this.ris = ((Operando) obj).getOp() / ((Operando) obt).getOp();

	}

	@Override
	public void stampa() {
		System.out.println("Risultato divisione : " + this.getRis());

	}

}
