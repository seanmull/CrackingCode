package arraysAndStrings;

import java.lang.reflect.Array;

public class scratchPaper {

	public static void main(String[] args) {
		//Strings

		//For making a simple string
		String s = "abc";

		//To make a char array
		char[] charArray = s.toCharArray(); //note '' means char "" means string

		//To index a Array
		System.out.println("The first char in charArray is " +charArray[0]);
	

		//Stringbuilder
		StringBuilder strBuilderStr = new StringBuilder("abcdefg");
		System.out.println("strBuilderStr is " +strBuilderStr);
		strBuilderStr.append('X');
		System.out.println("strBuilderStr+'X' is " +strBuilderStr);

		//Arrays

		//To build a 1-D array
		int[] array; //declaration only
		int[] array2 = new int[10]; //empty with size allocation
		int[] array3 = new int[] {1,2,3,4}; //instantated

		//To build a 2-D array
		int[][] array2D = new int[][] {{1,2},{3,4}};

		//Typical type implementations
		char[] array4;
		int[] array5;
		float[] array6;
		String[] array7;
		boolean[] array8;

	}

}
