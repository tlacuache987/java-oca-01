
package ex05_3_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String customerName = "Ivan Garcia";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;

        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";
        
        message = customerName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
        
       // Iterate through and print out the items from the items array
        
        double[] prices = {1.5, 2.01, 4.4, 3.02};
        
        System.out.println("Items purchased:");
        
        for(String item : items) {
        	System.out.println(item);
        }
        
        System.out.println("=====================");

        for(int i=0; i<items.length; i++) {
        	System.out.println(items[i] + " costs: " + prices[i]);
        }
        
    }    
}
