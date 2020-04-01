/***
* CSE292 - Fall 2019
* StudentGrades.java
* Purpose: Tests different exception methods.
*
* @author Gladys Roman
* @version 1.0 11/26/2019
*/

import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NullPointerException;
import java.util.Scanner;

public class StudentGrades {
	private String name;
	private double grade;
	
	public StudentGrades(String name, double grade) {
		this.name = name;
		if(grade < 0) {
			this.grade = 0;
		}
		else {
			this.grade = grade;
		}
	}
	
	public String getName() {return name;}
	
	public double getGrade() {return grade;}
	
	@Override                                                   
	public String toString() {                                  
		return String.format("%s%s %.2f%n", getName(), ": ", getGrade());
	} 
	
	public static int quotient(int num, int denom) 
			throws ArithmeticException {
		return num / denom;
	}
	
	public static void main(String[] args) {
		String name; //student name for array
		double total = 0.0, grade = 0.0, avg = 0.0; // total = sum of all grades
		int input = 0, num = 0, index; // input = sentinel
		StudentGrades[] students = new StudentGrades[50]; //1 student's name and grade per index
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true; // continueLoop will be used in do-while loop to determine if program needs to continue allowing user to enter correct data after an inputMismatch
		
		for(int i = 0 ; i < 50 ; i++ ) { //allows user to enter student name and grade up to the capacity of the array
			continueLoop = true;
			do {
				try {
					System.out.print("Enter a student name: ");
					name = scanner.nextLine();
					System.out.print("Enter a student grade: ");
					grade = scanner.nextDouble();
		
					StudentGrades student = new StudentGrades(name, grade); //create new student using inputted data
					students[i] = student; //place new student in current index of students array
					continueLoop = false; //if we reach the end of the try, that means we were successful so we set continueLoop to false so that no more data is entered for the same student
				}
				catch(InputMismatchException inputMismatchException) {
					System.err.printf("%nException: %s%n", inputMismatchException);
					System.out.flush();
					System.out.printf("You must enter a string for name and a double for grade. Try again. %n");
					System.out.flush();
					scanner.nextLine();
				} 
			} while (continueLoop);
			
			total += grade; //update total grade
			num++; //total students entered into the array
			System.out.print("Continue? "); //asks user if they want to continue to enter more students' data
			input = scanner.nextInt(); 
			scanner.nextLine(); //clears the <CR> when you press <Enter> after enter 1 to continue, for next iteration success
			if(input == -1) 
				break; //break out of the for-loop if user chooses to stop 
		}
		
		avg = total / num; //average grade point of the class
		System.out.printf("%nClass average: %.2f%n", avg);
		num -= 1; //final index value
		
		//retrieve grade point of any student using an index
		do {
			continueLoop = true;
			do {
				try {
					System.out.print("Enter a student from 0-" + num + ": ");
					index = scanner.nextInt();
					System.out.println(students[index].toString() + "\nContinue? ");
					input = scanner.nextInt();
					scanner.nextLine();
					continueLoop = false;
				}
				catch (NullPointerException nullPointerException) {
					System.err.printf("%nException: %s%n", nullPointerException); 
					scanner.nextLine();
					System.out.printf("No such student. You must enter an integer from 0-%d %s", num, ". Try again.\n");
				}
				catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
					System.err.printf("%nException: %s%n", arrayIndexOutOfBoundsException); 
					scanner.nextLine();
					System.out.printf("You must enter an integer from 0-%d %s", num, ". Try again.\n");
				}
			} while(continueLoop);
		} while(input != -1);
			
		
		//arithmetic exception and try-with-resource
		
		try(Scanner math = new Scanner(System.in)){
			System.out.print("Enter total student grades: ");
			int grades = math.nextInt();
			System.out.print("Enter number of students: ");
			int numStudents = math.nextInt();
			int result = quotient(grades, numStudents);
			System.out.printf("Average: %.2f%n", avg);
			System.out.printf("result: ", result);
		}
		catch (ArithmeticException arithmeticException) {
			System.err.printf("%nException: %s%n", arithmeticException); 
			scanner.nextLine();
			System.out.printf("Cannot divide by zero. Try again.\n");
		}		
	}		
}