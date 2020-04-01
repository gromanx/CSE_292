/***
* CSE292 - Fall 2019
* SalesProducts.java
* Purpose: Outputs the sales of 5 products for 4 salespeople, cross-totals sales per product and sales per person, and outputs that too.
* 
* @author Gladys Roman
* @version 1.0 10/30/2019
*/

public class SalesProducts {
	public static void main(String [] args) {
		//initialize the 2D variable with the given data from the homework prompt screenshot
		int [][] salesProducts = { { 100, 300, 400, 300 }, { 0, 0, 0, 0 }, { 300, 600, 100, 300 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		
		int productNum = 1; //product numbers will range from 1-5 with incrementation
		int productTotal = 0;  //variable for cross total of each row
		int personTotal; //variable for cross total of each column
		
		//output column headers for product number, sales people, and row totals
		System.out.print("Product");
		for(int i = 1; i <= 4; i++) {
			System.out.printf("%8s%d", "  Salesperson ", i);
		}
		System.out.printf("%10s","Total");
		
		//output data with nested for-loop to traverse through both rows and columns
		for(int row = 0; row < salesProducts.length; row++) {
			System.out.printf("\n%7d", productNum); //output product number per row
			productNum++; //increment for the next time program loops around 
			for(int column = 0; column < salesProducts[row].length; column++) {
				System.out.printf("%15.2f", (double)salesProducts[row][column]); //output each column of 1 row
				productTotal += salesProducts[row][column]; // row/product total outputted in first loop so that it's only outputted once per row
			}
			System.out.printf("%10.2f", (double) productTotal); //row total at the end of each row
			productTotal = 0; //reset to 0 for each new row
		}
		
		System.out.printf("%n%7s","Total"); // total header for cross total of each column
		
		for(int i = 0; i < 4; i++) { //4 columns to traverse
			personTotal = 0;
			for(int j = 0; j < 5; j++) { //5 rows to traverse
				personTotal += salesProducts[j][i]; //summation of each row per 1 column
			}
			System.out.printf("%15.2f", (double) personTotal); //output cross total for each column
		}
	}
}


