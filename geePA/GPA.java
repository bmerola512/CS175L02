package geePA;

import java.util.Scanner;

public class GPA {

	public static void main(String[] args) {
// Decs
		final double A = 4.00;
		final double Aminus = 3.70;
		final double Bplus = 3.33;
		final double B = 3.00;
		final double Bminus = 2.70;
		final double Cplus = 2.30;
		final double C = 2.00;
		final double Cminus = 1.70;
		final double Dplus = 1.30;
		final double D = 1.00;
		final double Dminus = 0.70;
		final double F = 0.00;
		double GPA = 0;
		double totalCreditsEarned = 0;
		double totalAttempted = 0;
		double creditsEarned = 0;
		
		Scanner in = new Scanner(System.in);
		//String courseInfo = "a";

// #courses
		System.out.println("How many courses are you entering? ");
		String howManyST = in.next();
		int howMany = Integer.parseInt(howManyST);
		
// IO	
		for (int entered = 1; entered <= howMany; entered++) {
		
			System.out.println("Enter course information (title,credit hours,letter grade) or type q to quit: ");
			String courseInfo = in.next();
			System.out.println(courseInfo);
		
			String[] courseInfoArray = courseInfo.split(",");
			String title = courseInfoArray[0].trim();
			double creditHours = Double.parseDouble(courseInfoArray[1].trim());
			String letterGrade = courseInfoArray[2].trim();
			
// IfGPA			
			if (letterGrade.equals("A")) {
				creditsEarned = A * creditHours;
			}
			
			if (letterGrade.equals("A-")) {
				creditsEarned = Aminus * creditHours;
			}
			
			if (letterGrade.equals("B+")) {
				creditsEarned = Bplus * creditHours;
			}
			
			if (letterGrade.equals("B")) {
				creditsEarned = B * creditHours;
			}
			
			if (letterGrade.equals("B-")) {
				creditsEarned = Bminus * creditHours;
			}
			
			if (letterGrade.equals("C+")) {
				creditsEarned = Cplus * creditHours;
			}
			
			if (letterGrade.equals("C")) {
				creditsEarned = C * creditHours;
			}
			
			if (letterGrade.equals("C-")) {
				creditsEarned = Cminus * creditHours;
			}
			
			if (letterGrade.equals("D+")) {
				creditsEarned = Dplus * creditHours;
			}
			
			if (letterGrade.equals("D")) {
				creditsEarned = D * creditHours;
			}
			
			if (letterGrade.equals("D-")) {
				creditsEarned = Dminus * creditHours;
			}
			
			if (letterGrade.equals("F")) {
				creditsEarned = F * creditHours;
				
			}
			
			totalCreditsEarned = totalCreditsEarned+ creditsEarned;
			totalAttempted = totalAttempted + creditHours;
		}
// Calc
		GPA = totalCreditsEarned/totalAttempted;
		
		System.out.println("Your GPA is: " + GPA);
	}

}
//}
