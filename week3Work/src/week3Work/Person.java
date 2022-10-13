package week3Work;

public class Person {
	String NationalIdentity;
	String FirstName;
	String LastName;
	
	public Person() {
		System.out.println("Person Başlatıldı");

	}
	
	public String getNationalIdentity() {
		return NationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
}
