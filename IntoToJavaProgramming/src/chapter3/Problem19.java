/**
 * Problem19 - (Compute the perimeter of a triangle) Write a program that reads edges for
 * a triangle and computes the perimeter if the input is valid. Otherwise, display that
 * the input is invalid. The input is valid if the sum of every pair of two edges is
 * greater than the remaining edge.
 */


package chapter3;

import java.util.Scanner;

//creating class
public class Problem19 {

	//main method
	public static void main(String[] args) {
		//Scanner
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the three edges of the triangle: ");
		
		double edge1 = in.nextDouble();
		double edge2 = in.nextDouble();
		double edge3 = in.nextDouble();
		
		//check edges if they meet all the condition
		if((edge1 < edge2 + edge3) && 
			(edge2 < edge1 + edge3) && (edge3 < edge1 + edge2)) {
			System.out.println("The perimeter is " + (edge1 + edge2 + edge3));
		} else {
			System.out.println("The input is invalid");
		}
	} //end of main
}//end of class
