 /***
* CSE292 - Fall 2019
* RandomNumber.java
* Purpose: Chooses a random number to be guessed by the user. The user inputs their guess. If the guess is too high, displays "too high" and allows the user to guess again. If the number is too low, displays "too low" and allows the user to guess again. If the number is correct, displays "congratulations" and allows the user to play again.
*
* @author Gladys Roman
* @version 1.0 10/20/2019
*/

import java.util.Scanner; //library for scanner
import java.security.SecureRandom; //library for generating random number 

public class RandomNumber {
	
	public void guessNum(int guess, int randNum) {//make this a function so that we can call it as many times as the user wants to play
		Scanner input = new Scanner(System.in); //scanner to resolve input
		while(guess != randNum) {//loop will run until user's guess matches the generated random num
			if(guess > randNum) { //if guess is greater that randNum, print out 'too high' and give user another chance to guess
				System.out.print("Too high! Try again: ");
				guess = input.nextInt();
		}	
			else { //if it's not too high, then it's too low
				System.out.print("Too low! Try again: ");
				guess = input.nextInt();
			}
		}
		return; //end function call when guess matches random number
}

// main 
public static void main(String [] args) {
	Scanner input = new Scanner(System.in); //scanner for input
	int again; //declare variable for determining whether the user wants to play again
	do { //loop will run once, then ask the user if they want to play again
	SecureRandom randomNumbers = new SecureRandom(); 
	int randNum = 1 + randomNumbers.nextInt(1000); //generate random # between 1 and 1000
	RandomNumber randoNum = new RandomNumber(); //to be able to call guessNum function

	System.out.print("Guess the number between 1 and 1000: "); //prompt user for their guess
	int guess = input.nextInt(); //input guess value in guess variable
	
	randoNum.guessNum(guess, randNum); //function call using guess and randNum as parameters
	
	System.out.println("Congratulations! You guessed the number!"); //when fctn call ends it's b/c they guessed number ccorrectly, so display congratulations
	
	System.out.println("Enter '1' to play again. Enter '0' to exit... "); //ask user if they want to play again
	again = input.nextInt(); //store input in again variable
	} while(again == 1); //use again variable to determine whether loop will run again or not
		//if user enters anything other than 1 (to play again), program ends
	}
}

