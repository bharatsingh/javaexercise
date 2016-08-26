package UnitTests;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import ProgsAskedInInterview.DuplicateValueinArray;

public class TestDuplicateValueInArray {
	
	@Test
	public void testDuplicate1() {
		String[] arr = { "JavaScript", "PHP", "Java", "PHP", "DBMS", "DBMS", "dbms" };
		Set<String> res = DuplicateValueinArray.duplicate(arr);
		String[] actual = {"PHP", "DBMS"};
		Assert.assertEquals(actual, res.toArray());
	}
}