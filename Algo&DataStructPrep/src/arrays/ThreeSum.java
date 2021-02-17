package arrays;

import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		/*Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
		 * Find all unique triplets in the array which gives the sum of zero.

		Notice that the solution set must not contain duplicate triplets.

		Example 1:

		Input: nums = [-1,0,1,2,-1,-4]
		Output: [[-1,-1,2],[-1,0,1]]
		
		Example 2:

		Input: nums = []
		Output: []
		Example 3:

		Input: nums = [0]
		Output: []
				 
		Constraints:

		0 <= nums.length <= 3000
		-105 <= nums[i] <= 105*/
		
		int nums[] = new int[] {-1,0,1,2,-1,-4};
		int threeSums[][] = new int[nums.length * nums.length * nums.length][3]; //we also may need an dynamic array so we don't have all these array 0
		int threeSum[] = new int[3];
		int threeSumsIndex = 0;
		
		for(int aIndex = 0; aIndex < nums.length; aIndex++)
			for(int bIndex = 0; bIndex < nums.length; bIndex++)
				for(int cIndex = 0; cIndex < nums.length; cIndex++) {
					if(aIndex == bIndex || aIndex == cIndex || bIndex == cIndex) continue; //skip loop if we pull the same number
					//skip if we have added this three sum already
					//in other words if all three numbers are int the 
					if(nums[aIndex] + nums[bIndex] + nums[cIndex] == 0) {
						threeSum[0] = nums[aIndex]; threeSum[1] = nums[bIndex]; threeSum[2] = nums[cIndex];
						threeSums[threeSumsIndex] = threeSum;
						threeSumsIndex++;
					}
				}
		
		System.out.println("All unique triplets in the array which gives the sum of zero are: ");
		for(int[] threeSum1 : threeSums) System.out.println(Arrays.toString(threeSum1));

	}

}
