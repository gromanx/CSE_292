 /***
* CSE292 - Fall 2019
* Interest.java
* Purpose: Calculates compound interest.
* 
* @author Gladys Roman
* @version 1.0 10/11/2019
*/

public class Interest {
	 public static void main(String[] args) {
	      double amount; // amount on deposit at the end of a given year
	      double principal = 1000.0; // initial deposit
	      
	      // print out statistics for each rate
	      for (int interestRate = 5; interestRate <= 10; interestRate++) {
	         double rate = interestRate / 100.0;
	         System.out.printf("%nInterest Rate: %d%%%n", interestRate);
	         System.out.println("Year\tAmount on deposit");
	         // for each rate, print a ten‐year forecast
	         for (int year = 1; year <= 10; year++) {
	            // calculate new amount for specified year
	            amount = principal * Math.pow(1.0 + rate, year);
	            // display the year and the amount
	            System.out.printf("%d\t%.2f%n", year, amount);
	         }
	      }
	   }
}
