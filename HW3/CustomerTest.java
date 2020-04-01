/***
* CSE292 - Fall 2019
* CustomerTest.java
* Purpose: Demonstrates class Customers's abilities.
*
* @author Gladys Roman
* @version 1.0 10/11/2019
*/

public class CustomerTest {
	public static void main(String [] args) {
		Customers customer1 = new Customers(101010, 500, 30, 25, 500);
		Customers customer2 = new Customers(202020, 300, 100, 50, 750);
		Customers customer3 = new Customers(303030, 400, 200, 250, 900);
		
		Customers[] custArray = new Customers[] { customer1, customer2, customer3 };
		
		for(int i = 0; i < 3 ; i++) {
			System.out.printf("Customer %d%n", custArray[i].getAcctNum());
			System.out.printf(" Beginning balance: %d%n This month's charges: %d%n This month's credits: %d%n New Balance: %d%n Credit limit: %d%n", custArray[i].geBegBalancet(), custArray[i].getCharges(), custArray[i].getCredits(), custArray[i].getNewBalance(), custArray[i].getCredLimit());
			System.out.printf(" Status: %s%n%n", custArray[i].creditLimit());
		}
		
		
		
	}

}
