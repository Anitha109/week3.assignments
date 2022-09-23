package week3.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FirstMostDuplicate {

	public static void main(String[] args) {
		/*
		 * input: abbaba output: b
		 * 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * 1) Map -> HashMap 2) String -> ch[] -> Get all the character ->
		 * occurance 3) Keep comparing the occurance with other values -> max
		 * value -> character
		 * 
		 */
		// Input string value
		String input = "abbaba";
		// Creating object for HAshMap class
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int maxOccurance = 0;
		char maxOccuranceChar = 0;
		// convert the String into Chararray
		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			// puting the each value with number of occurance to map object
			map.put(c, map.getOrDefault(c, 0) + 1);

		}
		// Convey the value as each set
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		// Check each set value to find the maximum occurance character
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > maxOccurance) {
				maxOccuranceChar = entry.getKey();
				maxOccurance = entry.getValue();
			}

		}
		System.out.println("First most duplicate character is : " + maxOccuranceChar);
	}

}
