package ex09_2_exercise;

public class Customer {

	private String name;

	private String ssn;

	// Add a custom constructor
	private Customer (String name) {
		this.name = name;
	}
	
	public Customer (String name, String ssn) {
		this(name);
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public String getSSN() {
		return ssn;
	}
}
