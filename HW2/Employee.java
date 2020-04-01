/***
* CSE292 - Fall 2019
* Employee.java
* Purpose: A class called employee that includes three instance 
* variables - a first name, a last name, and a monthly salary.
*
* @author Gladys Roman
* @version 1.0 10/06/2019
*/

public class Employee {
	private String Fname;
	private String Lname;
	private double Salary;
	
	public Employee(String fname, String lname, double salary) {
		Fname = fname;
		Lname = lname;
		Salary = salary;
	} //constructor that initializes the 3 instance variables
	
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getFname() {
		return Fname;
	} //set and get for first name
	
	
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getLname() {
		return Lname;
	} //set and get for last name
	
	
	public void setSalary(double salary) {
		if(salary < 0)
			return;
		Salary = salary;
	}
	public double getSalary() {
		return Salary;
	} //set and get for monthly salary
	
	
	public double YearlySalary() {
		return Salary * 12;
	} //returns yearly salary
	
	
	public double Raise() {
		return ((Salary * 0.1) + Salary) * 12;
	} //returns yearly salary after 10% raise
}
