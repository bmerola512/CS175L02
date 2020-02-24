package groceryDiscount;

import java.util.Scanner;

public class Tip {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
// var		
		double tipVal; 
		double tip = 0;
// ui		
		System.out.println("How satisfied are you, with 1 being totally satisfied, 2 being satisfied, and 3 being dissatisfied?");
		int satis = in.nextInt();
		System.out.println("What is the bill?");
		double bill = in.nextDouble();
// ifs		
		if (satis == 3) {
			tipVal = .2;
			tip = bill * tipVal;
		}
		else if (satis == 2) {
			tipVal = .15;
			tip = bill * tipVal;
		}
		else if (satis == 1) {
			tipVal = .1;
			tip = bill * tipVal;
		}
// ex		
		System.out.printf("Your suggested tip is $%.2f.", tip);
		System.out.println(" from a satisfaction of " + satis + ".");
	}

}
