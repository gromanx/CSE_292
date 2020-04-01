/***
* CSE292 - Fall 2019
* PieceWorker.java
* Purpose: Represents an employee whose pay is based on the number of pieces of merchandise produced.
*
* @author Gladys Roman
* @version 1.0 11/25/2019
*/

public class PieceWorker extends Employee {
	private double wage; //wage per piece 
	private int pieces; // # of pieces produced
	
	// constructor
	public PieceWorker(String firstName, String lastName, 
	      String socialSecurityNumber, double wage, int pieces) {
	      super(firstName, lastName, socialSecurityNumber); 

	      if (wage < 0.0) {
	         throw new IllegalArgumentException("Wage must be >= 0.0");
	      }

	      this.wage = wage;
	      
	      if (pieces < 0) {
	    	  throw new IllegalArgumentException("Pieces must be >= 0");
	      }
	      
	      this.pieces = pieces;
	   } 

	   // set wage
	   public void setWage(double wage) {
	      if (wage < 0.0) {
	         throw new IllegalArgumentException("Wage must be >= 0.0");
	      }

	      this.wage = wage;
	   } 
	   
	   // return wage
	   public double getWage() {return wage;}
	   
	   // set pieces
	   public void setPieces(int pieces) {
	      if (pieces < 0) {
	         throw new IllegalArgumentException("Pieces must be >= 0.0");
	      }

	      this.pieces = pieces;
	   } 
	   
	   // return pieces
	   public int getPieces() {return pieces;}
	   
	   // calculate earnings; override abstract method earnings in Employee
	   @Override                                                           
	   public double earnings() {return getWage() * getPieces();}
	   
	   // return String representation of PieceWorker object  
	   @Override                                                   
	   public String toString() {                                  
	      return String.format("piece worker: %s%n%s: %d; %s: $%,.2f",
	         super.toString(), "pieces produced", getPieces(), "wage per piece", getWage());
	   }     
	   
}
