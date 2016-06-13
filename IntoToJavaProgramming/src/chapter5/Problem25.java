/**
 * Problem25 - (Compute pi) You can approximate pi by using the following series (I'm not going to type the series)
 * Write a program the displays the pi value for i = 10000, 20000, ..., and 100000.
 */
package chapter5;

/**
 * @author Devesh Patel
 *
 */
public class Problem25 {
	/**
	 * main method
	 */
	public static void main(String[] args) {
		//take the inputs
		for(int i=10000; i<=100000; i += 10000) {
			double val = 1.0;
			
			for(int j=2; j<=i; j+=2){
				//calculate the series (1-1/3+1/5+...)
				val = val - 1 / (2 * (double)j - 1) + 1 / (2 * (double)j + 1);
			}//end of nested for loop
			
			//calculate pi value 4 * val
			double result = 4.0 * val;
			
			//display the result
			System.out.println("if i = " + i + ", the value of PI = " + result);
			
		}//end of outer for loop
	}//end of main method
}//end of class
