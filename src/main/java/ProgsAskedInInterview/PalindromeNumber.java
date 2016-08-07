package ProgsAskedInInterview;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a num");	
		int pNum = s.nextInt();
		palindrom(pNum);
	}
	
	public static void palindrom(int num) {
		int temp = num;
		int remainder;
		int reverse =0;
		
		while (num >0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num/10;			
		}
		
		if (reverse == temp) {
			System.out.println(temp+" is a Palindrome Number!"); 
		}
		else {
			System.out.println(temp+" is not a Palindrome Number!");
		}	
	}
}