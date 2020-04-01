/***
* CSE292 - Fall 2019
* StudentGradesTest.java
* Purpose: Tests the class StudentGrades.
* 
* @author Gladys Roman
* @version 1.0 11/15/2019
*/

import java.util.Scanner;

public class StudentGradesTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a student name: ");
		String name = input.nextLine();
		System.out.print("Enter a student grade: ");
		double grade = input.nextDouble();
		
		StudentGrades student1 = new StudentGrades(name, grade);	
	}	
}