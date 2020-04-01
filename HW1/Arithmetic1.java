/****
 * CSE292 - Fall 2019
 * Arithmetic.java
 * Purpose: Inputs three integers from the user and displays the sum, average, 
 * product, smallest and largest of the numbers.
 * 
 * @author Gladys Roman
 * @version 1.0 9/27/2017
 */

import java.util.Scanner; //imports scanner class

public class Arithmetic1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner for input
		
		System.out.print("Enter first integer: "); 
		int num1 = input.nextInt(); //first integer
		
		System.out.print("Enter second integer: "); 
		int num2 = input.nextInt(); //second int
		
		System.out.print("Enter third integer: "); 
		int num3 = input.nextInt(); //third int
		
		//calculations
		int sum = num1 + num2 + num3; //sum of the inputs
		
		int avg = sum / 3; //average of the inputs
		
		int product = num1 * num2 * num3; //product of the inputs
		
		int max = 0;
		int[] intArray = new int[] { num1, num2, num3 };
		for(int i = 0 ; i < 3; i++) {
			if(intArray[i] > max)
				max = intArray[i];
		} //largest of the inputs

		int min = num1;
		for(int i = 1; i < 3 ; i++) {
			if(intArray[i] < min)
				min = intArray[i];
		} //smallest of the inputs
		
		//outputs
		System.out.printf("Sum is %d%n", sum);
		
		System.out.printf("Average is %d%n", avg);
		
		System.out.printf("Product is %d%n", product);
		
		System.out.printf("Largest is %d%n", max);
		
		System.out.printf("Smallest is %d%n", min);
		
	}
}
