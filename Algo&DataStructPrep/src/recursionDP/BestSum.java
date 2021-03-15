package recursionDP;

import java.util.ArrayList;

public class BestSum {
	static ArrayList <Integer> shortestComb;
	

	public static void main(String[] args) {
		ArrayList <Integer> num = new ArrayList <Integer> ();
		ArrayList <Integer> shortComb = new ArrayList <Integer> ();
		ArrayList <Integer> comb = new ArrayList <Integer> ();
		num.add(2);
		num.add(13);
		num.add(4);
		System.out.println(num);
		System.out.println(BestSums(12, num, shortComb,comb));

	}
	
	public static ArrayList <Integer> BestSums(int targetNum, ArrayList <Integer> nums, 
			      ArrayList <Integer> shortComb, ArrayList <Integer> comb) {
		if(targetNum == 0) {
			comb.clear();
			return shortComb;
		}
		if(targetNum < 0) return null;
		
		for(int num: nums) {
			if(BestSums((targetNum - num), nums, shortComb, comb) != null) {
				comb.add(num);
				if(shortestComb == null || (comb.size() < shortestComb.size())) {
					shortestComb = comb;
				}
			}
		}
		return shortestComb;
		
		
		//return [1,2];

	}  

}
