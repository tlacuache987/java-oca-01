package ex09_1_exercise;

public class Customer {

	private String name;

	private String ssn;

	// Encapsulate this class. Make ssn read only.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSsn() {
		return this.ssn;
	}

}
