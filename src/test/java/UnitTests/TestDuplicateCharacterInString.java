package UnitTests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import ProgsAskedInInterview.DuplicateCharacterInString;

public class TestDuplicateCharacterInString {

	@Test
	public void testDuplicate() {
		Map<Character, Integer> res = DuplicateCharacterInString.duplicate("engineer");	
		String actaul = "{r=1, e=3, g=1, i=1, n=2}";
		Assert.assertTrue(actaul.equals(res.toString()));
	}
}
