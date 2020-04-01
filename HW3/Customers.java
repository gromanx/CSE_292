/***
* CSE292 - Fall 2019
* Customers.java
* Purpose: Determines whether any of several department store 
* customers has exceeded the credit limit on a charge account.
*
* @author Gladys Roman
* @version 1.0 10/11/2019
*/
public class Customers {
	private int acctNum; //account number
	private int begBalance; //beginning balance
	private int charges; 
	private int credits;
	private int credLimit; //credit limit 
	private int newBalance; //calculate the new balance
	
	public Customers(int acctNum, int begBalance, int charges, int credits, int credLimit) {
		this.acctNum = acctNum;
		this.begBalance = begBalance;
		this.charges = charges;
		this.credits = credits;
		this.credLimit = credLimit;
		newBalance = (begBalance + charges - credits);
	}
	
	public int getAcctNum() {
		return acctNum;
	}
	
	public int geBegBalancet() {
		return begBalance;
	}
	
	public int getCharges() {
		return charges;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public int getCredLimit() {
		return credLimit;
	}
	
	public int getNewBalance() {
		return newBalance;
	}

	public String creditLimit() {
		if(newBalance > credLimit) {
			String status = "Credit Limit Exceeds.";
			return status; 
		}	
		else {
			String status = "Credit Limit does not Exceed.";
			return status;
		}
	}
}
