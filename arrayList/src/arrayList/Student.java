package arrayList;

public class Student {
	
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Student(String firstName, String lastName, int birthYear) {
		setFirstName(firstName);
		setLastName(lastName);
		setBirthYear(birthYear);
	}
	
	//overloaded constructor
	public Student(int birthYear, String firstName,  String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
		setBirthYear(birthYear);
	}
	
	//overloaded constructor
	public Student(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	/*
	 * @ return  firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/*
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/*
	 * @return birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}
	
	/*
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
		
	}
	
	/*
	 *@param lastName 
	 */
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	
	/*
	 * @param birthYear
	 */
	public void setBirthYear(int birthYear) {
		if (birthYear > 1900) {
			this.birthYear = birthYear;
		} else {
			this.birthYear = 1900;
		}
	}
	
	
	
	
	
	
	
	

}