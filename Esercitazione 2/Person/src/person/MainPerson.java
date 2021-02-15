package person;

public class MainPerson {

	public static void main(String[] args) {
		
		Person persona = new Person("Mario","Super","MARSUP99B19Z210Q","Brooklyn");
		
		System.out.println("Nome: " + persona.getName());
		System.out.println("Cognome: " + persona.getSurname());
		System.out.println("Cod. Fiscale: " + persona.getTax_code());
		System.out.println("Citt¨¤: " + persona.getCity());
		System.out.println("Anno di Nascita: " + persona.bornYear());
		
	}

}
