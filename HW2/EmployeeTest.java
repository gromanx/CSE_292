/***
* CSE292 - Fall 2019
* EmployeeTest.java
* Purpose: Demonstrates class Employee's capabilities by creating two
*  employee objects and displaying each's yearly salary, then giving
*  them each a 10% raise and displaying each's yearly salary again. 
*
* @author Gladys Roman
* @version 1.0 10/06/2019
*/

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); //scanner for input
		Employee employee1 = new Employee("John", "Wick", 6000.00); //creating employee1
		Employee employee2 = new Employee("","", 0.0); //creating employee2

		//display employee1's information
		System.out.printf("Employee1's first name: %s%n", employee1.getFname());
		System.out.printf("Employee1's last name: %s%n", employee1.getLname());
		System.out.printf("Employee1's monthly salary: $%.2f%n", employee1.getSalary());
		
		//prompt user for employee2's information and set 
		System.out.print("Enter Employee2's first name: ");
		String fname = input.nextLine();
		employee2.setFname(fname); //set employee2's first name

		System.out.print("Enter Employee2's last name: ");
		String lname = input.nextLine();
		employee2.setLname(lname); //set employee2's last name
		
		System.out.print("Enter Employee2's monthly salary: $");
		double salary = input.nextDouble();
		employee2.setSalary(salary); //set employee2's
		
		//display yearly salary
		System.out.printf(employee1.getFname() + " " + employee1.getLname() + "'s yearly salary: $%,.2f%n", employee1.YearlySalary());
		System.out.printf(employee2.getFname() + " " + employee2.getLname() + "'s yearly salary: $%,.2f%n", employee2.YearlySalary());
		
		//display yearly salary after raise
		System.out.printf(employee1.getFname() + " " + employee1.getLname() + "'s yearly salary after a 10 percent raise: $%,.2f%n", employee1.Raise());
		System.out.printf(employee2.getFname() + " " + employee2.getLname() + "'s yearly salary after a 10 percent raise: $%,.2f%n", employee2.Raise());
		
	}
}
