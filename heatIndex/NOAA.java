package heatIndex;
import java.util.Scanner;
public class NOAA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double result = 0;
		System.out.printf("       ");
		for (double x = 80; x<=110; x = x + 2) 
		{
			System.out.printf("%5.0f", x);
		}
		
		System.out.println();
		System.out.println("_______________________________________________________________________________________");
		for (double RH = 40; RH <= 100; RH = RH + 5){
			System.out.printf("%4.0f | ",RH);
			for (double T = 80; T <= 110; T += 2){
					result = (-42.379 + 2.04901523*T + 10.14333127*RH - .22475541*T*RH - .00683783*T*T - 
					.05481717*RH*RH + .00122874*T*T*RH + .00085282*T*RH*RH - .00000199*T*T*RH*RH);
					if (result < 137) {
					System.out.printf("%5.0f",result);
				}
					else
						System.out.print(" ");
			}
			System.out.println(); 
		}
//IO
		
		while(true) {
            
			System.out.print("Enter a temperature or 0 to end: ");
            int tempIn = in.nextInt(); 
            System.out.println();

            System.out.print("Enter humidity: ");
            int humidIn = in.nextInt();
            System.out.println();

            double index = -42.379 + 2.04901523*tempIn + 10.14333127*humidIn - .22475541*tempIn*humidIn - .00683783*tempIn*tempIn - .05481717*humidIn*humidIn
            		+ .00122874*tempIn*tempIn*humidIn + .00085282*tempIn*humidIn*humidIn - .00000199*tempIn*tempIn*humidIn*humidIn;
            if (tempIn == 0) {
                break;
            } 
            
            else {
                if (index<90) {
                    System.out.println("Caution");
                }
                else if (index <105) {
                    System.out.println("Extreme Caution");
                }
                else if (index <126) {
                    System.out.println("Extreme Caution");
                }
                else {
                    System.out.println("Extreme Caution");
                }
            }
        }
	}

}
