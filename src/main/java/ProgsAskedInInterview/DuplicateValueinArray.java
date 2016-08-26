package ProgsAskedInInterview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValueinArray {

	public static void main(String[] args) {
		String[] sArr = { "JavaScript", "PHP", "Java", "PHP", "DBMS", "DBMS", "dbms" };
		Set<String> dSet = duplicate(sArr);
		System.out.println(dSet);
	}

	public static Set<String> duplicate (String[] sArr) {
		Set<String> sSet = new HashSet<String>();
		Set<String> dSet = new HashSet<String>();
		
		for (String cell: sArr) {
			if (sSet.contains(cell)) {
				dSet.add(cell);
		}
			else {
				sSet.add(cell);
			}
	}
		return dSet;
}
}
