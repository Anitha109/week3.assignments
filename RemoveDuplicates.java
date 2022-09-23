package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code
		 * 
		 * a) Use the declared String text as input String text =
		 * "We learn java basics as part of java sessions in java week1"; b)
		 * Initialize an integer variable as count c) Split the String into
		 * array and iterate over it d) Initialize another loop to check whether
		 * the word is there in the array e) if it is available then increase
		 * and count by 1. f) if the count > 1 then replace the word as ""
		 * 
		 * g) Displaying the String without duplicate words
		 */
		// Input value
		String text = "We learn java basics as part of java sessions in java week1";
		// Coverting the string into string array
		String[] split = text.split(" ");
		// Creating Set object for LinkedHashSet class
		Set<String> value = new LinkedHashSet<String>();
		// Foreach
		for (String string : split) {
			// Adding each string to set object. Since Set will not allow
			// duplicates, it automatically removes duplicate string
			value.add(string);
		}
		System.out.println(value);
	}

}
