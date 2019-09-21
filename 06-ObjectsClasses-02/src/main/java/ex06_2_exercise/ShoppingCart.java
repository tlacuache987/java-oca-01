package ex06_2_exercise;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ShoppingCart {

	public static void main(String args[]) {
		// Declare and initialize 2 Item objects
		Item item1 = new Item();
		Item item2 = new Item();
		

		// Print both item descriptions and run code.
		item1.desc = "Lala";
		item2.desc = "Lele";
		
		System.out.println(item1.desc);
		System.out.println(item2.desc);

		System.out.println();
		// Assign one item to another and run it again.
		item1 = item2;
		
		System.out.println(item1.desc);
		System.out.println(item2.desc);

	}

}
