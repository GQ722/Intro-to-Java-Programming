/**
 * Convert feet into meters.. Write a program that reads a number in feet, converts it to meters, and displays the result.
 * One feet is 0.305 meter.
 * 
 */

package chapter2;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		//constant - one feet = 0.305 meters
		double CONS = 0.305;
		
		//Scanner
		Scanner in = new  Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		double feet = in.nextDouble();
		double meters = feet * CONS;
		
		System.out.println(feet + " feet is " + meters + " meters");
		
	} //end of main
} // end of class
