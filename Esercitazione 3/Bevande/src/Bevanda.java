
public class Bevanda {
	
	private String name;
	private double price = -1;
	private String descrizione;

	public Bevanda(String name, double price) {
		super();
		this.name = name;
		if(price > 0)
			this.price = price;
	}
	
	public String descrizioneBevanda() {
		return descrizione;
	}
	
	public void aggiungiBevanda(String descrizione) {
		if(descrizione != null)
			this.descrizione = descrizione;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null)
			this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price > 0)
			this.price = price;
	}
	
	

}
