 /***
* CSE292 - Fall 2019
* ExFactorial.java
* Purpose: Estimates the value of the mathematical constant e^x. Allows the user to enter the number of terms to calculate.
*
* @author Gladys Roman
* @version 1.0 10/11/2019
*/

import java.util.Scanner; //library for scanner

public class ExFactorial {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in); //scanner for user input
	
	System.out.print("Enter a value: "); //prompt user for input
	int value = input.nextInt(); //store input in variable integer
	
	double ex = 1.0; //value where e^x will be stored
	double factorial = 1.0; //factorial value for denominator of the equation
	for(int i = 1; i <= value ; i++) {
		factorial *= i;
		ex += (Math.pow((double)value, i)) / factorial; //1+((x^i)/i!)
	}
	
	System.out.printf("e^" + value + " approximately equals %.3f ", ex); //output result
	
	}
}
