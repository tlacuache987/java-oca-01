package ex12_2_exercise;

import java.util.Random;

public class ShoppingCart {
	public static void main(String[] args) {
		// instantiate a Shirt object and call the display() method
		Shirt shirt = new Shirt(25.99, 'M', 'P');

		shirt.display();

		Clothing clothing1 = ShoppingCart.getClothing();

		clothing1.saludar();

		if (clothing1 instanceof Trousers) {
			((Trousers) clothing1).despedir();
		}

		if (clothing1 instanceof Socks) {
			((Socks) clothing1).apesto();
		}
	}

	private static Clothing getClothing() {
		Random random = new Random();
		if ((random.nextInt(10)) % 2 == 0)
			return new Trousers();
		else
			return new Socks();
	}
}

class Clothing {

	public void saludar() {
		System.out.println("clothing saluda");
	}
}

class Trousers extends Clothing {
	public void saludar() {
		System.out.println("trousers saluda");
	}

	public void despedir() {
		System.out.println("Adios...");
	}
}

class Socks extends Clothing {
	public void saludar() {
		System.out.println("socks saluda");
	}

	public void apesto() {
		System.out.println(":(");
	}
}