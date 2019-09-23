package ex08_1_exercise;

import java.net.StandardSocketOptions;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ShoppingCart {

	public static void main(String[] args) {

		Item item1 = new Item();

		// Call the setColor method on item1. Print the new color value from
		// item1 if the method returns true. Otherwise print an "invalid color"
		// message.

		boolean isValidColor = item1.setColor('A');

		if (isValidColor) {
			System.out.println("item1.color: " + item1.color);
		} else {
			System.out.println("Invalid color");
		}

		// Test the class, using both valid and invalid colors.
		System.out.println();

		String message = item1.setColor(' ') ? "item1.color: " + item1.color : "Invalid color";

		System.out.println(message);

		System.out.println();
		Customer c = new Customer(Customer.nextId, "Ivan");

		Customer.printDesc(c);

		Customer c2 = new Customer(Customer.nextId, "Ivan");

		Customer.printDesc(c2);
		
		System.out.println(Math.cos(1.65));
	}

	static class Customer {
		static int nextId = 1;
		int id;
		String name;

		Customer(int id, String name) {
			this.id = id;
			this.name = name;
			nextId++;
		}

		public static void printDesc(Customer a) {
			System.out.println(a.id + " " + a.name);
		}
	}

}
