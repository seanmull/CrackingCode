package crackingthecode;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCompression {

	public static void main(String[] args) {
		/*String Compression: Implement a method to perform basic string compression using the counts
		of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
		"compressed" string would not become smaller than the original string, your method should return
		the original string. You can assume the string has only uppercase and lowercase letters (a - z). */
		String s = "aabcccccaaa";

		//Store s in list
		ArrayList<String> slist = new ArrayList<String>(Arrays.asList(s.split("")));
		//Create empty list
		ArrayList<String> elist = new ArrayList<String>();
		
		for(int i = 0; i < s.length(); i++) {

			//(s.charAt(i));
		}

		
	}

}
