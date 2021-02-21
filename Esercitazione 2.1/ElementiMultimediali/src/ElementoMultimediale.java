
public abstract class ElementoMultimediale {
	private String titolo;
	
	public ElementoMultimediale(String titolo) {
		super();
		if(titolo != null)
		this.titolo = titolo;
	}

	public abstract void esegui();

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	

}
