 /***
* CSE292 - Fall 2019
* Gcd.java
* Purpose: Calculates the GCD of 2 integers provided by the user, using Euclid's algorithm.
*
* @author Gladys Roman
* @version 1.0 10/20/2019
*/

import java.util.Scanner; //library for scanner

public class Gcd {
	public int gcd(int x, int y) {  //public static method that returns GCD of 2 ints
	    int r; //variable for the remainder
	    if(x > y) { //if x>y, then x will be divided by y in this loop
	    	while (y != 0) { //while the remainder is not 0, we will traverse through this loop
	    		r = x % y; //remainder = mod of x and y
	    		x = y; //x becomes the value of y for the next calculation
	    		y = r; //y becomes the value of r for the next calculation
	    	}
	    	return x; //return the last remainder before we hit 0
	    }
	    else {
	    	while(x != 0) { //if y>x, then y will be divided by x in this loop
	    		r = y % x; //use Euclid's algorithm again
	    		y = x;
	    		x = r;
	    	}
	    	return y;
	    }
}

// main 
public static void main(String [] args) {
		Scanner input = new Scanner(System.in); //scanner for input
		System.out.print("Enter integer number 1: "); //prompt user for first int
		int x = input.nextInt(); //store value of first int in x
		System.out.print("Enter integer number 2: "); //repeat for y
		int y = input.nextInt();
		
		Gcd greatestCD = new Gcd(); //to call the method gcd
		int answer = greatestCD.gcd(x, y); //call the method gcd and store its returning value in the variable 'answer'
		
		System.out.printf("Greatest Common Divisor (GCD) of %d and %d is: %d", x, y, answer); //display GCD
		
	}
}
