
package ex05_2_exercise;

public class ShoppingCart {

	public static void main(String[] args) {
		// local variables
		String customerName = "Ivan Garcia";
		String message = customerName + " wants to purchase a several items.";

		System.out.println(message);

		// Declare and initialize the items String array
		String[] items = { "Shirt", "Socks", "Scarf", "Belt" };

		// Change message to show the number of items purchased.
		message = customerName + " wants to purchase a " + items.length + " items.";

		System.out.println(message);

		// Print an element from the items array.
		System.out.println(items[0]);
		System.out.println(items[1]);
		System.out.println(items[2]);
		System.out.println(items[3]);

		// System.out.println(items[4]);

	}

}
