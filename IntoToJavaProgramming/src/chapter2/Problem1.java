/**
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, then
 * converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
 * 
 * fahrenheit = (9 / 5) * celsius + 32
 */

package chapter2;

import java.util.Scanner;

//creating a class
public class Problem1 {
	
	public static void main(String args[]) {
		//creating a scanner
		Scanner input = new Scanner(System.in);
		
		//ask user for input
		System.out.print("Enter a degree in Celsius: ");
		
		//get the input in a double vaiable
		double celsius = input.nextDouble();
		
		//Conversion
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		//print out the result
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
		
	} // end of main
} //end of class
