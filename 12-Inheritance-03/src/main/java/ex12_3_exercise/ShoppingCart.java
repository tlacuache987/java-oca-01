package ex12_3_exercise;

public class ShoppingCart {
	public static void main(String[] args) {
		// declare and instantiate a Shirt object using an Item reference type

		Item item = new Shirt(15.87, 'L', 'B');

		// call the display method on the object, then the getColor method
		item.display();

		if (item instanceof Shirt) {
			Shirt shirt = (Shirt) item;
			System.out.println("Shirt color is: " + shirt.getColor());
		} else {
			System.out.println("Item is not a Shirt");
		}
		
		Clothing c1 = new Clothing() {
			
			@Override
			public void hola() {
				System.out.println("Hola brotheeer");
			}
		};
		
		Clothing c2 = new Clothing() {
			
			@Override
			public void hola() {
				System.out.println("Hola brotheeer");
			}
		};
		
		c1.hola();
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.getClass().equals(c2.getClass()));
		
		System.out.println(c1 instanceof Clothing);
		System.out.println(c2 instanceof Clothing);
	}
	
	
}

abstract class Clothing{
	public abstract void hola();
}