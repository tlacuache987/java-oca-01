package ex09_2_exercise;

public class ShoppingCart {

	public static void main(String args[]) {

		// Declare, instantiate, and initialize a Customer object
		Customer cust1 = new Customer("Pepa Pig", "pig-01234");

		// Print the customer object name
		System.out.println("Customer 1 name: " + cust1.getName()+ 
				", ssn : " + cust1.getSSN());

	}
}
