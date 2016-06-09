/**
 * Author: Devesh Patel
 * Problem4 - (Random month) Write a program that randomly generates an integer between 1 and 12 and displays the English month name January, February, ..., December for the
 */

package chapter3;

import java.util.Scanner;

//creating a class
public class Problem4 {
	
	//main method
	public static void main(String args[]) {
		
		//General case for random range generator
		//(int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound);
		int random = (int)(Math.random() * 12 + 1); 
		
		//we need month for the random number generated
		if (random == 1) {
			System.out.println("Number: " + random + ", Month: January");
		} else if (random == 2) {
			System.out.println("Number: " + random + ", Month: February");
		} else if (random == 3) {
			System.out.println("Number: " + random + ", Month: Mrach");
		} else if (random == 4) {
			System.out.println("Number: " + random + ", Month: April");
		} else if (random == 5) {
			System.out.println("Number: " + random + ", Month: May");
		} else if (random == 6) {
			System.out.println("Number: " + random + ", Month: June");
		} else if (random == 7) {
			System.out.println("Number: " + random + ", Month: July");
		} else if (random == 8) {
			System.out.println("Number: " + random + ", Month: August");
		} else if (random == 9) {
			System.out.println("Number: " + random + ", Month: September");
		} else if (random == 10) {
			System.out.println("Number: " + random + ", Month: October");
		} else if (random == 11) {
			System.out.println("Number: " + random + ", Month: November");
		} else if (random == 12) {
			System.out.println("Number: " + random + ", Month: December");
		} else {
			System.out.println("Invalid number, no month can be generated");
		}
	} //end of main
} //end of class
