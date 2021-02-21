
public class Addizione extends MetodiComuni implements Operazione {
	private double ris;
	
	
	public Addizione() {
		super();
		this.ris = 0;
	}
	

	public double getRis() {
		return ris;
	}



	@Override
	public void esegui(Object obj, Object obt) {
		this.ris = ((Operando) obj).getOp() + ((Operando) obt).getOp();
	}

	@Override
	public void stampa() {
		System.out.println("Risultato addizione : " + this.getRis());

	}

}

