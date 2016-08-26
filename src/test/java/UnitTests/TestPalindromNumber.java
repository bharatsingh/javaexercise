package UnitTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import ProgsAskedInInterview.PalindromeNumber;

public class TestPalindromNumber {
	
	@Test
	public void testPalindrom() {
		String num = PalindromeNumber.palindrom(909);
		Assert.assertEquals("909 is a Palindrome Number!", num);
	}
}