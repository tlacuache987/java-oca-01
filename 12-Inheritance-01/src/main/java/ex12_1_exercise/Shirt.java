package ex12_1_exercise;

public class Shirt extends Item {

	private char size;
	private char colorCode;

	public Shirt(double price, char size, char colorCode) {
		super("A Shirt", price);
		this.size = size;
		this.colorCode = colorCode;
	}
	
	public void setId() {
		this.setId(true);
		System.out.println("Shirt Id setted 2.");
	}
	
	public void setId(boolean x) {
		super.setId();
		System.out.println("Shirt Id setted 1.");
	}
}
