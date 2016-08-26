package ProgsAskedInInterview;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try{
		System.out.println("enter a number:");	
		int pNum = s.nextInt();
		String res = palindrom(pNum);
		System.out.println(res);
		}
		catch (Exception e) {
			System.out.println("Not a valid input.");
		}
	}
	
	public static String palindrom(int num) {
		int temp = num;
		int remainder;
		int reverse =0;
		
		while (num >0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num/10;			
		}
		
		if (reverse == temp) {
			//System.out.println(temp+" is a Palindrome Number!"); 
			return temp + " is a Palindrome Number!";
		}
		else {
			//System.out.println(temp+" is not a Palindrome Number!");
			return temp + " is not a Palindrome Number!";
		}	
	}
}