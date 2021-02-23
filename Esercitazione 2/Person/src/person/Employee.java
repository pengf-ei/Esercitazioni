package person;

public class Employee extends Person {
	private int annoAssunzione;
	private int stipendio;
	
	public Employee(int annoAssunzione, int stipendio) {
		super();
		this.annoAssunzione = annoAssunzione;
		this.stipendio = stipendio;
	}

	public Employee(String name, String surname, String tax_code, String city, int annoAssunzione, int stipendio) {
		super(name, surname, tax_code, city);
		this.annoAssunzione = annoAssunzione;
		this.stipendio = stipendio;
	}

	public int getAnnoAssunzione() {
		return annoAssunzione;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setAnnoAssunzione(int annoAssunzione) {
		if(annoAssunzione > 1900)
			this.annoAssunzione = annoAssunzione;
	}

	public void setStipendio(int stipendio) {
		if(stipendio > 0)
			this.stipendio = stipendio;
	}

	public void visualize() {
		System.out.println("Nome: " + super.getName());
		System.out.println("Cognome: " + super.getSurname());
		System.out.println("Cod. Fiscale: " + super.getTax_code());
		System.out.println("Citt¨¤: " + super.getCity());
		System.out.println("Anno Assunzione: " + this.getAnnoAssunzione());
		System.out.println("Stipendio: " + this.getStipendio());
		System.out.println("Anno di Nascita: " + super.bornYear());
	}
	
	public boolean gainsMore(Employee e) {
		if(e != null) {
			if(this.getStipendio() > e.getStipendio())
				return true;
			else
				return false;
		} else 
			return false;
	}
	

}
