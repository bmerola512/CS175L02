package carDecision2;

import java.util.Scanner;

public class CarCostCalculation2 {

	public static void main(String[] args) {

			// v2 User inputs
				@SuppressWarnings("resource")
				Scanner in = new Scanner(System.in);
//				@SuppressWarnings("resource")
//				Scanner in1 = new Scanner(System.in);
				
				System.out.println("Enter the information for the regular car (format Make and Model, Cost, MPG): ");
				String regInfo = in.nextLine();
				
				System.out.println("Enter the information for the hybrid car (format Make and Model, Cost, MPG): ");
				String hybInfo = in.nextLine();
				
				System.out.print("Enter miles traveled in a year: ");
				double miTrav = in.nextDouble();
				
				System.out.print("Enter cost per gallon of gas: ");
				double costGal = in.nextDouble();
				
			// Splits and variables from u input
				String[] arrReginf = regInfo.split(", ");
					String mmReg = arrReginf[0];
					int costReg = Integer.parseInt(arrReginf[1]);
					int mpgReg = Integer.parseInt(arrReginf[2]);
				
				String[] arrHybinf = hybInfo.split(", ");
					String mmHyb = arrHybinf[0];
					int costHyb = Integer.parseInt(arrHybinf[1]);
					int mpgHyb = Integer.parseInt(arrHybinf[2]);
				
			// Calculations
				double yearGasreg = (miTrav / mpgReg) * costGal;
				double yearReg = costReg + yearGasreg;
				double year2Reg = yearGasreg + yearReg;
				double year3Reg = yearGasreg + year2Reg; 
				double year4Reg = yearGasreg + year3Reg;
				double year5Reg = yearGasreg + year4Reg;
				double yearGashyb = (miTrav / mpgHyb) * costGal;
				double yearHyb = costHyb + yearGashyb;
				double year2Hyb = yearGashyb + yearHyb;
				double year3Hyb = yearGashyb + year2Hyb; 
				double year4Hyb = yearGashyb + year3Hyb;
				double year5Hyb = yearGashyb + year4Hyb;
			
			// Info dump
				System.out.println("Cost to own after year 1 for " + mmReg + ": " + yearReg + " for " + mmHyb + ": "  + yearHyb);
				System.out.println("Cost to own after year 2 for " + mmReg + ": " + year2Reg + " for " + mmHyb + ": "  + year2Hyb);
				System.out.println("Cost to own after year 3 for " + mmReg + ": " + year3Reg + " for " + mmHyb + ": "  + year3Hyb);
				System.out.println("Cost to own after year 4 for " + mmReg + ": " + year4Reg + " for " + mmHyb + ": "  + year4Hyb);
				System.out.println("Cost to own after year 5 for " + mmReg + ": " + year5Reg + " for " + mmHyb + ": "  + year5Hyb);
				
			// Is the hybrid less expensive after 5 years?
				if (year5Hyb < year5Reg)
				{
					System.out.println("The " + mmHyb + "pays back after 5 years");
					}
			}
}


