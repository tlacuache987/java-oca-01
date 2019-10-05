package ex11_4_exercise;

public class Guess {
	
	public static void main(String[] args) {
		
		String name = "Jhany";
		String guess = "";
		int attempts = 0;
		
		while (!guess.equalsIgnoreCase(name)) {
			guess = "";
			
			while(guess.length() < name.length()){
				char asciiChar = (char) (Math.random() * 26 + 97);
				guess += asciiChar;
			}
			attempts++;
		}
		
		System.out.println("name : " + guess + " found after " + attempts + " tries !");
	}

}
