package groceryDiscount;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		final String pin = "1234";
		Scanner in = new Scanner(System.in);
		
		while (i != 3) {
		
			System.out.println("Enter PIN");
			String ui = in.next();
			i = i + 1;
		
			if (ui.equals(pin)) {
				System.out.println("Correct");
				break; 
				}
			else if (!ui.equals(pin)) {
				System.out.println("Incorect. You have " + (3 - i) + " tries remaining.");
				if (i == 3)
					System.out.println("You have been locked out after 3 failed attempts");
				}
		}
	}

}
