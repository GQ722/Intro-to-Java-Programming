/**
 * Problem34 - (scissor, rock, paper) Programming Exercise 3.17 gives a program that
 * plays the scissor-rock-paper game. Revise the program to let the use continuously
 * play until either the user or the computer wins more than two times than its opponent. 
 */
package chapter5;

import java.util.Scanner;

/**
 * @author Devesh Patel
 */
public class Problem34 {

	/**
	 * main method
	 */
	public static void main(String[] args) {
		//variables
		int count = 0;
		int choose;
		int pick;
		
		//generate random numbers
		while(count <= 2 || count >= -2) {
			//play the game
			pick = (int) (Math.random() * 3);
			
			//scanner
			Scanner in = new Scanner(System.in);
			System.out.print("Pick one - scissor (0), rock (1), paper(2): ");
			
			choose = in.nextInt();
			
			//play continuously
			switch(pick) 
			{
			case 0:
				if(choose == 0) {
					System.out.println("It's a draw!");
				} else if(choose == 1) {
					System.out.println("You won");
					count++;
				} else if(choose == 2) {
					System.out.println("You lost");
					count--;
				}
				break;
			case 1:
				if(choose == 0) {
					System.out.println("You lost");
					count--;
				} else if(choose == 1) {
					System.out.println("It's a draw!");
				} else if(choose == 2) {
					System.out.println("You won");
					count++;
				}
				break;
			case 2:
				if(choose == 0) {
					System.out.println("You won");
					count++;
				} else if(choose == 1) {
					System.out.println("You lost");
					count--;
				} else if(choose == 2) {
					System.out.println("It's a draw!");
				}
				break;
			}
		}
		
		//display the result
		if(count > 2) {
			System.out.println("You won more than two times");
		} else {
			System.out.println("The computer won more than two times");
		}
	}
}
