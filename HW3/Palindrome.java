/***
* CSE292 - Fall 2019
* Palindrome.java
* Purpose: Reads in a five-digit integer and determines whether it is a palindrome. If
*  the number is not five digits long, displays an error message and allows the user to 
*  enter a new value.
*
* @author Gladys Roman
* @version 1.0 10/11/2019
*/

import java.util.Scanner;

public class Palindrome {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); //scanner for input
		System.out.print("Enter a 5 digit palindrome: "); //prompt user for input
		int digit = input.nextInt(); //store input in variable digit
		
		while(digit < 10000 || digit > 99999) { //determine whether inputted digit is < | > 5 digits
			System.out.println("Invalid number of digits.");
			System.out.print("Enter a 5 digit palindrome: "); //allow user to enter new value
			digit = input.nextInt();
		}
		String digits = Integer.toString(digit); //convert int 'digit' to string 'digits' 
		if(digits.charAt(0) == digits.charAt(4)) { //compare first and last digits of the input
			if(digits.charAt(1) == digits.charAt(3)) { //compare second and penultimate  digits of the input
			System.out.println(digit + " is a palindrome!"); //if both 'ifs' = true
			}
		}
		else
			System.out.println(digit + " is not a palindrome."); //if at least 1 of the 'if's = false
	}

}
