package crackingthecode;

import java.util.ArrayList;

public class StringRotation {

	public static void main(String[] args) {
		/*String Rotation:Assumeyou have a method isSubstringwhich checks if oneword is a substring
		of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
		call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat"). *///
		String string = "waterbottle";
		String stringRotate = "erbottlewat";
		ArrayList<Integer> indexList = new ArrayList();
		ArrayList<String> stringRotateList = new ArrayList();
		char firstChar = stringRotate.charAt(0);
		
		for (int i = 0; i < string.length(); i++){
			if(string.charAt(i) == firstChar) {
				indexList.add(i);
			}
		}
		
		//TODO
		//Create rotated strings from index found in locations
			//Break string into two substrings
			//Join them in reverse order
		//Compare those strings with stringRotate
		
				
	}

}
