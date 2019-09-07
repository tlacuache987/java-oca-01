
package ex04_1_exercise;

public class ShoppingCart {

	public static void main(String[] args) {
		// Declare and initialize String variables. Do not initialize message yet.
		String customerName = "Ivan Garcia";
		String itemDesc = "Shirt";

		// message declaration
		String message;

		// Assign the message variable
		message = customerName + " wants to purchase a " + itemDesc;

		// Print and run the code
		System.out.println(message);

		// Assign the message variable
		message = message + " !!!";

		// Print and run the code
		System.out.println(message);
		
		System.out.println(3/0);

	}

}
