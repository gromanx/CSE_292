/***
* CSE292 - Fall 2019
* InvoiceTest.java
* Purpose: Demonstrates class Invoice's capabilities.
*
* @author Gladys Roman
* @version 1.0 10/06/2019
*/

import java.util.Scanner;

public class InvoiceTest {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); //scanner for input
		Invoice invoice1 = new Invoice("","",0,0.0); //new instance of the class input
		
		System.out.println("Enter a part number: "); //prompting user for part #
		String number = input.nextLine();
		invoice1.setPnumber(number); //setting user part # in invoice
		
		System.out.println("Enter a part description: "); //prompting user for part description
		String description = input.nextLine();
		invoice1.setPdescription(description); //setting user part description in invoice
		
		System.out.println("Enter a quantity of the part being purchased: "); //prompting user for part quantity
		int quantity = input.nextInt();
		invoice1.setPquantity(quantity); //setting user item quantity in invoice
		
		System.out.println("Enter price per part: "); //prompting user for price per part
		double price = input.nextDouble();
		invoice1.setPprice(price); //setting user price per item in invoice
		
		//output invoice
		System.out.printf("Part number: %s%n", invoice1.getPnumber());
		System.out.printf("Part description: %s%n", invoice1.getPdescription());
		System.out.printf("Part price: $%.2f%n", invoice1.getPprice());
		System.out.printf("Part quantity purchased: %d%n", invoice1.getPquantity());
		System.out.printf("Total invoice amount: $%.2f%n", invoice1.getInvoiceAmount());
	}
}
