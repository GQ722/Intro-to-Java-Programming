/**
 * Problem33 - (Perfect number) A positive integer is called a perfect number if it is equal to
 * the sum of all of its positive divisor, excluding itself. For example, 6 is the first
 * perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1.
 * There are four perfect numbers less than 10000. Write a program to find all these four numbers.
 */
package chapter5;

/**
 * @author Devesh Patel
 *
 */
public class Problem33 {
	/**
	 * main method
	 */
	public static void main(String[] args) {
		System.out.println("Perfect nuumber from 1 to 10000: ");
		
		for(int i=1; i<10000; i++) {
			int sum = 0;
			for(int n=1; n<i; n++) {
				if(i%n==0) {
					sum = sum + n;
				}
			}
			
			if(sum==i) {
				System.out.println(i);
			}
		}//end of outer loop
	}//end of main
}//end of class
