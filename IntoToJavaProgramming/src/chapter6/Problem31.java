/*
 * Problem31 - A program that prompts user to enter a credit card number as a long integer. Display whether the number is valid or invalid. Follow problem in book for description.
 */
package chapter6;

import java.util.Scanner;

//main class
public class Problem31 {

	public static boolean isValid(long number) {
		
		boolean isvalid = false;
		int digits = getSize(number);       //get size
		int prefix = (int) getPrefix(number, 1); //get prefix
		
		if((digits >= 13 && digits <= 16) && prefixMatched(number, prefix)) {
			long sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
			
			if(sum % 10 == 0){
				isvalid = true;
			}
		}
		return isvalid;
	}

	//sum of odd-place digits in number
	private static int sumOfOddPlace(long number) {
		int oddsum = 0;
		long remainder;
		int k;
		
		while(number>0){
			remainder = number % 10;
			k = (int) remainder;
			oddsum += k;
			number = (number/10)/10;
		}
		return oddsum;
	}
	
	//double every second digit from left to right
	private static int sumOfDoubleEvenPlace(long number) {
		int evensum = 0;
		long remainder;
		int n;
		
		while(number > 0) {
			remainder = (number / 10) % 10;
			n = (int) remainder;
			int result = getDigit(n*2);
			evensum += result;
			number = (number/10)/10;
		}
		return evensum;
	}

	private static int getDigit(int number) {
		int total = 0;
		if(number >= 1 && number <= 9) {
			return number;
		} else {
			while(number > 0) {
				int r = number % 10;
				total += r;
				number = number / 10;
			}
		}
		return total;
	}

	private static boolean prefixMatched(long number, int prefix) {
		boolean match = false;
		//matching prefix
		switch(prefix) {
		case 4: match = true; break;
		case 5: match = true; break;
		case 6: match = true; break;
		case 37: match = true; break;
		}
		
		return match;
	}

	public static long getPrefix(long number, int i) {
		
		if(getSize(number) < i){
			return number;
		}
		
		long result = 0;
		
		while(number > 0){
			number = number / 10;
			if(getSize(number) <= i){
				result = number;
				break;
			}
		}
		return number;
	}

	public static int getSize(long number) {
		int size = 0;
		while(number > 0){
			number = number / 10;
			size++;
		}
		return size;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long cardNum;
		
		System.out.println("Enter a credit card number (13-16 digits long integer):");
		cardNum = in.nextLong();
		
		if(isValid(cardNum)) {
			System.out.println(cardNum + " is valid ");
		} else {
			System.out.println(cardNum + " is invalid ");
		}
	}
}
