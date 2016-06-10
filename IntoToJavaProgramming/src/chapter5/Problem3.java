/**
 * Problem3 - Conversion from kilograms to pounds
 */

package chapter5;

import java.text.DecimalFormat;

//creating class
public class Problem3 {

	//main method
	public static void main(String[] args) {
		//table first line
		DecimalFormat dec = new DecimalFormat("###.##");
		System.out.println("Kilograms       Pounds");
		
		for(int i=1; i<=199; i+=2) {
			System.out.println(i + "\t\t" + dec.format(i*2.2));
		}
	}
}
