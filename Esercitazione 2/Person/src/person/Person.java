package person;

import java.util.Calendar;

public class Person {
	private String name;
	private String surname;
	private String tax_code;
	private String city;
	
	public Person() {
		this.name = null;
		this.surname = null;
		this.tax_code = null;
		this.city = null;
	}

	public Person(String name, String surname, String tax_code, String city) {
		this.name = name;
		this.surname = surname;
		this.city = city;
		
		if(tax_code.matches("^[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$"))
			this.tax_code = tax_code;
		else
			this.tax_code = null;
		
	}
	
	public int bornYear() {
		Calendar c = Calendar.getInstance();
		int currYear = c.get(Calendar.YEAR);
		
		
		if(tax_code != null) {
			String subYear = tax_code.substring(6, 8);
			int year = Integer.parseInt(subYear);
			
			if(year >= 0 && year <= (currYear % 100))
				return year + 2000;
			else
				return year + 1900;
			
		} else
			return -1;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getTax_code() {
		return tax_code;
	}

	public String getCity() {
		return city;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setTax_code(String tax_code) {
		this.tax_code = tax_code;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	

}
