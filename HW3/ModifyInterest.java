 /***
* CSE292 - Fall 2019
* ModifyInterest.java
* Purpose: Modifies program to to repeat its steps for interest rates of 5%, 6%, 7%,8%,8%, 9% and 10%
*
* @author Gladys Roman
* @version 1.0 10/11/2019
*/

public class ModifyInterest {
	public static void main(String [] args) {
		double principal = 1000.0;
		System.out.printf("%s%20s%n",  "Rate", "Amount deposit");
		for(double rate = 0.05; rate <= .10; rate += 0.01) {
			double amount = principal * Math.pow(1.0 + rate, 1.0);
			
			System.out.printf("%4.2f%, 20.2f%n", rate, amount);
		}
	}
}
