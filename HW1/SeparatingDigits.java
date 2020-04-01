/****
 * CSE292 - Fall 2019
 * SeparatingDigits.java
 * Purpose: Inputs one number consisting of seven digits from the user, 
 * separates the number into its individual digits and prints the digits 
 * separated from one another by three spaces each.
 * 
 * @author Gladys Roman
 * @version 1.0 10/04/2019
 */

import java.util.Scanner; //imports scanner class
public class SeparatingDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //creates scanner for input
		
		System.out.print("Enter a number with seven digits: ");	//prompt for 7 digits
		int digit = input.nextInt();
		
		if (digit > 9999999)//if user entered number more than 7 digits
			System.out.println("You have entered a number greater than seven digits. Goodbye.");
		
		if (digit < 1000000)//if user entered number less than 7 digits
			System.out.println("You have entered a number less than seven digits. Goodbye.");
		
		
		if ((digit >= 1000000) && (digit <= 9999999)) { //separate the 7 digits with 3 spaces
		System.out.printf("%d   ", (digit / 1000000));
		System.out.printf("%d   ", (digit / 100000) % 10);
		System.out.printf("%d   ", (digit / 10000) % 10);
		System.out.printf("%d   ", (digit / 1000) % 10);
		System.out.printf("%d   ", (digit / 100) % 10);
		System.out.printf("%d   ", (digit % 100) / 10);
		System.out.printf("%d   ", (digit % 10));
		}
		
	}
}
