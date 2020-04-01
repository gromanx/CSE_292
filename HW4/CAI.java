/***
* CSE292 - Fall 2019
* CAI.java
* Purpose: Helps an elementary school student learn multiplication by generating 2 random single-digit numbers and asking the student for the value of their product.
*
* @author Gladys Roman
* @version 1.0 10/20/2019
*/

import java.util.Scanner; //library for scanner
import java.security.SecureRandom; //library for generating random number

public class CAI {
	public void multiplication() { //method for generating new numbers and asking user for the product of said numbers
		Scanner input = new Scanner(System.in); //scanner for input
		SecureRandom randomNumbers = new SecureRandom(); 
		int num1 = 1 + randomNumbers.nextInt(8); //generated single-digit random number 1
		int num2 = 1 + randomNumbers.nextInt(8); //random # 2
		
		int answer; //variable used for user's answer to the multiplication question
		do {
			System.out.printf("How much is %d times %d? ", num1, num2); //prompt user for product
			answer = input.nextInt(); //store user's answer
			if(answer != (num1 * num2)) { //if answer is not correct
				System.out.println("No. Please try again.");
			} 
		} while(answer != (num1 * num2));//loop until they get it correct
		
		System.out.println("Very good! That's correct!"); //when answer is correct, method call ends
	}

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); //scanner for input
		System.out.println("Welcome to CAI. To continue after each correct answer, enter 1. To end the program enter -1, instead.\nLet's begin.");
		int user; //variable used for user's input on whether they want to continue the program or end it 
		CAI mult = new CAI(); //used to call multiplication method call
		do { //this will run once, and then as many times as the user chooses to continue
			mult.multiplication(); //calling multiplication method
			System.out.print("Continue? "); //prompt user to continue
			user = input.nextInt(); //input for user's decision to continue to next question
			} while(user != -1);	//loops ends if user chooses to end program
		}
	}
