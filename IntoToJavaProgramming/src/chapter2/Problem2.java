/**
 * (Computer the volume of a Cylinder) Write a program that reads in the radius ... using the following formulas:
 * 
 * area = radius * radius * PI
 * volume = area * length
 */

package chapter2;

import java.util.Scanner;

//creating a class
public class Problem2 {

	//main method
	public static void main(String[] args) {
		//constant value of PI
		double PI = 3.14159;
		
		//Scanner for radius
		Scanner r_in = new Scanner(System.in);
		System.out.print("Enter the radius of a cylinder: ");
		double radius = r_in.nextDouble();
		
		//Scanner for length
		Scanner l_in = new Scanner(System.in);
		System.out.print("Enter the length of a cylinder: ");
		double length = l_in.nextDouble();
		
		double area = radius * radius * PI;
		double volume = area * length;
		
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		
	} //end of main
} //end of class
