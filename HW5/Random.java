/***
* CSE292 - Fall 2019
* Random.java
* Purpose: Rolls 2 dice 36,000,000 times, sums their values each time, tallies the number of times each possible sum appears, and calculates the percentage of occurrence.
*
* @author Gladys Roman
* @version 1.0 10/25/2019
*/

import java.security.SecureRandom; //library for generating random numbers
import java.util.Arrays; //library for arrays

public class Random {
	public static void main(String [] args) {
		SecureRandom randomNumbers = new SecureRandom(); //for generating random numbers
		int dice1; //variables where we'll store the value of dice #1 and dice #2
		int dice2; 
		int[] frequency = new int[13]; //will keep count for frequencies of sums from 2-12(elements 0 and 1 will not be used)
		Arrays.fill(frequency, 0); //all values of array frequency set to 0
		int sum = 0; //variable for the sum of the 2 dice
		//roll dice1, roll dice 2, sum the two together
		for(int i = 0; i < 1000000; i++) { //testing with 1,000,000 to let the program run faster
			dice1 = 1 + randomNumbers.nextInt(6); //these 2 statements is where we're "rolling the dice" ; generating 2 random numbers from 1-6
			dice2 = 1 + randomNumbers.nextInt(6);
			sum = dice1 + dice2; //summation of dice 1 and 2
			//use one dimensional array to tally # of times each possible sum appears
			frequency[sum]++; //incrementing elements 2-12, appropriately
		}
		
		//display results. sum 2-12, frequency and percentage
		System.out.printf("%5s%13s%13s%n",  "Sum", "Frequency", "Percentage");
		for(int counter = 2; counter < 13; counter++) { //from 2-12 (possible summations)
			System.out.printf("%5d%13d%13d%n",  counter, frequency[counter], (frequency[counter] / 10000)); //last argument is the integer percentage of occurrence per frequency 
		
		}
	}

}
