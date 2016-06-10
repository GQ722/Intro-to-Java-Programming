package chapter5;

import java.util.Scanner;

/**
 * @author Devesh Patel
 *
 */
public class Problem17 {

	/**
	 * main method
	 */
	public static void main(String[] args) {
		
		//Scanner
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of lines between 1 to 15: ");
		int n = in.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			//print spaces
			for(int j=i; j<n; j++) {
				System.out.print(" ");
			}
			
			//print number from n to 1
			for(int k=i; k>=1; k--) {
				System.out.print(k);
			}
			
			//print number from 2 to n 
			for(int l=2; l<=i; l++) {
				System.out.print(l);
			}
			
			System.out.println();
		}
	}
}
