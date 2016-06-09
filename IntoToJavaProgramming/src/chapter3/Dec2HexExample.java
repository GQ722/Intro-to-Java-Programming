/**
 * A program that prompts the user to enter a decimal number and converts it into a hex number as a string.
 */

package chapter3;

import java.util.Scanner;

//creating a class
public class Dec2HexExample {

	//main method
	public static void main(String[] args) {
		
		//Scanner
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = in.nextInt();
		
		String hex = "";
		
		 while(decimal != 0) {
			 int hexValue = decimal % 16;
			 
			 //this is where magic happens - convert a decimal value to a hex digit
			 char hexDigit = (hexValue <= 9 && hexValue >= 0) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
			 
			 hex = hexDigit + hex;
			 decimal = decimal / 16;
		 } //end of while
		 
		 System.out.println("The hex number is " + hex);
	} //end of main
}//end of class
