
package ex04_2_exercise;

public class ShoppingCart {

	public static void main(String[] args) {
		String customerName = "Ivan Garcia";
		String itemDesc = "Shirt";
		
		String message = customerName + " wants to purchase a " + itemDesc;

		System.out.println(message);

		// Declare and initialize numeric fields: price, tax, quantity, and total.
		double price, tax;
		price = 29.99;
		tax = 1.04;

		int quantity = 2;

		// Modify message to include quantity
		message = customerName + " wants to purchase " + quantity + " " + itemDesc;

		System.out.println(message);

		// Calculate total and then print the total cost

		double total = quantity * price * tax;

		System.out.println("Total cost with taxes: " + total);

	}
}
