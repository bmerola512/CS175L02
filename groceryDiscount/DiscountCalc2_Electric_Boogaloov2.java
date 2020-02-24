package groceryDiscount;

import java.util.Scanner;

public class DiscountCalc2_Electric_Boogaloov2 {
    public static void main(String[] args) {
      //  Scanner in = new Scanner(System.in);
        boolean reallyLeave = false;
        double discount = 0;
        double spent = 8;
// user input            
        
       while (reallyLeave == false) {
           Scanner in = new Scanner(System.in);
    	   System.out.println("Please enter the cost of your groceries. To end enter 0: ");
            
    	   	while (in.hasNextDouble()) {
                spent = in.nextDouble();
                
// if and buts               
                if (spent >= 10 && spent <= 1000) {
                    if (spent >= 10 && spent <= 60) {
                        
                    	discount = 0.08 * spent;
                        System.out.printf("You win a discount coupon of $%.2f (8 percent of your purchase). " , discount);
                        System.out.println("Enter another amount or 0 to end");
                    }
                    
                    else if (spent > 60 && spent <= 150) {
                        
                    	discount = 0.1 * spent;
                        System.out.printf("You win a discount coupon of $%.2f (10 percent of your purchase). " , discount);
                        System.out.println("Enter another amount or 0 to end");
                    }
                    
                    else if (spent > 150 && spent <= 210) {
                        
                    	discount = 0.12 * spent;
                        System.out.printf("You win a discount coupon of $%.2f (12 percent of your purchase). " , discount);
                        System.out.println("Enter another amount or 0 to end");
                    }
                    
                    else if (spent > 210) {
                        
                    	discount = 0.14 * spent;
                        System.out.printf("You win a discount coupon of $%.2f (14 percent of your purchase). " , discount);
                        System.out.println("Enter another amount or 0 to end");
                    }
                }
                
                else if (spent == 0) {
                    
                	System.out.println("Exiting");
                	reallyLeave = true;
                    break;
                }
                
                else {
                    System.out.println("Amount has to be within $10 and $1000 to be eligible. Enter another amount or 0 to end.");
                }
                
            }
    	   	
       }
       System.out.println("Exited program");
    }
}