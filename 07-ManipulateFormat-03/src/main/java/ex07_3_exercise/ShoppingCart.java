package ex07_3_exercise;

public class ShoppingCart {

	public static void main(String[] args) {

		int int1; // 2,147,483,647

		// Declare and initialize variables of type long, float, and char.
		long long1 = 2_147_483_647L;// 99_000_000_000L;
		float float1 = 13.5F;
		char char1 = 'I';

		// Print the long variable.
		System.out.println("long1: " + long1);

		System.out.println();

		// Assign the long to the int and print the int variable.
		int1 = (int) long1;
		System.out.println("int1: " + int1);

	}
}
