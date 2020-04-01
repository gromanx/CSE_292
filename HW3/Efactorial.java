 /***
* CSE292 - Fall 2019
* Efactorial.java
* Purpose: Estimates the value of the mathematical constant e. Allows the user to enter the number of terms to calculate.
*
* @author Gladys Roman
* @version 1.0 10/11/2019
*/

import java.util.Scanner; //library for scanner

public class Efactorial {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in); //scanner for user input
	
	System.out.print("Enter a value: "); //prompt user for input
	int integer = input.nextInt(); //store input in variable integer
	
	double e = 1;
	double factorial = 1.0;
	for(double i = 1; i <= integer ; i++){
		factorial *= i;
		e += 1 / factorial;
	}
	
	System.out.printf("The e constant of %d is approximately: %f ", integer, e);
	
	
	}
}
