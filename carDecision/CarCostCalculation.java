package carDecision;

import java.util.Scanner;

public class CarCostCalculation {
	
	public static void main(String[] args) {
		
	// User inputs
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter cost of regular car: ");
		double costReg = in.nextDouble();
		
		System.out.print("Enter MPG of regular car: ");
		double mpgReg = in.nextDouble();
		
		System.out.print("Enter cost of hybrid car: ");
		double costHyb = in.nextDouble();
		
		System.out.print("Enter MPG of hybrid car: ");
		double mpgHyb = in.nextDouble();
		
		System.out.print("Enter miles traveled in a year: ");
		double miTrav = in.nextDouble();
		
		System.out.print("Enter cost per gallon of gas: ");
		double costGal = in.nextDouble();
		
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
		System.out.println("Cost to own after year 1 for regular car: " + yearReg + " for hybrid car: " + yearHyb);
		System.out.println("Cost to own after year 2 for regular car: " + year2Reg + " for hybrid car: " + year2Hyb);
		System.out.println("Cost to own after year 3 for regular car: " + year3Reg + " for hybrid car: " + year3Hyb);
		System.out.println("Cost to own after year 4 for regular car: " + year4Reg + " for hybrid car: " + year4Hyb);
		System.out.println("Cost to own after year 5 for regular car: " + year5Reg + " for hybrid car: " + year5Hyb);
		
	// Is the hybrid less expensive after 5 years?
		if (year5Hyb < year5Reg)
		{System.out.println("The hybrid car pays back after 5 years");}
	}

}
