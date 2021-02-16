package person;

public class TestEmployee {

	public static void main(String[] args) {
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee("Mario","Rossi","MARROS90B19Z210Q","Milano",2003,1002);
		emp[1] = new Employee("Luigi","Blues","LUIBLU93C23Z210Q","Milano",2010,1001);
		emp[2] = new Employee("Lucas","Verdi","LUCVER92B19Z210Q","Milano",2019,1003);
		
		
		int indMax = 0;
		for(int i = 0; i < emp.length; i++)
			if(!emp[indMax].gainsMore(emp[i]))
				indMax = i;
		
		System.out.println("Nome: " + emp[indMax].getName());
		System.out.println("Cognome: " + emp[indMax].getSurname());
		System.out.println("Cod. Fiscale: " + emp[indMax].getTax_code());
		System.out.println("Citt¨¤: " + emp[indMax].getCity());
		System.out.println("Anno Assunzione: " + emp[indMax].getAnnoAssunzione());
		System.out.println("Stipendio: " + emp[indMax].getStipendio());
		System.out.println("Anno di Nascita: " + emp[indMax].bornYear());
		
	}

}
