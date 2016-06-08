/**
 * (Sum the digits in an integer) Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
 * For example, if an integer is 932, the sum of all its digits is 14.
 */

package chapter2;

import java.util.Scanner;

//creating a class
public class Problem6 {

	//main method
	public static void main(String[] args) {
		
		//Scanner
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int num = in.nextInt();
		
		//extract last digit and remove that digit
		int extractLast = num % 10;
		int remove = num / 10;
		
		//now extract second last digit from the 'remove' and remove that digit from 'remove'
		int extractSecondLast = remove % 10;
		remove = remove / 10;
		
		//now extract third last digit from the 'remove'
		int extractThirdLast = remove % 10;
		
		//sum all the digits
		int sum = extractLast + extractSecondLast + extractThirdLast;
		
		System.out.println("The sum of digits is " + sum);
	}
}
