package groceryDiscount;

import java.util.Scanner;

public class DiscountCalc2_Electrc_Boogaloo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		// UASK
		double spent = 1;
		int bool = 1;
		while (bool == 1) {
		System.out.print("How much did you spend on groceries?: ");
		spent = in.nextDouble();
		
		while (spent > 1000 || spent <= 10) {
			System.out.println("Enter a valid value between $9 and $1000");
			System.out.println("How much did you spend on groceries?: ");
			spent = in.nextDouble();
		}
		
		// CALC&IF
		if (spent < 10.00) {
			System.out.println("You are not eligible for a coupon at this time.");
		}
		else if (spent >= 10.00 && spent <= 60.00) {
			double disc8 = spent * .08;
			System.out.println("You win a discount coupon of $ " + String.format("%.2f", disc8) + ". (8% of your purchase)");
			}
		else if (spent > 60.00 && spent <= 150.00) {
			double disc10 = spent * .10;
			System.out.println("You win a discount coupon of $ " + String.format("%.2f", disc10) + ". (10% of your purchase)");
			}
		else if (spent > 150.00 && spent <= 210.00) {
			double disc12 = spent * .12;
			System.out.println("You win a discount coupon of $ " + String.format("%.2f", disc12) + ". (12% of your purchase)");
			}
		else if (spent > 210.00) {
			double disc14 = spent * .14;
			System.out.println("You win a discount coupon of $ " + String.format("%.2f", disc14) + ". (8% of your purchase)");
			}
		System.out.println("Type '1' to enter another number or '0' to quit: ");
		bool = in.nextInt();	
		// to use string string1.equals(string2)
		}
	}
}

