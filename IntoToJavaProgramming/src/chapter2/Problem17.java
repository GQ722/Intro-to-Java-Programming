/**
 * Problem17 - (Science: wind-chill temperature) How cold is it outside? ... Write a 
 * program that prompt user to enter a temperature between -58F and 41F and a wind speed 
 * greater than or equal to 2 and displays the wind-chill temperature. Use Math.pow(a, b) 
 * to compute v^0.16
 */

package chapter2;

import java.util.Scanner;

//create class
public class Problem17 {

	//main method
	public static void main(String[] args) {
		
		//Scanner
		Scanner temp_in = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double temp = temp_in.nextDouble();
		
		Scanner wind_in = new Scanner(System.in);
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		int wind = wind_in.nextInt();
		
		double windspeed = 35.75 * Math.pow(wind, 0.16);
		double tempwindspeed = 0.4275 * temp * Math.pow(wind, 0.16);
		double wind_chill = 35.74 + 0.6215 * temp - windspeed + tempwindspeed;
		
		System.out.println("The wind chill index is " + wind_chill);

	} // end of main
} // end of class
