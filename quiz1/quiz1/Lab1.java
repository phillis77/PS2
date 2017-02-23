/* Lab 1 Members: Zirui Fan, James DiStefano, Yue Feng
*/
package quiz1;
import java.util.Scanner;
public class Lab1 {


	public static void main(String[] args){
		double Year_to_work=input1();
		double Annual_return=input2();
		double Years_required=input3();
		double Annual_return_retirement=input4();	
		double Required_income =input5();
		double Monthly_SSI=input6();
		final double payback= (Required_income-Monthly_SSI);
		double x=0;
		for (int i=0;i<Years_required*12;++i){
			x=(x+payback)/(1+Annual_return_retirement/1200);	
		}
		System.out.printf("Your need  $%4.2f saved total. \n",x);
		double Month_to_work=Year_to_work*12;
		double Month_interestrate=Annual_return/1200;
	
		double y=x*(Month_interestrate/(Math.pow(1+Month_interestrate, Month_to_work)-1));
	
		System.out.printf("You need to save $%4.2f each month.",y);
		
		
	}
	
	
	public static double input1() {

		Scanner input= new Scanner(System.in);
	
		System.out.println("How many years did you work (positive number): ");

		double Year_to_work = input.nextDouble();
		while (Year_to_work<0) {

			System.out.println("Please enter positive number: ");
		
			Year_to_work = input.nextDouble();
			
		}
		return Year_to_work;
		
	}
	
	
	public static double input2() {

		
		Scanner input= new Scanner(System.in);
	
		System.out.println("What is the annual return: (0-20%): ");

		double Annual_return = input.nextDouble();
		while (Annual_return<0 || Annual_return>20) {

			System.out.println("Please enter a number from 0 to 20%: ");
		
			Annual_return = input.nextDouble();
			
		}
		return Annual_return;
		
	}
	
	public static double input3() {

		Scanner input= new Scanner(System.in);
	
		System.out.println("How many years were you retired (positive number): ");

		double Years_required = input.nextDouble();
		while (Years_required<0) {

			System.out.println("Please enter a positive number: ");
		
			Years_required = input.nextDouble();
			
		}
		return Years_required;
		
	}
	
	public static double input4() {

		Scanner input= new Scanner(System.in);
	
		System.out.println("What is the annual return after retirement (0-3%): ");

		double Annual_return_retirement = input.nextDouble();
		while (Annual_return_retirement<0 || Annual_return_retirement>3) {

			System.out.println("Please enter a number from 0 to 3%: ");
		
			Annual_return_retirement = input.nextDouble();
			
		}
		return Annual_return_retirement;
		
	}
	
	public static double input5() {

		Scanner input= new Scanner(System.in);
	
		System.out.println("What is your required income (positive number): ");

		double Required_income = input.nextDouble();
		while (Required_income<0) {

			System.out.println("Please enter a positive number: ");
		
			Required_income= input.nextDouble();
			
		}
		return Required_income;
		
	}
	
	public static double input6() {

		Scanner input= new Scanner(System.in);
	
		System.out.println("What is your monthly SSI (0-2642): ");

		double Monthly_SSI = input.nextDouble();
		while (Monthly_SSI<0 || Monthly_SSI>2642) {

			System.out.println("Please enter a number from 0 to 2642: ");
		
			Monthly_SSI = input.nextDouble();
			
		}
		return Monthly_SSI;
		
	}

}



