package ex07_2_exercise;

public class ShoppingCart {

	public static void main(String[] args) {

		String custName = "Steve Smith";
		String firstName;
		String lastName;
		int spaceIdx;
		StringBuilder sb;

		spaceIdx = custName.indexOf(" ");
		firstName = custName.substring(0, spaceIdx);
		lastName = custName.substring(spaceIdx+1);

		System.out.println(firstName);
		System.out.println(lastName);
		
		System.out.println();

		// Instantiate and initialize sb to firstName.
		sb = new StringBuilder(firstName);

		// Put the full name back together, using StringBuilder append method.
		// You can just enter the String literal for the last name.
		// Print the full name.
		sb.append(" ").append(lastName);
		
		System.out.println(sb.toString());

	}
}
