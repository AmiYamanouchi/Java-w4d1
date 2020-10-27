
public class Auther {
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Auther(String firstName, String lastName, int birthYear) {
		setFirstName(firstName);
		setLastName(lastName);
		setBirthYear(birthYear);
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public int getBirthYear() {
		return birthYear;
	}
	
	
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
		
	}
	
	
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	

	public void setBirthYear(int birthYear) {
		if (birthYear > 1900) {
			this.birthYear = birthYear;
		} else {
			this.birthYear = 1900;
		}
	}
	
	
}
