/**
 * Problem21 - (Science: day of the week) Zeller's congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula
 * is given in the book. Write a program that prompts the user to enter a year, month, and day of the month and displays the name of the day of the week.
 */

package chapter3;

import java.util.Scanner;

public class Problem21 {

	//main method
	public static void main(String args[]) {
		
		//Scanner
		Scanner in = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2012): ");
		int year = in.nextInt();
		
		System.out.print("Enter month: 1-12: ");
		int month = in.nextInt();

		System.out.print("Enter the day of the month: 1-31: ");
		int date = in.nextInt();
		
		//finding day of the week
		int k = year % 100;
		int j = year / 100;
		int day = ((date + (((month+1) * 26) / 10) + k + (k / 4) + (j / 4)) + (5 * j)) % 7;
		
		if (month < 3) {
			month += 12;
			year -= 1;
		}
		
		String Name = "";
		
		if (day == 0) {
			Name = "Saturday";
		} else if (day == 1) {
			Name = "Sunday";
		} else if (day == 2) {
			Name = "Monday";
		} else if (day == 3) {
			Name = "Tuesday";
		} else if (day == 4) {
			Name = "Wednesday";
		} else if (day == 5) {
			Name = "Thursday";
		} else if (day == 6) {
			Name = "Friday";
		}
		
		//Display output
		System.out.println("Day of the week is " + Name);
	}
}
