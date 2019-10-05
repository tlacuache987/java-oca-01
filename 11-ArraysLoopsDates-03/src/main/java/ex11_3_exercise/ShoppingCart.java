
package ex11_3_exercise;

public class ShoppingCart {
	Item[] items = { new Item("Shirt", 25.60), new Item("WristBand", 2.5), new Item("Pants", 35.99) };

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.displayTotal();
		cart.displayTotal2();
	}

	// Use a standard for loop to iterate through the items array, adding up the
	// total price
	// Skip any items that are back ordered. Display the Shopping Cart total.
	public void displayTotal() {

		double totalPrice = 0;

		for (int index = 0; index < items.length; index++) {
			if (!items[index].isBackOrdered()) {
				totalPrice += items[index].getPrice();
			}
		}

		System.out.println("Total Shopping cart: $ " + totalPrice);

	}
	
	public void displayTotal2() {

		double totalPrice = 0;

		for (Item item : items) {
			if (item.isBackOrdered()) {
				continue;
			}
			totalPrice += item.getPrice();
		}

		System.out.println("Total Shopping cart: $ " + totalPrice);

	}
}
