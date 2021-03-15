package recursionDP;

import java.util.ArrayList;

public class BestSum {
	static ArrayList <Integer> shortestComb;

	public static void main(String[] args) {
		ArrayList <Integer> num = new ArrayList <Integer> ();
		num.add(2);num.add(3);num.add(4);
		System.out.println(num);
		System.out.println(BestSums(12, num));

	}
	
	public static ArrayList <Integer> BestSums(int targetNum, ArrayList <Integer> nums) {
		if(targetNum == 0) return shortestComb;
		if(targetNum < 0) return null;
		
		shortestComb = null;
		
		ArrayList <Integer> remanderComb;
		ArrayList<Integer> combination = new ArrayList<Integer>();
		for(int num: nums) {
			remanderComb = BestSums((targetNum - num), nums);
			if(remanderComb != null) {
				combination.add(num);
				if(shortestComb == null || combination.size() < shortestComb.size()) {
					shortestComb = combination;
				}
				//System.out.println(r.size());
			
			}
		}
		return shortestComb;
		
		
		//return [1,2];

	}  

}
