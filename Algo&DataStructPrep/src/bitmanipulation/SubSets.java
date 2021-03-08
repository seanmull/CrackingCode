package bitmanipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSets {

	public static void main(String[] args) {
		/*Given an integer array nums of unique elements, return all possible subsets (the power set).

		The solution set must not contain duplicate subsets. Return the solution in any order.

		Example 1:

		Input: nums = [1,2,3]
		Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
		Example 2:

		Input: nums = [0]
		Output: [[],[0]]
				
		Constraints:

		1 <= nums.length <= 10
		-10 <= nums[i] <= 10
		All the numbers of nums are unique.*/
		
		//think of sets as binary
		//set      binary
		//[]       000
		//[1]      100
		//[2]      010
		//etc
		
		int[] nums = new int[] {1,2,3};
		int numOfIter = (int) Math.pow(2,nums.length);
		ArrayList <Integer>[] subSets = new ArrayList[numOfIter];
		int r;
		int j;
		int subSetIndex = 0;
		
		for(int i = 0; i < numOfIter; i++) {
			r = i;  //copy i so we don't kill it when we right shift it
			j = 0;  //index of nums
			ArrayList <Integer> subSet = new ArrayList <Integer>();
			while(r != 0) {
				//System.out.println(Long.toBinaryString(r));
				if((int)(r & 1) == 1) {
					subSet.add(nums[j]);
				}
				r >>= 1;
				j++;
			}
			subSets[subSetIndex] = subSet;
			subSetIndex++;
		}
		System.out.println(Arrays.toString(subSets));
		
		//Runtime is 2^n since we have to iterate through each number 2^n for power set
		//Space is also 2^n since each set will need to be contained in the array
				
		
		

	}

}
