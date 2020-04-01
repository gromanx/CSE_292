/***
* CSE292 - Fall 2019
* SalesCommissions.java
* Purpose: Determines how many of the sales people earned salaries in each of the given ranges, using a one dimensional array.
*
* @author Gladys Roman
* @version 1.0 10/25/2019
*/

import java.util.Scanner; //library for scanner for input
import java.util.ArrayList; //libraries for arrays and arraylists
import java.util.Arrays;

public class SalesCommissions {
	public static void main(String [] args) {
		//input for sales amounts
		Scanner input = new Scanner(System.in); //scanner for input
		int sales; //variable for input of sales amount
		ArrayList<String> range = new ArrayList<String>(); //array for ranges
		
		//create ranges
		range.add("$200-$299"); //range[0]
		range.add("$300-$399"); //range[1]
		range.add("$400-$499"); //range[2]
		range.add("$500-$599"); //range[3]
		range.add("$600-$699"); //range[4]
		range.add("$700-$799"); //range[5]
		range.add("$800-$899"); //range[6]
		range.add("$900-$999"); //range[7]
		range.add("$1000+   "); //range[8]
		
		int[] count = new int[9]; //will keep count for ranges 0-8
		Arrays.fill(count, 0); //all values of array count set to 0
		System.out.print("Enter sales amount (negative # to end): $"); //prompt user for input
		sales = input.nextInt(); //store user input
		
		do { //do while input is not a negative #, which terminates the program
			sales *= 0.09;//multiply sales amounts by 9% and add $200 to that amount
			sales += 200;
			
		//the following if, if else, and else statements will place the current input in the appropriate range
			if(sales >= 200 && sales <= 299) { //range[0]
					count[0]++;
				}
			
			else if(sales >= 300 && sales <= 399) { //range[1]
					count[1]++;
				}
		
			else if(sales >= 400 && sales <= 499) { //range[2]
					count[2]++;
				}

			else if(sales >= 500 && sales <= 599) { //range[3]
					count[3]++;
				}
			
			else if(sales >= 600 && sales <= 699) { //range[4]
					count[4]++;
				}
			
			else if(sales >= 700 && sales <= 799) { //range[5]
					count[5]++;
				}
			
			else if(sales >= 800 && sales <= 899) { //range[6]
					count[6]++;
				}
			
			else if(sales >= 900 && sales <= 999) { //range[7]
					count[7]++;
				}
			else //range[8]
				count[8]++; 
			
			System.out.print("Enter sales amount (negative # to end): $"); //another prompt for input before the loop ends so that if new input is negative, program will not go through the loop again 
			sales = input.nextInt();
			
		} while(sales > 0);
		
		// output ranges and # of people that fall into those ranges
		System.out.printf("%s%17s%n", "Range", "Amount");
		
		for(int i = 0; i < 9; i++)
		{	System.out.printf("%5s%8d%n", range.get(i).toString(), count[i]);	
		}
	}
}
