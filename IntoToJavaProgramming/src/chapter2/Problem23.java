/**
 * Problem23 - (Cost of driving) Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon,
 * and the price per gallon, and displays the cost of the trip.
 */

package chapter2;

import java.util.Scanner;

//creating class
public class Problem23 {

	//main method
	public static void main(String[] args) {
		
		//Scanners
		Scanner dist_in = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double dist = dist_in.nextDouble();
		
		Scanner miles_in = new Scanner(System.in);
		System.out.print("Enter miles per gallon: ");
		double miles = miles_in.nextDouble();
		
		Scanner price_in = new Scanner(System.in);
		System.out.print("Enter price per gallon: ");
		double price = price_in.nextDouble();
		
		double distance_per_miles = dist / miles;
		double cost = price * distance_per_miles;
		
		System.out.println("The cost of driving is " + cost);

	} //end of main
} //end of class
