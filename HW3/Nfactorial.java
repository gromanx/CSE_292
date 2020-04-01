/***
* CSE292 - Fall 2019
* Nfactorial.java
* Purpose: Reads a nonnegative integer, computes and prints its factorial.
*
* @author Gladys Roman
* @version 1.0 10/11/2019
*/

import java.util.Scanner; //library for scanner

public class Nfactorial {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); //scanner for user input
		System.out.print("Enter a nonnegative integer: "); //prompt user for input
		int integer = input.nextInt(); //store input in variable integer
		
		while(integer < 0) { //if input is a negative #
			System.out.println("Invalid number.");
			System.out.print("Enter a nonnegative integer: ");
			integer = input.nextInt();
		}
		
		int factorial = 1; //factorial variable will be used for arithmetic
		for(int i = 1; i <= integer; i++) { //from 1 to integer, multiply each # and add to factorial total
			factorial *= i;
			if(integer == 0) { //if input = 0, factorial = 1
				factorial = 1;
			}
		}
		
		System.out.printf(integer + "! = %d%n", factorial); //output factorial
		
	}
}
