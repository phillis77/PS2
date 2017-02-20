package quiz1;

import java.util.Scanner;

public class quiz1 {
	// This class is used to calculating QB Rating for a football player.

	public static void main(String[] args) {
		/*
		 * main method is for asking inputs from users and print out the final
		 * QB Rating
		 */

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Enter the touchdown passes (TD)
		System.out.println("Please enter the touchdown passes (TD)");
		double TD = input.nextDouble();

		// Enter the number of passing attempts (ATT)
		System.out.println("Please enter the number of passing attempts (ATT)");
		double ATT = input.nextDouble();

		// Enter the passing yards (YDS)
		System.out.println("Please enter the passing yards (YDS)");
		double YDS = input.nextDouble();

		// Enter the numbwe of completions (COMP)
		System.out.println("Please enter the numbwe of completions (COMP)");
		double COMP = input.nextDouble();

		// Enter the interceptions (INT)
		System.out.println("Please enter the interceptions (INT)");
		double INT = input.nextDouble();

		// Calling the eqns method and assigning the QB Rating value to QB
		// variable
		double QB = eqns(TD, ATT, YDS, COMP, INT);

		// Printing out the QB variable
		System.out.printf("The QB rating is %4.1f ", QB);
		
		input.close();

	}

	public static double eqns(double TD, double ATT, double YDS, double COMP, double INT) {
		/* eqn method containing all math equations we need */

		double a = ((COMP / ATT) - 0.3) * 5;
		// If the result of any calculation is greater than 2.375, it is set to
		// 2.375.
		if (a > 2.375){
			a = 2.375;
		}
		// If the result is a negative number, it is set to zero.
		else if (a < 0){
			a = 0;
		}
		
		double b = ((YDS / ATT) - 3) * 0.25;
		// If the result of any calculation is greater than 2.375, it is set to
		// 2.375.
		if (b > 2.375){
			b = 2.375;
		}
		// If the result is a negative number, it is set to zero.
		else if (b < 0){
			b = 0;
		}
		
		double c = (TD / ATT) * 20;
		// If the result of any calculation is greater than 2.375, it is set to
		// 2.375.
		if (c > 2.375){
			c = 2.375;
		}
		// If the result is a negative number, it is set to zero.
		else if (c < 0){
			c = 0;
		}
		
		double d = 2.375 - ((INT / ATT) * 25);
		// If the result of any calculation is greater than 2.375, it is set to
		// 2.375.
		if (d > 2.375){
			d = 2.375;
		}
		// If the result is a negative number, it is set to zero.
		else if (d < 0){
			d = 0;
		}
		// Calculating the QB Rating
		double Passer_Rating = ((a + b + c + d) / 6) * 100;

		// Returning the QB Rating
		return Passer_Rating;

	}

}
