package ProgsAskedInInterview;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInString {
	public static void main(String[] args) {
		String s = "aaabcd";
		duplicate(s);
	}

	public static void duplicate(String s) {
		Map<Character, Integer> charOccurrence = new HashMap<Character, Integer>();
		char[] sChar = s.toCharArray();

		for (char cell : sChar) {
			if (charOccurrence.containsKey(cell)) {
				charOccurrence.put(cell, charOccurrence.get(cell) + 1);
			} else {
				charOccurrence.put(cell, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : charOccurrence.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}

		}
	}

}