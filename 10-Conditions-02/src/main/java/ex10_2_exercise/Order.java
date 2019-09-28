package ex10_2_exercise;

public class Order {

	static final char CORP = 'C';
	static final char PRIVATE = 'P';
	static final char NONPROFIT = 'N';
	String name;
	double total;
	String stateCode;
	double discount;
	char custType;

	public Order(String name, double total, String state, char custType) {
		this.name = name;
		this.total = total;
		this.stateCode = state;
		this.custType = custType;
		calcDiscount();
	}

	public String getDiscount() {
		return Double.toString(discount) + "%";
	}

	// Code the calcDiscount method.
	public void calcDiscount() {
		discount = 0.00;
		if(this.custType == NONPROFIT) {
			if(total > 900) {
				discount = 10.00;
			} else {
				discount = 8.00;
			}
		} else if(this.custType == PRIVATE) {
			if(total > 900) {
				discount = 7.00;
			}
		} else if(this.custType == CORP) {
			if(total > 500) {
				discount = 8.00;
			} else {
				discount = 5.00;
			}
		}
		
	}
}
