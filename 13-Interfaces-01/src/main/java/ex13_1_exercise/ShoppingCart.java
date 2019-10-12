package ex13_1_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class ShoppingCart {
	public static void main(String[] args) {
		String[] days = { "monday", "saturday", "tuesday", "sunday", "friday" };

		// Convert the days array into an ArrayList
		List<String> arrayList = new ArrayList<>(Arrays.asList(days));

		List<String> arrayList2 = ShoppingCart.obtenLista(() -> Arrays.asList(days));

		// Loop through the ArrayList, printing out "sunday" elements in
		// upper case (use toUpperCase() method of String class)
		// Print all other days in lower case
		for (String day : arrayList) {

			if (day.equals("sunday")) {
				System.out.println(day.toUpperCase());
			} else {
				System.out.println(day);
			}

		}

		// Print out the ArrayList
		System.out.println();
		System.out.println(arrayList);

		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String s) {
				if (s.equals("sunday"))
					return true;
				else
					return false;
			}
		};
		arrayList.removeIf(predicate);
		arrayList.removeIf(new MyPredicate());
		arrayList.removeIf(new MyPredicate2());

		arrayList.removeIf((String s) -> {
			if (s.equals("sunday"))
				return true;
			else
				return false;
		});

		arrayList.removeIf(x -> {
			if (x.equals("monday"))
				return true;
			else
				return false;
		});

		arrayList.removeIf(x -> x.equals("friday") ? true : false);

		System.out.println(arrayList);

		System.out.println();

		UnaryOperator<String> unaryOperator = d -> d.toUpperCase() + "!";

		arrayList.replaceAll(unaryOperator);

		System.out.println(arrayList);
	}

	private static List<String> obtenLista(Supplier<List<String>> supplier) {
		return supplier.get();
	}
}

class MyPredicate implements Predicate<String> {

	@Override
	public boolean test(String s) {
		if (s.equals("sunday"))
			return true;
		else
			return false;
	}
};

class MyPredicate2 implements Predicate<String> {

	@Override
	public boolean test(String s) {
		if (s.equals("monday"))
			return true;
		else
			return false;
	}
};