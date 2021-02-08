package crackingthecode;

import java.util.ArrayList;
import java.util.Arrays;

public class Scratch {

	public static void main(String[] args) {
		String s = "abc";
		String[] a = s.split("");
		ArrayList<String> b = new ArrayList<String>(Arrays.asList(a));
		System.out.println(b);

	}

}
