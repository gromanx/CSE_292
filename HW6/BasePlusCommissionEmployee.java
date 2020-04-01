/***
* CSE292 - Fall 2019
* BasePlusCommissionEmployee.java
* Purpose: Uses CommissionEmployee class for composition.
*
* @author Gladys Roman
* @version 1.0 11/15/2019
*/

public class BasePlusCommissionEmployee {
		private CommissionEmployee commissionEmployee;
		private double baseSalary;
	
		public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
		      commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);                      

		      // if baseSalary is invalid throw exception
		      if (baseSalary < 0.0) {                  
		         throw new IllegalArgumentException("Base salary must be >= 0.0");
		      }       

		      this.baseSalary = baseSalary;
		}
	
		public String getFirstName() {
			return commissionEmployee.getFirstName();
	    }

	   // return last name
	    public String getLastName() {
			return commissionEmployee.getLastName();
	    }

	   // return social security number 
	   public String getSocialSecurityNumber() {
		   return commissionEmployee.getSocialSecurityNumber();
	   }

	   // set gross sales amount
	   public void setGrossSales(double grossSales) {
	      commissionEmployee.setGrossSales(grossSales);
	   } 

	   // return gross sales amount
	   public double getGrossSales() {
		   return commissionEmployee.getGrossSales();
	   }

	   // set commission rate
	   public void setCommissionRate(double commissionRate) {
	     commissionEmployee.setCommissionRate(commissionRate);
	   } 

	   // return commission rate
	   public double getCommissionRate() {
		   return commissionEmployee.getCommissionRate();
	   }
	   
	   //set base salary
	   public void setBaseSalary(double baseSalary) {
		   if (baseSalary < 0.0) {                  
		         throw new IllegalArgumentException("Base salary must be >= 0.0");
		      }       
		   else {
			   this.baseSalary = baseSalary;
		   }
	   }
	   
	   //return base salary
	   public double getBaseSalary() {
		   return baseSalary;
	   }

	   // calculate new earnings, now including base salary
	   public double earnings() {
	      return getBaseSalary() + commissionEmployee.earnings();
	   } 

	   // return String representation of BasePlusCommissionEmployee object
	   @Override 
	   public String toString() {
	      return String.format("%s %s\n%s: %.2f", "base salaried", commissionEmployee.toString(), "base salary", getBaseSalary());
	   }
}
