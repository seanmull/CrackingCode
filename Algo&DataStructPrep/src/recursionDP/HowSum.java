package recursionDP;

import java.util.ArrayList;

public class HowSum {

	public static void main(String[] args) {
		int[] num = new int[] {2,3,4};
		ArrayList <Integer> returnArr = new ArrayList <Integer> ();
		System.out.println(HowSums(12, num, returnArr));

	}
	
	public static ArrayList <Integer> HowSums(int targetNum, int[] nums, ArrayList <Integer> r) {
		//System.out.println(r);
		if(targetNum == 0) return r;
		if(targetNum < 0) return null;
		for(int num: nums) {
			if(HowSums((targetNum - num), nums, r) != null) {
				r.add(num);
				return r;
			}
		}
		return null;
		
		
		//return [1,2];

	}  
	
	//        500
	//     /         \
	//     7          4   

}
