/***
* CSE292 - Fall 2019
* Invoice.java
* Purpose: A class called Invoice that a hardware store might 
* use to represent an invoice for an item sold at the store. 
* Invoice includes four pieces of information as instance 
* variables - part number, part description, a quantity of 
* the item being purchased, and a price per item.
*
* @author Gladys Roman
* @version 1.0 10/06/2019
*/

import java.util.Scanner;

public class Invoice {
	private String pnumber;
	private String pdescription;
	private int pquantity;
	private double pprice; 
	
	
	public Invoice(String number, String description, int quantity, double price) {
		pnumber = number;
		pdescription = description;
		pquantity = quantity;
		pprice = price;
	} //constructor that initializes the 4 instance variables
	
	
	public void setPnumber(String number) {
		pnumber = number;
	}
	public String getPnumber() {
		return pnumber;
	} //set and get for part number
	
	
	public void setPdescription(String description) {
		pdescription = description;
	}
	public String getPdescription() {
		return pdescription;
	} //set and get part description
	
	
	public void setPquantity(int quantity) {
		pquantity = quantity;
	}
	public int getPquantity() {
		return pquantity;
	} //set and get quantity of the item being purchased
	
	
	public void setPprice(double price) {
		pprice = price;
	}
	public double getPprice() {
		return pprice;
	} //set and get price per item
	
	
	public double getInvoiceAmount() {
		if(pquantity < 0)
			pquantity = 0;
		if(pprice < 0)
			pprice = 0;
		double amount = pquantity * pprice;
		return amount;
	} //method that calculates the invoice amount
}

