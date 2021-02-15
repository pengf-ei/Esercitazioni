package person;

public class Stagista extends Person {
	private int numberOfPresence;
	private String idNumber;
	
	public Stagista(int numberOfPresence, String idNumber) {
		super();
		this.numberOfPresence = numberOfPresence;
		this.idNumber = idNumber;
		
	}
	
	public Stagista(String name, String surname, String tax_code, String city, int numberOfPresence, String idNumber) {
		super(name, surname, tax_code, city);
		this.numberOfPresence = numberOfPresence;
		this.idNumber = idNumber;
		
	}

	public int getNumberOfPresence() {
		return numberOfPresence;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setNumberOfPresence(int numberOfPresence) {
		this.numberOfPresence = numberOfPresence;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	

}
