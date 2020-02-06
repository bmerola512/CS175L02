package housePaint;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
// User queries		
		
		System.out.print("What is the length of a side of the house: ");
			int houseLength = in.nextInt();
			
		System.out.print("What is the width of a side of the house: ");
			int houseWidth = in.nextInt();

		System.out.print("What is the side with a peak’s height of a side of the house: ");
			int houseHeightpeak = in.nextInt();
			
		System.out.print("How many windows are there: ");
			int windowAmount = in.nextInt();
			
		System.out.print("What is the length of a window: ");
			int windowLength = in.nextInt();

		System.out.print("What is the height of a window: ");
			int windowHeight = in.nextInt();
			
		System.out.print("How many doors are there: ");
			int doorAmount = in.nextInt();
			
		System.out.print("What is the length of a door: ");
			int doorLength = in.nextInt();
			
		System.out.print("What is the height of a door: ");
			int doorHeight = in.nextInt();
			
		System.out.print("what is the price of the painter per square foot: ");
			double pricePainter = in.nextDouble();

// Calculations			
			
	int baseSurfacearea = 2 * (houseLength * houseWidth) + 2 * (houseLength * houseWidth + 1/2 * (houseLength * (houseHeightpeak - houseWidth)));
	int windowSurfacearea = windowAmount * windowLength * windowHeight;
	int doorSurfacearea = doorAmount * doorLength * doorHeight;
	int finalSurfacearea = baseSurfacearea - (doorSurfacearea + windowSurfacearea);

// Final output	
	System.out.println(baseSurfacearea);
	System.out.println(windowSurfacearea);
	System.out.println(doorSurfacearea);
	System.out.println(finalSurfacearea);
	System.out.println("Your final cost is: $" + pricePainter * finalSurfacearea);
	}

}
